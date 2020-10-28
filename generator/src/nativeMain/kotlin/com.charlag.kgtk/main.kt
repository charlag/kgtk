@file:Suppress("EXPERIMENTAL_UNSIGNED_LITERALS")

package com.charlag.kgtk

import com.charlag.kgtk.generator.typelib.*
import girepository.GIInfoType
import girepository.GITypeTag
import girepository.GI_FUNCTION_IS_CONSTRUCTOR
import kotlinx.cinterop.*

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Usage: generate [packagename] [distdir]")
    }
    // TODO: remove
    val (packageName, distdir) =
            if (args.isEmpty())
                arrayOf("com.charlag.kgtk.demo", "../demo/src/nativeMain/kotlin/com.charlag.kgtk.demo")
            else args
    ensureDir(Path(distdir))

    val repository = Repository()
    repository.require("Gtk", "3.0", 0u)
    val prelude = """
        package ${packageName}.prelude 
        
        import kotlinx.cinterop.CPointer
        
        class GType {}
        
        fun <T> stub(): T = TODO()
        
        interface InteropWrapper {
            val cptr: CPointer<*>
        }
        """.trimIndent()
    writeFile(Path(distdir).append("prelude.kt"), prelude)

    for (namespace in repository.loadedNamespaces) {
        val output = processNamespace(repository, namespace, packageName)
        writeFile(Path(distdir).append("$namespace.kt"), output)
    }
}

private fun processNamespace(repository: Repository, namespace: String, packageName: String): String {
    val output = StringBuilder()
    output.appendLine("// Namespace: $namespace")
    output.appendLine("package $packageName.${namespace.toLowerCase()}")
    output.appendLine()
    output.appendLine("import $packageName.prelude.*")
    output.appendLine("import gtk3.*")
    output.appendLine("import kotlinx.cinterop.*")
    output.appendLine("import com.charlag.kgtk.demo.prelude.GType")
    output.appendLine()

    for (info in repository.infos(namespace)) {
        val skippedNames = mapOf(
                // Not needed hopefully
                "GLib" to setOf("Array"),
                // weird VA thing
                "GObject" to setOf("signal_set_va_marshaller"),
                // Bad override
                "Gio" to setOf("DataInputStream"),
                // Deprecated
                "Gtk" to setOf(
                        "Action", "UIManager", "ActionGroup", "Alignment", "BooleanCellAccessible",
                        "Arrow", "ArrowAccessible", "ButtonAccessible", "LinkButtonAccessible",
                        "MenuButtonAccessible", "RadioButtonAccessible", "ScaleButtonAccessible",
                        "GtkNumerableIcon", "ActionEntry", "ContainerAccessible",
                        "ContainerCellAccessible", "TreeViewAccessible", "CellAccessible",
                        "CheckMenuItemAccessible", "ComboBoxAccessible", "EntryAccessible",
                        "EntryIconAccessible", "ExpanderAccessible", "FlowBoxAccessible",
                        "FlowBoxChildAccessible", "FrameAccessible", "HeaderBarAccessible",
                        "IconViewAccessible", "ImageAccessible", "ImageAccessible",
                        "LabelAccessible", "LevelBarAccessible", "WindowAccessible",
                        "ListBoxRowAccessible", "LockButtonAccessible", "MenuAccessible",
                        "MenuItemAccessible", "MenuShellAccessible",  "NotebookAccessible",
                        "NotebookPageAccessible", "PanedAccessible", "PopovwerAccessible",
                        "ProgressBarAccessible", "RadioMenuItemAccessible", "RangeAccessible",
                        "RecentAction", "RendererCellAccessible", "ScaleAccessible",
                        "ScrolledWindowAccessible", "SpinButtonAccessible", "SpinnerAccessible",
                        "StackAccessible", "StatusbarAccessible", "SwitchAccessible",
                        "TextCellAccessible", "TextViewAccessible", "ThemingEnginePrivate",
                        "ToggleAction", "ToggleButtonAccessible", "ToplevelAccessible",
                        "TreeViewAccessible", "WidgetAccessible", "CellAccessible",
                        "CellAccessibleParent", "ComboBoxAccessible",
                        "EntryAccessible", "EntryIconAccessible", "ExpanderAccessible",
                        "FlowBoxAccessible", "FlowBoxChildAccessible", "FrameAccessible",
                        "HeaderBarAccessible", "IconViewAccessible", "RadioAction",
                        "ImageCellAccessible", "ListBoxAccessible", "PopoverAccessible",
                        // skip for now
                        "Unit",
                        // incompatible overrides, maybe should implement by hand
                        "MenuItem", "MenuButton", "CheckMenuItem", "Toolbar",
                        // Is only accessible with special build of X11
                        "Plug", "Socket"),
        )[namespace] ?: listOf()

        val generateImpls = mapOf(
                "Gtk" to listOf("Application")
        )[namespace] ?: listOf()

        val name = info.name
        if (name in skippedNames ||
                name.removeSuffix("Class") in skippedNames ||
                name.removeSuffix("Private") in skippedNames ||
                name.removeSuffix("Iface") in skippedNames
        ) continue
        when (info) {
            is ObjectInfo -> {
                processObject(info, namespace, packageName, output, name in generateImpls)
            }
            is FunctionInfo -> {
                processFunction(info, namespace, packageName, output)
            }
            is CallbackInfo -> {
                processCallback(info, namespace, packageName, output)
            }
            is StructInfo -> {
                processStruct(info, namespace, packageName, output)
            }
            is InterfaceInfo -> {
                processInterface(info, namespace, packageName, output)
            }
            is EnumInfo -> {
                processEnum(info, namespace, packageName, output)
            }
            is ConstantInfo -> {
                processConstant(info, namespace, packageName, output)
            }
            is UnionInfo -> {
                processUnion(info, namespace, packageName, output)
            }
            else -> {
                output.appendLine("// TODO: ${info::class.simpleName} $name")
            }
        }
    }
    return output.toString()
}

fun processUnion(info: UnionInfo, namespace: String, packageName: String, output: StringBuilder) {
    output.appendLine("// Union ")
    output.appendLine("enum class ${info.name} {}\n")
}

private fun processConstant(info: ConstantInfo, namespace: String, packageName: String, output: StringBuilder) {
    val name = escapeName(info.name)
//                output.appendLine("// TODO: Constant: $name")
    memScoped {
//        val value = cValue<GIArgument>()
//        g_constant_info_get_value(info, value.ptr)
        val type = info.constantType
        val typeName = serializeType(type, namespace, packageName)
//        value.useContents {
        output.appendLine("val $name: $typeName get() = TODO()\n")
//        }
    }
}

fun processCallback(info: CallableInfo, namespace: String, packageName: String, output: StringBuilder) {
    val name = info.name
    val params = info.args.map { param ->
        val paramType = param.argType
        val paramTypeName = serializeType(paramType, namespace, packageName)
        val kotlinName = escapeName(param.name)
        "$kotlinName:  $paramTypeName"
    }
    val retType = info.returnType
    output.appendLine("typealias $name = (${params.joinToString(", ")}) -> ${serializeType(retType, namespace, packageName)}\n")
}


/**
 * This is a version of the function which is missing in standard library. It initializes members
 * of the array.
 * If possible, allocate array of correct elements instead. It might not be possible with C
 * structures.
 */
inline operator fun <reified T : CVariable> CArrayPointer<T>.set(index: Int, value: CValue<T>) {
    value.write(this.rawValue + index * sizeOf<T>())
}

fun UInt.testFlag(flag: UInt): Boolean = this and flag == flag

fun cname(namespace: String, name: String): String {
    val prefix = when (namespace) {
        "GObject" -> "G"
        "GdkPixBuf" -> "Gdk"
        else -> namespace
    }
    return "${prefix}$name"
}

fun processObject(objectInfo: ObjectInfo, namespace: String, packageName: String, builder: StringBuilder, generateImpls: Boolean = false) {
    val objectName = objectInfo.name
    val cStructName = cname(namespace, objectName)
    builder.append("open class $objectName internal constructor (private val cptr: CPointer<$cStructName>)")
    val parent = objectInfo.parent
    val interfaces = mutableListOf<String>()
    if (parent != null) {
        interfaces.add(interfaceName(parent, namespace, packageName) + "(cptr.reinterpret())")
    } else {
        interfaces.add("InteropWrapper")
    }
    for (int in objectInfo.interfaces) {
        interfaces += interfaceName(int, namespace, packageName)
    }
    if (interfaces.isNotEmpty()) {
        builder.append(interfaces.joinToString(separator = ", ", prefix = " : "))
    }
    builder.appendLine(" {")

    // We don't need fields, everything should have a getter anyway, it's usually a parent or
    // some private info

//    val fields = mutableListOf<String>()
//    for (field in objectInfo.fields) {
//        val cName = field.name
//        val modifier = if (parent?.findMethod(cName) != null) "override " else ""
//        val name = cName.let(::escapeName)
//        if (name == "priv" || name == "parent" || name == "parent_instance") continue
//        val type = field.fieldType
//        val typeName = serializeType(type, namespace, packageName)
//        fields += "    val $name: $typeName get() = TODO()"
//    }
//    builder.appendLine(fields.joinToString("\n"))

    val factories = mutableListOf<String>()
    for (method in objectInfo.methods) {
        val cName = method.name
        val name = cName.let(::escapeName)
        val params = mutableListOf<Pair<String, String>>()
        for (param in method.args) {
            val paramType = param.argType
            val paramTypeName = serializeType(paramType, namespace, packageName)
            params += param.name to paramTypeName
        }
        fun paramsInDecl(): String = params.joinToString(separator = ", ") { (name, type) -> "${escapeName(name)}: $type" }
        if (method.flags.testFlag(GI_FUNCTION_IS_CONSTRUCTOR)) {
            if (name == "new") {
                if (params.isNotEmpty()) { // empty case handled by primary)
                    val call = if (generateImpls) generateFunctionCall(method, namespace, packageName) else "stub<CPointer<$cStructName>>()"
                    builder.appendLine("    constructor(${paramsInDecl()}) : this($call)")
                }
            } else {
                factories.add("fun $name(${paramsInDecl()}): $objectName { TODO() } // ${method.symbol}")
            }
        } else {
            val retType = method.returnType

            val argTypes = method.args.map { it.argType }.toList()
            val modifier = if (parent?.getOrInheritsMethod(cName, argTypes) != null) "override " else ""
            val call = if (generateImpls) generateMethodCall(method, namespace, packageName)
            else "stub()"
            builder.appendLine("    ${modifier}open fun $name(${paramsInDecl()}): ${serializeType(retType, namespace, packageName)} {")
            builder.appendLine("         return $call")
            builder.appendLine("    }")
        }
    }
    builder.appendLine("    companion object {")
    val gtype = objectInfo.gtype
    builder.appendLine("        const val G_TYPE: gtk3.GType = ${gtype}UL")
    builder.appendLine("        fun cptr(obj: $objectName): CPointer<$cStructName> = obj.cptr")
    for (factory in factories) {
        builder.append("        ")
        builder.appendLine(factory)
    }
    builder.appendLine("    }")
    builder.appendLine("}\n")
}

private fun generateMethodCall(method: FunctionInfo, currentNamespace: String, packageName: String): String {
    return generateFunctionCall(method, currentNamespace, packageName, listOf("cptr"))
}

private fun generateFunctionCall(method: FunctionInfo, currentNamespace: String, packageName: String, prefixArgs: List<String> = listOf()): String {
    val args = prefixArgs + method.args.map { arg ->

        val argType = arg.argType
        when (argType.tag) {
            GITypeTag.GI_TYPE_TAG_INTERFACE -> {
                val int = argType.interfaceInfo!!
                val typeName = interfaceName(int, currentNamespace, packageName)
                when (int.type) {
                    GIInfoType.GI_INFO_TYPE_OBJECT, GIInfoType.GI_INFO_TYPE_STRUCT ->
                        "$typeName.cptr(${escapeName(arg.name)})"
                    GIInfoType.GI_INFO_TYPE_ENUM, GIInfoType.GI_INFO_TYPE_FLAGS ->
                        arg.name
                    else -> error("Unexpected argument type: ${int.type} for ${arg.name}")
                }
            }
            else -> escapeName(arg.name)
        }
    }
    return "${method.symbol}(${args.joinToString(", ")})!!"
}

tailrec fun ObjectInfo.getOrInheritsMethod(methodName: String, types: List<TypeInfo>): FunctionInfo? {
    val method = findMethod(methodName)
    if (method != null) {
        val methodArgTags = method.args.map { it.argType.tag }.toList()
        val passedArgTags = types.map { it.tag }
        if (methodArgTags == passedArgTags) {
            return method
        }
    }
    return parent?.getOrInheritsMethod(methodName, types)
}

fun processFunction(function: FunctionInfo, namespace: String, packageName: String, builder: StringBuilder) {
    val params = function.args.map { param ->
        val paramType = param.argType
        val paramTypeName = serializeType(paramType, namespace, packageName)
        val paramName = escapeName(param.name)
        "$paramName:  $paramTypeName"
    }
    val name = escapeName(function.name)
    val retType = function.returnType
    builder.appendLine("fun $name(${params.joinToString(", ")}): ${serializeType(retType, namespace, packageName)} = TODO()")
}

fun processInterface(int: InterfaceInfo, namespace: String, packageName: String, builder: StringBuilder) {
    // TODO: everything
    builder.appendLine("interface ${int.name} {}\n")
}

fun processEnum(enum: EnumInfo, namespace: String, packageName: String, builder: StringBuilder) {
    val name = enum.name
    builder.appendLine("typealias $name = ${cname(namespace, name)}")
    builder.appendLine()
//    val cases = mutableListOf<String>()
//    val notAllowedNames = setOf("name", "suspend", "value", "open", "external", "private")
//    for (value in enum.values) {
//        val valueName = value.name.let {
//            if (it in notAllowedNames) "g$it" else it
//        }
//        cases += "${escapeName(valueName)}(${value.value})"
//    }
//    builder.appendLine("enum class ${name}(val value: gint64) {")
//    for (case in cases) {
//        builder.appendLine("    $case,")
//    }
//    builder.appendLine("}\n")
}

fun processStruct(struct: StructInfo, namespace: String, packageName: String, builder: StringBuilder) {
    val name = struct.name
    val cName = cname(namespace, name)
    builder.appendLine("class $name(private val cptr: CPointer<$cName>) /* struct */ {")
    builder.appendLine("    companion object {")
    builder.appendLine("        fun cptr(obj: ${name}): CPointer<$cName> = obj.cptr")
    builder.appendLine("    }")
    builder.appendLine("}")
    builder.appendLine()
}

private fun escapeName(thing: String): String {
    val reservedNames = setOf("null", "object", "class", "in", "out", "fun", "val", "var", "continue", "true", "false", "interface", "name", "break")
    return if (thing[0].isDigit() || thing in reservedNames) {
        "`$thing`"
    } else {
        thing
    }
}

private fun interfaceName(int: BaseInfo, currentNamespace: String, packageName: String): String {
    val intNamespace = int.namespace
    val intName = int.name
    return if (intNamespace == currentNamespace) {
        intName
    } else {
        "$packageName.${intNamespace.toLowerCase()}.$intName"
    }
}

private fun serializeType(type: TypeInfo, namespace: String, packageName: String): String {
    return when (val typeTag = type.tag) {
        GITypeTag.GI_TYPE_TAG_VOID -> "Unit"
        GITypeTag.GI_TYPE_TAG_BOOLEAN -> "Boolean"
        GITypeTag.GI_TYPE_TAG_INT8 -> "Byte"
        GITypeTag.GI_TYPE_TAG_UINT8 -> "UByte"
        GITypeTag.GI_TYPE_TAG_INT16 -> "Short"
        GITypeTag.GI_TYPE_TAG_UINT16 -> "UShort"
        GITypeTag.GI_TYPE_TAG_INT32 -> "Int"
        GITypeTag.GI_TYPE_TAG_UINT32 -> "UInt"
        GITypeTag.GI_TYPE_TAG_INT64 -> "Long"
        GITypeTag.GI_TYPE_TAG_UINT64 -> "ULong"
        GITypeTag.GI_TYPE_TAG_FLOAT -> "Float"
        GITypeTag.GI_TYPE_TAG_DOUBLE -> "Double"
        GITypeTag.GI_TYPE_TAG_GTYPE -> "GType"
        GITypeTag.GI_TYPE_TAG_UTF8 -> "String"
        GITypeTag.GI_TYPE_TAG_FILENAME -> "String"
        GITypeTag.GI_TYPE_TAG_ARRAY -> {
            val param = type.paramType(0)!!
            "Array<${serializeType(param, namespace, packageName)}>"
        }
        GITypeTag.GI_TYPE_TAG_GLIST, GITypeTag.GI_TYPE_TAG_GSLIST -> {
            val param = type.paramType(0)!!
            "List<${serializeType(param, namespace, packageName)}>"
        }
        GITypeTag.GI_TYPE_TAG_GHASH -> {
            val keyParam = type.paramType(0)!!
            val valParam = type.paramType(1)!!
            val keyTypeName = serializeType(keyParam, namespace, packageName)
            val valTypeName = serializeType(valParam, namespace, packageName)
            "HashMap<$keyTypeName, $valTypeName>"
        }
        GITypeTag.GI_TYPE_TAG_ERROR -> "Error"
        GITypeTag.GI_TYPE_TAG_UNICHAR -> "Char"
        GITypeTag.GI_TYPE_TAG_INTERFACE -> {
            val int = type.interfaceInfo!!
            interfaceName(int, namespace, packageName)
        }
    }
}