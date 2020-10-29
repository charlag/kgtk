@file:Suppress("EXPERIMENTAL_UNSIGNED_LITERALS")

package com.charlag.kgtk

import com.charlag.kgtk.generator.typelib.*
import girepository.*
import kotlinx.cinterop.*

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Usage: generator [packagename] [distdir]")
    }

    val repository = Repository()
    repository.require("Gtk", "3.0", 0u)

    if (args.firstOrNull() == "--query") {
        val definition = args.getOrNull(1) ?: run {
            print("No param for query")
            return
        }
        val (namespace, clazz, method) = definition.split('.', limit = 3)
        val objectInfo = repository.infos(namespace).find { it.name == clazz } as? ObjectInfo
                ?: run {
                    println("No such class: ${clazz}")
                    return
                }
        val methodInfo = objectInfo.findMethod(method) ?: run {
            println("No such method: ${method}")
            return
        }
        println("$methodInfo")
        return
    } else if (args.firstOrNull() == "--query-all") {
        val definition = args.getOrNull(1) ?: run {
            print("No param for query")
            return
        }
        val (namespace, clazz) = definition.split('.', limit = 2)
        val objectInfo = repository.infos(namespace).find { it.name == clazz } as? ObjectInfo
                ?: run {
                    println("No such class: ${clazz}")
                    return
                }
        for (method in objectInfo.methods) {
            println(method)
        }
        for (vfunc in objectInfo.vfuncs) {
            println(vfunc)
        }
    } else {
        // TODO: remove
        val (packageName, distdir) =
                if (args.isEmpty())
                    arrayOf("com.charlag.kgtk.demo", "../demo/src/nativeMain/kotlin/com.charlag.kgtk.demo")
                else args
        ensureDir(Path(distdir))


        writePrelude(packageName, distdir)

        for (namespace in repository.loadedNamespaces) {
            val output = processNamespace(repository, namespace, packageName)
            writeFile(Path(distdir).append("$namespace.kt"), output)
        }
    }
}

private fun writePrelude(packageName: String, distdir: String) {
    val prelude = """
        package ${packageName}.prelude 
        
        import gtk3.GList
        import gtk3.G_CONNECT_SWAPPED
        import gtk3.g_signal_connect_data
        import gtk3.gcharVar
        import kotlinx.cinterop.*
        
        class GType(val cValue: gtk3.GType)
        
        fun <T> stub(message: String = "stub!"): T = TODO(message)
        
        inline fun <reified T: CVariable> CPointer<T>.arrayToList(): List<T> {
            val result = mutableListOf<T>()
            var index = 0
            while (true) {
                val el = this.get(index)
                @Suppress("SENSELESS_COMPARISON")
                if (el == null) {
                    break
                } else {
                    result += el
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
        
        class OutParam<T>(var value: T?)
        
        fun Boolean.asGboolean(): Int = if (this) 1 else 0
        
        interface InteropWrapper {
            val rawPtr: COpaquePointer
        }
        
        fun do_connect(ptr: CPointer<*>, signal: String, cb: () -> Unit) {
            val stableRef = StableRef.create(cb)
            g_signal_connect_data(ptr, signal, staticCFunction<COpaquePointer, Unit> { lambdaPtr ->
                lambdaPtr.asStableRef<() -> Unit>().get()()
            }.reinterpret(), stableRef.asCPointer(), null, G_CONNECT_SWAPPED)
        }
        """.trimIndent()
    writeFile(Path(distdir).append("prelude.kt"), prelude)
}

private fun processNamespace(repository: Repository, namespace: String, packageName: String): String {
    val output = StringBuilder()
    output.appendLine("// Namespace: $namespace")
    output.appendLine("""@file:Suppress("RemoveRedundantBackticks", "UNUSED_PARAMETER", "FunctionName", "RedundantUnitReturnType", "unused", "RemoveRedundantQualifierName")""")
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
                ),
                "cairo" to mapOf(
                        "Content" to "typealias Content = cairo_content_t",
                )
        )

        val generateImpls = mapOf(
                "Gtk" to setOf(
                        "Application", "Window", "Widget", "ApplicationWindow",
                        "Button", "ButtonBox", "Container", "Dialog", "MessageDialog",
                        "Box", "Label", "LinkButton",
                ),
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
    generateStructWrapper(info.name, info.methods, "union", namespace, packageName, output)
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
        "cairo" -> when (name) {
            "Context" -> "cairo"
            "FontOptions" -> "cairo_font_options_t"
            else -> "cairo_${name.toLowerCase()}"
        }
        else -> "${namespace}$name"
    }
}

val customMethods = mapOf(
        "Gtk.Widget.add_tick_callback" to "// TODO: method add_tick_callback()",
        "Gtk.Widget.render_icon" to " // TODO: method render_icon(), int in typelib, enum is C ",
        "Gtk.Widget.render_icon_pixbuf" to " // TODO: method render_icon_pixbuf(), int in typelib, enum is C ",
        "Gtk.Window.set_default_icon_list" to "// TODO method set_default_icon_list(), passing lists",
        "Gtk.Window.set_icon_list" to "// TODO method set_icon_list(), passing lists",
        "Gtk.Button.new_from_icon_name" to "// TODO: constructor new_from_icon_name(), int in typelib, enum in C",
        "Gtk.Container.forall" to "// TODO: method forall(), user_data param",
        "Gtk.Container.foreach" to "// TODO: method foreach(), user_data param",
        "Gtk.Container.set_focus_chain" to "// TODO: method set_focus_chain(), passing lists",
)

val methodNeedsCast = setOf("Gtk.Window.new", "Gtk.ApplicationWindow.new",
        "Gtk.Button.new", "Gtk.ButtonBox.new",
        "Gtk.Button.new_from_icon_name", "Gtk.Button.new_from_stock", "Gtk.Button.new_with_label",
        "Gtk.Button.new_with_mnemonic", "Gtk.Dialog.new", "Gtk.Dialog.get_action_area",
        "Gtk.Dialog.get_content_area", "Gtk.Dialog.get_header_bar", "Gtk.Box.new", "Gtk.Label.new",
        "Gtk.Label.new_with_mnemonic", "Gtk.LinkButton.new", "Gtk.LinkButton.new_with_label")

//val additonalConstructors = mapOf("Gtk.Message")

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
    interfaces.add("InteropWrapper")
    if (interfaces.isNotEmpty()) {
        builder.append(interfaces.joinToString(separator = ", ", prefix = " : "))
    }
    builder.appendLine(" {")
    builder.appendLine("    override val rawPtr: COpaquePointer = cptr")

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
        val customMethod = customMethods["$namespace.$objectName.$cName"]
        if (customMethod != null) {
            builder.appendLine(customMethod)
            continue
        }

        val params = mutableListOf<Pair<String, String>>()
        for (param in method.args) {
            val paramType = param.argType
            val paramTypeName = serializeType(paramType, namespace, packageName)
            params += param.name to paramTypeName
        }
        fun paramsInDecl(): String = params.joinToString(separator = ", ") { (name, type) -> "${escapeName(name)}: $type" }
        val cast = if ("$namespace.$objectName.${cName}" in methodNeedsCast)
            ".reinterpret()" else ""

        if (method.flags.testFlag(GI_FUNCTION_IS_CONSTRUCTOR)) {
            val call = if (generateImpls) generateFunctionCall(method, namespace, packageName) else "stub<CPointer<$cStructName>>()"


            if (cName == "new") {
                if (params.isNotEmpty()) {
                    builder.appendLine("    constructor(${paramsInDecl()}) : this($call$cast)")
                    builder.appendLine()
                } else {
                    builder.appendLine("    constructor() : this($call$cast)")
                    builder.appendLine()
                }
            } else {
                factories.add("fun ${method.kName}(${paramsInDecl()}): $objectName = ${objectName}($call$cast) ")
            }
        } else {
            val retType = method.returnType

            val (methodName, modifier) = makeMethodName(objectInfo, method)
            val call = if (generateImpls) generateMethodCall(objectInfo, method, namespace, packageName)
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

    for (signal in objectInfo.signals) {
        val camelName = kebabToCamel(signal.name).capitalize()
        builder.appendLine("    fun setOn${camelName}(cb: () -> Unit) {")
        builder.appendLine("        do_connect(cptr, \"${signal.name}\", cb)")
        builder.appendLine("    }")
        builder.appendLine()
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
            "Gtk.Switch.get_state" to "getSwitchState",
            "Gtk.MenuButton.get_direction" to "getArrowDirection",
            "Gtk.MenuButton.set_direction" to "setArrowDirection",
            "Gtk.MenuItem.activate" to "activateMenu",
            "Gtk.ToolPalette.get_style" to "getPaletteStyle",
            "Gtk.ToolPalette.set_style" to "setPaletteStyle",
            "Gtk.Toolbar.get_style" to "getToolbarStyle",
            "Gtk.Toolbar.set_style" to "setToolbarStyle",
    )
    val replacementName = replacements["${objectInfo.namespace}.${objectInfo.name}.${method.name}"]
    val name = replacementName ?: method.kName

    val modifier = if (replacementName == null &&
            ((name == "toString" && method.args.none()) ||
                    objectInfo.parent?.getOrInheritsMethod(gName, method.args.toList().map { it.argType }) != null)
    ) "override" else "open"
    return MethodDeclInfo(name, modifier)
}

private fun kebabToCamel(text: String): String = separatorToCamel('-', text)

private fun snakeToCamel(text: String): String = separatorToCamel('_', text)

private fun separatorToCamel(separator: Char, text: String): String {
    val builder = StringBuilder()
    var nextUp = false
    for (char in text) {
        if (char == separator) {
            nextUp = true
        } else if (nextUp) {
            nextUp = false
            builder.append(char.toUpperCase())
        } else {
            builder.append(char)
        }
    }
    return builder.toString()
}

private fun generateMethodCall(objectInfo: ObjectInfo, method: FunctionInfo, currentNamespace: String, packageName: String): String {
    val preArgs = if (method.flags.testFlag(GI_FUNCTION_IS_METHOD)) listOf("cptr") else listOf()
    val call = generateFunctionCall(method, currentNamespace, packageName, preArgs)
    val retType = method.returnType
    val cast = if ("${currentNamespace}.${objectInfo.name}.${method.name}" in methodNeedsCast) ".reinterpret()" else ""
    return decorateWithKTypeConversion(retType, currentNamespace, packageName, call, cast)
}

private fun decorateWithKTypeConversion(
        retType: TypeInfo,
        currentNamespace: String,
        packageName: String,
        call: String,
        cast: String,
): String {
    return when (retType.tag) {
        GITypeTag.GI_TYPE_TAG_INTERFACE -> {
            val int = retType.interfaceInfo!!
            val typeName = interfaceName(int, currentNamespace, packageName)
            when (val intType = int.type) {
                GIInfoType.GI_INFO_TYPE_OBJECT, GIInfoType.GI_INFO_TYPE_STRUCT -> "${typeName}($call$cast)"
                GIInfoType.GI_INFO_TYPE_INTERFACE -> "${typeName}.Erased($call$cast)"
                GIInfoType.GI_INFO_TYPE_ENUM -> call
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
            val name: String
            val namespace: String
            if (elType.tag == GITypeTag.GI_TYPE_TAG_INTERFACE) {
                name = elType.interfaceInfo!!.name
                namespace = elType.interfaceInfo!!.namespace
            } else {
                name = elType.name
                namespace = elType.namespace
            }
            val cName = cname(namespace, name)
            val kName = serializeType(elType, currentNamespace, packageName)
            "$call.toList<${cName}>().map { ${kName}(it) }"
        }
        GITypeTag.GI_TYPE_TAG_UTF8 -> "$call.toKString()"
        GITypeTag.GI_TYPE_TAG_UINT32,
        GITypeTag.GI_TYPE_TAG_INT32,
        -> call
        GITypeTag.GI_TYPE_TAG_GTYPE -> "GType(${call})"
        else -> "/* TODO: ret tag ${retType.tag} */ $call"
    }
}

val FunctionInfo.kName: String get() = escapeName(snakeToCamel(this.name))

private fun generateFunctionCall(
        method: FunctionInfo,
        currentNamespace: String,
        packageName: String,
        prefixArgs: List<String> = listOf()
): String {
    fun callForInterface(int: InterfaceInfo, typeName: String, argName: String): String {
        return when (int.type) {
            GIInfoType.GI_INFO_TYPE_OBJECT,
            GIInfoType.GI_INFO_TYPE_STRUCT,
            GIInfoType.GI_INFO_TYPE_UNION ->
                "$typeName.cptr(${escapeName(argName)})"
            GIInfoType.GI_INFO_TYPE_ENUM,
            GIInfoType.GI_INFO_TYPE_FLAGS ->
                argName
            GIInfoType.GI_INFO_TYPE_INTERFACE -> "stub(\"Passing interfaces\")"
            GIInfoType.GI_INFO_TYPE_CALLBACK -> "stub(\"Passing callbacks\")"
            else -> error("Unexpected argument type: ${int.type} for ${argName} in ${method.name}")
        }
    }

    val args = prefixArgs + method.args.map { arg ->
        if (arg.direction != GIDirection.GI_DIRECTION_IN) {
            return@map "stub(\"non-in param\")"
        }
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
                    GITypeTag.GI_TYPE_TAG_INT32 -> {
                        "${arg.name}.toIntArray().toCValues()"
                    }
                    else -> {
                        "/* TODO: param array $arrayTypeTag */" + escapeName(arg.name)
                    }
                }
            }
            GITypeTag.GI_TYPE_TAG_BOOLEAN -> "${arg.name}.asGboolean()"
            GITypeTag.GI_TYPE_TAG_GTYPE -> "${arg.name}.cValue"
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
    val name = function.kName
    val retType = function.returnType
    builder.appendLine("fun $name(${params.joinToString(", ")}): ${serializeType(retType, namespace, packageName)} = TODO()")
}

fun processInterface(int: InterfaceInfo, namespace: String, packageName: String, builder: StringBuilder) {
    // TODO: everything
    val name = int.name
    builder.appendLine("interface $name : InteropWrapper {")
    builder.appendLine("    companion object {")
    builder.appendLine("        fun cptr(obj: $name): CPointer<GActionGroup> = obj.rawPtr.reinterpret()")
    builder.appendLine("    }")
    builder.appendLine()
    builder.appendLine("    class Erased(private val cptr: CPointer<${cname(namespace, name)}>) : $name {")
    builder.appendLine("        override val rawPtr: COpaquePointer = cptr")
    builder.appendLine("    }")
    builder.appendLine("}")
    builder.appendLine()
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
    generateStructWrapper(struct.name, struct.methods, "struct", namespace, packageName, builder)
}

fun structPointerName(namespace: String, name: String): String {
    // typedef is not a struct
    return if (namespace == "Gdk" && name == "Rectangle") {
        return "CPointer<GdkRectangle>"
    } else if (namespace == "cairo" && name == "FontOptions") {
        return "CPointer<cairo_font_options_t>"
    } else {
        "CPointer<cnames.structs._${cname(namespace, name)}>"
    }
}

fun generateStructWrapper(name: String, methods: Sequence<FunctionInfo>, gKind: String,
                          namespace: String, packageName: String, builder: StringBuilder) {
    val cName = cname(namespace, name)
    // Kotlin randomly maps structs to either pointers or structs themselves (especially in this
    // macro land of GLib) so we take exactly the struct name.
    val ptrType = structPointerName(namespace, name)
    builder.appendLine("class $name(private val cptr: $ptrType) /* $gKind */ {")
    for (method in methods) {
        val retType = method.returnType

        val argTypes = method.args.map { it.argType }.toList()
        val call =
//                if (generateImpls) generateMethodCall(method, namespace, packageName)
//        else
                "stub()"
        val paramsInDecl = method.args.joinToString(", ") {
            "${escapeName(it.name)}: ${serializeType(it.argType, namespace, packageName)}"
        }
        val methodName = method.kName
        val modifier = if (methodName == "toString") "override " else ""
        builder.appendLine("    ${modifier}fun ${methodName}(${paramsInDecl}): ${serializeType(retType, namespace, packageName)} {")
        builder.appendLine("         return $call")
        builder.appendLine("    }")
    }
    builder.appendLine("    companion object {")
    builder.appendLine("        fun cptr(obj: ${name}): $ptrType = obj.cptr")
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
        GITypeTag.GI_TYPE_TAG_VOID -> if (type.isPointer) "Any" else "Unit"
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