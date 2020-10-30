// Namespace: Gio
@file:Suppress("RemoveRedundantBackticks", "UNUSED_PARAMETER", "FunctionName", "RedundantUnitReturnType", "unused", "RemoveRedundantQualifierName")
package com.charlag.kgtk.demo.gio

import com.charlag.kgtk.demo.prelude.*
import gtk3.*
import kotlinx.cinterop.*
import com.charlag.kgtk.demo.prelude.GType

interface Action : InteropWrapper {
    fun nameIsValid(action_name: String): Boolean = stub("Action default impl")

    fun parseDetailedName(detailed_name: String, action_name: String, target_value: com.charlag.kgtk.demo.glib.Variant): Boolean = stub("Action default impl")

    fun printDetailedName(action_name: String, target_value: com.charlag.kgtk.demo.glib.Variant): String = stub("Action default impl")

    fun activate(parameter: com.charlag.kgtk.demo.glib.Variant): Unit = stub("Action default impl")

    fun changeState(value: com.charlag.kgtk.demo.glib.Variant): Unit = stub("Action default impl")

    fun getEnabled(): Boolean = stub("Action default impl")

    fun getName(): String = stub("Action default impl")

    fun getParameterType(): com.charlag.kgtk.demo.glib.VariantType = stub("Action default impl")

    fun getState(): com.charlag.kgtk.demo.glib.Variant = stub("Action default impl")

    fun getStateHint(): com.charlag.kgtk.demo.glib.Variant = stub("Action default impl")

    fun getStateType(): com.charlag.kgtk.demo.glib.VariantType = stub("Action default impl")

    companion object {
        fun cptr(obj: Action): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GAction>) : Action {
        override val rawPtr: COpaquePointer = cptr
    }
}

class ActionEntry(private val cptr: CPointer<cnames.structs._GActionEntry>) /* struct */ {
    companion object {
        fun cptr(obj: ActionEntry): CPointer<cnames.structs._GActionEntry> = obj.cptr
    }
}

interface ActionGroup : InteropWrapper {
    fun actionAdded(action_name: String): Unit = stub("ActionGroup default impl")

    fun actionEnabledChanged(action_name: String, enabled: Boolean): Unit = stub("ActionGroup default impl")

    fun actionRemoved(action_name: String): Unit = stub("ActionGroup default impl")

    fun actionStateChanged(action_name: String, state: com.charlag.kgtk.demo.glib.Variant): Unit = stub("ActionGroup default impl")

    fun activateAction(action_name: String, parameter: com.charlag.kgtk.demo.glib.Variant): Unit = stub("ActionGroup default impl")

    fun changeActionState(action_name: String, value: com.charlag.kgtk.demo.glib.Variant): Unit = stub("ActionGroup default impl")

    fun getActionEnabled(action_name: String): Boolean = stub("ActionGroup default impl")

    fun getActionParameterType(action_name: String): com.charlag.kgtk.demo.glib.VariantType = stub("ActionGroup default impl")

    fun getActionState(action_name: String): com.charlag.kgtk.demo.glib.Variant = stub("ActionGroup default impl")

    fun getActionStateHint(action_name: String): com.charlag.kgtk.demo.glib.Variant = stub("ActionGroup default impl")

    fun getActionStateType(action_name: String): com.charlag.kgtk.demo.glib.VariantType = stub("ActionGroup default impl")

    fun hasAction(action_name: String): Boolean = stub("ActionGroup default impl")

    fun listActions(): List<String> = stub("ActionGroup default impl")

    fun queryAction(action_name: String, enabled: Boolean, parameter_type: com.charlag.kgtk.demo.glib.VariantType, state_type: com.charlag.kgtk.demo.glib.VariantType, state_hint: com.charlag.kgtk.demo.glib.Variant, state: com.charlag.kgtk.demo.glib.Variant): Boolean = stub("ActionGroup default impl")

    companion object {
        fun cptr(obj: ActionGroup): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GActionGroup>) : ActionGroup {
        override val rawPtr: COpaquePointer = cptr
    }
}

class ActionGroupInterface(private val cptr: CPointer<cnames.structs._GActionGroupInterface>) /* struct */ {
    companion object {
        fun cptr(obj: ActionGroupInterface): CPointer<cnames.structs._GActionGroupInterface> = obj.cptr
    }
}

class ActionInterface(private val cptr: CPointer<cnames.structs._GActionInterface>) /* struct */ {
    companion object {
        fun cptr(obj: ActionInterface): CPointer<cnames.structs._GActionInterface> = obj.cptr
    }
}

interface ActionMap : InteropWrapper {
    fun addAction(action: Action): Unit = stub("ActionMap default impl")

    fun addActionEntries(entries: List<ActionEntry>, n_entries: Int, user_data: Any): Unit = stub("ActionMap default impl")

    fun lookupAction(action_name: String): Action = stub("ActionMap default impl")

    fun removeAction(action_name: String): Unit = stub("ActionMap default impl")

    companion object {
        fun cptr(obj: ActionMap): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GActionMap>) : ActionMap {
        override val rawPtr: COpaquePointer = cptr
    }
}

class ActionMapInterface(private val cptr: CPointer<cnames.structs._GActionMapInterface>) /* struct */ {
    companion object {
        fun cptr(obj: ActionMapInterface): CPointer<cnames.structs._GActionMapInterface> = obj.cptr
    }
}

interface AppInfo : InteropWrapper {
    fun createFromCommandline(commandline: String, application_name: String, flags: AppInfoCreateFlags): AppInfo = stub("AppInfo default impl")

    fun getAll(): List<AppInfo> = stub("AppInfo default impl")

    fun getAllForType(content_type: String): List<AppInfo> = stub("AppInfo default impl")

    fun getDefaultForType(content_type: String, must_support_uris: Boolean): AppInfo = stub("AppInfo default impl")

    fun getDefaultForUriScheme(uri_scheme: String): AppInfo = stub("AppInfo default impl")

    fun getFallbackForType(content_type: String): List<AppInfo> = stub("AppInfo default impl")

    fun getRecommendedForType(content_type: String): List<AppInfo> = stub("AppInfo default impl")

    fun launchDefaultForUri(uri: String, context: AppLaunchContext): Boolean = stub("AppInfo default impl")

    fun launchDefaultForUriAsync(uri: String, context: AppLaunchContext, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("AppInfo default impl")

    fun launchDefaultForUriFinish(result: AsyncResult): Boolean = stub("AppInfo default impl")

    fun resetTypeAssociations(content_type: String): Unit = stub("AppInfo default impl")

    fun addSupportsType(content_type: String): Boolean = stub("AppInfo default impl")

    fun canDelete(): Boolean = stub("AppInfo default impl")

    fun canRemoveSupportsType(): Boolean = stub("AppInfo default impl")

    fun delete(): Boolean = stub("AppInfo default impl")

    fun dup(): AppInfo = stub("AppInfo default impl")

    fun equal(appinfo2: AppInfo): Boolean = stub("AppInfo default impl")

    fun getCommandline(): String = stub("AppInfo default impl")

    fun getDescription(): String = stub("AppInfo default impl")

    fun getDisplayName(): String = stub("AppInfo default impl")

    fun getExecutable(): String = stub("AppInfo default impl")

    fun getIcon(): Icon = stub("AppInfo default impl")

    fun getId(): String = stub("AppInfo default impl")

    fun getName(): String = stub("AppInfo default impl")

    fun getSupportedTypes(): List<String> = stub("AppInfo default impl")

    fun launch(files: List<File>, context: AppLaunchContext): Boolean = stub("AppInfo default impl")

    fun launchUris(uris: List<String>, context: AppLaunchContext): Boolean = stub("AppInfo default impl")

    fun launchUrisAsync(uris: List<String>, context: AppLaunchContext, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("AppInfo default impl")

    fun launchUrisFinish(result: AsyncResult): Boolean = stub("AppInfo default impl")

    fun removeSupportsType(content_type: String): Boolean = stub("AppInfo default impl")

    fun setAsDefaultForExtension(extension: String): Boolean = stub("AppInfo default impl")

    fun setAsDefaultForType(content_type: String): Boolean = stub("AppInfo default impl")

    fun setAsLastUsedForType(content_type: String): Boolean = stub("AppInfo default impl")

    fun shouldShow(): Boolean = stub("AppInfo default impl")

    fun supportsFiles(): Boolean = stub("AppInfo default impl")

    fun supportsUris(): Boolean = stub("AppInfo default impl")

    companion object {
        fun cptr(obj: AppInfo): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GAppInfo>) : AppInfo {
        override val rawPtr: COpaquePointer = cptr
    }
}

typealias AppInfoCreateFlags = GAppInfoCreateFlags

class AppInfoIface(private val cptr: CPointer<cnames.structs._GAppInfoIface>) /* struct */ {
    companion object {
        fun cptr(obj: AppInfoIface): CPointer<cnames.structs._GAppInfoIface> = obj.cptr
    }
}

open class AppInfoMonitor internal constructor (private val cptr: CPointer<GAppInfoMonitor>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    fun setOnChanged(cb: () -> Unit) {
        do_connect(cptr, "changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32311456UL
        fun cptr(obj: AppInfoMonitor): CPointer<GAppInfoMonitor> = obj.cptr
        fun get(): AppInfoMonitor {
    return stub()
}
    }
}

open class AppLaunchContext internal constructor (private val cptr: CPointer<GAppLaunchContext>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GAppLaunchContext>>())

    open fun getDisplay(info: AppInfo, files: List<File>): String {
         return stub()
    }
    open fun getEnvironment(): List<String> {
         return stub()
    }
    open fun getStartupNotifyId(info: AppInfo, files: List<File>): String {
         return stub()
    }
    open fun launchFailed(startup_notify_id: String): Unit {
         return stub()
    }
    open fun setenv(variable: String, value: String): Unit {
         return stub()
    }
    open fun unsetenv(variable: String): Unit {
         return stub()
    }
    fun setOnLaunchFailed(cb: () -> Unit) {
        do_connect(cptr, "launch-failed", cb)
    }

    fun setOnLaunched(cb: () -> Unit) {
        do_connect(cptr, "launched", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33773456UL
        fun cptr(obj: AppLaunchContext): CPointer<GAppLaunchContext> = obj.cptr
    }
}

class AppLaunchContextClass(private val cptr: CPointer<cnames.structs._GAppLaunchContextClass>) /* struct */ {
    companion object {
        fun cptr(obj: AppLaunchContextClass): CPointer<cnames.structs._GAppLaunchContextClass> = obj.cptr
    }
}

open class Application internal constructor (private val cptr: CPointer<GApplication>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), ActionGroup, ActionMap, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(application_id: String, flags: ApplicationFlags) : this(memScoped { g_application_new(application_id, flags)!! })

    open fun activate(): Unit {
         return memScoped { g_application_activate(cptr)!! }
    }
    open fun addMainOption(long_name: String, short_name: Byte, flags: com.charlag.kgtk.demo.glib.OptionFlags, arg: com.charlag.kgtk.demo.glib.OptionArg, description: String, arg_description: String): Unit {
         return memScoped { g_application_add_main_option(cptr, long_name, short_name, flags, arg, description, arg_description)!! }
    }
    open fun addMainOptionEntries(entries: List<com.charlag.kgtk.demo.glib.OptionEntry>): Unit {
         return memScoped { g_application_add_main_option_entries(cptr, allocArray(entries.size) { com.charlag.kgtk.demo.glib.OptionEntry.cptr(entries[it]) })!! }
    }
    open fun addOptionGroup(group: com.charlag.kgtk.demo.glib.OptionGroup): Unit {
         return memScoped { g_application_add_option_group(cptr, com.charlag.kgtk.demo.glib.OptionGroup.cptr(group))!! }
    }
    open fun bindBusyProperty(`object`: com.charlag.kgtk.demo.gobject.Object, property: String): Unit {
         return memScoped { g_application_bind_busy_property(cptr, com.charlag.kgtk.demo.gobject.Object.cptr(`object`), property)!! }
    }
    open fun getApplicationId(): String {
         return memScoped { g_application_get_application_id(cptr)!! }.toKString()
    }
    open fun getDbusConnection(): DBusConnection {
         return DBusConnection(memScoped { g_application_get_dbus_connection(cptr)!! })
    }
    open fun getDbusObjectPath(): String {
         return memScoped { g_application_get_dbus_object_path(cptr)!! }.toKString()
    }
    open fun getFlags(): ApplicationFlags {
         return /* TODO: ret int GI_INFO_TYPE_FLAGS*/ memScoped { g_application_get_flags(cptr)!! }
    }
    open fun getInactivityTimeout(): UInt {
         return memScoped { g_application_get_inactivity_timeout(cptr)!! }
    }
    open fun getIsBusy(): Boolean {
         return memScoped { g_application_get_is_busy(cptr)!! } != 0
    }
    open fun getIsRegistered(): Boolean {
         return memScoped { g_application_get_is_registered(cptr)!! } != 0
    }
    open fun getIsRemote(): Boolean {
         return memScoped { g_application_get_is_remote(cptr)!! } != 0
    }
    open fun getResourceBasePath(): String {
         return memScoped { g_application_get_resource_base_path(cptr)!! }.toKString()
    }
    open fun hold(): Unit {
         return memScoped { g_application_hold(cptr)!! }
    }
    open fun markBusy(): Unit {
         return memScoped { g_application_mark_busy(cptr)!! }
    }
    open fun open(files: List<File>, n_files: Int, hint: String): Unit {
         return memScoped { g_application_open(cptr, allocArray(files.size) { stub("Passing interfaces") }, n_files, hint)!! }
    }
    open fun quit(): Unit {
         return memScoped { g_application_quit(cptr)!! }
    }
    open fun register(cancellable: Cancellable): Boolean {
         return memScoped {
    val _err = allocPointerTo<GError>()
    val _result = g_application_register(cptr, Cancellable.cptr(cancellable), _err.ptr)
    if (_err.value != null) { g_error_free(_err.value); error("GError") }
    _result!!
} != 0
    }
    open fun release(): Unit {
         return memScoped { g_application_release(cptr)!! }
    }
    open fun run(argc: Int, argv: List<String>): Int {
         return memScoped { g_application_run(cptr, argc, argv.toCStringArray(this))!! }
    }
    open fun sendNotification(id: String, notification: Notification): Unit {
         return memScoped { g_application_send_notification(cptr, id, Notification.cptr(notification))!! }
    }
    open fun setApplicationId(application_id: String): Unit {
         return memScoped { g_application_set_application_id(cptr, application_id)!! }
    }
    open fun setDefault(): Unit {
         return memScoped { g_application_set_default(cptr)!! }
    }
    open fun setFlags(flags: ApplicationFlags): Unit {
         return memScoped { g_application_set_flags(cptr, flags)!! }
    }
    open fun setInactivityTimeout(inactivity_timeout: UInt): Unit {
         return memScoped { g_application_set_inactivity_timeout(cptr, inactivity_timeout)!! }
    }
    open fun setOptionContextDescription(description: String): Unit {
         return memScoped { g_application_set_option_context_description(cptr, description)!! }
    }
    open fun setOptionContextParameterString(parameter_string: String): Unit {
         return memScoped { g_application_set_option_context_parameter_string(cptr, parameter_string)!! }
    }
    open fun setOptionContextSummary(summary: String): Unit {
         return memScoped { g_application_set_option_context_summary(cptr, summary)!! }
    }
    open fun setResourceBasePath(resource_path: String): Unit {
         return memScoped { g_application_set_resource_base_path(cptr, resource_path)!! }
    }
    open fun unbindBusyProperty(`object`: com.charlag.kgtk.demo.gobject.Object, property: String): Unit {
         return memScoped { g_application_unbind_busy_property(cptr, com.charlag.kgtk.demo.gobject.Object.cptr(`object`), property)!! }
    }
    open fun unmarkBusy(): Unit {
         return memScoped { g_application_unmark_busy(cptr)!! }
    }
    open fun withdrawNotification(id: String): Unit {
         return memScoped { g_application_withdraw_notification(cptr, id)!! }
    }
    fun setOnActivate(cb: () -> Unit) {
        do_connect(cptr, "activate", cb)
    }

    fun setOnCommandLine(cb: () -> Unit) {
        do_connect(cptr, "command-line", cb)
    }

    fun setOnHandleLocalOptions(cb: () -> Unit) {
        do_connect(cptr, "handle-local-options", cb)
    }

    fun setOnNameLost(cb: () -> Unit) {
        do_connect(cptr, "name-lost", cb)
    }

    fun setOnOpen(cb: () -> Unit) {
        do_connect(cptr, "open", cb)
    }

    fun setOnShutdown(cb: () -> Unit) {
        do_connect(cptr, "shutdown", cb)
    }

    fun setOnStartup(cb: () -> Unit) {
        do_connect(cptr, "startup", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30879744UL
        fun cptr(obj: Application): CPointer<GApplication> = obj.cptr
        fun getDefault(): Application {
    return Application(memScoped { g_application_get_default()!! })
}
        fun idIsValid(application_id: String): Boolean {
    return memScoped { g_application_id_is_valid(application_id)!! } != 0
}
    }
}

class ApplicationClass(private val cptr: CPointer<cnames.structs._GApplicationClass>) /* struct */ {
    companion object {
        fun cptr(obj: ApplicationClass): CPointer<cnames.structs._GApplicationClass> = obj.cptr
    }
}

open class ApplicationCommandLine internal constructor (private val cptr: CPointer<GApplicationCommandLine>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun createFileForArg(arg: String): File {
         return stub()
    }
    open fun getArguments(argc: Int): List<String> {
         return stub()
    }
    open fun getCwd(): String {
         return stub()
    }
    open fun getEnviron(): List<String> {
         return stub()
    }
    open fun getExitStatus(): Int {
         return stub()
    }
    open fun getIsRemote(): Boolean {
         return stub()
    }
    open fun getOptionsDict(): com.charlag.kgtk.demo.glib.VariantDict {
         return stub()
    }
    open fun getPlatformData(): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun getStdin(): InputStream {
         return stub()
    }
    open fun getenv(`name`: String): String {
         return stub()
    }
    open fun setExitStatus(exit_status: Int): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31580256UL
        fun cptr(obj: ApplicationCommandLine): CPointer<GApplicationCommandLine> = obj.cptr
    }
}

class ApplicationCommandLineClass(private val cptr: CPointer<cnames.structs._GApplicationCommandLineClass>) /* struct */ {
    companion object {
        fun cptr(obj: ApplicationCommandLineClass): CPointer<cnames.structs._GApplicationCommandLineClass> = obj.cptr
    }
}

typealias ApplicationFlags = GApplicationFlags

typealias AskPasswordFlags = GAskPasswordFlags

interface AsyncInitable : InteropWrapper {
    fun initAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("AsyncInitable default impl")

    fun initFinish(res: AsyncResult): Boolean = stub("AsyncInitable default impl")

    fun newFinish(res: AsyncResult): com.charlag.kgtk.demo.gobject.Object = stub("AsyncInitable default impl")

    companion object {
        fun cptr(obj: AsyncInitable): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GAsyncInitable>) : AsyncInitable {
        override val rawPtr: COpaquePointer = cptr
    }
}

class AsyncInitableIface(private val cptr: CPointer<cnames.structs._GAsyncInitableIface>) /* struct */ {
    companion object {
        fun cptr(obj: AsyncInitableIface): CPointer<cnames.structs._GAsyncInitableIface> = obj.cptr
    }
}

typealias AsyncReadyCallback = (source_object:  com.charlag.kgtk.demo.gobject.Object, res:  AsyncResult, user_data:  Any) -> Unit

interface AsyncResult : InteropWrapper {
    fun getSourceObject(): com.charlag.kgtk.demo.gobject.Object = stub("AsyncResult default impl")

    fun getUserData(): Any = stub("AsyncResult default impl")

    fun isTagged(source_tag: Any): Boolean = stub("AsyncResult default impl")

    fun legacyPropagateError(): Boolean = stub("AsyncResult default impl")

    companion object {
        fun cptr(obj: AsyncResult): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GAsyncResult>) : AsyncResult {
        override val rawPtr: COpaquePointer = cptr
    }
}

class AsyncResultIface(private val cptr: CPointer<cnames.structs._GAsyncResultIface>) /* struct */ {
    companion object {
        fun cptr(obj: AsyncResultIface): CPointer<cnames.structs._GAsyncResultIface> = obj.cptr
    }
}

open class BufferedInputStream internal constructor (private val cptr: CPointer<GBufferedInputStream>) : FilterInputStream(cptr.reinterpret()), Seekable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(base_stream: InputStream) : this(stub<CPointer<GBufferedInputStream>>())

    open fun fill(count: Long, cancellable: Cancellable): Long {
         return stub()
    }
    open fun fillAsync(count: Long, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun fillFinish(result: AsyncResult): Long {
         return stub()
    }
    open fun getAvailable(): ULong {
         return stub()
    }
    open fun getBufferSize(): ULong {
         return stub()
    }
    open fun peek(buffer: List<UByte>, offset: ULong, count: ULong): ULong {
         return stub()
    }
    open fun peekBuffer(count: ULong): List<UByte> {
         return stub()
    }
    open fun readByte(cancellable: Cancellable): Int {
         return stub()
    }
    open fun setBufferSize(size: ULong): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31938176UL
        fun cptr(obj: BufferedInputStream): CPointer<GBufferedInputStream> = obj.cptr
        fun newSized(base_stream: InputStream, size: ULong): BufferedInputStream = BufferedInputStream(stub<CPointer<GBufferedInputStream>>()) 
    }
}

class BufferedInputStreamClass(private val cptr: CPointer<cnames.structs._GBufferedInputStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: BufferedInputStreamClass): CPointer<cnames.structs._GBufferedInputStreamClass> = obj.cptr
    }
}

open class BufferedOutputStream internal constructor (private val cptr: CPointer<GBufferedOutputStream>) : FilterOutputStream(cptr.reinterpret()), Seekable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(base_stream: OutputStream) : this(stub<CPointer<GBufferedOutputStream>>())

    open fun getAutoGrow(): Boolean {
         return stub()
    }
    open fun getBufferSize(): ULong {
         return stub()
    }
    open fun setAutoGrow(auto_grow: Boolean): Unit {
         return stub()
    }
    open fun setBufferSize(size: ULong): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31911648UL
        fun cptr(obj: BufferedOutputStream): CPointer<GBufferedOutputStream> = obj.cptr
        fun newSized(base_stream: OutputStream, size: ULong): BufferedOutputStream = BufferedOutputStream(stub<CPointer<GBufferedOutputStream>>()) 
    }
}

class BufferedOutputStreamClass(private val cptr: CPointer<cnames.structs._GBufferedOutputStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: BufferedOutputStreamClass): CPointer<cnames.structs._GBufferedOutputStreamClass> = obj.cptr
    }
}

typealias BusAcquiredCallback = (connection:  DBusConnection, `name`:  String, user_data:  Any) -> Unit

typealias BusNameAcquiredCallback = (connection:  DBusConnection, `name`:  String, user_data:  Any) -> Unit

typealias BusNameAppearedCallback = (connection:  DBusConnection, `name`:  String, name_owner:  String, user_data:  Any) -> Unit

typealias BusNameLostCallback = (connection:  DBusConnection, `name`:  String, user_data:  Any) -> Unit

typealias BusNameOwnerFlags = GBusNameOwnerFlags

typealias BusNameVanishedCallback = (connection:  DBusConnection, `name`:  String, user_data:  Any) -> Unit

typealias BusNameWatcherFlags = GBusNameWatcherFlags

typealias BusType = GBusType

open class BytesIcon internal constructor (private val cptr: CPointer<GBytesIcon>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Icon, LoadableIcon, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(bytes: com.charlag.kgtk.demo.glib.Bytes) : this(stub<CPointer<GBytesIcon>>())

    open fun getBytes(): com.charlag.kgtk.demo.glib.Bytes {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31301696UL
        fun cptr(obj: BytesIcon): CPointer<GBytesIcon> = obj.cptr
    }
}

open class Cancellable internal constructor (private val cptr: CPointer<GCancellable>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GCancellable>>())

    open fun cancel(): Unit {
         return stub()
    }
    open fun connect(callback: com.charlag.kgtk.demo.gobject.Callback, data: Any, data_destroy_func: com.charlag.kgtk.demo.glib.DestroyNotify): ULong {
         return stub()
    }
    open fun disconnect(handler_id: ULong): Unit {
         return stub()
    }
    open fun getFd(): Int {
         return stub()
    }
    open fun isCancelled(): Boolean {
         return stub()
    }
    open fun makePollfd(pollfd: com.charlag.kgtk.demo.glib.PollFD): Boolean {
         return stub()
    }
    open fun popCurrent(): Unit {
         return stub()
    }
    open fun pushCurrent(): Unit {
         return stub()
    }
    open fun releaseFd(): Unit {
         return stub()
    }
    open fun reset(): Unit {
         return stub()
    }
    open fun setErrorIfCancelled(): Boolean {
         return stub()
    }
    open fun sourceNew(): com.charlag.kgtk.demo.glib.Source {
         return stub()
    }
    fun setOnCancelled(cb: () -> Unit) {
        do_connect(cptr, "cancelled", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33390256UL
        fun cptr(obj: Cancellable): CPointer<GCancellable> = obj.cptr
        fun getCurrent(): Cancellable {
    return stub()
}
    }
}

class CancellableClass(private val cptr: CPointer<cnames.structs._GCancellableClass>) /* struct */ {
    companion object {
        fun cptr(obj: CancellableClass): CPointer<cnames.structs._GCancellableClass> = obj.cptr
    }
}

typealias CancellableSourceFunc = (cancellable:  Cancellable, user_data:  Any) -> Boolean

open class CharsetConverter internal constructor (private val cptr: CPointer<GCharsetConverter>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Converter, Initable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(to_charset: String, from_charset: String) : this(stub<CPointer<GCharsetConverter>>())

    open fun getNumFallbacks(): UInt {
         return stub()
    }
    open fun getUseFallback(): Boolean {
         return stub()
    }
    open fun setUseFallback(use_fallback: Boolean): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32572592UL
        fun cptr(obj: CharsetConverter): CPointer<GCharsetConverter> = obj.cptr
    }
}

class CharsetConverterClass(private val cptr: CPointer<cnames.structs._GCharsetConverterClass>) /* struct */ {
    companion object {
        fun cptr(obj: CharsetConverterClass): CPointer<cnames.structs._GCharsetConverterClass> = obj.cptr
    }
}

interface Converter : InteropWrapper {
    fun convert(inbuf: List<UByte>, inbuf_size: ULong, outbuf: List<UByte>, outbuf_size: ULong, flags: ConverterFlags, bytes_read: ULong, bytes_written: ULong): ConverterResult = stub("Converter default impl")

    fun reset(): Unit = stub("Converter default impl")

    companion object {
        fun cptr(obj: Converter): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GConverter>) : Converter {
        override val rawPtr: COpaquePointer = cptr
    }
}

typealias ConverterFlags = GConverterFlags

class ConverterIface(private val cptr: CPointer<cnames.structs._GConverterIface>) /* struct */ {
    companion object {
        fun cptr(obj: ConverterIface): CPointer<cnames.structs._GConverterIface> = obj.cptr
    }
}

open class ConverterInputStream internal constructor (private val cptr: CPointer<GConverterInputStream>) : FilterInputStream(cptr.reinterpret()), PollableInputStream, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(base_stream: InputStream, converter: Converter) : this(stub<CPointer<GConverterInputStream>>())

    open fun getConverter(): Converter {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31398256UL
        fun cptr(obj: ConverterInputStream): CPointer<GConverterInputStream> = obj.cptr
    }
}

class ConverterInputStreamClass(private val cptr: CPointer<cnames.structs._GConverterInputStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: ConverterInputStreamClass): CPointer<cnames.structs._GConverterInputStreamClass> = obj.cptr
    }
}

open class ConverterOutputStream internal constructor (private val cptr: CPointer<GConverterOutputStream>) : FilterOutputStream(cptr.reinterpret()), PollableOutputStream, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(base_stream: OutputStream, converter: Converter) : this(stub<CPointer<GConverterOutputStream>>())

    open fun getConverter(): Converter {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31217104UL
        fun cptr(obj: ConverterOutputStream): CPointer<GConverterOutputStream> = obj.cptr
    }
}

class ConverterOutputStreamClass(private val cptr: CPointer<cnames.structs._GConverterOutputStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: ConverterOutputStreamClass): CPointer<cnames.structs._GConverterOutputStreamClass> = obj.cptr
    }
}

typealias ConverterResult = GConverterResult

open class Credentials internal constructor (private val cptr: CPointer<GCredentials>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GCredentials>>())

    open fun getUnixPid(): Int {
         return stub()
    }
    open fun getUnixUser(): UInt {
         return stub()
    }
    open fun isSameUser(other_credentials: Credentials): Boolean {
         return stub()
    }
    open fun setNative(native_type: CredentialsType, native: Any): Unit {
         return stub()
    }
    open fun setUnixUser(uid: UInt): Boolean {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32326816UL
        fun cptr(obj: Credentials): CPointer<GCredentials> = obj.cptr
    }
}

class CredentialsClass(private val cptr: CPointer<cnames.structs._GCredentialsClass>) /* struct */ {
    companion object {
        fun cptr(obj: CredentialsClass): CPointer<cnames.structs._GCredentialsClass> = obj.cptr
    }
}

typealias CredentialsType = GCredentialsType

open class DBusActionGroup internal constructor (private val cptr: CPointer<GDBusActionGroup>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), ActionGroup, RemoteActionGroup, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 39004368UL
        fun cptr(obj: DBusActionGroup): CPointer<GDBusActionGroup> = obj.cptr
        fun get(connection: DBusConnection, bus_name: String, object_path: String): DBusActionGroup {
    return stub()
}
    }
}

class DBusAnnotationInfo(private val cptr: CPointer<cnames.structs._GDBusAnnotationInfo>) /* struct */ {
    fun ref(): DBusAnnotationInfo {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun lookup(annotations: List<DBusAnnotationInfo>, `name`: String): String {
         return stub()
    }
    companion object {
        fun cptr(obj: DBusAnnotationInfo): CPointer<cnames.structs._GDBusAnnotationInfo> = obj.cptr
    }
}

class DBusArgInfo(private val cptr: CPointer<cnames.structs._GDBusArgInfo>) /* struct */ {
    fun ref(): DBusArgInfo {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: DBusArgInfo): CPointer<cnames.structs._GDBusArgInfo> = obj.cptr
    }
}

open class DBusAuthObserver internal constructor (private val cptr: CPointer<GDBusAuthObserver>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GDBusAuthObserver>>())

    open fun allowMechanism(mechanism: String): Boolean {
         return stub()
    }
    open fun authorizeAuthenticatedPeer(stream: IOStream, credentials: Credentials): Boolean {
         return stub()
    }
    fun setOnAllowMechanism(cb: () -> Unit) {
        do_connect(cptr, "allow-mechanism", cb)
    }

    fun setOnAuthorizeAuthenticatedPeer(cb: () -> Unit) {
        do_connect(cptr, "authorize-authenticated-peer", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33448352UL
        fun cptr(obj: DBusAuthObserver): CPointer<GDBusAuthObserver> = obj.cptr
    }
}

typealias DBusCallFlags = GDBusCallFlags

typealias DBusCapabilityFlags = GDBusCapabilityFlags

open class DBusConnection internal constructor (private val cptr: CPointer<GDBusConnection>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), AsyncInitable, Initable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun addFilter(filter_function: DBusMessageFilterFunction, user_data: Any, user_data_free_func: com.charlag.kgtk.demo.glib.DestroyNotify): UInt {
         return stub()
    }
    open fun call(bus_name: String, object_path: String, interface_name: String, method_name: String, parameters: com.charlag.kgtk.demo.glib.Variant, reply_type: com.charlag.kgtk.demo.glib.VariantType, flags: DBusCallFlags, timeout_msec: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun callFinish(res: AsyncResult): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun callSync(bus_name: String, object_path: String, interface_name: String, method_name: String, parameters: com.charlag.kgtk.demo.glib.Variant, reply_type: com.charlag.kgtk.demo.glib.VariantType, flags: DBusCallFlags, timeout_msec: Int, cancellable: Cancellable): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun callWithUnixFdList(bus_name: String, object_path: String, interface_name: String, method_name: String, parameters: com.charlag.kgtk.demo.glib.Variant, reply_type: com.charlag.kgtk.demo.glib.VariantType, flags: DBusCallFlags, timeout_msec: Int, fd_list: UnixFDList, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun callWithUnixFdListFinish(out_fd_list: UnixFDList, res: AsyncResult): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun callWithUnixFdListSync(bus_name: String, object_path: String, interface_name: String, method_name: String, parameters: com.charlag.kgtk.demo.glib.Variant, reply_type: com.charlag.kgtk.demo.glib.VariantType, flags: DBusCallFlags, timeout_msec: Int, fd_list: UnixFDList, out_fd_list: UnixFDList, cancellable: Cancellable): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun close(cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun closeFinish(res: AsyncResult): Boolean {
         return stub()
    }
    open fun closeSync(cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun emitSignal(destination_bus_name: String, object_path: String, interface_name: String, signal_name: String, parameters: com.charlag.kgtk.demo.glib.Variant): Boolean {
         return stub()
    }
    open fun exportActionGroup(object_path: String, action_group: ActionGroup): UInt {
         return stub()
    }
    open fun exportMenuModel(object_path: String, menu: MenuModel): UInt {
         return stub()
    }
    open fun flush(cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun flushFinish(res: AsyncResult): Boolean {
         return stub()
    }
    open fun flushSync(cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun getCapabilities(): DBusCapabilityFlags {
         return stub()
    }
    open fun getExitOnClose(): Boolean {
         return stub()
    }
    open fun getFlags(): DBusConnectionFlags {
         return stub()
    }
    open fun getGuid(): String {
         return stub()
    }
    open fun getLastSerial(): UInt {
         return stub()
    }
    open fun getPeerCredentials(): Credentials {
         return stub()
    }
    open fun getStream(): IOStream {
         return stub()
    }
    open fun getUniqueName(): String {
         return stub()
    }
    open fun isClosed(): Boolean {
         return stub()
    }
    open fun registerObject(object_path: String, interface_info: DBusInterfaceInfo, method_call_closure: com.charlag.kgtk.demo.gobject.Closure, get_property_closure: com.charlag.kgtk.demo.gobject.Closure, set_property_closure: com.charlag.kgtk.demo.gobject.Closure): UInt {
         return stub()
    }
    open fun registerSubtree(object_path: String, vtable: DBusSubtreeVTable, flags: DBusSubtreeFlags, user_data: Any, user_data_free_func: com.charlag.kgtk.demo.glib.DestroyNotify): UInt {
         return stub()
    }
    open fun removeFilter(filter_id: UInt): Unit {
         return stub()
    }
    open fun sendMessage(message: DBusMessage, flags: DBusSendMessageFlags, out_serial: UInt): Boolean {
         return stub()
    }
    open fun sendMessageWithReply(message: DBusMessage, flags: DBusSendMessageFlags, timeout_msec: Int, out_serial: UInt, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun sendMessageWithReplyFinish(res: AsyncResult): DBusMessage {
         return stub()
    }
    open fun sendMessageWithReplySync(message: DBusMessage, flags: DBusSendMessageFlags, timeout_msec: Int, out_serial: UInt, cancellable: Cancellable): DBusMessage {
         return stub()
    }
    open fun setExitOnClose(exit_on_close: Boolean): Unit {
         return stub()
    }
    open fun signalSubscribe(sender: String, interface_name: String, member: String, object_path: String, arg0: String, flags: DBusSignalFlags, callback: DBusSignalCallback, user_data: Any, user_data_free_func: com.charlag.kgtk.demo.glib.DestroyNotify): UInt {
         return stub()
    }
    open fun signalUnsubscribe(subscription_id: UInt): Unit {
         return stub()
    }
    open fun startMessageProcessing(): Unit {
         return stub()
    }
    open fun unexportActionGroup(export_id: UInt): Unit {
         return stub()
    }
    open fun unexportMenuModel(export_id: UInt): Unit {
         return stub()
    }
    open fun unregisterObject(registration_id: UInt): Boolean {
         return stub()
    }
    open fun unregisterSubtree(registration_id: UInt): Boolean {
         return stub()
    }
    fun setOnClosed(cb: () -> Unit) {
        do_connect(cptr, "closed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 35031616UL
        fun cptr(obj: DBusConnection): CPointer<GDBusConnection> = obj.cptr
        fun newFinish(res: AsyncResult): DBusConnection = DBusConnection(stub<CPointer<GDBusConnection>>()) 
        fun newForAddressFinish(res: AsyncResult): DBusConnection = DBusConnection(stub<CPointer<GDBusConnection>>()) 
        fun newForAddressSync(address: String, flags: DBusConnectionFlags, observer: DBusAuthObserver, cancellable: Cancellable): DBusConnection = DBusConnection(stub<CPointer<GDBusConnection>>()) 
        fun newSync(stream: IOStream, guid: String, flags: DBusConnectionFlags, observer: DBusAuthObserver, cancellable: Cancellable): DBusConnection = DBusConnection(stub<CPointer<GDBusConnection>>()) 
        fun new(stream: IOStream, guid: String, flags: DBusConnectionFlags, observer: DBusAuthObserver, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
    return stub()
}
        fun newForAddress(address: String, flags: DBusConnectionFlags, observer: DBusAuthObserver, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
    return stub()
}
    }
}

typealias DBusConnectionFlags = GDBusConnectionFlags

typealias DBusError = GDBusError

class DBusErrorEntry(private val cptr: CPointer<cnames.structs._GDBusErrorEntry>) /* struct */ {
    companion object {
        fun cptr(obj: DBusErrorEntry): CPointer<cnames.structs._GDBusErrorEntry> = obj.cptr
    }
}

interface DBusInterface : InteropWrapper {
    fun getObject(): DBusObject = stub("DBusInterface default impl")

    fun getInfo(): DBusInterfaceInfo = stub("DBusInterface default impl")

    fun setObject(`object`: DBusObject): Unit = stub("DBusInterface default impl")

    companion object {
        fun cptr(obj: DBusInterface): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GDBusInterface>) : DBusInterface {
        override val rawPtr: COpaquePointer = cptr
    }
}

typealias DBusInterfaceGetPropertyFunc = (connection:  DBusConnection, sender:  String, object_path:  String, interface_name:  String, property_name:  String, error:  Error, user_data:  Any) -> com.charlag.kgtk.demo.glib.Variant

class DBusInterfaceIface(private val cptr: CPointer<cnames.structs._GDBusInterfaceIface>) /* struct */ {
    companion object {
        fun cptr(obj: DBusInterfaceIface): CPointer<cnames.structs._GDBusInterfaceIface> = obj.cptr
    }
}

class DBusInterfaceInfo(private val cptr: CPointer<cnames.structs._GDBusInterfaceInfo>) /* struct */ {
    fun cacheBuild(): Unit {
         return stub()
    }
    fun cacheRelease(): Unit {
         return stub()
    }
    fun generateXml(indent: UInt, string_builder: com.charlag.kgtk.demo.glib.String): Unit {
         return stub()
    }
    fun lookupMethod(`name`: String): DBusMethodInfo {
         return stub()
    }
    fun lookupProperty(`name`: String): DBusPropertyInfo {
         return stub()
    }
    fun lookupSignal(`name`: String): DBusSignalInfo {
         return stub()
    }
    fun ref(): DBusInterfaceInfo {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: DBusInterfaceInfo): CPointer<cnames.structs._GDBusInterfaceInfo> = obj.cptr
    }
}

typealias DBusInterfaceMethodCallFunc = (connection:  DBusConnection, sender:  String, object_path:  String, interface_name:  String, method_name:  String, parameters:  com.charlag.kgtk.demo.glib.Variant, invocation:  DBusMethodInvocation, user_data:  Any) -> Unit

typealias DBusInterfaceSetPropertyFunc = (connection:  DBusConnection, sender:  String, object_path:  String, interface_name:  String, property_name:  String, value:  com.charlag.kgtk.demo.glib.Variant, error:  Error, user_data:  Any) -> Boolean

open class DBusInterfaceSkeleton internal constructor (private val cptr: CPointer<GDBusInterfaceSkeleton>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), DBusInterface, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun export(connection: DBusConnection, object_path: String): Boolean {
         return stub()
    }
    open fun flush(): Unit {
         return stub()
    }
    open fun getConnection(): DBusConnection {
         return stub()
    }
    open fun getConnections(): List<DBusConnection> {
         return stub()
    }
    open fun getFlags(): DBusInterfaceSkeletonFlags {
         return stub()
    }
    override fun getInfo(): DBusInterfaceInfo {
         return stub()
    }
    open fun getObjectPath(): String {
         return stub()
    }
    open fun getProperties(): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun hasConnection(connection: DBusConnection): Boolean {
         return stub()
    }
    open fun setFlags(flags: DBusInterfaceSkeletonFlags): Unit {
         return stub()
    }
    open fun unexport(): Unit {
         return stub()
    }
    open fun unexportFromConnection(connection: DBusConnection): Unit {
         return stub()
    }
    fun setOnGAuthorizeMethod(cb: () -> Unit) {
        do_connect(cptr, "g-authorize-method", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32329360UL
        fun cptr(obj: DBusInterfaceSkeleton): CPointer<GDBusInterfaceSkeleton> = obj.cptr
    }
}

class DBusInterfaceSkeletonClass(private val cptr: CPointer<cnames.structs._GDBusInterfaceSkeletonClass>) /* struct */ {
    companion object {
        fun cptr(obj: DBusInterfaceSkeletonClass): CPointer<cnames.structs._GDBusInterfaceSkeletonClass> = obj.cptr
    }
}

typealias DBusInterfaceSkeletonFlags = GDBusInterfaceSkeletonFlags

class DBusInterfaceVTable(private val cptr: CPointer<cnames.structs._GDBusInterfaceVTable>) /* struct */ {
    companion object {
        fun cptr(obj: DBusInterfaceVTable): CPointer<cnames.structs._GDBusInterfaceVTable> = obj.cptr
    }
}

open class DBusMenuModel internal constructor (private val cptr: CPointer<GDBusMenuModel>) : MenuModel(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 32550720UL
        fun cptr(obj: DBusMenuModel): CPointer<GDBusMenuModel> = obj.cptr
        fun get(connection: DBusConnection, bus_name: String, object_path: String): DBusMenuModel {
    return stub()
}
    }
}

open class DBusMessage internal constructor (private val cptr: CPointer<GDBusMessage>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GDBusMessage>>())

    open fun copy(): DBusMessage {
         return stub()
    }
    open fun getArg0(): String {
         return stub()
    }
    open fun getBody(): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun getByteOrder(): DBusMessageByteOrder {
         return stub()
    }
    open fun getDestination(): String {
         return stub()
    }
    open fun getErrorName(): String {
         return stub()
    }
    open fun getFlags(): DBusMessageFlags {
         return stub()
    }
    open fun getHeader(header_field: DBusMessageHeaderField): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun getHeaderFields(): List<UByte> {
         return stub()
    }
    open fun getInterface(): String {
         return stub()
    }
    open fun getLocked(): Boolean {
         return stub()
    }
    open fun getMember(): String {
         return stub()
    }
    open fun getMessageType(): DBusMessageType {
         return stub()
    }
    open fun getNumUnixFds(): UInt {
         return stub()
    }
    open fun getPath(): String {
         return stub()
    }
    open fun getReplySerial(): UInt {
         return stub()
    }
    open fun getSender(): String {
         return stub()
    }
    open fun getSerial(): UInt {
         return stub()
    }
    open fun getSignature(): String {
         return stub()
    }
    open fun getUnixFdList(): UnixFDList {
         return stub()
    }
    open fun lock(): Unit {
         return stub()
    }
    open fun newMethodErrorLiteral(error_name: String, error_message: String): DBusMessage {
         return stub()
    }
    open fun newMethodReply(): DBusMessage {
         return stub()
    }
    open fun print(indent: UInt): String {
         return stub()
    }
    open fun setBody(body: com.charlag.kgtk.demo.glib.Variant): Unit {
         return stub()
    }
    open fun setByteOrder(byte_order: DBusMessageByteOrder): Unit {
         return stub()
    }
    open fun setDestination(value: String): Unit {
         return stub()
    }
    open fun setErrorName(value: String): Unit {
         return stub()
    }
    open fun setFlags(flags: DBusMessageFlags): Unit {
         return stub()
    }
    open fun setHeader(header_field: DBusMessageHeaderField, value: com.charlag.kgtk.demo.glib.Variant): Unit {
         return stub()
    }
    open fun setInterface(value: String): Unit {
         return stub()
    }
    open fun setMember(value: String): Unit {
         return stub()
    }
    open fun setMessageType(type: DBusMessageType): Unit {
         return stub()
    }
    open fun setNumUnixFds(value: UInt): Unit {
         return stub()
    }
    open fun setPath(value: String): Unit {
         return stub()
    }
    open fun setReplySerial(value: UInt): Unit {
         return stub()
    }
    open fun setSender(value: String): Unit {
         return stub()
    }
    open fun setSerial(serial: UInt): Unit {
         return stub()
    }
    open fun setSignature(value: String): Unit {
         return stub()
    }
    open fun setUnixFdList(fd_list: UnixFDList): Unit {
         return stub()
    }
    open fun toBlob(out_size: ULong, capabilities: DBusCapabilityFlags): List<UByte> {
         return stub()
    }
    open fun toGerror(): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30552656UL
        fun cptr(obj: DBusMessage): CPointer<GDBusMessage> = obj.cptr
        fun newFromBlob(blob: List<UByte>, blob_len: ULong, capabilities: DBusCapabilityFlags): DBusMessage = DBusMessage(stub<CPointer<GDBusMessage>>()) 
        fun newMethodCall(`name`: String, path: String, interface_: String, method: String): DBusMessage = DBusMessage(stub<CPointer<GDBusMessage>>()) 
        fun newSignal(path: String, interface_: String, signal: String): DBusMessage = DBusMessage(stub<CPointer<GDBusMessage>>()) 
        fun bytesNeeded(blob: List<UByte>, blob_len: ULong): Long {
    return stub()
}
    }
}

typealias DBusMessageByteOrder = GDBusMessageByteOrder

typealias DBusMessageFilterFunction = (connection:  DBusConnection, message:  DBusMessage, incoming:  Boolean, user_data:  Any) -> DBusMessage

typealias DBusMessageFlags = GDBusMessageFlags

typealias DBusMessageHeaderField = GDBusMessageHeaderField

typealias DBusMessageType = GDBusMessageType

class DBusMethodInfo(private val cptr: CPointer<cnames.structs._GDBusMethodInfo>) /* struct */ {
    fun ref(): DBusMethodInfo {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: DBusMethodInfo): CPointer<cnames.structs._GDBusMethodInfo> = obj.cptr
    }
}

open class DBusMethodInvocation internal constructor (private val cptr: CPointer<GDBusMethodInvocation>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getConnection(): DBusConnection {
         return stub()
    }
    open fun getInterfaceName(): String {
         return stub()
    }
    open fun getMessage(): DBusMessage {
         return stub()
    }
    open fun getMethodInfo(): DBusMethodInfo {
         return stub()
    }
    open fun getMethodName(): String {
         return stub()
    }
    open fun getObjectPath(): String {
         return stub()
    }
    open fun getParameters(): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun getPropertyInfo(): DBusPropertyInfo {
         return stub()
    }
    open fun getSender(): String {
         return stub()
    }
    open fun returnDbusError(error_name: String, error_message: String): Unit {
         return stub()
    }
    open fun returnErrorLiteral(domain: UInt, code: Int, message: String): Unit {
         return stub()
    }
    open fun returnGerror(error: Error): Unit {
         return stub()
    }
    open fun returnValue(parameters: com.charlag.kgtk.demo.glib.Variant): Unit {
         return stub()
    }
    open fun returnValueWithUnixFdList(parameters: com.charlag.kgtk.demo.glib.Variant, fd_list: UnixFDList): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31037088UL
        fun cptr(obj: DBusMethodInvocation): CPointer<GDBusMethodInvocation> = obj.cptr
    }
}

class DBusNodeInfo(private val cptr: CPointer<cnames.structs._GDBusNodeInfo>) /* struct */ {
    fun newForXml(xml_data: String): DBusNodeInfo {
         return stub()
    }
    fun generateXml(indent: UInt, string_builder: com.charlag.kgtk.demo.glib.String): Unit {
         return stub()
    }
    fun lookupInterface(`name`: String): DBusInterfaceInfo {
         return stub()
    }
    fun ref(): DBusNodeInfo {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: DBusNodeInfo): CPointer<cnames.structs._GDBusNodeInfo> = obj.cptr
    }
}

interface DBusObject : InteropWrapper {
    fun getInterface(interface_name: String): DBusInterface = stub("DBusObject default impl")

    fun getInterfaces(): List<DBusInterface> = stub("DBusObject default impl")

    fun getObjectPath(): String = stub("DBusObject default impl")

    companion object {
        fun cptr(obj: DBusObject): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GDBusObject>) : DBusObject {
        override val rawPtr: COpaquePointer = cptr
    }
}

class DBusObjectIface(private val cptr: CPointer<cnames.structs._GDBusObjectIface>) /* struct */ {
    companion object {
        fun cptr(obj: DBusObjectIface): CPointer<cnames.structs._GDBusObjectIface> = obj.cptr
    }
}

interface DBusObjectManager : InteropWrapper {
    fun getInterface(object_path: String, interface_name: String): DBusInterface = stub("DBusObjectManager default impl")

    fun getObject(object_path: String): DBusObject = stub("DBusObjectManager default impl")

    fun getObjectPath(): String = stub("DBusObjectManager default impl")

    fun getObjects(): List<DBusObject> = stub("DBusObjectManager default impl")

    companion object {
        fun cptr(obj: DBusObjectManager): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GDBusObjectManager>) : DBusObjectManager {
        override val rawPtr: COpaquePointer = cptr
    }
}

open class DBusObjectManagerClient internal constructor (private val cptr: CPointer<GDBusObjectManagerClient>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), AsyncInitable, DBusObjectManager, Initable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getConnection(): DBusConnection {
         return stub()
    }
    open fun getFlags(): DBusObjectManagerClientFlags {
         return stub()
    }
    open fun getName(): String {
         return stub()
    }
    open fun getNameOwner(): String {
         return stub()
    }
    fun setOnInterfaceProxyPropertiesChanged(cb: () -> Unit) {
        do_connect(cptr, "interface-proxy-properties-changed", cb)
    }

    fun setOnInterfaceProxySignal(cb: () -> Unit) {
        do_connect(cptr, "interface-proxy-signal", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 34015824UL
        fun cptr(obj: DBusObjectManagerClient): CPointer<GDBusObjectManagerClient> = obj.cptr
        fun newFinish(res: AsyncResult): DBusObjectManagerClient = DBusObjectManagerClient(stub<CPointer<GDBusObjectManagerClient>>()) 
        fun newForBusFinish(res: AsyncResult): DBusObjectManagerClient = DBusObjectManagerClient(stub<CPointer<GDBusObjectManagerClient>>()) 
        fun newForBusSync(bus_type: BusType, flags: DBusObjectManagerClientFlags, `name`: String, object_path: String, get_proxy_type_func: DBusProxyTypeFunc, get_proxy_type_user_data: Any, get_proxy_type_destroy_notify: com.charlag.kgtk.demo.glib.DestroyNotify, cancellable: Cancellable): DBusObjectManagerClient = DBusObjectManagerClient(stub<CPointer<GDBusObjectManagerClient>>()) 
        fun newSync(connection: DBusConnection, flags: DBusObjectManagerClientFlags, `name`: String, object_path: String, get_proxy_type_func: DBusProxyTypeFunc, get_proxy_type_user_data: Any, get_proxy_type_destroy_notify: com.charlag.kgtk.demo.glib.DestroyNotify, cancellable: Cancellable): DBusObjectManagerClient = DBusObjectManagerClient(stub<CPointer<GDBusObjectManagerClient>>()) 
        fun new(connection: DBusConnection, flags: DBusObjectManagerClientFlags, `name`: String, object_path: String, get_proxy_type_func: DBusProxyTypeFunc, get_proxy_type_user_data: Any, get_proxy_type_destroy_notify: com.charlag.kgtk.demo.glib.DestroyNotify, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
    return stub()
}
        fun newForBus(bus_type: BusType, flags: DBusObjectManagerClientFlags, `name`: String, object_path: String, get_proxy_type_func: DBusProxyTypeFunc, get_proxy_type_user_data: Any, get_proxy_type_destroy_notify: com.charlag.kgtk.demo.glib.DestroyNotify, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
    return stub()
}
    }
}

class DBusObjectManagerClientClass(private val cptr: CPointer<cnames.structs._GDBusObjectManagerClientClass>) /* struct */ {
    companion object {
        fun cptr(obj: DBusObjectManagerClientClass): CPointer<cnames.structs._GDBusObjectManagerClientClass> = obj.cptr
    }
}

typealias DBusObjectManagerClientFlags = GDBusObjectManagerClientFlags

class DBusObjectManagerIface(private val cptr: CPointer<cnames.structs._GDBusObjectManagerIface>) /* struct */ {
    companion object {
        fun cptr(obj: DBusObjectManagerIface): CPointer<cnames.structs._GDBusObjectManagerIface> = obj.cptr
    }
}

open class DBusObjectManagerServer internal constructor (private val cptr: CPointer<GDBusObjectManagerServer>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), DBusObjectManager, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(object_path: String) : this(stub<CPointer<GDBusObjectManagerServer>>())

    open fun export(`object`: DBusObjectSkeleton): Unit {
         return stub()
    }
    open fun exportUniquely(`object`: DBusObjectSkeleton): Unit {
         return stub()
    }
    open fun getConnection(): DBusConnection {
         return stub()
    }
    open fun isExported(`object`: DBusObjectSkeleton): Boolean {
         return stub()
    }
    open fun setConnection(connection: DBusConnection): Unit {
         return stub()
    }
    open fun unexport(object_path: String): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 37635792UL
        fun cptr(obj: DBusObjectManagerServer): CPointer<GDBusObjectManagerServer> = obj.cptr
    }
}

class DBusObjectManagerServerClass(private val cptr: CPointer<cnames.structs._GDBusObjectManagerServerClass>) /* struct */ {
    companion object {
        fun cptr(obj: DBusObjectManagerServerClass): CPointer<cnames.structs._GDBusObjectManagerServerClass> = obj.cptr
    }
}

open class DBusObjectProxy internal constructor (private val cptr: CPointer<GDBusObjectProxy>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), DBusObject, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(connection: DBusConnection, object_path: String) : this(stub<CPointer<GDBusObjectProxy>>())

    open fun getConnection(): DBusConnection {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 39150448UL
        fun cptr(obj: DBusObjectProxy): CPointer<GDBusObjectProxy> = obj.cptr
    }
}

class DBusObjectProxyClass(private val cptr: CPointer<cnames.structs._GDBusObjectProxyClass>) /* struct */ {
    companion object {
        fun cptr(obj: DBusObjectProxyClass): CPointer<cnames.structs._GDBusObjectProxyClass> = obj.cptr
    }
}

open class DBusObjectSkeleton internal constructor (private val cptr: CPointer<GDBusObjectSkeleton>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), DBusObject, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(object_path: String) : this(stub<CPointer<GDBusObjectSkeleton>>())

    open fun addInterface(interface_: DBusInterfaceSkeleton): Unit {
         return stub()
    }
    open fun flush(): Unit {
         return stub()
    }
    open fun removeInterface(interface_: DBusInterfaceSkeleton): Unit {
         return stub()
    }
    open fun removeInterfaceByName(interface_name: String): Unit {
         return stub()
    }
    open fun setObjectPath(object_path: String): Unit {
         return stub()
    }
    fun setOnAuthorizeMethod(cb: () -> Unit) {
        do_connect(cptr, "authorize-method", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33689440UL
        fun cptr(obj: DBusObjectSkeleton): CPointer<GDBusObjectSkeleton> = obj.cptr
    }
}

class DBusObjectSkeletonClass(private val cptr: CPointer<cnames.structs._GDBusObjectSkeletonClass>) /* struct */ {
    companion object {
        fun cptr(obj: DBusObjectSkeletonClass): CPointer<cnames.structs._GDBusObjectSkeletonClass> = obj.cptr
    }
}

class DBusPropertyInfo(private val cptr: CPointer<cnames.structs._GDBusPropertyInfo>) /* struct */ {
    fun ref(): DBusPropertyInfo {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: DBusPropertyInfo): CPointer<cnames.structs._GDBusPropertyInfo> = obj.cptr
    }
}

typealias DBusPropertyInfoFlags = GDBusPropertyInfoFlags

open class DBusProxy internal constructor (private val cptr: CPointer<GDBusProxy>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), AsyncInitable, DBusInterface, Initable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun call(method_name: String, parameters: com.charlag.kgtk.demo.glib.Variant, flags: DBusCallFlags, timeout_msec: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun callFinish(res: AsyncResult): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun callSync(method_name: String, parameters: com.charlag.kgtk.demo.glib.Variant, flags: DBusCallFlags, timeout_msec: Int, cancellable: Cancellable): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun callWithUnixFdList(method_name: String, parameters: com.charlag.kgtk.demo.glib.Variant, flags: DBusCallFlags, timeout_msec: Int, fd_list: UnixFDList, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun callWithUnixFdListFinish(out_fd_list: UnixFDList, res: AsyncResult): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun callWithUnixFdListSync(method_name: String, parameters: com.charlag.kgtk.demo.glib.Variant, flags: DBusCallFlags, timeout_msec: Int, fd_list: UnixFDList, out_fd_list: UnixFDList, cancellable: Cancellable): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun getCachedProperty(property_name: String): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun getCachedPropertyNames(): List<String> {
         return stub()
    }
    open fun getConnection(): DBusConnection {
         return stub()
    }
    open fun getDefaultTimeout(): Int {
         return stub()
    }
    open fun getFlags(): DBusProxyFlags {
         return stub()
    }
    open fun getInterfaceInfo(): DBusInterfaceInfo {
         return stub()
    }
    open fun getInterfaceName(): String {
         return stub()
    }
    open fun getName(): String {
         return stub()
    }
    open fun getNameOwner(): String {
         return stub()
    }
    open fun getObjectPath(): String {
         return stub()
    }
    open fun setCachedProperty(property_name: String, value: com.charlag.kgtk.demo.glib.Variant): Unit {
         return stub()
    }
    open fun setDefaultTimeout(timeout_msec: Int): Unit {
         return stub()
    }
    open fun setInterfaceInfo(info: DBusInterfaceInfo): Unit {
         return stub()
    }
    fun setOnGPropertiesChanged(cb: () -> Unit) {
        do_connect(cptr, "g-properties-changed", cb)
    }

    fun setOnGSignal(cb: () -> Unit) {
        do_connect(cptr, "g-signal", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 36049536UL
        fun cptr(obj: DBusProxy): CPointer<GDBusProxy> = obj.cptr
        fun newFinish(res: AsyncResult): DBusProxy = DBusProxy(stub<CPointer<GDBusProxy>>()) 
        fun newForBusFinish(res: AsyncResult): DBusProxy = DBusProxy(stub<CPointer<GDBusProxy>>()) 
        fun newForBusSync(bus_type: BusType, flags: DBusProxyFlags, info: DBusInterfaceInfo, `name`: String, object_path: String, interface_name: String, cancellable: Cancellable): DBusProxy = DBusProxy(stub<CPointer<GDBusProxy>>()) 
        fun newSync(connection: DBusConnection, flags: DBusProxyFlags, info: DBusInterfaceInfo, `name`: String, object_path: String, interface_name: String, cancellable: Cancellable): DBusProxy = DBusProxy(stub<CPointer<GDBusProxy>>()) 
        fun new(connection: DBusConnection, flags: DBusProxyFlags, info: DBusInterfaceInfo, `name`: String, object_path: String, interface_name: String, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
    return stub()
}
        fun newForBus(bus_type: BusType, flags: DBusProxyFlags, info: DBusInterfaceInfo, `name`: String, object_path: String, interface_name: String, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
    return stub()
}
    }
}

class DBusProxyClass(private val cptr: CPointer<cnames.structs._GDBusProxyClass>) /* struct */ {
    companion object {
        fun cptr(obj: DBusProxyClass): CPointer<cnames.structs._GDBusProxyClass> = obj.cptr
    }
}

typealias DBusProxyFlags = GDBusProxyFlags

typealias DBusProxyTypeFunc = (manager:  DBusObjectManagerClient, object_path:  String, interface_name:  String, user_data:  Any) -> GType

typealias DBusSendMessageFlags = GDBusSendMessageFlags

open class DBusServer internal constructor (private val cptr: CPointer<GDBusServer>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Initable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getClientAddress(): String {
         return stub()
    }
    open fun getFlags(): DBusServerFlags {
         return stub()
    }
    open fun getGuid(): String {
         return stub()
    }
    open fun isActive(): Boolean {
         return stub()
    }
    open fun start(): Unit {
         return stub()
    }
    open fun stop(): Unit {
         return stub()
    }
    fun setOnNewConnection(cb: () -> Unit) {
        do_connect(cptr, "new-connection", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 38661824UL
        fun cptr(obj: DBusServer): CPointer<GDBusServer> = obj.cptr
        fun newSync(address: String, flags: DBusServerFlags, guid: String, observer: DBusAuthObserver, cancellable: Cancellable): DBusServer = DBusServer(stub<CPointer<GDBusServer>>()) 
    }
}

typealias DBusServerFlags = GDBusServerFlags

typealias DBusSignalCallback = (connection:  DBusConnection, sender_name:  String, object_path:  String, interface_name:  String, signal_name:  String, parameters:  com.charlag.kgtk.demo.glib.Variant, user_data:  Any) -> Unit

typealias DBusSignalFlags = GDBusSignalFlags

class DBusSignalInfo(private val cptr: CPointer<cnames.structs._GDBusSignalInfo>) /* struct */ {
    fun ref(): DBusSignalInfo {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: DBusSignalInfo): CPointer<cnames.structs._GDBusSignalInfo> = obj.cptr
    }
}

typealias DBusSubtreeDispatchFunc = (connection:  DBusConnection, sender:  String, object_path:  String, interface_name:  String, node:  String, out_user_data:  Any, user_data:  Any) -> DBusInterfaceVTable

typealias DBusSubtreeFlags = GDBusSubtreeFlags

typealias DBusSubtreeIntrospectFunc = (connection:  DBusConnection, sender:  String, object_path:  String, node:  String, user_data:  Any) -> DBusInterfaceInfo

class DBusSubtreeVTable(private val cptr: CPointer<cnames.structs._GDBusSubtreeVTable>) /* struct */ {
    companion object {
        fun cptr(obj: DBusSubtreeVTable): CPointer<cnames.structs._GDBusSubtreeVTable> = obj.cptr
    }
}

val DESKTOP_APP_INFO_LOOKUP_EXTENSION_POINT_NAME: String get() = TODO()

val DRIVE_IDENTIFIER_KIND_UNIX_DEVICE: String get() = TODO()

open class DataOutputStream internal constructor (private val cptr: CPointer<GDataOutputStream>) : FilterOutputStream(cptr.reinterpret()), Seekable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(base_stream: OutputStream) : this(stub<CPointer<GDataOutputStream>>())

    open fun getByteOrder(): DataStreamByteOrder {
         return stub()
    }
    open fun putByte(data: UByte, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun putInt16(data: Short, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun putInt32(data: Int, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun putInt64(data: Long, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun putString(str: String, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun putUint16(data: UShort, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun putUint32(data: UInt, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun putUint64(data: ULong, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun setByteOrder(order: DataStreamByteOrder): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 35436992UL
        fun cptr(obj: DataOutputStream): CPointer<GDataOutputStream> = obj.cptr
    }
}

class DataOutputStreamClass(private val cptr: CPointer<cnames.structs._GDataOutputStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: DataOutputStreamClass): CPointer<cnames.structs._GDataOutputStreamClass> = obj.cptr
    }
}

typealias DataStreamByteOrder = GDataStreamByteOrder

typealias DataStreamNewlineType = GDataStreamNewlineType

interface DatagramBased : InteropWrapper {
    fun conditionCheck(condition: com.charlag.kgtk.demo.glib.IOCondition): com.charlag.kgtk.demo.glib.IOCondition = stub("DatagramBased default impl")

    fun conditionWait(condition: com.charlag.kgtk.demo.glib.IOCondition, timeout: Long, cancellable: Cancellable): Boolean = stub("DatagramBased default impl")

    fun createSource(condition: com.charlag.kgtk.demo.glib.IOCondition, cancellable: Cancellable): com.charlag.kgtk.demo.glib.Source = stub("DatagramBased default impl")

    fun receiveMessages(messages: List<InputMessage>, num_messages: UInt, flags: Int, timeout: Long, cancellable: Cancellable): Int = stub("DatagramBased default impl")

    fun sendMessages(messages: List<OutputMessage>, num_messages: UInt, flags: Int, timeout: Long, cancellable: Cancellable): Int = stub("DatagramBased default impl")

    companion object {
        fun cptr(obj: DatagramBased): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GDatagramBased>) : DatagramBased {
        override val rawPtr: COpaquePointer = cptr
    }
}

class DatagramBasedInterface(private val cptr: CPointer<cnames.structs._GDatagramBasedInterface>) /* struct */ {
    companion object {
        fun cptr(obj: DatagramBasedInterface): CPointer<cnames.structs._GDatagramBasedInterface> = obj.cptr
    }
}

typealias DatagramBasedSourceFunc = (datagram_based:  DatagramBased, condition:  com.charlag.kgtk.demo.glib.IOCondition, user_data:  Any) -> Boolean

interface Drive : InteropWrapper {
    fun canEject(): Boolean = stub("Drive default impl")

    fun canPollForMedia(): Boolean = stub("Drive default impl")

    fun canStart(): Boolean = stub("Drive default impl")

    fun canStartDegraded(): Boolean = stub("Drive default impl")

    fun canStop(): Boolean = stub("Drive default impl")

    fun ejectWithOperation(flags: MountUnmountFlags, mount_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("Drive default impl")

    fun ejectWithOperationFinish(result: AsyncResult): Boolean = stub("Drive default impl")

    fun enumerateIdentifiers(): List<String> = stub("Drive default impl")

    fun getIcon(): Icon = stub("Drive default impl")

    fun getIdentifier(kind: String): String = stub("Drive default impl")

    fun getName(): String = stub("Drive default impl")

    fun getSortKey(): String = stub("Drive default impl")

    fun getStartStopType(): DriveStartStopType = stub("Drive default impl")

    fun getSymbolicIcon(): Icon = stub("Drive default impl")

    fun getVolumes(): List<Volume> = stub("Drive default impl")

    fun hasMedia(): Boolean = stub("Drive default impl")

    fun hasVolumes(): Boolean = stub("Drive default impl")

    fun isMediaCheckAutomatic(): Boolean = stub("Drive default impl")

    fun isMediaRemovable(): Boolean = stub("Drive default impl")

    fun isRemovable(): Boolean = stub("Drive default impl")

    fun pollForMedia(cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("Drive default impl")

    fun pollForMediaFinish(result: AsyncResult): Boolean = stub("Drive default impl")

    fun start(flags: DriveStartFlags, mount_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("Drive default impl")

    fun startFinish(result: AsyncResult): Boolean = stub("Drive default impl")

    fun stop(flags: MountUnmountFlags, mount_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("Drive default impl")

    fun stopFinish(result: AsyncResult): Boolean = stub("Drive default impl")

    companion object {
        fun cptr(obj: Drive): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GDrive>) : Drive {
        override val rawPtr: COpaquePointer = cptr
    }
}

class DriveIface(private val cptr: CPointer<cnames.structs._GDriveIface>) /* struct */ {
    companion object {
        fun cptr(obj: DriveIface): CPointer<cnames.structs._GDriveIface> = obj.cptr
    }
}

typealias DriveStartFlags = GDriveStartFlags

typealias DriveStartStopType = GDriveStartStopType

interface DtlsClientConnection : DatagramBased, DtlsConnection, InteropWrapper {
    fun new(base_socket: DatagramBased, server_identity: SocketConnectable): DtlsClientConnection = stub("DtlsClientConnection default impl")

    fun getAcceptedCas(): List<List<UByte>> = stub("DtlsClientConnection default impl")

    fun getServerIdentity(): SocketConnectable = stub("DtlsClientConnection default impl")

    fun getValidationFlags(): TlsCertificateFlags = stub("DtlsClientConnection default impl")

    fun setServerIdentity(identity: SocketConnectable): Unit = stub("DtlsClientConnection default impl")

    fun setValidationFlags(flags: TlsCertificateFlags): Unit = stub("DtlsClientConnection default impl")

    companion object {
        fun cptr(obj: DtlsClientConnection): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GDtlsClientConnection>) : DtlsClientConnection {
        override val rawPtr: COpaquePointer = cptr
    }
}

class DtlsClientConnectionInterface(private val cptr: CPointer<cnames.structs._GDtlsClientConnectionInterface>) /* struct */ {
    companion object {
        fun cptr(obj: DtlsClientConnectionInterface): CPointer<cnames.structs._GDtlsClientConnectionInterface> = obj.cptr
    }
}

interface DtlsConnection : DatagramBased, InteropWrapper {
    fun close(cancellable: Cancellable): Boolean = stub("DtlsConnection default impl")

    fun closeAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("DtlsConnection default impl")

    fun closeFinish(result: AsyncResult): Boolean = stub("DtlsConnection default impl")

    fun emitAcceptCertificate(peer_cert: TlsCertificate, errors: TlsCertificateFlags): Boolean = stub("DtlsConnection default impl")

    fun getCertificate(): TlsCertificate = stub("DtlsConnection default impl")

    fun getDatabase(): TlsDatabase = stub("DtlsConnection default impl")

    fun getInteraction(): TlsInteraction = stub("DtlsConnection default impl")

    fun getNegotiatedProtocol(): String = stub("DtlsConnection default impl")

    fun getPeerCertificate(): TlsCertificate = stub("DtlsConnection default impl")

    fun getPeerCertificateErrors(): TlsCertificateFlags = stub("DtlsConnection default impl")

    fun getRequireCloseNotify(): Boolean = stub("DtlsConnection default impl")

    fun handshake(cancellable: Cancellable): Boolean = stub("DtlsConnection default impl")

    fun handshakeAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("DtlsConnection default impl")

    fun handshakeFinish(result: AsyncResult): Boolean = stub("DtlsConnection default impl")

    fun setAdvertisedProtocols(protocols: List<String>): Unit = stub("DtlsConnection default impl")

    fun setCertificate(certificate: TlsCertificate): Unit = stub("DtlsConnection default impl")

    fun setDatabase(database: TlsDatabase): Unit = stub("DtlsConnection default impl")

    fun setInteraction(interaction: TlsInteraction): Unit = stub("DtlsConnection default impl")

    fun setRequireCloseNotify(require_close_notify: Boolean): Unit = stub("DtlsConnection default impl")

    fun shutdown(shutdown_read: Boolean, shutdown_write: Boolean, cancellable: Cancellable): Boolean = stub("DtlsConnection default impl")

    fun shutdownAsync(shutdown_read: Boolean, shutdown_write: Boolean, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("DtlsConnection default impl")

    fun shutdownFinish(result: AsyncResult): Boolean = stub("DtlsConnection default impl")

    companion object {
        fun cptr(obj: DtlsConnection): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GDtlsConnection>) : DtlsConnection {
        override val rawPtr: COpaquePointer = cptr
    }
}

class DtlsConnectionInterface(private val cptr: CPointer<cnames.structs._GDtlsConnectionInterface>) /* struct */ {
    companion object {
        fun cptr(obj: DtlsConnectionInterface): CPointer<cnames.structs._GDtlsConnectionInterface> = obj.cptr
    }
}

interface DtlsServerConnection : DatagramBased, DtlsConnection, InteropWrapper {
    fun new(base_socket: DatagramBased, certificate: TlsCertificate): DtlsServerConnection = stub("DtlsServerConnection default impl")

    companion object {
        fun cptr(obj: DtlsServerConnection): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GDtlsServerConnection>) : DtlsServerConnection {
        override val rawPtr: COpaquePointer = cptr
    }
}

class DtlsServerConnectionInterface(private val cptr: CPointer<cnames.structs._GDtlsServerConnectionInterface>) /* struct */ {
    companion object {
        fun cptr(obj: DtlsServerConnectionInterface): CPointer<cnames.structs._GDtlsServerConnectionInterface> = obj.cptr
    }
}

open class Emblem internal constructor (private val cptr: CPointer<GEmblem>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Icon, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(icon: Icon) : this(stub<CPointer<GEmblem>>())

    open fun getIcon(): Icon {
         return stub()
    }
    open fun getOrigin(): EmblemOrigin {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31402112UL
        fun cptr(obj: Emblem): CPointer<GEmblem> = obj.cptr
        fun newWithOrigin(icon: Icon, origin: EmblemOrigin): Emblem = Emblem(stub<CPointer<GEmblem>>()) 
    }
}

class EmblemClass(private val cptr: CPointer<cnames.structs._GEmblemClass>) /* struct */ {
    companion object {
        fun cptr(obj: EmblemClass): CPointer<cnames.structs._GEmblemClass> = obj.cptr
    }
}

typealias EmblemOrigin = GEmblemOrigin

open class EmblemedIcon internal constructor (private val cptr: CPointer<GEmblemedIcon>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Icon, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(icon: Icon, emblem: Emblem) : this(stub<CPointer<GEmblemedIcon>>())

    open fun addEmblem(emblem: Emblem): Unit {
         return stub()
    }
    open fun clearEmblems(): Unit {
         return stub()
    }
    open fun getEmblems(): List<Emblem> {
         return stub()
    }
    open fun getIcon(): Icon {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 34762832UL
        fun cptr(obj: EmblemedIcon): CPointer<GEmblemedIcon> = obj.cptr
    }
}

class EmblemedIconClass(private val cptr: CPointer<cnames.structs._GEmblemedIconClass>) /* struct */ {
    companion object {
        fun cptr(obj: EmblemedIconClass): CPointer<cnames.structs._GEmblemedIconClass> = obj.cptr
    }
}

val FILE_ATTRIBUTE_ACCESS_CAN_DELETE: String get() = TODO()

val FILE_ATTRIBUTE_ACCESS_CAN_EXECUTE: String get() = TODO()

val FILE_ATTRIBUTE_ACCESS_CAN_READ: String get() = TODO()

val FILE_ATTRIBUTE_ACCESS_CAN_RENAME: String get() = TODO()

val FILE_ATTRIBUTE_ACCESS_CAN_TRASH: String get() = TODO()

val FILE_ATTRIBUTE_ACCESS_CAN_WRITE: String get() = TODO()

val FILE_ATTRIBUTE_DOS_IS_ARCHIVE: String get() = TODO()

val FILE_ATTRIBUTE_DOS_IS_MOUNTPOINT: String get() = TODO()

val FILE_ATTRIBUTE_DOS_IS_SYSTEM: String get() = TODO()

val FILE_ATTRIBUTE_DOS_REPARSE_POINT_TAG: String get() = TODO()

val FILE_ATTRIBUTE_ETAG_VALUE: String get() = TODO()

val FILE_ATTRIBUTE_FILESYSTEM_FREE: String get() = TODO()

val FILE_ATTRIBUTE_FILESYSTEM_READONLY: String get() = TODO()

val FILE_ATTRIBUTE_FILESYSTEM_REMOTE: String get() = TODO()

val FILE_ATTRIBUTE_FILESYSTEM_SIZE: String get() = TODO()

val FILE_ATTRIBUTE_FILESYSTEM_TYPE: String get() = TODO()

val FILE_ATTRIBUTE_FILESYSTEM_USED: String get() = TODO()

val FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW: String get() = TODO()

val FILE_ATTRIBUTE_GVFS_BACKEND: String get() = TODO()

val FILE_ATTRIBUTE_ID_FILE: String get() = TODO()

val FILE_ATTRIBUTE_ID_FILESYSTEM: String get() = TODO()

val FILE_ATTRIBUTE_MOUNTABLE_CAN_EJECT: String get() = TODO()

val FILE_ATTRIBUTE_MOUNTABLE_CAN_MOUNT: String get() = TODO()

val FILE_ATTRIBUTE_MOUNTABLE_CAN_POLL: String get() = TODO()

val FILE_ATTRIBUTE_MOUNTABLE_CAN_START: String get() = TODO()

val FILE_ATTRIBUTE_MOUNTABLE_CAN_START_DEGRADED: String get() = TODO()

val FILE_ATTRIBUTE_MOUNTABLE_CAN_STOP: String get() = TODO()

val FILE_ATTRIBUTE_MOUNTABLE_CAN_UNMOUNT: String get() = TODO()

val FILE_ATTRIBUTE_MOUNTABLE_HAL_UDI: String get() = TODO()

val FILE_ATTRIBUTE_MOUNTABLE_IS_MEDIA_CHECK_AUTOMATIC: String get() = TODO()

val FILE_ATTRIBUTE_MOUNTABLE_START_STOP_TYPE: String get() = TODO()

val FILE_ATTRIBUTE_MOUNTABLE_UNIX_DEVICE: String get() = TODO()

val FILE_ATTRIBUTE_MOUNTABLE_UNIX_DEVICE_FILE: String get() = TODO()

val FILE_ATTRIBUTE_OWNER_GROUP: String get() = TODO()

val FILE_ATTRIBUTE_OWNER_USER: String get() = TODO()

val FILE_ATTRIBUTE_OWNER_USER_REAL: String get() = TODO()

val FILE_ATTRIBUTE_PREVIEW_ICON: String get() = TODO()

val FILE_ATTRIBUTE_RECENT_MODIFIED: String get() = TODO()

val FILE_ATTRIBUTE_SELINUX_CONTEXT: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_ALLOCATED_SIZE: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_COPY_NAME: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_DESCRIPTION: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_EDIT_NAME: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_FAST_CONTENT_TYPE: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_ICON: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_IS_BACKUP: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_IS_HIDDEN: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_IS_SYMLINK: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_IS_VIRTUAL: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_IS_VOLATILE: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_NAME: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_SIZE: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_SORT_ORDER: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_TARGET_URI: String get() = TODO()

val FILE_ATTRIBUTE_STANDARD_TYPE: String get() = TODO()

val FILE_ATTRIBUTE_THUMBNAILING_FAILED: String get() = TODO()

val FILE_ATTRIBUTE_THUMBNAIL_IS_VALID: String get() = TODO()

val FILE_ATTRIBUTE_THUMBNAIL_PATH: String get() = TODO()

val FILE_ATTRIBUTE_TIME_ACCESS: String get() = TODO()

val FILE_ATTRIBUTE_TIME_ACCESS_USEC: String get() = TODO()

val FILE_ATTRIBUTE_TIME_CHANGED: String get() = TODO()

val FILE_ATTRIBUTE_TIME_CHANGED_USEC: String get() = TODO()

val FILE_ATTRIBUTE_TIME_CREATED: String get() = TODO()

val FILE_ATTRIBUTE_TIME_CREATED_USEC: String get() = TODO()

val FILE_ATTRIBUTE_TIME_MODIFIED: String get() = TODO()

val FILE_ATTRIBUTE_TIME_MODIFIED_USEC: String get() = TODO()

val FILE_ATTRIBUTE_TRASH_DELETION_DATE: String get() = TODO()

val FILE_ATTRIBUTE_TRASH_ITEM_COUNT: String get() = TODO()

val FILE_ATTRIBUTE_TRASH_ORIG_PATH: String get() = TODO()

val FILE_ATTRIBUTE_UNIX_BLOCKS: String get() = TODO()

val FILE_ATTRIBUTE_UNIX_BLOCK_SIZE: String get() = TODO()

val FILE_ATTRIBUTE_UNIX_DEVICE: String get() = TODO()

val FILE_ATTRIBUTE_UNIX_GID: String get() = TODO()

val FILE_ATTRIBUTE_UNIX_INODE: String get() = TODO()

val FILE_ATTRIBUTE_UNIX_IS_MOUNTPOINT: String get() = TODO()

val FILE_ATTRIBUTE_UNIX_MODE: String get() = TODO()

val FILE_ATTRIBUTE_UNIX_NLINK: String get() = TODO()

val FILE_ATTRIBUTE_UNIX_RDEV: String get() = TODO()

val FILE_ATTRIBUTE_UNIX_UID: String get() = TODO()

interface File : InteropWrapper {
    fun newForCommandlineArg(arg: String): File = stub("File default impl")

    fun newForCommandlineArgAndCwd(arg: String, cwd: String): File = stub("File default impl")

    fun newForPath(path: String): File = stub("File default impl")

    fun newForUri(uri: String): File = stub("File default impl")

    fun newTmp(tmpl: String, iostream: FileIOStream): File = stub("File default impl")

    fun parseName(parse_name: String): File = stub("File default impl")

    fun appendTo(flags: FileCreateFlags, cancellable: Cancellable): FileOutputStream = stub("File default impl")

    fun appendToAsync(flags: FileCreateFlags, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun appendToFinish(res: AsyncResult): FileOutputStream = stub("File default impl")

    fun copy(destination: File, flags: FileCopyFlags, cancellable: Cancellable, progress_callback: FileProgressCallback, progress_callback_data: Any): Boolean = stub("File default impl")

    fun copyAsync(destination: File, flags: FileCopyFlags, io_priority: Int, cancellable: Cancellable, progress_callback: FileProgressCallback, progress_callback_data: Any, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun copyAttributes(destination: File, flags: FileCopyFlags, cancellable: Cancellable): Boolean = stub("File default impl")

    fun copyFinish(res: AsyncResult): Boolean = stub("File default impl")

    fun create(flags: FileCreateFlags, cancellable: Cancellable): FileOutputStream = stub("File default impl")

    fun createAsync(flags: FileCreateFlags, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun createFinish(res: AsyncResult): FileOutputStream = stub("File default impl")

    fun createReadwrite(flags: FileCreateFlags, cancellable: Cancellable): FileIOStream = stub("File default impl")

    fun createReadwriteAsync(flags: FileCreateFlags, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun createReadwriteFinish(res: AsyncResult): FileIOStream = stub("File default impl")

    fun delete(cancellable: Cancellable): Boolean = stub("File default impl")

    fun deleteAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun deleteFinish(result: AsyncResult): Boolean = stub("File default impl")

    fun dup(): File = stub("File default impl")

    fun ejectMountableWithOperation(flags: MountUnmountFlags, mount_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun ejectMountableWithOperationFinish(result: AsyncResult): Boolean = stub("File default impl")

    fun enumerateChildren(attributes: String, flags: FileQueryInfoFlags, cancellable: Cancellable): FileEnumerator = stub("File default impl")

    fun enumerateChildrenAsync(attributes: String, flags: FileQueryInfoFlags, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun enumerateChildrenFinish(res: AsyncResult): FileEnumerator = stub("File default impl")

    fun equal(file2: File): Boolean = stub("File default impl")

    fun findEnclosingMount(cancellable: Cancellable): Mount = stub("File default impl")

    fun findEnclosingMountAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun findEnclosingMountFinish(res: AsyncResult): Mount = stub("File default impl")

    fun getBasename(): String = stub("File default impl")

    fun getChild(`name`: String): File = stub("File default impl")

    fun getChildForDisplayName(display_name: String): File = stub("File default impl")

    fun getParent(): File = stub("File default impl")

    fun getParseName(): String = stub("File default impl")

    fun getPath(): String = stub("File default impl")

    fun getRelativePath(descendant: File): String = stub("File default impl")

    fun getUri(): String = stub("File default impl")

    fun getUriScheme(): String = stub("File default impl")

    fun hasParent(parent: File): Boolean = stub("File default impl")

    fun hasPrefix(prefix: File): Boolean = stub("File default impl")

    fun hasUriScheme(uri_scheme: String): Boolean = stub("File default impl")

    fun hash(): UInt = stub("File default impl")

    fun isNative(): Boolean = stub("File default impl")

    fun loadBytes(cancellable: Cancellable, etag_out: String): com.charlag.kgtk.demo.glib.Bytes = stub("File default impl")

    fun loadBytesAsync(cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun loadBytesFinish(result: AsyncResult, etag_out: String): com.charlag.kgtk.demo.glib.Bytes = stub("File default impl")

    fun loadContents(cancellable: Cancellable, contents: List<UByte>, length: ULong, etag_out: String): Boolean = stub("File default impl")

    fun loadContentsAsync(cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun loadContentsFinish(res: AsyncResult, contents: List<UByte>, length: ULong, etag_out: String): Boolean = stub("File default impl")

    fun loadPartialContentsFinish(res: AsyncResult, contents: List<UByte>, length: ULong, etag_out: String): Boolean = stub("File default impl")

    fun makeDirectory(cancellable: Cancellable): Boolean = stub("File default impl")

    fun makeDirectoryAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun makeDirectoryFinish(result: AsyncResult): Boolean = stub("File default impl")

    fun makeDirectoryWithParents(cancellable: Cancellable): Boolean = stub("File default impl")

    fun makeSymbolicLink(symlink_value: String, cancellable: Cancellable): Boolean = stub("File default impl")

    fun measureDiskUsageFinish(result: AsyncResult, disk_usage: ULong, num_dirs: ULong, num_files: ULong): Boolean = stub("File default impl")

    fun monitor(flags: FileMonitorFlags, cancellable: Cancellable): FileMonitor = stub("File default impl")

    fun monitorDirectory(flags: FileMonitorFlags, cancellable: Cancellable): FileMonitor = stub("File default impl")

    fun monitorFile(flags: FileMonitorFlags, cancellable: Cancellable): FileMonitor = stub("File default impl")

    fun mountEnclosingVolume(flags: MountMountFlags, mount_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun mountEnclosingVolumeFinish(result: AsyncResult): Boolean = stub("File default impl")

    fun mountMountable(flags: MountMountFlags, mount_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun mountMountableFinish(result: AsyncResult): File = stub("File default impl")

    fun move(destination: File, flags: FileCopyFlags, cancellable: Cancellable, progress_callback: FileProgressCallback, progress_callback_data: Any): Boolean = stub("File default impl")

    fun openReadwrite(cancellable: Cancellable): FileIOStream = stub("File default impl")

    fun openReadwriteAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun openReadwriteFinish(res: AsyncResult): FileIOStream = stub("File default impl")

    fun peekPath(): String = stub("File default impl")

    fun pollMountable(cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun pollMountableFinish(result: AsyncResult): Boolean = stub("File default impl")

    fun queryDefaultHandler(cancellable: Cancellable): AppInfo = stub("File default impl")

    fun queryDefaultHandlerAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun queryDefaultHandlerFinish(result: AsyncResult): AppInfo = stub("File default impl")

    fun queryExists(cancellable: Cancellable): Boolean = stub("File default impl")

    fun queryFileType(flags: FileQueryInfoFlags, cancellable: Cancellable): FileType = stub("File default impl")

    fun queryFilesystemInfo(attributes: String, cancellable: Cancellable): FileInfo = stub("File default impl")

    fun queryFilesystemInfoAsync(attributes: String, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun queryFilesystemInfoFinish(res: AsyncResult): FileInfo = stub("File default impl")

    fun queryInfo(attributes: String, flags: FileQueryInfoFlags, cancellable: Cancellable): FileInfo = stub("File default impl")

    fun queryInfoAsync(attributes: String, flags: FileQueryInfoFlags, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun queryInfoFinish(res: AsyncResult): FileInfo = stub("File default impl")

    fun querySettableAttributes(cancellable: Cancellable): FileAttributeInfoList = stub("File default impl")

    fun queryWritableNamespaces(cancellable: Cancellable): FileAttributeInfoList = stub("File default impl")

    fun read(cancellable: Cancellable): FileInputStream = stub("File default impl")

    fun readAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun readFinish(res: AsyncResult): FileInputStream = stub("File default impl")

    fun replace(etag: String, make_backup: Boolean, flags: FileCreateFlags, cancellable: Cancellable): FileOutputStream = stub("File default impl")

    fun replaceAsync(etag: String, make_backup: Boolean, flags: FileCreateFlags, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun replaceContents(contents: List<UByte>, length: ULong, etag: String, make_backup: Boolean, flags: FileCreateFlags, new_etag: String, cancellable: Cancellable): Boolean = stub("File default impl")

    fun replaceContentsAsync(contents: List<UByte>, length: ULong, etag: String, make_backup: Boolean, flags: FileCreateFlags, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun replaceContentsBytesAsync(contents: com.charlag.kgtk.demo.glib.Bytes, etag: String, make_backup: Boolean, flags: FileCreateFlags, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun replaceContentsFinish(res: AsyncResult, new_etag: String): Boolean = stub("File default impl")

    fun replaceFinish(res: AsyncResult): FileOutputStream = stub("File default impl")

    fun replaceReadwrite(etag: String, make_backup: Boolean, flags: FileCreateFlags, cancellable: Cancellable): FileIOStream = stub("File default impl")

    fun replaceReadwriteAsync(etag: String, make_backup: Boolean, flags: FileCreateFlags, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun replaceReadwriteFinish(res: AsyncResult): FileIOStream = stub("File default impl")

    fun resolveRelativePath(relative_path: String): File = stub("File default impl")

    fun setAttribute(attribute: String, type: FileAttributeType, value_p: Any, flags: FileQueryInfoFlags, cancellable: Cancellable): Boolean = stub("File default impl")

    fun setAttributeByteString(attribute: String, value: String, flags: FileQueryInfoFlags, cancellable: Cancellable): Boolean = stub("File default impl")

    fun setAttributeInt32(attribute: String, value: Int, flags: FileQueryInfoFlags, cancellable: Cancellable): Boolean = stub("File default impl")

    fun setAttributeInt64(attribute: String, value: Long, flags: FileQueryInfoFlags, cancellable: Cancellable): Boolean = stub("File default impl")

    fun setAttributeString(attribute: String, value: String, flags: FileQueryInfoFlags, cancellable: Cancellable): Boolean = stub("File default impl")

    fun setAttributeUint32(attribute: String, value: UInt, flags: FileQueryInfoFlags, cancellable: Cancellable): Boolean = stub("File default impl")

    fun setAttributeUint64(attribute: String, value: ULong, flags: FileQueryInfoFlags, cancellable: Cancellable): Boolean = stub("File default impl")

    fun setAttributesAsync(info: FileInfo, flags: FileQueryInfoFlags, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun setAttributesFinish(result: AsyncResult, info: FileInfo): Boolean = stub("File default impl")

    fun setAttributesFromInfo(info: FileInfo, flags: FileQueryInfoFlags, cancellable: Cancellable): Boolean = stub("File default impl")

    fun setDisplayName(display_name: String, cancellable: Cancellable): File = stub("File default impl")

    fun setDisplayNameAsync(display_name: String, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun setDisplayNameFinish(res: AsyncResult): File = stub("File default impl")

    fun startMountable(flags: DriveStartFlags, start_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun startMountableFinish(result: AsyncResult): Boolean = stub("File default impl")

    fun stopMountable(flags: MountUnmountFlags, mount_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun stopMountableFinish(result: AsyncResult): Boolean = stub("File default impl")

    fun supportsThreadContexts(): Boolean = stub("File default impl")

    fun trash(cancellable: Cancellable): Boolean = stub("File default impl")

    fun trashAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun trashFinish(result: AsyncResult): Boolean = stub("File default impl")

    fun unmountMountableWithOperation(flags: MountUnmountFlags, mount_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("File default impl")

    fun unmountMountableWithOperationFinish(result: AsyncResult): Boolean = stub("File default impl")

    companion object {
        fun cptr(obj: File): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GFile>) : File {
        override val rawPtr: COpaquePointer = cptr
    }
}

class FileAttributeInfo(private val cptr: CPointer<cnames.structs._GFileAttributeInfo>) /* struct */ {
    companion object {
        fun cptr(obj: FileAttributeInfo): CPointer<cnames.structs._GFileAttributeInfo> = obj.cptr
    }
}

typealias FileAttributeInfoFlags = GFileAttributeInfoFlags

class FileAttributeInfoList(private val cptr: CPointer<cnames.structs._GFileAttributeInfoList>) /* struct */ {
    fun new(): FileAttributeInfoList {
         return stub()
    }
    fun add(`name`: String, type: FileAttributeType, flags: FileAttributeInfoFlags): Unit {
         return stub()
    }
    fun dup(): FileAttributeInfoList {
         return stub()
    }
    fun lookup(`name`: String): FileAttributeInfo {
         return stub()
    }
    fun ref(): FileAttributeInfoList {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: FileAttributeInfoList): CPointer<cnames.structs._GFileAttributeInfoList> = obj.cptr
    }
}

class FileAttributeMatcher(private val cptr: CPointer<cnames.structs._GFileAttributeMatcher>) /* struct */ {
    fun new(attributes: String): FileAttributeMatcher {
         return stub()
    }
    fun enumerateNamespace(ns: String): Boolean {
         return stub()
    }
    fun enumerateNext(): String {
         return stub()
    }
    fun matches(attribute: String): Boolean {
         return stub()
    }
    fun matchesOnly(attribute: String): Boolean {
         return stub()
    }
    fun ref(): FileAttributeMatcher {
         return stub()
    }
    fun subtract(subtract: FileAttributeMatcher): FileAttributeMatcher {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: FileAttributeMatcher): CPointer<cnames.structs._GFileAttributeMatcher> = obj.cptr
    }
}

typealias FileAttributeStatus = GFileAttributeStatus

typealias FileAttributeType = GFileAttributeType

typealias FileCopyFlags = GFileCopyFlags

typealias FileCreateFlags = GFileCreateFlags

open class FileEnumerator internal constructor (private val cptr: CPointer<GFileEnumerator>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun close(cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun closeAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun closeFinish(result: AsyncResult): Boolean {
         return stub()
    }
    open fun getChild(info: FileInfo): File {
         return stub()
    }
    open fun getContainer(): File {
         return stub()
    }
    open fun hasPending(): Boolean {
         return stub()
    }
    open fun isClosed(): Boolean {
         return stub()
    }
    open fun iterate(out_info: FileInfo, out_child: File, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun nextFile(cancellable: Cancellable): FileInfo {
         return stub()
    }
    open fun nextFilesAsync(num_files: Int, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun nextFilesFinish(result: AsyncResult): List<FileInfo> {
         return stub()
    }
    open fun setPending(pending: Boolean): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31195440UL
        fun cptr(obj: FileEnumerator): CPointer<GFileEnumerator> = obj.cptr
    }
}

class FileEnumeratorClass(private val cptr: CPointer<cnames.structs._GFileEnumeratorClass>) /* struct */ {
    companion object {
        fun cptr(obj: FileEnumeratorClass): CPointer<cnames.structs._GFileEnumeratorClass> = obj.cptr
    }
}

open class FileIOStream internal constructor (private val cptr: CPointer<GFileIOStream>) : IOStream(cptr.reinterpret()), Seekable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getEtag(): String {
         return stub()
    }
    open fun queryInfo(attributes: String, cancellable: Cancellable): FileInfo {
         return stub()
    }
    open fun queryInfoAsync(attributes: String, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun queryInfoFinish(result: AsyncResult): FileInfo {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32228224UL
        fun cptr(obj: FileIOStream): CPointer<GFileIOStream> = obj.cptr
    }
}

class FileIOStreamClass(private val cptr: CPointer<cnames.structs._GFileIOStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: FileIOStreamClass): CPointer<cnames.structs._GFileIOStreamClass> = obj.cptr
    }
}

open class FileIcon internal constructor (private val cptr: CPointer<GFileIcon>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Icon, LoadableIcon, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(file: File) : this(stub<CPointer<GFileIcon>>())

    open fun getFile(): File {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32593088UL
        fun cptr(obj: FileIcon): CPointer<GFileIcon> = obj.cptr
    }
}

class FileIconClass(private val cptr: CPointer<cnames.structs._GFileIconClass>) /* struct */ {
    companion object {
        fun cptr(obj: FileIconClass): CPointer<cnames.structs._GFileIconClass> = obj.cptr
    }
}

class FileIface(private val cptr: CPointer<cnames.structs._GFileIface>) /* struct */ {
    companion object {
        fun cptr(obj: FileIface): CPointer<cnames.structs._GFileIface> = obj.cptr
    }
}

open class FileInfo internal constructor (private val cptr: CPointer<GFileInfo>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GFileInfo>>())

    open fun clearStatus(): Unit {
         return stub()
    }
    open fun copyInto(dest_info: FileInfo): Unit {
         return stub()
    }
    open fun dup(): FileInfo {
         return stub()
    }
    open fun getAttributeAsString(attribute: String): String {
         return stub()
    }
    open fun getAttributeBoolean(attribute: String): Boolean {
         return stub()
    }
    open fun getAttributeByteString(attribute: String): String {
         return stub()
    }
    open fun getAttributeData(attribute: String, type: FileAttributeType, value_pp: Any, status: FileAttributeStatus): Boolean {
         return stub()
    }
    open fun getAttributeInt32(attribute: String): Int {
         return stub()
    }
    open fun getAttributeInt64(attribute: String): Long {
         return stub()
    }
    open fun getAttributeObject(attribute: String): com.charlag.kgtk.demo.gobject.Object {
         return stub()
    }
    open fun getAttributeStatus(attribute: String): FileAttributeStatus {
         return stub()
    }
    open fun getAttributeString(attribute: String): String {
         return stub()
    }
    open fun getAttributeStringv(attribute: String): List<String> {
         return stub()
    }
    open fun getAttributeType(attribute: String): FileAttributeType {
         return stub()
    }
    open fun getAttributeUint32(attribute: String): UInt {
         return stub()
    }
    open fun getAttributeUint64(attribute: String): ULong {
         return stub()
    }
    open fun getContentType(): String {
         return stub()
    }
    open fun getDeletionDate(): com.charlag.kgtk.demo.glib.DateTime {
         return stub()
    }
    open fun getDisplayName(): String {
         return stub()
    }
    open fun getEditName(): String {
         return stub()
    }
    open fun getEtag(): String {
         return stub()
    }
    open fun getFileType(): FileType {
         return stub()
    }
    open fun getIcon(): Icon {
         return stub()
    }
    open fun getIsBackup(): Boolean {
         return stub()
    }
    open fun getIsHidden(): Boolean {
         return stub()
    }
    open fun getIsSymlink(): Boolean {
         return stub()
    }
    open fun getModificationDateTime(): com.charlag.kgtk.demo.glib.DateTime {
         return stub()
    }
    open fun getName(): String {
         return stub()
    }
    open fun getSize(): Long {
         return stub()
    }
    open fun getSortOrder(): Int {
         return stub()
    }
    open fun getSymbolicIcon(): Icon {
         return stub()
    }
    open fun getSymlinkTarget(): String {
         return stub()
    }
    open fun hasAttribute(attribute: String): Boolean {
         return stub()
    }
    open fun hasNamespace(name_space: String): Boolean {
         return stub()
    }
    open fun listAttributes(name_space: String): List<String> {
         return stub()
    }
    open fun removeAttribute(attribute: String): Unit {
         return stub()
    }
    open fun setAttribute(attribute: String, type: FileAttributeType, value_p: Any): Unit {
         return stub()
    }
    open fun setAttributeBoolean(attribute: String, attr_value: Boolean): Unit {
         return stub()
    }
    open fun setAttributeByteString(attribute: String, attr_value: String): Unit {
         return stub()
    }
    open fun setAttributeInt32(attribute: String, attr_value: Int): Unit {
         return stub()
    }
    open fun setAttributeInt64(attribute: String, attr_value: Long): Unit {
         return stub()
    }
    open fun setAttributeMask(mask: FileAttributeMatcher): Unit {
         return stub()
    }
    open fun setAttributeObject(attribute: String, attr_value: com.charlag.kgtk.demo.gobject.Object): Unit {
         return stub()
    }
    open fun setAttributeStatus(attribute: String, status: FileAttributeStatus): Boolean {
         return stub()
    }
    open fun setAttributeString(attribute: String, attr_value: String): Unit {
         return stub()
    }
    open fun setAttributeStringv(attribute: String, attr_value: List<String>): Unit {
         return stub()
    }
    open fun setAttributeUint32(attribute: String, attr_value: UInt): Unit {
         return stub()
    }
    open fun setAttributeUint64(attribute: String, attr_value: ULong): Unit {
         return stub()
    }
    open fun setContentType(content_type: String): Unit {
         return stub()
    }
    open fun setDisplayName(display_name: String): Unit {
         return stub()
    }
    open fun setEditName(edit_name: String): Unit {
         return stub()
    }
    open fun setFileType(type: FileType): Unit {
         return stub()
    }
    open fun setIcon(icon: Icon): Unit {
         return stub()
    }
    open fun setIsHidden(is_hidden: Boolean): Unit {
         return stub()
    }
    open fun setIsSymlink(is_symlink: Boolean): Unit {
         return stub()
    }
    open fun setModificationDateTime(mtime: com.charlag.kgtk.demo.glib.DateTime): Unit {
         return stub()
    }
    open fun setName(`name`: String): Unit {
         return stub()
    }
    open fun setSize(size: Long): Unit {
         return stub()
    }
    open fun setSortOrder(sort_order: Int): Unit {
         return stub()
    }
    open fun setSymbolicIcon(icon: Icon): Unit {
         return stub()
    }
    open fun setSymlinkTarget(symlink_target: String): Unit {
         return stub()
    }
    open fun unsetAttributeMask(): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30690304UL
        fun cptr(obj: FileInfo): CPointer<GFileInfo> = obj.cptr
    }
}

class FileInfoClass(private val cptr: CPointer<cnames.structs._GFileInfoClass>) /* struct */ {
    companion object {
        fun cptr(obj: FileInfoClass): CPointer<cnames.structs._GFileInfoClass> = obj.cptr
    }
}

open class FileInputStream internal constructor (private val cptr: CPointer<GFileInputStream>) : InputStream(cptr.reinterpret()), Seekable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun queryInfo(attributes: String, cancellable: Cancellable): FileInfo {
         return stub()
    }
    open fun queryInfoAsync(attributes: String, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun queryInfoFinish(result: AsyncResult): FileInfo {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31751424UL
        fun cptr(obj: FileInputStream): CPointer<GFileInputStream> = obj.cptr
    }
}

class FileInputStreamClass(private val cptr: CPointer<cnames.structs._GFileInputStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: FileInputStreamClass): CPointer<cnames.structs._GFileInputStreamClass> = obj.cptr
    }
}

typealias FileMeasureFlags = GFileMeasureFlags

typealias FileMeasureProgressCallback = (reporting:  Boolean, current_size:  ULong, num_dirs:  ULong, num_files:  ULong, user_data:  Any) -> Unit

open class FileMonitor internal constructor (private val cptr: CPointer<GFileMonitor>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun cancel(): Boolean {
         return stub()
    }
    open fun emitEvent(child: File, other_file: File, event_type: FileMonitorEvent): Unit {
         return stub()
    }
    open fun isCancelled(): Boolean {
         return stub()
    }
    open fun setRateLimit(limit_msecs: Int): Unit {
         return stub()
    }
    fun setOnChanged(cb: () -> Unit) {
        do_connect(cptr, "changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32689008UL
        fun cptr(obj: FileMonitor): CPointer<GFileMonitor> = obj.cptr
    }
}

class FileMonitorClass(private val cptr: CPointer<cnames.structs._GFileMonitorClass>) /* struct */ {
    companion object {
        fun cptr(obj: FileMonitorClass): CPointer<cnames.structs._GFileMonitorClass> = obj.cptr
    }
}

typealias FileMonitorEvent = GFileMonitorEvent

typealias FileMonitorFlags = GFileMonitorFlags

open class FileOutputStream internal constructor (private val cptr: CPointer<GFileOutputStream>) : OutputStream(cptr.reinterpret()), Seekable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getEtag(): String {
         return stub()
    }
    open fun queryInfo(attributes: String, cancellable: Cancellable): FileInfo {
         return stub()
    }
    open fun queryInfoAsync(attributes: String, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun queryInfoFinish(result: AsyncResult): FileInfo {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 36981616UL
        fun cptr(obj: FileOutputStream): CPointer<GFileOutputStream> = obj.cptr
    }
}

class FileOutputStreamClass(private val cptr: CPointer<cnames.structs._GFileOutputStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: FileOutputStreamClass): CPointer<cnames.structs._GFileOutputStreamClass> = obj.cptr
    }
}

typealias FileProgressCallback = (current_num_bytes:  Long, total_num_bytes:  Long, user_data:  Any) -> Unit

typealias FileQueryInfoFlags = GFileQueryInfoFlags

typealias FileReadMoreCallback = (file_contents:  String, file_size:  Long, callback_data:  Any) -> Boolean

typealias FileType = GFileType

open class FilenameCompleter internal constructor (private val cptr: CPointer<GFilenameCompleter>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GFilenameCompleter>>())

    open fun getCompletionSuffix(initial_text: String): String {
         return stub()
    }
    open fun getCompletions(initial_text: String): List<String> {
         return stub()
    }
    open fun setDirsOnly(dirs_only: Boolean): Unit {
         return stub()
    }
    fun setOnGotCompletionData(cb: () -> Unit) {
        do_connect(cptr, "got-completion-data", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 34008864UL
        fun cptr(obj: FilenameCompleter): CPointer<GFilenameCompleter> = obj.cptr
    }
}

class FilenameCompleterClass(private val cptr: CPointer<cnames.structs._GFilenameCompleterClass>) /* struct */ {
    companion object {
        fun cptr(obj: FilenameCompleterClass): CPointer<cnames.structs._GFilenameCompleterClass> = obj.cptr
    }
}

typealias FilesystemPreviewType = GFilesystemPreviewType

open class FilterInputStream internal constructor (private val cptr: CPointer<GFilterInputStream>) : InputStream(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getBaseStream(): InputStream {
         return stub()
    }
    open fun getCloseBaseStream(): Boolean {
         return stub()
    }
    open fun setCloseBaseStream(close_base: Boolean): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31937936UL
        fun cptr(obj: FilterInputStream): CPointer<GFilterInputStream> = obj.cptr
    }
}

class FilterInputStreamClass(private val cptr: CPointer<cnames.structs._GFilterInputStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: FilterInputStreamClass): CPointer<cnames.structs._GFilterInputStreamClass> = obj.cptr
    }
}

open class FilterOutputStream internal constructor (private val cptr: CPointer<GFilterOutputStream>) : OutputStream(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getBaseStream(): OutputStream {
         return stub()
    }
    open fun getCloseBaseStream(): Boolean {
         return stub()
    }
    open fun setCloseBaseStream(close_base: Boolean): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31911408UL
        fun cptr(obj: FilterOutputStream): CPointer<GFilterOutputStream> = obj.cptr
    }
}

class FilterOutputStreamClass(private val cptr: CPointer<cnames.structs._GFilterOutputStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: FilterOutputStreamClass): CPointer<cnames.structs._GFilterOutputStreamClass> = obj.cptr
    }
}

typealias IOErrorEnum = GIOErrorEnum

class IOExtension(private val cptr: CPointer<cnames.structs._GIOExtension>) /* struct */ {
    fun getName(): String {
         return stub()
    }
    fun getPriority(): Int {
         return stub()
    }
    fun getType(): GType {
         return stub()
    }
    companion object {
        fun cptr(obj: IOExtension): CPointer<cnames.structs._GIOExtension> = obj.cptr
    }
}

class IOExtensionPoint(private val cptr: CPointer<cnames.structs._GIOExtensionPoint>) /* struct */ {
    fun getExtensionByName(`name`: String): IOExtension {
         return stub()
    }
    fun getExtensions(): List<IOExtension> {
         return stub()
    }
    fun getRequiredType(): GType {
         return stub()
    }
    fun setRequiredType(type: GType): Unit {
         return stub()
    }
    fun implement(extension_point_name: String, type: GType, extension_name: String, priority: Int): IOExtension {
         return stub()
    }
    fun lookup(`name`: String): IOExtensionPoint {
         return stub()
    }
    fun register(`name`: String): IOExtensionPoint {
         return stub()
    }
    companion object {
        fun cptr(obj: IOExtensionPoint): CPointer<cnames.structs._GIOExtensionPoint> = obj.cptr
    }
}

open class IOModule internal constructor (private val cptr: CPointer<GIOModule>) : com.charlag.kgtk.demo.gobject.TypeModule(cptr.reinterpret()), com.charlag.kgtk.demo.gobject.TypePlugin, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(filename: String) : this(stub<CPointer<GIOModule>>())

    open fun load(): Unit {
         return stub()
    }
    open fun unload(): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32141776UL
        fun cptr(obj: IOModule): CPointer<GIOModule> = obj.cptr
        fun query(): List<String> {
    return stub()
}
    }
}

class IOModuleClass(private val cptr: CPointer<cnames.structs._GIOModuleClass>) /* struct */ {
    companion object {
        fun cptr(obj: IOModuleClass): CPointer<cnames.structs._GIOModuleClass> = obj.cptr
    }
}

class IOModuleScope(private val cptr: CPointer<cnames.structs._GIOModuleScope>) /* struct */ {
    fun block(basename: String): Unit {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: IOModuleScope): CPointer<cnames.structs._GIOModuleScope> = obj.cptr
    }
}

typealias IOModuleScopeFlags = GIOModuleScopeFlags

class IOSchedulerJob(private val cptr: CPointer<cnames.structs._GIOSchedulerJob>) /* struct */ {
    fun sendToMainloop(func: com.charlag.kgtk.demo.glib.SourceFunc, user_data: Any, notify: com.charlag.kgtk.demo.glib.DestroyNotify): Boolean {
         return stub()
    }
    fun sendToMainloopAsync(func: com.charlag.kgtk.demo.glib.SourceFunc, user_data: Any, notify: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: IOSchedulerJob): CPointer<cnames.structs._GIOSchedulerJob> = obj.cptr
    }
}

typealias IOSchedulerJobFunc = (job:  IOSchedulerJob, cancellable:  Cancellable, user_data:  Any) -> Boolean

open class IOStream internal constructor (private val cptr: CPointer<GIOStream>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun clearPending(): Unit {
         return stub()
    }
    open fun close(cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun closeAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun closeFinish(result: AsyncResult): Boolean {
         return stub()
    }
    open fun getInputStream(): InputStream {
         return stub()
    }
    open fun getOutputStream(): OutputStream {
         return stub()
    }
    open fun hasPending(): Boolean {
         return stub()
    }
    open fun isClosed(): Boolean {
         return stub()
    }
    open fun setPending(): Boolean {
         return stub()
    }
    open fun spliceAsync(stream2: IOStream, flags: IOStreamSpliceFlags, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32227984UL
        fun cptr(obj: IOStream): CPointer<GIOStream> = obj.cptr
        fun spliceFinish(result: AsyncResult): Boolean {
    return stub()
}
    }
}

class IOStreamAdapter(private val cptr: CPointer<cnames.structs._GIOStreamAdapter>) /* struct */ {
    companion object {
        fun cptr(obj: IOStreamAdapter): CPointer<cnames.structs._GIOStreamAdapter> = obj.cptr
    }
}

class IOStreamClass(private val cptr: CPointer<cnames.structs._GIOStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: IOStreamClass): CPointer<cnames.structs._GIOStreamClass> = obj.cptr
    }
}

typealias IOStreamSpliceFlags = GIOStreamSpliceFlags

interface Icon : InteropWrapper {
    fun deserialize(value: com.charlag.kgtk.demo.glib.Variant): Icon = stub("Icon default impl")

    fun hash(icon: Any): UInt = stub("Icon default impl")

    fun newForString(str: String): Icon = stub("Icon default impl")

    fun equal(icon2: Icon): Boolean = stub("Icon default impl")

    fun serialize(): com.charlag.kgtk.demo.glib.Variant = stub("Icon default impl")

    companion object {
        fun cptr(obj: Icon): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GIcon>) : Icon {
        override val rawPtr: COpaquePointer = cptr
    }
}

class IconIface(private val cptr: CPointer<cnames.structs._GIconIface>) /* struct */ {
    companion object {
        fun cptr(obj: IconIface): CPointer<cnames.structs._GIconIface> = obj.cptr
    }
}

open class InetAddress internal constructor (private val cptr: CPointer<GInetAddress>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun equal(other_address: InetAddress): Boolean {
         return stub()
    }
    open fun getFamily(): SocketFamily {
         return stub()
    }
    open fun getIsAny(): Boolean {
         return stub()
    }
    open fun getIsLinkLocal(): Boolean {
         return stub()
    }
    open fun getIsLoopback(): Boolean {
         return stub()
    }
    open fun getIsMcGlobal(): Boolean {
         return stub()
    }
    open fun getIsMcLinkLocal(): Boolean {
         return stub()
    }
    open fun getIsMcNodeLocal(): Boolean {
         return stub()
    }
    open fun getIsMcOrgLocal(): Boolean {
         return stub()
    }
    open fun getIsMcSiteLocal(): Boolean {
         return stub()
    }
    open fun getIsMulticast(): Boolean {
         return stub()
    }
    open fun getIsSiteLocal(): Boolean {
         return stub()
    }
    open fun getNativeSize(): ULong {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31966624UL
        fun cptr(obj: InetAddress): CPointer<GInetAddress> = obj.cptr
        fun newAny(family: SocketFamily): InetAddress = InetAddress(stub<CPointer<GInetAddress>>()) 
        fun newFromBytes(bytes: List<UByte>, family: SocketFamily): InetAddress = InetAddress(stub<CPointer<GInetAddress>>()) 
        fun newFromString(string: String): InetAddress = InetAddress(stub<CPointer<GInetAddress>>()) 
        fun newLoopback(family: SocketFamily): InetAddress = InetAddress(stub<CPointer<GInetAddress>>()) 
    }
}

class InetAddressClass(private val cptr: CPointer<cnames.structs._GInetAddressClass>) /* struct */ {
    companion object {
        fun cptr(obj: InetAddressClass): CPointer<cnames.structs._GInetAddressClass> = obj.cptr
    }
}

open class InetAddressMask internal constructor (private val cptr: CPointer<GInetAddressMask>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Initable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(addr: InetAddress, length: UInt) : this(stub<CPointer<GInetAddressMask>>())

    open fun equal(mask2: InetAddressMask): Boolean {
         return stub()
    }
    open fun getAddress(): InetAddress {
         return stub()
    }
    open fun getFamily(): SocketFamily {
         return stub()
    }
    open fun getLength(): UInt {
         return stub()
    }
    open fun matches(address: InetAddress): Boolean {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30762928UL
        fun cptr(obj: InetAddressMask): CPointer<GInetAddressMask> = obj.cptr
        fun newFromString(mask_string: String): InetAddressMask = InetAddressMask(stub<CPointer<GInetAddressMask>>()) 
    }
}

class InetAddressMaskClass(private val cptr: CPointer<cnames.structs._GInetAddressMaskClass>) /* struct */ {
    companion object {
        fun cptr(obj: InetAddressMaskClass): CPointer<cnames.structs._GInetAddressMaskClass> = obj.cptr
    }
}

open class InetSocketAddress internal constructor (private val cptr: CPointer<GInetSocketAddress>) : SocketAddress(cptr.reinterpret()), SocketConnectable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(address: InetAddress, port: UShort) : this(stub<CPointer<GInetSocketAddress>>())

    open fun getAddress(): InetAddress {
         return stub()
    }
    open fun getFlowinfo(): UInt {
         return stub()
    }
    open fun getPort(): UShort {
         return stub()
    }
    open fun getScopeId(): UInt {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32212256UL
        fun cptr(obj: InetSocketAddress): CPointer<GInetSocketAddress> = obj.cptr
        fun newFromString(address: String, port: UInt): InetSocketAddress = InetSocketAddress(stub<CPointer<GInetSocketAddress>>()) 
    }
}

class InetSocketAddressClass(private val cptr: CPointer<cnames.structs._GInetSocketAddressClass>) /* struct */ {
    companion object {
        fun cptr(obj: InetSocketAddressClass): CPointer<cnames.structs._GInetSocketAddressClass> = obj.cptr
    }
}

interface Initable : InteropWrapper {
    fun init(cancellable: Cancellable): Boolean = stub("Initable default impl")

    companion object {
        fun cptr(obj: Initable): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GInitable>) : Initable {
        override val rawPtr: COpaquePointer = cptr
    }
}

class InitableIface(private val cptr: CPointer<cnames.structs._GInitableIface>) /* struct */ {
    companion object {
        fun cptr(obj: InitableIface): CPointer<cnames.structs._GInitableIface> = obj.cptr
    }
}

class InputMessage(private val cptr: CPointer<cnames.structs._GInputMessage>) /* struct */ {
    companion object {
        fun cptr(obj: InputMessage): CPointer<cnames.structs._GInputMessage> = obj.cptr
    }
}

open class InputStream internal constructor (private val cptr: CPointer<GInputStream>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun clearPending(): Unit {
         return stub()
    }
    open fun close(cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun closeAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun closeFinish(result: AsyncResult): Boolean {
         return stub()
    }
    open fun hasPending(): Boolean {
         return stub()
    }
    open fun isClosed(): Boolean {
         return stub()
    }
    open fun read(buffer: List<UByte>, count: ULong, cancellable: Cancellable): Long {
         return stub()
    }
    open fun readAll(buffer: List<UByte>, count: ULong, bytes_read: ULong, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun readAllAsync(buffer: List<UByte>, count: ULong, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun readAllFinish(result: AsyncResult, bytes_read: ULong): Boolean {
         return stub()
    }
    open fun readAsync(buffer: List<UByte>, count: ULong, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun readBytes(count: ULong, cancellable: Cancellable): com.charlag.kgtk.demo.glib.Bytes {
         return stub()
    }
    open fun readBytesAsync(count: ULong, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun readBytesFinish(result: AsyncResult): com.charlag.kgtk.demo.glib.Bytes {
         return stub()
    }
    open fun readFinish(result: AsyncResult): Long {
         return stub()
    }
    open fun setPending(): Boolean {
         return stub()
    }
    open fun skip(count: ULong, cancellable: Cancellable): Long {
         return stub()
    }
    open fun skipAsync(count: ULong, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun skipFinish(result: AsyncResult): Long {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33038624UL
        fun cptr(obj: InputStream): CPointer<GInputStream> = obj.cptr
    }
}

class InputStreamClass(private val cptr: CPointer<cnames.structs._GInputStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: InputStreamClass): CPointer<cnames.structs._GInputStreamClass> = obj.cptr
    }
}

class InputVector(private val cptr: CPointer<cnames.structs._GInputVector>) /* struct */ {
    companion object {
        fun cptr(obj: InputVector): CPointer<cnames.structs._GInputVector> = obj.cptr
    }
}

interface ListModel : InteropWrapper {
    fun getItemType(): GType = stub("ListModel default impl")

    fun getNItems(): UInt = stub("ListModel default impl")

    fun getItem(position: UInt): com.charlag.kgtk.demo.gobject.Object = stub("ListModel default impl")

    fun itemsChanged(position: UInt, removed: UInt, added: UInt): Unit = stub("ListModel default impl")

    companion object {
        fun cptr(obj: ListModel): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GListModel>) : ListModel {
        override val rawPtr: COpaquePointer = cptr
    }
}

class ListModelInterface(private val cptr: CPointer<cnames.structs._GListModelInterface>) /* struct */ {
    companion object {
        fun cptr(obj: ListModelInterface): CPointer<cnames.structs._GListModelInterface> = obj.cptr
    }
}

open class ListStore internal constructor (private val cptr: CPointer<GListStore>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), ListModel, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(item_type: GType) : this(stub<CPointer<GListStore>>())

    open fun append(item: com.charlag.kgtk.demo.gobject.Object): Unit {
         return stub()
    }
    open fun find(item: com.charlag.kgtk.demo.gobject.Object, position: UInt): Boolean {
         return stub()
    }
    open fun findWithEqualFunc(item: com.charlag.kgtk.demo.gobject.Object, equal_func: com.charlag.kgtk.demo.glib.EqualFunc, position: UInt): Boolean {
         return stub()
    }
    open fun insert(position: UInt, item: com.charlag.kgtk.demo.gobject.Object): Unit {
         return stub()
    }
    open fun insertSorted(item: com.charlag.kgtk.demo.gobject.Object, compare_func: com.charlag.kgtk.demo.glib.CompareDataFunc, user_data: Any): UInt {
         return stub()
    }
    open fun remove(position: UInt): Unit {
         return stub()
    }
    open fun removeAll(): Unit {
         return stub()
    }
    open fun sort(compare_func: com.charlag.kgtk.demo.glib.CompareDataFunc, user_data: Any): Unit {
         return stub()
    }
    open fun splice(position: UInt, n_removals: UInt, additions: List<com.charlag.kgtk.demo.gobject.Object>, n_additions: UInt): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33810752UL
        fun cptr(obj: ListStore): CPointer<GListStore> = obj.cptr
    }
}

class ListStoreClass(private val cptr: CPointer<cnames.structs._GListStoreClass>) /* struct */ {
    companion object {
        fun cptr(obj: ListStoreClass): CPointer<cnames.structs._GListStoreClass> = obj.cptr
    }
}

interface LoadableIcon : Icon, InteropWrapper {
    fun load(size: Int, type: String, cancellable: Cancellable): InputStream = stub("LoadableIcon default impl")

    fun loadAsync(size: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("LoadableIcon default impl")

    fun loadFinish(res: AsyncResult, type: String): InputStream = stub("LoadableIcon default impl")

    companion object {
        fun cptr(obj: LoadableIcon): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GLoadableIcon>) : LoadableIcon {
        override val rawPtr: COpaquePointer = cptr
    }
}

class LoadableIconIface(private val cptr: CPointer<cnames.structs._GLoadableIconIface>) /* struct */ {
    companion object {
        fun cptr(obj: LoadableIconIface): CPointer<cnames.structs._GLoadableIconIface> = obj.cptr
    }
}

val MEMORY_MONITOR_EXTENSION_POINT_NAME: String get() = TODO()

val MENU_ATTRIBUTE_ACTION: String get() = TODO()

val MENU_ATTRIBUTE_ACTION_NAMESPACE: String get() = TODO()

val MENU_ATTRIBUTE_ICON: String get() = TODO()

val MENU_ATTRIBUTE_LABEL: String get() = TODO()

val MENU_ATTRIBUTE_TARGET: String get() = TODO()

val MENU_LINK_SECTION: String get() = TODO()

val MENU_LINK_SUBMENU: String get() = TODO()

open class MemoryInputStream internal constructor (private val cptr: CPointer<GMemoryInputStream>) : InputStream(cptr.reinterpret()), PollableInputStream, Seekable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GMemoryInputStream>>())

    open fun addBytes(bytes: com.charlag.kgtk.demo.glib.Bytes): Unit {
         return stub()
    }
    open fun addData(data: List<UByte>, len: Long, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32147024UL
        fun cptr(obj: MemoryInputStream): CPointer<GMemoryInputStream> = obj.cptr
        fun newFromBytes(bytes: com.charlag.kgtk.demo.glib.Bytes): MemoryInputStream = MemoryInputStream(stub<CPointer<GMemoryInputStream>>()) 
        fun newFromData(data: List<UByte>, len: Long, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): MemoryInputStream = MemoryInputStream(stub<CPointer<GMemoryInputStream>>()) 
    }
}

class MemoryInputStreamClass(private val cptr: CPointer<cnames.structs._GMemoryInputStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: MemoryInputStreamClass): CPointer<cnames.structs._GMemoryInputStreamClass> = obj.cptr
    }
}

interface MemoryMonitor : Initable, InteropWrapper {
    fun dupDefault(): MemoryMonitor = stub("MemoryMonitor default impl")

    companion object {
        fun cptr(obj: MemoryMonitor): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GMemoryMonitor>) : MemoryMonitor {
        override val rawPtr: COpaquePointer = cptr
    }
}

class MemoryMonitorInterface(private val cptr: CPointer<cnames.structs._GMemoryMonitorInterface>) /* struct */ {
    companion object {
        fun cptr(obj: MemoryMonitorInterface): CPointer<cnames.structs._GMemoryMonitorInterface> = obj.cptr
    }
}

typealias MemoryMonitorWarningLevel = GMemoryMonitorWarningLevel

open class MemoryOutputStream internal constructor (private val cptr: CPointer<GMemoryOutputStream>) : OutputStream(cptr.reinterpret()), PollableOutputStream, Seekable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getData(): Any {
         return stub()
    }
    open fun getDataSize(): ULong {
         return stub()
    }
    open fun getSize(): ULong {
         return stub()
    }
    open fun stealAsBytes(): com.charlag.kgtk.demo.glib.Bytes {
         return stub()
    }
    open fun stealData(): Any {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30909488UL
        fun cptr(obj: MemoryOutputStream): CPointer<GMemoryOutputStream> = obj.cptr
        fun newResizable(): MemoryOutputStream = MemoryOutputStream(stub<CPointer<GMemoryOutputStream>>()) 
    }
}

class MemoryOutputStreamClass(private val cptr: CPointer<cnames.structs._GMemoryOutputStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: MemoryOutputStreamClass): CPointer<cnames.structs._GMemoryOutputStreamClass> = obj.cptr
    }
}

open class Menu internal constructor (private val cptr: CPointer<GMenu>) : MenuModel(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GMenu>>())

    open fun append(label: String, detailed_action: String): Unit {
         return stub()
    }
    open fun appendItem(item: MenuItem): Unit {
         return stub()
    }
    open fun appendSection(label: String, section: MenuModel): Unit {
         return stub()
    }
    open fun appendSubmenu(label: String, submenu: MenuModel): Unit {
         return stub()
    }
    open fun freeze(): Unit {
         return stub()
    }
    open fun insert(position: Int, label: String, detailed_action: String): Unit {
         return stub()
    }
    open fun insertItem(position: Int, item: MenuItem): Unit {
         return stub()
    }
    open fun insertSection(position: Int, label: String, section: MenuModel): Unit {
         return stub()
    }
    open fun insertSubmenu(position: Int, label: String, submenu: MenuModel): Unit {
         return stub()
    }
    open fun prepend(label: String, detailed_action: String): Unit {
         return stub()
    }
    open fun prependItem(item: MenuItem): Unit {
         return stub()
    }
    open fun prependSection(label: String, section: MenuModel): Unit {
         return stub()
    }
    open fun prependSubmenu(label: String, submenu: MenuModel): Unit {
         return stub()
    }
    open fun remove(position: Int): Unit {
         return stub()
    }
    open fun removeAll(): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32546384UL
        fun cptr(obj: Menu): CPointer<GMenu> = obj.cptr
    }
}

open class MenuAttributeIter internal constructor (private val cptr: CPointer<GMenuAttributeIter>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getName(): String {
         return stub()
    }
    open fun getNext(out_name: String, value: com.charlag.kgtk.demo.glib.Variant): Boolean {
         return stub()
    }
    open fun getValue(): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun next(): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31626704UL
        fun cptr(obj: MenuAttributeIter): CPointer<GMenuAttributeIter> = obj.cptr
    }
}

class MenuAttributeIterClass(private val cptr: CPointer<cnames.structs._GMenuAttributeIterClass>) /* struct */ {
    companion object {
        fun cptr(obj: MenuAttributeIterClass): CPointer<cnames.structs._GMenuAttributeIterClass> = obj.cptr
    }
}

open class MenuItem internal constructor (private val cptr: CPointer<GMenuItem>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(label: String, detailed_action: String) : this(stub<CPointer<GMenuItem>>())

    open fun getAttributeValue(attribute: String, expected_type: com.charlag.kgtk.demo.glib.VariantType): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun getLink(link: String): MenuModel {
         return stub()
    }
    open fun setActionAndTargetValue(action: String, target_value: com.charlag.kgtk.demo.glib.Variant): Unit {
         return stub()
    }
    open fun setAttributeValue(attribute: String, value: com.charlag.kgtk.demo.glib.Variant): Unit {
         return stub()
    }
    open fun setDetailedAction(detailed_action: String): Unit {
         return stub()
    }
    open fun setIcon(icon: Icon): Unit {
         return stub()
    }
    open fun setLabel(label: String): Unit {
         return stub()
    }
    open fun setLink(link: String, model: MenuModel): Unit {
         return stub()
    }
    open fun setSection(section: MenuModel): Unit {
         return stub()
    }
    open fun setSubmenu(submenu: MenuModel): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31765920UL
        fun cptr(obj: MenuItem): CPointer<GMenuItem> = obj.cptr
        fun newFromModel(model: MenuModel, item_index: Int): MenuItem = MenuItem(stub<CPointer<GMenuItem>>()) 
        fun newSection(label: String, section: MenuModel): MenuItem = MenuItem(stub<CPointer<GMenuItem>>()) 
        fun newSubmenu(label: String, submenu: MenuModel): MenuItem = MenuItem(stub<CPointer<GMenuItem>>()) 
    }
}

open class MenuLinkIter internal constructor (private val cptr: CPointer<GMenuLinkIter>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getName(): String {
         return stub()
    }
    open fun getNext(out_link: String, value: MenuModel): Boolean {
         return stub()
    }
    open fun getValue(): MenuModel {
         return stub()
    }
    open fun next(): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31358192UL
        fun cptr(obj: MenuLinkIter): CPointer<GMenuLinkIter> = obj.cptr
    }
}

class MenuLinkIterClass(private val cptr: CPointer<cnames.structs._GMenuLinkIterClass>) /* struct */ {
    companion object {
        fun cptr(obj: MenuLinkIterClass): CPointer<cnames.structs._GMenuLinkIterClass> = obj.cptr
    }
}

open class MenuModel internal constructor (private val cptr: CPointer<GMenuModel>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getItemAttributeValue(item_index: Int, attribute: String, expected_type: com.charlag.kgtk.demo.glib.VariantType): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun getItemLink(item_index: Int, link: String): MenuModel {
         return stub()
    }
    open fun getNItems(): Int {
         return stub()
    }
    open fun isMutable(): Boolean {
         return stub()
    }
    open fun itemsChanged(position: Int, removed: Int, added: Int): Unit {
         return stub()
    }
    open fun iterateItemAttributes(item_index: Int): MenuAttributeIter {
         return stub()
    }
    open fun iterateItemLinks(item_index: Int): MenuLinkIter {
         return stub()
    }
    fun setOnItemsChanged(cb: () -> Unit) {
        do_connect(cptr, "items-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31429312UL
        fun cptr(obj: MenuModel): CPointer<GMenuModel> = obj.cptr
    }
}

class MenuModelClass(private val cptr: CPointer<cnames.structs._GMenuModelClass>) /* struct */ {
    companion object {
        fun cptr(obj: MenuModelClass): CPointer<cnames.structs._GMenuModelClass> = obj.cptr
    }
}

interface Mount : InteropWrapper {
    fun canEject(): Boolean = stub("Mount default impl")

    fun canUnmount(): Boolean = stub("Mount default impl")

    fun ejectWithOperation(flags: MountUnmountFlags, mount_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("Mount default impl")

    fun ejectWithOperationFinish(result: AsyncResult): Boolean = stub("Mount default impl")

    fun getDefaultLocation(): File = stub("Mount default impl")

    fun getDrive(): Drive = stub("Mount default impl")

    fun getIcon(): Icon = stub("Mount default impl")

    fun getName(): String = stub("Mount default impl")

    fun getRoot(): File = stub("Mount default impl")

    fun getSortKey(): String = stub("Mount default impl")

    fun getSymbolicIcon(): Icon = stub("Mount default impl")

    fun getUuid(): String = stub("Mount default impl")

    fun getVolume(): Volume = stub("Mount default impl")

    fun guessContentType(force_rescan: Boolean, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("Mount default impl")

    fun guessContentTypeFinish(result: AsyncResult): List<String> = stub("Mount default impl")

    fun guessContentTypeSync(force_rescan: Boolean, cancellable: Cancellable): List<String> = stub("Mount default impl")

    fun isShadowed(): Boolean = stub("Mount default impl")

    fun remount(flags: MountMountFlags, mount_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("Mount default impl")

    fun remountFinish(result: AsyncResult): Boolean = stub("Mount default impl")

    fun shadow(): Unit = stub("Mount default impl")

    fun unmountWithOperation(flags: MountUnmountFlags, mount_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("Mount default impl")

    fun unmountWithOperationFinish(result: AsyncResult): Boolean = stub("Mount default impl")

    fun unshadow(): Unit = stub("Mount default impl")

    companion object {
        fun cptr(obj: Mount): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GMount>) : Mount {
        override val rawPtr: COpaquePointer = cptr
    }
}

class MountIface(private val cptr: CPointer<cnames.structs._GMountIface>) /* struct */ {
    companion object {
        fun cptr(obj: MountIface): CPointer<cnames.structs._GMountIface> = obj.cptr
    }
}

typealias MountMountFlags = GMountMountFlags

open class MountOperation internal constructor (private val cptr: CPointer<GMountOperation>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GMountOperation>>())

    open fun getAnonymous(): Boolean {
         return stub()
    }
    open fun getChoice(): Int {
         return stub()
    }
    open fun getDomain(): String {
         return stub()
    }
    open fun getIsTcryptHiddenVolume(): Boolean {
         return stub()
    }
    open fun getIsTcryptSystemVolume(): Boolean {
         return stub()
    }
    open fun getPassword(): String {
         return stub()
    }
    open fun getPasswordSave(): PasswordSave {
         return stub()
    }
    open fun getPim(): UInt {
         return stub()
    }
    open fun getUsername(): String {
         return stub()
    }
    open fun reply(result: MountOperationResult): Unit {
         return stub()
    }
    open fun setAnonymous(anonymous: Boolean): Unit {
         return stub()
    }
    open fun setChoice(choice: Int): Unit {
         return stub()
    }
    open fun setDomain(domain: String): Unit {
         return stub()
    }
    open fun setIsTcryptHiddenVolume(hidden_volume: Boolean): Unit {
         return stub()
    }
    open fun setIsTcryptSystemVolume(system_volume: Boolean): Unit {
         return stub()
    }
    open fun setPassword(password: String): Unit {
         return stub()
    }
    open fun setPasswordSave(save: PasswordSave): Unit {
         return stub()
    }
    open fun setPim(pim: UInt): Unit {
         return stub()
    }
    open fun setUsername(username: String): Unit {
         return stub()
    }
    fun setOnAborted(cb: () -> Unit) {
        do_connect(cptr, "aborted", cb)
    }

    fun setOnAskPassword(cb: () -> Unit) {
        do_connect(cptr, "ask-password", cb)
    }

    fun setOnAskQuestion(cb: () -> Unit) {
        do_connect(cptr, "ask-question", cb)
    }

    fun setOnReply(cb: () -> Unit) {
        do_connect(cptr, "reply", cb)
    }

    fun setOnShowProcesses(cb: () -> Unit) {
        do_connect(cptr, "show-processes", cb)
    }

    fun setOnShowUnmountProgress(cb: () -> Unit) {
        do_connect(cptr, "show-unmount-progress", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31857664UL
        fun cptr(obj: MountOperation): CPointer<GMountOperation> = obj.cptr
    }
}

class MountOperationClass(private val cptr: CPointer<cnames.structs._GMountOperationClass>) /* struct */ {
    companion object {
        fun cptr(obj: MountOperationClass): CPointer<cnames.structs._GMountOperationClass> = obj.cptr
    }
}

typealias MountOperationResult = GMountOperationResult

typealias MountUnmountFlags = GMountUnmountFlags

val NATIVE_VOLUME_MONITOR_EXTENSION_POINT_NAME: String get() = TODO()

val NETWORK_MONITOR_EXTENSION_POINT_NAME: String get() = TODO()

open class NativeSocketAddress internal constructor (private val cptr: CPointer<GNativeSocketAddress>) : SocketAddress(cptr.reinterpret()), SocketConnectable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(native: Any, len: ULong) : this(stub<CPointer<GNativeSocketAddress>>())

    companion object {
        const val G_TYPE: gtk3.GType = 35742768UL
        fun cptr(obj: NativeSocketAddress): CPointer<GNativeSocketAddress> = obj.cptr
    }
}

class NativeSocketAddressClass(private val cptr: CPointer<cnames.structs._GNativeSocketAddressClass>) /* struct */ {
    companion object {
        fun cptr(obj: NativeSocketAddressClass): CPointer<cnames.structs._GNativeSocketAddressClass> = obj.cptr
    }
}

open class NativeVolumeMonitor internal constructor (private val cptr: CPointer<GNativeVolumeMonitor>) : VolumeMonitor(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 31484160UL
        fun cptr(obj: NativeVolumeMonitor): CPointer<GNativeVolumeMonitor> = obj.cptr
    }
}

class NativeVolumeMonitorClass(private val cptr: CPointer<cnames.structs._GNativeVolumeMonitorClass>) /* struct */ {
    companion object {
        fun cptr(obj: NativeVolumeMonitorClass): CPointer<cnames.structs._GNativeVolumeMonitorClass> = obj.cptr
    }
}

open class NetworkAddress internal constructor (private val cptr: CPointer<GNetworkAddress>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), SocketConnectable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(hostname: String, port: UShort) : this(stub<CPointer<GNetworkAddress>>())

    open fun getHostname(): String {
         return stub()
    }
    open fun getPort(): UShort {
         return stub()
    }
    open fun getScheme(): String {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 38235920UL
        fun cptr(obj: NetworkAddress): CPointer<GNetworkAddress> = obj.cptr
        fun newLoopback(port: UShort): NetworkAddress = NetworkAddress(stub<CPointer<GNetworkAddress>>()) 
        fun parse(host_and_port: String, default_port: UShort): NetworkAddress {
    return stub()
}
        fun parseUri(uri: String, default_port: UShort): NetworkAddress {
    return stub()
}
    }
}

class NetworkAddressClass(private val cptr: CPointer<cnames.structs._GNetworkAddressClass>) /* struct */ {
    companion object {
        fun cptr(obj: NetworkAddressClass): CPointer<cnames.structs._GNetworkAddressClass> = obj.cptr
    }
}

typealias NetworkConnectivity = GNetworkConnectivity

interface NetworkMonitor : Initable, InteropWrapper {
    fun getDefault(): NetworkMonitor = stub("NetworkMonitor default impl")

    fun canReach(connectable: SocketConnectable, cancellable: Cancellable): Boolean = stub("NetworkMonitor default impl")

    fun canReachAsync(connectable: SocketConnectable, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("NetworkMonitor default impl")

    fun canReachFinish(result: AsyncResult): Boolean = stub("NetworkMonitor default impl")

    fun getConnectivity(): NetworkConnectivity = stub("NetworkMonitor default impl")

    fun getNetworkAvailable(): Boolean = stub("NetworkMonitor default impl")

    fun getNetworkMetered(): Boolean = stub("NetworkMonitor default impl")

    companion object {
        fun cptr(obj: NetworkMonitor): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GNetworkMonitor>) : NetworkMonitor {
        override val rawPtr: COpaquePointer = cptr
    }
}

class NetworkMonitorInterface(private val cptr: CPointer<cnames.structs._GNetworkMonitorInterface>) /* struct */ {
    companion object {
        fun cptr(obj: NetworkMonitorInterface): CPointer<cnames.structs._GNetworkMonitorInterface> = obj.cptr
    }
}

open class NetworkService internal constructor (private val cptr: CPointer<GNetworkService>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), SocketConnectable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(service: String, protocol: String, domain: String) : this(stub<CPointer<GNetworkService>>())

    open fun getDomain(): String {
         return stub()
    }
    open fun getProtocol(): String {
         return stub()
    }
    open fun getScheme(): String {
         return stub()
    }
    open fun getService(): String {
         return stub()
    }
    open fun setScheme(scheme: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31557024UL
        fun cptr(obj: NetworkService): CPointer<GNetworkService> = obj.cptr
    }
}

class NetworkServiceClass(private val cptr: CPointer<cnames.structs._GNetworkServiceClass>) /* struct */ {
    companion object {
        fun cptr(obj: NetworkServiceClass): CPointer<cnames.structs._GNetworkServiceClass> = obj.cptr
    }
}

open class Notification internal constructor (private val cptr: CPointer<GNotification>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(title: String) : this(stub<CPointer<GNotification>>())

    open fun addButton(label: String, detailed_action: String): Unit {
         return stub()
    }
    open fun addButtonWithTarget(label: String, action: String, target: com.charlag.kgtk.demo.glib.Variant): Unit {
         return stub()
    }
    open fun setBody(body: String): Unit {
         return stub()
    }
    open fun setDefaultAction(detailed_action: String): Unit {
         return stub()
    }
    open fun setDefaultActionAndTarget(action: String, target: com.charlag.kgtk.demo.glib.Variant): Unit {
         return stub()
    }
    open fun setIcon(icon: Icon): Unit {
         return stub()
    }
    open fun setPriority(priority: NotificationPriority): Unit {
         return stub()
    }
    open fun setTitle(title: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32631376UL
        fun cptr(obj: Notification): CPointer<GNotification> = obj.cptr
    }
}

typealias NotificationPriority = GNotificationPriority

class OutputMessage(private val cptr: CPointer<cnames.structs._GOutputMessage>) /* struct */ {
    companion object {
        fun cptr(obj: OutputMessage): CPointer<cnames.structs._GOutputMessage> = obj.cptr
    }
}

open class OutputStream internal constructor (private val cptr: CPointer<GOutputStream>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun clearPending(): Unit {
         return stub()
    }
    open fun close(cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun closeAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun closeFinish(result: AsyncResult): Boolean {
         return stub()
    }
    open fun flush(cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun flushAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun flushFinish(result: AsyncResult): Boolean {
         return stub()
    }
    open fun hasPending(): Boolean {
         return stub()
    }
    open fun isClosed(): Boolean {
         return stub()
    }
    open fun isClosing(): Boolean {
         return stub()
    }
    open fun setPending(): Boolean {
         return stub()
    }
    open fun splice(source: InputStream, flags: OutputStreamSpliceFlags, cancellable: Cancellable): Long {
         return stub()
    }
    open fun spliceAsync(source: InputStream, flags: OutputStreamSpliceFlags, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun spliceFinish(result: AsyncResult): Long {
         return stub()
    }
    open fun write(buffer: List<UByte>, count: ULong, cancellable: Cancellable): Long {
         return stub()
    }
    open fun writeAll(buffer: List<UByte>, count: ULong, bytes_written: ULong, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun writeAllAsync(buffer: List<UByte>, count: ULong, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun writeAllFinish(result: AsyncResult, bytes_written: ULong): Boolean {
         return stub()
    }
    open fun writeAsync(buffer: List<UByte>, count: ULong, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun writeBytes(bytes: com.charlag.kgtk.demo.glib.Bytes, cancellable: Cancellable): Long {
         return stub()
    }
    open fun writeBytesAsync(bytes: com.charlag.kgtk.demo.glib.Bytes, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun writeBytesFinish(result: AsyncResult): Long {
         return stub()
    }
    open fun writeFinish(result: AsyncResult): Long {
         return stub()
    }
    open fun writev(vectors: List<OutputVector>, n_vectors: ULong, bytes_written: ULong, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun writevAll(vectors: List<OutputVector>, n_vectors: ULong, bytes_written: ULong, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun writevAllAsync(vectors: List<OutputVector>, n_vectors: ULong, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun writevAllFinish(result: AsyncResult, bytes_written: ULong): Boolean {
         return stub()
    }
    open fun writevAsync(vectors: List<OutputVector>, n_vectors: ULong, io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun writevFinish(result: AsyncResult, bytes_written: ULong): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31911168UL
        fun cptr(obj: OutputStream): CPointer<GOutputStream> = obj.cptr
    }
}

class OutputStreamClass(private val cptr: CPointer<cnames.structs._GOutputStreamClass>) /* struct */ {
    companion object {
        fun cptr(obj: OutputStreamClass): CPointer<cnames.structs._GOutputStreamClass> = obj.cptr
    }
}

typealias OutputStreamSpliceFlags = GOutputStreamSpliceFlags

class OutputVector(private val cptr: CPointer<cnames.structs._GOutputVector>) /* struct */ {
    companion object {
        fun cptr(obj: OutputVector): CPointer<cnames.structs._GOutputVector> = obj.cptr
    }
}

val PROXY_EXTENSION_POINT_NAME: String get() = TODO()

val PROXY_RESOLVER_EXTENSION_POINT_NAME: String get() = TODO()

typealias PasswordSave = GPasswordSave

open class Permission internal constructor (private val cptr: CPointer<GPermission>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun acquire(cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun acquireAsync(cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun acquireFinish(result: AsyncResult): Boolean {
         return stub()
    }
    open fun getAllowed(): Boolean {
         return stub()
    }
    open fun getCanAcquire(): Boolean {
         return stub()
    }
    open fun getCanRelease(): Boolean {
         return stub()
    }
    open fun implUpdate(allowed: Boolean, can_acquire: Boolean, can_release: Boolean): Unit {
         return stub()
    }
    open fun release(cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun releaseAsync(cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun releaseFinish(result: AsyncResult): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31291904UL
        fun cptr(obj: Permission): CPointer<GPermission> = obj.cptr
    }
}

class PermissionClass(private val cptr: CPointer<cnames.structs._GPermissionClass>) /* struct */ {
    companion object {
        fun cptr(obj: PermissionClass): CPointer<cnames.structs._GPermissionClass> = obj.cptr
    }
}

interface PollableInputStream : InteropWrapper {
    fun canPoll(): Boolean = stub("PollableInputStream default impl")

    fun createSource(cancellable: Cancellable): com.charlag.kgtk.demo.glib.Source = stub("PollableInputStream default impl")

    fun isReadable(): Boolean = stub("PollableInputStream default impl")

    fun readNonblocking(buffer: List<UByte>, count: ULong, cancellable: Cancellable): Long = stub("PollableInputStream default impl")

    companion object {
        fun cptr(obj: PollableInputStream): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GPollableInputStream>) : PollableInputStream {
        override val rawPtr: COpaquePointer = cptr
    }
}

class PollableInputStreamInterface(private val cptr: CPointer<cnames.structs._GPollableInputStreamInterface>) /* struct */ {
    companion object {
        fun cptr(obj: PollableInputStreamInterface): CPointer<cnames.structs._GPollableInputStreamInterface> = obj.cptr
    }
}

interface PollableOutputStream : InteropWrapper {
    fun canPoll(): Boolean = stub("PollableOutputStream default impl")

    fun createSource(cancellable: Cancellable): com.charlag.kgtk.demo.glib.Source = stub("PollableOutputStream default impl")

    fun isWritable(): Boolean = stub("PollableOutputStream default impl")

    fun writeNonblocking(buffer: List<UByte>, count: ULong, cancellable: Cancellable): Long = stub("PollableOutputStream default impl")

    fun writevNonblocking(vectors: List<OutputVector>, n_vectors: ULong, bytes_written: ULong, cancellable: Cancellable): PollableReturn = stub("PollableOutputStream default impl")

    companion object {
        fun cptr(obj: PollableOutputStream): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GPollableOutputStream>) : PollableOutputStream {
        override val rawPtr: COpaquePointer = cptr
    }
}

class PollableOutputStreamInterface(private val cptr: CPointer<cnames.structs._GPollableOutputStreamInterface>) /* struct */ {
    companion object {
        fun cptr(obj: PollableOutputStreamInterface): CPointer<cnames.structs._GPollableOutputStreamInterface> = obj.cptr
    }
}

typealias PollableReturn = GPollableReturn

typealias PollableSourceFunc = (pollable_stream:  com.charlag.kgtk.demo.gobject.Object, user_data:  Any) -> Boolean

open class PropertyAction internal constructor (private val cptr: CPointer<GPropertyAction>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Action, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(`name`: String, `object`: com.charlag.kgtk.demo.gobject.Object, property_name: String) : this(stub<CPointer<GPropertyAction>>())

    companion object {
        const val G_TYPE: gtk3.GType = 31022704UL
        fun cptr(obj: PropertyAction): CPointer<GPropertyAction> = obj.cptr
    }
}

interface Proxy : InteropWrapper {
    fun getDefaultForProtocol(protocol: String): Proxy = stub("Proxy default impl")

    fun connect(connection: IOStream, proxy_address: ProxyAddress, cancellable: Cancellable): IOStream = stub("Proxy default impl")

    fun connectAsync(connection: IOStream, proxy_address: ProxyAddress, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("Proxy default impl")

    fun connectFinish(result: AsyncResult): IOStream = stub("Proxy default impl")

    fun supportsHostname(): Boolean = stub("Proxy default impl")

    companion object {
        fun cptr(obj: Proxy): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GProxy>) : Proxy {
        override val rawPtr: COpaquePointer = cptr
    }
}

open class ProxyAddress internal constructor (private val cptr: CPointer<GProxyAddress>) : InetSocketAddress(cptr.reinterpret()), SocketConnectable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(inetaddr: InetAddress, port: UShort, protocol: String, dest_hostname: String, dest_port: UShort, username: String, password: String) : this(stub<CPointer<GProxyAddress>>())

    open fun getDestinationHostname(): String {
         return stub()
    }
    open fun getDestinationPort(): UShort {
         return stub()
    }
    open fun getDestinationProtocol(): String {
         return stub()
    }
    open fun getPassword(): String {
         return stub()
    }
    open fun getProtocol(): String {
         return stub()
    }
    open fun getUri(): String {
         return stub()
    }
    open fun getUsername(): String {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30816592UL
        fun cptr(obj: ProxyAddress): CPointer<GProxyAddress> = obj.cptr
    }
}

class ProxyAddressClass(private val cptr: CPointer<cnames.structs._GProxyAddressClass>) /* struct */ {
    companion object {
        fun cptr(obj: ProxyAddressClass): CPointer<cnames.structs._GProxyAddressClass> = obj.cptr
    }
}

open class ProxyAddressEnumerator internal constructor (private val cptr: CPointer<GProxyAddressEnumerator>) : SocketAddressEnumerator(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 36925584UL
        fun cptr(obj: ProxyAddressEnumerator): CPointer<GProxyAddressEnumerator> = obj.cptr
    }
}

class ProxyAddressEnumeratorClass(private val cptr: CPointer<cnames.structs._GProxyAddressEnumeratorClass>) /* struct */ {
    companion object {
        fun cptr(obj: ProxyAddressEnumeratorClass): CPointer<cnames.structs._GProxyAddressEnumeratorClass> = obj.cptr
    }
}

class ProxyInterface(private val cptr: CPointer<cnames.structs._GProxyInterface>) /* struct */ {
    companion object {
        fun cptr(obj: ProxyInterface): CPointer<cnames.structs._GProxyInterface> = obj.cptr
    }
}

interface ProxyResolver : InteropWrapper {
    fun getDefault(): ProxyResolver = stub("ProxyResolver default impl")

    fun isSupported(): Boolean = stub("ProxyResolver default impl")

    fun lookup(uri: String, cancellable: Cancellable): List<String> = stub("ProxyResolver default impl")

    fun lookupAsync(uri: String, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("ProxyResolver default impl")

    fun lookupFinish(result: AsyncResult): List<String> = stub("ProxyResolver default impl")

    companion object {
        fun cptr(obj: ProxyResolver): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GProxyResolver>) : ProxyResolver {
        override val rawPtr: COpaquePointer = cptr
    }
}

class ProxyResolverInterface(private val cptr: CPointer<cnames.structs._GProxyResolverInterface>) /* struct */ {
    companion object {
        fun cptr(obj: ProxyResolverInterface): CPointer<cnames.structs._GProxyResolverInterface> = obj.cptr
    }
}

typealias ReallocFunc = (data:  Any, size:  ULong) -> Any

interface RemoteActionGroup : ActionGroup, InteropWrapper {
    fun activateActionFull(action_name: String, parameter: com.charlag.kgtk.demo.glib.Variant, platform_data: com.charlag.kgtk.demo.glib.Variant): Unit = stub("RemoteActionGroup default impl")

    fun changeActionStateFull(action_name: String, value: com.charlag.kgtk.demo.glib.Variant, platform_data: com.charlag.kgtk.demo.glib.Variant): Unit = stub("RemoteActionGroup default impl")

    companion object {
        fun cptr(obj: RemoteActionGroup): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GRemoteActionGroup>) : RemoteActionGroup {
        override val rawPtr: COpaquePointer = cptr
    }
}

class RemoteActionGroupInterface(private val cptr: CPointer<cnames.structs._GRemoteActionGroupInterface>) /* struct */ {
    companion object {
        fun cptr(obj: RemoteActionGroupInterface): CPointer<cnames.structs._GRemoteActionGroupInterface> = obj.cptr
    }
}

open class Resolver internal constructor (private val cptr: CPointer<GResolver>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun lookupByAddress(address: InetAddress, cancellable: Cancellable): String {
         return stub()
    }
    open fun lookupByAddressAsync(address: InetAddress, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun lookupByAddressFinish(result: AsyncResult): String {
         return stub()
    }
    open fun lookupByName(hostname: String, cancellable: Cancellable): List<InetAddress> {
         return stub()
    }
    open fun lookupByNameAsync(hostname: String, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun lookupByNameFinish(result: AsyncResult): List<InetAddress> {
         return stub()
    }
    open fun lookupByNameWithFlags(hostname: String, flags: ResolverNameLookupFlags, cancellable: Cancellable): List<InetAddress> {
         return stub()
    }
    open fun lookupByNameWithFlagsAsync(hostname: String, flags: ResolverNameLookupFlags, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun lookupByNameWithFlagsFinish(result: AsyncResult): List<InetAddress> {
         return stub()
    }
    open fun lookupRecords(rrname: String, record_type: ResolverRecordType, cancellable: Cancellable): List<com.charlag.kgtk.demo.glib.Variant> {
         return stub()
    }
    open fun lookupRecordsAsync(rrname: String, record_type: ResolverRecordType, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun lookupRecordsFinish(result: AsyncResult): List<com.charlag.kgtk.demo.glib.Variant> {
         return stub()
    }
    open fun lookupService(service: String, protocol: String, domain: String, cancellable: Cancellable): List<SrvTarget> {
         return stub()
    }
    open fun lookupServiceAsync(service: String, protocol: String, domain: String, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun lookupServiceFinish(result: AsyncResult): List<SrvTarget> {
         return stub()
    }
    open fun setDefault(): Unit {
         return stub()
    }
    fun setOnReload(cb: () -> Unit) {
        do_connect(cptr, "reload", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32696128UL
        fun cptr(obj: Resolver): CPointer<GResolver> = obj.cptr
        fun getDefault(): Resolver {
    return stub()
}
    }
}

class ResolverClass(private val cptr: CPointer<cnames.structs._GResolverClass>) /* struct */ {
    companion object {
        fun cptr(obj: ResolverClass): CPointer<cnames.structs._GResolverClass> = obj.cptr
    }
}

typealias ResolverError = GResolverError

typealias ResolverNameLookupFlags = GResolverNameLookupFlags

typealias ResolverRecordType = GResolverRecordType

class Resource(private val cptr: CPointer<cnames.structs._GResource>) /* struct */ {
    fun newFromData(data: com.charlag.kgtk.demo.glib.Bytes): Resource {
         return stub()
    }
    fun Register(): Unit {
         return stub()
    }
    fun Unregister(): Unit {
         return stub()
    }
    fun enumerateChildren(path: String, lookup_flags: ResourceLookupFlags): List<String> {
         return stub()
    }
    fun getInfo(path: String, lookup_flags: ResourceLookupFlags, size: ULong, flags: UInt): Boolean {
         return stub()
    }
    fun lookupData(path: String, lookup_flags: ResourceLookupFlags): com.charlag.kgtk.demo.glib.Bytes {
         return stub()
    }
    fun openStream(path: String, lookup_flags: ResourceLookupFlags): InputStream {
         return stub()
    }
    fun ref(): Resource {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun load(filename: String): Resource {
         return stub()
    }
    companion object {
        fun cptr(obj: Resource): CPointer<cnames.structs._GResource> = obj.cptr
    }
}

typealias ResourceError = GResourceError

typealias ResourceFlags = GResourceFlags

typealias ResourceLookupFlags = GResourceLookupFlags

val SETTINGS_BACKEND_EXTENSION_POINT_NAME: String get() = TODO()

interface Seekable : InteropWrapper {
    fun canSeek(): Boolean = stub("Seekable default impl")

    fun canTruncate(): Boolean = stub("Seekable default impl")

    fun seek(offset: Long, type: com.charlag.kgtk.demo.glib.SeekType, cancellable: Cancellable): Boolean = stub("Seekable default impl")

    fun tell(): Long = stub("Seekable default impl")

    fun truncate(offset: Long, cancellable: Cancellable): Boolean = stub("Seekable default impl")

    companion object {
        fun cptr(obj: Seekable): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GSeekable>) : Seekable {
        override val rawPtr: COpaquePointer = cptr
    }
}

class SeekableIface(private val cptr: CPointer<cnames.structs._GSeekableIface>) /* struct */ {
    companion object {
        fun cptr(obj: SeekableIface): CPointer<cnames.structs._GSeekableIface> = obj.cptr
    }
}

typealias SettingsBindFlags = GSettingsBindFlags

typealias SettingsBindGetMapping = (value:  com.charlag.kgtk.demo.gobject.Value, variant:  com.charlag.kgtk.demo.glib.Variant, user_data:  Any) -> Boolean

typealias SettingsBindSetMapping = (value:  com.charlag.kgtk.demo.gobject.Value, expected_type:  com.charlag.kgtk.demo.glib.VariantType, user_data:  Any) -> com.charlag.kgtk.demo.glib.Variant

typealias SettingsGetMapping = (value:  com.charlag.kgtk.demo.glib.Variant, result:  Any, user_data:  Any) -> Boolean

class SettingsSchema(private val cptr: CPointer<cnames.structs._GSettingsSchema>) /* struct */ {
    fun getId(): String {
         return stub()
    }
    fun getKey(`name`: String): SettingsSchemaKey {
         return stub()
    }
    fun getPath(): String {
         return stub()
    }
    fun hasKey(`name`: String): Boolean {
         return stub()
    }
    fun listChildren(): List<String> {
         return stub()
    }
    fun listKeys(): List<String> {
         return stub()
    }
    fun ref(): SettingsSchema {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: SettingsSchema): CPointer<cnames.structs._GSettingsSchema> = obj.cptr
    }
}

class SettingsSchemaKey(private val cptr: CPointer<cnames.structs._GSettingsSchemaKey>) /* struct */ {
    fun getDefaultValue(): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    fun getDescription(): String {
         return stub()
    }
    fun getName(): String {
         return stub()
    }
    fun getRange(): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    fun getSummary(): String {
         return stub()
    }
    fun getValueType(): com.charlag.kgtk.demo.glib.VariantType {
         return stub()
    }
    fun rangeCheck(value: com.charlag.kgtk.demo.glib.Variant): Boolean {
         return stub()
    }
    fun ref(): SettingsSchemaKey {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: SettingsSchemaKey): CPointer<cnames.structs._GSettingsSchemaKey> = obj.cptr
    }
}

class SettingsSchemaSource(private val cptr: CPointer<cnames.structs._GSettingsSchemaSource>) /* struct */ {
    fun newFromDirectory(directory: String, parent: SettingsSchemaSource, trusted: Boolean): SettingsSchemaSource {
         return stub()
    }
    fun listSchemas(recursive: Boolean, non_relocatable: List<String>, relocatable: List<String>): Unit {
         return stub()
    }
    fun lookup(schema_id: String, recursive: Boolean): SettingsSchema {
         return stub()
    }
    fun ref(): SettingsSchemaSource {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun getDefault(): SettingsSchemaSource {
         return stub()
    }
    companion object {
        fun cptr(obj: SettingsSchemaSource): CPointer<cnames.structs._GSettingsSchemaSource> = obj.cptr
    }
}

open class SimpleAction internal constructor (private val cptr: CPointer<GSimpleAction>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Action, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(`name`: String, parameter_type: com.charlag.kgtk.demo.glib.VariantType) : this(stub<CPointer<GSimpleAction>>())

    open fun setEnabled(enabled: Boolean): Unit {
         return stub()
    }
    open fun setState(value: com.charlag.kgtk.demo.glib.Variant): Unit {
         return stub()
    }
    open fun setStateHint(state_hint: com.charlag.kgtk.demo.glib.Variant): Unit {
         return stub()
    }
    fun setOnActivate(cb: () -> Unit) {
        do_connect(cptr, "activate", cb)
    }

    fun setOnChangeState(cb: () -> Unit) {
        do_connect(cptr, "change-state", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33592176UL
        fun cptr(obj: SimpleAction): CPointer<GSimpleAction> = obj.cptr
        fun newStateful(`name`: String, parameter_type: com.charlag.kgtk.demo.glib.VariantType, state: com.charlag.kgtk.demo.glib.Variant): SimpleAction = SimpleAction(stub<CPointer<GSimpleAction>>()) 
    }
}

open class SimpleActionGroup internal constructor (private val cptr: CPointer<GSimpleActionGroup>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), ActionGroup, ActionMap, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GSimpleActionGroup>>())

    companion object {
        const val G_TYPE: gtk3.GType = 32590000UL
        fun cptr(obj: SimpleActionGroup): CPointer<GSimpleActionGroup> = obj.cptr
    }
}

class SimpleActionGroupClass(private val cptr: CPointer<cnames.structs._GSimpleActionGroupClass>) /* struct */ {
    companion object {
        fun cptr(obj: SimpleActionGroupClass): CPointer<cnames.structs._GSimpleActionGroupClass> = obj.cptr
    }
}

open class SimpleAsyncResult internal constructor (private val cptr: CPointer<GSimpleAsyncResult>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), AsyncResult, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 38664752UL
        fun cptr(obj: SimpleAsyncResult): CPointer<GSimpleAsyncResult> = obj.cptr
    }
}

class SimpleAsyncResultClass(private val cptr: CPointer<cnames.structs._GSimpleAsyncResultClass>) /* struct */ {
    companion object {
        fun cptr(obj: SimpleAsyncResultClass): CPointer<cnames.structs._GSimpleAsyncResultClass> = obj.cptr
    }
}

typealias SimpleAsyncThreadFunc = (res:  SimpleAsyncResult, `object`:  com.charlag.kgtk.demo.gobject.Object, cancellable:  Cancellable) -> Unit

open class SimpleIOStream internal constructor (private val cptr: CPointer<GSimpleIOStream>) : IOStream(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(input_stream: InputStream, output_stream: OutputStream) : this(stub<CPointer<GSimpleIOStream>>())

    companion object {
        const val G_TYPE: gtk3.GType = 41135360UL
        fun cptr(obj: SimpleIOStream): CPointer<GSimpleIOStream> = obj.cptr
    }
}

open class SimplePermission internal constructor (private val cptr: CPointer<GSimplePermission>) : Permission(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(allowed: Boolean) : this(stub<CPointer<GSimplePermission>>())

    companion object {
        const val G_TYPE: gtk3.GType = 35740528UL
        fun cptr(obj: SimplePermission): CPointer<GSimplePermission> = obj.cptr
    }
}

open class SimpleProxyResolver internal constructor (private val cptr: CPointer<GSimpleProxyResolver>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), ProxyResolver, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun setDefaultProxy(default_proxy: String): Unit {
         return stub()
    }
    open fun setIgnoreHosts(ignore_hosts: String): Unit {
         return stub()
    }
    open fun setUriProxy(uri_scheme: String, proxy: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 35866704UL
        fun cptr(obj: SimpleProxyResolver): CPointer<GSimpleProxyResolver> = obj.cptr
        fun new(default_proxy: String, ignore_hosts: String): ProxyResolver {
    return stub()
}
    }
}

class SimpleProxyResolverClass(private val cptr: CPointer<cnames.structs._GSimpleProxyResolverClass>) /* struct */ {
    companion object {
        fun cptr(obj: SimpleProxyResolverClass): CPointer<cnames.structs._GSimpleProxyResolverClass> = obj.cptr
    }
}

open class Socket internal constructor (private val cptr: CPointer<GSocket>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), DatagramBased, Initable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(family: SocketFamily, type: SocketType, protocol: SocketProtocol) : this(stub<CPointer<GSocket>>())

    open fun accept(cancellable: Cancellable): Socket {
         return stub()
    }
    open fun bind(address: SocketAddress, allow_reuse: Boolean): Boolean {
         return stub()
    }
    open fun checkConnectResult(): Boolean {
         return stub()
    }
    open fun close(): Boolean {
         return stub()
    }
    override fun conditionCheck(condition: com.charlag.kgtk.demo.glib.IOCondition): com.charlag.kgtk.demo.glib.IOCondition {
         return stub()
    }
    open fun conditionTimedWait(condition: com.charlag.kgtk.demo.glib.IOCondition, timeout_us: Long, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun conditionWait(condition: com.charlag.kgtk.demo.glib.IOCondition, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun connect(address: SocketAddress, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun connectionFactoryCreateConnection(): SocketConnection {
         return stub()
    }
    open fun getAvailableBytes(): Long {
         return stub()
    }
    open fun getBlocking(): Boolean {
         return stub()
    }
    open fun getBroadcast(): Boolean {
         return stub()
    }
    open fun getCredentials(): Credentials {
         return stub()
    }
    open fun getFamily(): SocketFamily {
         return stub()
    }
    open fun getFd(): Int {
         return stub()
    }
    open fun getKeepalive(): Boolean {
         return stub()
    }
    open fun getListenBacklog(): Int {
         return stub()
    }
    open fun getLocalAddress(): SocketAddress {
         return stub()
    }
    open fun getMulticastLoopback(): Boolean {
         return stub()
    }
    open fun getMulticastTtl(): UInt {
         return stub()
    }
    open fun getOption(level: Int, optname: Int, value: Int): Boolean {
         return stub()
    }
    open fun getProtocol(): SocketProtocol {
         return stub()
    }
    open fun getRemoteAddress(): SocketAddress {
         return stub()
    }
    open fun getSocketType(): SocketType {
         return stub()
    }
    open fun getTimeout(): UInt {
         return stub()
    }
    open fun getTtl(): UInt {
         return stub()
    }
    open fun isClosed(): Boolean {
         return stub()
    }
    open fun isConnected(): Boolean {
         return stub()
    }
    open fun joinMulticastGroup(group: InetAddress, source_specific: Boolean, iface: String): Boolean {
         return stub()
    }
    open fun joinMulticastGroupSsm(group: InetAddress, source_specific: InetAddress, iface: String): Boolean {
         return stub()
    }
    open fun leaveMulticastGroup(group: InetAddress, source_specific: Boolean, iface: String): Boolean {
         return stub()
    }
    open fun leaveMulticastGroupSsm(group: InetAddress, source_specific: InetAddress, iface: String): Boolean {
         return stub()
    }
    open fun listen(): Boolean {
         return stub()
    }
    open fun receive(buffer: List<UByte>, size: ULong, cancellable: Cancellable): Long {
         return stub()
    }
    open fun receiveFrom(address: SocketAddress, buffer: List<UByte>, size: ULong, cancellable: Cancellable): Long {
         return stub()
    }
    open fun receiveMessage(address: SocketAddress, vectors: List<InputVector>, num_vectors: Int, messages: List<SocketControlMessage>, num_messages: Int, flags: Int, cancellable: Cancellable): Long {
         return stub()
    }
    open fun receiveMessages(messages: List<InputMessage>, num_messages: UInt, flags: Int, cancellable: Cancellable): Int {
         return stub()
    }
    open fun receiveWithBlocking(buffer: List<UByte>, size: ULong, blocking: Boolean, cancellable: Cancellable): Long {
         return stub()
    }
    open fun send(buffer: List<UByte>, size: ULong, cancellable: Cancellable): Long {
         return stub()
    }
    open fun sendMessage(address: SocketAddress, vectors: List<OutputVector>, num_vectors: Int, messages: List<SocketControlMessage>, num_messages: Int, flags: Int, cancellable: Cancellable): Long {
         return stub()
    }
    open fun sendMessageWithTimeout(address: SocketAddress, vectors: List<OutputVector>, num_vectors: Int, messages: List<SocketControlMessage>, num_messages: Int, flags: Int, timeout_us: Long, bytes_written: ULong, cancellable: Cancellable): PollableReturn {
         return stub()
    }
    open fun sendMessages(messages: List<OutputMessage>, num_messages: UInt, flags: Int, cancellable: Cancellable): Int {
         return stub()
    }
    open fun sendTo(address: SocketAddress, buffer: List<UByte>, size: ULong, cancellable: Cancellable): Long {
         return stub()
    }
    open fun sendWithBlocking(buffer: List<UByte>, size: ULong, blocking: Boolean, cancellable: Cancellable): Long {
         return stub()
    }
    open fun setBlocking(blocking: Boolean): Unit {
         return stub()
    }
    open fun setBroadcast(broadcast: Boolean): Unit {
         return stub()
    }
    open fun setKeepalive(keepalive: Boolean): Unit {
         return stub()
    }
    open fun setListenBacklog(backlog: Int): Unit {
         return stub()
    }
    open fun setMulticastLoopback(loopback: Boolean): Unit {
         return stub()
    }
    open fun setMulticastTtl(ttl: UInt): Unit {
         return stub()
    }
    open fun setOption(level: Int, optname: Int, value: Int): Boolean {
         return stub()
    }
    open fun setTimeout(timeout: UInt): Unit {
         return stub()
    }
    open fun setTtl(ttl: UInt): Unit {
         return stub()
    }
    open fun shutdown(shutdown_read: Boolean, shutdown_write: Boolean): Boolean {
         return stub()
    }
    open fun speaksIpv4(): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33031872UL
        fun cptr(obj: Socket): CPointer<GSocket> = obj.cptr
        fun newFromFd(fd: Int): Socket = Socket(stub<CPointer<GSocket>>()) 
    }
}

open class SocketAddress internal constructor (private val cptr: CPointer<GSocketAddress>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), SocketConnectable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getFamily(): SocketFamily {
         return stub()
    }
    open fun getNativeSize(): Long {
         return stub()
    }
    open fun toNative(dest: Any, destlen: ULong): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31424544UL
        fun cptr(obj: SocketAddress): CPointer<GSocketAddress> = obj.cptr
        fun newFromNative(native: Any, len: ULong): SocketAddress = SocketAddress(stub<CPointer<GSocketAddress>>()) 
    }
}

class SocketAddressClass(private val cptr: CPointer<cnames.structs._GSocketAddressClass>) /* struct */ {
    companion object {
        fun cptr(obj: SocketAddressClass): CPointer<cnames.structs._GSocketAddressClass> = obj.cptr
    }
}

open class SocketAddressEnumerator internal constructor (private val cptr: CPointer<GSocketAddressEnumerator>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun next(cancellable: Cancellable): SocketAddress {
         return stub()
    }
    open fun nextAsync(cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun nextFinish(result: AsyncResult): SocketAddress {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 36925440UL
        fun cptr(obj: SocketAddressEnumerator): CPointer<GSocketAddressEnumerator> = obj.cptr
    }
}

class SocketAddressEnumeratorClass(private val cptr: CPointer<cnames.structs._GSocketAddressEnumeratorClass>) /* struct */ {
    companion object {
        fun cptr(obj: SocketAddressEnumeratorClass): CPointer<cnames.structs._GSocketAddressEnumeratorClass> = obj.cptr
    }
}

class SocketClass(private val cptr: CPointer<cnames.structs._GSocketClass>) /* struct */ {
    companion object {
        fun cptr(obj: SocketClass): CPointer<cnames.structs._GSocketClass> = obj.cptr
    }
}

open class SocketClient internal constructor (private val cptr: CPointer<GSocketClient>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GSocketClient>>())

    open fun addApplicationProxy(protocol: String): Unit {
         return stub()
    }
    open fun connect(connectable: SocketConnectable, cancellable: Cancellable): SocketConnection {
         return stub()
    }
    open fun connectAsync(connectable: SocketConnectable, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun connectFinish(result: AsyncResult): SocketConnection {
         return stub()
    }
    open fun connectToHost(host_and_port: String, default_port: UShort, cancellable: Cancellable): SocketConnection {
         return stub()
    }
    open fun connectToHostAsync(host_and_port: String, default_port: UShort, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun connectToHostFinish(result: AsyncResult): SocketConnection {
         return stub()
    }
    open fun connectToService(domain: String, service: String, cancellable: Cancellable): SocketConnection {
         return stub()
    }
    open fun connectToServiceAsync(domain: String, service: String, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun connectToServiceFinish(result: AsyncResult): SocketConnection {
         return stub()
    }
    open fun connectToUri(uri: String, default_port: UShort, cancellable: Cancellable): SocketConnection {
         return stub()
    }
    open fun connectToUriAsync(uri: String, default_port: UShort, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun connectToUriFinish(result: AsyncResult): SocketConnection {
         return stub()
    }
    open fun getEnableProxy(): Boolean {
         return stub()
    }
    open fun getFamily(): SocketFamily {
         return stub()
    }
    open fun getLocalAddress(): SocketAddress {
         return stub()
    }
    open fun getProtocol(): SocketProtocol {
         return stub()
    }
    open fun getProxyResolver(): ProxyResolver {
         return stub()
    }
    open fun getSocketType(): SocketType {
         return stub()
    }
    open fun getTimeout(): UInt {
         return stub()
    }
    open fun getTls(): Boolean {
         return stub()
    }
    open fun getTlsValidationFlags(): TlsCertificateFlags {
         return stub()
    }
    open fun setEnableProxy(enable: Boolean): Unit {
         return stub()
    }
    open fun setFamily(family: SocketFamily): Unit {
         return stub()
    }
    open fun setLocalAddress(address: SocketAddress): Unit {
         return stub()
    }
    open fun setProtocol(protocol: SocketProtocol): Unit {
         return stub()
    }
    open fun setProxyResolver(proxy_resolver: ProxyResolver): Unit {
         return stub()
    }
    open fun setSocketType(type: SocketType): Unit {
         return stub()
    }
    open fun setTimeout(timeout: UInt): Unit {
         return stub()
    }
    open fun setTls(tls: Boolean): Unit {
         return stub()
    }
    open fun setTlsValidationFlags(flags: TlsCertificateFlags): Unit {
         return stub()
    }
    fun setOnEvent(cb: () -> Unit) {
        do_connect(cptr, "event", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30964992UL
        fun cptr(obj: SocketClient): CPointer<GSocketClient> = obj.cptr
    }
}

class SocketClientClass(private val cptr: CPointer<cnames.structs._GSocketClientClass>) /* struct */ {
    companion object {
        fun cptr(obj: SocketClientClass): CPointer<cnames.structs._GSocketClientClass> = obj.cptr
    }
}

typealias SocketClientEvent = GSocketClientEvent

interface SocketConnectable : InteropWrapper {
    fun enumerate(): SocketAddressEnumerator = stub("SocketConnectable default impl")

    fun proxyEnumerate(): SocketAddressEnumerator = stub("SocketConnectable default impl")

    companion object {
        fun cptr(obj: SocketConnectable): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GSocketConnectable>) : SocketConnectable {
        override val rawPtr: COpaquePointer = cptr
    }
}

class SocketConnectableIface(private val cptr: CPointer<cnames.structs._GSocketConnectableIface>) /* struct */ {
    companion object {
        fun cptr(obj: SocketConnectableIface): CPointer<cnames.structs._GSocketConnectableIface> = obj.cptr
    }
}

open class SocketConnection internal constructor (private val cptr: CPointer<GSocketConnection>) : IOStream(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun connect(address: SocketAddress, cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun connectAsync(address: SocketAddress, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun connectFinish(result: AsyncResult): Boolean {
         return stub()
    }
    open fun getLocalAddress(): SocketAddress {
         return stub()
    }
    open fun getRemoteAddress(): SocketAddress {
         return stub()
    }
    open fun getSocket(): Socket {
         return stub()
    }
    open fun isConnected(): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32311904UL
        fun cptr(obj: SocketConnection): CPointer<GSocketConnection> = obj.cptr
        fun factoryLookupType(family: SocketFamily, type: SocketType, protocol_id: Int): GType {
    return stub()
}
        fun factoryRegisterType(g_type: GType, family: SocketFamily, type: SocketType, protocol: Int): Unit {
    return stub()
}
    }
}

class SocketConnectionClass(private val cptr: CPointer<cnames.structs._GSocketConnectionClass>) /* struct */ {
    companion object {
        fun cptr(obj: SocketConnectionClass): CPointer<cnames.structs._GSocketConnectionClass> = obj.cptr
    }
}

open class SocketControlMessage internal constructor (private val cptr: CPointer<GSocketControlMessage>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getLevel(): Int {
         return stub()
    }
    open fun getMsgType(): Int {
         return stub()
    }
    open fun getSize(): ULong {
         return stub()
    }
    open fun serialize(data: Any): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32206992UL
        fun cptr(obj: SocketControlMessage): CPointer<GSocketControlMessage> = obj.cptr
        fun deserialize(level: Int, type: Int, size: ULong, data: List<UByte>): SocketControlMessage {
    return stub()
}
    }
}

class SocketControlMessageClass(private val cptr: CPointer<cnames.structs._GSocketControlMessageClass>) /* struct */ {
    companion object {
        fun cptr(obj: SocketControlMessageClass): CPointer<cnames.structs._GSocketControlMessageClass> = obj.cptr
    }
}

typealias SocketFamily = GSocketFamily

open class SocketListener internal constructor (private val cptr: CPointer<GSocketListener>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GSocketListener>>())

    open fun accept(source_object: com.charlag.kgtk.demo.gobject.Object, cancellable: Cancellable): SocketConnection {
         return stub()
    }
    open fun acceptAsync(cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun acceptFinish(result: AsyncResult, source_object: com.charlag.kgtk.demo.gobject.Object): SocketConnection {
         return stub()
    }
    open fun acceptSocket(source_object: com.charlag.kgtk.demo.gobject.Object, cancellable: Cancellable): Socket {
         return stub()
    }
    open fun acceptSocketAsync(cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun acceptSocketFinish(result: AsyncResult, source_object: com.charlag.kgtk.demo.gobject.Object): Socket {
         return stub()
    }
    open fun addAddress(address: SocketAddress, type: SocketType, protocol: SocketProtocol, source_object: com.charlag.kgtk.demo.gobject.Object, effective_address: SocketAddress): Boolean {
         return stub()
    }
    open fun addAnyInetPort(source_object: com.charlag.kgtk.demo.gobject.Object): UShort {
         return stub()
    }
    open fun addInetPort(port: UShort, source_object: com.charlag.kgtk.demo.gobject.Object): Boolean {
         return stub()
    }
    open fun addSocket(socket: Socket, source_object: com.charlag.kgtk.demo.gobject.Object): Boolean {
         return stub()
    }
    open fun close(): Unit {
         return stub()
    }
    open fun setBacklog(listen_backlog: Int): Unit {
         return stub()
    }
    fun setOnEvent(cb: () -> Unit) {
        do_connect(cptr, "event", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30832080UL
        fun cptr(obj: SocketListener): CPointer<GSocketListener> = obj.cptr
    }
}

class SocketListenerClass(private val cptr: CPointer<cnames.structs._GSocketListenerClass>) /* struct */ {
    companion object {
        fun cptr(obj: SocketListenerClass): CPointer<cnames.structs._GSocketListenerClass> = obj.cptr
    }
}

typealias SocketListenerEvent = GSocketListenerEvent

typealias SocketMsgFlags = GSocketMsgFlags

typealias SocketProtocol = GSocketProtocol

open class SocketService internal constructor (private val cptr: CPointer<GSocketService>) : SocketListener(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GSocketService>>())

    open fun isActive(): Boolean {
         return stub()
    }
    open fun start(): Unit {
         return stub()
    }
    open fun stop(): Unit {
         return stub()
    }
    fun setOnIncoming(cb: () -> Unit) {
        do_connect(cptr, "incoming", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32326576UL
        fun cptr(obj: SocketService): CPointer<GSocketService> = obj.cptr
    }
}

class SocketServiceClass(private val cptr: CPointer<cnames.structs._GSocketServiceClass>) /* struct */ {
    companion object {
        fun cptr(obj: SocketServiceClass): CPointer<cnames.structs._GSocketServiceClass> = obj.cptr
    }
}

typealias SocketSourceFunc = (socket:  Socket, condition:  com.charlag.kgtk.demo.glib.IOCondition, user_data:  Any) -> Boolean

typealias SocketType = GSocketType

class SrvTarget(private val cptr: CPointer<cnames.structs._GSrvTarget>) /* struct */ {
    fun new(hostname: String, port: UShort, priority: UShort, weight: UShort): SrvTarget {
         return stub()
    }
    fun copy(): SrvTarget {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getHostname(): String {
         return stub()
    }
    fun getPort(): UShort {
         return stub()
    }
    fun getPriority(): UShort {
         return stub()
    }
    fun getWeight(): UShort {
         return stub()
    }
    companion object {
        fun cptr(obj: SrvTarget): CPointer<cnames.structs._GSrvTarget> = obj.cptr
    }
}

class StaticResource(private val cptr: CPointer<cnames.structs._GStaticResource>) /* struct */ {
    fun fini(): Unit {
         return stub()
    }
    fun getResource(): Resource {
         return stub()
    }
    fun init(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: StaticResource): CPointer<cnames.structs._GStaticResource> = obj.cptr
    }
}

open class Subprocess internal constructor (private val cptr: CPointer<GSubprocess>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Initable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(argv: List<String>, flags: SubprocessFlags) : this(stub<CPointer<GSubprocess>>())

    open fun communicate(stdin_buf: com.charlag.kgtk.demo.glib.Bytes, cancellable: Cancellable, stdout_buf: com.charlag.kgtk.demo.glib.Bytes, stderr_buf: com.charlag.kgtk.demo.glib.Bytes): Boolean {
         return stub()
    }
    open fun communicateAsync(stdin_buf: com.charlag.kgtk.demo.glib.Bytes, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun communicateFinish(result: AsyncResult, stdout_buf: com.charlag.kgtk.demo.glib.Bytes, stderr_buf: com.charlag.kgtk.demo.glib.Bytes): Boolean {
         return stub()
    }
    open fun communicateUtf8(stdin_buf: String, cancellable: Cancellable, stdout_buf: String, stderr_buf: String): Boolean {
         return stub()
    }
    open fun communicateUtf8Async(stdin_buf: String, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun communicateUtf8Finish(result: AsyncResult, stdout_buf: String, stderr_buf: String): Boolean {
         return stub()
    }
    open fun forceExit(): Unit {
         return stub()
    }
    open fun getExitStatus(): Int {
         return stub()
    }
    open fun getIdentifier(): String {
         return stub()
    }
    open fun getIfExited(): Boolean {
         return stub()
    }
    open fun getIfSignaled(): Boolean {
         return stub()
    }
    open fun getStatus(): Int {
         return stub()
    }
    open fun getStderrPipe(): InputStream {
         return stub()
    }
    open fun getStdinPipe(): OutputStream {
         return stub()
    }
    open fun getStdoutPipe(): InputStream {
         return stub()
    }
    open fun getSuccessful(): Boolean {
         return stub()
    }
    open fun getTermSig(): Int {
         return stub()
    }
    open fun sendSignal(signal_num: Int): Unit {
         return stub()
    }
    open fun wait(cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun waitAsync(cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun waitCheck(cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun waitCheckAsync(cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun waitCheckFinish(result: AsyncResult): Boolean {
         return stub()
    }
    open fun waitFinish(result: AsyncResult): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 39428304UL
        fun cptr(obj: Subprocess): CPointer<GSubprocess> = obj.cptr
    }
}

typealias SubprocessFlags = GSubprocessFlags

open class SubprocessLauncher internal constructor (private val cptr: CPointer<GSubprocessLauncher>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(flags: SubprocessFlags) : this(stub<CPointer<GSubprocessLauncher>>())

    open fun getenv(variable: String): String {
         return stub()
    }
    open fun setCwd(cwd: String): Unit {
         return stub()
    }
    open fun setEnviron(env: List<String>): Unit {
         return stub()
    }
    open fun setFlags(flags: SubprocessFlags): Unit {
         return stub()
    }
    open fun setStderrFilePath(path: String): Unit {
         return stub()
    }
    open fun setStdinFilePath(path: String): Unit {
         return stub()
    }
    open fun setStdoutFilePath(path: String): Unit {
         return stub()
    }
    open fun setenv(variable: String, value: String, overwrite: Boolean): Unit {
         return stub()
    }
    open fun spawnv(argv: List<String>): Subprocess {
         return stub()
    }
    open fun takeFd(source_fd: Int, target_fd: Int): Unit {
         return stub()
    }
    open fun takeStderrFd(fd: Int): Unit {
         return stub()
    }
    open fun takeStdinFd(fd: Int): Unit {
         return stub()
    }
    open fun takeStdoutFd(fd: Int): Unit {
         return stub()
    }
    open fun unsetenv(variable: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33480544UL
        fun cptr(obj: SubprocessLauncher): CPointer<GSubprocessLauncher> = obj.cptr
    }
}

val TLS_BACKEND_EXTENSION_POINT_NAME: String get() = TODO()

val TLS_DATABASE_PURPOSE_AUTHENTICATE_CLIENT: String get() = TODO()

val TLS_DATABASE_PURPOSE_AUTHENTICATE_SERVER: String get() = TODO()

open class Task internal constructor (private val cptr: CPointer<GTask>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), AsyncResult, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(source_object: com.charlag.kgtk.demo.gobject.Object, cancellable: Cancellable, callback: AsyncReadyCallback, callback_data: Any) : this(stub<CPointer<GTask>>())

    open fun getCancellable(): Cancellable {
         return stub()
    }
    open fun getCheckCancellable(): Boolean {
         return stub()
    }
    open fun getCompleted(): Boolean {
         return stub()
    }
    open fun getContext(): com.charlag.kgtk.demo.glib.MainContext {
         return stub()
    }
    open fun getName(): String {
         return stub()
    }
    open fun getPriority(): Int {
         return stub()
    }
    open fun getReturnOnCancel(): Boolean {
         return stub()
    }
    override fun getSourceObject(): com.charlag.kgtk.demo.gobject.Object {
         return stub()
    }
    open fun getSourceTag(): Any {
         return stub()
    }
    open fun getTaskData(): Any {
         return stub()
    }
    open fun hadError(): Boolean {
         return stub()
    }
    open fun propagateBoolean(): Boolean {
         return stub()
    }
    open fun propagateInt(): Long {
         return stub()
    }
    open fun propagatePointer(): Any {
         return stub()
    }
    open fun propagateValue(value: com.charlag.kgtk.demo.gobject.Value): Boolean {
         return stub()
    }
    open fun returnBoolean(result: Boolean): Unit {
         return stub()
    }
    open fun returnError(error: Error): Unit {
         return stub()
    }
    open fun returnErrorIfCancelled(): Boolean {
         return stub()
    }
    open fun returnInt(result: Long): Unit {
         return stub()
    }
    open fun returnPointer(result: Any, result_destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun returnValue(result: com.charlag.kgtk.demo.gobject.Value): Unit {
         return stub()
    }
    open fun runInThread(task_func: TaskThreadFunc): Unit {
         return stub()
    }
    open fun runInThreadSync(task_func: TaskThreadFunc): Unit {
         return stub()
    }
    open fun setCheckCancellable(check_cancellable: Boolean): Unit {
         return stub()
    }
    open fun setName(`name`: String): Unit {
         return stub()
    }
    open fun setPriority(priority: Int): Unit {
         return stub()
    }
    open fun setReturnOnCancel(return_on_cancel: Boolean): Boolean {
         return stub()
    }
    open fun setSourceTag(source_tag: Any): Unit {
         return stub()
    }
    open fun setTaskData(task_data: Any, task_data_destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 39340496UL
        fun cptr(obj: Task): CPointer<GTask> = obj.cptr
        fun isValid(result: AsyncResult, source_object: com.charlag.kgtk.demo.gobject.Object): Boolean {
    return stub()
}
        fun reportError(source_object: com.charlag.kgtk.demo.gobject.Object, callback: AsyncReadyCallback, callback_data: Any, source_tag: Any, error: Error): Unit {
    return stub()
}
    }
}

class TaskClass(private val cptr: CPointer<cnames.structs._GTaskClass>) /* struct */ {
    companion object {
        fun cptr(obj: TaskClass): CPointer<cnames.structs._GTaskClass> = obj.cptr
    }
}

typealias TaskThreadFunc = (task:  Task, source_object:  com.charlag.kgtk.demo.gobject.Object, task_data:  Any, cancellable:  Cancellable) -> Unit

open class TcpConnection internal constructor (private val cptr: CPointer<GTcpConnection>) : SocketConnection(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getGracefulDisconnect(): Boolean {
         return stub()
    }
    open fun setGracefulDisconnect(graceful_disconnect: Boolean): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32728400UL
        fun cptr(obj: TcpConnection): CPointer<GTcpConnection> = obj.cptr
    }
}

class TcpConnectionClass(private val cptr: CPointer<cnames.structs._GTcpConnectionClass>) /* struct */ {
    companion object {
        fun cptr(obj: TcpConnectionClass): CPointer<cnames.structs._GTcpConnectionClass> = obj.cptr
    }
}

open class TcpWrapperConnection internal constructor (private val cptr: CPointer<GTcpWrapperConnection>) : TcpConnection(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(base_io_stream: IOStream, socket: Socket) : this(stub<CPointer<GTcpWrapperConnection>>())

    open fun getBaseIoStream(): IOStream {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 38413696UL
        fun cptr(obj: TcpWrapperConnection): CPointer<GTcpWrapperConnection> = obj.cptr
    }
}

class TcpWrapperConnectionClass(private val cptr: CPointer<cnames.structs._GTcpWrapperConnectionClass>) /* struct */ {
    companion object {
        fun cptr(obj: TcpWrapperConnectionClass): CPointer<cnames.structs._GTcpWrapperConnectionClass> = obj.cptr
    }
}

open class TestDBus internal constructor (private val cptr: CPointer<GTestDBus>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(flags: TestDBusFlags) : this(stub<CPointer<GTestDBus>>())

    open fun addServiceDir(path: String): Unit {
         return stub()
    }
    open fun down(): Unit {
         return stub()
    }
    open fun getBusAddress(): String {
         return stub()
    }
    open fun getFlags(): TestDBusFlags {
         return stub()
    }
    open fun stop(): Unit {
         return stub()
    }
    open fun up(): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 40527392UL
        fun cptr(obj: TestDBus): CPointer<GTestDBus> = obj.cptr
        fun unset(): Unit {
    return stub()
}
    }
}

typealias TestDBusFlags = GTestDBusFlags

open class ThemedIcon internal constructor (private val cptr: CPointer<GThemedIcon>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Icon, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(iconname: String) : this(stub<CPointer<GThemedIcon>>())

    open fun appendName(iconname: String): Unit {
         return stub()
    }
    open fun getNames(): List<String> {
         return stub()
    }
    open fun prependName(iconname: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32719760UL
        fun cptr(obj: ThemedIcon): CPointer<GThemedIcon> = obj.cptr
        fun newFromNames(iconnames: List<String>, len: Int): ThemedIcon = ThemedIcon(stub<CPointer<GThemedIcon>>()) 
        fun newWithDefaultFallbacks(iconname: String): ThemedIcon = ThemedIcon(stub<CPointer<GThemedIcon>>()) 
    }
}

class ThemedIconClass(private val cptr: CPointer<cnames.structs._GThemedIconClass>) /* struct */ {
    companion object {
        fun cptr(obj: ThemedIconClass): CPointer<cnames.structs._GThemedIconClass> = obj.cptr
    }
}

open class ThreadedSocketService internal constructor (private val cptr: CPointer<GThreadedSocketService>) : SocketService(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(max_threads: Int) : this(stub<CPointer<GThreadedSocketService>>())

    fun setOnRun(cb: () -> Unit) {
        do_connect(cptr, "run", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30694112UL
        fun cptr(obj: ThreadedSocketService): CPointer<GThreadedSocketService> = obj.cptr
    }
}

class ThreadedSocketServiceClass(private val cptr: CPointer<cnames.structs._GThreadedSocketServiceClass>) /* struct */ {
    companion object {
        fun cptr(obj: ThreadedSocketServiceClass): CPointer<cnames.structs._GThreadedSocketServiceClass> = obj.cptr
    }
}

typealias TlsAuthenticationMode = GTlsAuthenticationMode

interface TlsBackend : InteropWrapper {
    fun getDefault(): TlsBackend = stub("TlsBackend default impl")

    fun getCertificateType(): GType = stub("TlsBackend default impl")

    fun getClientConnectionType(): GType = stub("TlsBackend default impl")

    fun getDefaultDatabase(): TlsDatabase = stub("TlsBackend default impl")

    fun getDtlsClientConnectionType(): GType = stub("TlsBackend default impl")

    fun getDtlsServerConnectionType(): GType = stub("TlsBackend default impl")

    fun getFileDatabaseType(): GType = stub("TlsBackend default impl")

    fun getServerConnectionType(): GType = stub("TlsBackend default impl")

    fun setDefaultDatabase(database: TlsDatabase): Unit = stub("TlsBackend default impl")

    fun supportsDtls(): Boolean = stub("TlsBackend default impl")

    fun supportsTls(): Boolean = stub("TlsBackend default impl")

    companion object {
        fun cptr(obj: TlsBackend): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GTlsBackend>) : TlsBackend {
        override val rawPtr: COpaquePointer = cptr
    }
}

class TlsBackendInterface(private val cptr: CPointer<cnames.structs._GTlsBackendInterface>) /* struct */ {
    companion object {
        fun cptr(obj: TlsBackendInterface): CPointer<cnames.structs._GTlsBackendInterface> = obj.cptr
    }
}

open class TlsCertificate internal constructor (private val cptr: CPointer<GTlsCertificate>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getIssuer(): TlsCertificate {
         return stub()
    }
    open fun isSame(cert_two: TlsCertificate): Boolean {
         return stub()
    }
    open fun verify(identity: SocketConnectable, trusted_ca: TlsCertificate): TlsCertificateFlags {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33031504UL
        fun cptr(obj: TlsCertificate): CPointer<GTlsCertificate> = obj.cptr
        fun newFromFile(file: String): TlsCertificate = TlsCertificate(stub<CPointer<GTlsCertificate>>()) 
        fun newFromFiles(cert_file: String, key_file: String): TlsCertificate = TlsCertificate(stub<CPointer<GTlsCertificate>>()) 
        fun newFromPem(data: String, length: Long): TlsCertificate = TlsCertificate(stub<CPointer<GTlsCertificate>>()) 
        fun listNewFromFile(file: String): List<TlsCertificate> {
    return stub()
}
    }
}

class TlsCertificateClass(private val cptr: CPointer<cnames.structs._GTlsCertificateClass>) /* struct */ {
    companion object {
        fun cptr(obj: TlsCertificateClass): CPointer<cnames.structs._GTlsCertificateClass> = obj.cptr
    }
}

typealias TlsCertificateFlags = GTlsCertificateFlags

typealias TlsCertificateRequestFlags = GTlsCertificateRequestFlags

interface TlsClientConnection : InteropWrapper {
    fun new(base_io_stream: IOStream, server_identity: SocketConnectable): TlsClientConnection = stub("TlsClientConnection default impl")

    fun copySessionState(source: TlsClientConnection): Unit = stub("TlsClientConnection default impl")

    fun getAcceptedCas(): List<List<UByte>> = stub("TlsClientConnection default impl")

    fun getServerIdentity(): SocketConnectable = stub("TlsClientConnection default impl")

    fun getValidationFlags(): TlsCertificateFlags = stub("TlsClientConnection default impl")

    fun setServerIdentity(identity: SocketConnectable): Unit = stub("TlsClientConnection default impl")

    fun setValidationFlags(flags: TlsCertificateFlags): Unit = stub("TlsClientConnection default impl")

    companion object {
        fun cptr(obj: TlsClientConnection): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GTlsClientConnection>) : TlsClientConnection {
        override val rawPtr: COpaquePointer = cptr
    }
}

class TlsClientConnectionInterface(private val cptr: CPointer<cnames.structs._GTlsClientConnectionInterface>) /* struct */ {
    companion object {
        fun cptr(obj: TlsClientConnectionInterface): CPointer<cnames.structs._GTlsClientConnectionInterface> = obj.cptr
    }
}

open class TlsConnection internal constructor (private val cptr: CPointer<GTlsConnection>) : IOStream(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun emitAcceptCertificate(peer_cert: TlsCertificate, errors: TlsCertificateFlags): Boolean {
         return stub()
    }
    open fun getCertificate(): TlsCertificate {
         return stub()
    }
    open fun getDatabase(): TlsDatabase {
         return stub()
    }
    open fun getInteraction(): TlsInteraction {
         return stub()
    }
    open fun getNegotiatedProtocol(): String {
         return stub()
    }
    open fun getPeerCertificate(): TlsCertificate {
         return stub()
    }
    open fun getPeerCertificateErrors(): TlsCertificateFlags {
         return stub()
    }
    open fun getRequireCloseNotify(): Boolean {
         return stub()
    }
    open fun handshake(cancellable: Cancellable): Boolean {
         return stub()
    }
    open fun handshakeAsync(io_priority: Int, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun handshakeFinish(result: AsyncResult): Boolean {
         return stub()
    }
    open fun setAdvertisedProtocols(protocols: List<String>): Unit {
         return stub()
    }
    open fun setCertificate(certificate: TlsCertificate): Unit {
         return stub()
    }
    open fun setDatabase(database: TlsDatabase): Unit {
         return stub()
    }
    open fun setInteraction(interaction: TlsInteraction): Unit {
         return stub()
    }
    open fun setRequireCloseNotify(require_close_notify: Boolean): Unit {
         return stub()
    }
    fun setOnAcceptCertificate(cb: () -> Unit) {
        do_connect(cptr, "accept-certificate", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33475216UL
        fun cptr(obj: TlsConnection): CPointer<GTlsConnection> = obj.cptr
    }
}

class TlsConnectionClass(private val cptr: CPointer<cnames.structs._GTlsConnectionClass>) /* struct */ {
    companion object {
        fun cptr(obj: TlsConnectionClass): CPointer<cnames.structs._GTlsConnectionClass> = obj.cptr
    }
}

open class TlsDatabase internal constructor (private val cptr: CPointer<GTlsDatabase>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun createCertificateHandle(certificate: TlsCertificate): String {
         return stub()
    }
    open fun lookupCertificateForHandle(handle: String, interaction: TlsInteraction, flags: TlsDatabaseLookupFlags, cancellable: Cancellable): TlsCertificate {
         return stub()
    }
    open fun lookupCertificateForHandleAsync(handle: String, interaction: TlsInteraction, flags: TlsDatabaseLookupFlags, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun lookupCertificateForHandleFinish(result: AsyncResult): TlsCertificate {
         return stub()
    }
    open fun lookupCertificateIssuer(certificate: TlsCertificate, interaction: TlsInteraction, flags: TlsDatabaseLookupFlags, cancellable: Cancellable): TlsCertificate {
         return stub()
    }
    open fun lookupCertificateIssuerAsync(certificate: TlsCertificate, interaction: TlsInteraction, flags: TlsDatabaseLookupFlags, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun lookupCertificateIssuerFinish(result: AsyncResult): TlsCertificate {
         return stub()
    }
    open fun lookupCertificatesIssuedBy(issuer_raw_dn: List<UByte>, interaction: TlsInteraction, flags: TlsDatabaseLookupFlags, cancellable: Cancellable): List<TlsCertificate> {
         return stub()
    }
    open fun lookupCertificatesIssuedByAsync(issuer_raw_dn: List<UByte>, interaction: TlsInteraction, flags: TlsDatabaseLookupFlags, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun lookupCertificatesIssuedByFinish(result: AsyncResult): List<TlsCertificate> {
         return stub()
    }
    open fun verifyChain(chain: TlsCertificate, purpose: String, identity: SocketConnectable, interaction: TlsInteraction, flags: TlsDatabaseVerifyFlags, cancellable: Cancellable): TlsCertificateFlags {
         return stub()
    }
    open fun verifyChainAsync(chain: TlsCertificate, purpose: String, identity: SocketConnectable, interaction: TlsInteraction, flags: TlsDatabaseVerifyFlags, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun verifyChainFinish(result: AsyncResult): TlsCertificateFlags {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31851408UL
        fun cptr(obj: TlsDatabase): CPointer<GTlsDatabase> = obj.cptr
    }
}

class TlsDatabaseClass(private val cptr: CPointer<cnames.structs._GTlsDatabaseClass>) /* struct */ {
    companion object {
        fun cptr(obj: TlsDatabaseClass): CPointer<cnames.structs._GTlsDatabaseClass> = obj.cptr
    }
}

typealias TlsDatabaseLookupFlags = GTlsDatabaseLookupFlags

typealias TlsDatabaseVerifyFlags = GTlsDatabaseVerifyFlags

typealias TlsError = GTlsError

interface TlsFileDatabase : InteropWrapper {
    fun new(anchors: String): TlsFileDatabase = stub("TlsFileDatabase default impl")

    companion object {
        fun cptr(obj: TlsFileDatabase): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GTlsFileDatabase>) : TlsFileDatabase {
        override val rawPtr: COpaquePointer = cptr
    }
}

class TlsFileDatabaseInterface(private val cptr: CPointer<cnames.structs._GTlsFileDatabaseInterface>) /* struct */ {
    companion object {
        fun cptr(obj: TlsFileDatabaseInterface): CPointer<cnames.structs._GTlsFileDatabaseInterface> = obj.cptr
    }
}

open class TlsInteraction internal constructor (private val cptr: CPointer<GTlsInteraction>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun askPassword(password: TlsPassword, cancellable: Cancellable): TlsInteractionResult {
         return stub()
    }
    open fun askPasswordAsync(password: TlsPassword, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun askPasswordFinish(result: AsyncResult): TlsInteractionResult {
         return stub()
    }
    open fun invokeAskPassword(password: TlsPassword, cancellable: Cancellable): TlsInteractionResult {
         return stub()
    }
    open fun invokeRequestCertificate(connection: TlsConnection, flags: TlsCertificateRequestFlags, cancellable: Cancellable): TlsInteractionResult {
         return stub()
    }
    open fun requestCertificate(connection: TlsConnection, flags: TlsCertificateRequestFlags, cancellable: Cancellable): TlsInteractionResult {
         return stub()
    }
    open fun requestCertificateAsync(connection: TlsConnection, flags: TlsCertificateRequestFlags, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun requestCertificateFinish(result: AsyncResult): TlsInteractionResult {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33667840UL
        fun cptr(obj: TlsInteraction): CPointer<GTlsInteraction> = obj.cptr
    }
}

class TlsInteractionClass(private val cptr: CPointer<cnames.structs._GTlsInteractionClass>) /* struct */ {
    companion object {
        fun cptr(obj: TlsInteractionClass): CPointer<cnames.structs._GTlsInteractionClass> = obj.cptr
    }
}

typealias TlsInteractionResult = GTlsInteractionResult

open class TlsPassword internal constructor (private val cptr: CPointer<GTlsPassword>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(flags: TlsPasswordFlags, description: String) : this(stub<CPointer<GTlsPassword>>())

    open fun getDescription(): String {
         return stub()
    }
    open fun getFlags(): TlsPasswordFlags {
         return stub()
    }
    open fun getValue(length: ULong): UByte {
         return stub()
    }
    open fun getWarning(): String {
         return stub()
    }
    open fun setDescription(description: String): Unit {
         return stub()
    }
    open fun setFlags(flags: TlsPasswordFlags): Unit {
         return stub()
    }
    open fun setValue(value: List<UByte>, length: Long): Unit {
         return stub()
    }
    open fun setValueFull(value: List<UByte>, length: Long, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setWarning(warning: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31406752UL
        fun cptr(obj: TlsPassword): CPointer<GTlsPassword> = obj.cptr
    }
}

class TlsPasswordClass(private val cptr: CPointer<cnames.structs._GTlsPasswordClass>) /* struct */ {
    companion object {
        fun cptr(obj: TlsPasswordClass): CPointer<cnames.structs._GTlsPasswordClass> = obj.cptr
    }
}

typealias TlsPasswordFlags = GTlsPasswordFlags

typealias TlsRehandshakeMode = GTlsRehandshakeMode

interface TlsServerConnection : InteropWrapper {
    fun new(base_io_stream: IOStream, certificate: TlsCertificate): TlsServerConnection = stub("TlsServerConnection default impl")

    companion object {
        fun cptr(obj: TlsServerConnection): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GTlsServerConnection>) : TlsServerConnection {
        override val rawPtr: COpaquePointer = cptr
    }
}

class TlsServerConnectionInterface(private val cptr: CPointer<cnames.structs._GTlsServerConnectionInterface>) /* struct */ {
    companion object {
        fun cptr(obj: TlsServerConnectionInterface): CPointer<cnames.structs._GTlsServerConnectionInterface> = obj.cptr
    }
}

open class UnixCredentialsMessage internal constructor (private val cptr: CPointer<GUnixCredentialsMessage>) : SocketControlMessage(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GUnixCredentialsMessage>>())

    open fun getCredentials(): Credentials {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32117488UL
        fun cptr(obj: UnixCredentialsMessage): CPointer<GUnixCredentialsMessage> = obj.cptr
        fun newWithCredentials(credentials: Credentials): UnixCredentialsMessage = UnixCredentialsMessage(stub<CPointer<GUnixCredentialsMessage>>()) 
        fun isSupported(): Boolean {
    return stub()
}
    }
}

open class UnixFDList internal constructor (private val cptr: CPointer<GUnixFDList>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GUnixFDList>>())

    open fun append(fd: Int): Int {
         return stub()
    }
    open fun get(index_: Int): Int {
         return stub()
    }
    open fun getLength(): Int {
         return stub()
    }
    open fun peekFds(length: Int): List<Int> {
         return stub()
    }
    open fun stealFds(length: Int): List<Int> {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 40468112UL
        fun cptr(obj: UnixFDList): CPointer<GUnixFDList> = obj.cptr
        fun newFromArray(fds: List<Int>, n_fds: Int): UnixFDList = UnixFDList(stub<CPointer<GUnixFDList>>()) 
    }
}

typealias UnixSocketAddressType = GUnixSocketAddressType

val VFS_EXTENSION_POINT_NAME: String get() = TODO()

val VOLUME_IDENTIFIER_KIND_CLASS: String get() = TODO()

val VOLUME_IDENTIFIER_KIND_HAL_UDI: String get() = TODO()

val VOLUME_IDENTIFIER_KIND_LABEL: String get() = TODO()

val VOLUME_IDENTIFIER_KIND_NFS_MOUNT: String get() = TODO()

val VOLUME_IDENTIFIER_KIND_UNIX_DEVICE: String get() = TODO()

val VOLUME_IDENTIFIER_KIND_UUID: String get() = TODO()

val VOLUME_MONITOR_EXTENSION_POINT_NAME: String get() = TODO()

open class Vfs internal constructor (private val cptr: CPointer<GVfs>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getFileForPath(path: String): File {
         return stub()
    }
    open fun getFileForUri(uri: String): File {
         return stub()
    }
    open fun getSupportedUriSchemes(): List<String> {
         return stub()
    }
    open fun isActive(): Boolean {
         return stub()
    }
    open fun parseName(parse_name: String): File {
         return stub()
    }
    open fun registerUriScheme(scheme: String, uri_func: VfsFileLookupFunc, uri_data: Any, uri_destroy: com.charlag.kgtk.demo.glib.DestroyNotify, parse_name_func: VfsFileLookupFunc, parse_name_data: Any, parse_name_destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Boolean {
         return stub()
    }
    open fun unregisterUriScheme(scheme: String): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31866176UL
        fun cptr(obj: Vfs): CPointer<GVfs> = obj.cptr
        fun getDefault(): Vfs {
    return stub()
}
        fun getLocal(): Vfs {
    return stub()
}
    }
}

class VfsClass(private val cptr: CPointer<cnames.structs._GVfsClass>) /* struct */ {
    companion object {
        fun cptr(obj: VfsClass): CPointer<cnames.structs._GVfsClass> = obj.cptr
    }
}

typealias VfsFileLookupFunc = (vfs:  Vfs, identifier:  String, user_data:  Any) -> File

interface Volume : InteropWrapper {
    fun canEject(): Boolean = stub("Volume default impl")

    fun canMount(): Boolean = stub("Volume default impl")

    fun ejectWithOperation(flags: MountUnmountFlags, mount_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("Volume default impl")

    fun ejectWithOperationFinish(result: AsyncResult): Boolean = stub("Volume default impl")

    fun enumerateIdentifiers(): List<String> = stub("Volume default impl")

    fun getActivationRoot(): File = stub("Volume default impl")

    fun getDrive(): Drive = stub("Volume default impl")

    fun getIcon(): Icon = stub("Volume default impl")

    fun getIdentifier(kind: String): String = stub("Volume default impl")

    fun getMount(): Mount = stub("Volume default impl")

    fun getName(): String = stub("Volume default impl")

    fun getSortKey(): String = stub("Volume default impl")

    fun getSymbolicIcon(): Icon = stub("Volume default impl")

    fun getUuid(): String = stub("Volume default impl")

    fun mount(flags: MountMountFlags, mount_operation: MountOperation, cancellable: Cancellable, callback: AsyncReadyCallback, user_data: Any): Unit = stub("Volume default impl")

    fun mountFinish(result: AsyncResult): Boolean = stub("Volume default impl")

    fun shouldAutomount(): Boolean = stub("Volume default impl")

    companion object {
        fun cptr(obj: Volume): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GVolume>) : Volume {
        override val rawPtr: COpaquePointer = cptr
    }
}

class VolumeIface(private val cptr: CPointer<cnames.structs._GVolumeIface>) /* struct */ {
    companion object {
        fun cptr(obj: VolumeIface): CPointer<cnames.structs._GVolumeIface> = obj.cptr
    }
}

open class VolumeMonitor internal constructor (private val cptr: CPointer<GVolumeMonitor>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getConnectedDrives(): List<Drive> {
         return stub()
    }
    open fun getMountForUuid(uuid: String): Mount {
         return stub()
    }
    open fun getMounts(): List<Mount> {
         return stub()
    }
    open fun getVolumeForUuid(uuid: String): Volume {
         return stub()
    }
    open fun getVolumes(): List<Volume> {
         return stub()
    }
    fun setOnDriveChanged(cb: () -> Unit) {
        do_connect(cptr, "drive-changed", cb)
    }

    fun setOnDriveConnected(cb: () -> Unit) {
        do_connect(cptr, "drive-connected", cb)
    }

    fun setOnDriveDisconnected(cb: () -> Unit) {
        do_connect(cptr, "drive-disconnected", cb)
    }

    fun setOnDriveEjectButton(cb: () -> Unit) {
        do_connect(cptr, "drive-eject-button", cb)
    }

    fun setOnDriveStopButton(cb: () -> Unit) {
        do_connect(cptr, "drive-stop-button", cb)
    }

    fun setOnMountAdded(cb: () -> Unit) {
        do_connect(cptr, "mount-added", cb)
    }

    fun setOnMountChanged(cb: () -> Unit) {
        do_connect(cptr, "mount-changed", cb)
    }

    fun setOnMountPreUnmount(cb: () -> Unit) {
        do_connect(cptr, "mount-pre-unmount", cb)
    }

    fun setOnMountRemoved(cb: () -> Unit) {
        do_connect(cptr, "mount-removed", cb)
    }

    fun setOnVolumeAdded(cb: () -> Unit) {
        do_connect(cptr, "volume-added", cb)
    }

    fun setOnVolumeChanged(cb: () -> Unit) {
        do_connect(cptr, "volume-changed", cb)
    }

    fun setOnVolumeRemoved(cb: () -> Unit) {
        do_connect(cptr, "volume-removed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31483952UL
        fun cptr(obj: VolumeMonitor): CPointer<GVolumeMonitor> = obj.cptr
        fun get(): VolumeMonitor {
    return stub()
}
    }
}

class VolumeMonitorClass(private val cptr: CPointer<cnames.structs._GVolumeMonitorClass>) /* struct */ {
    companion object {
        fun cptr(obj: VolumeMonitorClass): CPointer<cnames.structs._GVolumeMonitorClass> = obj.cptr
    }
}

open class ZlibCompressor internal constructor (private val cptr: CPointer<GZlibCompressor>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Converter, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(format: ZlibCompressorFormat, level: Int) : this(stub<CPointer<GZlibCompressor>>())

    open fun getFileInfo(): FileInfo {
         return stub()
    }
    open fun setFileInfo(file_info: FileInfo): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 41115088UL
        fun cptr(obj: ZlibCompressor): CPointer<GZlibCompressor> = obj.cptr
    }
}

class ZlibCompressorClass(private val cptr: CPointer<cnames.structs._GZlibCompressorClass>) /* struct */ {
    companion object {
        fun cptr(obj: ZlibCompressorClass): CPointer<cnames.structs._GZlibCompressorClass> = obj.cptr
    }
}

typealias ZlibCompressorFormat = GZlibCompressorFormat

open class ZlibDecompressor internal constructor (private val cptr: CPointer<GZlibDecompressor>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Converter, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(format: ZlibCompressorFormat) : this(stub<CPointer<GZlibDecompressor>>())

    open fun getFileInfo(): FileInfo {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33763472UL
        fun cptr(obj: ZlibDecompressor): CPointer<GZlibDecompressor> = obj.cptr
    }
}

class ZlibDecompressorClass(private val cptr: CPointer<cnames.structs._GZlibDecompressorClass>) /* struct */ {
    companion object {
        fun cptr(obj: ZlibDecompressorClass): CPointer<cnames.structs._GZlibDecompressorClass> = obj.cptr
    }
}

fun actionNameIsValid(action_name:  String): Boolean = TODO()
fun actionParseDetailedName(detailed_name:  String, action_name:  String, target_value:  com.charlag.kgtk.demo.glib.Variant): Boolean = TODO()
fun actionPrintDetailedName(action_name:  String, target_value:  com.charlag.kgtk.demo.glib.Variant): String = TODO()
fun appInfoCreateFromCommandline(commandline:  String, application_name:  String, flags:  AppInfoCreateFlags): AppInfo = TODO()
fun appInfoGetAll(): List<AppInfo> = TODO()
fun appInfoGetAllForType(content_type:  String): List<AppInfo> = TODO()
fun appInfoGetDefaultForType(content_type:  String, must_support_uris:  Boolean): AppInfo = TODO()
fun appInfoGetDefaultForUriScheme(uri_scheme:  String): AppInfo = TODO()
fun appInfoGetFallbackForType(content_type:  String): List<AppInfo> = TODO()
fun appInfoGetRecommendedForType(content_type:  String): List<AppInfo> = TODO()
fun appInfoLaunchDefaultForUri(uri:  String, context:  AppLaunchContext): Boolean = TODO()
fun appInfoLaunchDefaultForUriAsync(uri:  String, context:  AppLaunchContext, cancellable:  Cancellable, callback:  AsyncReadyCallback, user_data:  Any): Unit = TODO()
fun appInfoLaunchDefaultForUriFinish(result:  AsyncResult): Boolean = TODO()
fun appInfoResetTypeAssociations(content_type:  String): Unit = TODO()
fun asyncInitableNewvAsync(object_type:  GType, n_parameters:  UInt, parameters:  com.charlag.kgtk.demo.gobject.Parameter, io_priority:  Int, cancellable:  Cancellable, callback:  AsyncReadyCallback, user_data:  Any): Unit = TODO()
fun busGet(bus_type:  BusType, cancellable:  Cancellable, callback:  AsyncReadyCallback, user_data:  Any): Unit = TODO()
fun busGetFinish(res:  AsyncResult): DBusConnection = TODO()
fun busGetSync(bus_type:  BusType, cancellable:  Cancellable): DBusConnection = TODO()
fun busOwnNameOnConnection(connection:  DBusConnection, `name`:  String, flags:  BusNameOwnerFlags, name_acquired_closure:  com.charlag.kgtk.demo.gobject.Closure, name_lost_closure:  com.charlag.kgtk.demo.gobject.Closure): UInt = TODO()
fun busOwnName(bus_type:  BusType, `name`:  String, flags:  BusNameOwnerFlags, bus_acquired_closure:  com.charlag.kgtk.demo.gobject.Closure, name_acquired_closure:  com.charlag.kgtk.demo.gobject.Closure, name_lost_closure:  com.charlag.kgtk.demo.gobject.Closure): UInt = TODO()
fun busUnownName(owner_id:  UInt): Unit = TODO()
fun busUnwatchName(watcher_id:  UInt): Unit = TODO()
fun busWatchNameOnConnection(connection:  DBusConnection, `name`:  String, flags:  BusNameWatcherFlags, name_appeared_closure:  com.charlag.kgtk.demo.gobject.Closure, name_vanished_closure:  com.charlag.kgtk.demo.gobject.Closure): UInt = TODO()
fun busWatchName(bus_type:  BusType, `name`:  String, flags:  BusNameWatcherFlags, name_appeared_closure:  com.charlag.kgtk.demo.gobject.Closure, name_vanished_closure:  com.charlag.kgtk.demo.gobject.Closure): UInt = TODO()
fun contentTypeCanBeExecutable(type:  String): Boolean = TODO()
fun contentTypeEquals(type1:  String, type2:  String): Boolean = TODO()
fun contentTypeFromMimeType(mime_type:  String): String = TODO()
fun contentTypeGetDescription(type:  String): String = TODO()
fun contentTypeGetGenericIconName(type:  String): String = TODO()
fun contentTypeGetIcon(type:  String): Icon = TODO()
fun contentTypeGetMimeDirs(): List<String> = TODO()
fun contentTypeGetMimeType(type:  String): String = TODO()
fun contentTypeGetSymbolicIcon(type:  String): Icon = TODO()
fun contentTypeGuess(filename:  String, data:  List<UByte>, data_size:  ULong, result_uncertain:  Boolean): String = TODO()
fun contentTypeGuessForTree(root:  File): List<String> = TODO()
fun contentTypeIsA(type:  String, supertype:  String): Boolean = TODO()
fun contentTypeIsMimeType(type:  String, mime_type:  String): Boolean = TODO()
fun contentTypeIsUnknown(type:  String): Boolean = TODO()
fun contentTypeSetMimeDirs(dirs:  List<String>): Unit = TODO()
fun contentTypesGetRegistered(): List<String> = TODO()
fun dbusAddressEscapeValue(string:  String): String = TODO()
fun dbusAddressGetForBusSync(bus_type:  BusType, cancellable:  Cancellable): String = TODO()
fun dbusAddressGetStream(address:  String, cancellable:  Cancellable, callback:  AsyncReadyCallback, user_data:  Any): Unit = TODO()
fun dbusAddressGetStreamFinish(res:  AsyncResult, out_guid:  String): IOStream = TODO()
fun dbusAddressGetStreamSync(address:  String, out_guid:  String, cancellable:  Cancellable): IOStream = TODO()
fun dbusAnnotationInfoLookup(annotations:  List<DBusAnnotationInfo>, `name`:  String): String = TODO()
fun dbusErrorEncodeGerror(error:  Error): String = TODO()
fun dbusErrorGetRemoteError(error:  Error): String = TODO()
fun dbusErrorIsRemoteError(error:  Error): Boolean = TODO()
fun dbusErrorNewForDbusError(dbus_error_name:  String, dbus_error_message:  String): Error = TODO()
fun dbusErrorQuark(): UInt = TODO()
fun dbusErrorRegisterError(error_domain:  UInt, error_code:  Int, dbus_error_name:  String): Boolean = TODO()
fun dbusErrorRegisterErrorDomain(error_domain_quark_name:  String, quark_volatile:  ULong, entries:  List<DBusErrorEntry>, num_entries:  UInt): Unit = TODO()
fun dbusErrorStripRemoteError(error:  Error): Boolean = TODO()
fun dbusErrorUnregisterError(error_domain:  UInt, error_code:  Int, dbus_error_name:  String): Boolean = TODO()
fun dbusGenerateGuid(): String = TODO()
fun dbusGvalueToGvariant(gvalue:  com.charlag.kgtk.demo.gobject.Value, type:  com.charlag.kgtk.demo.glib.VariantType): com.charlag.kgtk.demo.glib.Variant = TODO()
fun dbusGvariantToGvalue(value:  com.charlag.kgtk.demo.glib.Variant, out_gvalue:  com.charlag.kgtk.demo.gobject.Value): Unit = TODO()
fun dbusIsAddress(string:  String): Boolean = TODO()
fun dbusIsGuid(string:  String): Boolean = TODO()
fun dbusIsInterfaceName(string:  String): Boolean = TODO()
fun dbusIsMemberName(string:  String): Boolean = TODO()
fun dbusIsName(string:  String): Boolean = TODO()
fun dbusIsSupportedAddress(string:  String): Boolean = TODO()
fun dbusIsUniqueName(string:  String): Boolean = TODO()
fun dtlsClientConnectionNew(base_socket:  DatagramBased, server_identity:  SocketConnectable): DtlsClientConnection = TODO()
fun dtlsServerConnectionNew(base_socket:  DatagramBased, certificate:  TlsCertificate): DtlsServerConnection = TODO()
fun fileNewForCommandlineArg(arg:  String): File = TODO()
fun fileNewForCommandlineArgAndCwd(arg:  String, cwd:  String): File = TODO()
fun fileNewForPath(path:  String): File = TODO()
fun fileNewForUri(uri:  String): File = TODO()
fun fileNewTmp(tmpl:  String, iostream:  FileIOStream): File = TODO()
fun fileParseName(parse_name:  String): File = TODO()
fun iconDeserialize(value:  com.charlag.kgtk.demo.glib.Variant): Icon = TODO()
fun iconHash(icon:  Any): UInt = TODO()
fun iconNewForString(str:  String): Icon = TODO()
fun initableNewv(object_type:  GType, n_parameters:  UInt, parameters:  List<com.charlag.kgtk.demo.gobject.Parameter>, cancellable:  Cancellable): com.charlag.kgtk.demo.gobject.Object = TODO()
fun ioErrorFromErrno(err_no:  Int): IOErrorEnum = TODO()
fun ioErrorQuark(): UInt = TODO()
fun ioExtensionPointImplement(extension_point_name:  String, type:  GType, extension_name:  String, priority:  Int): IOExtension = TODO()
fun ioExtensionPointLookup(`name`:  String): IOExtensionPoint = TODO()
fun ioExtensionPointRegister(`name`:  String): IOExtensionPoint = TODO()
fun ioModulesLoadAllInDirectory(dirname:  String): List<IOModule> = TODO()
fun ioModulesLoadAllInDirectoryWithScope(dirname:  String, scope:  IOModuleScope): List<IOModule> = TODO()
fun ioModulesScanAllInDirectory(dirname:  String): Unit = TODO()
fun ioModulesScanAllInDirectoryWithScope(dirname:  String, scope:  IOModuleScope): Unit = TODO()
fun ioSchedulerCancelAllJobs(): Unit = TODO()
fun ioSchedulerPushJob(job_func:  IOSchedulerJobFunc, user_data:  Any, notify:  com.charlag.kgtk.demo.glib.DestroyNotify, io_priority:  Int, cancellable:  Cancellable): Unit = TODO()
fun memoryMonitorDupDefault(): MemoryMonitor = TODO()
fun networkMonitorGetDefault(): NetworkMonitor = TODO()
fun networkingInit(): Unit = TODO()
fun pollableSourceNew(pollable_stream:  com.charlag.kgtk.demo.gobject.Object): com.charlag.kgtk.demo.glib.Source = TODO()
fun pollableSourceNewFull(pollable_stream:  com.charlag.kgtk.demo.gobject.Object, child_source:  com.charlag.kgtk.demo.glib.Source, cancellable:  Cancellable): com.charlag.kgtk.demo.glib.Source = TODO()
fun pollableStreamRead(stream:  InputStream, buffer:  List<UByte>, count:  ULong, blocking:  Boolean, cancellable:  Cancellable): Long = TODO()
fun pollableStreamWrite(stream:  OutputStream, buffer:  List<UByte>, count:  ULong, blocking:  Boolean, cancellable:  Cancellable): Long = TODO()
fun pollableStreamWriteAll(stream:  OutputStream, buffer:  List<UByte>, count:  ULong, blocking:  Boolean, bytes_written:  ULong, cancellable:  Cancellable): Boolean = TODO()
fun proxyGetDefaultForProtocol(protocol:  String): Proxy = TODO()
fun proxyResolverGetDefault(): ProxyResolver = TODO()
fun resolverErrorQuark(): UInt = TODO()
fun resourceErrorQuark(): UInt = TODO()
fun resourceLoad(filename:  String): Resource = TODO()
fun resourcesEnumerateChildren(path:  String, lookup_flags:  ResourceLookupFlags): List<String> = TODO()
fun resourcesGetInfo(path:  String, lookup_flags:  ResourceLookupFlags, size:  ULong, flags:  UInt): Boolean = TODO()
fun resourcesLookupData(path:  String, lookup_flags:  ResourceLookupFlags): com.charlag.kgtk.demo.glib.Bytes = TODO()
fun resourcesOpenStream(path:  String, lookup_flags:  ResourceLookupFlags): InputStream = TODO()
fun resourcesRegister(resource:  Resource): Unit = TODO()
fun resourcesUnregister(resource:  Resource): Unit = TODO()
fun settingsSchemaSourceGetDefault(): SettingsSchemaSource = TODO()
fun simpleAsyncReportGerrorInIdle(`object`:  com.charlag.kgtk.demo.gobject.Object, callback:  AsyncReadyCallback, user_data:  Any, error:  Error): Unit = TODO()
fun tlsBackendGetDefault(): TlsBackend = TODO()
fun tlsClientConnectionNew(base_io_stream:  IOStream, server_identity:  SocketConnectable): TlsClientConnection = TODO()
fun tlsErrorQuark(): UInt = TODO()
fun tlsFileDatabaseNew(anchors:  String): TlsFileDatabase = TODO()
fun tlsServerConnectionNew(base_io_stream:  IOStream, certificate:  TlsCertificate): TlsServerConnection = TODO()
fun unixIsMountPathSystemInternal(mount_path:  String): Boolean = TODO()
fun unixIsSystemDevicePath(device_path:  String): Boolean = TODO()
fun unixIsSystemFsType(fs_type:  String): Boolean = TODO()
