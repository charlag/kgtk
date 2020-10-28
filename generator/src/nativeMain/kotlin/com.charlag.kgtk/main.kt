@file:Suppress("EXPERIMENTAL_UNSIGNED_LITERALS")

package com.charlag.kgtk

import com.charlag.kgtk.generator.typelib.*
import girepository.*
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
        
        import gtk3.GList
        import gtk3.gcharVar
        import kotlinx.cinterop.*
        
        class GType {}
        
        fun <T> stub(): T = TODO()
        
        inline fun <reified T: CVariable> CPointer<T>.arrayToList(): List<T> {
            val result = mutableListOf<T>()
            var index = 0
            while (true) {
                result += this.get(index)
                if (result == null) {
                    break
                } else {
                    index++
                }
            }
            return result
        }
        
        fun CPointerVar<gcharVar>.toKString() = value?.toKString() ?: ""
        
        fun <D : CPointed> CPointer<GList>.toList(): List<CPointer<D>> {
            val values = mutableListOf<CPointer<D>>()
            var current: CPointer<GList>? = this
            while (current?.pointed?.data != null) {
                val data: COpaquePointer = current.pointed.data!!
                values.add(data.reinterpret<D>())
                current = current.pointed.next
            }
            return values
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
        if (namespace == "GModule" || namespace == "xlib") continue

        val skippedNames = mapOf(
                "GLib" to setOf(
                        // Not needed hopefully
                        "Array", "List",
                        // Cannot find C symbol
                        "StatBuf"),
                // weird VA thing
                "GObject" to setOf("signal_set_va_marshaller"),
                // Bad override
                "Gio" to setOf(
                        "DataInputStream",
                        // Need special header for unix
                        "DesktopAppInfo", "DesktopAppInfoLookup", "FileDescriptorBased",
                        "UnixConnection", "UnixCredentialsMessageClass", "UnixFDListClass",
                        "UnixFDMessage", "UnixInputStream", "UnixMountEntry",
                        "UnixMountMonitor", "UnixMountPoint", "UnixOutputStream",
                        "UnixSocketAddress", "DesktopAppLaunchCallback", "SettingsBackend",
                        "unix_mount_at", "unix_mount_compare", "unix_mount_copy",
                        "unix_mount_for", "unix_mount_free", "unix_mount_get_device_path",
                        "unix_mount_get_fs_type", "unix_mount_get_mount_path",
                        "unix_mount_get_options", "unix_mount_get_root_path",
                        "unix_mount_guess_can_eject", "unix_mount_guess_icon",
                        "unix_mount_guess_name", "unix_mount_guess_should_display",
                        "unix_mount_guess_symbolic_icon", "unix_mount_is_readonly",
                        "unix_mount_is_system_internal", "unix_mount_points_changed_since",
                        "unix_mount_points_get", "unix_mounts_changed_since", "unix_mounts_get",
                        "keyfile_settings_backend_new", "null_settings_backend_new",
                        "memory_settings_backend_new", "Settings",
                ),
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
                        "MenuItemAccessible", "MenuShellAccessible", "NotebookAccessible",
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
                        // Is only accessible with special build of X11
                        "Plug", "Socket"),
                "Pango" to setOf(
                        // Cannot find symbols
                        "IncludedModule", "Map", "MapEntry"
                ),
                "GdkPixbuf" to setOf(
                        // Cannot find symbols
                        "PixbufAnimation",
                        "PixbufAnimationIter", "PixbufError", "PixbufFormat", "PixbufLoader",
                        "PixbufRotation", "PixbufSimpleAnim", "PixbufSimpleAnimIter",
                        "PixbufAlphaMode",
                )
        )[namespace] ?: listOf()

        val stubs = mapOf(
                "GdkPixbuf" to mapOf(
                        "Colorspace" to "enum class Colorspace {}",
                        "InterpType" to "enum class InterpType {}",
                        "PixbufRotation" to "enum class PixbufRotation {}",
                        "PixbufFormat" to "enum class PixbufFormat {}",
                        "PixbufAnimation" to "class PixbufAnimation",
                )
        )

        val generateImpls = mapOf(
                "Gtk" to setOf("Application"),
                "Gio" to setOf("Application"),
        )[namespace] ?: setOf()

        val name = info.name

        val stub = stubs[namespace]?.get(name)
        if (stub != null) {
            output.appendLine(stub)
            output.appendLine()
            continue
        }

        if (name.endsWith("Private") ||
                name in skippedNames ||
                name.removeSuffix("Class") in skippedNames ||
                name.removeSuffix("Iface") in skippedNames
        ) continue

        // A lot of problems with parsing Cairo headers
        if (namespace == "cairo" && info !is StructInfo && name != "Content") {
            continue
        }
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
    return when (namespace) {
        "GObject", "GLib", "Gio" -> "G$name"
        "GdkPixbuf" -> "Gdk$name"
        "cairo" -> "cairo_${name.toLowerCase()}_t"
        else -> "${namespace}$name"
    }
}

fun processObject(objectInfo: ObjectInfo, namespace: String, packageName: String, builder: StringBuilder, generateImpls: Boolean = false) {
    val objectName = objectInfo.name
    val cStructName = cname(namespace, objectName)
    builder.append("open class $objectName internal constructor (private val cptr: CPointer<$cStructName>)")
    val parent = objectInfo.parent
    val interfaces = mutableListOf<String>()
    if (parent != null) {
        interfaces.add(interfaceName(parent, namespace, packageName) + "(cptr.reinterpret())")
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
                    builder.appendLine()
                }
            } else {
                factories.add("fun $name(${paramsInDecl()}): $objectName { TODO() } // ${method.symbol}")
            }
        } else {
            val retType = method.returnType

            val (methodName, modifier) = makeMethodName(objectInfo, method)
            val call = if (generateImpls) generateMethodCall(method, namespace, packageName)
            else "stub()"

            if (!method.flags.testFlag(GI_FUNCTION_IS_METHOD)) {
                val fn = """
                |fun $methodName(${paramsInDecl()}): ${serializeType(retType, namespace, packageName)} {
                |    return $call
                |}
            """.trimMargin()
                factories.add(fn)
            } else {
                builder.appendLine("    $modifier fun $methodName(${paramsInDecl()}): ${serializeType(retType, namespace, packageName)} {")
                builder.appendLine("         return $call")
                builder.appendLine("    }")
            }
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

data class MethodDeclInfo(val name: String, val modifiers: String)

fun makeMethodName(objectInfo: ObjectInfo, method: FunctionInfo): MethodDeclInfo {
    val gName = method.name
    // Incompatible override
    val replacements = mapOf(
            "Gtk.Switch.get_state" to "get_switch_state",
            "Gtk.MenuButton.set_direction" to "set_arrow_direction",
            "Gtk.MenuButton.get_direction" to "get_arrow_direction",
            "Gtk.MenuItem.activate" to "activate_menu",
            "Gtk.ToolPalette.get_style" to "get_palette_style",
            "Gtk.ToolPalette.set_style" to "set_palette_style",
            "Gtk.Toolbar.get_style" to "get_toolbar_style",
            "Gtk.Toolbar.set_style" to "set_toolbar_style",
    )
    val replacementName = replacements["${objectInfo.namespace}.${objectInfo.name}.${method.name}"]
    val name = replacementName ?: escapeName(gName)

    val modifier = if (replacementName == null &&
            objectInfo.parent?.getOrInheritsMethod(gName, method.args.toList().map { it.argType }) != null
    ) "override" else "open"
    return MethodDeclInfo(name, modifier)
}

private fun generateMethodCall(method: FunctionInfo, currentNamespace: String, packageName: String): String {
    val preArgs = if (method.flags.testFlag(GI_FUNCTION_IS_METHOD)) listOf("cptr") else listOf()
    val call = generateFunctionCall(method, currentNamespace, packageName, preArgs)
    val retType = method.returnType
    return decorateWithKTypeConversion(retType, currentNamespace, packageName, call)
}

private fun decorateWithKTypeConversion(
        retType: TypeInfo,
        currentNamespace: String,
        packageName: String,
        call: String
): String {
    return when (retType.tag) {
        GITypeTag.GI_TYPE_TAG_INTERFACE -> {
            val int = retType.interfaceInfo!!
            val typeName = interfaceName(int, currentNamespace, packageName)
            when (val intType = int.type) {
                GIInfoType.GI_INFO_TYPE_OBJECT -> "${typeName}($call)"
                else -> "/* TODO: ret int $intType*/ $call"
            }
        }
        GITypeTag.GI_TYPE_TAG_VOID -> call
        GITypeTag.GI_TYPE_TAG_BOOLEAN -> "$call != 0"
        GITypeTag.GI_TYPE_TAG_ARRAY -> {
            "$call.arrayToList().map { it.toKString() }"
        }
        GITypeTag.GI_TYPE_TAG_GLIST -> {
            val elType = retType.paramType(0)!!
            val name = if (elType.tag == GITypeTag.GI_TYPE_TAG_INTERFACE) elType.interfaceInfo!!.name else elType.name
            val cName = cname(elType.namespace, name)
            val kName = serializeType(elType, currentNamespace, packageName)
            "$call.toList<${cName}>().map { ${kName}(it) }"
        }
        GITypeTag.GI_TYPE_TAG_UTF8 -> "$call.toKString()"
        GITypeTag.GI_TYPE_TAG_UINT32,
        GITypeTag.GI_TYPE_TAG_INT32,
        -> call
        else -> "/* TODO: ret tag ${retType.tag} */ $call"
    }
}

private fun generateFunctionCall(
        method: FunctionInfo,
        currentNamespace: String,
        packageName: String,
        prefixArgs: List<String> = listOf()
): String {
    fun callForInterface(int: InterfaceInfo, typeName: String, argName: String): String {
        return when (int.type) {
            GIInfoType.GI_INFO_TYPE_OBJECT, GIInfoType.GI_INFO_TYPE_STRUCT ->
                "$typeName.cptr(${escapeName(argName)})"
            GIInfoType.GI_INFO_TYPE_ENUM, GIInfoType.GI_INFO_TYPE_FLAGS ->
                argName
            GIInfoType.GI_INFO_TYPE_INTERFACE -> "TODO(\"Passing interfaces\")"
            else -> error("Unexpected argument type: ${int.type} for ${argName}")
        }
    }

    val args = prefixArgs + method.args.map { arg ->
        val argType = arg.argType
        when (argType.tag) {
            GITypeTag.GI_TYPE_TAG_INTERFACE -> {
                val int = argType.interfaceInfo!!
                val typeName = interfaceName(int, currentNamespace, packageName)
                callForInterface(int, typeName, arg.name)
            }
            GITypeTag.GI_TYPE_TAG_ARRAY -> {
                val arrayParamType = argType.paramType(0)!!
                when (val arrayTypeTag = arrayParamType.tag) {
                    GITypeTag.GI_TYPE_TAG_UTF8, GITypeTag.GI_TYPE_TAG_FILENAME -> {
                        "${arg.name}.toCStringArray(this)"
                    }
                    GITypeTag.GI_TYPE_TAG_INTERFACE -> {
                        val int = arrayParamType.interfaceInfo!!
                        val intName = interfaceName(int, currentNamespace, packageName)
                        """allocArray(${arg.name}.size) { ${callForInterface(int, intName, "${arg.name}[it]")} }"""
                    }
                    else -> {
                        "/* TODO: param array $arrayTypeTag */" + escapeName(arg.name)
                    }
                }
            }
            else -> escapeName(arg.name)
        }
    }
    val throws = method.flags.testFlag(GI_FUNCTION_THROWS)
    if (throws) {
        val argsWithError = args + "_err.ptr"
        return """
            memScoped {
                val _err = allocPointerTo<GError>()
                val _result = ${method.symbol}(${argsWithError.joinToString(", ")})
                if (_err.value != null) { g_error_free(_err.value); error("GError") }
                _result!!
            }
        """.trimIndent()
    } else {
        return "memScoped { ${method.symbol}(${args.joinToString(", ")})!! }"
    }
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
    // Kotlin randomly maps structs to either pointers or structs themselves (especially in this
    // macro land of GLib) so we take exactly the struct name.
    builder.appendLine("class $name(private val cptr: CPointer<cnames.structs._$cName>) /* struct */ {")
    for (method in struct.methods) {
        val retType = method.returnType

        val argTypes = method.args.map { it.argType }.toList()
        val call =
//                if (generateImpls) generateMethodCall(method, namespace, packageName)
//        else
                "stub()"
        val paramsInDecl = method.args.joinToString(", ") {
            "${escapeName(it.name)}: ${serializeType(it.argType, namespace, packageName)}"
        }
        builder.appendLine("    fun ${escapeName(method.name)}(${paramsInDecl}): ${serializeType(retType, namespace, packageName)} {")
        builder.appendLine("         return $call")
        builder.appendLine("    }")
    }
    builder.appendLine("    companion object {")
    builder.appendLine("        fun cptr(obj: ${name}): CPointer<cnames.structs._$cName> = obj.cptr")
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
    return when (type.tag) {
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
            "List<${serializeType(param, namespace, packageName)}>"
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