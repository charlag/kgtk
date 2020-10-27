@file:Suppress("EXPERIMENTAL_UNSIGNED_LITERALS")

package com.charlag.kgtk

import com.charlag.kgtk.generator.typelib.*
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
        
        class GType {}
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
    output.appendLine("package $packageName.${namespace.toLowerCase()}\n")
    output.appendLine("import $packageName.prelude.*\n")
    for (info in repository.infos(namespace)) {
        val skippedNames = listOf(
                "Array", // We will bridge it on our own
                "signal_set_va_marshaller", // v-style vararg? no, thanks!
                "DataInputStream" // read_byte() has different type than parent
        )
        val name = info.name
        if (name in skippedNames) continue
        when (info) {
            is ObjectInfo -> {
                processObject(info, namespace, packageName, output)
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

fun processObject(objectInfo: ObjectInfo, namespace: String, packageName: String, builder: StringBuilder) {
    val objectName = objectInfo.name
    builder.append("open class $objectName()")
    val parent = objectInfo.parent
    val interfaces = mutableListOf<String>()
    if (parent != null) {
        interfaces.add(interfaceName(parent, namespace, packageName) + "()")
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
        val params = mutableListOf<String>()
        for (param in method.args) {
            val paramType = param.argType
            val paramTypeName = serializeType(paramType, namespace, packageName)
            val paramName = escapeName(param.name)
            params += "$paramName:  $paramTypeName"
        }
        if (method.flags.testFlag(GI_FUNCTION_IS_CONSTRUCTOR)) {
            if (name == "new") {
                if (params.isNotEmpty()) { // empty case handled by primary)
                    builder.appendLine("    constructor(${params.joinToString(", ")}) : this() {}")
                }
            } else {
                factories.add("fun $name(${params.joinToString(", ")}): $objectName { TODO() }")
            }
        } else {
            val retType = method.returnType

            val argTypes = method.args.map { it.argType }.toList()
            val modifier = if (parent?.getOrInheritsMethod(cName, argTypes) != null) "override " else ""
            builder.appendLine("    ${modifier}open fun $name(${params.joinToString(", ")}): ${serializeType(retType, namespace, packageName)} { TODO() }")
        }
    }
    // Virtual functions are signals?

//    val vfuncN = g_object_info_get_n_vfuncs(objectInfo)
//    for (i in 0 until vfuncN) {
//        val vfunc = g_object_info_get_vfunc(objectInfo, i)
//        val name = g_base_info_get_name(vfunc)!!.toKString().let(::escapeName)
//        val paramsN = g_callable_info_get_n_args(vfunc)
//        val params = mutableListOf<String>()
//        for (c in 0 until paramsN) {
//            val param = g_callable_info_get_arg(vfunc, c)
//            val paramType = g_arg_info_get_type(param)!!
//            val paramTypeName = serializeType(paramType, namespace, packageName)
//            val paramName = g_base_info_get_name(param)!!.toKString().let(::escapeName)
//            params += "$paramName:  $paramTypeName"
//        }
//        val retType = g_callable_info_get_return_type(vfunc)!!
//        builder.appendLine("    override fun $name(${params.joinToString(", ")}): ${serializeType(retType, namespace, packageName)} { TODO() }")
//    }

    if (factories.isNotEmpty()) {
        builder.appendLine("    companion object {")
        for (factory in factories) {
            builder.append("        ")
            builder.appendLine(factory)
        }
        builder.appendLine("    }")
    }
    builder.appendLine("}\n")
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
    val cases = mutableListOf<String>()
    for (value in enum.values) {
        val valueName = value.name.let {
            if (it == "name") "gname" else it
        }
        cases += escapeName(valueName)
    }
    builder.appendLine("enum class $name {")
    for (case in cases) {
        builder.appendLine("    $case,")
    }
    builder.appendLine("}\n")
}

fun processStruct(struct: StructInfo, namespace: String, packageName: String, builder: StringBuilder) {
    val name = struct.name
    // TODO: everything
    builder.appendLine("class $name /* struct */ {}\n")
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