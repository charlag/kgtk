// Namespace: Gtk
@file:Suppress("RemoveRedundantBackticks", "UNUSED_PARAMETER", "FunctionName", "RedundantUnitReturnType", "unused", "RemoveRedundantQualifierName")
package com.charlag.kgtk.demo.gtk

import com.charlag.kgtk.demo.prelude.*
import gtk3.*
import kotlinx.cinterop.*
import com.charlag.kgtk.demo.prelude.GType

open class AboutDialog internal constructor (private val cptr: CPointer<GtkAboutDialog>) : Dialog(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkAboutDialog>>())

    open fun addCreditSection(section_name: String, people: List<String>): Unit {
         return stub()
    }
    open fun getArtists(): List<String> {
         return stub()
    }
    open fun getAuthors(): List<String> {
         return stub()
    }
    open fun getComments(): String {
         return stub()
    }
    open fun getCopyright(): String {
         return stub()
    }
    open fun getDocumenters(): List<String> {
         return stub()
    }
    open fun getLicense(): String {
         return stub()
    }
    open fun getLicenseType(): License {
         return stub()
    }
    open fun getLogo(): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    open fun getLogoIconName(): String {
         return stub()
    }
    open fun getProgramName(): String {
         return stub()
    }
    open fun getTranslatorCredits(): String {
         return stub()
    }
    open fun getVersion(): String {
         return stub()
    }
    open fun getWebsite(): String {
         return stub()
    }
    open fun getWebsiteLabel(): String {
         return stub()
    }
    open fun getWrapLicense(): Boolean {
         return stub()
    }
    open fun setArtists(artists: List<String>): Unit {
         return stub()
    }
    open fun setAuthors(authors: List<String>): Unit {
         return stub()
    }
    open fun setComments(comments: String): Unit {
         return stub()
    }
    open fun setCopyright(copyright: String): Unit {
         return stub()
    }
    open fun setDocumenters(documenters: List<String>): Unit {
         return stub()
    }
    open fun setLicense(license: String): Unit {
         return stub()
    }
    open fun setLicenseType(license_type: License): Unit {
         return stub()
    }
    open fun setLogo(logo: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): Unit {
         return stub()
    }
    open fun setLogoIconName(icon_name: String): Unit {
         return stub()
    }
    open fun setProgramName(`name`: String): Unit {
         return stub()
    }
    open fun setTranslatorCredits(translator_credits: String): Unit {
         return stub()
    }
    open fun setVersion(version: String): Unit {
         return stub()
    }
    open fun setWebsite(website: String): Unit {
         return stub()
    }
    open fun setWebsiteLabel(website_label: String): Unit {
         return stub()
    }
    open fun setWrapLicense(wrap_license: Boolean): Unit {
         return stub()
    }
    fun setOnActivateLink(cb: () -> Unit) {
        do_connect(cptr, "activate-link", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30874000UL
        fun cptr(obj: AboutDialog): CPointer<GtkAboutDialog> = obj.cptr
    }
}

class AboutDialogClass(private val cptr: CPointer<cnames.structs._GtkAboutDialogClass>) /* struct */ {
    companion object {
        fun cptr(obj: AboutDialogClass): CPointer<cnames.structs._GtkAboutDialogClass> = obj.cptr
    }
}

typealias AccelFlags = GtkAccelFlags

open class AccelGroup internal constructor (private val cptr: CPointer<GtkAccelGroup>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkAccelGroup>>())

    open fun activate(accel_quark: UInt, acceleratable: com.charlag.kgtk.demo.gobject.Object, accel_key: UInt, accel_mods: com.charlag.kgtk.demo.gdk.ModifierType): Boolean {
         return stub()
    }
    open fun connect(accel_key: UInt, accel_mods: com.charlag.kgtk.demo.gdk.ModifierType, accel_flags: AccelFlags, closure: com.charlag.kgtk.demo.gobject.Closure): Unit {
         return stub()
    }
    open fun connectByPath(accel_path: String, closure: com.charlag.kgtk.demo.gobject.Closure): Unit {
         return stub()
    }
    open fun disconnect(closure: com.charlag.kgtk.demo.gobject.Closure): Boolean {
         return stub()
    }
    open fun disconnectKey(accel_key: UInt, accel_mods: com.charlag.kgtk.demo.gdk.ModifierType): Boolean {
         return stub()
    }
    open fun find(find_func: AccelGroupFindFunc, data: Any): AccelKey {
         return stub()
    }
    open fun getIsLocked(): Boolean {
         return stub()
    }
    open fun getModifierMask(): com.charlag.kgtk.demo.gdk.ModifierType {
         return stub()
    }
    open fun lock(): Unit {
         return stub()
    }
    open fun query(accel_key: UInt, accel_mods: com.charlag.kgtk.demo.gdk.ModifierType, n_entries: UInt): List<AccelGroupEntry> {
         return stub()
    }
    open fun unlock(): Unit {
         return stub()
    }
    fun setOnAccelActivate(cb: () -> Unit) {
        do_connect(cptr, "accel-activate", cb)
    }

    fun setOnAccelChanged(cb: () -> Unit) {
        do_connect(cptr, "accel-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31394864UL
        fun cptr(obj: AccelGroup): CPointer<GtkAccelGroup> = obj.cptr
        fun fromAccelClosure(closure: com.charlag.kgtk.demo.gobject.Closure): AccelGroup {
    return stub()
}
    }
}

typealias AccelGroupActivate = (accel_group:  AccelGroup, acceleratable:  com.charlag.kgtk.demo.gobject.Object, keyval:  UInt, modifier:  com.charlag.kgtk.demo.gdk.ModifierType) -> Boolean

class AccelGroupClass(private val cptr: CPointer<cnames.structs._GtkAccelGroupClass>) /* struct */ {
    companion object {
        fun cptr(obj: AccelGroupClass): CPointer<cnames.structs._GtkAccelGroupClass> = obj.cptr
    }
}

class AccelGroupEntry(private val cptr: CPointer<cnames.structs._GtkAccelGroupEntry>) /* struct */ {
    companion object {
        fun cptr(obj: AccelGroupEntry): CPointer<cnames.structs._GtkAccelGroupEntry> = obj.cptr
    }
}

typealias AccelGroupFindFunc = (key:  AccelKey, closure:  com.charlag.kgtk.demo.gobject.Closure, data:  Any) -> Boolean

class AccelKey(private val cptr: CPointer<cnames.structs._GtkAccelKey>) /* struct */ {
    companion object {
        fun cptr(obj: AccelKey): CPointer<cnames.structs._GtkAccelKey> = obj.cptr
    }
}

open class AccelLabel internal constructor (private val cptr: CPointer<GtkAccelLabel>) : Label(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(string: String) : this(stub<CPointer<GtkAccelLabel>>())

    open fun getAccel(accelerator_key: UInt, accelerator_mods: com.charlag.kgtk.demo.gdk.ModifierType): Unit {
         return stub()
    }
    open fun getAccelWidget(): Widget {
         return stub()
    }
    open fun getAccelWidth(): UInt {
         return stub()
    }
    open fun refetch(): Boolean {
         return stub()
    }
    open fun setAccel(accelerator_key: UInt, accelerator_mods: com.charlag.kgtk.demo.gdk.ModifierType): Unit {
         return stub()
    }
    open fun setAccelClosure(accel_closure: com.charlag.kgtk.demo.gobject.Closure): Unit {
         return stub()
    }
    open fun setAccelWidget(accel_widget: Widget): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30833072UL
        fun cptr(obj: AccelLabel): CPointer<GtkAccelLabel> = obj.cptr
    }
}

class AccelLabelClass(private val cptr: CPointer<cnames.structs._GtkAccelLabelClass>) /* struct */ {
    companion object {
        fun cptr(obj: AccelLabelClass): CPointer<cnames.structs._GtkAccelLabelClass> = obj.cptr
    }
}

open class AccelMap internal constructor (private val cptr: CPointer<GtkAccelMap>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    fun setOnChanged(cb: () -> Unit) {
        do_connect(cptr, "changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31619584UL
        fun cptr(obj: AccelMap): CPointer<GtkAccelMap> = obj.cptr
        fun addEntry(accel_path: String, accel_key: UInt, accel_mods: com.charlag.kgtk.demo.gdk.ModifierType): Unit {
    return stub()
}
        fun addFilter(filter_pattern: String): Unit {
    return stub()
}
        fun changeEntry(accel_path: String, accel_key: UInt, accel_mods: com.charlag.kgtk.demo.gdk.ModifierType, replace: Boolean): Boolean {
    return stub()
}
        fun foreach(data: Any, foreach_func: AccelMapForeach): Unit {
    return stub()
}
        fun foreachUnfiltered(data: Any, foreach_func: AccelMapForeach): Unit {
    return stub()
}
        fun get(): AccelMap {
    return stub()
}
        fun load(file_name: String): Unit {
    return stub()
}
        fun loadFd(fd: Int): Unit {
    return stub()
}
        fun loadScanner(scanner: com.charlag.kgtk.demo.glib.Scanner): Unit {
    return stub()
}
        fun lockPath(accel_path: String): Unit {
    return stub()
}
        fun lookupEntry(accel_path: String, key: AccelKey): Boolean {
    return stub()
}
        fun save(file_name: String): Unit {
    return stub()
}
        fun saveFd(fd: Int): Unit {
    return stub()
}
        fun unlockPath(accel_path: String): Unit {
    return stub()
}
    }
}

class AccelMapClass(private val cptr: CPointer<cnames.structs._GtkAccelMapClass>) /* struct */ {
    companion object {
        fun cptr(obj: AccelMapClass): CPointer<cnames.structs._GtkAccelMapClass> = obj.cptr
    }
}

typealias AccelMapForeach = (data:  Any, accel_path:  String, accel_key:  UInt, accel_mods:  com.charlag.kgtk.demo.gdk.ModifierType, changed:  Boolean) -> Unit

open class Accessible internal constructor (private val cptr: CPointer<GtkAccessible>) : com.charlag.kgtk.demo.atk.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getWidget(): Widget {
         return stub()
    }
    open fun setWidget(widget: Widget): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31693568UL
        fun cptr(obj: Accessible): CPointer<GtkAccessible> = obj.cptr
    }
}

class AccessibleClass(private val cptr: CPointer<cnames.structs._GtkAccessibleClass>) /* struct */ {
    companion object {
        fun cptr(obj: AccessibleClass): CPointer<cnames.structs._GtkAccessibleClass> = obj.cptr
    }
}

open class ActionBar internal constructor (private val cptr: CPointer<GtkActionBar>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkActionBar>>())

    open fun getCenterWidget(): Widget {
         return stub()
    }
    open fun packEnd(child: Widget): Unit {
         return stub()
    }
    open fun packStart(child: Widget): Unit {
         return stub()
    }
    open fun setCenterWidget(center_widget: Widget): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31653520UL
        fun cptr(obj: ActionBar): CPointer<GtkActionBar> = obj.cptr
    }
}

class ActionBarClass(private val cptr: CPointer<cnames.structs._GtkActionBarClass>) /* struct */ {
    companion object {
        fun cptr(obj: ActionBarClass): CPointer<cnames.structs._GtkActionBarClass> = obj.cptr
    }
}

interface Actionable : InteropWrapper {
    fun getActionName(): String = stub("Actionable default impl")

    fun getActionTargetValue(): com.charlag.kgtk.demo.glib.Variant = stub("Actionable default impl")

    fun setActionName(action_name: String): Unit = stub("Actionable default impl")

    fun setActionTargetValue(target_value: com.charlag.kgtk.demo.glib.Variant): Unit = stub("Actionable default impl")

    fun setDetailedActionName(detailed_action_name: String): Unit = stub("Actionable default impl")

    companion object {
        fun cptr(obj: Actionable): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkActionable>) : Actionable {
        override val rawPtr: COpaquePointer = cptr
    }
}

class ActionableInterface(private val cptr: CPointer<cnames.structs._GtkActionableInterface>) /* struct */ {
    companion object {
        fun cptr(obj: ActionableInterface): CPointer<cnames.structs._GtkActionableInterface> = obj.cptr
    }
}

interface Activatable : InteropWrapper {
    companion object {
        fun cptr(obj: Activatable): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkActivatable>) : Activatable {
        override val rawPtr: COpaquePointer = cptr
    }
}

class ActivatableIface(private val cptr: CPointer<cnames.structs._GtkActivatableIface>) /* struct */ {
    companion object {
        fun cptr(obj: ActivatableIface): CPointer<cnames.structs._GtkActivatableIface> = obj.cptr
    }
}

open class Adjustment internal constructor (private val cptr: CPointer<GtkAdjustment>) : com.charlag.kgtk.demo.gobject.InitiallyUnowned(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(value: Double, lower: Double, upper: Double, step_increment: Double, page_increment: Double, page_size: Double) : this(stub<CPointer<GtkAdjustment>>())

    open fun clampPage(lower: Double, upper: Double): Unit {
         return stub()
    }
    open fun configure(value: Double, lower: Double, upper: Double, step_increment: Double, page_increment: Double, page_size: Double): Unit {
         return stub()
    }
    open fun getLower(): Double {
         return stub()
    }
    open fun getMinimumIncrement(): Double {
         return stub()
    }
    open fun getPageIncrement(): Double {
         return stub()
    }
    open fun getPageSize(): Double {
         return stub()
    }
    open fun getStepIncrement(): Double {
         return stub()
    }
    open fun getUpper(): Double {
         return stub()
    }
    open fun getValue(): Double {
         return stub()
    }
    open fun setLower(lower: Double): Unit {
         return stub()
    }
    open fun setPageIncrement(page_increment: Double): Unit {
         return stub()
    }
    open fun setPageSize(page_size: Double): Unit {
         return stub()
    }
    open fun setStepIncrement(step_increment: Double): Unit {
         return stub()
    }
    open fun setUpper(upper: Double): Unit {
         return stub()
    }
    open fun setValue(value: Double): Unit {
         return stub()
    }
    fun setOnChanged(cb: () -> Unit) {
        do_connect(cptr, "changed", cb)
    }

    fun setOnValueChanged(cb: () -> Unit) {
        do_connect(cptr, "value-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31818272UL
        fun cptr(obj: Adjustment): CPointer<GtkAdjustment> = obj.cptr
    }
}

class AdjustmentClass(private val cptr: CPointer<cnames.structs._GtkAdjustmentClass>) /* struct */ {
    companion object {
        fun cptr(obj: AdjustmentClass): CPointer<cnames.structs._GtkAdjustmentClass> = obj.cptr
    }
}

typealias Align = GtkAlign

interface AppChooser : InteropWrapper {
    fun getAppInfo(): com.charlag.kgtk.demo.gio.AppInfo = stub("AppChooser default impl")

    fun getContentType(): String = stub("AppChooser default impl")

    fun refresh(): Unit = stub("AppChooser default impl")

    companion object {
        fun cptr(obj: AppChooser): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkAppChooser>) : AppChooser {
        override val rawPtr: COpaquePointer = cptr
    }
}

open class AppChooserButton internal constructor (private val cptr: CPointer<GtkAppChooserButton>) : ComboBox(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, AppChooser, Buildable, CellEditable, CellLayout, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(content_type: String) : this(stub<CPointer<GtkAppChooserButton>>())

    open fun appendCustomItem(`name`: String, label: String, icon: com.charlag.kgtk.demo.gio.Icon): Unit {
         return stub()
    }
    open fun appendSeparator(): Unit {
         return stub()
    }
    open fun getHeading(): String {
         return stub()
    }
    open fun getShowDefaultItem(): Boolean {
         return stub()
    }
    open fun getShowDialogItem(): Boolean {
         return stub()
    }
    open fun setActiveCustomItem(`name`: String): Unit {
         return stub()
    }
    open fun setHeading(heading: String): Unit {
         return stub()
    }
    open fun setShowDefaultItem(setting: Boolean): Unit {
         return stub()
    }
    open fun setShowDialogItem(setting: Boolean): Unit {
         return stub()
    }
    fun setOnCustomItemActivated(cb: () -> Unit) {
        do_connect(cptr, "custom-item-activated", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31705632UL
        fun cptr(obj: AppChooserButton): CPointer<GtkAppChooserButton> = obj.cptr
    }
}

class AppChooserButtonClass(private val cptr: CPointer<cnames.structs._GtkAppChooserButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: AppChooserButtonClass): CPointer<cnames.structs._GtkAppChooserButtonClass> = obj.cptr
    }
}

open class AppChooserDialog internal constructor (private val cptr: CPointer<GtkAppChooserDialog>) : Dialog(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, AppChooser, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(parent: Window, flags: DialogFlags, file: com.charlag.kgtk.demo.gio.File) : this(stub<CPointer<GtkAppChooserDialog>>())

    open fun getHeading(): String {
         return stub()
    }
    open fun getWidget(): Widget {
         return stub()
    }
    open fun setHeading(heading: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31694208UL
        fun cptr(obj: AppChooserDialog): CPointer<GtkAppChooserDialog> = obj.cptr
        fun newForContentType(parent: Window, flags: DialogFlags, content_type: String): AppChooserDialog = AppChooserDialog(stub<CPointer<GtkAppChooserDialog>>()) 
    }
}

class AppChooserDialogClass(private val cptr: CPointer<cnames.structs._GtkAppChooserDialogClass>) /* struct */ {
    companion object {
        fun cptr(obj: AppChooserDialogClass): CPointer<cnames.structs._GtkAppChooserDialogClass> = obj.cptr
    }
}

open class AppChooserWidget internal constructor (private val cptr: CPointer<GtkAppChooserWidget>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, AppChooser, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(content_type: String) : this(stub<CPointer<GtkAppChooserWidget>>())

    open fun getDefaultText(): String {
         return stub()
    }
    open fun getShowAll(): Boolean {
         return stub()
    }
    open fun getShowDefault(): Boolean {
         return stub()
    }
    open fun getShowFallback(): Boolean {
         return stub()
    }
    open fun getShowOther(): Boolean {
         return stub()
    }
    open fun getShowRecommended(): Boolean {
         return stub()
    }
    open fun setDefaultText(text: String): Unit {
         return stub()
    }
    open fun setShowAll(setting: Boolean): Unit {
         return stub()
    }
    open fun setShowDefault(setting: Boolean): Unit {
         return stub()
    }
    open fun setShowFallback(setting: Boolean): Unit {
         return stub()
    }
    open fun setShowOther(setting: Boolean): Unit {
         return stub()
    }
    open fun setShowRecommended(setting: Boolean): Unit {
         return stub()
    }
    fun setOnApplicationActivated(cb: () -> Unit) {
        do_connect(cptr, "application-activated", cb)
    }

    fun setOnApplicationSelected(cb: () -> Unit) {
        do_connect(cptr, "application-selected", cb)
    }

    fun setOnPopulatePopup(cb: () -> Unit) {
        do_connect(cptr, "populate-popup", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31209680UL
        fun cptr(obj: AppChooserWidget): CPointer<GtkAppChooserWidget> = obj.cptr
    }
}

class AppChooserWidgetClass(private val cptr: CPointer<cnames.structs._GtkAppChooserWidgetClass>) /* struct */ {
    companion object {
        fun cptr(obj: AppChooserWidgetClass): CPointer<cnames.structs._GtkAppChooserWidgetClass> = obj.cptr
    }
}

open class Application internal constructor (private val cptr: CPointer<GtkApplication>) : com.charlag.kgtk.demo.gio.Application(cptr.reinterpret()), com.charlag.kgtk.demo.gio.ActionGroup, com.charlag.kgtk.demo.gio.ActionMap, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(application_id: String, flags: com.charlag.kgtk.demo.gio.ApplicationFlags) : this(memScoped { gtk_application_new(application_id, flags)!! })

    open fun addWindow(window: Window): Unit {
         return memScoped { gtk_application_add_window(cptr, Window.cptr(window))!! }
    }
    open fun getAccelsForAction(detailed_action_name: String): List<String> {
         return memScoped { gtk_application_get_accels_for_action(cptr, detailed_action_name)!! }.arrayToList().map { it.toKString() }
    }
    open fun getActionsForAccel(accel: String): List<String> {
         return memScoped { gtk_application_get_actions_for_accel(cptr, accel)!! }.arrayToList().map { it.toKString() }
    }
    open fun getActiveWindow(): Window {
         return Window(memScoped { gtk_application_get_active_window(cptr)!! })
    }
    open fun getAppMenu(): com.charlag.kgtk.demo.gio.MenuModel {
         return com.charlag.kgtk.demo.gio.MenuModel(memScoped { gtk_application_get_app_menu(cptr)!! })
    }
    open fun getMenuById(id: String): com.charlag.kgtk.demo.gio.Menu {
         return com.charlag.kgtk.demo.gio.Menu(memScoped { gtk_application_get_menu_by_id(cptr, id)!! })
    }
    open fun getMenubar(): com.charlag.kgtk.demo.gio.MenuModel {
         return com.charlag.kgtk.demo.gio.MenuModel(memScoped { gtk_application_get_menubar(cptr)!! })
    }
    open fun getWindowById(id: UInt): Window {
         return Window(memScoped { gtk_application_get_window_by_id(cptr, id)!! })
    }
    open fun getWindows(): List<Window> {
         return memScoped { gtk_application_get_windows(cptr)!! }.toList<GtkWindow>().map { Window(it) }
    }
    open fun inhibit(window: Window, flags: ApplicationInhibitFlags, reason: String): UInt {
         return memScoped { gtk_application_inhibit(cptr, Window.cptr(window), flags, reason)!! }
    }
    open fun isInhibited(flags: ApplicationInhibitFlags): Boolean {
         return memScoped { gtk_application_is_inhibited(cptr, flags)!! } != 0
    }
    open fun listActionDescriptions(): List<String> {
         return memScoped { gtk_application_list_action_descriptions(cptr)!! }.arrayToList().map { it.toKString() }
    }
    open fun prefersAppMenu(): Boolean {
         return memScoped { gtk_application_prefers_app_menu(cptr)!! } != 0
    }
    open fun removeWindow(window: Window): Unit {
         return memScoped { gtk_application_remove_window(cptr, Window.cptr(window))!! }
    }
    open fun setAccelsForAction(detailed_action_name: String, accels: List<String>): Unit {
         return memScoped { gtk_application_set_accels_for_action(cptr, detailed_action_name, accels.toCStringArray(this))!! }
    }
    open fun setAppMenu(app_menu: com.charlag.kgtk.demo.gio.MenuModel): Unit {
         return memScoped { gtk_application_set_app_menu(cptr, com.charlag.kgtk.demo.gio.MenuModel.cptr(app_menu))!! }
    }
    open fun setMenubar(menubar: com.charlag.kgtk.demo.gio.MenuModel): Unit {
         return memScoped { gtk_application_set_menubar(cptr, com.charlag.kgtk.demo.gio.MenuModel.cptr(menubar))!! }
    }
    open fun uninhibit(cookie: UInt): Unit {
         return memScoped { gtk_application_uninhibit(cptr, cookie)!! }
    }
    fun setOnQueryEnd(cb: () -> Unit) {
        do_connect(cptr, "query-end", cb)
    }

    fun setOnWindowAdded(cb: () -> Unit) {
        do_connect(cptr, "window-added", cb)
    }

    fun setOnWindowRemoved(cb: () -> Unit) {
        do_connect(cptr, "window-removed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31476096UL
        fun cptr(obj: Application): CPointer<GtkApplication> = obj.cptr
    }
}

class ApplicationClass(private val cptr: CPointer<cnames.structs._GtkApplicationClass>) /* struct */ {
    companion object {
        fun cptr(obj: ApplicationClass): CPointer<cnames.structs._GtkApplicationClass> = obj.cptr
    }
}

typealias ApplicationInhibitFlags = GtkApplicationInhibitFlags

open class ApplicationWindow internal constructor (private val cptr: CPointer<GtkApplicationWindow>) : Window(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, com.charlag.kgtk.demo.gio.ActionGroup, com.charlag.kgtk.demo.gio.ActionMap, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(application: Application) : this(memScoped { gtk_application_window_new(Application.cptr(application))!! }.reinterpret())

    open fun getHelpOverlay(): ShortcutsWindow {
         return ShortcutsWindow(memScoped { gtk_application_window_get_help_overlay(cptr)!! })
    }
    open fun getId(): UInt {
         return memScoped { gtk_application_window_get_id(cptr)!! }
    }
    open fun getShowMenubar(): Boolean {
         return memScoped { gtk_application_window_get_show_menubar(cptr)!! } != 0
    }
    open fun setHelpOverlay(help_overlay: ShortcutsWindow): Unit {
         return memScoped { gtk_application_window_set_help_overlay(cptr, ShortcutsWindow.cptr(help_overlay))!! }
    }
    open fun setShowMenubar(show_menubar: Boolean): Unit {
         return memScoped { gtk_application_window_set_show_menubar(cptr, show_menubar.asGboolean())!! }
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31251184UL
        fun cptr(obj: ApplicationWindow): CPointer<GtkApplicationWindow> = obj.cptr
    }
}

class ApplicationWindowClass(private val cptr: CPointer<cnames.structs._GtkApplicationWindowClass>) /* struct */ {
    companion object {
        fun cptr(obj: ApplicationWindowClass): CPointer<cnames.structs._GtkApplicationWindowClass> = obj.cptr
    }
}

typealias ArrowPlacement = GtkArrowPlacement

typealias ArrowType = GtkArrowType

open class AspectFrame internal constructor (private val cptr: CPointer<GtkAspectFrame>) : Frame(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(label: String, xalign: Float, yalign: Float, ratio: Float, obey_child: Boolean) : this(stub<CPointer<GtkAspectFrame>>())

    open fun set(xalign: Float, yalign: Float, ratio: Float, obey_child: Boolean): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31456240UL
        fun cptr(obj: AspectFrame): CPointer<GtkAspectFrame> = obj.cptr
    }
}

class AspectFrameClass(private val cptr: CPointer<cnames.structs._GtkAspectFrameClass>) /* struct */ {
    companion object {
        fun cptr(obj: AspectFrameClass): CPointer<cnames.structs._GtkAspectFrameClass> = obj.cptr
    }
}

open class Assistant internal constructor (private val cptr: CPointer<GtkAssistant>) : Window(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkAssistant>>())

    open fun addActionWidget(child: Widget): Unit {
         return stub()
    }
    open fun appendPage(page: Widget): Int {
         return stub()
    }
    open fun commit(): Unit {
         return stub()
    }
    open fun getCurrentPage(): Int {
         return stub()
    }
    open fun getNPages(): Int {
         return stub()
    }
    open fun getNthPage(page_num: Int): Widget {
         return stub()
    }
    open fun getPageComplete(page: Widget): Boolean {
         return stub()
    }
    open fun getPageHasPadding(page: Widget): Boolean {
         return stub()
    }
    open fun getPageTitle(page: Widget): String {
         return stub()
    }
    open fun getPageType(page: Widget): AssistantPageType {
         return stub()
    }
    open fun insertPage(page: Widget, position: Int): Int {
         return stub()
    }
    open fun nextPage(): Unit {
         return stub()
    }
    open fun prependPage(page: Widget): Int {
         return stub()
    }
    open fun previousPage(): Unit {
         return stub()
    }
    open fun removeActionWidget(child: Widget): Unit {
         return stub()
    }
    open fun removePage(page_num: Int): Unit {
         return stub()
    }
    open fun setCurrentPage(page_num: Int): Unit {
         return stub()
    }
    open fun setForwardPageFunc(page_func: AssistantPageFunc, data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setPageComplete(page: Widget, complete: Boolean): Unit {
         return stub()
    }
    open fun setPageHasPadding(page: Widget, has_padding: Boolean): Unit {
         return stub()
    }
    open fun setPageTitle(page: Widget, title: String): Unit {
         return stub()
    }
    open fun setPageType(page: Widget, type: AssistantPageType): Unit {
         return stub()
    }
    open fun updateButtonsState(): Unit {
         return stub()
    }
    fun setOnApply(cb: () -> Unit) {
        do_connect(cptr, "apply", cb)
    }

    fun setOnCancel(cb: () -> Unit) {
        do_connect(cptr, "cancel", cb)
    }

    fun setOnClose(cb: () -> Unit) {
        do_connect(cptr, "close", cb)
    }

    fun setOnEscape(cb: () -> Unit) {
        do_connect(cptr, "escape", cb)
    }

    fun setOnPrepare(cb: () -> Unit) {
        do_connect(cptr, "prepare", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31257712UL
        fun cptr(obj: Assistant): CPointer<GtkAssistant> = obj.cptr
    }
}

class AssistantClass(private val cptr: CPointer<cnames.structs._GtkAssistantClass>) /* struct */ {
    companion object {
        fun cptr(obj: AssistantClass): CPointer<cnames.structs._GtkAssistantClass> = obj.cptr
    }
}

typealias AssistantPageFunc = (current_page:  Int, data:  Any) -> Int

typealias AssistantPageType = GtkAssistantPageType

typealias AttachOptions = GtkAttachOptions

val BINARY_AGE: Int get() = TODO()

typealias BaselinePosition = GtkBaselinePosition

open class Bin internal constructor (private val cptr: CPointer<GtkBin>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getChild(): Widget {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30727200UL
        fun cptr(obj: Bin): CPointer<GtkBin> = obj.cptr
    }
}

class BinClass(private val cptr: CPointer<cnames.structs._GtkBinClass>) /* struct */ {
    companion object {
        fun cptr(obj: BinClass): CPointer<cnames.structs._GtkBinClass> = obj.cptr
    }
}

class BindingArg(private val cptr: CPointer<cnames.structs._GtkBindingArg>) /* struct */ {
    companion object {
        fun cptr(obj: BindingArg): CPointer<cnames.structs._GtkBindingArg> = obj.cptr
    }
}

class BindingEntry(private val cptr: CPointer<cnames.structs._GtkBindingEntry>) /* struct */ {
    fun addSignalFromString(binding_set: BindingSet, signal_desc: String): com.charlag.kgtk.demo.glib.TokenType {
         return stub()
    }
    fun addSignall(binding_set: BindingSet, keyval: UInt, modifiers: com.charlag.kgtk.demo.gdk.ModifierType, signal_name: String, binding_args: List<BindingArg>): Unit {
         return stub()
    }
    fun remove(binding_set: BindingSet, keyval: UInt, modifiers: com.charlag.kgtk.demo.gdk.ModifierType): Unit {
         return stub()
    }
    fun skip(binding_set: BindingSet, keyval: UInt, modifiers: com.charlag.kgtk.demo.gdk.ModifierType): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: BindingEntry): CPointer<cnames.structs._GtkBindingEntry> = obj.cptr
    }
}

class BindingSet(private val cptr: CPointer<cnames.structs._GtkBindingSet>) /* struct */ {
    fun activate(keyval: UInt, modifiers: com.charlag.kgtk.demo.gdk.ModifierType, `object`: com.charlag.kgtk.demo.gobject.Object): Boolean {
         return stub()
    }
    fun addPath(path_type: PathType, path_pattern: String, priority: PathPriorityType): Unit {
         return stub()
    }
    fun find(set_name: String): BindingSet {
         return stub()
    }
    companion object {
        fun cptr(obj: BindingSet): CPointer<cnames.structs._GtkBindingSet> = obj.cptr
    }
}

class BindingSignal(private val cptr: CPointer<cnames.structs._GtkBindingSignal>) /* struct */ {
    companion object {
        fun cptr(obj: BindingSignal): CPointer<cnames.structs._GtkBindingSignal> = obj.cptr
    }
}

class Border(private val cptr: CPointer<cnames.structs._GtkBorder>) /* struct */ {
    fun new(): Border {
         return stub()
    }
    fun copy(): Border {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Border): CPointer<cnames.structs._GtkBorder> = obj.cptr
    }
}

typealias BorderStyle = GtkBorderStyle

open class Box internal constructor (private val cptr: CPointer<GtkBox>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(orientation: Orientation, spacing: Int) : this(memScoped { gtk_box_new(orientation, spacing)!! }.reinterpret())

    open fun getBaselinePosition(): BaselinePosition {
         return memScoped { gtk_box_get_baseline_position(cptr)!! }
    }
    open fun getCenterWidget(): Widget {
         return Widget(memScoped { gtk_box_get_center_widget(cptr)!! })
    }
    open fun getHomogeneous(): Boolean {
         return memScoped { gtk_box_get_homogeneous(cptr)!! } != 0
    }
    open fun getSpacing(): Int {
         return memScoped { gtk_box_get_spacing(cptr)!! }
    }
    open fun packEnd(child: Widget, expand: Boolean, fill: Boolean, padding: UInt): Unit {
         return memScoped { gtk_box_pack_end(cptr, Widget.cptr(child), expand.asGboolean(), fill.asGboolean(), padding)!! }
    }
    open fun packStart(child: Widget, expand: Boolean, fill: Boolean, padding: UInt): Unit {
         return memScoped { gtk_box_pack_start(cptr, Widget.cptr(child), expand.asGboolean(), fill.asGboolean(), padding)!! }
    }
    open fun queryChildPacking(child: Widget, expand: Boolean, fill: Boolean, padding: UInt, pack_type: PackType): Unit {
         return memScoped { gtk_box_query_child_packing(cptr, Widget.cptr(child), stub("non-in param"), stub("non-in param"), stub("non-in param"), stub("non-in param"))!! }
    }
    open fun reorderChild(child: Widget, position: Int): Unit {
         return memScoped { gtk_box_reorder_child(cptr, Widget.cptr(child), position)!! }
    }
    open fun setBaselinePosition(position: BaselinePosition): Unit {
         return memScoped { gtk_box_set_baseline_position(cptr, position)!! }
    }
    open fun setCenterWidget(widget: Widget): Unit {
         return memScoped { gtk_box_set_center_widget(cptr, Widget.cptr(widget))!! }
    }
    open fun setChildPacking(child: Widget, expand: Boolean, fill: Boolean, padding: UInt, pack_type: PackType): Unit {
         return memScoped { gtk_box_set_child_packing(cptr, Widget.cptr(child), expand.asGboolean(), fill.asGboolean(), padding, pack_type)!! }
    }
    open fun setHomogeneous(homogeneous: Boolean): Unit {
         return memScoped { gtk_box_set_homogeneous(cptr, homogeneous.asGboolean())!! }
    }
    open fun setSpacing(spacing: Int): Unit {
         return memScoped { gtk_box_set_spacing(cptr, spacing)!! }
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30848384UL
        fun cptr(obj: Box): CPointer<GtkBox> = obj.cptr
    }
}

class BoxClass(private val cptr: CPointer<cnames.structs._GtkBoxClass>) /* struct */ {
    companion object {
        fun cptr(obj: BoxClass): CPointer<cnames.structs._GtkBoxClass> = obj.cptr
    }
}

interface Buildable : InteropWrapper {
    fun addChild(builder: Builder, child: com.charlag.kgtk.demo.gobject.Object, type: String): Unit = stub("Buildable default impl")

    fun constructChild(builder: Builder, `name`: String): com.charlag.kgtk.demo.gobject.Object = stub("Buildable default impl")

    fun customFinished(builder: Builder, child: com.charlag.kgtk.demo.gobject.Object, tagname: String, data: Any): Unit = stub("Buildable default impl")

    fun customTagEnd(builder: Builder, child: com.charlag.kgtk.demo.gobject.Object, tagname: String, data: Any): Unit = stub("Buildable default impl")

    fun customTagStart(builder: Builder, child: com.charlag.kgtk.demo.gobject.Object, tagname: String, parser: com.charlag.kgtk.demo.glib.MarkupParser, data: Any): Boolean = stub("Buildable default impl")

    fun getInternalChild(builder: Builder, childname: String): com.charlag.kgtk.demo.gobject.Object = stub("Buildable default impl")

    fun getName(): String = stub("Buildable default impl")

    fun parserFinished(builder: Builder): Unit = stub("Buildable default impl")

    fun setBuildableProperty(builder: Builder, `name`: String, value: com.charlag.kgtk.demo.gobject.Value): Unit = stub("Buildable default impl")

    fun setName(`name`: String): Unit = stub("Buildable default impl")

    companion object {
        fun cptr(obj: Buildable): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkBuildable>) : Buildable {
        override val rawPtr: COpaquePointer = cptr
    }
}

class BuildableIface(private val cptr: CPointer<cnames.structs._GtkBuildableIface>) /* struct */ {
    companion object {
        fun cptr(obj: BuildableIface): CPointer<cnames.structs._GtkBuildableIface> = obj.cptr
    }
}

open class Builder internal constructor (private val cptr: CPointer<GtkBuilder>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkBuilder>>())

    open fun addCallbackSymbol(callback_name: String, callback_symbol: com.charlag.kgtk.demo.gobject.Callback): Unit {
         return stub()
    }
    open fun addFromFile(filename: String): UInt {
         return stub()
    }
    open fun addFromResource(resource_path: String): UInt {
         return stub()
    }
    open fun addFromString(buffer: String, length: ULong): UInt {
         return stub()
    }
    open fun addObjectsFromFile(filename: String, object_ids: List<String>): UInt {
         return stub()
    }
    open fun addObjectsFromResource(resource_path: String, object_ids: List<String>): UInt {
         return stub()
    }
    open fun addObjectsFromString(buffer: String, length: ULong, object_ids: List<String>): UInt {
         return stub()
    }
    open fun connectSignals(user_data: Any): Unit {
         return stub()
    }
    open fun connectSignalsFull(func: BuilderConnectFunc, user_data: Any): Unit {
         return stub()
    }
    open fun exposeObject(`name`: String, `object`: com.charlag.kgtk.demo.gobject.Object): Unit {
         return stub()
    }
    open fun extendWithTemplate(widget: Widget, template_type: GType, buffer: String, length: ULong): UInt {
         return stub()
    }
    open fun getApplication(): Application {
         return stub()
    }
    open fun getObject(`name`: String): com.charlag.kgtk.demo.gobject.Object {
         return stub()
    }
    open fun getObjects(): List<com.charlag.kgtk.demo.gobject.Object> {
         return stub()
    }
    open fun getTranslationDomain(): String {
         return stub()
    }
    open fun getTypeFromName(type_name: String): GType {
         return stub()
    }
    open fun setApplication(application: Application): Unit {
         return stub()
    }
    open fun setTranslationDomain(domain: String): Unit {
         return stub()
    }
    open fun valueFromString(pspec: com.charlag.kgtk.demo.gobject.ParamSpec, string: String, value: com.charlag.kgtk.demo.gobject.Value): Boolean {
         return stub()
    }
    open fun valueFromStringType(type: GType, string: String, value: com.charlag.kgtk.demo.gobject.Value): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30705568UL
        fun cptr(obj: Builder): CPointer<GtkBuilder> = obj.cptr
        fun newFromFile(filename: String): Builder = Builder(stub<CPointer<GtkBuilder>>()) 
        fun newFromResource(resource_path: String): Builder = Builder(stub<CPointer<GtkBuilder>>()) 
        fun newFromString(string: String, length: Long): Builder = Builder(stub<CPointer<GtkBuilder>>()) 
    }
}

class BuilderClass(private val cptr: CPointer<cnames.structs._GtkBuilderClass>) /* struct */ {
    companion object {
        fun cptr(obj: BuilderClass): CPointer<cnames.structs._GtkBuilderClass> = obj.cptr
    }
}

typealias BuilderConnectFunc = (builder:  Builder, `object`:  com.charlag.kgtk.demo.gobject.Object, signal_name:  String, handler_name:  String, connect_object:  com.charlag.kgtk.demo.gobject.Object, flags:  com.charlag.kgtk.demo.gobject.ConnectFlags, user_data:  Any) -> Unit

typealias BuilderError = GtkBuilderError

open class Button internal constructor (private val cptr: CPointer<GtkButton>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(memScoped { gtk_button_new()!! }.reinterpret())

// TODO: constructor new_from_icon_name(), int in typelib, enum in C
    open fun clicked(): Unit {
         return memScoped { gtk_button_clicked(cptr)!! }
    }
    open fun getAlwaysShowImage(): Boolean {
         return memScoped { gtk_button_get_always_show_image(cptr)!! } != 0
    }
    open fun getEventWindow(): com.charlag.kgtk.demo.gdk.Window {
         return com.charlag.kgtk.demo.gdk.Window(memScoped { gtk_button_get_event_window(cptr)!! })
    }
    open fun getImage(): Widget {
         return Widget(memScoped { gtk_button_get_image(cptr)!! })
    }
    open fun getImagePosition(): PositionType {
         return memScoped { gtk_button_get_image_position(cptr)!! }
    }
    open fun getLabel(): String {
         return memScoped { gtk_button_get_label(cptr)!! }.toKString()
    }
    open fun getRelief(): ReliefStyle {
         return memScoped { gtk_button_get_relief(cptr)!! }
    }
    open fun getUseUnderline(): Boolean {
         return memScoped { gtk_button_get_use_underline(cptr)!! } != 0
    }
    open fun setAlwaysShowImage(always_show: Boolean): Unit {
         return memScoped { gtk_button_set_always_show_image(cptr, always_show.asGboolean())!! }
    }
    open fun setImage(image: Widget): Unit {
         return memScoped { gtk_button_set_image(cptr, Widget.cptr(image))!! }
    }
    open fun setImagePosition(position: PositionType): Unit {
         return memScoped { gtk_button_set_image_position(cptr, position)!! }
    }
    open fun setLabel(label: String): Unit {
         return memScoped { gtk_button_set_label(cptr, label)!! }
    }
    open fun setRelief(relief: ReliefStyle): Unit {
         return memScoped { gtk_button_set_relief(cptr, relief)!! }
    }
    open fun setUseUnderline(use_underline: Boolean): Unit {
         return memScoped { gtk_button_set_use_underline(cptr, use_underline.asGboolean())!! }
    }
    fun setOnActivate(cb: () -> Unit) {
        do_connect(cptr, "activate", cb)
    }

    fun setOnClicked(cb: () -> Unit) {
        do_connect(cptr, "clicked", cb)
    }

    fun setOnEnter(cb: () -> Unit) {
        do_connect(cptr, "enter", cb)
    }

    fun setOnLeave(cb: () -> Unit) {
        do_connect(cptr, "leave", cb)
    }

    fun setOnPressed(cb: () -> Unit) {
        do_connect(cptr, "pressed", cb)
    }

    fun setOnReleased(cb: () -> Unit) {
        do_connect(cptr, "released", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31360592UL
        fun cptr(obj: Button): CPointer<GtkButton> = obj.cptr
        fun newWithLabel(label: String): Button = Button(memScoped { gtk_button_new_with_label(label)!! }.reinterpret()) 
        fun newWithMnemonic(label: String): Button = Button(memScoped { gtk_button_new_with_mnemonic(label)!! }.reinterpret()) 
    }
}

open class ButtonBox internal constructor (private val cptr: CPointer<GtkButtonBox>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(orientation: Orientation) : this(memScoped { gtk_button_box_new(orientation)!! }.reinterpret())

    open fun getChildNonHomogeneous(child: Widget): Boolean {
         return memScoped { gtk_button_box_get_child_non_homogeneous(cptr, Widget.cptr(child))!! } != 0
    }
    open fun getChildSecondary(child: Widget): Boolean {
         return memScoped { gtk_button_box_get_child_secondary(cptr, Widget.cptr(child))!! } != 0
    }
    open fun getLayout(): ButtonBoxStyle {
         return memScoped { gtk_button_box_get_layout(cptr)!! }
    }
    open fun setChildNonHomogeneous(child: Widget, non_homogeneous: Boolean): Unit {
         return memScoped { gtk_button_box_set_child_non_homogeneous(cptr, Widget.cptr(child), non_homogeneous.asGboolean())!! }
    }
    open fun setChildSecondary(child: Widget, is_secondary: Boolean): Unit {
         return memScoped { gtk_button_box_set_child_secondary(cptr, Widget.cptr(child), is_secondary.asGboolean())!! }
    }
    open fun setLayout(layout_style: ButtonBoxStyle): Unit {
         return memScoped { gtk_button_box_set_layout(cptr, layout_style)!! }
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31549952UL
        fun cptr(obj: ButtonBox): CPointer<GtkButtonBox> = obj.cptr
    }
}

class ButtonBoxClass(private val cptr: CPointer<cnames.structs._GtkButtonBoxClass>) /* struct */ {
    companion object {
        fun cptr(obj: ButtonBoxClass): CPointer<cnames.structs._GtkButtonBoxClass> = obj.cptr
    }
}

typealias ButtonBoxStyle = GtkButtonBoxStyle

class ButtonClass(private val cptr: CPointer<cnames.structs._GtkButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: ButtonClass): CPointer<cnames.structs._GtkButtonClass> = obj.cptr
    }
}

typealias ButtonRole = GtkButtonRole

typealias ButtonsType = GtkButtonsType

open class Calendar internal constructor (private val cptr: CPointer<GtkCalendar>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCalendar>>())

    open fun clearMarks(): Unit {
         return stub()
    }
    open fun getDate(year: UInt, month: UInt, day: UInt): Unit {
         return stub()
    }
    open fun getDayIsMarked(day: UInt): Boolean {
         return stub()
    }
    open fun getDetailHeightRows(): Int {
         return stub()
    }
    open fun getDetailWidthChars(): Int {
         return stub()
    }
    open fun getDisplayOptions(): CalendarDisplayOptions {
         return stub()
    }
    open fun markDay(day: UInt): Unit {
         return stub()
    }
    open fun selectDay(day: UInt): Unit {
         return stub()
    }
    open fun selectMonth(month: UInt, year: UInt): Unit {
         return stub()
    }
    open fun setDetailFunc(func: CalendarDetailFunc, data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setDetailHeightRows(rows: Int): Unit {
         return stub()
    }
    open fun setDetailWidthChars(chars: Int): Unit {
         return stub()
    }
    open fun setDisplayOptions(flags: CalendarDisplayOptions): Unit {
         return stub()
    }
    open fun unmarkDay(day: UInt): Unit {
         return stub()
    }
    fun setOnDaySelected(cb: () -> Unit) {
        do_connect(cptr, "day-selected", cb)
    }

    fun setOnDaySelectedDoubleClick(cb: () -> Unit) {
        do_connect(cptr, "day-selected-double-click", cb)
    }

    fun setOnMonthChanged(cb: () -> Unit) {
        do_connect(cptr, "month-changed", cb)
    }

    fun setOnNextMonth(cb: () -> Unit) {
        do_connect(cptr, "next-month", cb)
    }

    fun setOnNextYear(cb: () -> Unit) {
        do_connect(cptr, "next-year", cb)
    }

    fun setOnPrevMonth(cb: () -> Unit) {
        do_connect(cptr, "prev-month", cb)
    }

    fun setOnPrevYear(cb: () -> Unit) {
        do_connect(cptr, "prev-year", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31281920UL
        fun cptr(obj: Calendar): CPointer<GtkCalendar> = obj.cptr
    }
}

class CalendarClass(private val cptr: CPointer<cnames.structs._GtkCalendarClass>) /* struct */ {
    companion object {
        fun cptr(obj: CalendarClass): CPointer<cnames.structs._GtkCalendarClass> = obj.cptr
    }
}

typealias CalendarDetailFunc = (calendar:  Calendar, year:  UInt, month:  UInt, day:  UInt, user_data:  Any) -> String

typealias CalendarDisplayOptions = GtkCalendarDisplayOptions

typealias Callback = (widget:  Widget, data:  Any) -> Unit

typealias CellAllocCallback = (renderer:  CellRenderer, cell_area:  com.charlag.kgtk.demo.gdk.Rectangle, cell_background:  com.charlag.kgtk.demo.gdk.Rectangle, data:  Any) -> Boolean

open class CellArea internal constructor (private val cptr: CPointer<GtkCellArea>) : com.charlag.kgtk.demo.gobject.InitiallyUnowned(cptr.reinterpret()), Buildable, CellLayout, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun activate(context: CellAreaContext, widget: Widget, cell_area: com.charlag.kgtk.demo.gdk.Rectangle, flags: CellRendererState, edit_only: Boolean): Boolean {
         return stub()
    }
    open fun activateCell(widget: Widget, renderer: CellRenderer, event: com.charlag.kgtk.demo.gdk.Event, cell_area: com.charlag.kgtk.demo.gdk.Rectangle, flags: CellRendererState): Boolean {
         return stub()
    }
    open fun add(renderer: CellRenderer): Unit {
         return stub()
    }
    open fun addFocusSibling(renderer: CellRenderer, sibling: CellRenderer): Unit {
         return stub()
    }
    open fun applyAttributes(tree_model: TreeModel, iter: TreeIter, is_expander: Boolean, is_expanded: Boolean): Unit {
         return stub()
    }
    open fun attributeConnect(renderer: CellRenderer, attribute: String, column: Int): Unit {
         return stub()
    }
    open fun attributeDisconnect(renderer: CellRenderer, attribute: String): Unit {
         return stub()
    }
    open fun attributeGetColumn(renderer: CellRenderer, attribute: String): Int {
         return stub()
    }
    open fun cellGetProperty(renderer: CellRenderer, property_name: String, value: com.charlag.kgtk.demo.gobject.Value): Unit {
         return stub()
    }
    open fun cellSetProperty(renderer: CellRenderer, property_name: String, value: com.charlag.kgtk.demo.gobject.Value): Unit {
         return stub()
    }
    open fun copyContext(context: CellAreaContext): CellAreaContext {
         return stub()
    }
    open fun createContext(): CellAreaContext {
         return stub()
    }
    open fun event(context: CellAreaContext, widget: Widget, event: com.charlag.kgtk.demo.gdk.Event, cell_area: com.charlag.kgtk.demo.gdk.Rectangle, flags: CellRendererState): Int {
         return stub()
    }
    open fun focus(direction: DirectionType): Boolean {
         return stub()
    }
    open fun foreach(callback: CellCallback, callback_data: Any): Unit {
         return stub()
    }
    open fun foreachAlloc(context: CellAreaContext, widget: Widget, cell_area: com.charlag.kgtk.demo.gdk.Rectangle, background_area: com.charlag.kgtk.demo.gdk.Rectangle, callback: CellAllocCallback, callback_data: Any): Unit {
         return stub()
    }
    open fun getCellAllocation(context: CellAreaContext, widget: Widget, renderer: CellRenderer, cell_area: com.charlag.kgtk.demo.gdk.Rectangle, allocation: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun getCellAtPosition(context: CellAreaContext, widget: Widget, cell_area: com.charlag.kgtk.demo.gdk.Rectangle, x: Int, y: Int, alloc_area: com.charlag.kgtk.demo.gdk.Rectangle): CellRenderer {
         return stub()
    }
    open fun getCurrentPathString(): String {
         return stub()
    }
    open fun getEditWidget(): CellEditable {
         return stub()
    }
    open fun getEditedCell(): CellRenderer {
         return stub()
    }
    open fun getFocusCell(): CellRenderer {
         return stub()
    }
    open fun getFocusFromSibling(renderer: CellRenderer): CellRenderer {
         return stub()
    }
    open fun getFocusSiblings(renderer: CellRenderer): List<CellRenderer> {
         return stub()
    }
    open fun getPreferredHeight(context: CellAreaContext, widget: Widget, minimum_height: Int, natural_height: Int): Unit {
         return stub()
    }
    open fun getPreferredHeightForWidth(context: CellAreaContext, widget: Widget, width: Int, minimum_height: Int, natural_height: Int): Unit {
         return stub()
    }
    open fun getPreferredWidth(context: CellAreaContext, widget: Widget, minimum_width: Int, natural_width: Int): Unit {
         return stub()
    }
    open fun getPreferredWidthForHeight(context: CellAreaContext, widget: Widget, height: Int, minimum_width: Int, natural_width: Int): Unit {
         return stub()
    }
    open fun getRequestMode(): SizeRequestMode {
         return stub()
    }
    open fun hasRenderer(renderer: CellRenderer): Boolean {
         return stub()
    }
    open fun innerCellArea(widget: Widget, cell_area: com.charlag.kgtk.demo.gdk.Rectangle, inner_area: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun isActivatable(): Boolean {
         return stub()
    }
    open fun isFocusSibling(renderer: CellRenderer, sibling: CellRenderer): Boolean {
         return stub()
    }
    open fun remove(renderer: CellRenderer): Unit {
         return stub()
    }
    open fun removeFocusSibling(renderer: CellRenderer, sibling: CellRenderer): Unit {
         return stub()
    }
    open fun render(context: CellAreaContext, widget: Widget, cr: com.charlag.kgtk.demo.cairo.Context, background_area: com.charlag.kgtk.demo.gdk.Rectangle, cell_area: com.charlag.kgtk.demo.gdk.Rectangle, flags: CellRendererState, paint_focus: Boolean): Unit {
         return stub()
    }
    open fun requestRenderer(renderer: CellRenderer, orientation: Orientation, widget: Widget, for_size: Int, minimum_size: Int, natural_size: Int): Unit {
         return stub()
    }
    open fun setFocusCell(renderer: CellRenderer): Unit {
         return stub()
    }
    open fun stopEditing(canceled: Boolean): Unit {
         return stub()
    }
    fun setOnAddEditable(cb: () -> Unit) {
        do_connect(cptr, "add-editable", cb)
    }

    fun setOnApplyAttributes(cb: () -> Unit) {
        do_connect(cptr, "apply-attributes", cb)
    }

    fun setOnFocusChanged(cb: () -> Unit) {
        do_connect(cptr, "focus-changed", cb)
    }

    fun setOnRemoveEditable(cb: () -> Unit) {
        do_connect(cptr, "remove-editable", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31127408UL
        fun cptr(obj: CellArea): CPointer<GtkCellArea> = obj.cptr
    }
}

open class CellAreaBox internal constructor (private val cptr: CPointer<GtkCellAreaBox>) : CellArea(cptr.reinterpret()), Buildable, CellLayout, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCellAreaBox>>())

    open fun getSpacing(): Int {
         return stub()
    }
    open fun packEnd(renderer: CellRenderer, expand: Boolean, align: Boolean, fixed: Boolean): Unit {
         return stub()
    }
    open fun packStart(renderer: CellRenderer, expand: Boolean, align: Boolean, fixed: Boolean): Unit {
         return stub()
    }
    open fun setSpacing(spacing: Int): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32363616UL
        fun cptr(obj: CellAreaBox): CPointer<GtkCellAreaBox> = obj.cptr
    }
}

class CellAreaBoxClass(private val cptr: CPointer<cnames.structs._GtkCellAreaBoxClass>) /* struct */ {
    companion object {
        fun cptr(obj: CellAreaBoxClass): CPointer<cnames.structs._GtkCellAreaBoxClass> = obj.cptr
    }
}

class CellAreaClass(private val cptr: CPointer<cnames.structs._GtkCellAreaClass>) /* struct */ {
    fun findCellProperty(property_name: String): com.charlag.kgtk.demo.gobject.ParamSpec {
         return stub()
    }
    fun installCellProperty(property_id: UInt, pspec: com.charlag.kgtk.demo.gobject.ParamSpec): Unit {
         return stub()
    }
    fun listCellProperties(n_properties: UInt): List<com.charlag.kgtk.demo.gobject.ParamSpec> {
         return stub()
    }
    companion object {
        fun cptr(obj: CellAreaClass): CPointer<cnames.structs._GtkCellAreaClass> = obj.cptr
    }
}

open class CellAreaContext internal constructor (private val cptr: CPointer<GtkCellAreaContext>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun allocate(width: Int, height: Int): Unit {
         return stub()
    }
    open fun getAllocation(width: Int, height: Int): Unit {
         return stub()
    }
    open fun getArea(): CellArea {
         return stub()
    }
    open fun getPreferredHeight(minimum_height: Int, natural_height: Int): Unit {
         return stub()
    }
    open fun getPreferredHeightForWidth(width: Int, minimum_height: Int, natural_height: Int): Unit {
         return stub()
    }
    open fun getPreferredWidth(minimum_width: Int, natural_width: Int): Unit {
         return stub()
    }
    open fun getPreferredWidthForHeight(height: Int, minimum_width: Int, natural_width: Int): Unit {
         return stub()
    }
    open fun pushPreferredHeight(minimum_height: Int, natural_height: Int): Unit {
         return stub()
    }
    open fun pushPreferredWidth(minimum_width: Int, natural_width: Int): Unit {
         return stub()
    }
    open fun reset(): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30520992UL
        fun cptr(obj: CellAreaContext): CPointer<GtkCellAreaContext> = obj.cptr
    }
}

class CellAreaContextClass(private val cptr: CPointer<cnames.structs._GtkCellAreaContextClass>) /* struct */ {
    companion object {
        fun cptr(obj: CellAreaContextClass): CPointer<cnames.structs._GtkCellAreaContextClass> = obj.cptr
    }
}

typealias CellCallback = (renderer:  CellRenderer, data:  Any) -> Boolean

interface CellEditable : InteropWrapper {
    fun editingDone(): Unit = stub("CellEditable default impl")

    fun removeWidget(): Unit = stub("CellEditable default impl")

    fun startEditing(event: com.charlag.kgtk.demo.gdk.Event): Unit = stub("CellEditable default impl")

    companion object {
        fun cptr(obj: CellEditable): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkCellEditable>) : CellEditable {
        override val rawPtr: COpaquePointer = cptr
    }
}

class CellEditableIface(private val cptr: CPointer<cnames.structs._GtkCellEditableIface>) /* struct */ {
    companion object {
        fun cptr(obj: CellEditableIface): CPointer<cnames.structs._GtkCellEditableIface> = obj.cptr
    }
}

interface CellLayout : InteropWrapper {
    fun addAttribute(cell: CellRenderer, attribute: String, column: Int): Unit = stub("CellLayout default impl")

    fun clear(): Unit = stub("CellLayout default impl")

    fun clearAttributes(cell: CellRenderer): Unit = stub("CellLayout default impl")

    fun getArea(): CellArea = stub("CellLayout default impl")

    fun getCells(): List<CellRenderer> = stub("CellLayout default impl")

    fun packEnd(cell: CellRenderer, expand: Boolean): Unit = stub("CellLayout default impl")

    fun packStart(cell: CellRenderer, expand: Boolean): Unit = stub("CellLayout default impl")

    fun reorder(cell: CellRenderer, position: Int): Unit = stub("CellLayout default impl")

    fun setCellDataFunc(cell: CellRenderer, func: CellLayoutDataFunc, func_data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit = stub("CellLayout default impl")

    companion object {
        fun cptr(obj: CellLayout): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkCellLayout>) : CellLayout {
        override val rawPtr: COpaquePointer = cptr
    }
}

typealias CellLayoutDataFunc = (cell_layout:  CellLayout, cell:  CellRenderer, tree_model:  TreeModel, iter:  TreeIter, data:  Any) -> Unit

class CellLayoutIface(private val cptr: CPointer<cnames.structs._GtkCellLayoutIface>) /* struct */ {
    companion object {
        fun cptr(obj: CellLayoutIface): CPointer<cnames.structs._GtkCellLayoutIface> = obj.cptr
    }
}

open class CellRenderer internal constructor (private val cptr: CPointer<GtkCellRenderer>) : com.charlag.kgtk.demo.gobject.InitiallyUnowned(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun activate(event: com.charlag.kgtk.demo.gdk.Event, widget: Widget, path: String, background_area: com.charlag.kgtk.demo.gdk.Rectangle, cell_area: com.charlag.kgtk.demo.gdk.Rectangle, flags: CellRendererState): Boolean {
         return stub()
    }
    open fun getAlignedArea(widget: Widget, flags: CellRendererState, cell_area: com.charlag.kgtk.demo.gdk.Rectangle, aligned_area: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun getAlignment(xalign: Float, yalign: Float): Unit {
         return stub()
    }
    open fun getFixedSize(width: Int, height: Int): Unit {
         return stub()
    }
    open fun getPadding(xpad: Int, ypad: Int): Unit {
         return stub()
    }
    open fun getPreferredHeight(widget: Widget, minimum_size: Int, natural_size: Int): Unit {
         return stub()
    }
    open fun getPreferredHeightForWidth(widget: Widget, width: Int, minimum_height: Int, natural_height: Int): Unit {
         return stub()
    }
    open fun getPreferredSize(widget: Widget, minimum_size: Requisition, natural_size: Requisition): Unit {
         return stub()
    }
    open fun getPreferredWidth(widget: Widget, minimum_size: Int, natural_size: Int): Unit {
         return stub()
    }
    open fun getPreferredWidthForHeight(widget: Widget, height: Int, minimum_width: Int, natural_width: Int): Unit {
         return stub()
    }
    open fun getRequestMode(): SizeRequestMode {
         return stub()
    }
    open fun getSensitive(): Boolean {
         return stub()
    }
    open fun getState(widget: Widget, cell_state: CellRendererState): StateFlags {
         return stub()
    }
    open fun getVisible(): Boolean {
         return stub()
    }
    open fun isActivatable(): Boolean {
         return stub()
    }
    open fun render(cr: com.charlag.kgtk.demo.cairo.Context, widget: Widget, background_area: com.charlag.kgtk.demo.gdk.Rectangle, cell_area: com.charlag.kgtk.demo.gdk.Rectangle, flags: CellRendererState): Unit {
         return stub()
    }
    open fun setAlignment(xalign: Float, yalign: Float): Unit {
         return stub()
    }
    open fun setFixedSize(width: Int, height: Int): Unit {
         return stub()
    }
    open fun setPadding(xpad: Int, ypad: Int): Unit {
         return stub()
    }
    open fun setSensitive(sensitive: Boolean): Unit {
         return stub()
    }
    open fun setVisible(visible: Boolean): Unit {
         return stub()
    }
    open fun startEditing(event: com.charlag.kgtk.demo.gdk.Event, widget: Widget, path: String, background_area: com.charlag.kgtk.demo.gdk.Rectangle, cell_area: com.charlag.kgtk.demo.gdk.Rectangle, flags: CellRendererState): CellEditable {
         return stub()
    }
    open fun stopEditing(canceled: Boolean): Unit {
         return stub()
    }
    fun setOnEditingCanceled(cb: () -> Unit) {
        do_connect(cptr, "editing-canceled", cb)
    }

    fun setOnEditingStarted(cb: () -> Unit) {
        do_connect(cptr, "editing-started", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32482640UL
        fun cptr(obj: CellRenderer): CPointer<GtkCellRenderer> = obj.cptr
    }
}

open class CellRendererAccel internal constructor (private val cptr: CPointer<GtkCellRendererAccel>) : CellRendererText(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCellRendererAccel>>())

    fun setOnAccelCleared(cb: () -> Unit) {
        do_connect(cptr, "accel-cleared", cb)
    }

    fun setOnAccelEdited(cb: () -> Unit) {
        do_connect(cptr, "accel-edited", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32507152UL
        fun cptr(obj: CellRendererAccel): CPointer<GtkCellRendererAccel> = obj.cptr
    }
}

class CellRendererAccelClass(private val cptr: CPointer<cnames.structs._GtkCellRendererAccelClass>) /* struct */ {
    companion object {
        fun cptr(obj: CellRendererAccelClass): CPointer<cnames.structs._GtkCellRendererAccelClass> = obj.cptr
    }
}

typealias CellRendererAccelMode = GtkCellRendererAccelMode

class CellRendererClass(private val cptr: CPointer<cnames.structs._GtkCellRendererClass>) /* struct */ {
    fun setAccessibleType(type: GType): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: CellRendererClass): CPointer<cnames.structs._GtkCellRendererClass> = obj.cptr
    }
}

open class CellRendererCombo internal constructor (private val cptr: CPointer<GtkCellRendererCombo>) : CellRendererText(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCellRendererCombo>>())

    fun setOnChanged(cb: () -> Unit) {
        do_connect(cptr, "changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32593344UL
        fun cptr(obj: CellRendererCombo): CPointer<GtkCellRendererCombo> = obj.cptr
    }
}

class CellRendererComboClass(private val cptr: CPointer<cnames.structs._GtkCellRendererComboClass>) /* struct */ {
    companion object {
        fun cptr(obj: CellRendererComboClass): CPointer<cnames.structs._GtkCellRendererComboClass> = obj.cptr
    }
}

typealias CellRendererMode = GtkCellRendererMode

open class CellRendererPixbuf internal constructor (private val cptr: CPointer<GtkCellRendererPixbuf>) : CellRenderer(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCellRendererPixbuf>>())

    companion object {
        const val G_TYPE: gtk3.GType = 31895568UL
        fun cptr(obj: CellRendererPixbuf): CPointer<GtkCellRendererPixbuf> = obj.cptr
    }
}

class CellRendererPixbufClass(private val cptr: CPointer<cnames.structs._GtkCellRendererPixbufClass>) /* struct */ {
    companion object {
        fun cptr(obj: CellRendererPixbufClass): CPointer<cnames.structs._GtkCellRendererPixbufClass> = obj.cptr
    }
}

open class CellRendererProgress internal constructor (private val cptr: CPointer<GtkCellRendererProgress>) : CellRenderer(cptr.reinterpret()), Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCellRendererProgress>>())

    companion object {
        const val G_TYPE: gtk3.GType = 30769664UL
        fun cptr(obj: CellRendererProgress): CPointer<GtkCellRendererProgress> = obj.cptr
    }
}

class CellRendererProgressClass(private val cptr: CPointer<cnames.structs._GtkCellRendererProgressClass>) /* struct */ {
    companion object {
        fun cptr(obj: CellRendererProgressClass): CPointer<cnames.structs._GtkCellRendererProgressClass> = obj.cptr
    }
}

open class CellRendererSpin internal constructor (private val cptr: CPointer<GtkCellRendererSpin>) : CellRendererText(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCellRendererSpin>>())

    companion object {
        const val G_TYPE: gtk3.GType = 31021616UL
        fun cptr(obj: CellRendererSpin): CPointer<GtkCellRendererSpin> = obj.cptr
    }
}

class CellRendererSpinClass(private val cptr: CPointer<cnames.structs._GtkCellRendererSpinClass>) /* struct */ {
    companion object {
        fun cptr(obj: CellRendererSpinClass): CPointer<cnames.structs._GtkCellRendererSpinClass> = obj.cptr
    }
}

open class CellRendererSpinner internal constructor (private val cptr: CPointer<GtkCellRendererSpinner>) : CellRenderer(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCellRendererSpinner>>())

    companion object {
        const val G_TYPE: gtk3.GType = 31577552UL
        fun cptr(obj: CellRendererSpinner): CPointer<GtkCellRendererSpinner> = obj.cptr
    }
}

class CellRendererSpinnerClass(private val cptr: CPointer<cnames.structs._GtkCellRendererSpinnerClass>) /* struct */ {
    companion object {
        fun cptr(obj: CellRendererSpinnerClass): CPointer<cnames.structs._GtkCellRendererSpinnerClass> = obj.cptr
    }
}

typealias CellRendererState = GtkCellRendererState

open class CellRendererText internal constructor (private val cptr: CPointer<GtkCellRendererText>) : CellRenderer(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCellRendererText>>())

    open fun setFixedHeightFromFont(number_of_rows: Int): Unit {
         return stub()
    }
    fun setOnEdited(cb: () -> Unit) {
        do_connect(cptr, "edited", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32506896UL
        fun cptr(obj: CellRendererText): CPointer<GtkCellRendererText> = obj.cptr
    }
}

class CellRendererTextClass(private val cptr: CPointer<cnames.structs._GtkCellRendererTextClass>) /* struct */ {
    companion object {
        fun cptr(obj: CellRendererTextClass): CPointer<cnames.structs._GtkCellRendererTextClass> = obj.cptr
    }
}

open class CellRendererToggle internal constructor (private val cptr: CPointer<GtkCellRendererToggle>) : CellRenderer(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCellRendererToggle>>())

    open fun getActivatable(): Boolean {
         return stub()
    }
    open fun getActive(): Boolean {
         return stub()
    }
    open fun getRadio(): Boolean {
         return stub()
    }
    open fun setActivatable(setting: Boolean): Unit {
         return stub()
    }
    open fun setActive(setting: Boolean): Unit {
         return stub()
    }
    open fun setRadio(radio: Boolean): Unit {
         return stub()
    }
    fun setOnToggled(cb: () -> Unit) {
        do_connect(cptr, "toggled", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31179376UL
        fun cptr(obj: CellRendererToggle): CPointer<GtkCellRendererToggle> = obj.cptr
    }
}

class CellRendererToggleClass(private val cptr: CPointer<cnames.structs._GtkCellRendererToggleClass>) /* struct */ {
    companion object {
        fun cptr(obj: CellRendererToggleClass): CPointer<cnames.structs._GtkCellRendererToggleClass> = obj.cptr
    }
}

open class CellView internal constructor (private val cptr: CPointer<GtkCellView>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, CellLayout, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCellView>>())

    open fun getDisplayedRow(): TreePath {
         return stub()
    }
    open fun getDrawSensitive(): Boolean {
         return stub()
    }
    open fun getFitModel(): Boolean {
         return stub()
    }
    open fun getModel(): TreeModel {
         return stub()
    }
    open fun setBackgroundRgba(rgba: com.charlag.kgtk.demo.gdk.RGBA): Unit {
         return stub()
    }
    open fun setDisplayedRow(path: TreePath): Unit {
         return stub()
    }
    open fun setDrawSensitive(draw_sensitive: Boolean): Unit {
         return stub()
    }
    open fun setFitModel(fit_model: Boolean): Unit {
         return stub()
    }
    open fun setModel(model: TreeModel): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32112144UL
        fun cptr(obj: CellView): CPointer<GtkCellView> = obj.cptr
        fun newWithContext(area: CellArea, context: CellAreaContext): CellView = CellView(stub<CPointer<GtkCellView>>()) 
        fun newWithMarkup(markup: String): CellView = CellView(stub<CPointer<GtkCellView>>()) 
        fun newWithPixbuf(pixbuf: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): CellView = CellView(stub<CPointer<GtkCellView>>()) 
        fun newWithText(text: String): CellView = CellView(stub<CPointer<GtkCellView>>()) 
    }
}

class CellViewClass(private val cptr: CPointer<cnames.structs._GtkCellViewClass>) /* struct */ {
    companion object {
        fun cptr(obj: CellViewClass): CPointer<cnames.structs._GtkCellViewClass> = obj.cptr
    }
}

open class CheckButton internal constructor (private val cptr: CPointer<GtkCheckButton>) : ToggleButton(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCheckButton>>())

    companion object {
        const val G_TYPE: gtk3.GType = 31883072UL
        fun cptr(obj: CheckButton): CPointer<GtkCheckButton> = obj.cptr
        fun newWithLabel(label: String): CheckButton = CheckButton(stub<CPointer<GtkCheckButton>>()) 
        fun newWithMnemonic(label: String): CheckButton = CheckButton(stub<CPointer<GtkCheckButton>>()) 
    }
}

class CheckButtonClass(private val cptr: CPointer<cnames.structs._GtkCheckButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: CheckButtonClass): CPointer<cnames.structs._GtkCheckButtonClass> = obj.cptr
    }
}

open class CheckMenuItem internal constructor (private val cptr: CPointer<GtkCheckMenuItem>) : MenuItem(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCheckMenuItem>>())

    open fun getActive(): Boolean {
         return stub()
    }
    open fun getDrawAsRadio(): Boolean {
         return stub()
    }
    open fun getInconsistent(): Boolean {
         return stub()
    }
    open fun setActive(is_active: Boolean): Unit {
         return stub()
    }
    open fun setDrawAsRadio(draw_as_radio: Boolean): Unit {
         return stub()
    }
    open fun setInconsistent(setting: Boolean): Unit {
         return stub()
    }
    open fun toggled(): Unit {
         return stub()
    }
    fun setOnToggled(cb: () -> Unit) {
        do_connect(cptr, "toggled", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31062272UL
        fun cptr(obj: CheckMenuItem): CPointer<GtkCheckMenuItem> = obj.cptr
        fun newWithLabel(label: String): CheckMenuItem = CheckMenuItem(stub<CPointer<GtkCheckMenuItem>>()) 
        fun newWithMnemonic(label: String): CheckMenuItem = CheckMenuItem(stub<CPointer<GtkCheckMenuItem>>()) 
    }
}

class CheckMenuItemClass(private val cptr: CPointer<cnames.structs._GtkCheckMenuItemClass>) /* struct */ {
    companion object {
        fun cptr(obj: CheckMenuItemClass): CPointer<cnames.structs._GtkCheckMenuItemClass> = obj.cptr
    }
}

open class Clipboard internal constructor (private val cptr: CPointer<GtkClipboard>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun clear(): Unit {
         return stub()
    }
    open fun getDisplay(): com.charlag.kgtk.demo.gdk.Display {
         return stub()
    }
    open fun getOwner(): com.charlag.kgtk.demo.gobject.Object {
         return stub()
    }
    open fun requestContents(target: com.charlag.kgtk.demo.gdk.Atom, callback: ClipboardReceivedFunc, user_data: Any): Unit {
         return stub()
    }
    open fun requestImage(callback: ClipboardImageReceivedFunc, user_data: Any): Unit {
         return stub()
    }
    open fun requestRichText(buffer: TextBuffer, callback: ClipboardRichTextReceivedFunc, user_data: Any): Unit {
         return stub()
    }
    open fun requestTargets(callback: ClipboardTargetsReceivedFunc, user_data: Any): Unit {
         return stub()
    }
    open fun requestText(callback: ClipboardTextReceivedFunc, user_data: Any): Unit {
         return stub()
    }
    open fun requestUris(callback: ClipboardURIReceivedFunc, user_data: Any): Unit {
         return stub()
    }
    open fun setCanStore(targets: List<TargetEntry>, n_targets: Int): Unit {
         return stub()
    }
    open fun setImage(pixbuf: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): Unit {
         return stub()
    }
    open fun setText(text: String, len: Int): Unit {
         return stub()
    }
    open fun store(): Unit {
         return stub()
    }
    open fun waitForContents(target: com.charlag.kgtk.demo.gdk.Atom): SelectionData {
         return stub()
    }
    open fun waitForImage(): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    open fun waitForRichText(buffer: TextBuffer, format: com.charlag.kgtk.demo.gdk.Atom, length: ULong): List<UByte> {
         return stub()
    }
    open fun waitForTargets(targets: List<com.charlag.kgtk.demo.gdk.Atom>, n_targets: Int): Boolean {
         return stub()
    }
    open fun waitForText(): String {
         return stub()
    }
    open fun waitForUris(): List<String> {
         return stub()
    }
    open fun waitIsImageAvailable(): Boolean {
         return stub()
    }
    open fun waitIsRichTextAvailable(buffer: TextBuffer): Boolean {
         return stub()
    }
    open fun waitIsTargetAvailable(target: com.charlag.kgtk.demo.gdk.Atom): Boolean {
         return stub()
    }
    open fun waitIsTextAvailable(): Boolean {
         return stub()
    }
    open fun waitIsUrisAvailable(): Boolean {
         return stub()
    }
    fun setOnOwnerChange(cb: () -> Unit) {
        do_connect(cptr, "owner-change", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30931456UL
        fun cptr(obj: Clipboard): CPointer<GtkClipboard> = obj.cptr
        fun get(selection: com.charlag.kgtk.demo.gdk.Atom): Clipboard {
    return stub()
}
        fun getDefault(display: com.charlag.kgtk.demo.gdk.Display): Clipboard {
    return stub()
}
        fun getForDisplay(display: com.charlag.kgtk.demo.gdk.Display, selection: com.charlag.kgtk.demo.gdk.Atom): Clipboard {
    return stub()
}
    }
}

typealias ClipboardClearFunc = (clipboard:  Clipboard, user_data_or_owner:  Any) -> Unit

typealias ClipboardGetFunc = (clipboard:  Clipboard, selection_data:  SelectionData, info:  UInt, user_data_or_owner:  Any) -> Unit

typealias ClipboardImageReceivedFunc = (clipboard:  Clipboard, pixbuf:  com.charlag.kgtk.demo.gdkpixbuf.Pixbuf, data:  Any) -> Unit

typealias ClipboardReceivedFunc = (clipboard:  Clipboard, selection_data:  SelectionData, data:  Any) -> Unit

typealias ClipboardRichTextReceivedFunc = (clipboard:  Clipboard, format:  com.charlag.kgtk.demo.gdk.Atom, text:  String, length:  ULong, data:  Any) -> Unit

typealias ClipboardTargetsReceivedFunc = (clipboard:  Clipboard, atoms:  List<com.charlag.kgtk.demo.gdk.Atom>, n_atoms:  Int, data:  Any) -> Unit

typealias ClipboardTextReceivedFunc = (clipboard:  Clipboard, text:  String, data:  Any) -> Unit

typealias ClipboardURIReceivedFunc = (clipboard:  Clipboard, uris:  List<String>, data:  Any) -> Unit

open class ColorButton internal constructor (private val cptr: CPointer<GtkColorButton>) : Button(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, ColorChooser, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkColorButton>>())

    open fun getTitle(): String {
         return stub()
    }
    open fun setTitle(title: String): Unit {
         return stub()
    }
    fun setOnColorSet(cb: () -> Unit) {
        do_connect(cptr, "color-set", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31709296UL
        fun cptr(obj: ColorButton): CPointer<GtkColorButton> = obj.cptr
        fun newWithRgba(rgba: com.charlag.kgtk.demo.gdk.RGBA): ColorButton = ColorButton(stub<CPointer<GtkColorButton>>()) 
    }
}

class ColorButtonClass(private val cptr: CPointer<cnames.structs._GtkColorButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: ColorButtonClass): CPointer<cnames.structs._GtkColorButtonClass> = obj.cptr
    }
}

interface ColorChooser : InteropWrapper {
    fun addPalette(orientation: Orientation, colors_per_line: Int, n_colors: Int, colors: List<com.charlag.kgtk.demo.gdk.RGBA>): Unit = stub("ColorChooser default impl")

    fun getRgba(color: com.charlag.kgtk.demo.gdk.RGBA): Unit = stub("ColorChooser default impl")

    fun getUseAlpha(): Boolean = stub("ColorChooser default impl")

    fun setRgba(color: com.charlag.kgtk.demo.gdk.RGBA): Unit = stub("ColorChooser default impl")

    fun setUseAlpha(use_alpha: Boolean): Unit = stub("ColorChooser default impl")

    companion object {
        fun cptr(obj: ColorChooser): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkColorChooser>) : ColorChooser {
        override val rawPtr: COpaquePointer = cptr
    }
}

open class ColorChooserDialog internal constructor (private val cptr: CPointer<GtkColorChooserDialog>) : Dialog(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, ColorChooser, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(title: String, parent: Window) : this(stub<CPointer<GtkColorChooserDialog>>())

    companion object {
        const val G_TYPE: gtk3.GType = 31312528UL
        fun cptr(obj: ColorChooserDialog): CPointer<GtkColorChooserDialog> = obj.cptr
    }
}

class ColorChooserDialogClass(private val cptr: CPointer<cnames.structs._GtkColorChooserDialogClass>) /* struct */ {
    companion object {
        fun cptr(obj: ColorChooserDialogClass): CPointer<cnames.structs._GtkColorChooserDialogClass> = obj.cptr
    }
}

class ColorChooserInterface(private val cptr: CPointer<cnames.structs._GtkColorChooserInterface>) /* struct */ {
    companion object {
        fun cptr(obj: ColorChooserInterface): CPointer<cnames.structs._GtkColorChooserInterface> = obj.cptr
    }
}

open class ColorChooserWidget internal constructor (private val cptr: CPointer<GtkColorChooserWidget>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, ColorChooser, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkColorChooserWidget>>())

    companion object {
        const val G_TYPE: gtk3.GType = 31010832UL
        fun cptr(obj: ColorChooserWidget): CPointer<GtkColorChooserWidget> = obj.cptr
    }
}

class ColorChooserWidgetClass(private val cptr: CPointer<cnames.structs._GtkColorChooserWidgetClass>) /* struct */ {
    companion object {
        fun cptr(obj: ColorChooserWidgetClass): CPointer<cnames.structs._GtkColorChooserWidgetClass> = obj.cptr
    }
}

open class ColorSelection internal constructor (private val cptr: CPointer<GtkColorSelection>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkColorSelection>>())

    open fun getCurrentAlpha(): UShort {
         return stub()
    }
    open fun getCurrentRgba(rgba: com.charlag.kgtk.demo.gdk.RGBA): Unit {
         return stub()
    }
    open fun getHasOpacityControl(): Boolean {
         return stub()
    }
    open fun getHasPalette(): Boolean {
         return stub()
    }
    open fun getPreviousAlpha(): UShort {
         return stub()
    }
    open fun getPreviousRgba(rgba: com.charlag.kgtk.demo.gdk.RGBA): Unit {
         return stub()
    }
    open fun isAdjusting(): Boolean {
         return stub()
    }
    open fun setCurrentAlpha(alpha: UShort): Unit {
         return stub()
    }
    open fun setCurrentRgba(rgba: com.charlag.kgtk.demo.gdk.RGBA): Unit {
         return stub()
    }
    open fun setHasOpacityControl(has_opacity: Boolean): Unit {
         return stub()
    }
    open fun setHasPalette(has_palette: Boolean): Unit {
         return stub()
    }
    open fun setPreviousAlpha(alpha: UShort): Unit {
         return stub()
    }
    open fun setPreviousRgba(rgba: com.charlag.kgtk.demo.gdk.RGBA): Unit {
         return stub()
    }
    fun setOnColorChanged(cb: () -> Unit) {
        do_connect(cptr, "color-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30981200UL
        fun cptr(obj: ColorSelection): CPointer<GtkColorSelection> = obj.cptr
        fun paletteFromString(str: String, colors: List<com.charlag.kgtk.demo.gdk.Color>, n_colors: Int): Boolean {
    return stub()
}
        fun paletteToString(colors: List<com.charlag.kgtk.demo.gdk.Color>, n_colors: Int): String {
    return stub()
}
    }
}

typealias ColorSelectionChangePaletteFunc = (colors:  List<com.charlag.kgtk.demo.gdk.Color>, n_colors:  Int) -> Unit

typealias ColorSelectionChangePaletteWithScreenFunc = (screen:  com.charlag.kgtk.demo.gdk.Screen, colors:  List<com.charlag.kgtk.demo.gdk.Color>, n_colors:  Int) -> Unit

class ColorSelectionClass(private val cptr: CPointer<cnames.structs._GtkColorSelectionClass>) /* struct */ {
    companion object {
        fun cptr(obj: ColorSelectionClass): CPointer<cnames.structs._GtkColorSelectionClass> = obj.cptr
    }
}

open class ColorSelectionDialog internal constructor (private val cptr: CPointer<GtkColorSelectionDialog>) : Dialog(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(title: String) : this(stub<CPointer<GtkColorSelectionDialog>>())

    open fun getColorSelection(): Widget {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32373984UL
        fun cptr(obj: ColorSelectionDialog): CPointer<GtkColorSelectionDialog> = obj.cptr
    }
}

class ColorSelectionDialogClass(private val cptr: CPointer<cnames.structs._GtkColorSelectionDialogClass>) /* struct */ {
    companion object {
        fun cptr(obj: ColorSelectionDialogClass): CPointer<cnames.structs._GtkColorSelectionDialogClass> = obj.cptr
    }
}

open class ComboBox internal constructor (private val cptr: CPointer<GtkComboBox>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, CellEditable, CellLayout, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkComboBox>>())

    open fun getActive(): Int {
         return stub()
    }
    open fun getActiveId(): String {
         return stub()
    }
    open fun getActiveIter(iter: TreeIter): Boolean {
         return stub()
    }
    open fun getButtonSensitivity(): SensitivityType {
         return stub()
    }
    open fun getColumnSpanColumn(): Int {
         return stub()
    }
    open fun getEntryTextColumn(): Int {
         return stub()
    }
    open fun getHasEntry(): Boolean {
         return stub()
    }
    open fun getIdColumn(): Int {
         return stub()
    }
    open fun getModel(): TreeModel {
         return stub()
    }
    open fun getPopupAccessible(): com.charlag.kgtk.demo.atk.Object {
         return stub()
    }
    open fun getPopupFixedWidth(): Boolean {
         return stub()
    }
    open fun getRowSpanColumn(): Int {
         return stub()
    }
    open fun getWrapWidth(): Int {
         return stub()
    }
    open fun popdown(): Unit {
         return stub()
    }
    open fun popup(): Unit {
         return stub()
    }
    open fun popupForDevice(device: com.charlag.kgtk.demo.gdk.Device): Unit {
         return stub()
    }
    open fun setActive(index_: Int): Unit {
         return stub()
    }
    open fun setActiveId(active_id: String): Boolean {
         return stub()
    }
    open fun setActiveIter(iter: TreeIter): Unit {
         return stub()
    }
    open fun setButtonSensitivity(sensitivity: SensitivityType): Unit {
         return stub()
    }
    open fun setColumnSpanColumn(column_span: Int): Unit {
         return stub()
    }
    open fun setEntryTextColumn(text_column: Int): Unit {
         return stub()
    }
    open fun setIdColumn(id_column: Int): Unit {
         return stub()
    }
    open fun setModel(model: TreeModel): Unit {
         return stub()
    }
    open fun setPopupFixedWidth(fixed: Boolean): Unit {
         return stub()
    }
    open fun setRowSeparatorFunc(func: TreeViewRowSeparatorFunc, data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setRowSpanColumn(row_span: Int): Unit {
         return stub()
    }
    open fun setWrapWidth(width: Int): Unit {
         return stub()
    }
    fun setOnChanged(cb: () -> Unit) {
        do_connect(cptr, "changed", cb)
    }

    fun setOnFormatEntryText(cb: () -> Unit) {
        do_connect(cptr, "format-entry-text", cb)
    }

    fun setOnMoveActive(cb: () -> Unit) {
        do_connect(cptr, "move-active", cb)
    }

    fun setOnPopdown(cb: () -> Unit) {
        do_connect(cptr, "popdown", cb)
    }

    fun setOnPopup(cb: () -> Unit) {
        do_connect(cptr, "popup", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31782192UL
        fun cptr(obj: ComboBox): CPointer<GtkComboBox> = obj.cptr
        fun newWithArea(area: CellArea): ComboBox = ComboBox(stub<CPointer<GtkComboBox>>()) 
        fun newWithAreaAndEntry(area: CellArea): ComboBox = ComboBox(stub<CPointer<GtkComboBox>>()) 
        fun newWithEntry(): ComboBox = ComboBox(stub<CPointer<GtkComboBox>>()) 
        fun newWithModel(model: TreeModel): ComboBox = ComboBox(stub<CPointer<GtkComboBox>>()) 
        fun newWithModelAndEntry(model: TreeModel): ComboBox = ComboBox(stub<CPointer<GtkComboBox>>()) 
    }
}

class ComboBoxClass(private val cptr: CPointer<cnames.structs._GtkComboBoxClass>) /* struct */ {
    companion object {
        fun cptr(obj: ComboBoxClass): CPointer<cnames.structs._GtkComboBoxClass> = obj.cptr
    }
}

open class ComboBoxText internal constructor (private val cptr: CPointer<GtkComboBoxText>) : ComboBox(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, CellEditable, CellLayout, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkComboBoxText>>())

    open fun append(id: String, text: String): Unit {
         return stub()
    }
    open fun appendText(text: String): Unit {
         return stub()
    }
    open fun getActiveText(): String {
         return stub()
    }
    open fun insert(position: Int, id: String, text: String): Unit {
         return stub()
    }
    open fun insertText(position: Int, text: String): Unit {
         return stub()
    }
    open fun prepend(id: String, text: String): Unit {
         return stub()
    }
    open fun prependText(text: String): Unit {
         return stub()
    }
    open fun remove(position: Int): Unit {
         return stub()
    }
    open fun removeAll(): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31429472UL
        fun cptr(obj: ComboBoxText): CPointer<GtkComboBoxText> = obj.cptr
        fun newWithEntry(): ComboBoxText = ComboBoxText(stub<CPointer<GtkComboBoxText>>()) 
    }
}

class ComboBoxTextClass(private val cptr: CPointer<cnames.structs._GtkComboBoxTextClass>) /* struct */ {
    companion object {
        fun cptr(obj: ComboBoxTextClass): CPointer<cnames.structs._GtkComboBoxTextClass> = obj.cptr
    }
}

open class Container internal constructor (private val cptr: CPointer<GtkContainer>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun add(widget: Widget): Unit {
         return memScoped { gtk_container_add(cptr, Widget.cptr(widget))!! }
    }
    open fun checkResize(): Unit {
         return memScoped { gtk_container_check_resize(cptr)!! }
    }
    open fun childGetProperty(child: Widget, property_name: String, value: com.charlag.kgtk.demo.gobject.Value): Unit {
         return memScoped { gtk_container_child_get_property(cptr, Widget.cptr(child), property_name, com.charlag.kgtk.demo.gobject.Value.cptr(value))!! }
    }
    open fun childNotify(child: Widget, child_property: String): Unit {
         return memScoped { gtk_container_child_notify(cptr, Widget.cptr(child), child_property)!! }
    }
    open fun childNotifyByPspec(child: Widget, pspec: com.charlag.kgtk.demo.gobject.ParamSpec): Unit {
         return memScoped { gtk_container_child_notify_by_pspec(cptr, Widget.cptr(child), com.charlag.kgtk.demo.gobject.ParamSpec.cptr(pspec))!! }
    }
    open fun childSetProperty(child: Widget, property_name: String, value: com.charlag.kgtk.demo.gobject.Value): Unit {
         return memScoped { gtk_container_child_set_property(cptr, Widget.cptr(child), property_name, com.charlag.kgtk.demo.gobject.Value.cptr(value))!! }
    }
    open fun childType(): GType {
         return GType(memScoped { gtk_container_child_type(cptr)!! })
    }
// TODO: method forall(), user_data param
// TODO: method foreach(), user_data param
    open fun getBorderWidth(): UInt {
         return memScoped { gtk_container_get_border_width(cptr)!! }
    }
    open fun getChildren(): List<Widget> {
         return memScoped { gtk_container_get_children(cptr)!! }.toList<GtkWidget>().map { Widget(it) }
    }
    open fun getFocusChild(): Widget {
         return Widget(memScoped { gtk_container_get_focus_child(cptr)!! })
    }
    open fun getFocusHadjustment(): Adjustment {
         return Adjustment(memScoped { gtk_container_get_focus_hadjustment(cptr)!! })
    }
    open fun getFocusVadjustment(): Adjustment {
         return Adjustment(memScoped { gtk_container_get_focus_vadjustment(cptr)!! })
    }
    open fun getPathForChild(child: Widget): WidgetPath {
         return WidgetPath(memScoped { gtk_container_get_path_for_child(cptr, Widget.cptr(child))!! })
    }
    open fun propagateDraw(child: Widget, cr: com.charlag.kgtk.demo.cairo.Context): Unit {
         return memScoped { gtk_container_propagate_draw(cptr, Widget.cptr(child), com.charlag.kgtk.demo.cairo.Context.cptr(cr))!! }
    }
    open fun remove(widget: Widget): Unit {
         return memScoped { gtk_container_remove(cptr, Widget.cptr(widget))!! }
    }
    open fun setBorderWidth(border_width: UInt): Unit {
         return memScoped { gtk_container_set_border_width(cptr, border_width)!! }
    }
// TODO: method set_focus_chain(), passing lists
    open fun setFocusChild(child: Widget): Unit {
         return memScoped { gtk_container_set_focus_child(cptr, Widget.cptr(child))!! }
    }
    open fun setFocusHadjustment(adjustment: Adjustment): Unit {
         return memScoped { gtk_container_set_focus_hadjustment(cptr, Adjustment.cptr(adjustment))!! }
    }
    open fun setFocusVadjustment(adjustment: Adjustment): Unit {
         return memScoped { gtk_container_set_focus_vadjustment(cptr, Adjustment.cptr(adjustment))!! }
    }
    fun setOnAdd(cb: () -> Unit) {
        do_connect(cptr, "add", cb)
    }

    fun setOnCheckResize(cb: () -> Unit) {
        do_connect(cptr, "check-resize", cb)
    }

    fun setOnRemove(cb: () -> Unit) {
        do_connect(cptr, "remove", cb)
    }

    fun setOnSetFocusChild(cb: () -> Unit) {
        do_connect(cptr, "set-focus-child", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30726832UL
        fun cptr(obj: Container): CPointer<GtkContainer> = obj.cptr
    }
}

class ContainerClass(private val cptr: CPointer<cnames.structs._GtkContainerClass>) /* struct */ {
    fun findChildProperty(property_name: String): com.charlag.kgtk.demo.gobject.ParamSpec {
         return stub()
    }
    fun handleBorderWidth(): Unit {
         return stub()
    }
    fun installChildProperties(n_pspecs: UInt, pspecs: List<com.charlag.kgtk.demo.gobject.ParamSpec>): Unit {
         return stub()
    }
    fun installChildProperty(property_id: UInt, pspec: com.charlag.kgtk.demo.gobject.ParamSpec): Unit {
         return stub()
    }
    fun listChildProperties(n_properties: UInt): List<com.charlag.kgtk.demo.gobject.ParamSpec> {
         return stub()
    }
    companion object {
        fun cptr(obj: ContainerClass): CPointer<cnames.structs._GtkContainerClass> = obj.cptr
    }
}

typealias CornerType = GtkCornerType

open class CssProvider internal constructor (private val cptr: CPointer<GtkCssProvider>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), StyleProvider, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkCssProvider>>())

    open fun loadFromData(data: List<UByte>, length: Long): Boolean {
         return stub()
    }
    open fun loadFromFile(file: com.charlag.kgtk.demo.gio.File): Boolean {
         return stub()
    }
    open fun loadFromPath(path: String): Boolean {
         return stub()
    }
    open fun loadFromResource(resource_path: String): Unit {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    fun setOnParsingError(cb: () -> Unit) {
        do_connect(cptr, "parsing-error", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31891248UL
        fun cptr(obj: CssProvider): CPointer<GtkCssProvider> = obj.cptr
        fun getNamed(`name`: String, variant: String): CssProvider {
    return stub()
}
    }
}

class CssProviderClass(private val cptr: CPointer<cnames.structs._GtkCssProviderClass>) /* struct */ {
    companion object {
        fun cptr(obj: CssProviderClass): CPointer<cnames.structs._GtkCssProviderClass> = obj.cptr
    }
}

typealias CssProviderError = GtkCssProviderError

class CssSection(private val cptr: CPointer<cnames.structs._GtkCssSection>) /* struct */ {
    fun getEndLine(): UInt {
         return stub()
    }
    fun getEndPosition(): UInt {
         return stub()
    }
    fun getFile(): com.charlag.kgtk.demo.gio.File {
         return stub()
    }
    fun getParent(): CssSection {
         return stub()
    }
    fun getSectionType(): CssSectionType {
         return stub()
    }
    fun getStartLine(): UInt {
         return stub()
    }
    fun getStartPosition(): UInt {
         return stub()
    }
    fun ref(): CssSection {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: CssSection): CPointer<cnames.structs._GtkCssSection> = obj.cptr
    }
}

typealias CssSectionType = GtkCssSectionType

typealias DebugFlag = GtkDebugFlag

typealias DeleteType = GtkDeleteType

typealias DestDefaults = GtkDestDefaults

open class Dialog internal constructor (private val cptr: CPointer<GtkDialog>) : Window(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(memScoped { gtk_dialog_new()!! }.reinterpret())

    open fun addActionWidget(child: Widget, response_id: Int): Unit {
         return memScoped { gtk_dialog_add_action_widget(cptr, Widget.cptr(child), response_id)!! }
    }
    open fun addButton(button_text: String, response_id: Int): Widget {
         return Widget(memScoped { gtk_dialog_add_button(cptr, button_text, response_id)!! })
    }
    open fun getContentArea(): Box {
         return Box(memScoped { gtk_dialog_get_content_area(cptr)!! }.reinterpret())
    }
    open fun getHeaderBar(): HeaderBar {
         return HeaderBar(memScoped { gtk_dialog_get_header_bar(cptr)!! }.reinterpret())
    }
    open fun getResponseForWidget(widget: Widget): Int {
         return memScoped { gtk_dialog_get_response_for_widget(cptr, Widget.cptr(widget))!! }
    }
    open fun getWidgetForResponse(response_id: Int): Widget {
         return Widget(memScoped { gtk_dialog_get_widget_for_response(cptr, response_id)!! })
    }
    open fun response(response_id: Int): Unit {
         return memScoped { gtk_dialog_response(cptr, response_id)!! }
    }
    open fun run(): Int {
         return memScoped { gtk_dialog_run(cptr)!! }
    }
    open fun setDefaultResponse(response_id: Int): Unit {
         return memScoped { gtk_dialog_set_default_response(cptr, response_id)!! }
    }
    open fun setResponseSensitive(response_id: Int, setting: Boolean): Unit {
         return memScoped { gtk_dialog_set_response_sensitive(cptr, response_id, setting.asGboolean())!! }
    }
    fun setOnClose(cb: () -> Unit) {
        do_connect(cptr, "close", cb)
    }

    fun setOnResponse(cb: () -> Unit) {
        do_connect(cptr, "response", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31094944UL
        fun cptr(obj: Dialog): CPointer<GtkDialog> = obj.cptr
    }
}

class DialogClass(private val cptr: CPointer<cnames.structs._GtkDialogClass>) /* struct */ {
    companion object {
        fun cptr(obj: DialogClass): CPointer<cnames.structs._GtkDialogClass> = obj.cptr
    }
}

typealias DialogFlags = GtkDialogFlags

typealias DirectionType = GtkDirectionType

typealias DragResult = GtkDragResult

open class DrawingArea internal constructor (private val cptr: CPointer<GtkDrawingArea>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkDrawingArea>>())

    companion object {
        const val G_TYPE: gtk3.GType = 31286912UL
        fun cptr(obj: DrawingArea): CPointer<GtkDrawingArea> = obj.cptr
    }
}

class DrawingAreaClass(private val cptr: CPointer<cnames.structs._GtkDrawingAreaClass>) /* struct */ {
    companion object {
        fun cptr(obj: DrawingAreaClass): CPointer<cnames.structs._GtkDrawingAreaClass> = obj.cptr
    }
}

interface Editable : InteropWrapper {
    fun copyClipboard(): Unit = stub("Editable default impl")

    fun cutClipboard(): Unit = stub("Editable default impl")

    fun deleteSelection(): Unit = stub("Editable default impl")

    fun deleteText(start_pos: Int, end_pos: Int): Unit = stub("Editable default impl")

    fun getChars(start_pos: Int, end_pos: Int): String = stub("Editable default impl")

    fun getEditable(): Boolean = stub("Editable default impl")

    fun getPosition(): Int = stub("Editable default impl")

    fun getSelectionBounds(start_pos: Int, end_pos: Int): Boolean = stub("Editable default impl")

    fun insertText(new_text: String, new_text_length: Int, position: Int): Unit = stub("Editable default impl")

    fun pasteClipboard(): Unit = stub("Editable default impl")

    fun selectRegion(start_pos: Int, end_pos: Int): Unit = stub("Editable default impl")

    fun setEditable(is_editable: Boolean): Unit = stub("Editable default impl")

    fun setPosition(position: Int): Unit = stub("Editable default impl")

    companion object {
        fun cptr(obj: Editable): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkEditable>) : Editable {
        override val rawPtr: COpaquePointer = cptr
    }
}

class EditableInterface(private val cptr: CPointer<cnames.structs._GtkEditableInterface>) /* struct */ {
    companion object {
        fun cptr(obj: EditableInterface): CPointer<cnames.structs._GtkEditableInterface> = obj.cptr
    }
}

open class Entry internal constructor (private val cptr: CPointer<GtkEntry>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, CellEditable, Editable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkEntry>>())

    open fun getActivatesDefault(): Boolean {
         return stub()
    }
    open fun getAlignment(): Float {
         return stub()
    }
    open fun getAttributes(): com.charlag.kgtk.demo.pango.AttrList {
         return stub()
    }
    open fun getBuffer(): EntryBuffer {
         return stub()
    }
    open fun getCompletion(): EntryCompletion {
         return stub()
    }
    open fun getCurrentIconDragSource(): Int {
         return stub()
    }
    open fun getCursorHadjustment(): Adjustment {
         return stub()
    }
    open fun getHasFrame(): Boolean {
         return stub()
    }
    open fun getIconActivatable(icon_pos: EntryIconPosition): Boolean {
         return stub()
    }
    open fun getIconArea(icon_pos: EntryIconPosition, icon_area: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun getIconAtPos(x: Int, y: Int): Int {
         return stub()
    }
    open fun getIconGicon(icon_pos: EntryIconPosition): com.charlag.kgtk.demo.gio.Icon {
         return stub()
    }
    open fun getIconName(icon_pos: EntryIconPosition): String {
         return stub()
    }
    open fun getIconPixbuf(icon_pos: EntryIconPosition): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    open fun getIconSensitive(icon_pos: EntryIconPosition): Boolean {
         return stub()
    }
    open fun getIconStorageType(icon_pos: EntryIconPosition): ImageType {
         return stub()
    }
    open fun getIconTooltipMarkup(icon_pos: EntryIconPosition): String {
         return stub()
    }
    open fun getIconTooltipText(icon_pos: EntryIconPosition): String {
         return stub()
    }
    open fun getInputHints(): InputHints {
         return stub()
    }
    open fun getInputPurpose(): InputPurpose {
         return stub()
    }
    open fun getInvisibleChar(): Char {
         return stub()
    }
    open fun getLayout(): com.charlag.kgtk.demo.pango.Layout {
         return stub()
    }
    open fun getLayoutOffsets(x: Int, y: Int): Unit {
         return stub()
    }
    open fun getMaxLength(): Int {
         return stub()
    }
    open fun getMaxWidthChars(): Int {
         return stub()
    }
    open fun getOverwriteMode(): Boolean {
         return stub()
    }
    open fun getPlaceholderText(): String {
         return stub()
    }
    open fun getProgressFraction(): Double {
         return stub()
    }
    open fun getProgressPulseStep(): Double {
         return stub()
    }
    open fun getTabs(): com.charlag.kgtk.demo.pango.TabArray {
         return stub()
    }
    open fun getText(): String {
         return stub()
    }
    open fun getTextArea(text_area: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun getTextLength(): UShort {
         return stub()
    }
    open fun getVisibility(): Boolean {
         return stub()
    }
    open fun getWidthChars(): Int {
         return stub()
    }
    open fun grabFocusWithoutSelecting(): Unit {
         return stub()
    }
    open fun imContextFilterKeypress(event: com.charlag.kgtk.demo.gdk.EventKey): Boolean {
         return stub()
    }
    open fun layoutIndexToTextIndex(layout_index: Int): Int {
         return stub()
    }
    open fun progressPulse(): Unit {
         return stub()
    }
    open fun resetImContext(): Unit {
         return stub()
    }
    open fun setActivatesDefault(setting: Boolean): Unit {
         return stub()
    }
    open fun setAlignment(xalign: Float): Unit {
         return stub()
    }
    open fun setAttributes(attrs: com.charlag.kgtk.demo.pango.AttrList): Unit {
         return stub()
    }
    open fun setBuffer(buffer: EntryBuffer): Unit {
         return stub()
    }
    open fun setCompletion(completion: EntryCompletion): Unit {
         return stub()
    }
    open fun setCursorHadjustment(adjustment: Adjustment): Unit {
         return stub()
    }
    open fun setHasFrame(setting: Boolean): Unit {
         return stub()
    }
    open fun setIconActivatable(icon_pos: EntryIconPosition, activatable: Boolean): Unit {
         return stub()
    }
    open fun setIconDragSource(icon_pos: EntryIconPosition, target_list: TargetList, actions: com.charlag.kgtk.demo.gdk.DragAction): Unit {
         return stub()
    }
    open fun setIconFromGicon(icon_pos: EntryIconPosition, icon: com.charlag.kgtk.demo.gio.Icon): Unit {
         return stub()
    }
    open fun setIconFromIconName(icon_pos: EntryIconPosition, icon_name: String): Unit {
         return stub()
    }
    open fun setIconFromPixbuf(icon_pos: EntryIconPosition, pixbuf: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): Unit {
         return stub()
    }
    open fun setIconSensitive(icon_pos: EntryIconPosition, sensitive: Boolean): Unit {
         return stub()
    }
    open fun setIconTooltipMarkup(icon_pos: EntryIconPosition, tooltip: String): Unit {
         return stub()
    }
    open fun setIconTooltipText(icon_pos: EntryIconPosition, tooltip: String): Unit {
         return stub()
    }
    open fun setInputHints(hints: InputHints): Unit {
         return stub()
    }
    open fun setInputPurpose(purpose: InputPurpose): Unit {
         return stub()
    }
    open fun setInvisibleChar(ch: Char): Unit {
         return stub()
    }
    open fun setMaxLength(max: Int): Unit {
         return stub()
    }
    open fun setMaxWidthChars(n_chars: Int): Unit {
         return stub()
    }
    open fun setOverwriteMode(overwrite: Boolean): Unit {
         return stub()
    }
    open fun setPlaceholderText(text: String): Unit {
         return stub()
    }
    open fun setProgressFraction(fraction: Double): Unit {
         return stub()
    }
    open fun setProgressPulseStep(fraction: Double): Unit {
         return stub()
    }
    open fun setTabs(tabs: com.charlag.kgtk.demo.pango.TabArray): Unit {
         return stub()
    }
    open fun setText(text: String): Unit {
         return stub()
    }
    open fun setVisibility(visible: Boolean): Unit {
         return stub()
    }
    open fun setWidthChars(n_chars: Int): Unit {
         return stub()
    }
    open fun textIndexToLayoutIndex(text_index: Int): Int {
         return stub()
    }
    open fun unsetInvisibleChar(): Unit {
         return stub()
    }
    fun setOnActivate(cb: () -> Unit) {
        do_connect(cptr, "activate", cb)
    }

    fun setOnBackspace(cb: () -> Unit) {
        do_connect(cptr, "backspace", cb)
    }

    fun setOnCopyClipboard(cb: () -> Unit) {
        do_connect(cptr, "copy-clipboard", cb)
    }

    fun setOnCutClipboard(cb: () -> Unit) {
        do_connect(cptr, "cut-clipboard", cb)
    }

    fun setOnDeleteFromCursor(cb: () -> Unit) {
        do_connect(cptr, "delete-from-cursor", cb)
    }

    fun setOnIconPress(cb: () -> Unit) {
        do_connect(cptr, "icon-press", cb)
    }

    fun setOnIconRelease(cb: () -> Unit) {
        do_connect(cptr, "icon-release", cb)
    }

    fun setOnInsertAtCursor(cb: () -> Unit) {
        do_connect(cptr, "insert-at-cursor", cb)
    }

    fun setOnInsertEmoji(cb: () -> Unit) {
        do_connect(cptr, "insert-emoji", cb)
    }

    fun setOnMoveCursor(cb: () -> Unit) {
        do_connect(cptr, "move-cursor", cb)
    }

    fun setOnPasteClipboard(cb: () -> Unit) {
        do_connect(cptr, "paste-clipboard", cb)
    }

    fun setOnPopulatePopup(cb: () -> Unit) {
        do_connect(cptr, "populate-popup", cb)
    }

    fun setOnPreeditChanged(cb: () -> Unit) {
        do_connect(cptr, "preedit-changed", cb)
    }

    fun setOnToggleOverwrite(cb: () -> Unit) {
        do_connect(cptr, "toggle-overwrite", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30593888UL
        fun cptr(obj: Entry): CPointer<GtkEntry> = obj.cptr
        fun newWithBuffer(buffer: EntryBuffer): Entry = Entry(stub<CPointer<GtkEntry>>()) 
    }
}

open class EntryBuffer internal constructor (private val cptr: CPointer<GtkEntryBuffer>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(initial_chars: String, n_initial_chars: Int) : this(stub<CPointer<GtkEntryBuffer>>())

    open fun deleteText(position: UInt, n_chars: Int): UInt {
         return stub()
    }
    open fun emitDeletedText(position: UInt, n_chars: UInt): Unit {
         return stub()
    }
    open fun emitInsertedText(position: UInt, chars: String, n_chars: UInt): Unit {
         return stub()
    }
    open fun getBytes(): ULong {
         return stub()
    }
    open fun getLength(): UInt {
         return stub()
    }
    open fun getMaxLength(): Int {
         return stub()
    }
    open fun getText(): String {
         return stub()
    }
    open fun insertText(position: UInt, chars: String, n_chars: Int): UInt {
         return stub()
    }
    open fun setMaxLength(max_length: Int): Unit {
         return stub()
    }
    open fun setText(chars: String, n_chars: Int): Unit {
         return stub()
    }
    fun setOnDeletedText(cb: () -> Unit) {
        do_connect(cptr, "deleted-text", cb)
    }

    fun setOnInsertedText(cb: () -> Unit) {
        do_connect(cptr, "inserted-text", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31185744UL
        fun cptr(obj: EntryBuffer): CPointer<GtkEntryBuffer> = obj.cptr
    }
}

class EntryBufferClass(private val cptr: CPointer<cnames.structs._GtkEntryBufferClass>) /* struct */ {
    companion object {
        fun cptr(obj: EntryBufferClass): CPointer<cnames.structs._GtkEntryBufferClass> = obj.cptr
    }
}

class EntryClass(private val cptr: CPointer<cnames.structs._GtkEntryClass>) /* struct */ {
    companion object {
        fun cptr(obj: EntryClass): CPointer<cnames.structs._GtkEntryClass> = obj.cptr
    }
}

open class EntryCompletion internal constructor (private val cptr: CPointer<GtkEntryCompletion>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Buildable, CellLayout, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkEntryCompletion>>())

    open fun complete(): Unit {
         return stub()
    }
    open fun computePrefix(key: String): String {
         return stub()
    }
    open fun deleteAction(index_: Int): Unit {
         return stub()
    }
    open fun getCompletionPrefix(): String {
         return stub()
    }
    open fun getEntry(): Widget {
         return stub()
    }
    open fun getInlineCompletion(): Boolean {
         return stub()
    }
    open fun getInlineSelection(): Boolean {
         return stub()
    }
    open fun getMinimumKeyLength(): Int {
         return stub()
    }
    open fun getModel(): TreeModel {
         return stub()
    }
    open fun getPopupCompletion(): Boolean {
         return stub()
    }
    open fun getPopupSetWidth(): Boolean {
         return stub()
    }
    open fun getPopupSingleMatch(): Boolean {
         return stub()
    }
    open fun getTextColumn(): Int {
         return stub()
    }
    open fun insertActionMarkup(index_: Int, markup: String): Unit {
         return stub()
    }
    open fun insertActionText(index_: Int, text: String): Unit {
         return stub()
    }
    open fun insertPrefix(): Unit {
         return stub()
    }
    open fun setInlineCompletion(inline_completion: Boolean): Unit {
         return stub()
    }
    open fun setInlineSelection(inline_selection: Boolean): Unit {
         return stub()
    }
    open fun setMatchFunc(func: EntryCompletionMatchFunc, func_data: Any, func_notify: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setMinimumKeyLength(length: Int): Unit {
         return stub()
    }
    open fun setModel(model: TreeModel): Unit {
         return stub()
    }
    open fun setPopupCompletion(popup_completion: Boolean): Unit {
         return stub()
    }
    open fun setPopupSetWidth(popup_set_width: Boolean): Unit {
         return stub()
    }
    open fun setPopupSingleMatch(popup_single_match: Boolean): Unit {
         return stub()
    }
    open fun setTextColumn(column: Int): Unit {
         return stub()
    }
    fun setOnActionActivated(cb: () -> Unit) {
        do_connect(cptr, "action-activated", cb)
    }

    fun setOnCursorOnMatch(cb: () -> Unit) {
        do_connect(cptr, "cursor-on-match", cb)
    }

    fun setOnInsertPrefix(cb: () -> Unit) {
        do_connect(cptr, "insert-prefix", cb)
    }

    fun setOnMatchSelected(cb: () -> Unit) {
        do_connect(cptr, "match-selected", cb)
    }

    fun setOnNoMatches(cb: () -> Unit) {
        do_connect(cptr, "no-matches", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31296896UL
        fun cptr(obj: EntryCompletion): CPointer<GtkEntryCompletion> = obj.cptr
        fun newWithArea(area: CellArea): EntryCompletion = EntryCompletion(stub<CPointer<GtkEntryCompletion>>()) 
    }
}

class EntryCompletionClass(private val cptr: CPointer<cnames.structs._GtkEntryCompletionClass>) /* struct */ {
    companion object {
        fun cptr(obj: EntryCompletionClass): CPointer<cnames.structs._GtkEntryCompletionClass> = obj.cptr
    }
}

typealias EntryCompletionMatchFunc = (completion:  EntryCompletion, key:  String, iter:  TreeIter, user_data:  Any) -> Boolean

typealias EntryIconPosition = GtkEntryIconPosition

open class EventBox internal constructor (private val cptr: CPointer<GtkEventBox>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkEventBox>>())

    open fun getAboveChild(): Boolean {
         return stub()
    }
    open fun getVisibleWindow(): Boolean {
         return stub()
    }
    open fun setAboveChild(above_child: Boolean): Unit {
         return stub()
    }
    open fun setVisibleWindow(visible_window: Boolean): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31237216UL
        fun cptr(obj: EventBox): CPointer<GtkEventBox> = obj.cptr
    }
}

class EventBoxClass(private val cptr: CPointer<cnames.structs._GtkEventBoxClass>) /* struct */ {
    companion object {
        fun cptr(obj: EventBoxClass): CPointer<cnames.structs._GtkEventBoxClass> = obj.cptr
    }
}

open class EventController internal constructor (private val cptr: CPointer<GtkEventController>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getPropagationPhase(): PropagationPhase {
         return stub()
    }
    open fun getWidget(): Widget {
         return stub()
    }
    open fun handleEvent(event: com.charlag.kgtk.demo.gdk.Event): Boolean {
         return stub()
    }
    open fun reset(): Unit {
         return stub()
    }
    open fun setPropagationPhase(phase: PropagationPhase): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32478512UL
        fun cptr(obj: EventController): CPointer<GtkEventController> = obj.cptr
    }
}

class EventControllerClass(private val cptr: CPointer<cnames.structs._GtkEventControllerClass>) /* struct */ {
    companion object {
        fun cptr(obj: EventControllerClass): CPointer<cnames.structs._GtkEventControllerClass> = obj.cptr
    }
}

open class EventControllerKey internal constructor (private val cptr: CPointer<GtkEventControllerKey>) : EventController(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(widget: Widget) : this(stub<CPointer<GtkEventControllerKey>>())

    open fun forward(widget: Widget): Boolean {
         return stub()
    }
    open fun getGroup(): UInt {
         return stub()
    }
    open fun getImContext(): IMContext {
         return stub()
    }
    open fun setImContext(im_context: IMContext): Unit {
         return stub()
    }
    fun setOnFocusIn(cb: () -> Unit) {
        do_connect(cptr, "focus-in", cb)
    }

    fun setOnFocusOut(cb: () -> Unit) {
        do_connect(cptr, "focus-out", cb)
    }

    fun setOnImUpdate(cb: () -> Unit) {
        do_connect(cptr, "im-update", cb)
    }

    fun setOnKeyPressed(cb: () -> Unit) {
        do_connect(cptr, "key-pressed", cb)
    }

    fun setOnKeyReleased(cb: () -> Unit) {
        do_connect(cptr, "key-released", cb)
    }

    fun setOnModifiers(cb: () -> Unit) {
        do_connect(cptr, "modifiers", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32307536UL
        fun cptr(obj: EventControllerKey): CPointer<GtkEventControllerKey> = obj.cptr
    }
}

class EventControllerKeyClass(private val cptr: CPointer<cnames.structs._GtkEventControllerKeyClass>) /* struct */ {
    companion object {
        fun cptr(obj: EventControllerKeyClass): CPointer<cnames.structs._GtkEventControllerKeyClass> = obj.cptr
    }
}

open class EventControllerMotion internal constructor (private val cptr: CPointer<GtkEventControllerMotion>) : EventController(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(widget: Widget) : this(stub<CPointer<GtkEventControllerMotion>>())

    fun setOnEnter(cb: () -> Unit) {
        do_connect(cptr, "enter", cb)
    }

    fun setOnLeave(cb: () -> Unit) {
        do_connect(cptr, "leave", cb)
    }

    fun setOnMotion(cb: () -> Unit) {
        do_connect(cptr, "motion", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32388864UL
        fun cptr(obj: EventControllerMotion): CPointer<GtkEventControllerMotion> = obj.cptr
    }
}

class EventControllerMotionClass(private val cptr: CPointer<cnames.structs._GtkEventControllerMotionClass>) /* struct */ {
    companion object {
        fun cptr(obj: EventControllerMotionClass): CPointer<cnames.structs._GtkEventControllerMotionClass> = obj.cptr
    }
}

open class EventControllerScroll internal constructor (private val cptr: CPointer<GtkEventControllerScroll>) : EventController(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(widget: Widget, flags: EventControllerScrollFlags) : this(stub<CPointer<GtkEventControllerScroll>>())

    open fun getFlags(): EventControllerScrollFlags {
         return stub()
    }
    open fun setFlags(flags: EventControllerScrollFlags): Unit {
         return stub()
    }
    fun setOnDecelerate(cb: () -> Unit) {
        do_connect(cptr, "decelerate", cb)
    }

    fun setOnScroll(cb: () -> Unit) {
        do_connect(cptr, "scroll", cb)
    }

    fun setOnScrollBegin(cb: () -> Unit) {
        do_connect(cptr, "scroll-begin", cb)
    }

    fun setOnScrollEnd(cb: () -> Unit) {
        do_connect(cptr, "scroll-end", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31553392UL
        fun cptr(obj: EventControllerScroll): CPointer<GtkEventControllerScroll> = obj.cptr
    }
}

class EventControllerScrollClass(private val cptr: CPointer<cnames.structs._GtkEventControllerScrollClass>) /* struct */ {
    companion object {
        fun cptr(obj: EventControllerScrollClass): CPointer<cnames.structs._GtkEventControllerScrollClass> = obj.cptr
    }
}

typealias EventControllerScrollFlags = GtkEventControllerScrollFlags

typealias EventSequenceState = GtkEventSequenceState

open class Expander internal constructor (private val cptr: CPointer<GtkExpander>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(label: String) : this(stub<CPointer<GtkExpander>>())

    open fun getExpanded(): Boolean {
         return stub()
    }
    open fun getLabel(): String {
         return stub()
    }
    open fun getLabelFill(): Boolean {
         return stub()
    }
    open fun getLabelWidget(): Widget {
         return stub()
    }
    open fun getResizeToplevel(): Boolean {
         return stub()
    }
    open fun getUseMarkup(): Boolean {
         return stub()
    }
    open fun getUseUnderline(): Boolean {
         return stub()
    }
    open fun setExpanded(expanded: Boolean): Unit {
         return stub()
    }
    open fun setLabel(label: String): Unit {
         return stub()
    }
    open fun setLabelFill(label_fill: Boolean): Unit {
         return stub()
    }
    open fun setLabelWidget(label_widget: Widget): Unit {
         return stub()
    }
    open fun setResizeToplevel(resize_toplevel: Boolean): Unit {
         return stub()
    }
    open fun setUseMarkup(use_markup: Boolean): Unit {
         return stub()
    }
    open fun setUseUnderline(use_underline: Boolean): Unit {
         return stub()
    }
    fun setOnActivate(cb: () -> Unit) {
        do_connect(cptr, "activate", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31204736UL
        fun cptr(obj: Expander): CPointer<GtkExpander> = obj.cptr
        fun newWithMnemonic(label: String): Expander = Expander(stub<CPointer<GtkExpander>>()) 
    }
}

class ExpanderClass(private val cptr: CPointer<cnames.structs._GtkExpanderClass>) /* struct */ {
    companion object {
        fun cptr(obj: ExpanderClass): CPointer<cnames.structs._GtkExpanderClass> = obj.cptr
    }
}

typealias ExpanderStyle = GtkExpanderStyle

interface FileChooser : InteropWrapper {
    fun addChoice(id: String, label: String, options: List<String>, option_labels: List<String>): Unit = stub("FileChooser default impl")

    fun addFilter(filter: FileFilter): Unit = stub("FileChooser default impl")

    fun addShortcutFolder(folder: String): Boolean = stub("FileChooser default impl")

    fun addShortcutFolderUri(uri: String): Boolean = stub("FileChooser default impl")

    fun getAction(): FileChooserAction = stub("FileChooser default impl")

    fun getChoice(id: String): String = stub("FileChooser default impl")

    fun getCreateFolders(): Boolean = stub("FileChooser default impl")

    fun getCurrentFolder(): String = stub("FileChooser default impl")

    fun getCurrentFolderFile(): com.charlag.kgtk.demo.gio.File = stub("FileChooser default impl")

    fun getCurrentFolderUri(): String = stub("FileChooser default impl")

    fun getCurrentName(): String = stub("FileChooser default impl")

    fun getDoOverwriteConfirmation(): Boolean = stub("FileChooser default impl")

    fun getExtraWidget(): Widget = stub("FileChooser default impl")

    fun getFile(): com.charlag.kgtk.demo.gio.File = stub("FileChooser default impl")

    fun getFilename(): String = stub("FileChooser default impl")

    fun getFilenames(): List<String> = stub("FileChooser default impl")

    fun getFiles(): List<com.charlag.kgtk.demo.gio.File> = stub("FileChooser default impl")

    fun getFilter(): FileFilter = stub("FileChooser default impl")

    fun getLocalOnly(): Boolean = stub("FileChooser default impl")

    fun getPreviewFile(): com.charlag.kgtk.demo.gio.File = stub("FileChooser default impl")

    fun getPreviewFilename(): String = stub("FileChooser default impl")

    fun getPreviewUri(): String = stub("FileChooser default impl")

    fun getPreviewWidget(): Widget = stub("FileChooser default impl")

    fun getPreviewWidgetActive(): Boolean = stub("FileChooser default impl")

    fun getSelectMultiple(): Boolean = stub("FileChooser default impl")

    fun getShowHidden(): Boolean = stub("FileChooser default impl")

    fun getUri(): String = stub("FileChooser default impl")

    fun getUris(): List<String> = stub("FileChooser default impl")

    fun getUsePreviewLabel(): Boolean = stub("FileChooser default impl")

    fun listFilters(): List<FileFilter> = stub("FileChooser default impl")

    fun listShortcutFolderUris(): List<String> = stub("FileChooser default impl")

    fun listShortcutFolders(): List<String> = stub("FileChooser default impl")

    fun removeChoice(id: String): Unit = stub("FileChooser default impl")

    fun removeFilter(filter: FileFilter): Unit = stub("FileChooser default impl")

    fun removeShortcutFolder(folder: String): Boolean = stub("FileChooser default impl")

    fun removeShortcutFolderUri(uri: String): Boolean = stub("FileChooser default impl")

    fun selectAll(): Unit = stub("FileChooser default impl")

    fun selectFile(file: com.charlag.kgtk.demo.gio.File): Boolean = stub("FileChooser default impl")

    fun selectFilename(filename: String): Boolean = stub("FileChooser default impl")

    fun selectUri(uri: String): Boolean = stub("FileChooser default impl")

    fun setAction(action: FileChooserAction): Unit = stub("FileChooser default impl")

    fun setChoice(id: String, option: String): Unit = stub("FileChooser default impl")

    fun setCreateFolders(create_folders: Boolean): Unit = stub("FileChooser default impl")

    fun setCurrentFolder(filename: String): Boolean = stub("FileChooser default impl")

    fun setCurrentFolderFile(file: com.charlag.kgtk.demo.gio.File): Boolean = stub("FileChooser default impl")

    fun setCurrentFolderUri(uri: String): Boolean = stub("FileChooser default impl")

    fun setCurrentName(`name`: String): Unit = stub("FileChooser default impl")

    fun setDoOverwriteConfirmation(do_overwrite_confirmation: Boolean): Unit = stub("FileChooser default impl")

    fun setExtraWidget(extra_widget: Widget): Unit = stub("FileChooser default impl")

    fun setFile(file: com.charlag.kgtk.demo.gio.File): Boolean = stub("FileChooser default impl")

    fun setFilename(filename: String): Boolean = stub("FileChooser default impl")

    fun setFilter(filter: FileFilter): Unit = stub("FileChooser default impl")

    fun setLocalOnly(local_only: Boolean): Unit = stub("FileChooser default impl")

    fun setPreviewWidget(preview_widget: Widget): Unit = stub("FileChooser default impl")

    fun setPreviewWidgetActive(active: Boolean): Unit = stub("FileChooser default impl")

    fun setSelectMultiple(select_multiple: Boolean): Unit = stub("FileChooser default impl")

    fun setShowHidden(show_hidden: Boolean): Unit = stub("FileChooser default impl")

    fun setUri(uri: String): Boolean = stub("FileChooser default impl")

    fun setUsePreviewLabel(use_label: Boolean): Unit = stub("FileChooser default impl")

    fun unselectAll(): Unit = stub("FileChooser default impl")

    fun unselectFile(file: com.charlag.kgtk.demo.gio.File): Unit = stub("FileChooser default impl")

    fun unselectFilename(filename: String): Unit = stub("FileChooser default impl")

    fun unselectUri(uri: String): Unit = stub("FileChooser default impl")

    companion object {
        fun cptr(obj: FileChooser): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkFileChooser>) : FileChooser {
        override val rawPtr: COpaquePointer = cptr
    }
}

typealias FileChooserAction = GtkFileChooserAction

open class FileChooserButton internal constructor (private val cptr: CPointer<GtkFileChooserButton>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, FileChooser, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(title: String, action: FileChooserAction) : this(stub<CPointer<GtkFileChooserButton>>())

    open fun getTitle(): String {
         return stub()
    }
    open fun getWidthChars(): Int {
         return stub()
    }
    open fun setTitle(title: String): Unit {
         return stub()
    }
    open fun setWidthChars(n_chars: Int): Unit {
         return stub()
    }
    fun setOnFileSet(cb: () -> Unit) {
        do_connect(cptr, "file-set", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32664928UL
        fun cptr(obj: FileChooserButton): CPointer<GtkFileChooserButton> = obj.cptr
        fun newWithDialog(dialog: Dialog): FileChooserButton = FileChooserButton(stub<CPointer<GtkFileChooserButton>>()) 
    }
}

class FileChooserButtonClass(private val cptr: CPointer<cnames.structs._GtkFileChooserButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: FileChooserButtonClass): CPointer<cnames.structs._GtkFileChooserButtonClass> = obj.cptr
    }
}

typealias FileChooserConfirmation = GtkFileChooserConfirmation

open class FileChooserDialog internal constructor (private val cptr: CPointer<GtkFileChooserDialog>) : Dialog(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, FileChooser, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 30597760UL
        fun cptr(obj: FileChooserDialog): CPointer<GtkFileChooserDialog> = obj.cptr
    }
}

class FileChooserDialogClass(private val cptr: CPointer<cnames.structs._GtkFileChooserDialogClass>) /* struct */ {
    companion object {
        fun cptr(obj: FileChooserDialogClass): CPointer<cnames.structs._GtkFileChooserDialogClass> = obj.cptr
    }
}

typealias FileChooserError = GtkFileChooserError

open class FileChooserNative internal constructor (private val cptr: CPointer<GtkFileChooserNative>) : NativeDialog(cptr.reinterpret()), FileChooser, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(title: String, parent: Window, action: FileChooserAction, accept_label: String, cancel_label: String) : this(stub<CPointer<GtkFileChooserNative>>())

    open fun getAcceptLabel(): String {
         return stub()
    }
    open fun getCancelLabel(): String {
         return stub()
    }
    open fun setAcceptLabel(accept_label: String): Unit {
         return stub()
    }
    open fun setCancelLabel(cancel_label: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30506960UL
        fun cptr(obj: FileChooserNative): CPointer<GtkFileChooserNative> = obj.cptr
    }
}

class FileChooserNativeClass(private val cptr: CPointer<cnames.structs._GtkFileChooserNativeClass>) /* struct */ {
    companion object {
        fun cptr(obj: FileChooserNativeClass): CPointer<cnames.structs._GtkFileChooserNativeClass> = obj.cptr
    }
}

open class FileChooserWidget internal constructor (private val cptr: CPointer<GtkFileChooserWidget>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, FileChooser, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(action: FileChooserAction) : this(stub<CPointer<GtkFileChooserWidget>>())

    fun setOnDesktopFolder(cb: () -> Unit) {
        do_connect(cptr, "desktop-folder", cb)
    }

    fun setOnDownFolder(cb: () -> Unit) {
        do_connect(cptr, "down-folder", cb)
    }

    fun setOnHomeFolder(cb: () -> Unit) {
        do_connect(cptr, "home-folder", cb)
    }

    fun setOnLocationPopup(cb: () -> Unit) {
        do_connect(cptr, "location-popup", cb)
    }

    fun setOnLocationPopupOnPaste(cb: () -> Unit) {
        do_connect(cptr, "location-popup-on-paste", cb)
    }

    fun setOnLocationTogglePopup(cb: () -> Unit) {
        do_connect(cptr, "location-toggle-popup", cb)
    }

    fun setOnPlacesShortcut(cb: () -> Unit) {
        do_connect(cptr, "places-shortcut", cb)
    }

    fun setOnQuickBookmark(cb: () -> Unit) {
        do_connect(cptr, "quick-bookmark", cb)
    }

    fun setOnRecentShortcut(cb: () -> Unit) {
        do_connect(cptr, "recent-shortcut", cb)
    }

    fun setOnSearchShortcut(cb: () -> Unit) {
        do_connect(cptr, "search-shortcut", cb)
    }

    fun setOnShowHidden(cb: () -> Unit) {
        do_connect(cptr, "show-hidden", cb)
    }

    fun setOnUpFolder(cb: () -> Unit) {
        do_connect(cptr, "up-folder", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31601392UL
        fun cptr(obj: FileChooserWidget): CPointer<GtkFileChooserWidget> = obj.cptr
    }
}

class FileChooserWidgetClass(private val cptr: CPointer<cnames.structs._GtkFileChooserWidgetClass>) /* struct */ {
    companion object {
        fun cptr(obj: FileChooserWidgetClass): CPointer<cnames.structs._GtkFileChooserWidgetClass> = obj.cptr
    }
}

open class FileFilter internal constructor (private val cptr: CPointer<GtkFileFilter>) : com.charlag.kgtk.demo.gobject.InitiallyUnowned(cptr.reinterpret()), Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkFileFilter>>())

    open fun addCustom(needed: FileFilterFlags, func: FileFilterFunc, data: Any, notify: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun addMimeType(mime_type: String): Unit {
         return stub()
    }
    open fun addPattern(pattern: String): Unit {
         return stub()
    }
    open fun addPixbufFormats(): Unit {
         return stub()
    }
    open fun filter(filter_info: FileFilterInfo): Boolean {
         return stub()
    }
    override fun getName(): String {
         return stub()
    }
    open fun getNeeded(): FileFilterFlags {
         return stub()
    }
    override fun setName(`name`: String): Unit {
         return stub()
    }
    open fun toGvariant(): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32413904UL
        fun cptr(obj: FileFilter): CPointer<GtkFileFilter> = obj.cptr
        fun newFromGvariant(variant: com.charlag.kgtk.demo.glib.Variant): FileFilter = FileFilter(stub<CPointer<GtkFileFilter>>()) 
    }
}

typealias FileFilterFlags = GtkFileFilterFlags

typealias FileFilterFunc = (filter_info:  FileFilterInfo, data:  Any) -> Boolean

class FileFilterInfo(private val cptr: CPointer<cnames.structs._GtkFileFilterInfo>) /* struct */ {
    companion object {
        fun cptr(obj: FileFilterInfo): CPointer<cnames.structs._GtkFileFilterInfo> = obj.cptr
    }
}

open class Fixed internal constructor (private val cptr: CPointer<GtkFixed>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkFixed>>())

    open fun move(widget: Widget, x: Int, y: Int): Unit {
         return stub()
    }
    open fun put(widget: Widget, x: Int, y: Int): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33282000UL
        fun cptr(obj: Fixed): CPointer<GtkFixed> = obj.cptr
    }
}

class FixedChild(private val cptr: CPointer<cnames.structs._GtkFixedChild>) /* struct */ {
    companion object {
        fun cptr(obj: FixedChild): CPointer<cnames.structs._GtkFixedChild> = obj.cptr
    }
}

class FixedClass(private val cptr: CPointer<cnames.structs._GtkFixedClass>) /* struct */ {
    companion object {
        fun cptr(obj: FixedClass): CPointer<cnames.structs._GtkFixedClass> = obj.cptr
    }
}

open class FlowBox internal constructor (private val cptr: CPointer<GtkFlowBox>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkFlowBox>>())

    open fun bindModel(model: com.charlag.kgtk.demo.gio.ListModel, create_widget_func: FlowBoxCreateWidgetFunc, user_data: Any, user_data_free_func: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun getActivateOnSingleClick(): Boolean {
         return stub()
    }
    open fun getChildAtIndex(idx: Int): FlowBoxChild {
         return stub()
    }
    open fun getChildAtPos(x: Int, y: Int): FlowBoxChild {
         return stub()
    }
    open fun getColumnSpacing(): UInt {
         return stub()
    }
    open fun getHomogeneous(): Boolean {
         return stub()
    }
    open fun getMaxChildrenPerLine(): UInt {
         return stub()
    }
    open fun getMinChildrenPerLine(): UInt {
         return stub()
    }
    open fun getRowSpacing(): UInt {
         return stub()
    }
    open fun getSelectedChildren(): List<FlowBoxChild> {
         return stub()
    }
    open fun getSelectionMode(): SelectionMode {
         return stub()
    }
    open fun insert(widget: Widget, position: Int): Unit {
         return stub()
    }
    open fun invalidateFilter(): Unit {
         return stub()
    }
    open fun invalidateSort(): Unit {
         return stub()
    }
    open fun selectAll(): Unit {
         return stub()
    }
    open fun selectChild(child: FlowBoxChild): Unit {
         return stub()
    }
    open fun selectedForeach(func: FlowBoxForeachFunc, data: Any): Unit {
         return stub()
    }
    open fun setActivateOnSingleClick(single: Boolean): Unit {
         return stub()
    }
    open fun setColumnSpacing(spacing: UInt): Unit {
         return stub()
    }
    open fun setFilterFunc(filter_func: FlowBoxFilterFunc, user_data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setHadjustment(adjustment: Adjustment): Unit {
         return stub()
    }
    open fun setHomogeneous(homogeneous: Boolean): Unit {
         return stub()
    }
    open fun setMaxChildrenPerLine(n_children: UInt): Unit {
         return stub()
    }
    open fun setMinChildrenPerLine(n_children: UInt): Unit {
         return stub()
    }
    open fun setRowSpacing(spacing: UInt): Unit {
         return stub()
    }
    open fun setSelectionMode(mode: SelectionMode): Unit {
         return stub()
    }
    open fun setSortFunc(sort_func: FlowBoxSortFunc, user_data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setVadjustment(adjustment: Adjustment): Unit {
         return stub()
    }
    open fun unselectAll(): Unit {
         return stub()
    }
    open fun unselectChild(child: FlowBoxChild): Unit {
         return stub()
    }
    fun setOnActivateCursorChild(cb: () -> Unit) {
        do_connect(cptr, "activate-cursor-child", cb)
    }

    fun setOnChildActivated(cb: () -> Unit) {
        do_connect(cptr, "child-activated", cb)
    }

    fun setOnMoveCursor(cb: () -> Unit) {
        do_connect(cptr, "move-cursor", cb)
    }

    fun setOnSelectAll(cb: () -> Unit) {
        do_connect(cptr, "select-all", cb)
    }

    fun setOnSelectedChildrenChanged(cb: () -> Unit) {
        do_connect(cptr, "selected-children-changed", cb)
    }

    fun setOnToggleCursorChild(cb: () -> Unit) {
        do_connect(cptr, "toggle-cursor-child", cb)
    }

    fun setOnUnselectAll(cb: () -> Unit) {
        do_connect(cptr, "unselect-all", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33337120UL
        fun cptr(obj: FlowBox): CPointer<GtkFlowBox> = obj.cptr
    }
}

open class FlowBoxChild internal constructor (private val cptr: CPointer<GtkFlowBoxChild>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkFlowBoxChild>>())

    open fun changed(): Unit {
         return stub()
    }
    open fun getIndex(): Int {
         return stub()
    }
    open fun isSelected(): Boolean {
         return stub()
    }
    fun setOnActivate(cb: () -> Unit) {
        do_connect(cptr, "activate", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31695472UL
        fun cptr(obj: FlowBoxChild): CPointer<GtkFlowBoxChild> = obj.cptr
    }
}

class FlowBoxChildClass(private val cptr: CPointer<cnames.structs._GtkFlowBoxChildClass>) /* struct */ {
    companion object {
        fun cptr(obj: FlowBoxChildClass): CPointer<cnames.structs._GtkFlowBoxChildClass> = obj.cptr
    }
}

class FlowBoxClass(private val cptr: CPointer<cnames.structs._GtkFlowBoxClass>) /* struct */ {
    companion object {
        fun cptr(obj: FlowBoxClass): CPointer<cnames.structs._GtkFlowBoxClass> = obj.cptr
    }
}

typealias FlowBoxCreateWidgetFunc = (item:  com.charlag.kgtk.demo.gobject.Object, user_data:  Any) -> Widget

typealias FlowBoxFilterFunc = (child:  FlowBoxChild, user_data:  Any) -> Boolean

typealias FlowBoxForeachFunc = (box:  FlowBox, child:  FlowBoxChild, user_data:  Any) -> Unit

typealias FlowBoxSortFunc = (child1:  FlowBoxChild, child2:  FlowBoxChild, user_data:  Any) -> Int

open class FontButton internal constructor (private val cptr: CPointer<GtkFontButton>) : Button(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, FontChooser, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkFontButton>>())

    open fun getShowSize(): Boolean {
         return stub()
    }
    open fun getShowStyle(): Boolean {
         return stub()
    }
    open fun getTitle(): String {
         return stub()
    }
    open fun getUseFont(): Boolean {
         return stub()
    }
    open fun getUseSize(): Boolean {
         return stub()
    }
    open fun setShowSize(show_size: Boolean): Unit {
         return stub()
    }
    open fun setShowStyle(show_style: Boolean): Unit {
         return stub()
    }
    open fun setTitle(title: String): Unit {
         return stub()
    }
    open fun setUseFont(use_font: Boolean): Unit {
         return stub()
    }
    open fun setUseSize(use_size: Boolean): Unit {
         return stub()
    }
    fun setOnFontSet(cb: () -> Unit) {
        do_connect(cptr, "font-set", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31498592UL
        fun cptr(obj: FontButton): CPointer<GtkFontButton> = obj.cptr
        fun newWithFont(fontname: String): FontButton = FontButton(stub<CPointer<GtkFontButton>>()) 
    }
}

class FontButtonClass(private val cptr: CPointer<cnames.structs._GtkFontButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: FontButtonClass): CPointer<cnames.structs._GtkFontButtonClass> = obj.cptr
    }
}

interface FontChooser : InteropWrapper {
    fun getFont(): String = stub("FontChooser default impl")

    fun getFontDesc(): com.charlag.kgtk.demo.pango.FontDescription = stub("FontChooser default impl")

    fun getFontFace(): com.charlag.kgtk.demo.pango.FontFace = stub("FontChooser default impl")

    fun getFontFamily(): com.charlag.kgtk.demo.pango.FontFamily = stub("FontChooser default impl")

    fun getFontFeatures(): String = stub("FontChooser default impl")

    fun getChooserFontMap(): com.charlag.kgtk.demo.pango.FontMap = stub("getChooserFontMap() default impl")

    fun getFontSize(): Int = stub("FontChooser default impl")

    fun getLanguage(): String = stub("FontChooser default impl")

    fun getLevel(): FontChooserLevel = stub("FontChooser default impl")

    fun getPreviewText(): String = stub("FontChooser default impl")

    fun getShowPreviewEntry(): Boolean = stub("FontChooser default impl")

    fun setFilterFunc(filter: FontFilterFunc, user_data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit = stub("FontChooser default impl")

    fun setFont(fontname: String): Unit = stub("FontChooser default impl")

    fun setFontDesc(font_desc: com.charlag.kgtk.demo.pango.FontDescription): Unit = stub("FontChooser default impl")

    fun setChooserFontMap(fontmap: com.charlag.kgtk.demo.pango.FontMap): Unit = stub("setChooserFontMap() default impl")

    fun setLanguage(language: String): Unit = stub("FontChooser default impl")

    fun setLevel(level: FontChooserLevel): Unit = stub("FontChooser default impl")

    fun setPreviewText(text: String): Unit = stub("FontChooser default impl")

    fun setShowPreviewEntry(show_preview_entry: Boolean): Unit = stub("FontChooser default impl")

    companion object {
        fun cptr(obj: FontChooser): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkFontChooser>) : FontChooser {
        override val rawPtr: COpaquePointer = cptr
    }
}

open class FontChooserDialog internal constructor (private val cptr: CPointer<GtkFontChooserDialog>) : Dialog(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, FontChooser, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(title: String, parent: Window) : this(stub<CPointer<GtkFontChooserDialog>>())

    companion object {
        const val G_TYPE: gtk3.GType = 32599792UL
        fun cptr(obj: FontChooserDialog): CPointer<GtkFontChooserDialog> = obj.cptr
    }
}

class FontChooserDialogClass(private val cptr: CPointer<cnames.structs._GtkFontChooserDialogClass>) /* struct */ {
    companion object {
        fun cptr(obj: FontChooserDialogClass): CPointer<cnames.structs._GtkFontChooserDialogClass> = obj.cptr
    }
}

class FontChooserIface(private val cptr: CPointer<cnames.structs._GtkFontChooserIface>) /* struct */ {
    companion object {
        fun cptr(obj: FontChooserIface): CPointer<cnames.structs._GtkFontChooserIface> = obj.cptr
    }
}

typealias FontChooserLevel = GtkFontChooserLevel

open class FontChooserWidget internal constructor (private val cptr: CPointer<GtkFontChooserWidget>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, FontChooser, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkFontChooserWidget>>())

    companion object {
        const val G_TYPE: gtk3.GType = 30788960UL
        fun cptr(obj: FontChooserWidget): CPointer<GtkFontChooserWidget> = obj.cptr
    }
}

class FontChooserWidgetClass(private val cptr: CPointer<cnames.structs._GtkFontChooserWidgetClass>) /* struct */ {
    companion object {
        fun cptr(obj: FontChooserWidgetClass): CPointer<cnames.structs._GtkFontChooserWidgetClass> = obj.cptr
    }
}

typealias FontFilterFunc = (family:  com.charlag.kgtk.demo.pango.FontFamily, face:  com.charlag.kgtk.demo.pango.FontFace, data:  Any) -> Boolean

open class FontSelection internal constructor (private val cptr: CPointer<GtkFontSelection>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 31853664UL
        fun cptr(obj: FontSelection): CPointer<GtkFontSelection> = obj.cptr
    }
}

class FontSelectionClass(private val cptr: CPointer<cnames.structs._GtkFontSelectionClass>) /* struct */ {
    companion object {
        fun cptr(obj: FontSelectionClass): CPointer<cnames.structs._GtkFontSelectionClass> = obj.cptr
    }
}

open class FontSelectionDialog internal constructor (private val cptr: CPointer<GtkFontSelectionDialog>) : Dialog(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 32432848UL
        fun cptr(obj: FontSelectionDialog): CPointer<GtkFontSelectionDialog> = obj.cptr
    }
}

class FontSelectionDialogClass(private val cptr: CPointer<cnames.structs._GtkFontSelectionDialogClass>) /* struct */ {
    companion object {
        fun cptr(obj: FontSelectionDialogClass): CPointer<cnames.structs._GtkFontSelectionDialogClass> = obj.cptr
    }
}

open class Frame internal constructor (private val cptr: CPointer<GtkFrame>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(label: String) : this(stub<CPointer<GtkFrame>>())

    open fun getLabel(): String {
         return stub()
    }
    open fun getLabelAlign(xalign: Float, yalign: Float): Unit {
         return stub()
    }
    open fun getLabelWidget(): Widget {
         return stub()
    }
    open fun getShadowType(): ShadowType {
         return stub()
    }
    open fun setLabel(label: String): Unit {
         return stub()
    }
    open fun setLabelAlign(xalign: Float, yalign: Float): Unit {
         return stub()
    }
    open fun setLabelWidget(label_widget: Widget): Unit {
         return stub()
    }
    open fun setShadowType(type: ShadowType): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31455904UL
        fun cptr(obj: Frame): CPointer<GtkFrame> = obj.cptr
    }
}

class FrameClass(private val cptr: CPointer<cnames.structs._GtkFrameClass>) /* struct */ {
    companion object {
        fun cptr(obj: FrameClass): CPointer<cnames.structs._GtkFrameClass> = obj.cptr
    }
}

open class GLArea internal constructor (private val cptr: CPointer<GtkGLArea>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkGLArea>>())

    open fun attachBuffers(): Unit {
         return stub()
    }
    open fun getAutoRender(): Boolean {
         return stub()
    }
    open fun getContext(): com.charlag.kgtk.demo.gdk.GLContext {
         return stub()
    }
    open fun getError(): Error {
         return stub()
    }
    open fun getHasAlpha(): Boolean {
         return stub()
    }
    open fun getHasDepthBuffer(): Boolean {
         return stub()
    }
    open fun getHasStencilBuffer(): Boolean {
         return stub()
    }
    open fun getRequiredVersion(major: Int, minor: Int): Unit {
         return stub()
    }
    open fun getUseEs(): Boolean {
         return stub()
    }
    open fun makeCurrent(): Unit {
         return stub()
    }
    open fun queueRender(): Unit {
         return stub()
    }
    open fun setAutoRender(auto_render: Boolean): Unit {
         return stub()
    }
    open fun setError(error: Error): Unit {
         return stub()
    }
    open fun setHasAlpha(has_alpha: Boolean): Unit {
         return stub()
    }
    open fun setHasDepthBuffer(has_depth_buffer: Boolean): Unit {
         return stub()
    }
    open fun setHasStencilBuffer(has_stencil_buffer: Boolean): Unit {
         return stub()
    }
    open fun setRequiredVersion(major: Int, minor: Int): Unit {
         return stub()
    }
    open fun setUseEs(use_es: Boolean): Unit {
         return stub()
    }
    fun setOnCreateContext(cb: () -> Unit) {
        do_connect(cptr, "create-context", cb)
    }

    fun setOnRender(cb: () -> Unit) {
        do_connect(cptr, "render", cb)
    }

    fun setOnResize(cb: () -> Unit) {
        do_connect(cptr, "resize", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31414384UL
        fun cptr(obj: GLArea): CPointer<GtkGLArea> = obj.cptr
    }
}

class GLAreaClass(private val cptr: CPointer<cnames.structs._GtkGLAreaClass>) /* struct */ {
    companion object {
        fun cptr(obj: GLAreaClass): CPointer<cnames.structs._GtkGLAreaClass> = obj.cptr
    }
}

open class Gesture internal constructor (private val cptr: CPointer<GtkGesture>) : EventController(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getBoundingBox(rect: com.charlag.kgtk.demo.gdk.Rectangle): Boolean {
         return stub()
    }
    open fun getBoundingBoxCenter(x: Double, y: Double): Boolean {
         return stub()
    }
    open fun getDevice(): com.charlag.kgtk.demo.gdk.Device {
         return stub()
    }
    open fun getGroup(): List<Gesture> {
         return stub()
    }
    open fun getLastEvent(sequence: com.charlag.kgtk.demo.gdk.EventSequence): com.charlag.kgtk.demo.gdk.Event {
         return stub()
    }
    open fun getLastUpdatedSequence(): com.charlag.kgtk.demo.gdk.EventSequence {
         return stub()
    }
    open fun getPoint(sequence: com.charlag.kgtk.demo.gdk.EventSequence, x: Double, y: Double): Boolean {
         return stub()
    }
    open fun getSequenceState(sequence: com.charlag.kgtk.demo.gdk.EventSequence): EventSequenceState {
         return stub()
    }
    open fun getSequences(): List<com.charlag.kgtk.demo.gdk.EventSequence> {
         return stub()
    }
    open fun getWindow(): com.charlag.kgtk.demo.gdk.Window {
         return stub()
    }
    open fun group(gesture: Gesture): Unit {
         return stub()
    }
    open fun handlesSequence(sequence: com.charlag.kgtk.demo.gdk.EventSequence): Boolean {
         return stub()
    }
    open fun isActive(): Boolean {
         return stub()
    }
    open fun isGroupedWith(other: Gesture): Boolean {
         return stub()
    }
    open fun isRecognized(): Boolean {
         return stub()
    }
    open fun setSequenceState(sequence: com.charlag.kgtk.demo.gdk.EventSequence, state: EventSequenceState): Boolean {
         return stub()
    }
    open fun setState(state: EventSequenceState): Boolean {
         return stub()
    }
    open fun setWindow(window: com.charlag.kgtk.demo.gdk.Window): Unit {
         return stub()
    }
    open fun ungroup(): Unit {
         return stub()
    }
    fun setOnBegin(cb: () -> Unit) {
        do_connect(cptr, "begin", cb)
    }

    fun setOnCancel(cb: () -> Unit) {
        do_connect(cptr, "cancel", cb)
    }

    fun setOnEnd(cb: () -> Unit) {
        do_connect(cptr, "end", cb)
    }

    fun setOnSequenceStateChanged(cb: () -> Unit) {
        do_connect(cptr, "sequence-state-changed", cb)
    }

    fun setOnUpdate(cb: () -> Unit) {
        do_connect(cptr, "update", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30759024UL
        fun cptr(obj: Gesture): CPointer<GtkGesture> = obj.cptr
    }
}

class GestureClass(private val cptr: CPointer<cnames.structs._GtkGestureClass>) /* struct */ {
    companion object {
        fun cptr(obj: GestureClass): CPointer<cnames.structs._GtkGestureClass> = obj.cptr
    }
}

open class GestureDrag internal constructor (private val cptr: CPointer<GtkGestureDrag>) : GestureSingle(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(widget: Widget) : this(stub<CPointer<GtkGestureDrag>>())

    open fun getOffset(x: Double, y: Double): Boolean {
         return stub()
    }
    open fun getStartPoint(x: Double, y: Double): Boolean {
         return stub()
    }
    fun setOnDragBegin(cb: () -> Unit) {
        do_connect(cptr, "drag-begin", cb)
    }

    fun setOnDragEnd(cb: () -> Unit) {
        do_connect(cptr, "drag-end", cb)
    }

    fun setOnDragUpdate(cb: () -> Unit) {
        do_connect(cptr, "drag-update", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32703952UL
        fun cptr(obj: GestureDrag): CPointer<GtkGestureDrag> = obj.cptr
    }
}

class GestureDragClass(private val cptr: CPointer<cnames.structs._GtkGestureDragClass>) /* struct */ {
    companion object {
        fun cptr(obj: GestureDragClass): CPointer<cnames.structs._GtkGestureDragClass> = obj.cptr
    }
}

open class GestureLongPress internal constructor (private val cptr: CPointer<GtkGestureLongPress>) : GestureSingle(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(widget: Widget) : this(stub<CPointer<GtkGestureLongPress>>())

    fun setOnCancelled(cb: () -> Unit) {
        do_connect(cptr, "cancelled", cb)
    }

    fun setOnPressed(cb: () -> Unit) {
        do_connect(cptr, "pressed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32574928UL
        fun cptr(obj: GestureLongPress): CPointer<GtkGestureLongPress> = obj.cptr
    }
}

class GestureLongPressClass(private val cptr: CPointer<cnames.structs._GtkGestureLongPressClass>) /* struct */ {
    companion object {
        fun cptr(obj: GestureLongPressClass): CPointer<cnames.structs._GtkGestureLongPressClass> = obj.cptr
    }
}

open class GestureMultiPress internal constructor (private val cptr: CPointer<GtkGestureMultiPress>) : GestureSingle(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(widget: Widget) : this(stub<CPointer<GtkGestureMultiPress>>())

    open fun getArea(rect: com.charlag.kgtk.demo.gdk.Rectangle): Boolean {
         return stub()
    }
    open fun setArea(rect: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    fun setOnPressed(cb: () -> Unit) {
        do_connect(cptr, "pressed", cb)
    }

    fun setOnReleased(cb: () -> Unit) {
        do_connect(cptr, "released", cb)
    }

    fun setOnStopped(cb: () -> Unit) {
        do_connect(cptr, "stopped", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32504960UL
        fun cptr(obj: GestureMultiPress): CPointer<GtkGestureMultiPress> = obj.cptr
    }
}

class GestureMultiPressClass(private val cptr: CPointer<cnames.structs._GtkGestureMultiPressClass>) /* struct */ {
    companion object {
        fun cptr(obj: GestureMultiPressClass): CPointer<cnames.structs._GtkGestureMultiPressClass> = obj.cptr
    }
}

open class GesturePan internal constructor (private val cptr: CPointer<GtkGesturePan>) : GestureDrag(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(widget: Widget, orientation: Orientation) : this(stub<CPointer<GtkGesturePan>>())

    open fun getOrientation(): Orientation {
         return stub()
    }
    open fun setOrientation(orientation: Orientation): Unit {
         return stub()
    }
    fun setOnPan(cb: () -> Unit) {
        do_connect(cptr, "pan", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31788352UL
        fun cptr(obj: GesturePan): CPointer<GtkGesturePan> = obj.cptr
    }
}

class GesturePanClass(private val cptr: CPointer<cnames.structs._GtkGesturePanClass>) /* struct */ {
    companion object {
        fun cptr(obj: GesturePanClass): CPointer<cnames.structs._GtkGesturePanClass> = obj.cptr
    }
}

open class GestureRotate internal constructor (private val cptr: CPointer<GtkGestureRotate>) : Gesture(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(widget: Widget) : this(stub<CPointer<GtkGestureRotate>>())

    open fun getAngleDelta(): Double {
         return stub()
    }
    fun setOnAngleChanged(cb: () -> Unit) {
        do_connect(cptr, "angle-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31928544UL
        fun cptr(obj: GestureRotate): CPointer<GtkGestureRotate> = obj.cptr
    }
}

class GestureRotateClass(private val cptr: CPointer<cnames.structs._GtkGestureRotateClass>) /* struct */ {
    companion object {
        fun cptr(obj: GestureRotateClass): CPointer<cnames.structs._GtkGestureRotateClass> = obj.cptr
    }
}

open class GestureSingle internal constructor (private val cptr: CPointer<GtkGestureSingle>) : Gesture(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getButton(): UInt {
         return stub()
    }
    open fun getCurrentButton(): UInt {
         return stub()
    }
    open fun getCurrentSequence(): com.charlag.kgtk.demo.gdk.EventSequence {
         return stub()
    }
    open fun getExclusive(): Boolean {
         return stub()
    }
    open fun getTouchOnly(): Boolean {
         return stub()
    }
    open fun setButton(button: UInt): Unit {
         return stub()
    }
    open fun setExclusive(exclusive: Boolean): Unit {
         return stub()
    }
    open fun setTouchOnly(touch_only: Boolean): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32703728UL
        fun cptr(obj: GestureSingle): CPointer<GtkGestureSingle> = obj.cptr
    }
}

class GestureSingleClass(private val cptr: CPointer<cnames.structs._GtkGestureSingleClass>) /* struct */ {
    companion object {
        fun cptr(obj: GestureSingleClass): CPointer<cnames.structs._GtkGestureSingleClass> = obj.cptr
    }
}

open class GestureStylus internal constructor (private val cptr: CPointer<GtkGestureStylus>) : GestureSingle(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(widget: Widget) : this(stub<CPointer<GtkGestureStylus>>())

    open fun getAxes(axes: List<com.charlag.kgtk.demo.gdk.AxisUse>, values: List<Double>): Boolean {
         return stub()
    }
    open fun getAxis(axis: com.charlag.kgtk.demo.gdk.AxisUse, value: Double): Boolean {
         return stub()
    }
    open fun getDeviceTool(): com.charlag.kgtk.demo.gdk.DeviceTool {
         return stub()
    }
    fun setOnDown(cb: () -> Unit) {
        do_connect(cptr, "down", cb)
    }

    fun setOnMotion(cb: () -> Unit) {
        do_connect(cptr, "motion", cb)
    }

    fun setOnProximity(cb: () -> Unit) {
        do_connect(cptr, "proximity", cb)
    }

    fun setOnUp(cb: () -> Unit) {
        do_connect(cptr, "up", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33196576UL
        fun cptr(obj: GestureStylus): CPointer<GtkGestureStylus> = obj.cptr
    }
}

class GestureStylusClass(private val cptr: CPointer<cnames.structs._GtkGestureStylusClass>) /* struct */ {
    companion object {
        fun cptr(obj: GestureStylusClass): CPointer<cnames.structs._GtkGestureStylusClass> = obj.cptr
    }
}

open class GestureSwipe internal constructor (private val cptr: CPointer<GtkGestureSwipe>) : GestureSingle(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(widget: Widget) : this(stub<CPointer<GtkGestureSwipe>>())

    open fun getVelocity(velocity_x: Double, velocity_y: Double): Boolean {
         return stub()
    }
    fun setOnSwipe(cb: () -> Unit) {
        do_connect(cptr, "swipe", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31972608UL
        fun cptr(obj: GestureSwipe): CPointer<GtkGestureSwipe> = obj.cptr
    }
}

class GestureSwipeClass(private val cptr: CPointer<cnames.structs._GtkGestureSwipeClass>) /* struct */ {
    companion object {
        fun cptr(obj: GestureSwipeClass): CPointer<cnames.structs._GtkGestureSwipeClass> = obj.cptr
    }
}

open class GestureZoom internal constructor (private val cptr: CPointer<GtkGestureZoom>) : Gesture(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(widget: Widget) : this(stub<CPointer<GtkGestureZoom>>())

    open fun getScaleDelta(): Double {
         return stub()
    }
    fun setOnScaleChanged(cb: () -> Unit) {
        do_connect(cptr, "scale-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33024848UL
        fun cptr(obj: GestureZoom): CPointer<GtkGestureZoom> = obj.cptr
    }
}

class GestureZoomClass(private val cptr: CPointer<cnames.structs._GtkGestureZoomClass>) /* struct */ {
    companion object {
        fun cptr(obj: GestureZoomClass): CPointer<cnames.structs._GtkGestureZoomClass> = obj.cptr
    }
}

class Gradient(private val cptr: CPointer<cnames.structs._GtkGradient>) /* struct */ {
    fun newLinear(x0: Double, y0: Double, x1: Double, y1: Double): Gradient {
         return stub()
    }
    fun newRadial(x0: Double, y0: Double, radius0: Double, x1: Double, y1: Double, radius1: Double): Gradient {
         return stub()
    }
    fun addColorStop(offset: Double, color: SymbolicColor): Unit {
         return stub()
    }
    fun ref(): Gradient {
         return stub()
    }
    fun resolve(props: StyleProperties, resolved_gradient: com.charlag.kgtk.demo.cairo.Pattern): Boolean {
         return stub()
    }
    fun resolveForContext(context: StyleContext): com.charlag.kgtk.demo.cairo.Pattern {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Gradient): CPointer<cnames.structs._GtkGradient> = obj.cptr
    }
}

open class Grid internal constructor (private val cptr: CPointer<GtkGrid>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkGrid>>())

    open fun attach(child: Widget, left: Int, top: Int, width: Int, height: Int): Unit {
         return stub()
    }
    open fun attachNextTo(child: Widget, sibling: Widget, side: PositionType, width: Int, height: Int): Unit {
         return stub()
    }
    open fun getBaselineRow(): Int {
         return stub()
    }
    open fun getChildAt(left: Int, top: Int): Widget {
         return stub()
    }
    open fun getColumnHomogeneous(): Boolean {
         return stub()
    }
    open fun getColumnSpacing(): UInt {
         return stub()
    }
    open fun getRowBaselinePosition(row: Int): BaselinePosition {
         return stub()
    }
    open fun getRowHomogeneous(): Boolean {
         return stub()
    }
    open fun getRowSpacing(): UInt {
         return stub()
    }
    open fun insertColumn(position: Int): Unit {
         return stub()
    }
    open fun insertNextTo(sibling: Widget, side: PositionType): Unit {
         return stub()
    }
    open fun insertRow(position: Int): Unit {
         return stub()
    }
    open fun removeColumn(position: Int): Unit {
         return stub()
    }
    open fun removeRow(position: Int): Unit {
         return stub()
    }
    open fun setBaselineRow(row: Int): Unit {
         return stub()
    }
    open fun setColumnHomogeneous(homogeneous: Boolean): Unit {
         return stub()
    }
    open fun setColumnSpacing(spacing: UInt): Unit {
         return stub()
    }
    open fun setRowBaselinePosition(row: Int, pos: BaselinePosition): Unit {
         return stub()
    }
    open fun setRowHomogeneous(homogeneous: Boolean): Unit {
         return stub()
    }
    open fun setRowSpacing(spacing: UInt): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33402048UL
        fun cptr(obj: Grid): CPointer<GtkGrid> = obj.cptr
    }
}

class GridClass(private val cptr: CPointer<cnames.structs._GtkGridClass>) /* struct */ {
    companion object {
        fun cptr(obj: GridClass): CPointer<cnames.structs._GtkGridClass> = obj.cptr
    }
}

open class HBox internal constructor (private val cptr: CPointer<GtkHBox>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 33565792UL
        fun cptr(obj: HBox): CPointer<GtkHBox> = obj.cptr
    }
}

class HBoxClass(private val cptr: CPointer<cnames.structs._GtkHBoxClass>) /* struct */ {
    companion object {
        fun cptr(obj: HBoxClass): CPointer<cnames.structs._GtkHBoxClass> = obj.cptr
    }
}

open class HButtonBox internal constructor (private val cptr: CPointer<GtkHButtonBox>) : ButtonBox(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 33340464UL
        fun cptr(obj: HButtonBox): CPointer<GtkHButtonBox> = obj.cptr
    }
}

class HButtonBoxClass(private val cptr: CPointer<cnames.structs._GtkHButtonBoxClass>) /* struct */ {
    companion object {
        fun cptr(obj: HButtonBoxClass): CPointer<cnames.structs._GtkHButtonBoxClass> = obj.cptr
    }
}

open class HPaned internal constructor (private val cptr: CPointer<GtkHPaned>) : Paned(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 33666304UL
        fun cptr(obj: HPaned): CPointer<GtkHPaned> = obj.cptr
    }
}

class HPanedClass(private val cptr: CPointer<cnames.structs._GtkHPanedClass>) /* struct */ {
    companion object {
        fun cptr(obj: HPanedClass): CPointer<cnames.structs._GtkHPanedClass> = obj.cptr
    }
}

open class HSV internal constructor (private val cptr: CPointer<GtkHSV>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkHSV>>())

    open fun getColor(h: Double, s: Double, v: Double): Unit {
         return stub()
    }
    open fun getMetrics(size: Int, ring_width: Int): Unit {
         return stub()
    }
    open fun isAdjusting(): Boolean {
         return stub()
    }
    open fun setColor(h: Double, s: Double, v: Double): Unit {
         return stub()
    }
    open fun setMetrics(size: Int, ring_width: Int): Unit {
         return stub()
    }
    fun setOnChanged(cb: () -> Unit) {
        do_connect(cptr, "changed", cb)
    }

    fun setOnMove(cb: () -> Unit) {
        do_connect(cptr, "move", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30749472UL
        fun cptr(obj: HSV): CPointer<GtkHSV> = obj.cptr
        fun toRgb(h: Double, s: Double, v: Double, r: Double, g: Double, b: Double): Unit {
    return stub()
}
    }
}

class HSVClass(private val cptr: CPointer<cnames.structs._GtkHSVClass>) /* struct */ {
    companion object {
        fun cptr(obj: HSVClass): CPointer<cnames.structs._GtkHSVClass> = obj.cptr
    }
}

open class HScale internal constructor (private val cptr: CPointer<GtkHScale>) : Scale(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 32715776UL
        fun cptr(obj: HScale): CPointer<GtkHScale> = obj.cptr
    }
}

class HScaleClass(private val cptr: CPointer<cnames.structs._GtkHScaleClass>) /* struct */ {
    companion object {
        fun cptr(obj: HScaleClass): CPointer<cnames.structs._GtkHScaleClass> = obj.cptr
    }
}

open class HScrollbar internal constructor (private val cptr: CPointer<GtkHScrollbar>) : Scrollbar(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 31518352UL
        fun cptr(obj: HScrollbar): CPointer<GtkHScrollbar> = obj.cptr
    }
}

class HScrollbarClass(private val cptr: CPointer<cnames.structs._GtkHScrollbarClass>) /* struct */ {
    companion object {
        fun cptr(obj: HScrollbarClass): CPointer<cnames.structs._GtkHScrollbarClass> = obj.cptr
    }
}

open class HSeparator internal constructor (private val cptr: CPointer<GtkHSeparator>) : Separator(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 31458608UL
        fun cptr(obj: HSeparator): CPointer<GtkHSeparator> = obj.cptr
    }
}

class HSeparatorClass(private val cptr: CPointer<cnames.structs._GtkHSeparatorClass>) /* struct */ {
    companion object {
        fun cptr(obj: HSeparatorClass): CPointer<cnames.structs._GtkHSeparatorClass> = obj.cptr
    }
}

open class HandleBox internal constructor (private val cptr: CPointer<GtkHandleBox>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    fun setOnChildAttached(cb: () -> Unit) {
        do_connect(cptr, "child-attached", cb)
    }

    fun setOnChildDetached(cb: () -> Unit) {
        do_connect(cptr, "child-detached", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31456512UL
        fun cptr(obj: HandleBox): CPointer<GtkHandleBox> = obj.cptr
    }
}

class HandleBoxClass(private val cptr: CPointer<cnames.structs._GtkHandleBoxClass>) /* struct */ {
    companion object {
        fun cptr(obj: HandleBoxClass): CPointer<cnames.structs._GtkHandleBoxClass> = obj.cptr
    }
}

open class HeaderBar internal constructor (private val cptr: CPointer<GtkHeaderBar>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkHeaderBar>>())

    open fun getCustomTitle(): Widget {
         return stub()
    }
    open fun getDecorationLayout(): String {
         return stub()
    }
    open fun getHasSubtitle(): Boolean {
         return stub()
    }
    open fun getShowCloseButton(): Boolean {
         return stub()
    }
    open fun getSubtitle(): String {
         return stub()
    }
    open fun getTitle(): String {
         return stub()
    }
    open fun packEnd(child: Widget): Unit {
         return stub()
    }
    open fun packStart(child: Widget): Unit {
         return stub()
    }
    open fun setCustomTitle(title_widget: Widget): Unit {
         return stub()
    }
    open fun setDecorationLayout(layout: String): Unit {
         return stub()
    }
    open fun setHasSubtitle(setting: Boolean): Unit {
         return stub()
    }
    open fun setShowCloseButton(setting: Boolean): Unit {
         return stub()
    }
    open fun setSubtitle(subtitle: String): Unit {
         return stub()
    }
    open fun setTitle(title: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30999152UL
        fun cptr(obj: HeaderBar): CPointer<GtkHeaderBar> = obj.cptr
    }
}

class HeaderBarClass(private val cptr: CPointer<cnames.structs._GtkHeaderBarClass>) /* struct */ {
    companion object {
        fun cptr(obj: HeaderBarClass): CPointer<cnames.structs._GtkHeaderBarClass> = obj.cptr
    }
}

open class IMContext internal constructor (private val cptr: CPointer<GtkIMContext>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun deleteSurrounding(offset: Int, n_chars: Int): Boolean {
         return stub()
    }
    open fun filterKeypress(event: com.charlag.kgtk.demo.gdk.EventKey): Boolean {
         return stub()
    }
    open fun focusIn(): Unit {
         return stub()
    }
    open fun focusOut(): Unit {
         return stub()
    }
    open fun getPreeditString(str: String, attrs: com.charlag.kgtk.demo.pango.AttrList, cursor_pos: Int): Unit {
         return stub()
    }
    open fun getSurrounding(text: String, cursor_index: Int): Boolean {
         return stub()
    }
    open fun reset(): Unit {
         return stub()
    }
    open fun setClientWindow(window: com.charlag.kgtk.demo.gdk.Window): Unit {
         return stub()
    }
    open fun setCursorLocation(area: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun setSurrounding(text: String, len: Int, cursor_index: Int): Unit {
         return stub()
    }
    open fun setUsePreedit(use_preedit: Boolean): Unit {
         return stub()
    }
    fun setOnCommit(cb: () -> Unit) {
        do_connect(cptr, "commit", cb)
    }

    fun setOnDeleteSurrounding(cb: () -> Unit) {
        do_connect(cptr, "delete-surrounding", cb)
    }

    fun setOnPreeditChanged(cb: () -> Unit) {
        do_connect(cptr, "preedit-changed", cb)
    }

    fun setOnPreeditEnd(cb: () -> Unit) {
        do_connect(cptr, "preedit-end", cb)
    }

    fun setOnPreeditStart(cb: () -> Unit) {
        do_connect(cptr, "preedit-start", cb)
    }

    fun setOnRetrieveSurrounding(cb: () -> Unit) {
        do_connect(cptr, "retrieve-surrounding", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31817552UL
        fun cptr(obj: IMContext): CPointer<GtkIMContext> = obj.cptr
    }
}

class IMContextClass(private val cptr: CPointer<cnames.structs._GtkIMContextClass>) /* struct */ {
    companion object {
        fun cptr(obj: IMContextClass): CPointer<cnames.structs._GtkIMContextClass> = obj.cptr
    }
}

class IMContextInfo(private val cptr: CPointer<cnames.structs._GtkIMContextInfo>) /* struct */ {
    companion object {
        fun cptr(obj: IMContextInfo): CPointer<cnames.structs._GtkIMContextInfo> = obj.cptr
    }
}

open class IMContextSimple internal constructor (private val cptr: CPointer<GtkIMContextSimple>) : IMContext(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkIMContextSimple>>())

    open fun addComposeFile(compose_file: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31315952UL
        fun cptr(obj: IMContextSimple): CPointer<GtkIMContextSimple> = obj.cptr
    }
}

class IMContextSimpleClass(private val cptr: CPointer<cnames.structs._GtkIMContextSimpleClass>) /* struct */ {
    companion object {
        fun cptr(obj: IMContextSimpleClass): CPointer<cnames.structs._GtkIMContextSimpleClass> = obj.cptr
    }
}

open class IMMulticontext internal constructor (private val cptr: CPointer<GtkIMMulticontext>) : IMContext(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkIMMulticontext>>())

    open fun getContextId(): String {
         return stub()
    }
    open fun setContextId(context_id: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31070160UL
        fun cptr(obj: IMMulticontext): CPointer<GtkIMMulticontext> = obj.cptr
    }
}

class IMMulticontextClass(private val cptr: CPointer<cnames.structs._GtkIMMulticontextClass>) /* struct */ {
    companion object {
        fun cptr(obj: IMMulticontextClass): CPointer<cnames.structs._GtkIMMulticontextClass> = obj.cptr
    }
}

typealias IMPreeditStyle = GtkIMPreeditStyle

typealias IMStatusStyle = GtkIMStatusStyle

val INPUT_ERROR: Int get() = TODO()

val INTERFACE_AGE: Int get() = TODO()

open class IconFactory internal constructor (private val cptr: CPointer<GtkIconFactory>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 30651408UL
        fun cptr(obj: IconFactory): CPointer<GtkIconFactory> = obj.cptr
    }
}

class IconFactoryClass(private val cptr: CPointer<cnames.structs._GtkIconFactoryClass>) /* struct */ {
    companion object {
        fun cptr(obj: IconFactoryClass): CPointer<cnames.structs._GtkIconFactoryClass> = obj.cptr
    }
}

open class IconInfo internal constructor (private val cptr: CPointer<GtkIconInfo>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getBaseScale(): Int {
         return stub()
    }
    open fun getBaseSize(): Int {
         return stub()
    }
    open fun getFilename(): String {
         return stub()
    }
    open fun isSymbolic(): Boolean {
         return stub()
    }
    open fun loadIcon(): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    open fun loadIconAsync(cancellable: com.charlag.kgtk.demo.gio.Cancellable, callback: com.charlag.kgtk.demo.gio.AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun loadIconFinish(res: com.charlag.kgtk.demo.gio.AsyncResult): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    open fun loadSurface(for_window: com.charlag.kgtk.demo.gdk.Window): com.charlag.kgtk.demo.cairo.Surface {
         return stub()
    }
    open fun loadSymbolic(fg: com.charlag.kgtk.demo.gdk.RGBA, success_color: com.charlag.kgtk.demo.gdk.RGBA, warning_color: com.charlag.kgtk.demo.gdk.RGBA, error_color: com.charlag.kgtk.demo.gdk.RGBA, was_symbolic: Boolean): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    open fun loadSymbolicAsync(fg: com.charlag.kgtk.demo.gdk.RGBA, success_color: com.charlag.kgtk.demo.gdk.RGBA, warning_color: com.charlag.kgtk.demo.gdk.RGBA, error_color: com.charlag.kgtk.demo.gdk.RGBA, cancellable: com.charlag.kgtk.demo.gio.Cancellable, callback: com.charlag.kgtk.demo.gio.AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun loadSymbolicFinish(res: com.charlag.kgtk.demo.gio.AsyncResult, was_symbolic: Boolean): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    open fun loadSymbolicForContext(context: StyleContext, was_symbolic: Boolean): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    open fun loadSymbolicForContextAsync(context: StyleContext, cancellable: com.charlag.kgtk.demo.gio.Cancellable, callback: com.charlag.kgtk.demo.gio.AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun loadSymbolicForContextFinish(res: com.charlag.kgtk.demo.gio.AsyncResult, was_symbolic: Boolean): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31005696UL
        fun cptr(obj: IconInfo): CPointer<GtkIconInfo> = obj.cptr
        fun newForPixbuf(icon_theme: IconTheme, pixbuf: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): IconInfo = IconInfo(stub<CPointer<GtkIconInfo>>()) 
    }
}

class IconInfoClass(private val cptr: CPointer<cnames.structs._GtkIconInfoClass>) /* struct */ {
    companion object {
        fun cptr(obj: IconInfoClass): CPointer<cnames.structs._GtkIconInfoClass> = obj.cptr
    }
}

typealias IconLookupFlags = GtkIconLookupFlags

class IconSet(private val cptr: CPointer<cnames.structs._GtkIconSet>) /* struct */ {
    fun new(): IconSet {
         return stub()
    }
    fun newFromPixbuf(pixbuf: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): IconSet {
         return stub()
    }
    fun addSource(source: IconSource): Unit {
         return stub()
    }
    fun copy(): IconSet {
         return stub()
    }
    fun getSizes(sizes: List<Int>, n_sizes: Int): Unit {
         return stub()
    }
    fun ref(): IconSet {
         return stub()
    }
    fun renderIcon(style: Style, direction: TextDirection, state: StateType, size: Int, widget: Widget, detail: String): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    fun renderIconPixbuf(context: StyleContext, size: Int): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    fun renderIconSurface(context: StyleContext, size: Int, scale: Int, for_window: com.charlag.kgtk.demo.gdk.Window): com.charlag.kgtk.demo.cairo.Surface {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: IconSet): CPointer<cnames.structs._GtkIconSet> = obj.cptr
    }
}

typealias IconSize = GtkIconSize

class IconSource(private val cptr: CPointer<cnames.structs._GtkIconSource>) /* struct */ {
    fun new(): IconSource {
         return stub()
    }
    fun copy(): IconSource {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getDirection(): TextDirection {
         return stub()
    }
    fun getDirectionWildcarded(): Boolean {
         return stub()
    }
    fun getFilename(): String {
         return stub()
    }
    fun getIconName(): String {
         return stub()
    }
    fun getPixbuf(): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    fun getSize(): Int {
         return stub()
    }
    fun getSizeWildcarded(): Boolean {
         return stub()
    }
    fun getState(): StateType {
         return stub()
    }
    fun getStateWildcarded(): Boolean {
         return stub()
    }
    fun setDirection(direction: TextDirection): Unit {
         return stub()
    }
    fun setDirectionWildcarded(setting: Boolean): Unit {
         return stub()
    }
    fun setFilename(filename: String): Unit {
         return stub()
    }
    fun setIconName(icon_name: String): Unit {
         return stub()
    }
    fun setPixbuf(pixbuf: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): Unit {
         return stub()
    }
    fun setSize(size: Int): Unit {
         return stub()
    }
    fun setSizeWildcarded(setting: Boolean): Unit {
         return stub()
    }
    fun setState(state: StateType): Unit {
         return stub()
    }
    fun setStateWildcarded(setting: Boolean): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: IconSource): CPointer<cnames.structs._GtkIconSource> = obj.cptr
    }
}

open class IconTheme internal constructor (private val cptr: CPointer<GtkIconTheme>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkIconTheme>>())

    open fun addResourcePath(path: String): Unit {
         return stub()
    }
    open fun appendSearchPath(path: String): Unit {
         return stub()
    }
    open fun chooseIcon(icon_names: List<String>, size: Int, flags: IconLookupFlags): IconInfo {
         return stub()
    }
    open fun chooseIconForScale(icon_names: List<String>, size: Int, scale: Int, flags: IconLookupFlags): IconInfo {
         return stub()
    }
    open fun getExampleIconName(): String {
         return stub()
    }
    open fun getIconSizes(icon_name: String): List<Int> {
         return stub()
    }
    open fun getSearchPath(path: List<String>, n_elements: Int): Unit {
         return stub()
    }
    open fun hasIcon(icon_name: String): Boolean {
         return stub()
    }
    open fun listContexts(): List<String> {
         return stub()
    }
    open fun listIcons(context: String): List<String> {
         return stub()
    }
    open fun loadIcon(icon_name: String, size: Int, flags: IconLookupFlags): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    open fun loadIconForScale(icon_name: String, size: Int, scale: Int, flags: IconLookupFlags): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    open fun loadSurface(icon_name: String, size: Int, scale: Int, for_window: com.charlag.kgtk.demo.gdk.Window, flags: IconLookupFlags): com.charlag.kgtk.demo.cairo.Surface {
         return stub()
    }
    open fun lookupByGicon(icon: com.charlag.kgtk.demo.gio.Icon, size: Int, flags: IconLookupFlags): IconInfo {
         return stub()
    }
    open fun lookupByGiconForScale(icon: com.charlag.kgtk.demo.gio.Icon, size: Int, scale: Int, flags: IconLookupFlags): IconInfo {
         return stub()
    }
    open fun lookupIcon(icon_name: String, size: Int, flags: IconLookupFlags): IconInfo {
         return stub()
    }
    open fun lookupIconForScale(icon_name: String, size: Int, scale: Int, flags: IconLookupFlags): IconInfo {
         return stub()
    }
    open fun prependSearchPath(path: String): Unit {
         return stub()
    }
    open fun rescanIfNeeded(): Boolean {
         return stub()
    }
    open fun setCustomTheme(theme_name: String): Unit {
         return stub()
    }
    open fun setScreen(screen: com.charlag.kgtk.demo.gdk.Screen): Unit {
         return stub()
    }
    open fun setSearchPath(path: List<String>, n_elements: Int): Unit {
         return stub()
    }
    fun setOnChanged(cb: () -> Unit) {
        do_connect(cptr, "changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30552768UL
        fun cptr(obj: IconTheme): CPointer<GtkIconTheme> = obj.cptr
        fun getDefault(): IconTheme {
    return stub()
}
        fun getForScreen(screen: com.charlag.kgtk.demo.gdk.Screen): IconTheme {
    return stub()
}
    }
}

class IconThemeClass(private val cptr: CPointer<cnames.structs._GtkIconThemeClass>) /* struct */ {
    companion object {
        fun cptr(obj: IconThemeClass): CPointer<cnames.structs._GtkIconThemeClass> = obj.cptr
    }
}

typealias IconThemeError = GtkIconThemeError

open class IconView internal constructor (private val cptr: CPointer<GtkIconView>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, CellLayout, Scrollable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkIconView>>())

    open fun convertWidgetToBinWindowCoords(wx: Int, wy: Int, bx: Int, by: Int): Unit {
         return stub()
    }
    open fun createDragIcon(path: TreePath): com.charlag.kgtk.demo.cairo.Surface {
         return stub()
    }
    open fun enableModelDragDest(targets: List<TargetEntry>, n_targets: Int, actions: com.charlag.kgtk.demo.gdk.DragAction): Unit {
         return stub()
    }
    open fun enableModelDragSource(start_button_mask: com.charlag.kgtk.demo.gdk.ModifierType, targets: List<TargetEntry>, n_targets: Int, actions: com.charlag.kgtk.demo.gdk.DragAction): Unit {
         return stub()
    }
    open fun getActivateOnSingleClick(): Boolean {
         return stub()
    }
    open fun getCellRect(path: TreePath, cell: CellRenderer, rect: com.charlag.kgtk.demo.gdk.Rectangle): Boolean {
         return stub()
    }
    open fun getColumnSpacing(): Int {
         return stub()
    }
    open fun getColumns(): Int {
         return stub()
    }
    open fun getCursor(path: TreePath, cell: CellRenderer): Boolean {
         return stub()
    }
    open fun getDestItemAtPos(drag_x: Int, drag_y: Int, path: TreePath, pos: IconViewDropPosition): Boolean {
         return stub()
    }
    open fun getDragDestItem(path: TreePath, pos: IconViewDropPosition): Unit {
         return stub()
    }
    open fun getItemAtPos(x: Int, y: Int, path: TreePath, cell: CellRenderer): Boolean {
         return stub()
    }
    open fun getItemColumn(path: TreePath): Int {
         return stub()
    }
    open fun getItemOrientation(): Orientation {
         return stub()
    }
    open fun getItemPadding(): Int {
         return stub()
    }
    open fun getItemRow(path: TreePath): Int {
         return stub()
    }
    open fun getItemWidth(): Int {
         return stub()
    }
    open fun getMargin(): Int {
         return stub()
    }
    open fun getMarkupColumn(): Int {
         return stub()
    }
    open fun getModel(): TreeModel {
         return stub()
    }
    open fun getPathAtPos(x: Int, y: Int): TreePath {
         return stub()
    }
    open fun getPixbufColumn(): Int {
         return stub()
    }
    open fun getReorderable(): Boolean {
         return stub()
    }
    open fun getRowSpacing(): Int {
         return stub()
    }
    open fun getSelectedItems(): List<TreePath> {
         return stub()
    }
    open fun getSelectionMode(): SelectionMode {
         return stub()
    }
    open fun getSpacing(): Int {
         return stub()
    }
    open fun getTextColumn(): Int {
         return stub()
    }
    open fun getTooltipColumn(): Int {
         return stub()
    }
    open fun getTooltipContext(x: Int, y: Int, keyboard_tip: Boolean, model: TreeModel, path: TreePath, iter: TreeIter): Boolean {
         return stub()
    }
    open fun getVisibleRange(start_path: TreePath, end_path: TreePath): Boolean {
         return stub()
    }
    open fun itemActivated(path: TreePath): Unit {
         return stub()
    }
    open fun pathIsSelected(path: TreePath): Boolean {
         return stub()
    }
    open fun scrollToPath(path: TreePath, use_align: Boolean, row_align: Float, col_align: Float): Unit {
         return stub()
    }
    open fun selectAll(): Unit {
         return stub()
    }
    open fun selectPath(path: TreePath): Unit {
         return stub()
    }
    open fun selectedForeach(func: IconViewForeachFunc, data: Any): Unit {
         return stub()
    }
    open fun setActivateOnSingleClick(single: Boolean): Unit {
         return stub()
    }
    open fun setColumnSpacing(column_spacing: Int): Unit {
         return stub()
    }
    open fun setColumns(columns: Int): Unit {
         return stub()
    }
    open fun setCursor(path: TreePath, cell: CellRenderer, start_editing: Boolean): Unit {
         return stub()
    }
    open fun setDragDestItem(path: TreePath, pos: IconViewDropPosition): Unit {
         return stub()
    }
    open fun setItemOrientation(orientation: Orientation): Unit {
         return stub()
    }
    open fun setItemPadding(item_padding: Int): Unit {
         return stub()
    }
    open fun setItemWidth(item_width: Int): Unit {
         return stub()
    }
    open fun setMargin(margin: Int): Unit {
         return stub()
    }
    open fun setMarkupColumn(column: Int): Unit {
         return stub()
    }
    open fun setModel(model: TreeModel): Unit {
         return stub()
    }
    open fun setPixbufColumn(column: Int): Unit {
         return stub()
    }
    open fun setReorderable(reorderable: Boolean): Unit {
         return stub()
    }
    open fun setRowSpacing(row_spacing: Int): Unit {
         return stub()
    }
    open fun setSelectionMode(mode: SelectionMode): Unit {
         return stub()
    }
    open fun setSpacing(spacing: Int): Unit {
         return stub()
    }
    open fun setTextColumn(column: Int): Unit {
         return stub()
    }
    open fun setTooltipCell(tooltip: Tooltip, path: TreePath, cell: CellRenderer): Unit {
         return stub()
    }
    open fun setTooltipColumn(column: Int): Unit {
         return stub()
    }
    open fun setTooltipItem(tooltip: Tooltip, path: TreePath): Unit {
         return stub()
    }
    open fun unselectAll(): Unit {
         return stub()
    }
    open fun unselectPath(path: TreePath): Unit {
         return stub()
    }
    open fun unsetModelDragDest(): Unit {
         return stub()
    }
    open fun unsetModelDragSource(): Unit {
         return stub()
    }
    fun setOnActivateCursorItem(cb: () -> Unit) {
        do_connect(cptr, "activate-cursor-item", cb)
    }

    fun setOnItemActivated(cb: () -> Unit) {
        do_connect(cptr, "item-activated", cb)
    }

    fun setOnMoveCursor(cb: () -> Unit) {
        do_connect(cptr, "move-cursor", cb)
    }

    fun setOnSelectAll(cb: () -> Unit) {
        do_connect(cptr, "select-all", cb)
    }

    fun setOnSelectCursorItem(cb: () -> Unit) {
        do_connect(cptr, "select-cursor-item", cb)
    }

    fun setOnSelectionChanged(cb: () -> Unit) {
        do_connect(cptr, "selection-changed", cb)
    }

    fun setOnToggleCursorItem(cb: () -> Unit) {
        do_connect(cptr, "toggle-cursor-item", cb)
    }

    fun setOnUnselectAll(cb: () -> Unit) {
        do_connect(cptr, "unselect-all", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30856176UL
        fun cptr(obj: IconView): CPointer<GtkIconView> = obj.cptr
        fun newWithArea(area: CellArea): IconView = IconView(stub<CPointer<GtkIconView>>()) 
        fun newWithModel(model: TreeModel): IconView = IconView(stub<CPointer<GtkIconView>>()) 
    }
}

class IconViewClass(private val cptr: CPointer<cnames.structs._GtkIconViewClass>) /* struct */ {
    companion object {
        fun cptr(obj: IconViewClass): CPointer<cnames.structs._GtkIconViewClass> = obj.cptr
    }
}

typealias IconViewDropPosition = GtkIconViewDropPosition

typealias IconViewForeachFunc = (icon_view:  IconView, path:  TreePath, data:  Any) -> Unit

open class Image internal constructor (private val cptr: CPointer<GtkImage>) : Misc(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkImage>>())

    open fun clear(): Unit {
         return stub()
    }
    open fun getAnimation(): com.charlag.kgtk.demo.gdkpixbuf.PixbufAnimation {
         return stub()
    }
    open fun getGicon(gicon: com.charlag.kgtk.demo.gio.Icon, size: Int): Unit {
         return stub()
    }
    open fun getIconName(icon_name: String, size: Int): Unit {
         return stub()
    }
    open fun getPixbuf(): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    open fun getPixelSize(): Int {
         return stub()
    }
    open fun getStorageType(): ImageType {
         return stub()
    }
    open fun setFromAnimation(animation: com.charlag.kgtk.demo.gdkpixbuf.PixbufAnimation): Unit {
         return stub()
    }
    open fun setFromFile(filename: String): Unit {
         return stub()
    }
    open fun setFromGicon(icon: com.charlag.kgtk.demo.gio.Icon, size: Int): Unit {
         return stub()
    }
    open fun setFromIconName(icon_name: String, size: Int): Unit {
         return stub()
    }
    open fun setFromPixbuf(pixbuf: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): Unit {
         return stub()
    }
    open fun setFromResource(resource_path: String): Unit {
         return stub()
    }
    open fun setFromSurface(surface: com.charlag.kgtk.demo.cairo.Surface): Unit {
         return stub()
    }
    open fun setPixelSize(pixel_size: Int): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31141984UL
        fun cptr(obj: Image): CPointer<GtkImage> = obj.cptr
        fun newFromAnimation(animation: com.charlag.kgtk.demo.gdkpixbuf.PixbufAnimation): Image = Image(stub<CPointer<GtkImage>>()) 
        fun newFromFile(filename: String): Image = Image(stub<CPointer<GtkImage>>()) 
        fun newFromGicon(icon: com.charlag.kgtk.demo.gio.Icon, size: Int): Image = Image(stub<CPointer<GtkImage>>()) 
        fun newFromIconName(icon_name: String, size: Int): Image = Image(stub<CPointer<GtkImage>>()) 
        fun newFromPixbuf(pixbuf: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): Image = Image(stub<CPointer<GtkImage>>()) 
        fun newFromResource(resource_path: String): Image = Image(stub<CPointer<GtkImage>>()) 
        fun newFromSurface(surface: com.charlag.kgtk.demo.cairo.Surface): Image = Image(stub<CPointer<GtkImage>>()) 
    }
}

class ImageClass(private val cptr: CPointer<cnames.structs._GtkImageClass>) /* struct */ {
    companion object {
        fun cptr(obj: ImageClass): CPointer<cnames.structs._GtkImageClass> = obj.cptr
    }
}

open class ImageMenuItem internal constructor (private val cptr: CPointer<GtkImageMenuItem>) : MenuItem(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 30794960UL
        fun cptr(obj: ImageMenuItem): CPointer<GtkImageMenuItem> = obj.cptr
    }
}

class ImageMenuItemClass(private val cptr: CPointer<cnames.structs._GtkImageMenuItemClass>) /* struct */ {
    companion object {
        fun cptr(obj: ImageMenuItemClass): CPointer<cnames.structs._GtkImageMenuItemClass> = obj.cptr
    }
}

typealias ImageType = GtkImageType

open class InfoBar internal constructor (private val cptr: CPointer<GtkInfoBar>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkInfoBar>>())

    open fun addActionWidget(child: Widget, response_id: Int): Unit {
         return stub()
    }
    open fun addButton(button_text: String, response_id: Int): Button {
         return stub()
    }
    open fun getActionArea(): Box {
         return stub()
    }
    open fun getContentArea(): Box {
         return stub()
    }
    open fun getMessageType(): MessageType {
         return stub()
    }
    open fun getRevealed(): Boolean {
         return stub()
    }
    open fun getShowCloseButton(): Boolean {
         return stub()
    }
    open fun response(response_id: Int): Unit {
         return stub()
    }
    open fun setDefaultResponse(response_id: Int): Unit {
         return stub()
    }
    open fun setMessageType(message_type: MessageType): Unit {
         return stub()
    }
    open fun setResponseSensitive(response_id: Int, setting: Boolean): Unit {
         return stub()
    }
    open fun setRevealed(revealed: Boolean): Unit {
         return stub()
    }
    open fun setShowCloseButton(setting: Boolean): Unit {
         return stub()
    }
    fun setOnClose(cb: () -> Unit) {
        do_connect(cptr, "close", cb)
    }

    fun setOnResponse(cb: () -> Unit) {
        do_connect(cptr, "response", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33566320UL
        fun cptr(obj: InfoBar): CPointer<GtkInfoBar> = obj.cptr
    }
}

class InfoBarClass(private val cptr: CPointer<cnames.structs._GtkInfoBarClass>) /* struct */ {
    companion object {
        fun cptr(obj: InfoBarClass): CPointer<cnames.structs._GtkInfoBarClass> = obj.cptr
    }
}

typealias InputHints = GtkInputHints

typealias InputPurpose = GtkInputPurpose

open class Invisible internal constructor (private val cptr: CPointer<GtkInvisible>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkInvisible>>())

    override fun getScreen(): com.charlag.kgtk.demo.gdk.Screen {
         return stub()
    }
    open fun setScreen(screen: com.charlag.kgtk.demo.gdk.Screen): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32718896UL
        fun cptr(obj: Invisible): CPointer<GtkInvisible> = obj.cptr
        fun newForScreen(screen: com.charlag.kgtk.demo.gdk.Screen): Invisible = Invisible(stub<CPointer<GtkInvisible>>()) 
    }
}

class InvisibleClass(private val cptr: CPointer<cnames.structs._GtkInvisibleClass>) /* struct */ {
    companion object {
        fun cptr(obj: InvisibleClass): CPointer<cnames.structs._GtkInvisibleClass> = obj.cptr
    }
}

typealias JunctionSides = GtkJunctionSides

typealias Justification = GtkJustification

typealias KeySnoopFunc = (grab_widget:  Widget, event:  com.charlag.kgtk.demo.gdk.EventKey, func_data:  Any) -> Int

val LEVEL_BAR_OFFSET_FULL: String get() = TODO()

val LEVEL_BAR_OFFSET_HIGH: String get() = TODO()

val LEVEL_BAR_OFFSET_LOW: String get() = TODO()

open class Label internal constructor (private val cptr: CPointer<GtkLabel>) : Misc(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(str: String) : this(memScoped { gtk_label_new(str)!! }.reinterpret())

    open fun getAngle(): Double {
         return /* TODO: ret tag GI_TYPE_TAG_DOUBLE */ memScoped { gtk_label_get_angle(cptr)!! }
    }
    open fun getAttributes(): com.charlag.kgtk.demo.pango.AttrList {
         return com.charlag.kgtk.demo.pango.AttrList(memScoped { gtk_label_get_attributes(cptr)!! })
    }
    open fun getCurrentUri(): String {
         return memScoped { gtk_label_get_current_uri(cptr)!! }.toKString()
    }
    open fun getEllipsize(): com.charlag.kgtk.demo.pango.EllipsizeMode {
         return memScoped { gtk_label_get_ellipsize(cptr)!! }
    }
    open fun getJustify(): Justification {
         return memScoped { gtk_label_get_justify(cptr)!! }
    }
    open fun getLabel(): String {
         return memScoped { gtk_label_get_label(cptr)!! }.toKString()
    }
    open fun getLayout(): com.charlag.kgtk.demo.pango.Layout {
         return com.charlag.kgtk.demo.pango.Layout(memScoped { gtk_label_get_layout(cptr)!! })
    }
    open fun getLayoutOffsets(x: Int, y: Int): Unit {
         return memScoped { gtk_label_get_layout_offsets(cptr, stub("non-in param"), stub("non-in param"))!! }
    }
    open fun getLineWrap(): Boolean {
         return memScoped { gtk_label_get_line_wrap(cptr)!! } != 0
    }
    open fun getLineWrapMode(): com.charlag.kgtk.demo.pango.WrapMode {
         return memScoped { gtk_label_get_line_wrap_mode(cptr)!! }
    }
    open fun getLines(): Int {
         return memScoped { gtk_label_get_lines(cptr)!! }
    }
    open fun getMaxWidthChars(): Int {
         return memScoped { gtk_label_get_max_width_chars(cptr)!! }
    }
    open fun getMnemonicKeyval(): UInt {
         return memScoped { gtk_label_get_mnemonic_keyval(cptr)!! }
    }
    open fun getMnemonicWidget(): Widget {
         return Widget(memScoped { gtk_label_get_mnemonic_widget(cptr)!! })
    }
    open fun getSelectable(): Boolean {
         return memScoped { gtk_label_get_selectable(cptr)!! } != 0
    }
    open fun getSelectionBounds(start: Int, end: Int): Boolean {
         return memScoped { gtk_label_get_selection_bounds(cptr, stub("non-in param"), stub("non-in param"))!! } != 0
    }
    open fun getSingleLineMode(): Boolean {
         return memScoped { gtk_label_get_single_line_mode(cptr)!! } != 0
    }
    open fun getText(): String {
         return memScoped { gtk_label_get_text(cptr)!! }.toKString()
    }
    open fun getTrackVisitedLinks(): Boolean {
         return memScoped { gtk_label_get_track_visited_links(cptr)!! } != 0
    }
    open fun getUseMarkup(): Boolean {
         return memScoped { gtk_label_get_use_markup(cptr)!! } != 0
    }
    open fun getUseUnderline(): Boolean {
         return memScoped { gtk_label_get_use_underline(cptr)!! } != 0
    }
    open fun getWidthChars(): Int {
         return memScoped { gtk_label_get_width_chars(cptr)!! }
    }
    open fun getXalign(): Float {
         return /* TODO: ret tag GI_TYPE_TAG_FLOAT */ memScoped { gtk_label_get_xalign(cptr)!! }
    }
    open fun getYalign(): Float {
         return /* TODO: ret tag GI_TYPE_TAG_FLOAT */ memScoped { gtk_label_get_yalign(cptr)!! }
    }
    open fun selectRegion(start_offset: Int, end_offset: Int): Unit {
         return memScoped { gtk_label_select_region(cptr, start_offset, end_offset)!! }
    }
    open fun setAngle(angle: Double): Unit {
         return memScoped { gtk_label_set_angle(cptr, angle)!! }
    }
    open fun setAttributes(attrs: com.charlag.kgtk.demo.pango.AttrList): Unit {
         return memScoped { gtk_label_set_attributes(cptr, com.charlag.kgtk.demo.pango.AttrList.cptr(attrs))!! }
    }
    open fun setEllipsize(mode: com.charlag.kgtk.demo.pango.EllipsizeMode): Unit {
         return memScoped { gtk_label_set_ellipsize(cptr, mode)!! }
    }
    open fun setJustify(jtype: Justification): Unit {
         return memScoped { gtk_label_set_justify(cptr, jtype)!! }
    }
    open fun setLabel(str: String): Unit {
         return memScoped { gtk_label_set_label(cptr, str)!! }
    }
    open fun setLineWrap(wrap: Boolean): Unit {
         return memScoped { gtk_label_set_line_wrap(cptr, wrap.asGboolean())!! }
    }
    open fun setLineWrapMode(wrap_mode: com.charlag.kgtk.demo.pango.WrapMode): Unit {
         return memScoped { gtk_label_set_line_wrap_mode(cptr, wrap_mode)!! }
    }
    open fun setLines(lines: Int): Unit {
         return memScoped { gtk_label_set_lines(cptr, lines)!! }
    }
    open fun setMarkup(str: String): Unit {
         return memScoped { gtk_label_set_markup(cptr, str)!! }
    }
    open fun setMarkupWithMnemonic(str: String): Unit {
         return memScoped { gtk_label_set_markup_with_mnemonic(cptr, str)!! }
    }
    open fun setMaxWidthChars(n_chars: Int): Unit {
         return memScoped { gtk_label_set_max_width_chars(cptr, n_chars)!! }
    }
    open fun setMnemonicWidget(widget: Widget): Unit {
         return memScoped { gtk_label_set_mnemonic_widget(cptr, Widget.cptr(widget))!! }
    }
    open fun setPattern(pattern: String): Unit {
         return memScoped { gtk_label_set_pattern(cptr, pattern)!! }
    }
    open fun setSelectable(setting: Boolean): Unit {
         return memScoped { gtk_label_set_selectable(cptr, setting.asGboolean())!! }
    }
    open fun setSingleLineMode(single_line_mode: Boolean): Unit {
         return memScoped { gtk_label_set_single_line_mode(cptr, single_line_mode.asGboolean())!! }
    }
    open fun setText(str: String): Unit {
         return memScoped { gtk_label_set_text(cptr, str)!! }
    }
    open fun setTextWithMnemonic(str: String): Unit {
         return memScoped { gtk_label_set_text_with_mnemonic(cptr, str)!! }
    }
    open fun setTrackVisitedLinks(track_links: Boolean): Unit {
         return memScoped { gtk_label_set_track_visited_links(cptr, track_links.asGboolean())!! }
    }
    open fun setUseMarkup(setting: Boolean): Unit {
         return memScoped { gtk_label_set_use_markup(cptr, setting.asGboolean())!! }
    }
    open fun setUseUnderline(setting: Boolean): Unit {
         return memScoped { gtk_label_set_use_underline(cptr, setting.asGboolean())!! }
    }
    open fun setWidthChars(n_chars: Int): Unit {
         return memScoped { gtk_label_set_width_chars(cptr, n_chars)!! }
    }
    open fun setXalign(xalign: Float): Unit {
         return memScoped { gtk_label_set_xalign(cptr, xalign)!! }
    }
    open fun setYalign(yalign: Float): Unit {
         return memScoped { gtk_label_set_yalign(cptr, yalign)!! }
    }
    fun setOnActivateCurrentLink(cb: () -> Unit) {
        do_connect(cptr, "activate-current-link", cb)
    }

    fun setOnActivateLink(cb: () -> Unit) {
        do_connect(cptr, "activate-link", cb)
    }

    fun setOnCopyClipboard(cb: () -> Unit) {
        do_connect(cptr, "copy-clipboard", cb)
    }

    fun setOnMoveCursor(cb: () -> Unit) {
        do_connect(cptr, "move-cursor", cb)
    }

    fun setOnPopulatePopup(cb: () -> Unit) {
        do_connect(cptr, "populate-popup", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31327168UL
        fun cptr(obj: Label): CPointer<GtkLabel> = obj.cptr
        fun newWithMnemonic(str: String): Label = Label(memScoped { gtk_label_new_with_mnemonic(str)!! }.reinterpret()) 
    }
}

class LabelClass(private val cptr: CPointer<cnames.structs._GtkLabelClass>) /* struct */ {
    companion object {
        fun cptr(obj: LabelClass): CPointer<cnames.structs._GtkLabelClass> = obj.cptr
    }
}

class LabelSelectionInfo(private val cptr: CPointer<cnames.structs._GtkLabelSelectionInfo>) /* struct */ {
    companion object {
        fun cptr(obj: LabelSelectionInfo): CPointer<cnames.structs._GtkLabelSelectionInfo> = obj.cptr
    }
}

open class Layout internal constructor (private val cptr: CPointer<GtkLayout>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Scrollable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(hadjustment: Adjustment, vadjustment: Adjustment) : this(stub<CPointer<GtkLayout>>())

    open fun getBinWindow(): com.charlag.kgtk.demo.gdk.Window {
         return stub()
    }
    open fun getSize(width: UInt, height: UInt): Unit {
         return stub()
    }
    open fun move(child_widget: Widget, x: Int, y: Int): Unit {
         return stub()
    }
    open fun put(child_widget: Widget, x: Int, y: Int): Unit {
         return stub()
    }
    open fun setSize(width: UInt, height: UInt): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33427328UL
        fun cptr(obj: Layout): CPointer<GtkLayout> = obj.cptr
    }
}

class LayoutClass(private val cptr: CPointer<cnames.structs._GtkLayoutClass>) /* struct */ {
    companion object {
        fun cptr(obj: LayoutClass): CPointer<cnames.structs._GtkLayoutClass> = obj.cptr
    }
}

open class LevelBar internal constructor (private val cptr: CPointer<GtkLevelBar>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkLevelBar>>())

    open fun addOffsetValue(`name`: String, value: Double): Unit {
         return stub()
    }
    open fun getInverted(): Boolean {
         return stub()
    }
    open fun getMaxValue(): Double {
         return stub()
    }
    open fun getMinValue(): Double {
         return stub()
    }
    open fun getMode(): LevelBarMode {
         return stub()
    }
    open fun getOffsetValue(`name`: String, value: Double): Boolean {
         return stub()
    }
    open fun getValue(): Double {
         return stub()
    }
    open fun removeOffsetValue(`name`: String): Unit {
         return stub()
    }
    open fun setInverted(inverted: Boolean): Unit {
         return stub()
    }
    open fun setMaxValue(value: Double): Unit {
         return stub()
    }
    open fun setMinValue(value: Double): Unit {
         return stub()
    }
    open fun setMode(mode: LevelBarMode): Unit {
         return stub()
    }
    open fun setValue(value: Double): Unit {
         return stub()
    }
    fun setOnOffsetChanged(cb: () -> Unit) {
        do_connect(cptr, "offset-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32197328UL
        fun cptr(obj: LevelBar): CPointer<GtkLevelBar> = obj.cptr
        fun newForInterval(min_value: Double, max_value: Double): LevelBar = LevelBar(stub<CPointer<GtkLevelBar>>()) 
    }
}

class LevelBarClass(private val cptr: CPointer<cnames.structs._GtkLevelBarClass>) /* struct */ {
    companion object {
        fun cptr(obj: LevelBarClass): CPointer<cnames.structs._GtkLevelBarClass> = obj.cptr
    }
}

typealias LevelBarMode = GtkLevelBarMode

typealias License = GtkLicense

open class LinkButton internal constructor (private val cptr: CPointer<GtkLinkButton>) : Button(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(uri: String) : this(memScoped { gtk_link_button_new(uri)!! }.reinterpret())

    open fun getUri(): String {
         return memScoped { gtk_link_button_get_uri(cptr)!! }.toKString()
    }
    open fun getVisited(): Boolean {
         return memScoped { gtk_link_button_get_visited(cptr)!! } != 0
    }
    open fun setUri(uri: String): Unit {
         return memScoped { gtk_link_button_set_uri(cptr, uri)!! }
    }
    open fun setVisited(visited: Boolean): Unit {
         return memScoped { gtk_link_button_set_visited(cptr, visited.asGboolean())!! }
    }
    fun setOnActivateLink(cb: () -> Unit) {
        do_connect(cptr, "activate-link", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31079904UL
        fun cptr(obj: LinkButton): CPointer<GtkLinkButton> = obj.cptr
        fun newWithLabel(uri: String, label: String): LinkButton = LinkButton(memScoped { gtk_link_button_new_with_label(uri, label)!! }.reinterpret()) 
    }
}

class LinkButtonClass(private val cptr: CPointer<cnames.structs._GtkLinkButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: LinkButtonClass): CPointer<cnames.structs._GtkLinkButtonClass> = obj.cptr
    }
}

open class ListBox internal constructor (private val cptr: CPointer<GtkListBox>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkListBox>>())

    open fun bindModel(model: com.charlag.kgtk.demo.gio.ListModel, create_widget_func: ListBoxCreateWidgetFunc, user_data: Any, user_data_free_func: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun dragHighlightRow(row: ListBoxRow): Unit {
         return stub()
    }
    open fun dragUnhighlightRow(): Unit {
         return stub()
    }
    open fun getActivateOnSingleClick(): Boolean {
         return stub()
    }
    open fun getAdjustment(): Adjustment {
         return stub()
    }
    open fun getRowAtIndex(index_: Int): ListBoxRow {
         return stub()
    }
    open fun getRowAtY(y: Int): ListBoxRow {
         return stub()
    }
    open fun getSelectedRow(): ListBoxRow {
         return stub()
    }
    open fun getSelectedRows(): List<ListBoxRow> {
         return stub()
    }
    open fun getSelectionMode(): SelectionMode {
         return stub()
    }
    open fun insert(child: Widget, position: Int): Unit {
         return stub()
    }
    open fun invalidateFilter(): Unit {
         return stub()
    }
    open fun invalidateHeaders(): Unit {
         return stub()
    }
    open fun invalidateSort(): Unit {
         return stub()
    }
    open fun prepend(child: Widget): Unit {
         return stub()
    }
    open fun selectAll(): Unit {
         return stub()
    }
    open fun selectRow(row: ListBoxRow): Unit {
         return stub()
    }
    open fun selectedForeach(func: ListBoxForeachFunc, data: Any): Unit {
         return stub()
    }
    open fun setActivateOnSingleClick(single: Boolean): Unit {
         return stub()
    }
    open fun setAdjustment(adjustment: Adjustment): Unit {
         return stub()
    }
    open fun setFilterFunc(filter_func: ListBoxFilterFunc, user_data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setHeaderFunc(update_header: ListBoxUpdateHeaderFunc, user_data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setPlaceholder(placeholder: Widget): Unit {
         return stub()
    }
    open fun setSelectionMode(mode: SelectionMode): Unit {
         return stub()
    }
    open fun setSortFunc(sort_func: ListBoxSortFunc, user_data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun unselectAll(): Unit {
         return stub()
    }
    open fun unselectRow(row: ListBoxRow): Unit {
         return stub()
    }
    fun setOnActivateCursorRow(cb: () -> Unit) {
        do_connect(cptr, "activate-cursor-row", cb)
    }

    fun setOnMoveCursor(cb: () -> Unit) {
        do_connect(cptr, "move-cursor", cb)
    }

    fun setOnRowActivated(cb: () -> Unit) {
        do_connect(cptr, "row-activated", cb)
    }

    fun setOnRowSelected(cb: () -> Unit) {
        do_connect(cptr, "row-selected", cb)
    }

    fun setOnSelectAll(cb: () -> Unit) {
        do_connect(cptr, "select-all", cb)
    }

    fun setOnSelectedRowsChanged(cb: () -> Unit) {
        do_connect(cptr, "selected-rows-changed", cb)
    }

    fun setOnToggleCursorRow(cb: () -> Unit) {
        do_connect(cptr, "toggle-cursor-row", cb)
    }

    fun setOnUnselectAll(cb: () -> Unit) {
        do_connect(cptr, "unselect-all", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30760752UL
        fun cptr(obj: ListBox): CPointer<GtkListBox> = obj.cptr
    }
}

class ListBoxClass(private val cptr: CPointer<cnames.structs._GtkListBoxClass>) /* struct */ {
    companion object {
        fun cptr(obj: ListBoxClass): CPointer<cnames.structs._GtkListBoxClass> = obj.cptr
    }
}

typealias ListBoxCreateWidgetFunc = (item:  com.charlag.kgtk.demo.gobject.Object, user_data:  Any) -> Widget

typealias ListBoxFilterFunc = (row:  ListBoxRow, user_data:  Any) -> Boolean

typealias ListBoxForeachFunc = (box:  ListBox, row:  ListBoxRow, user_data:  Any) -> Unit

open class ListBoxRow internal constructor (private val cptr: CPointer<GtkListBoxRow>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkListBoxRow>>())

    open fun changed(): Unit {
         return stub()
    }
    open fun getActivatable(): Boolean {
         return stub()
    }
    open fun getHeader(): Widget {
         return stub()
    }
    open fun getIndex(): Int {
         return stub()
    }
    open fun getSelectable(): Boolean {
         return stub()
    }
    open fun isSelected(): Boolean {
         return stub()
    }
    open fun setActivatable(activatable: Boolean): Unit {
         return stub()
    }
    open fun setHeader(header: Widget): Unit {
         return stub()
    }
    open fun setSelectable(selectable: Boolean): Unit {
         return stub()
    }
    fun setOnActivate(cb: () -> Unit) {
        do_connect(cptr, "activate", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31654272UL
        fun cptr(obj: ListBoxRow): CPointer<GtkListBoxRow> = obj.cptr
    }
}

class ListBoxRowClass(private val cptr: CPointer<cnames.structs._GtkListBoxRowClass>) /* struct */ {
    companion object {
        fun cptr(obj: ListBoxRowClass): CPointer<cnames.structs._GtkListBoxRowClass> = obj.cptr
    }
}

typealias ListBoxSortFunc = (row1:  ListBoxRow, row2:  ListBoxRow, user_data:  Any) -> Int

typealias ListBoxUpdateHeaderFunc = (row:  ListBoxRow, before:  ListBoxRow, user_data:  Any) -> Unit

open class ListStore internal constructor (private val cptr: CPointer<GtkListStore>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Buildable, TreeDragDest, TreeDragSource, TreeModel, TreeSortable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(n_columns: Int, types: List<GType>) : this(stub<CPointer<GtkListStore>>())

    open fun append(iter: TreeIter): Unit {
         return stub()
    }
    open fun clear(): Unit {
         return stub()
    }
    open fun insert(iter: TreeIter, position: Int): Unit {
         return stub()
    }
    open fun insertAfter(iter: TreeIter, sibling: TreeIter): Unit {
         return stub()
    }
    open fun insertBefore(iter: TreeIter, sibling: TreeIter): Unit {
         return stub()
    }
    open fun insertWithValuesv(iter: TreeIter, position: Int, columns: List<Int>, values: List<com.charlag.kgtk.demo.gobject.Value>, n_values: Int): Unit {
         return stub()
    }
    open fun iterIsValid(iter: TreeIter): Boolean {
         return stub()
    }
    open fun moveAfter(iter: TreeIter, position: TreeIter): Unit {
         return stub()
    }
    open fun moveBefore(iter: TreeIter, position: TreeIter): Unit {
         return stub()
    }
    open fun prepend(iter: TreeIter): Unit {
         return stub()
    }
    open fun remove(iter: TreeIter): Boolean {
         return stub()
    }
    open fun reorder(new_order: List<Int>): Unit {
         return stub()
    }
    open fun setColumnTypes(n_columns: Int, types: List<GType>): Unit {
         return stub()
    }
    open fun setValue(iter: TreeIter, column: Int, value: com.charlag.kgtk.demo.gobject.Value): Unit {
         return stub()
    }
    open fun set(iter: TreeIter, columns: List<Int>, values: List<com.charlag.kgtk.demo.gobject.Value>, n_values: Int): Unit {
         return stub()
    }
    open fun swap(a: TreeIter, b: TreeIter): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31241152UL
        fun cptr(obj: ListStore): CPointer<GtkListStore> = obj.cptr
    }
}

class ListStoreClass(private val cptr: CPointer<cnames.structs._GtkListStoreClass>) /* struct */ {
    companion object {
        fun cptr(obj: ListStoreClass): CPointer<cnames.structs._GtkListStoreClass> = obj.cptr
    }
}

open class LockButton internal constructor (private val cptr: CPointer<GtkLockButton>) : Button(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(permission: com.charlag.kgtk.demo.gio.Permission) : this(stub<CPointer<GtkLockButton>>())

    open fun getPermission(): com.charlag.kgtk.demo.gio.Permission {
         return stub()
    }
    open fun setPermission(permission: com.charlag.kgtk.demo.gio.Permission): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30803120UL
        fun cptr(obj: LockButton): CPointer<GtkLockButton> = obj.cptr
    }
}

class LockButtonClass(private val cptr: CPointer<cnames.structs._GtkLockButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: LockButtonClass): CPointer<cnames.structs._GtkLockButtonClass> = obj.cptr
    }
}

val MAJOR_VERSION: Int get() = TODO()

val MAX_COMPOSE_LEN: Int get() = TODO()

val MICRO_VERSION: Int get() = TODO()

val MINOR_VERSION: Int get() = TODO()

open class Menu internal constructor (private val cptr: CPointer<GtkMenu>) : MenuShell(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkMenu>>())

    open fun attach(child: Widget, left_attach: UInt, right_attach: UInt, top_attach: UInt, bottom_attach: UInt): Unit {
         return stub()
    }
    open fun attachToWidget(attach_widget: Widget, detacher: MenuDetachFunc): Unit {
         return stub()
    }
    open fun detach(): Unit {
         return stub()
    }
    open fun getAccelGroup(): AccelGroup {
         return stub()
    }
    open fun getAccelPath(): String {
         return stub()
    }
    open fun getActive(): Widget {
         return stub()
    }
    open fun getAttachWidget(): Widget {
         return stub()
    }
    open fun getMonitor(): Int {
         return stub()
    }
    open fun getReserveToggleSize(): Boolean {
         return stub()
    }
    open fun placeOnMonitor(monitor: com.charlag.kgtk.demo.gdk.Monitor): Unit {
         return stub()
    }
    open fun popdown(): Unit {
         return stub()
    }
    open fun popupAtPointer(trigger_event: com.charlag.kgtk.demo.gdk.Event): Unit {
         return stub()
    }
    open fun popupAtRect(rect_window: com.charlag.kgtk.demo.gdk.Window, rect: com.charlag.kgtk.demo.gdk.Rectangle, rect_anchor: com.charlag.kgtk.demo.gdk.Gravity, menu_anchor: com.charlag.kgtk.demo.gdk.Gravity, trigger_event: com.charlag.kgtk.demo.gdk.Event): Unit {
         return stub()
    }
    open fun popupAtWidget(widget: Widget, widget_anchor: com.charlag.kgtk.demo.gdk.Gravity, menu_anchor: com.charlag.kgtk.demo.gdk.Gravity, trigger_event: com.charlag.kgtk.demo.gdk.Event): Unit {
         return stub()
    }
    open fun reorderChild(child: Widget, position: Int): Unit {
         return stub()
    }
    open fun reposition(): Unit {
         return stub()
    }
    open fun setAccelGroup(accel_group: AccelGroup): Unit {
         return stub()
    }
    open fun setAccelPath(accel_path: String): Unit {
         return stub()
    }
    open fun setActive(index: UInt): Unit {
         return stub()
    }
    open fun setMonitor(monitor_num: Int): Unit {
         return stub()
    }
    open fun setReserveToggleSize(reserve_toggle_size: Boolean): Unit {
         return stub()
    }
    open fun setScreen(screen: com.charlag.kgtk.demo.gdk.Screen): Unit {
         return stub()
    }
    fun setOnMoveScroll(cb: () -> Unit) {
        do_connect(cptr, "move-scroll", cb)
    }

    fun setOnPoppedUp(cb: () -> Unit) {
        do_connect(cptr, "popped-up", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31446240UL
        fun cptr(obj: Menu): CPointer<GtkMenu> = obj.cptr
        fun newFromModel(model: com.charlag.kgtk.demo.gio.MenuModel): Menu = Menu(stub<CPointer<GtkMenu>>()) 
        fun getForAttachWidget(widget: Widget): List<Widget> {
    return stub()
}
    }
}

open class MenuBar internal constructor (private val cptr: CPointer<GtkMenuBar>) : MenuShell(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkMenuBar>>())

    open fun getChildPackDirection(): PackDirection {
         return stub()
    }
    open fun getPackDirection(): PackDirection {
         return stub()
    }
    open fun setChildPackDirection(child_pack_dir: PackDirection): Unit {
         return stub()
    }
    open fun setPackDirection(pack_dir: PackDirection): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32590560UL
        fun cptr(obj: MenuBar): CPointer<GtkMenuBar> = obj.cptr
        fun newFromModel(model: com.charlag.kgtk.demo.gio.MenuModel): MenuBar = MenuBar(stub<CPointer<GtkMenuBar>>()) 
    }
}

class MenuBarClass(private val cptr: CPointer<cnames.structs._GtkMenuBarClass>) /* struct */ {
    companion object {
        fun cptr(obj: MenuBarClass): CPointer<cnames.structs._GtkMenuBarClass> = obj.cptr
    }
}

open class MenuButton internal constructor (private val cptr: CPointer<GtkMenuButton>) : ToggleButton(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkMenuButton>>())

    open fun getAlignWidget(): Widget {
         return stub()
    }
    open fun getArrowDirection(): ArrowType {
         return stub()
    }
    open fun getMenuModel(): com.charlag.kgtk.demo.gio.MenuModel {
         return stub()
    }
    open fun getPopover(): Popover {
         return stub()
    }
    open fun getPopup(): Menu {
         return stub()
    }
    open fun getUsePopover(): Boolean {
         return stub()
    }
    open fun setAlignWidget(align_widget: Widget): Unit {
         return stub()
    }
    open fun setArrowDirection(direction: ArrowType): Unit {
         return stub()
    }
    open fun setMenuModel(menu_model: com.charlag.kgtk.demo.gio.MenuModel): Unit {
         return stub()
    }
    open fun setPopover(popover: Widget): Unit {
         return stub()
    }
    open fun setPopup(menu: Widget): Unit {
         return stub()
    }
    open fun setUsePopover(use_popover: Boolean): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31791104UL
        fun cptr(obj: MenuButton): CPointer<GtkMenuButton> = obj.cptr
    }
}

class MenuButtonClass(private val cptr: CPointer<cnames.structs._GtkMenuButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: MenuButtonClass): CPointer<cnames.structs._GtkMenuButtonClass> = obj.cptr
    }
}

class MenuClass(private val cptr: CPointer<cnames.structs._GtkMenuClass>) /* struct */ {
    companion object {
        fun cptr(obj: MenuClass): CPointer<cnames.structs._GtkMenuClass> = obj.cptr
    }
}

typealias MenuDetachFunc = (attach_widget:  Widget, menu:  Menu) -> Unit

typealias MenuDirectionType = GtkMenuDirectionType

open class MenuItem internal constructor (private val cptr: CPointer<GtkMenuItem>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkMenuItem>>())

    open fun activateMenu(): Unit {
         return stub()
    }
    open fun deselect(): Unit {
         return stub()
    }
    open fun getAccelPath(): String {
         return stub()
    }
    open fun getLabel(): String {
         return stub()
    }
    open fun getReserveIndicator(): Boolean {
         return stub()
    }
    open fun getSubmenu(): Widget {
         return stub()
    }
    open fun getUseUnderline(): Boolean {
         return stub()
    }
    open fun select(): Unit {
         return stub()
    }
    open fun setAccelPath(accel_path: String): Unit {
         return stub()
    }
    open fun setLabel(label: String): Unit {
         return stub()
    }
    open fun setReserveIndicator(reserve: Boolean): Unit {
         return stub()
    }
    open fun setSubmenu(submenu: Menu): Unit {
         return stub()
    }
    open fun setUseUnderline(setting: Boolean): Unit {
         return stub()
    }
    open fun toggleSizeAllocate(allocation: Int): Unit {
         return stub()
    }
    open fun toggleSizeRequest(requisition: Int): Unit {
         return stub()
    }
    fun setOnActivate(cb: () -> Unit) {
        do_connect(cptr, "activate", cb)
    }

    fun setOnActivateItem(cb: () -> Unit) {
        do_connect(cptr, "activate-item", cb)
    }

    fun setOnDeselect(cb: () -> Unit) {
        do_connect(cptr, "deselect", cb)
    }

    fun setOnSelect(cb: () -> Unit) {
        do_connect(cptr, "select", cb)
    }

    fun setOnToggleSizeAllocate(cb: () -> Unit) {
        do_connect(cptr, "toggle-size-allocate", cb)
    }

    fun setOnToggleSizeRequest(cb: () -> Unit) {
        do_connect(cptr, "toggle-size-request", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32150096UL
        fun cptr(obj: MenuItem): CPointer<GtkMenuItem> = obj.cptr
        fun newWithLabel(label: String): MenuItem = MenuItem(stub<CPointer<GtkMenuItem>>()) 
        fun newWithMnemonic(label: String): MenuItem = MenuItem(stub<CPointer<GtkMenuItem>>()) 
    }
}

class MenuItemClass(private val cptr: CPointer<cnames.structs._GtkMenuItemClass>) /* struct */ {
    companion object {
        fun cptr(obj: MenuItemClass): CPointer<cnames.structs._GtkMenuItemClass> = obj.cptr
    }
}

typealias MenuPositionFunc = (menu:  Menu, x:  Int, y:  Int, push_in:  Boolean, user_data:  Any) -> Unit

open class MenuShell internal constructor (private val cptr: CPointer<GtkMenuShell>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun activateItem(menu_item: Widget, force_deactivate: Boolean): Unit {
         return stub()
    }
    open fun append(child: MenuItem): Unit {
         return stub()
    }
    open fun bindModel(model: com.charlag.kgtk.demo.gio.MenuModel, action_namespace: String, with_separators: Boolean): Unit {
         return stub()
    }
    open fun cancel(): Unit {
         return stub()
    }
    open fun deactivate(): Unit {
         return stub()
    }
    open fun deselect(): Unit {
         return stub()
    }
    open fun getParentShell(): Widget {
         return stub()
    }
    open fun getSelectedItem(): Widget {
         return stub()
    }
    open fun getTakeFocus(): Boolean {
         return stub()
    }
    open fun insert(child: Widget, position: Int): Unit {
         return stub()
    }
    open fun prepend(child: Widget): Unit {
         return stub()
    }
    open fun selectFirst(search_sensitive: Boolean): Unit {
         return stub()
    }
    open fun selectItem(menu_item: Widget): Unit {
         return stub()
    }
    open fun setTakeFocus(take_focus: Boolean): Unit {
         return stub()
    }
    fun setOnActivateCurrent(cb: () -> Unit) {
        do_connect(cptr, "activate-current", cb)
    }

    fun setOnCancel(cb: () -> Unit) {
        do_connect(cptr, "cancel", cb)
    }

    fun setOnCycleFocus(cb: () -> Unit) {
        do_connect(cptr, "cycle-focus", cb)
    }

    fun setOnDeactivate(cb: () -> Unit) {
        do_connect(cptr, "deactivate", cb)
    }

    fun setOnInsert(cb: () -> Unit) {
        do_connect(cptr, "insert", cb)
    }

    fun setOnMoveCurrent(cb: () -> Unit) {
        do_connect(cptr, "move-current", cb)
    }

    fun setOnMoveSelected(cb: () -> Unit) {
        do_connect(cptr, "move-selected", cb)
    }

    fun setOnSelectionDone(cb: () -> Unit) {
        do_connect(cptr, "selection-done", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30792176UL
        fun cptr(obj: MenuShell): CPointer<GtkMenuShell> = obj.cptr
    }
}

class MenuShellClass(private val cptr: CPointer<cnames.structs._GtkMenuShellClass>) /* struct */ {
    companion object {
        fun cptr(obj: MenuShellClass): CPointer<cnames.structs._GtkMenuShellClass> = obj.cptr
    }
}

open class MenuToolButton internal constructor (private val cptr: CPointer<GtkMenuToolButton>) : ToolButton(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(icon_widget: Widget, label: String) : this(stub<CPointer<GtkMenuToolButton>>())

    open fun getMenu(): Widget {
         return stub()
    }
    open fun setArrowTooltipMarkup(markup: String): Unit {
         return stub()
    }
    open fun setArrowTooltipText(text: String): Unit {
         return stub()
    }
    open fun setMenu(menu: Widget): Unit {
         return stub()
    }
    fun setOnShowMenu(cb: () -> Unit) {
        do_connect(cptr, "show-menu", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31394688UL
        fun cptr(obj: MenuToolButton): CPointer<GtkMenuToolButton> = obj.cptr
    }
}

class MenuToolButtonClass(private val cptr: CPointer<cnames.structs._GtkMenuToolButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: MenuToolButtonClass): CPointer<cnames.structs._GtkMenuToolButtonClass> = obj.cptr
    }
}

open class MessageDialog internal constructor (private val cptr: CPointer<GtkMessageDialog>) : Dialog(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getMessageArea(): Widget {
         return Widget(memScoped { gtk_message_dialog_get_message_area(cptr)!! })
    }
    open fun setMarkup(str: String): Unit {
         return memScoped { gtk_message_dialog_set_markup(cptr, str)!! }
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30619648UL
        fun cptr(obj: MessageDialog): CPointer<GtkMessageDialog> = obj.cptr
    }
}

class MessageDialogClass(private val cptr: CPointer<cnames.structs._GtkMessageDialogClass>) /* struct */ {
    companion object {
        fun cptr(obj: MessageDialogClass): CPointer<cnames.structs._GtkMessageDialogClass> = obj.cptr
    }
}

typealias MessageType = GtkMessageType

open class Misc internal constructor (private val cptr: CPointer<GtkMisc>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 31341472UL
        fun cptr(obj: Misc): CPointer<GtkMisc> = obj.cptr
    }
}

class MiscClass(private val cptr: CPointer<cnames.structs._GtkMiscClass>) /* struct */ {
    companion object {
        fun cptr(obj: MiscClass): CPointer<cnames.structs._GtkMiscClass> = obj.cptr
    }
}

open class ModelButton internal constructor (private val cptr: CPointer<GtkModelButton>) : Button(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkModelButton>>())

    companion object {
        const val G_TYPE: gtk3.GType = 31173104UL
        fun cptr(obj: ModelButton): CPointer<GtkModelButton> = obj.cptr
    }
}

typealias ModuleDisplayInitFunc = (display:  com.charlag.kgtk.demo.gdk.Display) -> Unit

typealias ModuleInitFunc = (argc:  Int, argv:  List<String>) -> Unit

open class MountOperation internal constructor (private val cptr: CPointer<GtkMountOperation>) : com.charlag.kgtk.demo.gio.MountOperation(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(parent: Window) : this(stub<CPointer<GtkMountOperation>>())

    open fun getParent(): Window {
         return stub()
    }
    open fun getScreen(): com.charlag.kgtk.demo.gdk.Screen {
         return stub()
    }
    open fun isShowing(): Boolean {
         return stub()
    }
    open fun setParent(parent: Window): Unit {
         return stub()
    }
    open fun setScreen(screen: com.charlag.kgtk.demo.gdk.Screen): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31857952UL
        fun cptr(obj: MountOperation): CPointer<GtkMountOperation> = obj.cptr
    }
}

class MountOperationClass(private val cptr: CPointer<cnames.structs._GtkMountOperationClass>) /* struct */ {
    companion object {
        fun cptr(obj: MountOperationClass): CPointer<cnames.structs._GtkMountOperationClass> = obj.cptr
    }
}

typealias MovementStep = GtkMovementStep

open class NativeDialog internal constructor (private val cptr: CPointer<GtkNativeDialog>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun destroy(): Unit {
         return stub()
    }
    open fun getModal(): Boolean {
         return stub()
    }
    open fun getTitle(): String {
         return stub()
    }
    open fun getTransientFor(): Window {
         return stub()
    }
    open fun getVisible(): Boolean {
         return stub()
    }
    open fun hide(): Unit {
         return stub()
    }
    open fun run(): Int {
         return stub()
    }
    open fun setModal(modal: Boolean): Unit {
         return stub()
    }
    open fun setTitle(title: String): Unit {
         return stub()
    }
    open fun setTransientFor(parent: Window): Unit {
         return stub()
    }
    open fun show(): Unit {
         return stub()
    }
    fun setOnResponse(cb: () -> Unit) {
        do_connect(cptr, "response", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32521056UL
        fun cptr(obj: NativeDialog): CPointer<GtkNativeDialog> = obj.cptr
    }
}

class NativeDialogClass(private val cptr: CPointer<cnames.structs._GtkNativeDialogClass>) /* struct */ {
    companion object {
        fun cptr(obj: NativeDialogClass): CPointer<cnames.structs._GtkNativeDialogClass> = obj.cptr
    }
}

open class Notebook internal constructor (private val cptr: CPointer<GtkNotebook>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkNotebook>>())

    open fun appendPage(child: Widget, tab_label: Widget): Int {
         return stub()
    }
    open fun appendPageMenu(child: Widget, tab_label: Widget, menu_label: Widget): Int {
         return stub()
    }
    open fun detachTab(child: Widget): Unit {
         return stub()
    }
    open fun getActionWidget(pack_type: PackType): Widget {
         return stub()
    }
    open fun getCurrentPage(): Int {
         return stub()
    }
    open fun getGroupName(): String {
         return stub()
    }
    open fun getMenuLabel(child: Widget): Widget {
         return stub()
    }
    open fun getMenuLabelText(child: Widget): String {
         return stub()
    }
    open fun getNPages(): Int {
         return stub()
    }
    open fun getNthPage(page_num: Int): Widget {
         return stub()
    }
    open fun getScrollable(): Boolean {
         return stub()
    }
    open fun getShowBorder(): Boolean {
         return stub()
    }
    open fun getShowTabs(): Boolean {
         return stub()
    }
    open fun getTabDetachable(child: Widget): Boolean {
         return stub()
    }
    open fun getTabLabel(child: Widget): Widget {
         return stub()
    }
    open fun getTabLabelText(child: Widget): String {
         return stub()
    }
    open fun getTabPos(): PositionType {
         return stub()
    }
    open fun getTabReorderable(child: Widget): Boolean {
         return stub()
    }
    open fun insertPage(child: Widget, tab_label: Widget, position: Int): Int {
         return stub()
    }
    open fun insertPageMenu(child: Widget, tab_label: Widget, menu_label: Widget, position: Int): Int {
         return stub()
    }
    open fun nextPage(): Unit {
         return stub()
    }
    open fun pageNum(child: Widget): Int {
         return stub()
    }
    open fun popupDisable(): Unit {
         return stub()
    }
    open fun popupEnable(): Unit {
         return stub()
    }
    open fun prependPage(child: Widget, tab_label: Widget): Int {
         return stub()
    }
    open fun prependPageMenu(child: Widget, tab_label: Widget, menu_label: Widget): Int {
         return stub()
    }
    open fun prevPage(): Unit {
         return stub()
    }
    open fun removePage(page_num: Int): Unit {
         return stub()
    }
    open fun reorderChild(child: Widget, position: Int): Unit {
         return stub()
    }
    open fun setActionWidget(widget: Widget, pack_type: PackType): Unit {
         return stub()
    }
    open fun setCurrentPage(page_num: Int): Unit {
         return stub()
    }
    open fun setGroupName(group_name: String): Unit {
         return stub()
    }
    open fun setMenuLabel(child: Widget, menu_label: Widget): Unit {
         return stub()
    }
    open fun setMenuLabelText(child: Widget, menu_text: String): Unit {
         return stub()
    }
    open fun setScrollable(scrollable: Boolean): Unit {
         return stub()
    }
    open fun setShowBorder(show_border: Boolean): Unit {
         return stub()
    }
    open fun setShowTabs(show_tabs: Boolean): Unit {
         return stub()
    }
    open fun setTabDetachable(child: Widget, detachable: Boolean): Unit {
         return stub()
    }
    open fun setTabLabel(child: Widget, tab_label: Widget): Unit {
         return stub()
    }
    open fun setTabLabelText(child: Widget, tab_text: String): Unit {
         return stub()
    }
    open fun setTabPos(pos: PositionType): Unit {
         return stub()
    }
    open fun setTabReorderable(child: Widget, reorderable: Boolean): Unit {
         return stub()
    }
    fun setOnChangeCurrentPage(cb: () -> Unit) {
        do_connect(cptr, "change-current-page", cb)
    }

    fun setOnCreateWindow(cb: () -> Unit) {
        do_connect(cptr, "create-window", cb)
    }

    fun setOnFocusTab(cb: () -> Unit) {
        do_connect(cptr, "focus-tab", cb)
    }

    fun setOnMoveFocusOut(cb: () -> Unit) {
        do_connect(cptr, "move-focus-out", cb)
    }

    fun setOnPageAdded(cb: () -> Unit) {
        do_connect(cptr, "page-added", cb)
    }

    fun setOnPageRemoved(cb: () -> Unit) {
        do_connect(cptr, "page-removed", cb)
    }

    fun setOnPageReordered(cb: () -> Unit) {
        do_connect(cptr, "page-reordered", cb)
    }

    fun setOnReorderTab(cb: () -> Unit) {
        do_connect(cptr, "reorder-tab", cb)
    }

    fun setOnSelectPage(cb: () -> Unit) {
        do_connect(cptr, "select-page", cb)
    }

    fun setOnSwitchPage(cb: () -> Unit) {
        do_connect(cptr, "switch-page", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32505760UL
        fun cptr(obj: Notebook): CPointer<GtkNotebook> = obj.cptr
    }
}

class NotebookClass(private val cptr: CPointer<cnames.structs._GtkNotebookClass>) /* struct */ {
    companion object {
        fun cptr(obj: NotebookClass): CPointer<cnames.structs._GtkNotebookClass> = obj.cptr
    }
}

typealias NotebookTab = GtkNotebookTab

typealias NumberUpLayout = GtkNumberUpLayout

open class NumerableIcon internal constructor (private val cptr: CPointer<GtkNumerableIcon>) : com.charlag.kgtk.demo.gio.EmblemedIcon(cptr.reinterpret()), com.charlag.kgtk.demo.gio.Icon, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 34763360UL
        fun cptr(obj: NumerableIcon): CPointer<GtkNumerableIcon> = obj.cptr
    }
}

class NumerableIconClass(private val cptr: CPointer<cnames.structs._GtkNumerableIconClass>) /* struct */ {
    companion object {
        fun cptr(obj: NumerableIconClass): CPointer<cnames.structs._GtkNumerableIconClass> = obj.cptr
    }
}

open class OffscreenWindow internal constructor (private val cptr: CPointer<GtkOffscreenWindow>) : Window(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkOffscreenWindow>>())

    open fun getPixbuf(): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    open fun getSurface(): com.charlag.kgtk.demo.cairo.Surface {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33480080UL
        fun cptr(obj: OffscreenWindow): CPointer<GtkOffscreenWindow> = obj.cptr
    }
}

class OffscreenWindowClass(private val cptr: CPointer<cnames.structs._GtkOffscreenWindowClass>) /* struct */ {
    companion object {
        fun cptr(obj: OffscreenWindowClass): CPointer<cnames.structs._GtkOffscreenWindowClass> = obj.cptr
    }
}

interface Orientable : InteropWrapper {
    fun getOrientation(): Orientation = stub("Orientable default impl")

    fun setOrientation(orientation: Orientation): Unit = stub("Orientable default impl")

    companion object {
        fun cptr(obj: Orientable): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkOrientable>) : Orientable {
        override val rawPtr: COpaquePointer = cptr
    }
}

class OrientableIface(private val cptr: CPointer<cnames.structs._GtkOrientableIface>) /* struct */ {
    companion object {
        fun cptr(obj: OrientableIface): CPointer<cnames.structs._GtkOrientableIface> = obj.cptr
    }
}

typealias Orientation = GtkOrientation

open class Overlay internal constructor (private val cptr: CPointer<GtkOverlay>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkOverlay>>())

    open fun addOverlay(widget: Widget): Unit {
         return stub()
    }
    open fun getOverlayPassThrough(widget: Widget): Boolean {
         return stub()
    }
    open fun reorderOverlay(child: Widget, index_: Int): Unit {
         return stub()
    }
    open fun setOverlayPassThrough(widget: Widget, pass_through: Boolean): Unit {
         return stub()
    }
    fun setOnGetChildPosition(cb: () -> Unit) {
        do_connect(cptr, "get-child-position", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32475248UL
        fun cptr(obj: Overlay): CPointer<GtkOverlay> = obj.cptr
    }
}

class OverlayClass(private val cptr: CPointer<cnames.structs._GtkOverlayClass>) /* struct */ {
    companion object {
        fun cptr(obj: OverlayClass): CPointer<cnames.structs._GtkOverlayClass> = obj.cptr
    }
}

val PAPER_NAME_A3: String get() = TODO()

val PAPER_NAME_A4: String get() = TODO()

val PAPER_NAME_A5: String get() = TODO()

val PAPER_NAME_B5: String get() = TODO()

val PAPER_NAME_EXECUTIVE: String get() = TODO()

val PAPER_NAME_LEGAL: String get() = TODO()

val PAPER_NAME_LETTER: String get() = TODO()

val PATH_PRIO_MASK: Int get() = TODO()

val PRINT_SETTINGS_COLLATE: String get() = TODO()

val PRINT_SETTINGS_DEFAULT_SOURCE: String get() = TODO()

val PRINT_SETTINGS_DITHER: String get() = TODO()

val PRINT_SETTINGS_DUPLEX: String get() = TODO()

val PRINT_SETTINGS_FINISHINGS: String get() = TODO()

val PRINT_SETTINGS_MEDIA_TYPE: String get() = TODO()

val PRINT_SETTINGS_NUMBER_UP: String get() = TODO()

val PRINT_SETTINGS_NUMBER_UP_LAYOUT: String get() = TODO()

val PRINT_SETTINGS_N_COPIES: String get() = TODO()

val PRINT_SETTINGS_ORIENTATION: String get() = TODO()

val PRINT_SETTINGS_OUTPUT_BASENAME: String get() = TODO()

val PRINT_SETTINGS_OUTPUT_BIN: String get() = TODO()

val PRINT_SETTINGS_OUTPUT_DIR: String get() = TODO()

val PRINT_SETTINGS_OUTPUT_FILE_FORMAT: String get() = TODO()

val PRINT_SETTINGS_OUTPUT_URI: String get() = TODO()

val PRINT_SETTINGS_PAGE_RANGES: String get() = TODO()

val PRINT_SETTINGS_PAGE_SET: String get() = TODO()

val PRINT_SETTINGS_PAPER_FORMAT: String get() = TODO()

val PRINT_SETTINGS_PAPER_HEIGHT: String get() = TODO()

val PRINT_SETTINGS_PAPER_WIDTH: String get() = TODO()

val PRINT_SETTINGS_PRINTER: String get() = TODO()

val PRINT_SETTINGS_PRINTER_LPI: String get() = TODO()

val PRINT_SETTINGS_PRINT_PAGES: String get() = TODO()

val PRINT_SETTINGS_QUALITY: String get() = TODO()

val PRINT_SETTINGS_RESOLUTION: String get() = TODO()

val PRINT_SETTINGS_RESOLUTION_X: String get() = TODO()

val PRINT_SETTINGS_RESOLUTION_Y: String get() = TODO()

val PRINT_SETTINGS_REVERSE: String get() = TODO()

val PRINT_SETTINGS_SCALE: String get() = TODO()

val PRINT_SETTINGS_USE_COLOR: String get() = TODO()

val PRINT_SETTINGS_WIN32_DRIVER_EXTRA: String get() = TODO()

val PRINT_SETTINGS_WIN32_DRIVER_VERSION: String get() = TODO()

val PRIORITY_RESIZE: Int get() = TODO()

typealias PackDirection = GtkPackDirection

typealias PackType = GtkPackType

class PadActionEntry(private val cptr: CPointer<cnames.structs._GtkPadActionEntry>) /* struct */ {
    companion object {
        fun cptr(obj: PadActionEntry): CPointer<cnames.structs._GtkPadActionEntry> = obj.cptr
    }
}

typealias PadActionType = GtkPadActionType

open class PadController internal constructor (private val cptr: CPointer<GtkPadController>) : EventController(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(window: Window, group: com.charlag.kgtk.demo.gio.ActionGroup, pad: com.charlag.kgtk.demo.gdk.Device) : this(stub<CPointer<GtkPadController>>())

    open fun setAction(type: PadActionType, index: Int, mode: Int, label: String, action_name: String): Unit {
         return stub()
    }
    open fun setActionEntries(entries: List<PadActionEntry>, n_entries: Int): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 35105968UL
        fun cptr(obj: PadController): CPointer<GtkPadController> = obj.cptr
    }
}

class PadControllerClass(private val cptr: CPointer<cnames.structs._GtkPadControllerClass>) /* struct */ {
    companion object {
        fun cptr(obj: PadControllerClass): CPointer<cnames.structs._GtkPadControllerClass> = obj.cptr
    }
}

typealias PageOrientation = GtkPageOrientation

class PageRange(private val cptr: CPointer<cnames.structs._GtkPageRange>) /* struct */ {
    companion object {
        fun cptr(obj: PageRange): CPointer<cnames.structs._GtkPageRange> = obj.cptr
    }
}

typealias PageSet = GtkPageSet

open class PageSetup internal constructor (private val cptr: CPointer<GtkPageSetup>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkPageSetup>>())

    open fun copy(): PageSetup {
         return stub()
    }
    open fun getBottomMargin(unit: Unit): Double {
         return stub()
    }
    open fun getLeftMargin(unit: Unit): Double {
         return stub()
    }
    open fun getOrientation(): PageOrientation {
         return stub()
    }
    open fun getPageHeight(unit: Unit): Double {
         return stub()
    }
    open fun getPageWidth(unit: Unit): Double {
         return stub()
    }
    open fun getPaperHeight(unit: Unit): Double {
         return stub()
    }
    open fun getPaperSize(): PaperSize {
         return stub()
    }
    open fun getPaperWidth(unit: Unit): Double {
         return stub()
    }
    open fun getRightMargin(unit: Unit): Double {
         return stub()
    }
    open fun getTopMargin(unit: Unit): Double {
         return stub()
    }
    open fun loadFile(file_name: String): Boolean {
         return stub()
    }
    open fun loadKeyFile(key_file: com.charlag.kgtk.demo.glib.KeyFile, group_name: String): Boolean {
         return stub()
    }
    open fun setBottomMargin(margin: Double, unit: Unit): Unit {
         return stub()
    }
    open fun setLeftMargin(margin: Double, unit: Unit): Unit {
         return stub()
    }
    open fun setOrientation(orientation: PageOrientation): Unit {
         return stub()
    }
    open fun setPaperSize(size: PaperSize): Unit {
         return stub()
    }
    open fun setPaperSizeAndDefaultMargins(size: PaperSize): Unit {
         return stub()
    }
    open fun setRightMargin(margin: Double, unit: Unit): Unit {
         return stub()
    }
    open fun setTopMargin(margin: Double, unit: Unit): Unit {
         return stub()
    }
    open fun toFile(file_name: String): Boolean {
         return stub()
    }
    open fun toGvariant(): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun toKeyFile(key_file: com.charlag.kgtk.demo.glib.KeyFile, group_name: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33043040UL
        fun cptr(obj: PageSetup): CPointer<GtkPageSetup> = obj.cptr
        fun newFromFile(file_name: String): PageSetup = PageSetup(stub<CPointer<GtkPageSetup>>()) 
        fun newFromGvariant(variant: com.charlag.kgtk.demo.glib.Variant): PageSetup = PageSetup(stub<CPointer<GtkPageSetup>>()) 
        fun newFromKeyFile(key_file: com.charlag.kgtk.demo.glib.KeyFile, group_name: String): PageSetup = PageSetup(stub<CPointer<GtkPageSetup>>()) 
    }
}

typealias PageSetupDoneFunc = (page_setup:  PageSetup, data:  Any) -> Unit

typealias PanDirection = GtkPanDirection

open class Paned internal constructor (private val cptr: CPointer<GtkPaned>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(orientation: Orientation) : this(stub<CPointer<GtkPaned>>())

    open fun add1(child: Widget): Unit {
         return stub()
    }
    open fun add2(child: Widget): Unit {
         return stub()
    }
    open fun getChild1(): Widget {
         return stub()
    }
    open fun getChild2(): Widget {
         return stub()
    }
    open fun getHandleWindow(): com.charlag.kgtk.demo.gdk.Window {
         return stub()
    }
    open fun getPosition(): Int {
         return stub()
    }
    open fun getWideHandle(): Boolean {
         return stub()
    }
    open fun pack1(child: Widget, resize: Boolean, shrink: Boolean): Unit {
         return stub()
    }
    open fun pack2(child: Widget, resize: Boolean, shrink: Boolean): Unit {
         return stub()
    }
    open fun setPosition(position: Int): Unit {
         return stub()
    }
    open fun setWideHandle(wide: Boolean): Unit {
         return stub()
    }
    fun setOnAcceptPosition(cb: () -> Unit) {
        do_connect(cptr, "accept-position", cb)
    }

    fun setOnCancelPosition(cb: () -> Unit) {
        do_connect(cptr, "cancel-position", cb)
    }

    fun setOnCycleChildFocus(cb: () -> Unit) {
        do_connect(cptr, "cycle-child-focus", cb)
    }

    fun setOnCycleHandleFocus(cb: () -> Unit) {
        do_connect(cptr, "cycle-handle-focus", cb)
    }

    fun setOnMoveHandle(cb: () -> Unit) {
        do_connect(cptr, "move-handle", cb)
    }

    fun setOnToggleHandleFocus(cb: () -> Unit) {
        do_connect(cptr, "toggle-handle-focus", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33665984UL
        fun cptr(obj: Paned): CPointer<GtkPaned> = obj.cptr
    }
}

class PanedClass(private val cptr: CPointer<cnames.structs._GtkPanedClass>) /* struct */ {
    companion object {
        fun cptr(obj: PanedClass): CPointer<cnames.structs._GtkPanedClass> = obj.cptr
    }
}

class PaperSize(private val cptr: CPointer<cnames.structs._GtkPaperSize>) /* struct */ {
    fun new(`name`: String): PaperSize {
         return stub()
    }
    fun newCustom(`name`: String, display_name: String, width: Double, height: Double, unit: Unit): PaperSize {
         return stub()
    }
    fun newFromGvariant(variant: com.charlag.kgtk.demo.glib.Variant): PaperSize {
         return stub()
    }
    fun newFromIpp(ipp_name: String, width: Double, height: Double): PaperSize {
         return stub()
    }
    fun newFromKeyFile(key_file: com.charlag.kgtk.demo.glib.KeyFile, group_name: String): PaperSize {
         return stub()
    }
    fun newFromPpd(ppd_name: String, ppd_display_name: String, width: Double, height: Double): PaperSize {
         return stub()
    }
    fun copy(): PaperSize {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getDefaultBottomMargin(unit: Unit): Double {
         return stub()
    }
    fun getDefaultLeftMargin(unit: Unit): Double {
         return stub()
    }
    fun getDefaultRightMargin(unit: Unit): Double {
         return stub()
    }
    fun getDefaultTopMargin(unit: Unit): Double {
         return stub()
    }
    fun getDisplayName(): String {
         return stub()
    }
    fun getHeight(unit: Unit): Double {
         return stub()
    }
    fun getName(): String {
         return stub()
    }
    fun getPpdName(): String {
         return stub()
    }
    fun getWidth(unit: Unit): Double {
         return stub()
    }
    fun isCustom(): Boolean {
         return stub()
    }
    fun isEqual(size2: PaperSize): Boolean {
         return stub()
    }
    fun isIpp(): Boolean {
         return stub()
    }
    fun setSize(width: Double, height: Double, unit: Unit): Unit {
         return stub()
    }
    fun toGvariant(): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    fun toKeyFile(key_file: com.charlag.kgtk.demo.glib.KeyFile, group_name: String): Unit {
         return stub()
    }
    fun getDefault(): String {
         return stub()
    }
    fun getPaperSizes(include_custom: Boolean): List<PaperSize> {
         return stub()
    }
    companion object {
        fun cptr(obj: PaperSize): CPointer<cnames.structs._GtkPaperSize> = obj.cptr
    }
}

typealias PathPriorityType = GtkPathPriorityType

typealias PathType = GtkPathType

typealias PlacesOpenFlags = GtkPlacesOpenFlags

open class PlacesSidebar internal constructor (private val cptr: CPointer<GtkPlacesSidebar>) : ScrolledWindow(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkPlacesSidebar>>())

    open fun addShortcut(location: com.charlag.kgtk.demo.gio.File): Unit {
         return stub()
    }
    open fun getLocalOnly(): Boolean {
         return stub()
    }
    open fun getLocation(): com.charlag.kgtk.demo.gio.File {
         return stub()
    }
    open fun getNthBookmark(n: Int): com.charlag.kgtk.demo.gio.File {
         return stub()
    }
    open fun getOpenFlags(): PlacesOpenFlags {
         return stub()
    }
    open fun getShowDesktop(): Boolean {
         return stub()
    }
    open fun getShowEnterLocation(): Boolean {
         return stub()
    }
    open fun getShowOtherLocations(): Boolean {
         return stub()
    }
    open fun getShowRecent(): Boolean {
         return stub()
    }
    open fun getShowStarredLocation(): Boolean {
         return stub()
    }
    open fun getShowTrash(): Boolean {
         return stub()
    }
    open fun listShortcuts(): List<com.charlag.kgtk.demo.gio.File> {
         return stub()
    }
    open fun removeShortcut(location: com.charlag.kgtk.demo.gio.File): Unit {
         return stub()
    }
    open fun setDropTargetsVisible(visible: Boolean, context: com.charlag.kgtk.demo.gdk.DragContext): Unit {
         return stub()
    }
    open fun setLocalOnly(local_only: Boolean): Unit {
         return stub()
    }
    open fun setLocation(location: com.charlag.kgtk.demo.gio.File): Unit {
         return stub()
    }
    open fun setOpenFlags(flags: PlacesOpenFlags): Unit {
         return stub()
    }
    open fun setShowDesktop(show_desktop: Boolean): Unit {
         return stub()
    }
    open fun setShowEnterLocation(show_enter_location: Boolean): Unit {
         return stub()
    }
    open fun setShowOtherLocations(show_other_locations: Boolean): Unit {
         return stub()
    }
    open fun setShowRecent(show_recent: Boolean): Unit {
         return stub()
    }
    open fun setShowStarredLocation(show_starred_location: Boolean): Unit {
         return stub()
    }
    open fun setShowTrash(show_trash: Boolean): Unit {
         return stub()
    }
    fun setOnDragActionAsk(cb: () -> Unit) {
        do_connect(cptr, "drag-action-ask", cb)
    }

    fun setOnDragActionRequested(cb: () -> Unit) {
        do_connect(cptr, "drag-action-requested", cb)
    }

    fun setOnDragPerformDrop(cb: () -> Unit) {
        do_connect(cptr, "drag-perform-drop", cb)
    }

    fun setOnMount(cb: () -> Unit) {
        do_connect(cptr, "mount", cb)
    }

    fun setOnOpenLocation(cb: () -> Unit) {
        do_connect(cptr, "open-location", cb)
    }

    fun setOnPopulatePopup(cb: () -> Unit) {
        do_connect(cptr, "populate-popup", cb)
    }

    fun setOnShowConnectToServer(cb: () -> Unit) {
        do_connect(cptr, "show-connect-to-server", cb)
    }

    fun setOnShowEnterLocation(cb: () -> Unit) {
        do_connect(cptr, "show-enter-location", cb)
    }

    fun setOnShowErrorMessage(cb: () -> Unit) {
        do_connect(cptr, "show-error-message", cb)
    }

    fun setOnShowOtherLocations(cb: () -> Unit) {
        do_connect(cptr, "show-other-locations", cb)
    }

    fun setOnShowOtherLocationsWithFlags(cb: () -> Unit) {
        do_connect(cptr, "show-other-locations-with-flags", cb)
    }

    fun setOnShowStarredLocation(cb: () -> Unit) {
        do_connect(cptr, "show-starred-location", cb)
    }

    fun setOnUnmount(cb: () -> Unit) {
        do_connect(cptr, "unmount", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32607072UL
        fun cptr(obj: PlacesSidebar): CPointer<GtkPlacesSidebar> = obj.cptr
    }
}

class PlacesSidebarClass(private val cptr: CPointer<cnames.structs._GtkPlacesSidebarClass>) /* struct */ {
    companion object {
        fun cptr(obj: PlacesSidebarClass): CPointer<cnames.structs._GtkPlacesSidebarClass> = obj.cptr
    }
}

typealias PolicyType = GtkPolicyType

open class Popover internal constructor (private val cptr: CPointer<GtkPopover>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(relative_to: Widget) : this(stub<CPointer<GtkPopover>>())

    open fun bindModel(model: com.charlag.kgtk.demo.gio.MenuModel, action_namespace: String): Unit {
         return stub()
    }
    open fun getConstrainTo(): PopoverConstraint {
         return stub()
    }
    open fun getDefaultWidget(): Widget {
         return stub()
    }
    open fun getModal(): Boolean {
         return stub()
    }
    open fun getPointingTo(rect: com.charlag.kgtk.demo.gdk.Rectangle): Boolean {
         return stub()
    }
    open fun getPosition(): PositionType {
         return stub()
    }
    open fun getRelativeTo(): Widget {
         return stub()
    }
    open fun popdown(): Unit {
         return stub()
    }
    open fun popup(): Unit {
         return stub()
    }
    open fun setConstrainTo(constraint: PopoverConstraint): Unit {
         return stub()
    }
    open fun setDefaultWidget(widget: Widget): Unit {
         return stub()
    }
    open fun setModal(modal: Boolean): Unit {
         return stub()
    }
    open fun setPointingTo(rect: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun setPosition(position: PositionType): Unit {
         return stub()
    }
    open fun setRelativeTo(relative_to: Widget): Unit {
         return stub()
    }
    fun setOnClosed(cb: () -> Unit) {
        do_connect(cptr, "closed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33335920UL
        fun cptr(obj: Popover): CPointer<GtkPopover> = obj.cptr
        fun newFromModel(relative_to: Widget, model: com.charlag.kgtk.demo.gio.MenuModel): Popover = Popover(stub<CPointer<GtkPopover>>()) 
    }
}

class PopoverClass(private val cptr: CPointer<cnames.structs._GtkPopoverClass>) /* struct */ {
    companion object {
        fun cptr(obj: PopoverClass): CPointer<cnames.structs._GtkPopoverClass> = obj.cptr
    }
}

typealias PopoverConstraint = GtkPopoverConstraint

open class PopoverMenu internal constructor (private val cptr: CPointer<GtkPopoverMenu>) : Popover(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkPopoverMenu>>())

    open fun openSubmenu(`name`: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31742064UL
        fun cptr(obj: PopoverMenu): CPointer<GtkPopoverMenu> = obj.cptr
    }
}

class PopoverMenuClass(private val cptr: CPointer<cnames.structs._GtkPopoverMenuClass>) /* struct */ {
    companion object {
        fun cptr(obj: PopoverMenuClass): CPointer<cnames.structs._GtkPopoverMenuClass> = obj.cptr
    }
}

typealias PositionType = GtkPositionType

open class PrintContext internal constructor (private val cptr: CPointer<GtkPrintContext>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun createPangoContext(): com.charlag.kgtk.demo.pango.Context {
         return stub()
    }
    open fun createPangoLayout(): com.charlag.kgtk.demo.pango.Layout {
         return stub()
    }
    open fun getCairoContext(): com.charlag.kgtk.demo.cairo.Context {
         return stub()
    }
    open fun getDpiX(): Double {
         return stub()
    }
    open fun getDpiY(): Double {
         return stub()
    }
    open fun getHardMargins(top: Double, bottom: Double, left: Double, right: Double): Boolean {
         return stub()
    }
    open fun getHeight(): Double {
         return stub()
    }
    open fun getPageSetup(): PageSetup {
         return stub()
    }
    open fun getPangoFontmap(): com.charlag.kgtk.demo.pango.FontMap {
         return stub()
    }
    open fun getWidth(): Double {
         return stub()
    }
    open fun setCairoContext(cr: com.charlag.kgtk.demo.cairo.Context, dpi_x: Double, dpi_y: Double): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 34300256UL
        fun cptr(obj: PrintContext): CPointer<GtkPrintContext> = obj.cptr
    }
}

typealias PrintDuplex = GtkPrintDuplex

typealias PrintError = GtkPrintError

open class PrintOperation internal constructor (private val cptr: CPointer<GtkPrintOperation>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), PrintOperationPreview, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkPrintOperation>>())

    open fun cancel(): Unit {
         return stub()
    }
    open fun drawPageFinish(): Unit {
         return stub()
    }
    open fun getDefaultPageSetup(): PageSetup {
         return stub()
    }
    open fun getEmbedPageSetup(): Boolean {
         return stub()
    }
    open fun getError(): Unit {
         return stub()
    }
    open fun getHasSelection(): Boolean {
         return stub()
    }
    open fun getNPagesToPrint(): Int {
         return stub()
    }
    open fun getPrintSettings(): PrintSettings {
         return stub()
    }
    open fun getStatus(): PrintStatus {
         return stub()
    }
    open fun getStatusString(): String {
         return stub()
    }
    open fun getSupportSelection(): Boolean {
         return stub()
    }
    open fun isFinished(): Boolean {
         return stub()
    }
    open fun run(action: PrintOperationAction, parent: Window): PrintOperationResult {
         return stub()
    }
    open fun setAllowAsync(allow_async: Boolean): Unit {
         return stub()
    }
    open fun setCurrentPage(current_page: Int): Unit {
         return stub()
    }
    open fun setCustomTabLabel(label: String): Unit {
         return stub()
    }
    open fun setDefaultPageSetup(default_page_setup: PageSetup): Unit {
         return stub()
    }
    open fun setDeferDrawing(): Unit {
         return stub()
    }
    open fun setEmbedPageSetup(embed: Boolean): Unit {
         return stub()
    }
    open fun setExportFilename(filename: String): Unit {
         return stub()
    }
    open fun setHasSelection(has_selection: Boolean): Unit {
         return stub()
    }
    open fun setJobName(job_name: String): Unit {
         return stub()
    }
    open fun setNPages(n_pages: Int): Unit {
         return stub()
    }
    open fun setPrintSettings(print_settings: PrintSettings): Unit {
         return stub()
    }
    open fun setShowProgress(show_progress: Boolean): Unit {
         return stub()
    }
    open fun setSupportSelection(support_selection: Boolean): Unit {
         return stub()
    }
    open fun setTrackPrintStatus(track_status: Boolean): Unit {
         return stub()
    }
    open fun setUnit(unit: Unit): Unit {
         return stub()
    }
    open fun setUseFullPage(full_page: Boolean): Unit {
         return stub()
    }
    fun setOnBeginPrint(cb: () -> Unit) {
        do_connect(cptr, "begin-print", cb)
    }

    fun setOnCreateCustomWidget(cb: () -> Unit) {
        do_connect(cptr, "create-custom-widget", cb)
    }

    fun setOnCustomWidgetApply(cb: () -> Unit) {
        do_connect(cptr, "custom-widget-apply", cb)
    }

    fun setOnDone(cb: () -> Unit) {
        do_connect(cptr, "done", cb)
    }

    fun setOnDrawPage(cb: () -> Unit) {
        do_connect(cptr, "draw-page", cb)
    }

    fun setOnEndPrint(cb: () -> Unit) {
        do_connect(cptr, "end-print", cb)
    }

    fun setOnPaginate(cb: () -> Unit) {
        do_connect(cptr, "paginate", cb)
    }

    fun setOnPreview(cb: () -> Unit) {
        do_connect(cptr, "preview", cb)
    }

    fun setOnRequestPageSetup(cb: () -> Unit) {
        do_connect(cptr, "request-page-setup", cb)
    }

    fun setOnStatusChanged(cb: () -> Unit) {
        do_connect(cptr, "status-changed", cb)
    }

    fun setOnUpdateCustomWidget(cb: () -> Unit) {
        do_connect(cptr, "update-custom-widget", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33652096UL
        fun cptr(obj: PrintOperation): CPointer<GtkPrintOperation> = obj.cptr
    }
}

typealias PrintOperationAction = GtkPrintOperationAction

class PrintOperationClass(private val cptr: CPointer<cnames.structs._GtkPrintOperationClass>) /* struct */ {
    companion object {
        fun cptr(obj: PrintOperationClass): CPointer<cnames.structs._GtkPrintOperationClass> = obj.cptr
    }
}

interface PrintOperationPreview : InteropWrapper {
    fun endPreview(): Unit = stub("PrintOperationPreview default impl")

    fun isSelected(page_nr: Int): Boolean = stub("PrintOperationPreview default impl")

    fun renderPage(page_nr: Int): Unit = stub("PrintOperationPreview default impl")

    companion object {
        fun cptr(obj: PrintOperationPreview): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkPrintOperationPreview>) : PrintOperationPreview {
        override val rawPtr: COpaquePointer = cptr
    }
}

class PrintOperationPreviewIface(private val cptr: CPointer<cnames.structs._GtkPrintOperationPreviewIface>) /* struct */ {
    companion object {
        fun cptr(obj: PrintOperationPreviewIface): CPointer<cnames.structs._GtkPrintOperationPreviewIface> = obj.cptr
    }
}

typealias PrintOperationResult = GtkPrintOperationResult

typealias PrintPages = GtkPrintPages

typealias PrintQuality = GtkPrintQuality

open class PrintSettings internal constructor (private val cptr: CPointer<GtkPrintSettings>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkPrintSettings>>())

    open fun copy(): PrintSettings {
         return stub()
    }
    open fun foreach(func: PrintSettingsFunc, user_data: Any): Unit {
         return stub()
    }
    open fun get(key: String): String {
         return stub()
    }
    open fun getBool(key: String): Boolean {
         return stub()
    }
    open fun getCollate(): Boolean {
         return stub()
    }
    open fun getDefaultSource(): String {
         return stub()
    }
    open fun getDither(): String {
         return stub()
    }
    open fun getDouble(key: String): Double {
         return stub()
    }
    open fun getDoubleWithDefault(key: String, def: Double): Double {
         return stub()
    }
    open fun getDuplex(): PrintDuplex {
         return stub()
    }
    open fun getFinishings(): String {
         return stub()
    }
    open fun getInt(key: String): Int {
         return stub()
    }
    open fun getIntWithDefault(key: String, def: Int): Int {
         return stub()
    }
    open fun getLength(key: String, unit: Unit): Double {
         return stub()
    }
    open fun getMediaType(): String {
         return stub()
    }
    open fun getNCopies(): Int {
         return stub()
    }
    open fun getNumberUp(): Int {
         return stub()
    }
    open fun getNumberUpLayout(): NumberUpLayout {
         return stub()
    }
    open fun getOrientation(): PageOrientation {
         return stub()
    }
    open fun getOutputBin(): String {
         return stub()
    }
    open fun getPageRanges(num_ranges: Int): List<PageRange> {
         return stub()
    }
    open fun getPageSet(): PageSet {
         return stub()
    }
    open fun getPaperHeight(unit: Unit): Double {
         return stub()
    }
    open fun getPaperSize(): PaperSize {
         return stub()
    }
    open fun getPaperWidth(unit: Unit): Double {
         return stub()
    }
    open fun getPrintPages(): PrintPages {
         return stub()
    }
    open fun getPrinter(): String {
         return stub()
    }
    open fun getPrinterLpi(): Double {
         return stub()
    }
    open fun getQuality(): PrintQuality {
         return stub()
    }
    open fun getResolution(): Int {
         return stub()
    }
    open fun getResolutionX(): Int {
         return stub()
    }
    open fun getResolutionY(): Int {
         return stub()
    }
    open fun getReverse(): Boolean {
         return stub()
    }
    open fun getScale(): Double {
         return stub()
    }
    open fun getUseColor(): Boolean {
         return stub()
    }
    open fun hasKey(key: String): Boolean {
         return stub()
    }
    open fun loadFile(file_name: String): Boolean {
         return stub()
    }
    open fun loadKeyFile(key_file: com.charlag.kgtk.demo.glib.KeyFile, group_name: String): Boolean {
         return stub()
    }
    open fun set(key: String, value: String): Unit {
         return stub()
    }
    open fun setBool(key: String, value: Boolean): Unit {
         return stub()
    }
    open fun setCollate(collate: Boolean): Unit {
         return stub()
    }
    open fun setDefaultSource(default_source: String): Unit {
         return stub()
    }
    open fun setDither(dither: String): Unit {
         return stub()
    }
    open fun setDouble(key: String, value: Double): Unit {
         return stub()
    }
    open fun setDuplex(duplex: PrintDuplex): Unit {
         return stub()
    }
    open fun setFinishings(finishings: String): Unit {
         return stub()
    }
    open fun setInt(key: String, value: Int): Unit {
         return stub()
    }
    open fun setLength(key: String, value: Double, unit: Unit): Unit {
         return stub()
    }
    open fun setMediaType(media_type: String): Unit {
         return stub()
    }
    open fun setNCopies(num_copies: Int): Unit {
         return stub()
    }
    open fun setNumberUp(number_up: Int): Unit {
         return stub()
    }
    open fun setNumberUpLayout(number_up_layout: NumberUpLayout): Unit {
         return stub()
    }
    open fun setOrientation(orientation: PageOrientation): Unit {
         return stub()
    }
    open fun setOutputBin(output_bin: String): Unit {
         return stub()
    }
    open fun setPageRanges(page_ranges: List<PageRange>, num_ranges: Int): Unit {
         return stub()
    }
    open fun setPageSet(page_set: PageSet): Unit {
         return stub()
    }
    open fun setPaperHeight(height: Double, unit: Unit): Unit {
         return stub()
    }
    open fun setPaperSize(paper_size: PaperSize): Unit {
         return stub()
    }
    open fun setPaperWidth(width: Double, unit: Unit): Unit {
         return stub()
    }
    open fun setPrintPages(pages: PrintPages): Unit {
         return stub()
    }
    open fun setPrinter(printer: String): Unit {
         return stub()
    }
    open fun setPrinterLpi(lpi: Double): Unit {
         return stub()
    }
    open fun setQuality(quality: PrintQuality): Unit {
         return stub()
    }
    open fun setResolution(resolution: Int): Unit {
         return stub()
    }
    open fun setResolutionXy(resolution_x: Int, resolution_y: Int): Unit {
         return stub()
    }
    open fun setReverse(reverse: Boolean): Unit {
         return stub()
    }
    open fun setScale(scale: Double): Unit {
         return stub()
    }
    open fun setUseColor(use_color: Boolean): Unit {
         return stub()
    }
    open fun toFile(file_name: String): Boolean {
         return stub()
    }
    open fun toGvariant(): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    open fun toKeyFile(key_file: com.charlag.kgtk.demo.glib.KeyFile, group_name: String): Unit {
         return stub()
    }
    open fun unset(key: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31394016UL
        fun cptr(obj: PrintSettings): CPointer<GtkPrintSettings> = obj.cptr
        fun newFromFile(file_name: String): PrintSettings = PrintSettings(stub<CPointer<GtkPrintSettings>>()) 
        fun newFromGvariant(variant: com.charlag.kgtk.demo.glib.Variant): PrintSettings = PrintSettings(stub<CPointer<GtkPrintSettings>>()) 
        fun newFromKeyFile(key_file: com.charlag.kgtk.demo.glib.KeyFile, group_name: String): PrintSettings = PrintSettings(stub<CPointer<GtkPrintSettings>>()) 
    }
}

typealias PrintSettingsFunc = (key:  String, value:  String, user_data:  Any) -> Unit

typealias PrintStatus = GtkPrintStatus

open class ProgressBar internal constructor (private val cptr: CPointer<GtkProgressBar>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkProgressBar>>())

    open fun getEllipsize(): com.charlag.kgtk.demo.pango.EllipsizeMode {
         return stub()
    }
    open fun getFraction(): Double {
         return stub()
    }
    open fun getInverted(): Boolean {
         return stub()
    }
    open fun getPulseStep(): Double {
         return stub()
    }
    open fun getShowText(): Boolean {
         return stub()
    }
    open fun getText(): String {
         return stub()
    }
    open fun pulse(): Unit {
         return stub()
    }
    open fun setEllipsize(mode: com.charlag.kgtk.demo.pango.EllipsizeMode): Unit {
         return stub()
    }
    open fun setFraction(fraction: Double): Unit {
         return stub()
    }
    open fun setInverted(inverted: Boolean): Unit {
         return stub()
    }
    open fun setPulseStep(fraction: Double): Unit {
         return stub()
    }
    open fun setShowText(show_text: Boolean): Unit {
         return stub()
    }
    open fun setText(text: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30721552UL
        fun cptr(obj: ProgressBar): CPointer<GtkProgressBar> = obj.cptr
    }
}

class ProgressBarClass(private val cptr: CPointer<cnames.structs._GtkProgressBarClass>) /* struct */ {
    companion object {
        fun cptr(obj: ProgressBarClass): CPointer<cnames.structs._GtkProgressBarClass> = obj.cptr
    }
}

typealias PropagationPhase = GtkPropagationPhase

class RadioActionEntry(private val cptr: CPointer<cnames.structs._GtkRadioActionEntry>) /* struct */ {
    companion object {
        fun cptr(obj: RadioActionEntry): CPointer<cnames.structs._GtkRadioActionEntry> = obj.cptr
    }
}

open class RadioButton internal constructor (private val cptr: CPointer<GtkRadioButton>) : CheckButton(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(group: List<RadioButton>) : this(stub<CPointer<GtkRadioButton>>())

    open fun getGroup(): List<RadioButton> {
         return stub()
    }
    open fun joinGroup(group_source: RadioButton): Unit {
         return stub()
    }
    open fun setGroup(group: List<RadioButton>): Unit {
         return stub()
    }
    fun setOnGroupChanged(cb: () -> Unit) {
        do_connect(cptr, "group-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31607936UL
        fun cptr(obj: RadioButton): CPointer<GtkRadioButton> = obj.cptr
        fun newFromWidget(radio_group_member: RadioButton): RadioButton = RadioButton(stub<CPointer<GtkRadioButton>>()) 
        fun newWithLabel(group: List<RadioButton>, label: String): RadioButton = RadioButton(stub<CPointer<GtkRadioButton>>()) 
        fun newWithLabelFromWidget(radio_group_member: RadioButton, label: String): RadioButton = RadioButton(stub<CPointer<GtkRadioButton>>()) 
        fun newWithMnemonic(group: List<RadioButton>, label: String): RadioButton = RadioButton(stub<CPointer<GtkRadioButton>>()) 
        fun newWithMnemonicFromWidget(radio_group_member: RadioButton, label: String): RadioButton = RadioButton(stub<CPointer<GtkRadioButton>>()) 
    }
}

class RadioButtonClass(private val cptr: CPointer<cnames.structs._GtkRadioButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: RadioButtonClass): CPointer<cnames.structs._GtkRadioButtonClass> = obj.cptr
    }
}

open class RadioMenuItem internal constructor (private val cptr: CPointer<GtkRadioMenuItem>) : CheckMenuItem(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(group: List<RadioMenuItem>) : this(stub<CPointer<GtkRadioMenuItem>>())

    open fun getGroup(): List<RadioMenuItem> {
         return stub()
    }
    open fun joinGroup(group_source: RadioMenuItem): Unit {
         return stub()
    }
    open fun setGroup(group: List<RadioMenuItem>): Unit {
         return stub()
    }
    fun setOnGroupChanged(cb: () -> Unit) {
        do_connect(cptr, "group-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33141712UL
        fun cptr(obj: RadioMenuItem): CPointer<GtkRadioMenuItem> = obj.cptr
        fun newFromWidget(group: RadioMenuItem): RadioMenuItem = RadioMenuItem(stub<CPointer<GtkRadioMenuItem>>()) 
        fun newWithLabel(group: List<RadioMenuItem>, label: String): RadioMenuItem = RadioMenuItem(stub<CPointer<GtkRadioMenuItem>>()) 
        fun newWithLabelFromWidget(group: RadioMenuItem, label: String): RadioMenuItem = RadioMenuItem(stub<CPointer<GtkRadioMenuItem>>()) 
        fun newWithMnemonic(group: List<RadioMenuItem>, label: String): RadioMenuItem = RadioMenuItem(stub<CPointer<GtkRadioMenuItem>>()) 
        fun newWithMnemonicFromWidget(group: RadioMenuItem, label: String): RadioMenuItem = RadioMenuItem(stub<CPointer<GtkRadioMenuItem>>()) 
    }
}

class RadioMenuItemClass(private val cptr: CPointer<cnames.structs._GtkRadioMenuItemClass>) /* struct */ {
    companion object {
        fun cptr(obj: RadioMenuItemClass): CPointer<cnames.structs._GtkRadioMenuItemClass> = obj.cptr
    }
}

open class RadioToolButton internal constructor (private val cptr: CPointer<GtkRadioToolButton>) : ToggleToolButton(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(group: List<RadioButton>) : this(stub<CPointer<GtkRadioToolButton>>())

    open fun getGroup(): List<RadioButton> {
         return stub()
    }
    open fun setGroup(group: List<RadioButton>): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31095728UL
        fun cptr(obj: RadioToolButton): CPointer<GtkRadioToolButton> = obj.cptr
        fun newFromWidget(group: RadioToolButton): RadioToolButton = RadioToolButton(stub<CPointer<GtkRadioToolButton>>()) 
    }
}

class RadioToolButtonClass(private val cptr: CPointer<cnames.structs._GtkRadioToolButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: RadioToolButtonClass): CPointer<cnames.structs._GtkRadioToolButtonClass> = obj.cptr
    }
}

open class Range internal constructor (private val cptr: CPointer<GtkRange>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getAdjustment(): Adjustment {
         return stub()
    }
    open fun getFillLevel(): Double {
         return stub()
    }
    open fun getFlippable(): Boolean {
         return stub()
    }
    open fun getInverted(): Boolean {
         return stub()
    }
    open fun getLowerStepperSensitivity(): SensitivityType {
         return stub()
    }
    open fun getRangeRect(range_rect: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun getRestrictToFillLevel(): Boolean {
         return stub()
    }
    open fun getRoundDigits(): Int {
         return stub()
    }
    open fun getShowFillLevel(): Boolean {
         return stub()
    }
    open fun getSliderRange(slider_start: Int, slider_end: Int): Unit {
         return stub()
    }
    open fun getSliderSizeFixed(): Boolean {
         return stub()
    }
    open fun getUpperStepperSensitivity(): SensitivityType {
         return stub()
    }
    open fun getValue(): Double {
         return stub()
    }
    open fun setAdjustment(adjustment: Adjustment): Unit {
         return stub()
    }
    open fun setFillLevel(fill_level: Double): Unit {
         return stub()
    }
    open fun setFlippable(flippable: Boolean): Unit {
         return stub()
    }
    open fun setIncrements(step: Double, page: Double): Unit {
         return stub()
    }
    open fun setInverted(setting: Boolean): Unit {
         return stub()
    }
    open fun setLowerStepperSensitivity(sensitivity: SensitivityType): Unit {
         return stub()
    }
    open fun setRange(min: Double, max: Double): Unit {
         return stub()
    }
    open fun setRestrictToFillLevel(restrict_to_fill_level: Boolean): Unit {
         return stub()
    }
    open fun setRoundDigits(round_digits: Int): Unit {
         return stub()
    }
    open fun setShowFillLevel(show_fill_level: Boolean): Unit {
         return stub()
    }
    open fun setSliderSizeFixed(size_fixed: Boolean): Unit {
         return stub()
    }
    open fun setUpperStepperSensitivity(sensitivity: SensitivityType): Unit {
         return stub()
    }
    open fun setValue(value: Double): Unit {
         return stub()
    }
    fun setOnAdjustBounds(cb: () -> Unit) {
        do_connect(cptr, "adjust-bounds", cb)
    }

    fun setOnChangeValue(cb: () -> Unit) {
        do_connect(cptr, "change-value", cb)
    }

    fun setOnMoveSlider(cb: () -> Unit) {
        do_connect(cptr, "move-slider", cb)
    }

    fun setOnValueChanged(cb: () -> Unit) {
        do_connect(cptr, "value-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32522288UL
        fun cptr(obj: Range): CPointer<GtkRange> = obj.cptr
    }
}

class RangeClass(private val cptr: CPointer<cnames.structs._GtkRangeClass>) /* struct */ {
    companion object {
        fun cptr(obj: RangeClass): CPointer<cnames.structs._GtkRangeClass> = obj.cptr
    }
}

class RcContext(private val cptr: CPointer<cnames.structs._GtkRcContext>) /* struct */ {
    companion object {
        fun cptr(obj: RcContext): CPointer<cnames.structs._GtkRcContext> = obj.cptr
    }
}

typealias RcFlags = GtkRcFlags

class RcProperty(private val cptr: CPointer<cnames.structs._GtkRcProperty>) /* struct */ {
    fun parseBorder(pspec: com.charlag.kgtk.demo.gobject.ParamSpec, gstring: com.charlag.kgtk.demo.glib.String, property_value: com.charlag.kgtk.demo.gobject.Value): Boolean {
         return stub()
    }
    fun parseColor(pspec: com.charlag.kgtk.demo.gobject.ParamSpec, gstring: com.charlag.kgtk.demo.glib.String, property_value: com.charlag.kgtk.demo.gobject.Value): Boolean {
         return stub()
    }
    fun parseEnum(pspec: com.charlag.kgtk.demo.gobject.ParamSpec, gstring: com.charlag.kgtk.demo.glib.String, property_value: com.charlag.kgtk.demo.gobject.Value): Boolean {
         return stub()
    }
    fun parseFlags(pspec: com.charlag.kgtk.demo.gobject.ParamSpec, gstring: com.charlag.kgtk.demo.glib.String, property_value: com.charlag.kgtk.demo.gobject.Value): Boolean {
         return stub()
    }
    fun parseRequisition(pspec: com.charlag.kgtk.demo.gobject.ParamSpec, gstring: com.charlag.kgtk.demo.glib.String, property_value: com.charlag.kgtk.demo.gobject.Value): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: RcProperty): CPointer<cnames.structs._GtkRcProperty> = obj.cptr
    }
}

typealias RcPropertyParser = (pspec:  com.charlag.kgtk.demo.gobject.ParamSpec, rc_string:  com.charlag.kgtk.demo.glib.String, property_value:  com.charlag.kgtk.demo.gobject.Value) -> Boolean

open class RcStyle internal constructor (private val cptr: CPointer<GtkRcStyle>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 31578928UL
        fun cptr(obj: RcStyle): CPointer<GtkRcStyle> = obj.cptr
    }
}

class RcStyleClass(private val cptr: CPointer<cnames.structs._GtkRcStyleClass>) /* struct */ {
    companion object {
        fun cptr(obj: RcStyleClass): CPointer<cnames.structs._GtkRcStyleClass> = obj.cptr
    }
}

typealias RcTokenType = GtkRcTokenType

interface RecentChooser : InteropWrapper {
    fun addFilter(filter: RecentFilter): Unit = stub("RecentChooser default impl")

    fun getCurrentItem(): RecentInfo = stub("RecentChooser default impl")

    fun getCurrentUri(): String = stub("RecentChooser default impl")

    fun getFilter(): RecentFilter = stub("RecentChooser default impl")

    fun getItems(): List<RecentInfo> = stub("RecentChooser default impl")

    fun getLimit(): Int = stub("RecentChooser default impl")

    fun getLocalOnly(): Boolean = stub("RecentChooser default impl")

    fun getSelectMultiple(): Boolean = stub("RecentChooser default impl")

    fun getShowIcons(): Boolean = stub("RecentChooser default impl")

    fun getShowNotFound(): Boolean = stub("RecentChooser default impl")

    fun getShowPrivate(): Boolean = stub("RecentChooser default impl")

    fun getShowTips(): Boolean = stub("RecentChooser default impl")

    fun getSortType(): RecentSortType = stub("RecentChooser default impl")

    fun getUris(length: ULong): List<String> = stub("RecentChooser default impl")

    fun listFilters(): List<RecentFilter> = stub("RecentChooser default impl")

    fun removeFilter(filter: RecentFilter): Unit = stub("RecentChooser default impl")

    fun selectAll(): Unit = stub("RecentChooser default impl")

    fun selectUri(uri: String): Boolean = stub("RecentChooser default impl")

    fun setCurrentUri(uri: String): Boolean = stub("RecentChooser default impl")

    fun setFilter(filter: RecentFilter): Unit = stub("RecentChooser default impl")

    fun setLimit(limit: Int): Unit = stub("RecentChooser default impl")

    fun setLocalOnly(local_only: Boolean): Unit = stub("RecentChooser default impl")

    fun setSelectMultiple(select_multiple: Boolean): Unit = stub("RecentChooser default impl")

    fun setShowIcons(show_icons: Boolean): Unit = stub("RecentChooser default impl")

    fun setShowNotFound(show_not_found: Boolean): Unit = stub("RecentChooser default impl")

    fun setShowPrivate(show_private: Boolean): Unit = stub("RecentChooser default impl")

    fun setShowTips(show_tips: Boolean): Unit = stub("RecentChooser default impl")

    fun setSortFunc(sort_func: RecentSortFunc, sort_data: Any, data_destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit = stub("RecentChooser default impl")

    fun setSortType(sort_type: RecentSortType): Unit = stub("RecentChooser default impl")

    fun unselectAll(): Unit = stub("RecentChooser default impl")

    fun unselectUri(uri: String): Unit = stub("RecentChooser default impl")

    companion object {
        fun cptr(obj: RecentChooser): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkRecentChooser>) : RecentChooser {
        override val rawPtr: COpaquePointer = cptr
    }
}

open class RecentChooserDialog internal constructor (private val cptr: CPointer<GtkRecentChooserDialog>) : Dialog(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, RecentChooser, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 34017104UL
        fun cptr(obj: RecentChooserDialog): CPointer<GtkRecentChooserDialog> = obj.cptr
    }
}

class RecentChooserDialogClass(private val cptr: CPointer<cnames.structs._GtkRecentChooserDialogClass>) /* struct */ {
    companion object {
        fun cptr(obj: RecentChooserDialogClass): CPointer<cnames.structs._GtkRecentChooserDialogClass> = obj.cptr
    }
}

typealias RecentChooserError = GtkRecentChooserError

class RecentChooserIface(private val cptr: CPointer<cnames.structs._GtkRecentChooserIface>) /* struct */ {
    companion object {
        fun cptr(obj: RecentChooserIface): CPointer<cnames.structs._GtkRecentChooserIface> = obj.cptr
    }
}

open class RecentChooserMenu internal constructor (private val cptr: CPointer<GtkRecentChooserMenu>) : Menu(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Activatable, Buildable, RecentChooser, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkRecentChooserMenu>>())

    open fun getShowNumbers(): Boolean {
         return stub()
    }
    open fun setShowNumbers(show_numbers: Boolean): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32360528UL
        fun cptr(obj: RecentChooserMenu): CPointer<GtkRecentChooserMenu> = obj.cptr
        fun newForManager(manager: RecentManager): RecentChooserMenu = RecentChooserMenu(stub<CPointer<GtkRecentChooserMenu>>()) 
    }
}

class RecentChooserMenuClass(private val cptr: CPointer<cnames.structs._GtkRecentChooserMenuClass>) /* struct */ {
    companion object {
        fun cptr(obj: RecentChooserMenuClass): CPointer<cnames.structs._GtkRecentChooserMenuClass> = obj.cptr
    }
}

open class RecentChooserWidget internal constructor (private val cptr: CPointer<GtkRecentChooserWidget>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, RecentChooser, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkRecentChooserWidget>>())

    companion object {
        const val G_TYPE: gtk3.GType = 34655424UL
        fun cptr(obj: RecentChooserWidget): CPointer<GtkRecentChooserWidget> = obj.cptr
        fun newForManager(manager: RecentManager): RecentChooserWidget = RecentChooserWidget(stub<CPointer<GtkRecentChooserWidget>>()) 
    }
}

class RecentChooserWidgetClass(private val cptr: CPointer<cnames.structs._GtkRecentChooserWidgetClass>) /* struct */ {
    companion object {
        fun cptr(obj: RecentChooserWidgetClass): CPointer<cnames.structs._GtkRecentChooserWidgetClass> = obj.cptr
    }
}

class RecentData(private val cptr: CPointer<cnames.structs._GtkRecentData>) /* struct */ {
    companion object {
        fun cptr(obj: RecentData): CPointer<cnames.structs._GtkRecentData> = obj.cptr
    }
}

open class RecentFilter internal constructor (private val cptr: CPointer<GtkRecentFilter>) : com.charlag.kgtk.demo.gobject.InitiallyUnowned(cptr.reinterpret()), Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkRecentFilter>>())

    open fun addAge(days: Int): Unit {
         return stub()
    }
    open fun addApplication(application: String): Unit {
         return stub()
    }
    open fun addCustom(needed: RecentFilterFlags, func: RecentFilterFunc, data: Any, data_destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun addGroup(group: String): Unit {
         return stub()
    }
    open fun addMimeType(mime_type: String): Unit {
         return stub()
    }
    open fun addPattern(pattern: String): Unit {
         return stub()
    }
    open fun addPixbufFormats(): Unit {
         return stub()
    }
    open fun filter(filter_info: RecentFilterInfo): Boolean {
         return stub()
    }
    override fun getName(): String {
         return stub()
    }
    open fun getNeeded(): RecentFilterFlags {
         return stub()
    }
    override fun setName(`name`: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33667536UL
        fun cptr(obj: RecentFilter): CPointer<GtkRecentFilter> = obj.cptr
    }
}

typealias RecentFilterFlags = GtkRecentFilterFlags

typealias RecentFilterFunc = (filter_info:  RecentFilterInfo, user_data:  Any) -> Boolean

class RecentFilterInfo(private val cptr: CPointer<cnames.structs._GtkRecentFilterInfo>) /* struct */ {
    companion object {
        fun cptr(obj: RecentFilterInfo): CPointer<cnames.structs._GtkRecentFilterInfo> = obj.cptr
    }
}

class RecentInfo(private val cptr: CPointer<cnames.structs._GtkRecentInfo>) /* struct */ {
    fun createAppInfo(app_name: String): com.charlag.kgtk.demo.gio.AppInfo {
         return stub()
    }
    fun exists(): Boolean {
         return stub()
    }
    fun getAdded(): Long {
         return stub()
    }
    fun getAge(): Int {
         return stub()
    }
    fun getApplicationInfo(app_name: String, app_exec: String, count: UInt, time_: Long): Boolean {
         return stub()
    }
    fun getApplications(length: ULong): List<String> {
         return stub()
    }
    fun getDescription(): String {
         return stub()
    }
    fun getDisplayName(): String {
         return stub()
    }
    fun getGicon(): com.charlag.kgtk.demo.gio.Icon {
         return stub()
    }
    fun getGroups(length: ULong): List<String> {
         return stub()
    }
    fun getIcon(size: Int): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    fun getMimeType(): String {
         return stub()
    }
    fun getModified(): Long {
         return stub()
    }
    fun getPrivateHint(): Boolean {
         return stub()
    }
    fun getShortName(): String {
         return stub()
    }
    fun getUri(): String {
         return stub()
    }
    fun getUriDisplay(): String {
         return stub()
    }
    fun getVisited(): Long {
         return stub()
    }
    fun hasApplication(app_name: String): Boolean {
         return stub()
    }
    fun hasGroup(group_name: String): Boolean {
         return stub()
    }
    fun isLocal(): Boolean {
         return stub()
    }
    fun lastApplication(): String {
         return stub()
    }
    fun match(info_b: RecentInfo): Boolean {
         return stub()
    }
    fun ref(): RecentInfo {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: RecentInfo): CPointer<cnames.structs._GtkRecentInfo> = obj.cptr
    }
}

open class RecentManager internal constructor (private val cptr: CPointer<GtkRecentManager>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkRecentManager>>())

    open fun addFull(uri: String, recent_data: RecentData): Boolean {
         return stub()
    }
    open fun addItem(uri: String): Boolean {
         return stub()
    }
    open fun getItems(): List<RecentInfo> {
         return stub()
    }
    open fun hasItem(uri: String): Boolean {
         return stub()
    }
    open fun lookupItem(uri: String): RecentInfo {
         return stub()
    }
    open fun moveItem(uri: String, new_uri: String): Boolean {
         return stub()
    }
    open fun purgeItems(): Int {
         return stub()
    }
    open fun removeItem(uri: String): Boolean {
         return stub()
    }
    fun setOnChanged(cb: () -> Unit) {
        do_connect(cptr, "changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33375632UL
        fun cptr(obj: RecentManager): CPointer<GtkRecentManager> = obj.cptr
        fun getDefault(): RecentManager {
    return stub()
}
    }
}

class RecentManagerClass(private val cptr: CPointer<cnames.structs._GtkRecentManagerClass>) /* struct */ {
    companion object {
        fun cptr(obj: RecentManagerClass): CPointer<cnames.structs._GtkRecentManagerClass> = obj.cptr
    }
}

typealias RecentManagerError = GtkRecentManagerError

typealias RecentSortFunc = (a:  RecentInfo, b:  RecentInfo, user_data:  Any) -> Int

typealias RecentSortType = GtkRecentSortType

typealias RegionFlags = GtkRegionFlags

typealias ReliefStyle = GtkReliefStyle

class RequestedSize(private val cptr: CPointer<cnames.structs._GtkRequestedSize>) /* struct */ {
    companion object {
        fun cptr(obj: RequestedSize): CPointer<cnames.structs._GtkRequestedSize> = obj.cptr
    }
}

class Requisition(private val cptr: CPointer<cnames.structs._GtkRequisition>) /* struct */ {
    fun new(): Requisition {
         return stub()
    }
    fun copy(): Requisition {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Requisition): CPointer<cnames.structs._GtkRequisition> = obj.cptr
    }
}

typealias ResizeMode = GtkResizeMode

typealias ResponseType = GtkResponseType

open class Revealer internal constructor (private val cptr: CPointer<GtkRevealer>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkRevealer>>())

    open fun getChildRevealed(): Boolean {
         return stub()
    }
    open fun getRevealChild(): Boolean {
         return stub()
    }
    open fun getTransitionDuration(): UInt {
         return stub()
    }
    open fun getTransitionType(): RevealerTransitionType {
         return stub()
    }
    open fun setRevealChild(reveal_child: Boolean): Unit {
         return stub()
    }
    open fun setTransitionDuration(duration: UInt): Unit {
         return stub()
    }
    open fun setTransitionType(transition: RevealerTransitionType): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31426720UL
        fun cptr(obj: Revealer): CPointer<GtkRevealer> = obj.cptr
    }
}

class RevealerClass(private val cptr: CPointer<cnames.structs._GtkRevealerClass>) /* struct */ {
    companion object {
        fun cptr(obj: RevealerClass): CPointer<cnames.structs._GtkRevealerClass> = obj.cptr
    }
}

typealias RevealerTransitionType = GtkRevealerTransitionType

val STOCK_ABOUT: String get() = TODO()

val STOCK_ADD: String get() = TODO()

val STOCK_APPLY: String get() = TODO()

val STOCK_BOLD: String get() = TODO()

val STOCK_CANCEL: String get() = TODO()

val STOCK_CAPS_LOCK_WARNING: String get() = TODO()

val STOCK_CDROM: String get() = TODO()

val STOCK_CLEAR: String get() = TODO()

val STOCK_CLOSE: String get() = TODO()

val STOCK_COLOR_PICKER: String get() = TODO()

val STOCK_CONNECT: String get() = TODO()

val STOCK_CONVERT: String get() = TODO()

val STOCK_COPY: String get() = TODO()

val STOCK_CUT: String get() = TODO()

val STOCK_DELETE: String get() = TODO()

val STOCK_DIALOG_AUTHENTICATION: String get() = TODO()

val STOCK_DIALOG_ERROR: String get() = TODO()

val STOCK_DIALOG_INFO: String get() = TODO()

val STOCK_DIALOG_QUESTION: String get() = TODO()

val STOCK_DIALOG_WARNING: String get() = TODO()

val STOCK_DIRECTORY: String get() = TODO()

val STOCK_DISCARD: String get() = TODO()

val STOCK_DISCONNECT: String get() = TODO()

val STOCK_DND: String get() = TODO()

val STOCK_DND_MULTIPLE: String get() = TODO()

val STOCK_EDIT: String get() = TODO()

val STOCK_EXECUTE: String get() = TODO()

val STOCK_FILE: String get() = TODO()

val STOCK_FIND: String get() = TODO()

val STOCK_FIND_AND_REPLACE: String get() = TODO()

val STOCK_FLOPPY: String get() = TODO()

val STOCK_FULLSCREEN: String get() = TODO()

val STOCK_GOTO_BOTTOM: String get() = TODO()

val STOCK_GOTO_FIRST: String get() = TODO()

val STOCK_GOTO_LAST: String get() = TODO()

val STOCK_GOTO_TOP: String get() = TODO()

val STOCK_GO_BACK: String get() = TODO()

val STOCK_GO_DOWN: String get() = TODO()

val STOCK_GO_FORWARD: String get() = TODO()

val STOCK_GO_UP: String get() = TODO()

val STOCK_HARDDISK: String get() = TODO()

val STOCK_HELP: String get() = TODO()

val STOCK_HOME: String get() = TODO()

val STOCK_INDENT: String get() = TODO()

val STOCK_INDEX: String get() = TODO()

val STOCK_INFO: String get() = TODO()

val STOCK_ITALIC: String get() = TODO()

val STOCK_JUMP_TO: String get() = TODO()

val STOCK_JUSTIFY_CENTER: String get() = TODO()

val STOCK_JUSTIFY_FILL: String get() = TODO()

val STOCK_JUSTIFY_LEFT: String get() = TODO()

val STOCK_JUSTIFY_RIGHT: String get() = TODO()

val STOCK_LEAVE_FULLSCREEN: String get() = TODO()

val STOCK_MEDIA_FORWARD: String get() = TODO()

val STOCK_MEDIA_NEXT: String get() = TODO()

val STOCK_MEDIA_PAUSE: String get() = TODO()

val STOCK_MEDIA_PLAY: String get() = TODO()

val STOCK_MEDIA_PREVIOUS: String get() = TODO()

val STOCK_MEDIA_RECORD: String get() = TODO()

val STOCK_MEDIA_REWIND: String get() = TODO()

val STOCK_MEDIA_STOP: String get() = TODO()

val STOCK_MISSING_IMAGE: String get() = TODO()

val STOCK_NETWORK: String get() = TODO()

val STOCK_NEW: String get() = TODO()

val STOCK_NO: String get() = TODO()

val STOCK_OK: String get() = TODO()

val STOCK_OPEN: String get() = TODO()

val STOCK_ORIENTATION_LANDSCAPE: String get() = TODO()

val STOCK_ORIENTATION_PORTRAIT: String get() = TODO()

val STOCK_ORIENTATION_REVERSE_LANDSCAPE: String get() = TODO()

val STOCK_ORIENTATION_REVERSE_PORTRAIT: String get() = TODO()

val STOCK_PAGE_SETUP: String get() = TODO()

val STOCK_PASTE: String get() = TODO()

val STOCK_PREFERENCES: String get() = TODO()

val STOCK_PRINT: String get() = TODO()

val STOCK_PRINT_ERROR: String get() = TODO()

val STOCK_PRINT_PAUSED: String get() = TODO()

val STOCK_PRINT_PREVIEW: String get() = TODO()

val STOCK_PRINT_REPORT: String get() = TODO()

val STOCK_PRINT_WARNING: String get() = TODO()

val STOCK_PROPERTIES: String get() = TODO()

val STOCK_QUIT: String get() = TODO()

val STOCK_REDO: String get() = TODO()

val STOCK_REFRESH: String get() = TODO()

val STOCK_REMOVE: String get() = TODO()

val STOCK_REVERT_TO_SAVED: String get() = TODO()

val STOCK_SAVE: String get() = TODO()

val STOCK_SAVE_AS: String get() = TODO()

val STOCK_SELECT_ALL: String get() = TODO()

val STOCK_SELECT_COLOR: String get() = TODO()

val STOCK_SELECT_FONT: String get() = TODO()

val STOCK_SORT_ASCENDING: String get() = TODO()

val STOCK_SORT_DESCENDING: String get() = TODO()

val STOCK_SPELL_CHECK: String get() = TODO()

val STOCK_STOP: String get() = TODO()

val STOCK_STRIKETHROUGH: String get() = TODO()

val STOCK_UNDELETE: String get() = TODO()

val STOCK_UNDERLINE: String get() = TODO()

val STOCK_UNDO: String get() = TODO()

val STOCK_UNINDENT: String get() = TODO()

val STOCK_YES: String get() = TODO()

val STOCK_ZOOM_100: String get() = TODO()

val STOCK_ZOOM_FIT: String get() = TODO()

val STOCK_ZOOM_IN: String get() = TODO()

val STOCK_ZOOM_OUT: String get() = TODO()

val STYLE_CLASS_ACCELERATOR: String get() = TODO()

val STYLE_CLASS_ARROW: String get() = TODO()

val STYLE_CLASS_BACKGROUND: String get() = TODO()

val STYLE_CLASS_BOTTOM: String get() = TODO()

val STYLE_CLASS_BUTTON: String get() = TODO()

val STYLE_CLASS_CALENDAR: String get() = TODO()

val STYLE_CLASS_CELL: String get() = TODO()

val STYLE_CLASS_CHECK: String get() = TODO()

val STYLE_CLASS_COMBOBOX_ENTRY: String get() = TODO()

val STYLE_CLASS_CONTEXT_MENU: String get() = TODO()

val STYLE_CLASS_CSD: String get() = TODO()

val STYLE_CLASS_CURSOR_HANDLE: String get() = TODO()

val STYLE_CLASS_DEFAULT: String get() = TODO()

val STYLE_CLASS_DESTRUCTIVE_ACTION: String get() = TODO()

val STYLE_CLASS_DIM_LABEL: String get() = TODO()

val STYLE_CLASS_DND: String get() = TODO()

val STYLE_CLASS_DOCK: String get() = TODO()

val STYLE_CLASS_ENTRY: String get() = TODO()

val STYLE_CLASS_ERROR: String get() = TODO()

val STYLE_CLASS_EXPANDER: String get() = TODO()

val STYLE_CLASS_FLAT: String get() = TODO()

val STYLE_CLASS_FRAME: String get() = TODO()

val STYLE_CLASS_GRIP: String get() = TODO()

val STYLE_CLASS_HEADER: String get() = TODO()

val STYLE_CLASS_HIGHLIGHT: String get() = TODO()

val STYLE_CLASS_HORIZONTAL: String get() = TODO()

val STYLE_CLASS_IMAGE: String get() = TODO()

val STYLE_CLASS_INFO: String get() = TODO()

val STYLE_CLASS_INLINE_TOOLBAR: String get() = TODO()

val STYLE_CLASS_INSERTION_CURSOR: String get() = TODO()

val STYLE_CLASS_LABEL: String get() = TODO()

val STYLE_CLASS_LEFT: String get() = TODO()

val STYLE_CLASS_LEVEL_BAR: String get() = TODO()

val STYLE_CLASS_LINKED: String get() = TODO()

val STYLE_CLASS_LIST: String get() = TODO()

val STYLE_CLASS_LIST_ROW: String get() = TODO()

val STYLE_CLASS_MARK: String get() = TODO()

val STYLE_CLASS_MENU: String get() = TODO()

val STYLE_CLASS_MENUBAR: String get() = TODO()

val STYLE_CLASS_MENUITEM: String get() = TODO()

val STYLE_CLASS_MESSAGE_DIALOG: String get() = TODO()

val STYLE_CLASS_MONOSPACE: String get() = TODO()

val STYLE_CLASS_NEEDS_ATTENTION: String get() = TODO()

val STYLE_CLASS_NOTEBOOK: String get() = TODO()

val STYLE_CLASS_OSD: String get() = TODO()

val STYLE_CLASS_OVERSHOOT: String get() = TODO()

val STYLE_CLASS_PANE_SEPARATOR: String get() = TODO()

val STYLE_CLASS_PAPER: String get() = TODO()

val STYLE_CLASS_POPOVER: String get() = TODO()

val STYLE_CLASS_POPUP: String get() = TODO()

val STYLE_CLASS_PRIMARY_TOOLBAR: String get() = TODO()

val STYLE_CLASS_PROGRESSBAR: String get() = TODO()

val STYLE_CLASS_PULSE: String get() = TODO()

val STYLE_CLASS_QUESTION: String get() = TODO()

val STYLE_CLASS_RADIO: String get() = TODO()

val STYLE_CLASS_RAISED: String get() = TODO()

val STYLE_CLASS_READ_ONLY: String get() = TODO()

val STYLE_CLASS_RIGHT: String get() = TODO()

val STYLE_CLASS_RUBBERBAND: String get() = TODO()

val STYLE_CLASS_SCALE: String get() = TODO()

val STYLE_CLASS_SCALE_HAS_MARKS_ABOVE: String get() = TODO()

val STYLE_CLASS_SCALE_HAS_MARKS_BELOW: String get() = TODO()

val STYLE_CLASS_SCROLLBAR: String get() = TODO()

val STYLE_CLASS_SCROLLBARS_JUNCTION: String get() = TODO()

val STYLE_CLASS_SEPARATOR: String get() = TODO()

val STYLE_CLASS_SIDEBAR: String get() = TODO()

val STYLE_CLASS_SLIDER: String get() = TODO()

val STYLE_CLASS_SPINBUTTON: String get() = TODO()

val STYLE_CLASS_SPINNER: String get() = TODO()

val STYLE_CLASS_STATUSBAR: String get() = TODO()

val STYLE_CLASS_SUBTITLE: String get() = TODO()

val STYLE_CLASS_SUGGESTED_ACTION: String get() = TODO()

val STYLE_CLASS_TITLE: String get() = TODO()

val STYLE_CLASS_TITLEBAR: String get() = TODO()

val STYLE_CLASS_TOOLBAR: String get() = TODO()

val STYLE_CLASS_TOOLTIP: String get() = TODO()

val STYLE_CLASS_TOP: String get() = TODO()

val STYLE_CLASS_TOUCH_SELECTION: String get() = TODO()

val STYLE_CLASS_TROUGH: String get() = TODO()

val STYLE_CLASS_UNDERSHOOT: String get() = TODO()

val STYLE_CLASS_VERTICAL: String get() = TODO()

val STYLE_CLASS_VIEW: String get() = TODO()

val STYLE_CLASS_WARNING: String get() = TODO()

val STYLE_CLASS_WIDE: String get() = TODO()

val STYLE_PROPERTY_BACKGROUND_COLOR: String get() = TODO()

val STYLE_PROPERTY_BACKGROUND_IMAGE: String get() = TODO()

val STYLE_PROPERTY_BORDER_COLOR: String get() = TODO()

val STYLE_PROPERTY_BORDER_RADIUS: String get() = TODO()

val STYLE_PROPERTY_BORDER_STYLE: String get() = TODO()

val STYLE_PROPERTY_BORDER_WIDTH: String get() = TODO()

val STYLE_PROPERTY_COLOR: String get() = TODO()

val STYLE_PROPERTY_FONT: String get() = TODO()

val STYLE_PROPERTY_MARGIN: String get() = TODO()

val STYLE_PROPERTY_PADDING: String get() = TODO()

val STYLE_PROVIDER_PRIORITY_APPLICATION: Int get() = TODO()

val STYLE_PROVIDER_PRIORITY_FALLBACK: Int get() = TODO()

val STYLE_PROVIDER_PRIORITY_SETTINGS: Int get() = TODO()

val STYLE_PROVIDER_PRIORITY_THEME: Int get() = TODO()

val STYLE_PROVIDER_PRIORITY_USER: Int get() = TODO()

val STYLE_REGION_COLUMN: String get() = TODO()

val STYLE_REGION_COLUMN_HEADER: String get() = TODO()

val STYLE_REGION_ROW: String get() = TODO()

val STYLE_REGION_TAB: String get() = TODO()

open class Scale internal constructor (private val cptr: CPointer<GtkScale>) : Range(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(orientation: Orientation, adjustment: Adjustment) : this(stub<CPointer<GtkScale>>())

    open fun addMark(value: Double, position: PositionType, markup: String): Unit {
         return stub()
    }
    open fun clearMarks(): Unit {
         return stub()
    }
    open fun getDigits(): Int {
         return stub()
    }
    open fun getDrawValue(): Boolean {
         return stub()
    }
    open fun getHasOrigin(): Boolean {
         return stub()
    }
    open fun getLayout(): com.charlag.kgtk.demo.pango.Layout {
         return stub()
    }
    open fun getLayoutOffsets(x: Int, y: Int): Unit {
         return stub()
    }
    open fun getValuePos(): PositionType {
         return stub()
    }
    open fun setDigits(digits: Int): Unit {
         return stub()
    }
    open fun setDrawValue(draw_value: Boolean): Unit {
         return stub()
    }
    open fun setHasOrigin(has_origin: Boolean): Unit {
         return stub()
    }
    open fun setValuePos(pos: PositionType): Unit {
         return stub()
    }
    fun setOnFormatValue(cb: () -> Unit) {
        do_connect(cptr, "format-value", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31541248UL
        fun cptr(obj: Scale): CPointer<GtkScale> = obj.cptr
        fun newWithRange(orientation: Orientation, min: Double, max: Double, step: Double): Scale = Scale(stub<CPointer<GtkScale>>()) 
    }
}

open class ScaleButton internal constructor (private val cptr: CPointer<GtkScaleButton>) : Button(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(size: Int, min: Double, max: Double, step: Double, icons: List<String>) : this(stub<CPointer<GtkScaleButton>>())

    open fun getAdjustment(): Adjustment {
         return stub()
    }
    open fun getMinusButton(): Button {
         return stub()
    }
    open fun getPlusButton(): Button {
         return stub()
    }
    open fun getPopup(): Widget {
         return stub()
    }
    open fun getValue(): Double {
         return stub()
    }
    open fun setAdjustment(adjustment: Adjustment): Unit {
         return stub()
    }
    open fun setIcons(icons: List<String>): Unit {
         return stub()
    }
    open fun setValue(value: Double): Unit {
         return stub()
    }
    fun setOnPopdown(cb: () -> Unit) {
        do_connect(cptr, "popdown", cb)
    }

    fun setOnPopup(cb: () -> Unit) {
        do_connect(cptr, "popup", cb)
    }

    fun setOnValueChanged(cb: () -> Unit) {
        do_connect(cptr, "value-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31961216UL
        fun cptr(obj: ScaleButton): CPointer<GtkScaleButton> = obj.cptr
    }
}

class ScaleButtonClass(private val cptr: CPointer<cnames.structs._GtkScaleButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: ScaleButtonClass): CPointer<cnames.structs._GtkScaleButtonClass> = obj.cptr
    }
}

class ScaleClass(private val cptr: CPointer<cnames.structs._GtkScaleClass>) /* struct */ {
    companion object {
        fun cptr(obj: ScaleClass): CPointer<cnames.structs._GtkScaleClass> = obj.cptr
    }
}

typealias ScrollStep = GtkScrollStep

typealias ScrollType = GtkScrollType

interface Scrollable : InteropWrapper {
    fun getBorder(border: Border): Boolean = stub("Scrollable default impl")

    fun getHadjustment(): Adjustment = stub("Scrollable default impl")

    fun getHscrollPolicy(): ScrollablePolicy = stub("Scrollable default impl")

    fun getVadjustment(): Adjustment = stub("Scrollable default impl")

    fun getVscrollPolicy(): ScrollablePolicy = stub("Scrollable default impl")

    fun setHadjustment(hadjustment: Adjustment): Unit = stub("Scrollable default impl")

    fun setHscrollPolicy(policy: ScrollablePolicy): Unit = stub("Scrollable default impl")

    fun setVadjustment(vadjustment: Adjustment): Unit = stub("Scrollable default impl")

    fun setVscrollPolicy(policy: ScrollablePolicy): Unit = stub("Scrollable default impl")

    companion object {
        fun cptr(obj: Scrollable): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkScrollable>) : Scrollable {
        override val rawPtr: COpaquePointer = cptr
    }
}

class ScrollableInterface(private val cptr: CPointer<cnames.structs._GtkScrollableInterface>) /* struct */ {
    companion object {
        fun cptr(obj: ScrollableInterface): CPointer<cnames.structs._GtkScrollableInterface> = obj.cptr
    }
}

typealias ScrollablePolicy = GtkScrollablePolicy

open class Scrollbar internal constructor (private val cptr: CPointer<GtkScrollbar>) : Range(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(orientation: Orientation, adjustment: Adjustment) : this(stub<CPointer<GtkScrollbar>>())

    companion object {
        const val G_TYPE: gtk3.GType = 31518128UL
        fun cptr(obj: Scrollbar): CPointer<GtkScrollbar> = obj.cptr
    }
}

class ScrollbarClass(private val cptr: CPointer<cnames.structs._GtkScrollbarClass>) /* struct */ {
    companion object {
        fun cptr(obj: ScrollbarClass): CPointer<cnames.structs._GtkScrollbarClass> = obj.cptr
    }
}

open class ScrolledWindow internal constructor (private val cptr: CPointer<GtkScrolledWindow>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(hadjustment: Adjustment, vadjustment: Adjustment) : this(stub<CPointer<GtkScrolledWindow>>())

    open fun getCaptureButtonPress(): Boolean {
         return stub()
    }
    open fun getHadjustment(): Adjustment {
         return stub()
    }
    open fun getHscrollbar(): Widget {
         return stub()
    }
    open fun getKineticScrolling(): Boolean {
         return stub()
    }
    open fun getMaxContentHeight(): Int {
         return stub()
    }
    open fun getMaxContentWidth(): Int {
         return stub()
    }
    open fun getMinContentHeight(): Int {
         return stub()
    }
    open fun getMinContentWidth(): Int {
         return stub()
    }
    open fun getOverlayScrolling(): Boolean {
         return stub()
    }
    open fun getPlacement(): CornerType {
         return stub()
    }
    open fun getPolicy(hscrollbar_policy: PolicyType, vscrollbar_policy: PolicyType): Unit {
         return stub()
    }
    open fun getPropagateNaturalHeight(): Boolean {
         return stub()
    }
    open fun getPropagateNaturalWidth(): Boolean {
         return stub()
    }
    open fun getShadowType(): ShadowType {
         return stub()
    }
    open fun getVadjustment(): Adjustment {
         return stub()
    }
    open fun getVscrollbar(): Widget {
         return stub()
    }
    open fun setCaptureButtonPress(capture_button_press: Boolean): Unit {
         return stub()
    }
    open fun setHadjustment(hadjustment: Adjustment): Unit {
         return stub()
    }
    open fun setKineticScrolling(kinetic_scrolling: Boolean): Unit {
         return stub()
    }
    open fun setMaxContentHeight(height: Int): Unit {
         return stub()
    }
    open fun setMaxContentWidth(width: Int): Unit {
         return stub()
    }
    open fun setMinContentHeight(height: Int): Unit {
         return stub()
    }
    open fun setMinContentWidth(width: Int): Unit {
         return stub()
    }
    open fun setOverlayScrolling(overlay_scrolling: Boolean): Unit {
         return stub()
    }
    open fun setPlacement(window_placement: CornerType): Unit {
         return stub()
    }
    open fun setPolicy(hscrollbar_policy: PolicyType, vscrollbar_policy: PolicyType): Unit {
         return stub()
    }
    open fun setPropagateNaturalHeight(propagate: Boolean): Unit {
         return stub()
    }
    open fun setPropagateNaturalWidth(propagate: Boolean): Unit {
         return stub()
    }
    open fun setShadowType(type: ShadowType): Unit {
         return stub()
    }
    open fun setVadjustment(vadjustment: Adjustment): Unit {
         return stub()
    }
    open fun unsetPlacement(): Unit {
         return stub()
    }
    fun setOnEdgeOvershot(cb: () -> Unit) {
        do_connect(cptr, "edge-overshot", cb)
    }

    fun setOnEdgeReached(cb: () -> Unit) {
        do_connect(cptr, "edge-reached", cb)
    }

    fun setOnMoveFocusOut(cb: () -> Unit) {
        do_connect(cptr, "move-focus-out", cb)
    }

    fun setOnScrollChild(cb: () -> Unit) {
        do_connect(cptr, "scroll-child", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32307840UL
        fun cptr(obj: ScrolledWindow): CPointer<GtkScrolledWindow> = obj.cptr
    }
}

class ScrolledWindowClass(private val cptr: CPointer<cnames.structs._GtkScrolledWindowClass>) /* struct */ {
    companion object {
        fun cptr(obj: ScrolledWindowClass): CPointer<cnames.structs._GtkScrolledWindowClass> = obj.cptr
    }
}

open class SearchBar internal constructor (private val cptr: CPointer<GtkSearchBar>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkSearchBar>>())

    open fun connectEntry(entry: Entry): Unit {
         return stub()
    }
    open fun getSearchMode(): Boolean {
         return stub()
    }
    open fun getShowCloseButton(): Boolean {
         return stub()
    }
    open fun handleEvent(event: com.charlag.kgtk.demo.gdk.Event): Boolean {
         return stub()
    }
    open fun setSearchMode(search_mode: Boolean): Unit {
         return stub()
    }
    open fun setShowCloseButton(visible: Boolean): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31882656UL
        fun cptr(obj: SearchBar): CPointer<GtkSearchBar> = obj.cptr
    }
}

class SearchBarClass(private val cptr: CPointer<cnames.structs._GtkSearchBarClass>) /* struct */ {
    companion object {
        fun cptr(obj: SearchBarClass): CPointer<cnames.structs._GtkSearchBarClass> = obj.cptr
    }
}

open class SearchEntry internal constructor (private val cptr: CPointer<GtkSearchEntry>) : Entry(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, CellEditable, Editable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkSearchEntry>>())

    open fun handleEvent(event: com.charlag.kgtk.demo.gdk.Event): Boolean {
         return stub()
    }
    fun setOnNextMatch(cb: () -> Unit) {
        do_connect(cptr, "next-match", cb)
    }

    fun setOnPreviousMatch(cb: () -> Unit) {
        do_connect(cptr, "previous-match", cb)
    }

    fun setOnSearchChanged(cb: () -> Unit) {
        do_connect(cptr, "search-changed", cb)
    }

    fun setOnStopSearch(cb: () -> Unit) {
        do_connect(cptr, "stop-search", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32575184UL
        fun cptr(obj: SearchEntry): CPointer<GtkSearchEntry> = obj.cptr
    }
}

class SearchEntryClass(private val cptr: CPointer<cnames.structs._GtkSearchEntryClass>) /* struct */ {
    companion object {
        fun cptr(obj: SearchEntryClass): CPointer<cnames.structs._GtkSearchEntryClass> = obj.cptr
    }
}

class SelectionData(private val cptr: CPointer<cnames.structs._GtkSelectionData>) /* struct */ {
    fun copy(): SelectionData {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getDataType(): com.charlag.kgtk.demo.gdk.Atom {
         return stub()
    }
    fun getData(length: Int): List<UByte> {
         return stub()
    }
    fun getDisplay(): com.charlag.kgtk.demo.gdk.Display {
         return stub()
    }
    fun getFormat(): Int {
         return stub()
    }
    fun getLength(): Int {
         return stub()
    }
    fun getPixbuf(): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    fun getSelection(): com.charlag.kgtk.demo.gdk.Atom {
         return stub()
    }
    fun getTarget(): com.charlag.kgtk.demo.gdk.Atom {
         return stub()
    }
    fun getTargets(targets: List<com.charlag.kgtk.demo.gdk.Atom>, n_atoms: Int): Boolean {
         return stub()
    }
    fun getText(): String {
         return stub()
    }
    fun getUris(): List<String> {
         return stub()
    }
    fun set(type: com.charlag.kgtk.demo.gdk.Atom, format: Int, data: List<UByte>, length: Int): Unit {
         return stub()
    }
    fun setPixbuf(pixbuf: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): Boolean {
         return stub()
    }
    fun setText(str: String, len: Int): Boolean {
         return stub()
    }
    fun setUris(uris: List<String>): Boolean {
         return stub()
    }
    fun targetsIncludeImage(writable: Boolean): Boolean {
         return stub()
    }
    fun targetsIncludeRichText(buffer: TextBuffer): Boolean {
         return stub()
    }
    fun targetsIncludeText(): Boolean {
         return stub()
    }
    fun targetsIncludeUri(): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: SelectionData): CPointer<cnames.structs._GtkSelectionData> = obj.cptr
    }
}

typealias SelectionMode = GtkSelectionMode

typealias SensitivityType = GtkSensitivityType

open class Separator internal constructor (private val cptr: CPointer<GtkSeparator>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(orientation: Orientation) : this(stub<CPointer<GtkSeparator>>())

    companion object {
        const val G_TYPE: gtk3.GType = 31458304UL
        fun cptr(obj: Separator): CPointer<GtkSeparator> = obj.cptr
    }
}

class SeparatorClass(private val cptr: CPointer<cnames.structs._GtkSeparatorClass>) /* struct */ {
    companion object {
        fun cptr(obj: SeparatorClass): CPointer<cnames.structs._GtkSeparatorClass> = obj.cptr
    }
}

open class SeparatorMenuItem internal constructor (private val cptr: CPointer<GtkSeparatorMenuItem>) : MenuItem(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkSeparatorMenuItem>>())

    companion object {
        const val G_TYPE: gtk3.GType = 33585088UL
        fun cptr(obj: SeparatorMenuItem): CPointer<GtkSeparatorMenuItem> = obj.cptr
    }
}

class SeparatorMenuItemClass(private val cptr: CPointer<cnames.structs._GtkSeparatorMenuItemClass>) /* struct */ {
    companion object {
        fun cptr(obj: SeparatorMenuItemClass): CPointer<cnames.structs._GtkSeparatorMenuItemClass> = obj.cptr
    }
}

open class SeparatorToolItem internal constructor (private val cptr: CPointer<GtkSeparatorToolItem>) : ToolItem(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkSeparatorToolItem>>())

    open fun getDraw(): Boolean {
         return stub()
    }
    open fun setDraw(draw: Boolean): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 35518816UL
        fun cptr(obj: SeparatorToolItem): CPointer<GtkSeparatorToolItem> = obj.cptr
    }
}

class SeparatorToolItemClass(private val cptr: CPointer<cnames.structs._GtkSeparatorToolItemClass>) /* struct */ {
    companion object {
        fun cptr(obj: SeparatorToolItemClass): CPointer<cnames.structs._GtkSeparatorToolItemClass> = obj.cptr
    }
}

open class Settings internal constructor (private val cptr: CPointer<GtkSettings>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), StyleProvider, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun resetProperty(`name`: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33688992UL
        fun cptr(obj: Settings): CPointer<GtkSettings> = obj.cptr
        fun getDefault(): Settings {
    return stub()
}
        fun getForScreen(screen: com.charlag.kgtk.demo.gdk.Screen): Settings {
    return stub()
}
    }
}

class SettingsClass(private val cptr: CPointer<cnames.structs._GtkSettingsClass>) /* struct */ {
    companion object {
        fun cptr(obj: SettingsClass): CPointer<cnames.structs._GtkSettingsClass> = obj.cptr
    }
}

class SettingsValue(private val cptr: CPointer<cnames.structs._GtkSettingsValue>) /* struct */ {
    companion object {
        fun cptr(obj: SettingsValue): CPointer<cnames.structs._GtkSettingsValue> = obj.cptr
    }
}

typealias ShadowType = GtkShadowType

open class ShortcutLabel internal constructor (private val cptr: CPointer<GtkShortcutLabel>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(accelerator: String) : this(stub<CPointer<GtkShortcutLabel>>())

    open fun getAccelerator(): String {
         return stub()
    }
    open fun getDisabledText(): String {
         return stub()
    }
    open fun setAccelerator(accelerator: String): Unit {
         return stub()
    }
    open fun setDisabledText(disabled_text: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31819904UL
        fun cptr(obj: ShortcutLabel): CPointer<GtkShortcutLabel> = obj.cptr
    }
}

class ShortcutLabelClass(private val cptr: CPointer<cnames.structs._GtkShortcutLabelClass>) /* struct */ {
    companion object {
        fun cptr(obj: ShortcutLabelClass): CPointer<cnames.structs._GtkShortcutLabelClass> = obj.cptr
    }
}

typealias ShortcutType = GtkShortcutType

open class ShortcutsGroup internal constructor (private val cptr: CPointer<GtkShortcutsGroup>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 31452928UL
        fun cptr(obj: ShortcutsGroup): CPointer<GtkShortcutsGroup> = obj.cptr
    }
}

class ShortcutsGroupClass(private val cptr: CPointer<cnames.structs._GtkShortcutsGroupClass>) /* struct */ {
    companion object {
        fun cptr(obj: ShortcutsGroupClass): CPointer<cnames.structs._GtkShortcutsGroupClass> = obj.cptr
    }
}

open class ShortcutsSection internal constructor (private val cptr: CPointer<GtkShortcutsSection>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    fun setOnChangeCurrentPage(cb: () -> Unit) {
        do_connect(cptr, "change-current-page", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31791584UL
        fun cptr(obj: ShortcutsSection): CPointer<GtkShortcutsSection> = obj.cptr
    }
}

class ShortcutsSectionClass(private val cptr: CPointer<cnames.structs._GtkShortcutsSectionClass>) /* struct */ {
    companion object {
        fun cptr(obj: ShortcutsSectionClass): CPointer<cnames.structs._GtkShortcutsSectionClass> = obj.cptr
    }
}

open class ShortcutsShortcut internal constructor (private val cptr: CPointer<GtkShortcutsShortcut>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 31274128UL
        fun cptr(obj: ShortcutsShortcut): CPointer<GtkShortcutsShortcut> = obj.cptr
    }
}

class ShortcutsShortcutClass(private val cptr: CPointer<cnames.structs._GtkShortcutsShortcutClass>) /* struct */ {
    companion object {
        fun cptr(obj: ShortcutsShortcutClass): CPointer<cnames.structs._GtkShortcutsShortcutClass> = obj.cptr
    }
}

open class ShortcutsWindow internal constructor (private val cptr: CPointer<GtkShortcutsWindow>) : Window(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    fun setOnClose(cb: () -> Unit) {
        do_connect(cptr, "close", cb)
    }

    fun setOnSearch(cb: () -> Unit) {
        do_connect(cptr, "search", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32212528UL
        fun cptr(obj: ShortcutsWindow): CPointer<GtkShortcutsWindow> = obj.cptr
    }
}

class ShortcutsWindowClass(private val cptr: CPointer<cnames.structs._GtkShortcutsWindowClass>) /* struct */ {
    companion object {
        fun cptr(obj: ShortcutsWindowClass): CPointer<cnames.structs._GtkShortcutsWindowClass> = obj.cptr
    }
}

open class SizeGroup internal constructor (private val cptr: CPointer<GtkSizeGroup>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(mode: SizeGroupMode) : this(stub<CPointer<GtkSizeGroup>>())

    open fun addWidget(widget: Widget): Unit {
         return stub()
    }
    open fun getMode(): SizeGroupMode {
         return stub()
    }
    open fun getWidgets(): List<Widget> {
         return stub()
    }
    open fun removeWidget(widget: Widget): Unit {
         return stub()
    }
    open fun setMode(mode: SizeGroupMode): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31480832UL
        fun cptr(obj: SizeGroup): CPointer<GtkSizeGroup> = obj.cptr
    }
}

class SizeGroupClass(private val cptr: CPointer<cnames.structs._GtkSizeGroupClass>) /* struct */ {
    companion object {
        fun cptr(obj: SizeGroupClass): CPointer<cnames.structs._GtkSizeGroupClass> = obj.cptr
    }
}

typealias SizeGroupMode = GtkSizeGroupMode

typealias SizeRequestMode = GtkSizeRequestMode

typealias SortType = GtkSortType

open class SpinButton internal constructor (private val cptr: CPointer<GtkSpinButton>) : Entry(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, CellEditable, Editable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(adjustment: Adjustment, climb_rate: Double, digits: UInt) : this(stub<CPointer<GtkSpinButton>>())

    open fun configure(adjustment: Adjustment, climb_rate: Double, digits: UInt): Unit {
         return stub()
    }
    open fun getAdjustment(): Adjustment {
         return stub()
    }
    open fun getDigits(): UInt {
         return stub()
    }
    open fun getIncrements(step: Double, page: Double): Unit {
         return stub()
    }
    open fun getNumeric(): Boolean {
         return stub()
    }
    open fun getRange(min: Double, max: Double): Unit {
         return stub()
    }
    open fun getSnapToTicks(): Boolean {
         return stub()
    }
    open fun getUpdatePolicy(): SpinButtonUpdatePolicy {
         return stub()
    }
    open fun getValue(): Double {
         return stub()
    }
    open fun getValueAsInt(): Int {
         return stub()
    }
    open fun getWrap(): Boolean {
         return stub()
    }
    open fun setAdjustment(adjustment: Adjustment): Unit {
         return stub()
    }
    open fun setDigits(digits: UInt): Unit {
         return stub()
    }
    open fun setIncrements(step: Double, page: Double): Unit {
         return stub()
    }
    open fun setNumeric(numeric: Boolean): Unit {
         return stub()
    }
    open fun setRange(min: Double, max: Double): Unit {
         return stub()
    }
    open fun setSnapToTicks(snap_to_ticks: Boolean): Unit {
         return stub()
    }
    open fun setUpdatePolicy(policy: SpinButtonUpdatePolicy): Unit {
         return stub()
    }
    open fun setValue(value: Double): Unit {
         return stub()
    }
    open fun setWrap(wrap: Boolean): Unit {
         return stub()
    }
    open fun spin(direction: SpinType, increment: Double): Unit {
         return stub()
    }
    open fun update(): Unit {
         return stub()
    }
    fun setOnChangeValue(cb: () -> Unit) {
        do_connect(cptr, "change-value", cb)
    }

    fun setOnInput(cb: () -> Unit) {
        do_connect(cptr, "input", cb)
    }

    fun setOnOutput(cb: () -> Unit) {
        do_connect(cptr, "output", cb)
    }

    fun setOnValueChanged(cb: () -> Unit) {
        do_connect(cptr, "value-changed", cb)
    }

    fun setOnWrapped(cb: () -> Unit) {
        do_connect(cptr, "wrapped", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32196928UL
        fun cptr(obj: SpinButton): CPointer<GtkSpinButton> = obj.cptr
        fun newWithRange(min: Double, max: Double, step: Double): SpinButton = SpinButton(stub<CPointer<GtkSpinButton>>()) 
    }
}

class SpinButtonClass(private val cptr: CPointer<cnames.structs._GtkSpinButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: SpinButtonClass): CPointer<cnames.structs._GtkSpinButtonClass> = obj.cptr
    }
}

typealias SpinButtonUpdatePolicy = GtkSpinButtonUpdatePolicy

typealias SpinType = GtkSpinType

open class Spinner internal constructor (private val cptr: CPointer<GtkSpinner>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkSpinner>>())

    open fun start(): Unit {
         return stub()
    }
    open fun stop(): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 30898288UL
        fun cptr(obj: Spinner): CPointer<GtkSpinner> = obj.cptr
    }
}

class SpinnerClass(private val cptr: CPointer<cnames.structs._GtkSpinnerClass>) /* struct */ {
    companion object {
        fun cptr(obj: SpinnerClass): CPointer<cnames.structs._GtkSpinnerClass> = obj.cptr
    }
}

open class Stack internal constructor (private val cptr: CPointer<GtkStack>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkStack>>())

    open fun addNamed(child: Widget, `name`: String): Unit {
         return stub()
    }
    open fun addTitled(child: Widget, `name`: String, title: String): Unit {
         return stub()
    }
    open fun getChildByName(`name`: String): Widget {
         return stub()
    }
    open fun getHhomogeneous(): Boolean {
         return stub()
    }
    open fun getHomogeneous(): Boolean {
         return stub()
    }
    open fun getInterpolateSize(): Boolean {
         return stub()
    }
    open fun getTransitionDuration(): UInt {
         return stub()
    }
    open fun getTransitionRunning(): Boolean {
         return stub()
    }
    open fun getTransitionType(): StackTransitionType {
         return stub()
    }
    open fun getVhomogeneous(): Boolean {
         return stub()
    }
    open fun getVisibleChild(): Widget {
         return stub()
    }
    open fun getVisibleChildName(): String {
         return stub()
    }
    open fun setHhomogeneous(hhomogeneous: Boolean): Unit {
         return stub()
    }
    open fun setHomogeneous(homogeneous: Boolean): Unit {
         return stub()
    }
    open fun setInterpolateSize(interpolate_size: Boolean): Unit {
         return stub()
    }
    open fun setTransitionDuration(duration: UInt): Unit {
         return stub()
    }
    open fun setTransitionType(transition: StackTransitionType): Unit {
         return stub()
    }
    open fun setVhomogeneous(vhomogeneous: Boolean): Unit {
         return stub()
    }
    open fun setVisibleChild(child: Widget): Unit {
         return stub()
    }
    open fun setVisibleChildFull(`name`: String, transition: StackTransitionType): Unit {
         return stub()
    }
    open fun setVisibleChildName(`name`: String): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33432208UL
        fun cptr(obj: Stack): CPointer<GtkStack> = obj.cptr
    }
}

class StackClass(private val cptr: CPointer<cnames.structs._GtkStackClass>) /* struct */ {
    companion object {
        fun cptr(obj: StackClass): CPointer<cnames.structs._GtkStackClass> = obj.cptr
    }
}

open class StackSidebar internal constructor (private val cptr: CPointer<GtkStackSidebar>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkStackSidebar>>())

    open fun getStack(): Stack {
         return stub()
    }
    open fun setStack(stack: Stack): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31855440UL
        fun cptr(obj: StackSidebar): CPointer<GtkStackSidebar> = obj.cptr
    }
}

class StackSidebarClass(private val cptr: CPointer<cnames.structs._GtkStackSidebarClass>) /* struct */ {
    companion object {
        fun cptr(obj: StackSidebarClass): CPointer<cnames.structs._GtkStackSidebarClass> = obj.cptr
    }
}

open class StackSwitcher internal constructor (private val cptr: CPointer<GtkStackSwitcher>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkStackSwitcher>>())

    open fun getStack(): Stack {
         return stub()
    }
    open fun setStack(stack: Stack): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32425984UL
        fun cptr(obj: StackSwitcher): CPointer<GtkStackSwitcher> = obj.cptr
    }
}

class StackSwitcherClass(private val cptr: CPointer<cnames.structs._GtkStackSwitcherClass>) /* struct */ {
    companion object {
        fun cptr(obj: StackSwitcherClass): CPointer<cnames.structs._GtkStackSwitcherClass> = obj.cptr
    }
}

typealias StackTransitionType = GtkStackTransitionType

typealias StateFlags = GtkStateFlags

typealias StateType = GtkStateType

open class StatusIcon internal constructor (private val cptr: CPointer<GtkStatusIcon>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    fun setOnActivate(cb: () -> Unit) {
        do_connect(cptr, "activate", cb)
    }

    fun setOnButtonPressEvent(cb: () -> Unit) {
        do_connect(cptr, "button-press-event", cb)
    }

    fun setOnButtonReleaseEvent(cb: () -> Unit) {
        do_connect(cptr, "button-release-event", cb)
    }

    fun setOnPopupMenu(cb: () -> Unit) {
        do_connect(cptr, "popup-menu", cb)
    }

    fun setOnQueryTooltip(cb: () -> Unit) {
        do_connect(cptr, "query-tooltip", cb)
    }

    fun setOnScrollEvent(cb: () -> Unit) {
        do_connect(cptr, "scroll-event", cb)
    }

    fun setOnSizeChanged(cb: () -> Unit) {
        do_connect(cptr, "size-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31131648UL
        fun cptr(obj: StatusIcon): CPointer<GtkStatusIcon> = obj.cptr
    }
}

class StatusIconClass(private val cptr: CPointer<cnames.structs._GtkStatusIconClass>) /* struct */ {
    companion object {
        fun cptr(obj: StatusIconClass): CPointer<cnames.structs._GtkStatusIconClass> = obj.cptr
    }
}

open class Statusbar internal constructor (private val cptr: CPointer<GtkStatusbar>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkStatusbar>>())

    open fun getContextId(context_description: String): UInt {
         return stub()
    }
    open fun getMessageArea(): Box {
         return stub()
    }
    open fun pop(context_id: UInt): Unit {
         return stub()
    }
    open fun push(context_id: UInt, text: String): UInt {
         return stub()
    }
    open fun remove(context_id: UInt, message_id: UInt): Unit {
         return stub()
    }
    open fun removeAll(context_id: UInt): Unit {
         return stub()
    }
    fun setOnTextPopped(cb: () -> Unit) {
        do_connect(cptr, "text-popped", cb)
    }

    fun setOnTextPushed(cb: () -> Unit) {
        do_connect(cptr, "text-pushed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31693808UL
        fun cptr(obj: Statusbar): CPointer<GtkStatusbar> = obj.cptr
    }
}

class StatusbarClass(private val cptr: CPointer<cnames.structs._GtkStatusbarClass>) /* struct */ {
    companion object {
        fun cptr(obj: StatusbarClass): CPointer<cnames.structs._GtkStatusbarClass> = obj.cptr
    }
}

class StockItem(private val cptr: CPointer<cnames.structs._GtkStockItem>) /* struct */ {
    fun free(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: StockItem): CPointer<cnames.structs._GtkStockItem> = obj.cptr
    }
}

open class Style internal constructor (private val cptr: CPointer<GtkStyle>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getStyleProperty(widget_type: GType, property_name: String, value: com.charlag.kgtk.demo.gobject.Value): Unit {
         return stub()
    }
    open fun hasContext(): Boolean {
         return stub()
    }
    fun setOnRealize(cb: () -> Unit) {
        do_connect(cptr, "realize", cb)
    }

    fun setOnUnrealize(cb: () -> Unit) {
        do_connect(cptr, "unrealize", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 35052544UL
        fun cptr(obj: Style): CPointer<GtkStyle> = obj.cptr
    }
}

class StyleClass(private val cptr: CPointer<cnames.structs._GtkStyleClass>) /* struct */ {
    companion object {
        fun cptr(obj: StyleClass): CPointer<cnames.structs._GtkStyleClass> = obj.cptr
    }
}

open class StyleContext internal constructor (private val cptr: CPointer<GtkStyleContext>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkStyleContext>>())

    open fun addClass(class_name: String): Unit {
         return stub()
    }
    open fun addProvider(provider: StyleProvider, priority: UInt): Unit {
         return stub()
    }
    open fun getBorder(state: StateFlags, border: Border): Unit {
         return stub()
    }
    open fun getColor(state: StateFlags, color: com.charlag.kgtk.demo.gdk.RGBA): Unit {
         return stub()
    }
    open fun getFrameClock(): com.charlag.kgtk.demo.gdk.FrameClock {
         return stub()
    }
    open fun getJunctionSides(): JunctionSides {
         return stub()
    }
    open fun getMargin(state: StateFlags, margin: Border): Unit {
         return stub()
    }
    open fun getPadding(state: StateFlags, padding: Border): Unit {
         return stub()
    }
    open fun getParent(): StyleContext {
         return stub()
    }
    open fun getPath(): WidgetPath {
         return stub()
    }
    open fun getProperty(property: String, state: StateFlags, value: com.charlag.kgtk.demo.gobject.Value): Unit {
         return stub()
    }
    open fun getScale(): Int {
         return stub()
    }
    open fun getScreen(): com.charlag.kgtk.demo.gdk.Screen {
         return stub()
    }
    open fun getSection(property: String): CssSection {
         return stub()
    }
    open fun getState(): StateFlags {
         return stub()
    }
    open fun getStyleProperty(property_name: String, value: com.charlag.kgtk.demo.gobject.Value): Unit {
         return stub()
    }
    open fun hasClass(class_name: String): Boolean {
         return stub()
    }
    open fun listClasses(): List<String> {
         return stub()
    }
    open fun lookupColor(color_name: String, color: com.charlag.kgtk.demo.gdk.RGBA): Boolean {
         return stub()
    }
    open fun removeClass(class_name: String): Unit {
         return stub()
    }
    open fun removeProvider(provider: StyleProvider): Unit {
         return stub()
    }
    open fun restore(): Unit {
         return stub()
    }
    open fun save(): Unit {
         return stub()
    }
    open fun setFrameClock(frame_clock: com.charlag.kgtk.demo.gdk.FrameClock): Unit {
         return stub()
    }
    open fun setJunctionSides(sides: JunctionSides): Unit {
         return stub()
    }
    open fun setParent(parent: StyleContext): Unit {
         return stub()
    }
    open fun setPath(path: WidgetPath): Unit {
         return stub()
    }
    open fun setScale(scale: Int): Unit {
         return stub()
    }
    open fun setScreen(screen: com.charlag.kgtk.demo.gdk.Screen): Unit {
         return stub()
    }
    open fun setState(flags: StateFlags): Unit {
         return stub()
    }
    open fun toString(flags: StyleContextPrintFlags): String {
         return stub()
    }
    fun setOnChanged(cb: () -> Unit) {
        do_connect(cptr, "changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30507280UL
        fun cptr(obj: StyleContext): CPointer<GtkStyleContext> = obj.cptr
        fun addProviderForScreen(screen: com.charlag.kgtk.demo.gdk.Screen, provider: StyleProvider, priority: UInt): Unit {
    return stub()
}
        fun removeProviderForScreen(screen: com.charlag.kgtk.demo.gdk.Screen, provider: StyleProvider): Unit {
    return stub()
}
        fun resetWidgets(screen: com.charlag.kgtk.demo.gdk.Screen): Unit {
    return stub()
}
    }
}

class StyleContextClass(private val cptr: CPointer<cnames.structs._GtkStyleContextClass>) /* struct */ {
    companion object {
        fun cptr(obj: StyleContextClass): CPointer<cnames.structs._GtkStyleContextClass> = obj.cptr
    }
}

typealias StyleContextPrintFlags = GtkStyleContextPrintFlags

open class StyleProperties internal constructor (private val cptr: CPointer<GtkStyleProperties>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), StyleProvider, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 32897200UL
        fun cptr(obj: StyleProperties): CPointer<GtkStyleProperties> = obj.cptr
    }
}

class StylePropertiesClass(private val cptr: CPointer<cnames.structs._GtkStylePropertiesClass>) /* struct */ {
    companion object {
        fun cptr(obj: StylePropertiesClass): CPointer<cnames.structs._GtkStylePropertiesClass> = obj.cptr
    }
}

typealias StylePropertyParser = (string:  String, value:  com.charlag.kgtk.demo.gobject.Value) -> Boolean

interface StyleProvider : InteropWrapper {
    fun getStyleProperty(path: WidgetPath, state: StateFlags, pspec: com.charlag.kgtk.demo.gobject.ParamSpec, value: com.charlag.kgtk.demo.gobject.Value): Boolean = stub("StyleProvider default impl")

    companion object {
        fun cptr(obj: StyleProvider): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkStyleProvider>) : StyleProvider {
        override val rawPtr: COpaquePointer = cptr
    }
}

class StyleProviderIface(private val cptr: CPointer<cnames.structs._GtkStyleProviderIface>) /* struct */ {
    companion object {
        fun cptr(obj: StyleProviderIface): CPointer<cnames.structs._GtkStyleProviderIface> = obj.cptr
    }
}

open class Switch internal constructor (private val cptr: CPointer<GtkSwitch>) : Widget(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkSwitch>>())

    open fun getActive(): Boolean {
         return stub()
    }
    open fun getSwitchState(): Boolean {
         return stub()
    }
    open fun setActive(is_active: Boolean): Unit {
         return stub()
    }
    open fun setState(state: Boolean): Unit {
         return stub()
    }
    fun setOnActivate(cb: () -> Unit) {
        do_connect(cptr, "activate", cb)
    }

    fun setOnStateSet(cb: () -> Unit) {
        do_connect(cptr, "state-set", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31099120UL
        fun cptr(obj: Switch): CPointer<GtkSwitch> = obj.cptr
    }
}

class SwitchClass(private val cptr: CPointer<cnames.structs._GtkSwitchClass>) /* struct */ {
    companion object {
        fun cptr(obj: SwitchClass): CPointer<cnames.structs._GtkSwitchClass> = obj.cptr
    }
}

class SymbolicColor(private val cptr: CPointer<cnames.structs._GtkSymbolicColor>) /* struct */ {
    fun newAlpha(color: SymbolicColor, factor: Double): SymbolicColor {
         return stub()
    }
    fun newLiteral(color: com.charlag.kgtk.demo.gdk.RGBA): SymbolicColor {
         return stub()
    }
    fun newMix(color1: SymbolicColor, color2: SymbolicColor, factor: Double): SymbolicColor {
         return stub()
    }
    fun newName(`name`: String): SymbolicColor {
         return stub()
    }
    fun newShade(color: SymbolicColor, factor: Double): SymbolicColor {
         return stub()
    }
    fun newWin32(theme_class: String, id: Int): SymbolicColor {
         return stub()
    }
    fun ref(): SymbolicColor {
         return stub()
    }
    fun resolve(props: StyleProperties, resolved_color: com.charlag.kgtk.demo.gdk.RGBA): Boolean {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: SymbolicColor): CPointer<cnames.structs._GtkSymbolicColor> = obj.cptr
    }
}

val TEXT_VIEW_PRIORITY_VALIDATE: Int get() = TODO()

val TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID: Int get() = TODO()

val TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID: Int get() = TODO()

open class Table internal constructor (private val cptr: CPointer<GtkTable>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 32157696UL
        fun cptr(obj: Table): CPointer<GtkTable> = obj.cptr
    }
}

class TableChild(private val cptr: CPointer<cnames.structs._GtkTableChild>) /* struct */ {
    companion object {
        fun cptr(obj: TableChild): CPointer<cnames.structs._GtkTableChild> = obj.cptr
    }
}

class TableClass(private val cptr: CPointer<cnames.structs._GtkTableClass>) /* struct */ {
    companion object {
        fun cptr(obj: TableClass): CPointer<cnames.structs._GtkTableClass> = obj.cptr
    }
}

class TableRowCol(private val cptr: CPointer<cnames.structs._GtkTableRowCol>) /* struct */ {
    companion object {
        fun cptr(obj: TableRowCol): CPointer<cnames.structs._GtkTableRowCol> = obj.cptr
    }
}

class TargetEntry(private val cptr: CPointer<cnames.structs._GtkTargetEntry>) /* struct */ {
    fun new(target: String, flags: UInt, info: UInt): TargetEntry {
         return stub()
    }
    fun copy(): TargetEntry {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: TargetEntry): CPointer<cnames.structs._GtkTargetEntry> = obj.cptr
    }
}

typealias TargetFlags = GtkTargetFlags

class TargetList(private val cptr: CPointer<cnames.structs._GtkTargetList>) /* struct */ {
    fun new(targets: List<TargetEntry>, ntargets: UInt): TargetList {
         return stub()
    }
    fun add(target: com.charlag.kgtk.demo.gdk.Atom, flags: UInt, info: UInt): Unit {
         return stub()
    }
    fun addImageTargets(info: UInt, writable: Boolean): Unit {
         return stub()
    }
    fun addRichTextTargets(info: UInt, deserializable: Boolean, buffer: TextBuffer): Unit {
         return stub()
    }
    fun addTable(targets: List<TargetEntry>, ntargets: UInt): Unit {
         return stub()
    }
    fun addTextTargets(info: UInt): Unit {
         return stub()
    }
    fun addUriTargets(info: UInt): Unit {
         return stub()
    }
    fun find(target: com.charlag.kgtk.demo.gdk.Atom, info: UInt): Boolean {
         return stub()
    }
    fun ref(): TargetList {
         return stub()
    }
    fun remove(target: com.charlag.kgtk.demo.gdk.Atom): Unit {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: TargetList): CPointer<cnames.structs._GtkTargetList> = obj.cptr
    }
}

class TargetPair(private val cptr: CPointer<cnames.structs._GtkTargetPair>) /* struct */ {
    companion object {
        fun cptr(obj: TargetPair): CPointer<cnames.structs._GtkTargetPair> = obj.cptr
    }
}

open class TearoffMenuItem internal constructor (private val cptr: CPointer<GtkTearoffMenuItem>) : MenuItem(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 32426896UL
        fun cptr(obj: TearoffMenuItem): CPointer<GtkTearoffMenuItem> = obj.cptr
    }
}

class TearoffMenuItemClass(private val cptr: CPointer<cnames.structs._GtkTearoffMenuItemClass>) /* struct */ {
    companion object {
        fun cptr(obj: TearoffMenuItemClass): CPointer<cnames.structs._GtkTearoffMenuItemClass> = obj.cptr
    }
}

class TextAppearance(private val cptr: CPointer<cnames.structs._GtkTextAppearance>) /* struct */ {
    companion object {
        fun cptr(obj: TextAppearance): CPointer<cnames.structs._GtkTextAppearance> = obj.cptr
    }
}

class TextAttributes(private val cptr: CPointer<cnames.structs._GtkTextAttributes>) /* struct */ {
    fun new(): TextAttributes {
         return stub()
    }
    fun copy(): TextAttributes {
         return stub()
    }
    fun copyValues(dest: TextAttributes): Unit {
         return stub()
    }
    fun ref(): TextAttributes {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: TextAttributes): CPointer<cnames.structs._GtkTextAttributes> = obj.cptr
    }
}

class TextBTree(private val cptr: CPointer<cnames.structs._GtkTextBTree>) /* struct */ {
    companion object {
        fun cptr(obj: TextBTree): CPointer<cnames.structs._GtkTextBTree> = obj.cptr
    }
}

open class TextBuffer internal constructor (private val cptr: CPointer<GtkTextBuffer>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(table: TextTagTable) : this(stub<CPointer<GtkTextBuffer>>())

    open fun addMark(mark: TextMark, where: TextIter): Unit {
         return stub()
    }
    open fun addSelectionClipboard(clipboard: Clipboard): Unit {
         return stub()
    }
    open fun applyTag(tag: TextTag, start: TextIter, end: TextIter): Unit {
         return stub()
    }
    open fun applyTagByName(`name`: String, start: TextIter, end: TextIter): Unit {
         return stub()
    }
    open fun backspace(iter: TextIter, interactive: Boolean, default_editable: Boolean): Boolean {
         return stub()
    }
    open fun beginUserAction(): Unit {
         return stub()
    }
    open fun copyClipboard(clipboard: Clipboard): Unit {
         return stub()
    }
    open fun createChildAnchor(iter: TextIter): TextChildAnchor {
         return stub()
    }
    open fun createMark(mark_name: String, where: TextIter, left_gravity: Boolean): TextMark {
         return stub()
    }
    open fun cutClipboard(clipboard: Clipboard, default_editable: Boolean): Unit {
         return stub()
    }
    open fun delete(start: TextIter, end: TextIter): Unit {
         return stub()
    }
    open fun deleteInteractive(start_iter: TextIter, end_iter: TextIter, default_editable: Boolean): Boolean {
         return stub()
    }
    open fun deleteMark(mark: TextMark): Unit {
         return stub()
    }
    open fun deleteMarkByName(`name`: String): Unit {
         return stub()
    }
    open fun deleteSelection(interactive: Boolean, default_editable: Boolean): Boolean {
         return stub()
    }
    open fun deserialize(content_buffer: TextBuffer, format: com.charlag.kgtk.demo.gdk.Atom, iter: TextIter, data: List<UByte>, length: ULong): Boolean {
         return stub()
    }
    open fun deserializeGetCanCreateTags(format: com.charlag.kgtk.demo.gdk.Atom): Boolean {
         return stub()
    }
    open fun deserializeSetCanCreateTags(format: com.charlag.kgtk.demo.gdk.Atom, can_create_tags: Boolean): Unit {
         return stub()
    }
    open fun endUserAction(): Unit {
         return stub()
    }
    open fun getBounds(start: TextIter, end: TextIter): Unit {
         return stub()
    }
    open fun getCharCount(): Int {
         return stub()
    }
    open fun getCopyTargetList(): TargetList {
         return stub()
    }
    open fun getDeserializeFormats(n_formats: Int): List<com.charlag.kgtk.demo.gdk.Atom> {
         return stub()
    }
    open fun getEndIter(iter: TextIter): Unit {
         return stub()
    }
    open fun getHasSelection(): Boolean {
         return stub()
    }
    open fun getInsert(): TextMark {
         return stub()
    }
    open fun getIterAtChildAnchor(iter: TextIter, anchor: TextChildAnchor): Unit {
         return stub()
    }
    open fun getIterAtLine(iter: TextIter, line_number: Int): Unit {
         return stub()
    }
    open fun getIterAtLineIndex(iter: TextIter, line_number: Int, byte_index: Int): Unit {
         return stub()
    }
    open fun getIterAtLineOffset(iter: TextIter, line_number: Int, char_offset: Int): Unit {
         return stub()
    }
    open fun getIterAtMark(iter: TextIter, mark: TextMark): Unit {
         return stub()
    }
    open fun getIterAtOffset(iter: TextIter, char_offset: Int): Unit {
         return stub()
    }
    open fun getLineCount(): Int {
         return stub()
    }
    open fun getMark(`name`: String): TextMark {
         return stub()
    }
    open fun getModified(): Boolean {
         return stub()
    }
    open fun getPasteTargetList(): TargetList {
         return stub()
    }
    open fun getSelectionBound(): TextMark {
         return stub()
    }
    open fun getSelectionBounds(start: TextIter, end: TextIter): Boolean {
         return stub()
    }
    open fun getSerializeFormats(n_formats: Int): List<com.charlag.kgtk.demo.gdk.Atom> {
         return stub()
    }
    open fun getSlice(start: TextIter, end: TextIter, include_hidden_chars: Boolean): String {
         return stub()
    }
    open fun getStartIter(iter: TextIter): Unit {
         return stub()
    }
    open fun getTagTable(): TextTagTable {
         return stub()
    }
    open fun getText(start: TextIter, end: TextIter, include_hidden_chars: Boolean): String {
         return stub()
    }
    open fun insert(iter: TextIter, text: String, len: Int): Unit {
         return stub()
    }
    open fun insertAtCursor(text: String, len: Int): Unit {
         return stub()
    }
    open fun insertChildAnchor(iter: TextIter, anchor: TextChildAnchor): Unit {
         return stub()
    }
    open fun insertInteractive(iter: TextIter, text: String, len: Int, default_editable: Boolean): Boolean {
         return stub()
    }
    open fun insertInteractiveAtCursor(text: String, len: Int, default_editable: Boolean): Boolean {
         return stub()
    }
    open fun insertMarkup(iter: TextIter, markup: String, len: Int): Unit {
         return stub()
    }
    open fun insertPixbuf(iter: TextIter, pixbuf: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): Unit {
         return stub()
    }
    open fun insertRange(iter: TextIter, start: TextIter, end: TextIter): Unit {
         return stub()
    }
    open fun insertRangeInteractive(iter: TextIter, start: TextIter, end: TextIter, default_editable: Boolean): Boolean {
         return stub()
    }
    open fun moveMark(mark: TextMark, where: TextIter): Unit {
         return stub()
    }
    open fun moveMarkByName(`name`: String, where: TextIter): Unit {
         return stub()
    }
    open fun pasteClipboard(clipboard: Clipboard, override_location: TextIter, default_editable: Boolean): Unit {
         return stub()
    }
    open fun placeCursor(where: TextIter): Unit {
         return stub()
    }
    open fun registerDeserializeFormat(mime_type: String, function: TextBufferDeserializeFunc, user_data: Any, user_data_destroy: com.charlag.kgtk.demo.glib.DestroyNotify): com.charlag.kgtk.demo.gdk.Atom {
         return stub()
    }
    open fun registerDeserializeTagset(tagset_name: String): com.charlag.kgtk.demo.gdk.Atom {
         return stub()
    }
    open fun registerSerializeFormat(mime_type: String, function: TextBufferSerializeFunc, user_data: Any, user_data_destroy: com.charlag.kgtk.demo.glib.DestroyNotify): com.charlag.kgtk.demo.gdk.Atom {
         return stub()
    }
    open fun registerSerializeTagset(tagset_name: String): com.charlag.kgtk.demo.gdk.Atom {
         return stub()
    }
    open fun removeAllTags(start: TextIter, end: TextIter): Unit {
         return stub()
    }
    open fun removeSelectionClipboard(clipboard: Clipboard): Unit {
         return stub()
    }
    open fun removeTag(tag: TextTag, start: TextIter, end: TextIter): Unit {
         return stub()
    }
    open fun removeTagByName(`name`: String, start: TextIter, end: TextIter): Unit {
         return stub()
    }
    open fun selectRange(ins: TextIter, bound: TextIter): Unit {
         return stub()
    }
    open fun serialize(content_buffer: TextBuffer, format: com.charlag.kgtk.demo.gdk.Atom, start: TextIter, end: TextIter, length: ULong): List<UByte> {
         return stub()
    }
    open fun setModified(setting: Boolean): Unit {
         return stub()
    }
    open fun setText(text: String, len: Int): Unit {
         return stub()
    }
    open fun unregisterDeserializeFormat(format: com.charlag.kgtk.demo.gdk.Atom): Unit {
         return stub()
    }
    open fun unregisterSerializeFormat(format: com.charlag.kgtk.demo.gdk.Atom): Unit {
         return stub()
    }
    fun setOnApplyTag(cb: () -> Unit) {
        do_connect(cptr, "apply-tag", cb)
    }

    fun setOnBeginUserAction(cb: () -> Unit) {
        do_connect(cptr, "begin-user-action", cb)
    }

    fun setOnChanged(cb: () -> Unit) {
        do_connect(cptr, "changed", cb)
    }

    fun setOnDeleteRange(cb: () -> Unit) {
        do_connect(cptr, "delete-range", cb)
    }

    fun setOnEndUserAction(cb: () -> Unit) {
        do_connect(cptr, "end-user-action", cb)
    }

    fun setOnInsertChildAnchor(cb: () -> Unit) {
        do_connect(cptr, "insert-child-anchor", cb)
    }

    fun setOnInsertPixbuf(cb: () -> Unit) {
        do_connect(cptr, "insert-pixbuf", cb)
    }

    fun setOnInsertText(cb: () -> Unit) {
        do_connect(cptr, "insert-text", cb)
    }

    fun setOnMarkDeleted(cb: () -> Unit) {
        do_connect(cptr, "mark-deleted", cb)
    }

    fun setOnMarkSet(cb: () -> Unit) {
        do_connect(cptr, "mark-set", cb)
    }

    fun setOnModifiedChanged(cb: () -> Unit) {
        do_connect(cptr, "modified-changed", cb)
    }

    fun setOnPasteDone(cb: () -> Unit) {
        do_connect(cptr, "paste-done", cb)
    }

    fun setOnRemoveTag(cb: () -> Unit) {
        do_connect(cptr, "remove-tag", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32306176UL
        fun cptr(obj: TextBuffer): CPointer<GtkTextBuffer> = obj.cptr
    }
}

class TextBufferClass(private val cptr: CPointer<cnames.structs._GtkTextBufferClass>) /* struct */ {
    companion object {
        fun cptr(obj: TextBufferClass): CPointer<cnames.structs._GtkTextBufferClass> = obj.cptr
    }
}

typealias TextBufferDeserializeFunc = (register_buffer:  TextBuffer, content_buffer:  TextBuffer, iter:  TextIter, data:  List<UByte>, length:  ULong, create_tags:  Boolean, user_data:  Any) -> Boolean

typealias TextBufferSerializeFunc = (register_buffer:  TextBuffer, content_buffer:  TextBuffer, start:  TextIter, end:  TextIter, length:  ULong, user_data:  Any) -> UByte

typealias TextBufferTargetInfo = GtkTextBufferTargetInfo

typealias TextCharPredicate = (ch:  Char, user_data:  Any) -> Boolean

open class TextChildAnchor internal constructor (private val cptr: CPointer<GtkTextChildAnchor>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkTextChildAnchor>>())

    open fun getDeleted(): Boolean {
         return stub()
    }
    open fun getWidgets(): List<Widget> {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31319296UL
        fun cptr(obj: TextChildAnchor): CPointer<GtkTextChildAnchor> = obj.cptr
    }
}

class TextChildAnchorClass(private val cptr: CPointer<cnames.structs._GtkTextChildAnchorClass>) /* struct */ {
    companion object {
        fun cptr(obj: TextChildAnchorClass): CPointer<cnames.structs._GtkTextChildAnchorClass> = obj.cptr
    }
}

typealias TextDirection = GtkTextDirection

typealias TextExtendSelection = GtkTextExtendSelection

class TextIter(private val cptr: CPointer<cnames.structs._GtkTextIter>) /* struct */ {
    fun assign(other: TextIter): Unit {
         return stub()
    }
    fun backwardChar(): Boolean {
         return stub()
    }
    fun backwardChars(count: Int): Boolean {
         return stub()
    }
    fun backwardCursorPosition(): Boolean {
         return stub()
    }
    fun backwardCursorPositions(count: Int): Boolean {
         return stub()
    }
    fun backwardFindChar(pred: TextCharPredicate, user_data: Any, limit: TextIter): Boolean {
         return stub()
    }
    fun backwardLine(): Boolean {
         return stub()
    }
    fun backwardLines(count: Int): Boolean {
         return stub()
    }
    fun backwardSearch(str: String, flags: TextSearchFlags, match_start: TextIter, match_end: TextIter, limit: TextIter): Boolean {
         return stub()
    }
    fun backwardSentenceStart(): Boolean {
         return stub()
    }
    fun backwardSentenceStarts(count: Int): Boolean {
         return stub()
    }
    fun backwardToTagToggle(tag: TextTag): Boolean {
         return stub()
    }
    fun backwardVisibleCursorPosition(): Boolean {
         return stub()
    }
    fun backwardVisibleCursorPositions(count: Int): Boolean {
         return stub()
    }
    fun backwardVisibleLine(): Boolean {
         return stub()
    }
    fun backwardVisibleLines(count: Int): Boolean {
         return stub()
    }
    fun backwardVisibleWordStart(): Boolean {
         return stub()
    }
    fun backwardVisibleWordStarts(count: Int): Boolean {
         return stub()
    }
    fun backwardWordStart(): Boolean {
         return stub()
    }
    fun backwardWordStarts(count: Int): Boolean {
         return stub()
    }
    fun beginsTag(tag: TextTag): Boolean {
         return stub()
    }
    fun canInsert(default_editability: Boolean): Boolean {
         return stub()
    }
    fun compare(rhs: TextIter): Int {
         return stub()
    }
    fun copy(): TextIter {
         return stub()
    }
    fun editable(default_setting: Boolean): Boolean {
         return stub()
    }
    fun endsLine(): Boolean {
         return stub()
    }
    fun endsSentence(): Boolean {
         return stub()
    }
    fun endsTag(tag: TextTag): Boolean {
         return stub()
    }
    fun endsWord(): Boolean {
         return stub()
    }
    fun equal(rhs: TextIter): Boolean {
         return stub()
    }
    fun forwardChar(): Boolean {
         return stub()
    }
    fun forwardChars(count: Int): Boolean {
         return stub()
    }
    fun forwardCursorPosition(): Boolean {
         return stub()
    }
    fun forwardCursorPositions(count: Int): Boolean {
         return stub()
    }
    fun forwardFindChar(pred: TextCharPredicate, user_data: Any, limit: TextIter): Boolean {
         return stub()
    }
    fun forwardLine(): Boolean {
         return stub()
    }
    fun forwardLines(count: Int): Boolean {
         return stub()
    }
    fun forwardSearch(str: String, flags: TextSearchFlags, match_start: TextIter, match_end: TextIter, limit: TextIter): Boolean {
         return stub()
    }
    fun forwardSentenceEnd(): Boolean {
         return stub()
    }
    fun forwardSentenceEnds(count: Int): Boolean {
         return stub()
    }
    fun forwardToEnd(): Unit {
         return stub()
    }
    fun forwardToLineEnd(): Boolean {
         return stub()
    }
    fun forwardToTagToggle(tag: TextTag): Boolean {
         return stub()
    }
    fun forwardVisibleCursorPosition(): Boolean {
         return stub()
    }
    fun forwardVisibleCursorPositions(count: Int): Boolean {
         return stub()
    }
    fun forwardVisibleLine(): Boolean {
         return stub()
    }
    fun forwardVisibleLines(count: Int): Boolean {
         return stub()
    }
    fun forwardVisibleWordEnd(): Boolean {
         return stub()
    }
    fun forwardVisibleWordEnds(count: Int): Boolean {
         return stub()
    }
    fun forwardWordEnd(): Boolean {
         return stub()
    }
    fun forwardWordEnds(count: Int): Boolean {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getAttributes(values: TextAttributes): Boolean {
         return stub()
    }
    fun getBuffer(): TextBuffer {
         return stub()
    }
    fun getBytesInLine(): Int {
         return stub()
    }
    fun getChar(): Char {
         return stub()
    }
    fun getCharsInLine(): Int {
         return stub()
    }
    fun getChildAnchor(): TextChildAnchor {
         return stub()
    }
    fun getLanguage(): com.charlag.kgtk.demo.pango.Language {
         return stub()
    }
    fun getLine(): Int {
         return stub()
    }
    fun getLineIndex(): Int {
         return stub()
    }
    fun getLineOffset(): Int {
         return stub()
    }
    fun getMarks(): List<TextMark> {
         return stub()
    }
    fun getOffset(): Int {
         return stub()
    }
    fun getPixbuf(): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    fun getSlice(end: TextIter): String {
         return stub()
    }
    fun getTags(): List<TextTag> {
         return stub()
    }
    fun getText(end: TextIter): String {
         return stub()
    }
    fun getToggledTags(toggled_on: Boolean): List<TextTag> {
         return stub()
    }
    fun getVisibleLineIndex(): Int {
         return stub()
    }
    fun getVisibleLineOffset(): Int {
         return stub()
    }
    fun getVisibleSlice(end: TextIter): String {
         return stub()
    }
    fun getVisibleText(end: TextIter): String {
         return stub()
    }
    fun hasTag(tag: TextTag): Boolean {
         return stub()
    }
    fun inRange(start: TextIter, end: TextIter): Boolean {
         return stub()
    }
    fun insideSentence(): Boolean {
         return stub()
    }
    fun insideWord(): Boolean {
         return stub()
    }
    fun isCursorPosition(): Boolean {
         return stub()
    }
    fun isEnd(): Boolean {
         return stub()
    }
    fun isStart(): Boolean {
         return stub()
    }
    fun order(second: TextIter): Unit {
         return stub()
    }
    fun setLine(line_number: Int): Unit {
         return stub()
    }
    fun setLineIndex(byte_on_line: Int): Unit {
         return stub()
    }
    fun setLineOffset(char_on_line: Int): Unit {
         return stub()
    }
    fun setOffset(char_offset: Int): Unit {
         return stub()
    }
    fun setVisibleLineIndex(byte_on_line: Int): Unit {
         return stub()
    }
    fun setVisibleLineOffset(char_on_line: Int): Unit {
         return stub()
    }
    fun startsLine(): Boolean {
         return stub()
    }
    fun startsSentence(): Boolean {
         return stub()
    }
    fun startsTag(tag: TextTag): Boolean {
         return stub()
    }
    fun startsWord(): Boolean {
         return stub()
    }
    fun togglesTag(tag: TextTag): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: TextIter): CPointer<cnames.structs._GtkTextIter> = obj.cptr
    }
}

open class TextMark internal constructor (private val cptr: CPointer<GtkTextMark>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(`name`: String, left_gravity: Boolean) : this(stub<CPointer<GtkTextMark>>())

    open fun getBuffer(): TextBuffer {
         return stub()
    }
    open fun getDeleted(): Boolean {
         return stub()
    }
    open fun getLeftGravity(): Boolean {
         return stub()
    }
    open fun getName(): String {
         return stub()
    }
    open fun getVisible(): Boolean {
         return stub()
    }
    open fun setVisible(setting: Boolean): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 36198112UL
        fun cptr(obj: TextMark): CPointer<GtkTextMark> = obj.cptr
    }
}

class TextMarkClass(private val cptr: CPointer<cnames.structs._GtkTextMarkClass>) /* struct */ {
    companion object {
        fun cptr(obj: TextMarkClass): CPointer<cnames.structs._GtkTextMarkClass> = obj.cptr
    }
}

typealias TextSearchFlags = GtkTextSearchFlags

open class TextTag internal constructor (private val cptr: CPointer<GtkTextTag>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(`name`: String) : this(stub<CPointer<GtkTextTag>>())

    open fun changed(size_changed: Boolean): Unit {
         return stub()
    }
    open fun event(event_object: com.charlag.kgtk.demo.gobject.Object, event: com.charlag.kgtk.demo.gdk.Event, iter: TextIter): Boolean {
         return stub()
    }
    open fun getPriority(): Int {
         return stub()
    }
    open fun setPriority(priority: Int): Unit {
         return stub()
    }
    fun setOnEvent(cb: () -> Unit) {
        do_connect(cptr, "event", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31341296UL
        fun cptr(obj: TextTag): CPointer<GtkTextTag> = obj.cptr
    }
}

class TextTagClass(private val cptr: CPointer<cnames.structs._GtkTextTagClass>) /* struct */ {
    companion object {
        fun cptr(obj: TextTagClass): CPointer<cnames.structs._GtkTextTagClass> = obj.cptr
    }
}

open class TextTagTable internal constructor (private val cptr: CPointer<GtkTextTagTable>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkTextTagTable>>())

    open fun add(tag: TextTag): Boolean {
         return stub()
    }
    open fun foreach(func: TextTagTableForeach, data: Any): Unit {
         return stub()
    }
    open fun getSize(): Int {
         return stub()
    }
    open fun lookup(`name`: String): TextTag {
         return stub()
    }
    open fun remove(tag: TextTag): Unit {
         return stub()
    }
    fun setOnTagAdded(cb: () -> Unit) {
        do_connect(cptr, "tag-added", cb)
    }

    fun setOnTagChanged(cb: () -> Unit) {
        do_connect(cptr, "tag-changed", cb)
    }

    fun setOnTagRemoved(cb: () -> Unit) {
        do_connect(cptr, "tag-removed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31784528UL
        fun cptr(obj: TextTagTable): CPointer<GtkTextTagTable> = obj.cptr
    }
}

class TextTagTableClass(private val cptr: CPointer<cnames.structs._GtkTextTagTableClass>) /* struct */ {
    companion object {
        fun cptr(obj: TextTagTableClass): CPointer<cnames.structs._GtkTextTagTableClass> = obj.cptr
    }
}

typealias TextTagTableForeach = (tag:  TextTag, data:  Any) -> Unit

open class TextView internal constructor (private val cptr: CPointer<GtkTextView>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Scrollable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkTextView>>())

    open fun addChildAtAnchor(child: Widget, anchor: TextChildAnchor): Unit {
         return stub()
    }
    open fun addChildInWindow(child: Widget, which_window: TextWindowType, xpos: Int, ypos: Int): Unit {
         return stub()
    }
    open fun backwardDisplayLine(iter: TextIter): Boolean {
         return stub()
    }
    open fun backwardDisplayLineStart(iter: TextIter): Boolean {
         return stub()
    }
    open fun bufferToWindowCoords(win: TextWindowType, buffer_x: Int, buffer_y: Int, window_x: Int, window_y: Int): Unit {
         return stub()
    }
    open fun forwardDisplayLine(iter: TextIter): Boolean {
         return stub()
    }
    open fun forwardDisplayLineEnd(iter: TextIter): Boolean {
         return stub()
    }
    open fun getAcceptsTab(): Boolean {
         return stub()
    }
    open fun getBorderWindowSize(type: TextWindowType): Int {
         return stub()
    }
    open fun getBottomMargin(): Int {
         return stub()
    }
    open fun getBuffer(): TextBuffer {
         return stub()
    }
    open fun getCursorLocations(iter: TextIter, strong: com.charlag.kgtk.demo.gdk.Rectangle, weak: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun getCursorVisible(): Boolean {
         return stub()
    }
    open fun getDefaultAttributes(): TextAttributes {
         return stub()
    }
    open fun getEditable(): Boolean {
         return stub()
    }
    open fun getIndent(): Int {
         return stub()
    }
    open fun getInputHints(): InputHints {
         return stub()
    }
    open fun getInputPurpose(): InputPurpose {
         return stub()
    }
    open fun getIterAtLocation(iter: TextIter, x: Int, y: Int): Boolean {
         return stub()
    }
    open fun getIterAtPosition(iter: TextIter, trailing: Int, x: Int, y: Int): Boolean {
         return stub()
    }
    open fun getIterLocation(iter: TextIter, location: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun getJustification(): Justification {
         return stub()
    }
    open fun getLeftMargin(): Int {
         return stub()
    }
    open fun getLineAtY(target_iter: TextIter, y: Int, line_top: Int): Unit {
         return stub()
    }
    open fun getLineYrange(iter: TextIter, y: Int, height: Int): Unit {
         return stub()
    }
    open fun getMonospace(): Boolean {
         return stub()
    }
    open fun getOverwrite(): Boolean {
         return stub()
    }
    open fun getPixelsAboveLines(): Int {
         return stub()
    }
    open fun getPixelsBelowLines(): Int {
         return stub()
    }
    open fun getPixelsInsideWrap(): Int {
         return stub()
    }
    open fun getRightMargin(): Int {
         return stub()
    }
    open fun getTabs(): com.charlag.kgtk.demo.pango.TabArray {
         return stub()
    }
    open fun getTopMargin(): Int {
         return stub()
    }
    open fun getVisibleRect(visible_rect: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun getWindow(win: TextWindowType): com.charlag.kgtk.demo.gdk.Window {
         return stub()
    }
    open fun getWindowType(window: com.charlag.kgtk.demo.gdk.Window): TextWindowType {
         return stub()
    }
    open fun getWrapMode(): WrapMode {
         return stub()
    }
    open fun imContextFilterKeypress(event: com.charlag.kgtk.demo.gdk.EventKey): Boolean {
         return stub()
    }
    open fun moveChild(child: Widget, xpos: Int, ypos: Int): Unit {
         return stub()
    }
    open fun moveMarkOnscreen(mark: TextMark): Boolean {
         return stub()
    }
    open fun moveVisually(iter: TextIter, count: Int): Boolean {
         return stub()
    }
    open fun placeCursorOnscreen(): Boolean {
         return stub()
    }
    open fun resetCursorBlink(): Unit {
         return stub()
    }
    open fun resetImContext(): Unit {
         return stub()
    }
    open fun scrollMarkOnscreen(mark: TextMark): Unit {
         return stub()
    }
    open fun scrollToIter(iter: TextIter, within_margin: Double, use_align: Boolean, xalign: Double, yalign: Double): Boolean {
         return stub()
    }
    open fun scrollToMark(mark: TextMark, within_margin: Double, use_align: Boolean, xalign: Double, yalign: Double): Unit {
         return stub()
    }
    open fun setAcceptsTab(accepts_tab: Boolean): Unit {
         return stub()
    }
    open fun setBorderWindowSize(type: TextWindowType, size: Int): Unit {
         return stub()
    }
    open fun setBottomMargin(bottom_margin: Int): Unit {
         return stub()
    }
    open fun setBuffer(buffer: TextBuffer): Unit {
         return stub()
    }
    open fun setCursorVisible(setting: Boolean): Unit {
         return stub()
    }
    open fun setEditable(setting: Boolean): Unit {
         return stub()
    }
    open fun setIndent(indent: Int): Unit {
         return stub()
    }
    open fun setInputHints(hints: InputHints): Unit {
         return stub()
    }
    open fun setInputPurpose(purpose: InputPurpose): Unit {
         return stub()
    }
    open fun setJustification(justification: Justification): Unit {
         return stub()
    }
    open fun setLeftMargin(left_margin: Int): Unit {
         return stub()
    }
    open fun setMonospace(monospace: Boolean): Unit {
         return stub()
    }
    open fun setOverwrite(overwrite: Boolean): Unit {
         return stub()
    }
    open fun setPixelsAboveLines(pixels_above_lines: Int): Unit {
         return stub()
    }
    open fun setPixelsBelowLines(pixels_below_lines: Int): Unit {
         return stub()
    }
    open fun setPixelsInsideWrap(pixels_inside_wrap: Int): Unit {
         return stub()
    }
    open fun setRightMargin(right_margin: Int): Unit {
         return stub()
    }
    open fun setTabs(tabs: com.charlag.kgtk.demo.pango.TabArray): Unit {
         return stub()
    }
    open fun setTopMargin(top_margin: Int): Unit {
         return stub()
    }
    open fun setWrapMode(wrap_mode: WrapMode): Unit {
         return stub()
    }
    open fun startsDisplayLine(iter: TextIter): Boolean {
         return stub()
    }
    open fun windowToBufferCoords(win: TextWindowType, window_x: Int, window_y: Int, buffer_x: Int, buffer_y: Int): Unit {
         return stub()
    }
    fun setOnBackspace(cb: () -> Unit) {
        do_connect(cptr, "backspace", cb)
    }

    fun setOnCopyClipboard(cb: () -> Unit) {
        do_connect(cptr, "copy-clipboard", cb)
    }

    fun setOnCutClipboard(cb: () -> Unit) {
        do_connect(cptr, "cut-clipboard", cb)
    }

    fun setOnDeleteFromCursor(cb: () -> Unit) {
        do_connect(cptr, "delete-from-cursor", cb)
    }

    fun setOnExtendSelection(cb: () -> Unit) {
        do_connect(cptr, "extend-selection", cb)
    }

    fun setOnInsertAtCursor(cb: () -> Unit) {
        do_connect(cptr, "insert-at-cursor", cb)
    }

    fun setOnInsertEmoji(cb: () -> Unit) {
        do_connect(cptr, "insert-emoji", cb)
    }

    fun setOnMoveCursor(cb: () -> Unit) {
        do_connect(cptr, "move-cursor", cb)
    }

    fun setOnMoveViewport(cb: () -> Unit) {
        do_connect(cptr, "move-viewport", cb)
    }

    fun setOnPasteClipboard(cb: () -> Unit) {
        do_connect(cptr, "paste-clipboard", cb)
    }

    fun setOnPopulatePopup(cb: () -> Unit) {
        do_connect(cptr, "populate-popup", cb)
    }

    fun setOnPreeditChanged(cb: () -> Unit) {
        do_connect(cptr, "preedit-changed", cb)
    }

    fun setOnSelectAll(cb: () -> Unit) {
        do_connect(cptr, "select-all", cb)
    }

    fun setOnSetAnchor(cb: () -> Unit) {
        do_connect(cptr, "set-anchor", cb)
    }

    fun setOnToggleCursorVisible(cb: () -> Unit) {
        do_connect(cptr, "toggle-cursor-visible", cb)
    }

    fun setOnToggleOverwrite(cb: () -> Unit) {
        do_connect(cptr, "toggle-overwrite", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31724608UL
        fun cptr(obj: TextView): CPointer<GtkTextView> = obj.cptr
        fun newWithBuffer(buffer: TextBuffer): TextView = TextView(stub<CPointer<GtkTextView>>()) 
    }
}

class TextViewClass(private val cptr: CPointer<cnames.structs._GtkTextViewClass>) /* struct */ {
    companion object {
        fun cptr(obj: TextViewClass): CPointer<cnames.structs._GtkTextViewClass> = obj.cptr
    }
}

typealias TextViewLayer = GtkTextViewLayer

typealias TextWindowType = GtkTextWindowType

class ThemeEngine(private val cptr: CPointer<cnames.structs._GtkThemeEngine>) /* struct */ {
    companion object {
        fun cptr(obj: ThemeEngine): CPointer<cnames.structs._GtkThemeEngine> = obj.cptr
    }
}

open class ThemingEngine internal constructor (private val cptr: CPointer<GtkThemingEngine>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 31616512UL
        fun cptr(obj: ThemingEngine): CPointer<GtkThemingEngine> = obj.cptr
    }
}

class ThemingEngineClass(private val cptr: CPointer<cnames.structs._GtkThemingEngineClass>) /* struct */ {
    companion object {
        fun cptr(obj: ThemingEngineClass): CPointer<cnames.structs._GtkThemingEngineClass> = obj.cptr
    }
}

typealias TickCallback = (widget:  Widget, frame_clock:  com.charlag.kgtk.demo.gdk.FrameClock, user_data:  Any) -> Boolean

class ToggleActionEntry(private val cptr: CPointer<cnames.structs._GtkToggleActionEntry>) /* struct */ {
    companion object {
        fun cptr(obj: ToggleActionEntry): CPointer<cnames.structs._GtkToggleActionEntry> = obj.cptr
    }
}

open class ToggleButton internal constructor (private val cptr: CPointer<GtkToggleButton>) : Button(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkToggleButton>>())

    open fun getActive(): Boolean {
         return stub()
    }
    open fun getInconsistent(): Boolean {
         return stub()
    }
    open fun getMode(): Boolean {
         return stub()
    }
    open fun setActive(is_active: Boolean): Unit {
         return stub()
    }
    open fun setInconsistent(setting: Boolean): Unit {
         return stub()
    }
    open fun setMode(draw_indicator: Boolean): Unit {
         return stub()
    }
    open fun toggled(): Unit {
         return stub()
    }
    fun setOnToggled(cb: () -> Unit) {
        do_connect(cptr, "toggled", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31341152UL
        fun cptr(obj: ToggleButton): CPointer<GtkToggleButton> = obj.cptr
        fun newWithLabel(label: String): ToggleButton = ToggleButton(stub<CPointer<GtkToggleButton>>()) 
        fun newWithMnemonic(label: String): ToggleButton = ToggleButton(stub<CPointer<GtkToggleButton>>()) 
    }
}

class ToggleButtonClass(private val cptr: CPointer<cnames.structs._GtkToggleButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: ToggleButtonClass): CPointer<cnames.structs._GtkToggleButtonClass> = obj.cptr
    }
}

open class ToggleToolButton internal constructor (private val cptr: CPointer<GtkToggleToolButton>) : ToolButton(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkToggleToolButton>>())

    open fun getActive(): Boolean {
         return stub()
    }
    open fun setActive(is_active: Boolean): Unit {
         return stub()
    }
    fun setOnToggled(cb: () -> Unit) {
        do_connect(cptr, "toggled", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32586784UL
        fun cptr(obj: ToggleToolButton): CPointer<GtkToggleToolButton> = obj.cptr
    }
}

class ToggleToolButtonClass(private val cptr: CPointer<cnames.structs._GtkToggleToolButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: ToggleToolButtonClass): CPointer<cnames.structs._GtkToggleToolButtonClass> = obj.cptr
    }
}

open class ToolButton internal constructor (private val cptr: CPointer<GtkToolButton>) : ToolItem(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(icon_widget: Widget, label: String) : this(stub<CPointer<GtkToolButton>>())

    open fun getIconName(): String {
         return stub()
    }
    open fun getIconWidget(): Widget {
         return stub()
    }
    open fun getLabel(): String {
         return stub()
    }
    open fun getLabelWidget(): Widget {
         return stub()
    }
    open fun getUseUnderline(): Boolean {
         return stub()
    }
    open fun setIconName(icon_name: String): Unit {
         return stub()
    }
    open fun setIconWidget(icon_widget: Widget): Unit {
         return stub()
    }
    open fun setLabel(label: String): Unit {
         return stub()
    }
    open fun setLabelWidget(label_widget: Widget): Unit {
         return stub()
    }
    open fun setUseUnderline(use_underline: Boolean): Unit {
         return stub()
    }
    fun setOnClicked(cb: () -> Unit) {
        do_connect(cptr, "clicked", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32723968UL
        fun cptr(obj: ToolButton): CPointer<GtkToolButton> = obj.cptr
    }
}

class ToolButtonClass(private val cptr: CPointer<cnames.structs._GtkToolButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: ToolButtonClass): CPointer<cnames.structs._GtkToolButtonClass> = obj.cptr
    }
}

open class ToolItem internal constructor (private val cptr: CPointer<GtkToolItem>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Activatable, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkToolItem>>())

    open fun getEllipsizeMode(): com.charlag.kgtk.demo.pango.EllipsizeMode {
         return stub()
    }
    open fun getExpand(): Boolean {
         return stub()
    }
    open fun getHomogeneous(): Boolean {
         return stub()
    }
    open fun getIconSize(): Int {
         return stub()
    }
    open fun getIsImportant(): Boolean {
         return stub()
    }
    open fun getOrientation(): Orientation {
         return stub()
    }
    open fun getProxyMenuItem(menu_item_id: String): Widget {
         return stub()
    }
    open fun getReliefStyle(): ReliefStyle {
         return stub()
    }
    open fun getTextAlignment(): Float {
         return stub()
    }
    open fun getTextOrientation(): Orientation {
         return stub()
    }
    open fun getTextSizeGroup(): SizeGroup {
         return stub()
    }
    open fun getToolbarStyle(): ToolbarStyle {
         return stub()
    }
    open fun getUseDragWindow(): Boolean {
         return stub()
    }
    open fun getVisibleHorizontal(): Boolean {
         return stub()
    }
    open fun getVisibleVertical(): Boolean {
         return stub()
    }
    open fun rebuildMenu(): Unit {
         return stub()
    }
    open fun retrieveProxyMenuItem(): Widget {
         return stub()
    }
    open fun setExpand(expand: Boolean): Unit {
         return stub()
    }
    open fun setHomogeneous(homogeneous: Boolean): Unit {
         return stub()
    }
    open fun setIsImportant(is_important: Boolean): Unit {
         return stub()
    }
    open fun setProxyMenuItem(menu_item_id: String, menu_item: Widget): Unit {
         return stub()
    }
    override fun setTooltipMarkup(markup: String): Unit {
         return stub()
    }
    override fun setTooltipText(text: String): Unit {
         return stub()
    }
    open fun setUseDragWindow(use_drag_window: Boolean): Unit {
         return stub()
    }
    open fun setVisibleHorizontal(visible_horizontal: Boolean): Unit {
         return stub()
    }
    open fun setVisibleVertical(visible_vertical: Boolean): Unit {
         return stub()
    }
    open fun toolbarReconfigured(): Unit {
         return stub()
    }
    fun setOnCreateMenuProxy(cb: () -> Unit) {
        do_connect(cptr, "create-menu-proxy", cb)
    }

    fun setOnToolbarReconfigured(cb: () -> Unit) {
        do_connect(cptr, "toolbar-reconfigured", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30763856UL
        fun cptr(obj: ToolItem): CPointer<GtkToolItem> = obj.cptr
    }
}

class ToolItemClass(private val cptr: CPointer<cnames.structs._GtkToolItemClass>) /* struct */ {
    companion object {
        fun cptr(obj: ToolItemClass): CPointer<cnames.structs._GtkToolItemClass> = obj.cptr
    }
}

open class ToolItemGroup internal constructor (private val cptr: CPointer<GtkToolItemGroup>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, ToolShell, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(label: String) : this(stub<CPointer<GtkToolItemGroup>>())

    open fun getCollapsed(): Boolean {
         return stub()
    }
    open fun getDropItem(x: Int, y: Int): ToolItem {
         return stub()
    }
    open fun getEllipsize(): com.charlag.kgtk.demo.pango.EllipsizeMode {
         return stub()
    }
    open fun getHeaderRelief(): ReliefStyle {
         return stub()
    }
    open fun getItemPosition(item: ToolItem): Int {
         return stub()
    }
    open fun getLabel(): String {
         return stub()
    }
    open fun getLabelWidget(): Widget {
         return stub()
    }
    open fun getNItems(): UInt {
         return stub()
    }
    open fun getNthItem(index: UInt): ToolItem {
         return stub()
    }
    open fun insert(item: ToolItem, position: Int): Unit {
         return stub()
    }
    open fun setCollapsed(collapsed: Boolean): Unit {
         return stub()
    }
    open fun setEllipsize(ellipsize: com.charlag.kgtk.demo.pango.EllipsizeMode): Unit {
         return stub()
    }
    open fun setHeaderRelief(style: ReliefStyle): Unit {
         return stub()
    }
    open fun setItemPosition(item: ToolItem, position: Int): Unit {
         return stub()
    }
    open fun setLabel(label: String): Unit {
         return stub()
    }
    open fun setLabelWidget(label_widget: Widget): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33037520UL
        fun cptr(obj: ToolItemGroup): CPointer<GtkToolItemGroup> = obj.cptr
    }
}

class ToolItemGroupClass(private val cptr: CPointer<cnames.structs._GtkToolItemGroupClass>) /* struct */ {
    companion object {
        fun cptr(obj: ToolItemGroupClass): CPointer<cnames.structs._GtkToolItemGroupClass> = obj.cptr
    }
}

open class ToolPalette internal constructor (private val cptr: CPointer<GtkToolPalette>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, Scrollable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkToolPalette>>())

    open fun addDragDest(widget: Widget, flags: DestDefaults, targets: ToolPaletteDragTargets, actions: com.charlag.kgtk.demo.gdk.DragAction): Unit {
         return stub()
    }
    open fun getDragItem(selection: SelectionData): Widget {
         return stub()
    }
    open fun getDropGroup(x: Int, y: Int): ToolItemGroup {
         return stub()
    }
    open fun getDropItem(x: Int, y: Int): ToolItem {
         return stub()
    }
    open fun getExclusive(group: ToolItemGroup): Boolean {
         return stub()
    }
    open fun getExpand(group: ToolItemGroup): Boolean {
         return stub()
    }
    open fun getGroupPosition(group: ToolItemGroup): Int {
         return stub()
    }
    open fun getIconSize(): Int {
         return stub()
    }
    open fun getPaletteStyle(): ToolbarStyle {
         return stub()
    }
    open fun setDragSource(targets: ToolPaletteDragTargets): Unit {
         return stub()
    }
    open fun setExclusive(group: ToolItemGroup, exclusive: Boolean): Unit {
         return stub()
    }
    open fun setExpand(group: ToolItemGroup, expand: Boolean): Unit {
         return stub()
    }
    open fun setGroupPosition(group: ToolItemGroup, position: Int): Unit {
         return stub()
    }
    open fun setIconSize(icon_size: Int): Unit {
         return stub()
    }
    open fun setPaletteStyle(style: ToolbarStyle): Unit {
         return stub()
    }
    open fun unsetIconSize(): Unit {
         return stub()
    }
    open fun unsetStyle(): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31418816UL
        fun cptr(obj: ToolPalette): CPointer<GtkToolPalette> = obj.cptr
        fun getDragTargetGroup(): TargetEntry {
    return stub()
}
        fun getDragTargetItem(): TargetEntry {
    return stub()
}
    }
}

class ToolPaletteClass(private val cptr: CPointer<cnames.structs._GtkToolPaletteClass>) /* struct */ {
    companion object {
        fun cptr(obj: ToolPaletteClass): CPointer<cnames.structs._GtkToolPaletteClass> = obj.cptr
    }
}

typealias ToolPaletteDragTargets = GtkToolPaletteDragTargets

interface ToolShell : InteropWrapper {
    fun getEllipsizeMode(): com.charlag.kgtk.demo.pango.EllipsizeMode = stub("ToolShell default impl")

    fun getIconSize(): GtkIconSize = stub("getIconSize() default impl")

    fun getOrientation(): Orientation = stub("ToolShell default impl")

    fun getReliefStyle(): ReliefStyle = stub("ToolShell default impl")

    fun getStyle(): ToolbarStyle = stub("ToolShell default impl")

    fun getTextAlignment(): Float = stub("ToolShell default impl")

    fun getTextOrientation(): Orientation = stub("ToolShell default impl")

    fun getTextSizeGroup(): SizeGroup = stub("ToolShell default impl")

    fun rebuildMenu(): Unit = stub("ToolShell default impl")

    companion object {
        fun cptr(obj: ToolShell): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkToolShell>) : ToolShell {
        override val rawPtr: COpaquePointer = cptr
    }
}

class ToolShellIface(private val cptr: CPointer<cnames.structs._GtkToolShellIface>) /* struct */ {
    companion object {
        fun cptr(obj: ToolShellIface): CPointer<cnames.structs._GtkToolShellIface> = obj.cptr
    }
}

open class Toolbar internal constructor (private val cptr: CPointer<GtkToolbar>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, ToolShell, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkToolbar>>())

    open fun getDropIndex(x: Int, y: Int): Int {
         return stub()
    }
    override fun getIconSize(): IconSize {
         return stub()
    }
    open fun getItemIndex(item: ToolItem): Int {
         return stub()
    }
    open fun getNItems(): Int {
         return stub()
    }
    open fun getNthItem(n: Int): ToolItem {
         return stub()
    }
    override fun getReliefStyle(): ReliefStyle {
         return stub()
    }
    open fun getShowArrow(): Boolean {
         return stub()
    }
    open fun getToolbarStyle(): ToolbarStyle {
         return stub()
    }
    open fun insert(item: ToolItem, pos: Int): Unit {
         return stub()
    }
    open fun setDropHighlightItem(tool_item: ToolItem, index_: Int): Unit {
         return stub()
    }
    open fun setIconSize(icon_size: IconSize): Unit {
         return stub()
    }
    open fun setShowArrow(show_arrow: Boolean): Unit {
         return stub()
    }
    open fun setToolbarStyle(style: ToolbarStyle): Unit {
         return stub()
    }
    open fun unsetIconSize(): Unit {
         return stub()
    }
    open fun unsetStyle(): Unit {
         return stub()
    }
    override fun getOrientation(): Orientation = stub("Needs manual resolution because of multiple interfaces")
    fun setOnFocusHomeOrEnd(cb: () -> Unit) {
        do_connect(cptr, "focus-home-or-end", cb)
    }

    fun setOnOrientationChanged(cb: () -> Unit) {
        do_connect(cptr, "orientation-changed", cb)
    }

    fun setOnPopupContextMenu(cb: () -> Unit) {
        do_connect(cptr, "popup-context-menu", cb)
    }

    fun setOnStyleChanged(cb: () -> Unit) {
        do_connect(cptr, "style-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31067616UL
        fun cptr(obj: Toolbar): CPointer<GtkToolbar> = obj.cptr
    }
}

class ToolbarClass(private val cptr: CPointer<cnames.structs._GtkToolbarClass>) /* struct */ {
    companion object {
        fun cptr(obj: ToolbarClass): CPointer<cnames.structs._GtkToolbarClass> = obj.cptr
    }
}

typealias ToolbarSpaceStyle = GtkToolbarSpaceStyle

typealias ToolbarStyle = GtkToolbarStyle

open class Tooltip internal constructor (private val cptr: CPointer<GtkTooltip>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun setCustom(custom_widget: Widget): Unit {
         return stub()
    }
    open fun setIcon(pixbuf: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): Unit {
         return stub()
    }
    open fun setIconFromGicon(gicon: com.charlag.kgtk.demo.gio.Icon, size: Int): Unit {
         return stub()
    }
    open fun setIconFromIconName(icon_name: String, size: Int): Unit {
         return stub()
    }
    open fun setMarkup(markup: String): Unit {
         return stub()
    }
    open fun setText(text: String): Unit {
         return stub()
    }
    open fun setTipArea(rect: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31182848UL
        fun cptr(obj: Tooltip): CPointer<GtkTooltip> = obj.cptr
        fun triggerTooltipQuery(display: com.charlag.kgtk.demo.gdk.Display): Unit {
    return stub()
}
    }
}

typealias TranslateFunc = (path:  String, func_data:  Any) -> String

typealias TreeCellDataFunc = (tree_column:  TreeViewColumn, cell:  CellRenderer, tree_model:  TreeModel, iter:  TreeIter, data:  Any) -> Unit

typealias TreeDestroyCountFunc = (tree_view:  TreeView, path:  TreePath, children:  Int, user_data:  Any) -> Unit

interface TreeDragDest : InteropWrapper {
    fun dragDataReceived(dest: TreePath, selection_data: SelectionData): Boolean = stub("TreeDragDest default impl")

    fun rowDropPossible(dest_path: TreePath, selection_data: SelectionData): Boolean = stub("TreeDragDest default impl")

    companion object {
        fun cptr(obj: TreeDragDest): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkTreeDragDest>) : TreeDragDest {
        override val rawPtr: COpaquePointer = cptr
    }
}

class TreeDragDestIface(private val cptr: CPointer<cnames.structs._GtkTreeDragDestIface>) /* struct */ {
    companion object {
        fun cptr(obj: TreeDragDestIface): CPointer<cnames.structs._GtkTreeDragDestIface> = obj.cptr
    }
}

interface TreeDragSource : InteropWrapper {
    fun dragDataDelete(path: TreePath): Boolean = stub("TreeDragSource default impl")

    fun dragDataGet(path: TreePath, selection_data: SelectionData): Boolean = stub("TreeDragSource default impl")

    fun rowDraggable(path: TreePath): Boolean = stub("TreeDragSource default impl")

    companion object {
        fun cptr(obj: TreeDragSource): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkTreeDragSource>) : TreeDragSource {
        override val rawPtr: COpaquePointer = cptr
    }
}

class TreeDragSourceIface(private val cptr: CPointer<cnames.structs._GtkTreeDragSourceIface>) /* struct */ {
    companion object {
        fun cptr(obj: TreeDragSourceIface): CPointer<cnames.structs._GtkTreeDragSourceIface> = obj.cptr
    }
}

class TreeIter(private val cptr: CPointer<cnames.structs._GtkTreeIter>) /* struct */ {
    fun copy(): TreeIter {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: TreeIter): CPointer<cnames.structs._GtkTreeIter> = obj.cptr
    }
}

typealias TreeIterCompareFunc = (model:  TreeModel, a:  TreeIter, b:  TreeIter, user_data:  Any) -> Int

interface TreeModel : InteropWrapper {
    fun filterNew(root: TreePath): TreeModel = stub("TreeModel default impl")

    fun foreach(func: TreeModelForeachFunc, user_data: Any): Unit = stub("TreeModel default impl")

    fun getColumnType(index_: Int): GType = stub("TreeModel default impl")

    fun getFlags(): TreeModelFlags = stub("TreeModel default impl")

    fun getIter(iter: TreeIter, path: TreePath): Boolean = stub("TreeModel default impl")

    fun getIterFirst(iter: TreeIter): Boolean = stub("TreeModel default impl")

    fun getIterFromString(iter: TreeIter, path_string: String): Boolean = stub("TreeModel default impl")

    fun getNColumns(): Int = stub("TreeModel default impl")

    fun getPath(iter: TreeIter): TreePath = stub("TreeModel default impl")

    fun getStringFromIter(iter: TreeIter): String = stub("TreeModel default impl")

    fun getValue(iter: TreeIter, column: Int, value: com.charlag.kgtk.demo.gobject.Value): Unit = stub("TreeModel default impl")

    fun iterChildren(iter: TreeIter, parent: TreeIter): Boolean = stub("TreeModel default impl")

    fun iterHasChild(iter: TreeIter): Boolean = stub("TreeModel default impl")

    fun iterNChildren(iter: TreeIter): Int = stub("TreeModel default impl")

    fun iterNext(iter: TreeIter): Boolean = stub("TreeModel default impl")

    fun iterNthChild(iter: TreeIter, parent: TreeIter, n: Int): Boolean = stub("TreeModel default impl")

    fun iterParent(iter: TreeIter, child: TreeIter): Boolean = stub("TreeModel default impl")

    fun iterPrevious(iter: TreeIter): Boolean = stub("TreeModel default impl")

    fun refNode(iter: TreeIter): Unit = stub("TreeModel default impl")

    fun rowChanged(path: TreePath, iter: TreeIter): Unit = stub("TreeModel default impl")

    fun rowDeleted(path: TreePath): Unit = stub("TreeModel default impl")

    fun rowHasChildToggled(path: TreePath, iter: TreeIter): Unit = stub("TreeModel default impl")

    fun rowInserted(path: TreePath, iter: TreeIter): Unit = stub("TreeModel default impl")

    fun rowsReordered(path: TreePath, iter: TreeIter, new_order: List<Int>, length: Int): Unit = stub("TreeModel default impl")

    fun unrefNode(iter: TreeIter): Unit = stub("TreeModel default impl")

    companion object {
        fun cptr(obj: TreeModel): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkTreeModel>) : TreeModel {
        override val rawPtr: COpaquePointer = cptr
    }
}

open class TreeModelFilter internal constructor (private val cptr: CPointer<GtkTreeModelFilter>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), TreeDragSource, TreeModel, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun clearCache(): Unit {
         return stub()
    }
    open fun convertChildIterToIter(filter_iter: TreeIter, child_iter: TreeIter): Boolean {
         return stub()
    }
    open fun convertChildPathToPath(child_path: TreePath): TreePath {
         return stub()
    }
    open fun convertIterToChildIter(child_iter: TreeIter, filter_iter: TreeIter): Unit {
         return stub()
    }
    open fun convertPathToChildPath(filter_path: TreePath): TreePath {
         return stub()
    }
    open fun getModel(): TreeModel {
         return stub()
    }
    open fun refilter(): Unit {
         return stub()
    }
    open fun setModifyFunc(n_columns: Int, types: List<GType>, func: TreeModelFilterModifyFunc, data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setVisibleColumn(column: Int): Unit {
         return stub()
    }
    open fun setVisibleFunc(func: TreeModelFilterVisibleFunc, data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33165136UL
        fun cptr(obj: TreeModelFilter): CPointer<GtkTreeModelFilter> = obj.cptr
    }
}

class TreeModelFilterClass(private val cptr: CPointer<cnames.structs._GtkTreeModelFilterClass>) /* struct */ {
    companion object {
        fun cptr(obj: TreeModelFilterClass): CPointer<cnames.structs._GtkTreeModelFilterClass> = obj.cptr
    }
}

typealias TreeModelFilterModifyFunc = (model:  TreeModel, iter:  TreeIter, value:  com.charlag.kgtk.demo.gobject.Value, column:  Int, data:  Any) -> Unit

typealias TreeModelFilterVisibleFunc = (model:  TreeModel, iter:  TreeIter, data:  Any) -> Boolean

typealias TreeModelFlags = GtkTreeModelFlags

typealias TreeModelForeachFunc = (model:  TreeModel, path:  TreePath, iter:  TreeIter, data:  Any) -> Boolean

class TreeModelIface(private val cptr: CPointer<cnames.structs._GtkTreeModelIface>) /* struct */ {
    companion object {
        fun cptr(obj: TreeModelIface): CPointer<cnames.structs._GtkTreeModelIface> = obj.cptr
    }
}

open class TreeModelSort internal constructor (private val cptr: CPointer<GtkTreeModelSort>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), TreeDragSource, TreeModel, TreeSortable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun clearCache(): Unit {
         return stub()
    }
    open fun convertChildIterToIter(sort_iter: TreeIter, child_iter: TreeIter): Boolean {
         return stub()
    }
    open fun convertChildPathToPath(child_path: TreePath): TreePath {
         return stub()
    }
    open fun convertIterToChildIter(child_iter: TreeIter, sorted_iter: TreeIter): Unit {
         return stub()
    }
    open fun convertPathToChildPath(sorted_path: TreePath): TreePath {
         return stub()
    }
    open fun getModel(): TreeModel {
         return stub()
    }
    open fun iterIsValid(iter: TreeIter): Boolean {
         return stub()
    }
    open fun resetDefaultSortFunc(): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32676128UL
        fun cptr(obj: TreeModelSort): CPointer<GtkTreeModelSort> = obj.cptr
        fun newWithModel(child_model: TreeModel): TreeModelSort = TreeModelSort(stub<CPointer<GtkTreeModelSort>>()) 
    }
}

class TreeModelSortClass(private val cptr: CPointer<cnames.structs._GtkTreeModelSortClass>) /* struct */ {
    companion object {
        fun cptr(obj: TreeModelSortClass): CPointer<cnames.structs._GtkTreeModelSortClass> = obj.cptr
    }
}

class TreePath(private val cptr: CPointer<cnames.structs._GtkTreePath>) /* struct */ {
    fun new(): TreePath {
         return stub()
    }
    fun newFirst(): TreePath {
         return stub()
    }
    fun newFromIndices(indices: List<Int>, length: ULong): TreePath {
         return stub()
    }
    fun newFromString(path: String): TreePath {
         return stub()
    }
    fun appendIndex(index_: Int): Unit {
         return stub()
    }
    fun compare(b: TreePath): Int {
         return stub()
    }
    fun copy(): TreePath {
         return stub()
    }
    fun down(): Unit {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getDepth(): Int {
         return stub()
    }
    fun getIndices(depth: Int): List<Int> {
         return stub()
    }
    fun isAncestor(descendant: TreePath): Boolean {
         return stub()
    }
    fun isDescendant(ancestor: TreePath): Boolean {
         return stub()
    }
    fun next(): Unit {
         return stub()
    }
    fun prependIndex(index_: Int): Unit {
         return stub()
    }
    fun prev(): Boolean {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    fun up(): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: TreePath): CPointer<cnames.structs._GtkTreePath> = obj.cptr
    }
}

class TreeRowReference(private val cptr: CPointer<cnames.structs._GtkTreeRowReference>) /* struct */ {
    fun new(model: TreeModel, path: TreePath): TreeRowReference {
         return stub()
    }
    fun newProxy(proxy: com.charlag.kgtk.demo.gobject.Object, model: TreeModel, path: TreePath): TreeRowReference {
         return stub()
    }
    fun copy(): TreeRowReference {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getModel(): TreeModel {
         return stub()
    }
    fun getPath(): TreePath {
         return stub()
    }
    fun valid(): Boolean {
         return stub()
    }
    fun deleted(proxy: com.charlag.kgtk.demo.gobject.Object, path: TreePath): Unit {
         return stub()
    }
    fun inserted(proxy: com.charlag.kgtk.demo.gobject.Object, path: TreePath): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: TreeRowReference): CPointer<cnames.structs._GtkTreeRowReference> = obj.cptr
    }
}

open class TreeSelection internal constructor (private val cptr: CPointer<GtkTreeSelection>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun countSelectedRows(): Int {
         return stub()
    }
    open fun getMode(): SelectionMode {
         return stub()
    }
    open fun getSelected(model: TreeModel, iter: TreeIter): Boolean {
         return stub()
    }
    open fun getSelectedRows(model: TreeModel): List<TreePath> {
         return stub()
    }
    open fun getTreeView(): TreeView {
         return stub()
    }
    open fun iterIsSelected(iter: TreeIter): Boolean {
         return stub()
    }
    open fun pathIsSelected(path: TreePath): Boolean {
         return stub()
    }
    open fun selectAll(): Unit {
         return stub()
    }
    open fun selectIter(iter: TreeIter): Unit {
         return stub()
    }
    open fun selectPath(path: TreePath): Unit {
         return stub()
    }
    open fun selectRange(start_path: TreePath, end_path: TreePath): Unit {
         return stub()
    }
    open fun selectedForeach(func: TreeSelectionForeachFunc, data: Any): Unit {
         return stub()
    }
    open fun setMode(type: SelectionMode): Unit {
         return stub()
    }
    open fun setSelectFunction(func: TreeSelectionFunc, data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun unselectAll(): Unit {
         return stub()
    }
    open fun unselectIter(iter: TreeIter): Unit {
         return stub()
    }
    open fun unselectPath(path: TreePath): Unit {
         return stub()
    }
    open fun unselectRange(start_path: TreePath, end_path: TreePath): Unit {
         return stub()
    }
    fun setOnChanged(cb: () -> Unit) {
        do_connect(cptr, "changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30769856UL
        fun cptr(obj: TreeSelection): CPointer<GtkTreeSelection> = obj.cptr
    }
}

class TreeSelectionClass(private val cptr: CPointer<cnames.structs._GtkTreeSelectionClass>) /* struct */ {
    companion object {
        fun cptr(obj: TreeSelectionClass): CPointer<cnames.structs._GtkTreeSelectionClass> = obj.cptr
    }
}

typealias TreeSelectionForeachFunc = (model:  TreeModel, path:  TreePath, iter:  TreeIter, data:  Any) -> Unit

typealias TreeSelectionFunc = (selection:  TreeSelection, model:  TreeModel, path:  TreePath, path_currently_selected:  Boolean, data:  Any) -> Boolean

interface TreeSortable : TreeModel, InteropWrapper {
    fun getSortColumnId(sort_column_id: Int, order: SortType): Boolean = stub("TreeSortable default impl")

    fun hasDefaultSortFunc(): Boolean = stub("TreeSortable default impl")

    fun setDefaultSortFunc(sort_func: TreeIterCompareFunc, user_data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit = stub("TreeSortable default impl")

    fun setSortColumnId(sort_column_id: Int, order: SortType): Unit = stub("TreeSortable default impl")

    fun setSortFunc(sort_column_id: Int, sort_func: TreeIterCompareFunc, user_data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit = stub("TreeSortable default impl")

    fun sortColumnChanged(): Unit = stub("TreeSortable default impl")

    companion object {
        fun cptr(obj: TreeSortable): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GtkTreeSortable>) : TreeSortable {
        override val rawPtr: COpaquePointer = cptr
    }
}

class TreeSortableIface(private val cptr: CPointer<cnames.structs._GtkTreeSortableIface>) /* struct */ {
    companion object {
        fun cptr(obj: TreeSortableIface): CPointer<cnames.structs._GtkTreeSortableIface> = obj.cptr
    }
}

open class TreeStore internal constructor (private val cptr: CPointer<GtkTreeStore>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Buildable, TreeDragDest, TreeDragSource, TreeModel, TreeSortable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(n_columns: Int, types: List<GType>) : this(stub<CPointer<GtkTreeStore>>())

    open fun append(iter: TreeIter, parent: TreeIter): Unit {
         return stub()
    }
    open fun clear(): Unit {
         return stub()
    }
    open fun insert(iter: TreeIter, parent: TreeIter, position: Int): Unit {
         return stub()
    }
    open fun insertAfter(iter: TreeIter, parent: TreeIter, sibling: TreeIter): Unit {
         return stub()
    }
    open fun insertBefore(iter: TreeIter, parent: TreeIter, sibling: TreeIter): Unit {
         return stub()
    }
    open fun insertWithValues(iter: TreeIter, parent: TreeIter, position: Int, columns: List<Int>, values: List<com.charlag.kgtk.demo.gobject.Value>, n_values: Int): Unit {
         return stub()
    }
    open fun isAncestor(iter: TreeIter, descendant: TreeIter): Boolean {
         return stub()
    }
    open fun iterDepth(iter: TreeIter): Int {
         return stub()
    }
    open fun iterIsValid(iter: TreeIter): Boolean {
         return stub()
    }
    open fun moveAfter(iter: TreeIter, position: TreeIter): Unit {
         return stub()
    }
    open fun moveBefore(iter: TreeIter, position: TreeIter): Unit {
         return stub()
    }
    open fun prepend(iter: TreeIter, parent: TreeIter): Unit {
         return stub()
    }
    open fun remove(iter: TreeIter): Boolean {
         return stub()
    }
    open fun setColumnTypes(n_columns: Int, types: List<GType>): Unit {
         return stub()
    }
    open fun setValue(iter: TreeIter, column: Int, value: com.charlag.kgtk.demo.gobject.Value): Unit {
         return stub()
    }
    open fun set(iter: TreeIter, columns: List<Int>, values: List<com.charlag.kgtk.demo.gobject.Value>, n_values: Int): Unit {
         return stub()
    }
    open fun swap(a: TreeIter, b: TreeIter): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 36948896UL
        fun cptr(obj: TreeStore): CPointer<GtkTreeStore> = obj.cptr
    }
}

class TreeStoreClass(private val cptr: CPointer<cnames.structs._GtkTreeStoreClass>) /* struct */ {
    companion object {
        fun cptr(obj: TreeStoreClass): CPointer<cnames.structs._GtkTreeStoreClass> = obj.cptr
    }
}

open class TreeView internal constructor (private val cptr: CPointer<GtkTreeView>) : Container(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Scrollable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkTreeView>>())

    open fun appendColumn(column: TreeViewColumn): Int {
         return stub()
    }
    open fun collapseAll(): Unit {
         return stub()
    }
    open fun collapseRow(path: TreePath): Boolean {
         return stub()
    }
    open fun columnsAutosize(): Unit {
         return stub()
    }
    open fun convertBinWindowToTreeCoords(bx: Int, by: Int, tx: Int, ty: Int): Unit {
         return stub()
    }
    open fun convertBinWindowToWidgetCoords(bx: Int, by: Int, wx: Int, wy: Int): Unit {
         return stub()
    }
    open fun convertTreeToBinWindowCoords(tx: Int, ty: Int, bx: Int, by: Int): Unit {
         return stub()
    }
    open fun convertTreeToWidgetCoords(tx: Int, ty: Int, wx: Int, wy: Int): Unit {
         return stub()
    }
    open fun convertWidgetToBinWindowCoords(wx: Int, wy: Int, bx: Int, by: Int): Unit {
         return stub()
    }
    open fun convertWidgetToTreeCoords(wx: Int, wy: Int, tx: Int, ty: Int): Unit {
         return stub()
    }
    open fun createRowDragIcon(path: TreePath): com.charlag.kgtk.demo.cairo.Surface {
         return stub()
    }
    open fun enableModelDragDest(targets: List<TargetEntry>, n_targets: Int, actions: com.charlag.kgtk.demo.gdk.DragAction): Unit {
         return stub()
    }
    open fun enableModelDragSource(start_button_mask: com.charlag.kgtk.demo.gdk.ModifierType, targets: List<TargetEntry>, n_targets: Int, actions: com.charlag.kgtk.demo.gdk.DragAction): Unit {
         return stub()
    }
    open fun expandAll(): Unit {
         return stub()
    }
    open fun expandRow(path: TreePath, open_all: Boolean): Boolean {
         return stub()
    }
    open fun expandToPath(path: TreePath): Unit {
         return stub()
    }
    open fun getActivateOnSingleClick(): Boolean {
         return stub()
    }
    open fun getBackgroundArea(path: TreePath, column: TreeViewColumn, rect: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun getBinWindow(): com.charlag.kgtk.demo.gdk.Window {
         return stub()
    }
    open fun getCellArea(path: TreePath, column: TreeViewColumn, rect: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun getColumn(n: Int): TreeViewColumn {
         return stub()
    }
    open fun getColumns(): List<TreeViewColumn> {
         return stub()
    }
    open fun getCursor(path: TreePath, focus_column: TreeViewColumn): Unit {
         return stub()
    }
    open fun getDestRowAtPos(drag_x: Int, drag_y: Int, path: TreePath, pos: TreeViewDropPosition): Boolean {
         return stub()
    }
    open fun getDragDestRow(path: TreePath, pos: TreeViewDropPosition): Unit {
         return stub()
    }
    open fun getEnableSearch(): Boolean {
         return stub()
    }
    open fun getEnableTreeLines(): Boolean {
         return stub()
    }
    open fun getExpanderColumn(): TreeViewColumn {
         return stub()
    }
    open fun getFixedHeightMode(): Boolean {
         return stub()
    }
    open fun getGridLines(): TreeViewGridLines {
         return stub()
    }
    open fun getHeadersClickable(): Boolean {
         return stub()
    }
    open fun getHeadersVisible(): Boolean {
         return stub()
    }
    open fun getHoverExpand(): Boolean {
         return stub()
    }
    open fun getHoverSelection(): Boolean {
         return stub()
    }
    open fun getLevelIndentation(): Int {
         return stub()
    }
    open fun getModel(): TreeModel {
         return stub()
    }
    open fun getNColumns(): UInt {
         return stub()
    }
    open fun getPathAtPos(x: Int, y: Int, path: TreePath, column: TreeViewColumn, cell_x: Int, cell_y: Int): Boolean {
         return stub()
    }
    open fun getReorderable(): Boolean {
         return stub()
    }
    open fun getRubberBanding(): Boolean {
         return stub()
    }
    open fun getSearchColumn(): Int {
         return stub()
    }
    open fun getSearchEntry(): Entry {
         return stub()
    }
    open fun getSelection(): TreeSelection {
         return stub()
    }
    open fun getShowExpanders(): Boolean {
         return stub()
    }
    open fun getTooltipColumn(): Int {
         return stub()
    }
    open fun getTooltipContext(x: Int, y: Int, keyboard_tip: Boolean, model: TreeModel, path: TreePath, iter: TreeIter): Boolean {
         return stub()
    }
    open fun getVisibleRange(start_path: TreePath, end_path: TreePath): Boolean {
         return stub()
    }
    open fun getVisibleRect(visible_rect: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return stub()
    }
    open fun insertColumn(column: TreeViewColumn, position: Int): Int {
         return stub()
    }
    open fun insertColumnWithDataFunc(position: Int, title: String, cell: CellRenderer, func: TreeCellDataFunc, data: Any, dnotify: com.charlag.kgtk.demo.glib.DestroyNotify): Int {
         return stub()
    }
    open fun isBlankAtPos(x: Int, y: Int, path: TreePath, column: TreeViewColumn, cell_x: Int, cell_y: Int): Boolean {
         return stub()
    }
    open fun isRubberBandingActive(): Boolean {
         return stub()
    }
    open fun mapExpandedRows(func: TreeViewMappingFunc, data: Any): Unit {
         return stub()
    }
    open fun moveColumnAfter(column: TreeViewColumn, base_column: TreeViewColumn): Unit {
         return stub()
    }
    open fun removeColumn(column: TreeViewColumn): Int {
         return stub()
    }
    open fun rowActivated(path: TreePath, column: TreeViewColumn): Unit {
         return stub()
    }
    open fun rowExpanded(path: TreePath): Boolean {
         return stub()
    }
    open fun scrollToCell(path: TreePath, column: TreeViewColumn, use_align: Boolean, row_align: Float, col_align: Float): Unit {
         return stub()
    }
    open fun scrollToPoint(tree_x: Int, tree_y: Int): Unit {
         return stub()
    }
    open fun setActivateOnSingleClick(single: Boolean): Unit {
         return stub()
    }
    open fun setColumnDragFunction(func: TreeViewColumnDropFunc, user_data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setCursor(path: TreePath, focus_column: TreeViewColumn, start_editing: Boolean): Unit {
         return stub()
    }
    open fun setCursorOnCell(path: TreePath, focus_column: TreeViewColumn, focus_cell: CellRenderer, start_editing: Boolean): Unit {
         return stub()
    }
    open fun setDragDestRow(path: TreePath, pos: TreeViewDropPosition): Unit {
         return stub()
    }
    open fun setEnableSearch(enable_search: Boolean): Unit {
         return stub()
    }
    open fun setEnableTreeLines(enabled: Boolean): Unit {
         return stub()
    }
    open fun setExpanderColumn(column: TreeViewColumn): Unit {
         return stub()
    }
    open fun setFixedHeightMode(enable: Boolean): Unit {
         return stub()
    }
    open fun setGridLines(grid_lines: TreeViewGridLines): Unit {
         return stub()
    }
    open fun setHeadersClickable(setting: Boolean): Unit {
         return stub()
    }
    open fun setHeadersVisible(headers_visible: Boolean): Unit {
         return stub()
    }
    open fun setHoverExpand(expand: Boolean): Unit {
         return stub()
    }
    open fun setHoverSelection(hover: Boolean): Unit {
         return stub()
    }
    open fun setLevelIndentation(indentation: Int): Unit {
         return stub()
    }
    open fun setModel(model: TreeModel): Unit {
         return stub()
    }
    open fun setReorderable(reorderable: Boolean): Unit {
         return stub()
    }
    open fun setRowSeparatorFunc(func: TreeViewRowSeparatorFunc, data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setRubberBanding(enable: Boolean): Unit {
         return stub()
    }
    open fun setSearchColumn(column: Int): Unit {
         return stub()
    }
    open fun setSearchEntry(entry: Entry): Unit {
         return stub()
    }
    open fun setSearchEqualFunc(search_equal_func: TreeViewSearchEqualFunc, search_user_data: Any, search_destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setSearchPositionFunc(func: TreeViewSearchPositionFunc, data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setShowExpanders(enabled: Boolean): Unit {
         return stub()
    }
    open fun setTooltipCell(tooltip: Tooltip, path: TreePath, column: TreeViewColumn, cell: CellRenderer): Unit {
         return stub()
    }
    open fun setTooltipColumn(column: Int): Unit {
         return stub()
    }
    open fun setTooltipRow(tooltip: Tooltip, path: TreePath): Unit {
         return stub()
    }
    open fun unsetRowsDragDest(): Unit {
         return stub()
    }
    open fun unsetRowsDragSource(): Unit {
         return stub()
    }
    fun setOnColumnsChanged(cb: () -> Unit) {
        do_connect(cptr, "columns-changed", cb)
    }

    fun setOnCursorChanged(cb: () -> Unit) {
        do_connect(cptr, "cursor-changed", cb)
    }

    fun setOnExpandCollapseCursorRow(cb: () -> Unit) {
        do_connect(cptr, "expand-collapse-cursor-row", cb)
    }

    fun setOnMoveCursor(cb: () -> Unit) {
        do_connect(cptr, "move-cursor", cb)
    }

    fun setOnRowActivated(cb: () -> Unit) {
        do_connect(cptr, "row-activated", cb)
    }

    fun setOnRowCollapsed(cb: () -> Unit) {
        do_connect(cptr, "row-collapsed", cb)
    }

    fun setOnRowExpanded(cb: () -> Unit) {
        do_connect(cptr, "row-expanded", cb)
    }

    fun setOnSelectAll(cb: () -> Unit) {
        do_connect(cptr, "select-all", cb)
    }

    fun setOnSelectCursorParent(cb: () -> Unit) {
        do_connect(cptr, "select-cursor-parent", cb)
    }

    fun setOnSelectCursorRow(cb: () -> Unit) {
        do_connect(cptr, "select-cursor-row", cb)
    }

    fun setOnStartInteractiveSearch(cb: () -> Unit) {
        do_connect(cptr, "start-interactive-search", cb)
    }

    fun setOnTestCollapseRow(cb: () -> Unit) {
        do_connect(cptr, "test-collapse-row", cb)
    }

    fun setOnTestExpandRow(cb: () -> Unit) {
        do_connect(cptr, "test-expand-row", cb)
    }

    fun setOnToggleCursorRow(cb: () -> Unit) {
        do_connect(cptr, "toggle-cursor-row", cb)
    }

    fun setOnUnselectAll(cb: () -> Unit) {
        do_connect(cptr, "unselect-all", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 33318048UL
        fun cptr(obj: TreeView): CPointer<GtkTreeView> = obj.cptr
        fun newWithModel(model: TreeModel): TreeView = TreeView(stub<CPointer<GtkTreeView>>()) 
    }
}

class TreeViewClass(private val cptr: CPointer<cnames.structs._GtkTreeViewClass>) /* struct */ {
    companion object {
        fun cptr(obj: TreeViewClass): CPointer<cnames.structs._GtkTreeViewClass> = obj.cptr
    }
}

open class TreeViewColumn internal constructor (private val cptr: CPointer<GtkTreeViewColumn>) : com.charlag.kgtk.demo.gobject.InitiallyUnowned(cptr.reinterpret()), Buildable, CellLayout, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkTreeViewColumn>>())

    override fun addAttribute(cell_renderer: CellRenderer, attribute: String, column: Int): Unit {
         return stub()
    }
    open fun cellGetPosition(cell_renderer: CellRenderer, x_offset: Int, width: Int): Boolean {
         return stub()
    }
    open fun cellGetSize(cell_area: com.charlag.kgtk.demo.gdk.Rectangle, x_offset: Int, y_offset: Int, width: Int, height: Int): Unit {
         return stub()
    }
    open fun cellIsVisible(): Boolean {
         return stub()
    }
    open fun cellSetCellData(tree_model: TreeModel, iter: TreeIter, is_expander: Boolean, is_expanded: Boolean): Unit {
         return stub()
    }
    override fun clear(): Unit {
         return stub()
    }
    override fun clearAttributes(cell_renderer: CellRenderer): Unit {
         return stub()
    }
    open fun clicked(): Unit {
         return stub()
    }
    open fun focusCell(cell: CellRenderer): Unit {
         return stub()
    }
    open fun getAlignment(): Float {
         return stub()
    }
    open fun getButton(): Widget {
         return stub()
    }
    open fun getClickable(): Boolean {
         return stub()
    }
    open fun getExpand(): Boolean {
         return stub()
    }
    open fun getFixedWidth(): Int {
         return stub()
    }
    open fun getMaxWidth(): Int {
         return stub()
    }
    open fun getMinWidth(): Int {
         return stub()
    }
    open fun getReorderable(): Boolean {
         return stub()
    }
    open fun getResizable(): Boolean {
         return stub()
    }
    open fun getSizing(): TreeViewColumnSizing {
         return stub()
    }
    open fun getSortColumnId(): Int {
         return stub()
    }
    open fun getSortIndicator(): Boolean {
         return stub()
    }
    open fun getSortOrder(): SortType {
         return stub()
    }
    open fun getSpacing(): Int {
         return stub()
    }
    open fun getTitle(): String {
         return stub()
    }
    open fun getTreeView(): Widget {
         return stub()
    }
    open fun getVisible(): Boolean {
         return stub()
    }
    open fun getWidget(): Widget {
         return stub()
    }
    open fun getWidth(): Int {
         return stub()
    }
    open fun getXOffset(): Int {
         return stub()
    }
    override fun packEnd(cell: CellRenderer, expand: Boolean): Unit {
         return stub()
    }
    override fun packStart(cell: CellRenderer, expand: Boolean): Unit {
         return stub()
    }
    open fun queueResize(): Unit {
         return stub()
    }
    open fun setAlignment(xalign: Float): Unit {
         return stub()
    }
    open fun setCellDataFunc(cell_renderer: CellRenderer, func: TreeCellDataFunc, func_data: Any, destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    open fun setClickable(clickable: Boolean): Unit {
         return stub()
    }
    open fun setExpand(expand: Boolean): Unit {
         return stub()
    }
    open fun setFixedWidth(fixed_width: Int): Unit {
         return stub()
    }
    open fun setMaxWidth(max_width: Int): Unit {
         return stub()
    }
    open fun setMinWidth(min_width: Int): Unit {
         return stub()
    }
    open fun setReorderable(reorderable: Boolean): Unit {
         return stub()
    }
    open fun setResizable(resizable: Boolean): Unit {
         return stub()
    }
    open fun setSizing(type: TreeViewColumnSizing): Unit {
         return stub()
    }
    open fun setSortColumnId(sort_column_id: Int): Unit {
         return stub()
    }
    open fun setSortIndicator(setting: Boolean): Unit {
         return stub()
    }
    open fun setSortOrder(order: SortType): Unit {
         return stub()
    }
    open fun setSpacing(spacing: Int): Unit {
         return stub()
    }
    open fun setTitle(title: String): Unit {
         return stub()
    }
    open fun setVisible(visible: Boolean): Unit {
         return stub()
    }
    open fun setWidget(widget: Widget): Unit {
         return stub()
    }
    fun setOnClicked(cb: () -> Unit) {
        do_connect(cptr, "clicked", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 32418272UL
        fun cptr(obj: TreeViewColumn): CPointer<GtkTreeViewColumn> = obj.cptr
        fun newWithArea(area: CellArea): TreeViewColumn = TreeViewColumn(stub<CPointer<GtkTreeViewColumn>>()) 
    }
}

class TreeViewColumnClass(private val cptr: CPointer<cnames.structs._GtkTreeViewColumnClass>) /* struct */ {
    companion object {
        fun cptr(obj: TreeViewColumnClass): CPointer<cnames.structs._GtkTreeViewColumnClass> = obj.cptr
    }
}

typealias TreeViewColumnDropFunc = (tree_view:  TreeView, column:  TreeViewColumn, prev_column:  TreeViewColumn, next_column:  TreeViewColumn, data:  Any) -> Boolean

typealias TreeViewColumnSizing = GtkTreeViewColumnSizing

typealias TreeViewDropPosition = GtkTreeViewDropPosition

typealias TreeViewGridLines = GtkTreeViewGridLines

typealias TreeViewMappingFunc = (tree_view:  TreeView, path:  TreePath, user_data:  Any) -> Unit

typealias TreeViewRowSeparatorFunc = (model:  TreeModel, iter:  TreeIter, data:  Any) -> Boolean

typealias TreeViewSearchEqualFunc = (model:  TreeModel, column:  Int, key:  String, iter:  TreeIter, search_data:  Any) -> Boolean

typealias TreeViewSearchPositionFunc = (tree_view:  TreeView, search_dialog:  Widget, user_data:  Any) -> Unit

typealias UIManagerItemType = GtkUIManagerItemType

open class VBox internal constructor (private val cptr: CPointer<GtkVBox>) : Box(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 32342304UL
        fun cptr(obj: VBox): CPointer<GtkVBox> = obj.cptr
    }
}

class VBoxClass(private val cptr: CPointer<cnames.structs._GtkVBoxClass>) /* struct */ {
    companion object {
        fun cptr(obj: VBoxClass): CPointer<cnames.structs._GtkVBoxClass> = obj.cptr
    }
}

open class VButtonBox internal constructor (private val cptr: CPointer<GtkVButtonBox>) : ButtonBox(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 30927056UL
        fun cptr(obj: VButtonBox): CPointer<GtkVButtonBox> = obj.cptr
    }
}

class VButtonBoxClass(private val cptr: CPointer<cnames.structs._GtkVButtonBoxClass>) /* struct */ {
    companion object {
        fun cptr(obj: VButtonBoxClass): CPointer<cnames.structs._GtkVButtonBoxClass> = obj.cptr
    }
}

open class VPaned internal constructor (private val cptr: CPointer<GtkVPaned>) : Paned(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 32555008UL
        fun cptr(obj: VPaned): CPointer<GtkVPaned> = obj.cptr
    }
}

class VPanedClass(private val cptr: CPointer<cnames.structs._GtkVPanedClass>) /* struct */ {
    companion object {
        fun cptr(obj: VPanedClass): CPointer<cnames.structs._GtkVPanedClass> = obj.cptr
    }
}

open class VScale internal constructor (private val cptr: CPointer<GtkVScale>) : Scale(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 31389424UL
        fun cptr(obj: VScale): CPointer<GtkVScale> = obj.cptr
    }
}

class VScaleClass(private val cptr: CPointer<cnames.structs._GtkVScaleClass>) /* struct */ {
    companion object {
        fun cptr(obj: VScaleClass): CPointer<cnames.structs._GtkVScaleClass> = obj.cptr
    }
}

open class VScrollbar internal constructor (private val cptr: CPointer<GtkVScrollbar>) : Scrollbar(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 31221728UL
        fun cptr(obj: VScrollbar): CPointer<GtkVScrollbar> = obj.cptr
    }
}

class VScrollbarClass(private val cptr: CPointer<cnames.structs._GtkVScrollbarClass>) /* struct */ {
    companion object {
        fun cptr(obj: VScrollbarClass): CPointer<cnames.structs._GtkVScrollbarClass> = obj.cptr
    }
}

open class VSeparator internal constructor (private val cptr: CPointer<GtkVSeparator>) : Separator(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 31230752UL
        fun cptr(obj: VSeparator): CPointer<GtkVSeparator> = obj.cptr
    }
}

class VSeparatorClass(private val cptr: CPointer<cnames.structs._GtkVSeparatorClass>) /* struct */ {
    companion object {
        fun cptr(obj: VSeparatorClass): CPointer<cnames.structs._GtkVSeparatorClass> = obj.cptr
    }
}

open class Viewport internal constructor (private val cptr: CPointer<GtkViewport>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, Scrollable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(hadjustment: Adjustment, vadjustment: Adjustment) : this(stub<CPointer<GtkViewport>>())

    open fun getBinWindow(): com.charlag.kgtk.demo.gdk.Window {
         return stub()
    }
    open fun getShadowType(): ShadowType {
         return stub()
    }
    open fun getViewWindow(): com.charlag.kgtk.demo.gdk.Window {
         return stub()
    }
    open fun setShadowType(type: ShadowType): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 33383920UL
        fun cptr(obj: Viewport): CPointer<GtkViewport> = obj.cptr
    }
}

class ViewportClass(private val cptr: CPointer<cnames.structs._GtkViewportClass>) /* struct */ {
    companion object {
        fun cptr(obj: ViewportClass): CPointer<cnames.structs._GtkViewportClass> = obj.cptr
    }
}

open class VolumeButton internal constructor (private val cptr: CPointer<GtkVolumeButton>) : ScaleButton(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Actionable, Activatable, Buildable, Orientable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkVolumeButton>>())

    companion object {
        const val G_TYPE: gtk3.GType = 30832720UL
        fun cptr(obj: VolumeButton): CPointer<GtkVolumeButton> = obj.cptr
    }
}

class VolumeButtonClass(private val cptr: CPointer<cnames.structs._GtkVolumeButtonClass>) /* struct */ {
    companion object {
        fun cptr(obj: VolumeButtonClass): CPointer<cnames.structs._GtkVolumeButtonClass> = obj.cptr
    }
}

open class Widget internal constructor (private val cptr: CPointer<GtkWidget>) : com.charlag.kgtk.demo.gobject.InitiallyUnowned(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun activate(): Boolean {
         return memScoped { gtk_widget_activate(cptr)!! } != 0
    }
    open fun addAccelerator(accel_signal: String, accel_group: AccelGroup, accel_key: UInt, accel_mods: com.charlag.kgtk.demo.gdk.ModifierType, accel_flags: AccelFlags): Unit {
         return memScoped { gtk_widget_add_accelerator(cptr, accel_signal, AccelGroup.cptr(accel_group), accel_key, accel_mods, accel_flags)!! }
    }
    open fun addDeviceEvents(device: com.charlag.kgtk.demo.gdk.Device, events: com.charlag.kgtk.demo.gdk.EventMask): Unit {
         return memScoped { gtk_widget_add_device_events(cptr, com.charlag.kgtk.demo.gdk.Device.cptr(device), events)!! }
    }
    open fun addEvents(events: Int): Unit {
         return memScoped { gtk_widget_add_events(cptr, events)!! }
    }
    open fun addMnemonicLabel(label: Widget): Unit {
         return memScoped { gtk_widget_add_mnemonic_label(cptr, Widget.cptr(label))!! }
    }
// TODO: method add_tick_callback()
    open fun canActivateAccel(signal_id: UInt): Boolean {
         return memScoped { gtk_widget_can_activate_accel(cptr, signal_id)!! } != 0
    }
    open fun childFocus(direction: DirectionType): Boolean {
         return memScoped { gtk_widget_child_focus(cptr, direction)!! } != 0
    }
    open fun childNotify(child_property: String): Unit {
         return memScoped { gtk_widget_child_notify(cptr, child_property)!! }
    }
    open fun computeExpand(orientation: Orientation): Boolean {
         return memScoped { gtk_widget_compute_expand(cptr, orientation)!! } != 0
    }
    open fun createPangoContext(): com.charlag.kgtk.demo.pango.Context {
         return com.charlag.kgtk.demo.pango.Context(memScoped { gtk_widget_create_pango_context(cptr)!! })
    }
    open fun createPangoLayout(text: String): com.charlag.kgtk.demo.pango.Layout {
         return com.charlag.kgtk.demo.pango.Layout(memScoped { gtk_widget_create_pango_layout(cptr, text)!! })
    }
    open fun destroy(): Unit {
         return memScoped { gtk_widget_destroy(cptr)!! }
    }
    open fun destroyed(widget_pointer: Widget): Unit {
         return memScoped { gtk_widget_destroyed(cptr, stub("non-in param"))!! }
    }
    open fun deviceIsShadowed(device: com.charlag.kgtk.demo.gdk.Device): Boolean {
         return memScoped { gtk_widget_device_is_shadowed(cptr, com.charlag.kgtk.demo.gdk.Device.cptr(device))!! } != 0
    }
    open fun dragBeginWithCoordinates(targets: TargetList, actions: com.charlag.kgtk.demo.gdk.DragAction, button: Int, event: com.charlag.kgtk.demo.gdk.Event, x: Int, y: Int): com.charlag.kgtk.demo.gdk.DragContext {
         return com.charlag.kgtk.demo.gdk.DragContext(memScoped { gtk_drag_begin_with_coordinates(cptr, TargetList.cptr(targets), actions, button, com.charlag.kgtk.demo.gdk.Event.cptr(event), x, y)!! })
    }
    open fun dragCheckThreshold(start_x: Int, start_y: Int, current_x: Int, current_y: Int): Boolean {
         return memScoped { gtk_drag_check_threshold(cptr, start_x, start_y, current_x, current_y)!! } != 0
    }
    open fun dragDestAddImageTargets(): Unit {
         return memScoped { gtk_drag_dest_add_image_targets(cptr)!! }
    }
    open fun dragDestAddTextTargets(): Unit {
         return memScoped { gtk_drag_dest_add_text_targets(cptr)!! }
    }
    open fun dragDestAddUriTargets(): Unit {
         return memScoped { gtk_drag_dest_add_uri_targets(cptr)!! }
    }
    open fun dragDestFindTarget(context: com.charlag.kgtk.demo.gdk.DragContext, target_list: TargetList): com.charlag.kgtk.demo.gdk.Atom {
         return com.charlag.kgtk.demo.gdk.Atom(memScoped { gtk_drag_dest_find_target(cptr, com.charlag.kgtk.demo.gdk.DragContext.cptr(context), TargetList.cptr(target_list))!! })
    }
    open fun dragDestGetTargetList(): TargetList {
         return TargetList(memScoped { gtk_drag_dest_get_target_list(cptr)!! })
    }
    open fun dragDestGetTrackMotion(): Boolean {
         return memScoped { gtk_drag_dest_get_track_motion(cptr)!! } != 0
    }
    open fun dragDestSet(flags: DestDefaults, targets: List<TargetEntry>, n_targets: Int, actions: com.charlag.kgtk.demo.gdk.DragAction): Unit {
         return memScoped { gtk_drag_dest_set(cptr, flags, allocArray(targets.size) { TargetEntry.cptr(targets[it]) }, n_targets, actions)!! }
    }
    open fun dragDestSetTargetList(target_list: TargetList): Unit {
         return memScoped { gtk_drag_dest_set_target_list(cptr, TargetList.cptr(target_list))!! }
    }
    open fun dragDestSetTrackMotion(track_motion: Boolean): Unit {
         return memScoped { gtk_drag_dest_set_track_motion(cptr, track_motion.asGboolean())!! }
    }
    open fun dragDestUnset(): Unit {
         return memScoped { gtk_drag_dest_unset(cptr)!! }
    }
    open fun dragGetData(context: com.charlag.kgtk.demo.gdk.DragContext, target: com.charlag.kgtk.demo.gdk.Atom, time_: UInt): Unit {
         return memScoped { gtk_drag_get_data(cptr, com.charlag.kgtk.demo.gdk.DragContext.cptr(context), com.charlag.kgtk.demo.gdk.Atom.cptr(target), time_)!! }
    }
    open fun dragHighlight(): Unit {
         return memScoped { gtk_drag_highlight(cptr)!! }
    }
    open fun dragSourceAddImageTargets(): Unit {
         return memScoped { gtk_drag_source_add_image_targets(cptr)!! }
    }
    open fun dragSourceAddTextTargets(): Unit {
         return memScoped { gtk_drag_source_add_text_targets(cptr)!! }
    }
    open fun dragSourceAddUriTargets(): Unit {
         return memScoped { gtk_drag_source_add_uri_targets(cptr)!! }
    }
    open fun dragSourceGetTargetList(): TargetList {
         return TargetList(memScoped { gtk_drag_source_get_target_list(cptr)!! })
    }
    open fun dragSourceSet(start_button_mask: com.charlag.kgtk.demo.gdk.ModifierType, targets: List<TargetEntry>, n_targets: Int, actions: com.charlag.kgtk.demo.gdk.DragAction): Unit {
         return memScoped { gtk_drag_source_set(cptr, start_button_mask, allocArray(targets.size) { TargetEntry.cptr(targets[it]) }, n_targets, actions)!! }
    }
    open fun dragSourceSetIconGicon(icon: com.charlag.kgtk.demo.gio.Icon): Unit {
         return memScoped { gtk_drag_source_set_icon_gicon(cptr, stub("Passing interfaces"))!! }
    }
    open fun dragSourceSetIconName(icon_name: String): Unit {
         return memScoped { gtk_drag_source_set_icon_name(cptr, icon_name)!! }
    }
    open fun dragSourceSetIconPixbuf(pixbuf: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): Unit {
         return memScoped { gtk_drag_source_set_icon_pixbuf(cptr, com.charlag.kgtk.demo.gdkpixbuf.Pixbuf.cptr(pixbuf))!! }
    }
    open fun dragSourceSetTargetList(target_list: TargetList): Unit {
         return memScoped { gtk_drag_source_set_target_list(cptr, TargetList.cptr(target_list))!! }
    }
    open fun dragSourceUnset(): Unit {
         return memScoped { gtk_drag_source_unset(cptr)!! }
    }
    open fun dragUnhighlight(): Unit {
         return memScoped { gtk_drag_unhighlight(cptr)!! }
    }
    open fun draw(cr: com.charlag.kgtk.demo.cairo.Context): Unit {
         return memScoped { gtk_widget_draw(cptr, com.charlag.kgtk.demo.cairo.Context.cptr(cr))!! }
    }
    open fun errorBell(): Unit {
         return memScoped { gtk_widget_error_bell(cptr)!! }
    }
    open fun event(event: com.charlag.kgtk.demo.gdk.Event): Boolean {
         return memScoped { gtk_widget_event(cptr, com.charlag.kgtk.demo.gdk.Event.cptr(event))!! } != 0
    }
    open fun freezeChildNotify(): Unit {
         return memScoped { gtk_widget_freeze_child_notify(cptr)!! }
    }
    open fun getAccessible(): com.charlag.kgtk.demo.atk.Object {
         return com.charlag.kgtk.demo.atk.Object(memScoped { gtk_widget_get_accessible(cptr)!! })
    }
    open fun getActionGroup(prefix: String): com.charlag.kgtk.demo.gio.ActionGroup {
         return com.charlag.kgtk.demo.gio.ActionGroup.Erased(memScoped { gtk_widget_get_action_group(cptr, prefix)!! })
    }
    open fun getAllocatedBaseline(): Int {
         return memScoped { gtk_widget_get_allocated_baseline(cptr)!! }
    }
    open fun getAllocatedHeight(): Int {
         return memScoped { gtk_widget_get_allocated_height(cptr)!! }
    }
    open fun getAllocatedSize(allocation: com.charlag.kgtk.demo.gdk.Rectangle, baseline: Int): Unit {
         return memScoped { gtk_widget_get_allocated_size(cptr, stub("non-in param"), stub("non-in param"))!! }
    }
    open fun getAllocatedWidth(): Int {
         return memScoped { gtk_widget_get_allocated_width(cptr)!! }
    }
    open fun getAllocation(allocation: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return memScoped { gtk_widget_get_allocation(cptr, stub("non-in param"))!! }
    }
    open fun getAncestor(widget_type: GType): Widget {
         return Widget(memScoped { gtk_widget_get_ancestor(cptr, widget_type.cValue)!! })
    }
    open fun getAppPaintable(): Boolean {
         return memScoped { gtk_widget_get_app_paintable(cptr)!! } != 0
    }
    open fun getCanDefault(): Boolean {
         return memScoped { gtk_widget_get_can_default(cptr)!! } != 0
    }
    open fun getCanFocus(): Boolean {
         return memScoped { gtk_widget_get_can_focus(cptr)!! } != 0
    }
    open fun getChildVisible(): Boolean {
         return memScoped { gtk_widget_get_child_visible(cptr)!! } != 0
    }
    open fun getClip(clip: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return memScoped { gtk_widget_get_clip(cptr, stub("non-in param"))!! }
    }
    open fun getClipboard(selection: com.charlag.kgtk.demo.gdk.Atom): Clipboard {
         return Clipboard(memScoped { gtk_widget_get_clipboard(cptr, com.charlag.kgtk.demo.gdk.Atom.cptr(selection))!! })
    }
    open fun getDeviceEnabled(device: com.charlag.kgtk.demo.gdk.Device): Boolean {
         return memScoped { gtk_widget_get_device_enabled(cptr, com.charlag.kgtk.demo.gdk.Device.cptr(device))!! } != 0
    }
    open fun getDeviceEvents(device: com.charlag.kgtk.demo.gdk.Device): com.charlag.kgtk.demo.gdk.EventMask {
         return /* TODO: ret int GI_INFO_TYPE_FLAGS*/ memScoped { gtk_widget_get_device_events(cptr, com.charlag.kgtk.demo.gdk.Device.cptr(device))!! }
    }
    open fun getDirection(): TextDirection {
         return memScoped { gtk_widget_get_direction(cptr)!! }
    }
    open fun getDisplay(): com.charlag.kgtk.demo.gdk.Display {
         return com.charlag.kgtk.demo.gdk.Display(memScoped { gtk_widget_get_display(cptr)!! })
    }
    open fun getDoubleBuffered(): Boolean {
         return memScoped { gtk_widget_get_double_buffered(cptr)!! } != 0
    }
    open fun getEvents(): Int {
         return memScoped { gtk_widget_get_events(cptr)!! }
    }
    open fun getFocusOnClick(): Boolean {
         return memScoped { gtk_widget_get_focus_on_click(cptr)!! } != 0
    }
    open fun getFontMap(): com.charlag.kgtk.demo.pango.FontMap {
         return com.charlag.kgtk.demo.pango.FontMap(memScoped { gtk_widget_get_font_map(cptr)!! })
    }
    open fun getFontOptions(): com.charlag.kgtk.demo.cairo.FontOptions {
         return com.charlag.kgtk.demo.cairo.FontOptions(memScoped { gtk_widget_get_font_options(cptr)!! })
    }
    open fun getFrameClock(): com.charlag.kgtk.demo.gdk.FrameClock {
         return com.charlag.kgtk.demo.gdk.FrameClock(memScoped { gtk_widget_get_frame_clock(cptr)!! })
    }
    open fun getHalign(): Align {
         return memScoped { gtk_widget_get_halign(cptr)!! }
    }
    open fun getHasTooltip(): Boolean {
         return memScoped { gtk_widget_get_has_tooltip(cptr)!! } != 0
    }
    open fun getHasWindow(): Boolean {
         return memScoped { gtk_widget_get_has_window(cptr)!! } != 0
    }
    open fun getHexpand(): Boolean {
         return memScoped { gtk_widget_get_hexpand(cptr)!! } != 0
    }
    open fun getHexpandSet(): Boolean {
         return memScoped { gtk_widget_get_hexpand_set(cptr)!! } != 0
    }
    open fun getMapped(): Boolean {
         return memScoped { gtk_widget_get_mapped(cptr)!! } != 0
    }
    open fun getMarginBottom(): Int {
         return memScoped { gtk_widget_get_margin_bottom(cptr)!! }
    }
    open fun getMarginEnd(): Int {
         return memScoped { gtk_widget_get_margin_end(cptr)!! }
    }
    open fun getMarginStart(): Int {
         return memScoped { gtk_widget_get_margin_start(cptr)!! }
    }
    open fun getMarginTop(): Int {
         return memScoped { gtk_widget_get_margin_top(cptr)!! }
    }
    open fun getModifierMask(intent: com.charlag.kgtk.demo.gdk.ModifierIntent): com.charlag.kgtk.demo.gdk.ModifierType {
         return /* TODO: ret int GI_INFO_TYPE_FLAGS*/ memScoped { gtk_widget_get_modifier_mask(cptr, intent)!! }
    }
    override fun getName(): String {
         return memScoped { gtk_widget_get_name(cptr)!! }.toKString()
    }
    open fun getNoShowAll(): Boolean {
         return memScoped { gtk_widget_get_no_show_all(cptr)!! } != 0
    }
    open fun getOpacity(): Double {
         return /* TODO: ret tag GI_TYPE_TAG_DOUBLE */ memScoped { gtk_widget_get_opacity(cptr)!! }
    }
    open fun getPangoContext(): com.charlag.kgtk.demo.pango.Context {
         return com.charlag.kgtk.demo.pango.Context(memScoped { gtk_widget_get_pango_context(cptr)!! })
    }
    open fun getParent(): Widget {
         return Widget(memScoped { gtk_widget_get_parent(cptr)!! })
    }
    open fun getParentWindow(): com.charlag.kgtk.demo.gdk.Window {
         return com.charlag.kgtk.demo.gdk.Window(memScoped { gtk_widget_get_parent_window(cptr)!! })
    }
    open fun getPath(): WidgetPath {
         return WidgetPath(memScoped { gtk_widget_get_path(cptr)!! })
    }
    open fun getPreferredHeight(minimum_height: Int, natural_height: Int): Unit {
         return memScoped { gtk_widget_get_preferred_height(cptr, stub("non-in param"), stub("non-in param"))!! }
    }
    open fun getPreferredHeightAndBaselineForWidth(width: Int, minimum_height: Int, natural_height: Int, minimum_baseline: Int, natural_baseline: Int): Unit {
         return memScoped { gtk_widget_get_preferred_height_and_baseline_for_width(cptr, width, stub("non-in param"), stub("non-in param"), stub("non-in param"), stub("non-in param"))!! }
    }
    open fun getPreferredHeightForWidth(width: Int, minimum_height: Int, natural_height: Int): Unit {
         return memScoped { gtk_widget_get_preferred_height_for_width(cptr, width, stub("non-in param"), stub("non-in param"))!! }
    }
    open fun getPreferredSize(minimum_size: Requisition, natural_size: Requisition): Unit {
         return memScoped { gtk_widget_get_preferred_size(cptr, stub("non-in param"), stub("non-in param"))!! }
    }
    open fun getPreferredWidth(minimum_width: Int, natural_width: Int): Unit {
         return memScoped { gtk_widget_get_preferred_width(cptr, stub("non-in param"), stub("non-in param"))!! }
    }
    open fun getPreferredWidthForHeight(height: Int, minimum_width: Int, natural_width: Int): Unit {
         return memScoped { gtk_widget_get_preferred_width_for_height(cptr, height, stub("non-in param"), stub("non-in param"))!! }
    }
    open fun getRealized(): Boolean {
         return memScoped { gtk_widget_get_realized(cptr)!! } != 0
    }
    open fun getReceivesDefault(): Boolean {
         return memScoped { gtk_widget_get_receives_default(cptr)!! } != 0
    }
    open fun getRequestMode(): SizeRequestMode {
         return memScoped { gtk_widget_get_request_mode(cptr)!! }
    }
    open fun getScaleFactor(): Int {
         return memScoped { gtk_widget_get_scale_factor(cptr)!! }
    }
    open fun getScreen(): com.charlag.kgtk.demo.gdk.Screen {
         return com.charlag.kgtk.demo.gdk.Screen(memScoped { gtk_widget_get_screen(cptr)!! })
    }
    open fun getSensitive(): Boolean {
         return memScoped { gtk_widget_get_sensitive(cptr)!! } != 0
    }
    open fun getSettings(): Settings {
         return Settings(memScoped { gtk_widget_get_settings(cptr)!! })
    }
    open fun getSizeRequest(width: Int, height: Int): Unit {
         return memScoped { gtk_widget_get_size_request(cptr, stub("non-in param"), stub("non-in param"))!! }
    }
    open fun getStateFlags(): StateFlags {
         return /* TODO: ret int GI_INFO_TYPE_FLAGS*/ memScoped { gtk_widget_get_state_flags(cptr)!! }
    }
    open fun getStyleContext(): StyleContext {
         return StyleContext(memScoped { gtk_widget_get_style_context(cptr)!! })
    }
    open fun getSupportMultidevice(): Boolean {
         return memScoped { gtk_widget_get_support_multidevice(cptr)!! } != 0
    }
    open fun getTemplateChild(widget_type: GType, `name`: String): com.charlag.kgtk.demo.gobject.Object {
         return com.charlag.kgtk.demo.gobject.Object(memScoped { gtk_widget_get_template_child(cptr, widget_type.cValue, `name`)!! })
    }
    open fun getTooltipMarkup(): String {
         return memScoped { gtk_widget_get_tooltip_markup(cptr)!! }.toKString()
    }
    open fun getTooltipText(): String {
         return memScoped { gtk_widget_get_tooltip_text(cptr)!! }.toKString()
    }
    open fun getTooltipWindow(): Window {
         return Window(memScoped { gtk_widget_get_tooltip_window(cptr)!! })
    }
    open fun getToplevel(): Widget {
         return Widget(memScoped { gtk_widget_get_toplevel(cptr)!! })
    }
    open fun getValign(): Align {
         return memScoped { gtk_widget_get_valign(cptr)!! }
    }
    open fun getValignWithBaseline(): Align {
         return memScoped { gtk_widget_get_valign_with_baseline(cptr)!! }
    }
    open fun getVexpand(): Boolean {
         return memScoped { gtk_widget_get_vexpand(cptr)!! } != 0
    }
    open fun getVexpandSet(): Boolean {
         return memScoped { gtk_widget_get_vexpand_set(cptr)!! } != 0
    }
    open fun getVisible(): Boolean {
         return memScoped { gtk_widget_get_visible(cptr)!! } != 0
    }
    open fun getVisual(): com.charlag.kgtk.demo.gdk.Visual {
         return com.charlag.kgtk.demo.gdk.Visual(memScoped { gtk_widget_get_visual(cptr)!! })
    }
    open fun getWindow(): com.charlag.kgtk.demo.gdk.Window {
         return com.charlag.kgtk.demo.gdk.Window(memScoped { gtk_widget_get_window(cptr)!! })
    }
    open fun grabAdd(): Unit {
         return memScoped { gtk_grab_add(cptr)!! }
    }
    open fun grabDefault(): Unit {
         return memScoped { gtk_widget_grab_default(cptr)!! }
    }
    open fun grabFocus(): Unit {
         return memScoped { gtk_widget_grab_focus(cptr)!! }
    }
    open fun grabRemove(): Unit {
         return memScoped { gtk_grab_remove(cptr)!! }
    }
    open fun hasDefault(): Boolean {
         return memScoped { gtk_widget_has_default(cptr)!! } != 0
    }
    open fun hasFocus(): Boolean {
         return memScoped { gtk_widget_has_focus(cptr)!! } != 0
    }
    open fun hasGrab(): Boolean {
         return memScoped { gtk_widget_has_grab(cptr)!! } != 0
    }
    open fun hasScreen(): Boolean {
         return memScoped { gtk_widget_has_screen(cptr)!! } != 0
    }
    open fun hasVisibleFocus(): Boolean {
         return memScoped { gtk_widget_has_visible_focus(cptr)!! } != 0
    }
    open fun hide(): Unit {
         return memScoped { gtk_widget_hide(cptr)!! }
    }
    open fun hideOnDelete(): Boolean {
         return memScoped { gtk_widget_hide_on_delete(cptr)!! } != 0
    }
    open fun inDestruction(): Boolean {
         return memScoped { gtk_widget_in_destruction(cptr)!! } != 0
    }
    open fun initTemplate(): Unit {
         return memScoped { gtk_widget_init_template(cptr)!! }
    }
    open fun inputShapeCombineRegion(region: com.charlag.kgtk.demo.cairo.Region): Unit {
         return memScoped { gtk_widget_input_shape_combine_region(cptr, com.charlag.kgtk.demo.cairo.Region.cptr(region))!! }
    }
    open fun insertActionGroup(`name`: String, group: com.charlag.kgtk.demo.gio.ActionGroup): Unit {
         return memScoped { gtk_widget_insert_action_group(cptr, `name`, stub("Passing interfaces"))!! }
    }
    open fun intersect(area: com.charlag.kgtk.demo.gdk.Rectangle, intersection: com.charlag.kgtk.demo.gdk.Rectangle): Boolean {
         return memScoped { gtk_widget_intersect(cptr, com.charlag.kgtk.demo.gdk.Rectangle.cptr(area), stub("non-in param"))!! } != 0
    }
    open fun isAncestor(ancestor: Widget): Boolean {
         return memScoped { gtk_widget_is_ancestor(cptr, Widget.cptr(ancestor))!! } != 0
    }
    open fun isDrawable(): Boolean {
         return memScoped { gtk_widget_is_drawable(cptr)!! } != 0
    }
    open fun isFocus(): Boolean {
         return memScoped { gtk_widget_is_focus(cptr)!! } != 0
    }
    open fun isSensitive(): Boolean {
         return memScoped { gtk_widget_is_sensitive(cptr)!! } != 0
    }
    open fun isToplevel(): Boolean {
         return memScoped { gtk_widget_is_toplevel(cptr)!! } != 0
    }
    open fun isVisible(): Boolean {
         return memScoped { gtk_widget_is_visible(cptr)!! } != 0
    }
    open fun keynavFailed(direction: DirectionType): Boolean {
         return memScoped { gtk_widget_keynav_failed(cptr, direction)!! } != 0
    }
    open fun listAccelClosures(): List<com.charlag.kgtk.demo.gobject.Closure> {
         return memScoped { gtk_widget_list_accel_closures(cptr)!! }.toList<GClosure>().map { com.charlag.kgtk.demo.gobject.Closure(it) }
    }
    open fun listActionPrefixes(): List<String> {
         return memScoped { gtk_widget_list_action_prefixes(cptr)!! }.arrayToList().map { it.toKString() }
    }
    open fun listMnemonicLabels(): List<Widget> {
         return memScoped { gtk_widget_list_mnemonic_labels(cptr)!! }.toList<GtkWidget>().map { Widget(it) }
    }
    open fun map(): Unit {
         return memScoped { gtk_widget_map(cptr)!! }
    }
    open fun mnemonicActivate(group_cycling: Boolean): Boolean {
         return memScoped { gtk_widget_mnemonic_activate(cptr, group_cycling.asGboolean())!! } != 0
    }
    open fun queueAllocate(): Unit {
         return memScoped { gtk_widget_queue_allocate(cptr)!! }
    }
    open fun queueComputeExpand(): Unit {
         return memScoped { gtk_widget_queue_compute_expand(cptr)!! }
    }
    open fun queueDraw(): Unit {
         return memScoped { gtk_widget_queue_draw(cptr)!! }
    }
    open fun queueDrawArea(x: Int, y: Int, width: Int, height: Int): Unit {
         return memScoped { gtk_widget_queue_draw_area(cptr, x, y, width, height)!! }
    }
    open fun queueDrawRegion(region: com.charlag.kgtk.demo.cairo.Region): Unit {
         return memScoped { gtk_widget_queue_draw_region(cptr, com.charlag.kgtk.demo.cairo.Region.cptr(region))!! }
    }
    open fun queueResize(): Unit {
         return memScoped { gtk_widget_queue_resize(cptr)!! }
    }
    open fun queueResizeNoRedraw(): Unit {
         return memScoped { gtk_widget_queue_resize_no_redraw(cptr)!! }
    }
    open fun realize(): Unit {
         return memScoped { gtk_widget_realize(cptr)!! }
    }
    open fun registerWindow(window: com.charlag.kgtk.demo.gdk.Window): Unit {
         return memScoped { gtk_widget_register_window(cptr, com.charlag.kgtk.demo.gdk.Window.cptr(window))!! }
    }
    open fun removeAccelerator(accel_group: AccelGroup, accel_key: UInt, accel_mods: com.charlag.kgtk.demo.gdk.ModifierType): Boolean {
         return memScoped { gtk_widget_remove_accelerator(cptr, AccelGroup.cptr(accel_group), accel_key, accel_mods)!! } != 0
    }
    open fun removeMnemonicLabel(label: Widget): Unit {
         return memScoped { gtk_widget_remove_mnemonic_label(cptr, Widget.cptr(label))!! }
    }
    open fun removeTickCallback(id: UInt): Unit {
         return memScoped { gtk_widget_remove_tick_callback(cptr, id)!! }
    }
 // TODO: method render_icon(), int in typelib, enum is C 
 // TODO: method render_icon_pixbuf(), int in typelib, enum is C 
    open fun resetStyle(): Unit {
         return memScoped { gtk_widget_reset_style(cptr)!! }
    }
    open fun sendFocusChange(event: com.charlag.kgtk.demo.gdk.Event): Boolean {
         return memScoped { gtk_widget_send_focus_change(cptr, com.charlag.kgtk.demo.gdk.Event.cptr(event))!! } != 0
    }
    open fun setAccelPath(accel_path: String, accel_group: AccelGroup): Unit {
         return memScoped { gtk_widget_set_accel_path(cptr, accel_path, AccelGroup.cptr(accel_group))!! }
    }
    open fun setAllocation(allocation: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return memScoped { gtk_widget_set_allocation(cptr, com.charlag.kgtk.demo.gdk.Rectangle.cptr(allocation))!! }
    }
    open fun setAppPaintable(app_paintable: Boolean): Unit {
         return memScoped { gtk_widget_set_app_paintable(cptr, app_paintable.asGboolean())!! }
    }
    open fun setCanDefault(can_default: Boolean): Unit {
         return memScoped { gtk_widget_set_can_default(cptr, can_default.asGboolean())!! }
    }
    open fun setCanFocus(can_focus: Boolean): Unit {
         return memScoped { gtk_widget_set_can_focus(cptr, can_focus.asGboolean())!! }
    }
    open fun setChildVisible(is_visible: Boolean): Unit {
         return memScoped { gtk_widget_set_child_visible(cptr, is_visible.asGboolean())!! }
    }
    open fun setClip(clip: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return memScoped { gtk_widget_set_clip(cptr, com.charlag.kgtk.demo.gdk.Rectangle.cptr(clip))!! }
    }
    open fun setDeviceEnabled(device: com.charlag.kgtk.demo.gdk.Device, enabled: Boolean): Unit {
         return memScoped { gtk_widget_set_device_enabled(cptr, com.charlag.kgtk.demo.gdk.Device.cptr(device), enabled.asGboolean())!! }
    }
    open fun setDeviceEvents(device: com.charlag.kgtk.demo.gdk.Device, events: com.charlag.kgtk.demo.gdk.EventMask): Unit {
         return memScoped { gtk_widget_set_device_events(cptr, com.charlag.kgtk.demo.gdk.Device.cptr(device), events)!! }
    }
    open fun setDirection(dir: TextDirection): Unit {
         return memScoped { gtk_widget_set_direction(cptr, dir)!! }
    }
    open fun setEvents(events: Int): Unit {
         return memScoped { gtk_widget_set_events(cptr, events)!! }
    }
    open fun setFocusOnClick(focus_on_click: Boolean): Unit {
         return memScoped { gtk_widget_set_focus_on_click(cptr, focus_on_click.asGboolean())!! }
    }
    open fun setFontMap(font_map: com.charlag.kgtk.demo.pango.FontMap): Unit {
         return memScoped { gtk_widget_set_font_map(cptr, com.charlag.kgtk.demo.pango.FontMap.cptr(font_map))!! }
    }
    open fun setFontOptions(options: com.charlag.kgtk.demo.cairo.FontOptions): Unit {
         return memScoped { gtk_widget_set_font_options(cptr, com.charlag.kgtk.demo.cairo.FontOptions.cptr(options))!! }
    }
    open fun setHalign(align: Align): Unit {
         return memScoped { gtk_widget_set_halign(cptr, align)!! }
    }
    open fun setHasTooltip(has_tooltip: Boolean): Unit {
         return memScoped { gtk_widget_set_has_tooltip(cptr, has_tooltip.asGboolean())!! }
    }
    open fun setHasWindow(has_window: Boolean): Unit {
         return memScoped { gtk_widget_set_has_window(cptr, has_window.asGboolean())!! }
    }
    open fun setHexpand(expand: Boolean): Unit {
         return memScoped { gtk_widget_set_hexpand(cptr, expand.asGboolean())!! }
    }
    open fun setHexpandSet(set: Boolean): Unit {
         return memScoped { gtk_widget_set_hexpand_set(cptr, set.asGboolean())!! }
    }
    open fun setMapped(mapped: Boolean): Unit {
         return memScoped { gtk_widget_set_mapped(cptr, mapped.asGboolean())!! }
    }
    open fun setMarginBottom(margin: Int): Unit {
         return memScoped { gtk_widget_set_margin_bottom(cptr, margin)!! }
    }
    open fun setMarginEnd(margin: Int): Unit {
         return memScoped { gtk_widget_set_margin_end(cptr, margin)!! }
    }
    open fun setMarginStart(margin: Int): Unit {
         return memScoped { gtk_widget_set_margin_start(cptr, margin)!! }
    }
    open fun setMarginTop(margin: Int): Unit {
         return memScoped { gtk_widget_set_margin_top(cptr, margin)!! }
    }
    override fun setName(`name`: String): Unit {
         return memScoped { gtk_widget_set_name(cptr, `name`)!! }
    }
    open fun setNoShowAll(no_show_all: Boolean): Unit {
         return memScoped { gtk_widget_set_no_show_all(cptr, no_show_all.asGboolean())!! }
    }
    open fun setOpacity(opacity: Double): Unit {
         return memScoped { gtk_widget_set_opacity(cptr, opacity)!! }
    }
    open fun setParent(parent: Widget): Unit {
         return memScoped { gtk_widget_set_parent(cptr, Widget.cptr(parent))!! }
    }
    open fun setParentWindow(parent_window: com.charlag.kgtk.demo.gdk.Window): Unit {
         return memScoped { gtk_widget_set_parent_window(cptr, com.charlag.kgtk.demo.gdk.Window.cptr(parent_window))!! }
    }
    open fun setRealized(realized: Boolean): Unit {
         return memScoped { gtk_widget_set_realized(cptr, realized.asGboolean())!! }
    }
    open fun setReceivesDefault(receives_default: Boolean): Unit {
         return memScoped { gtk_widget_set_receives_default(cptr, receives_default.asGboolean())!! }
    }
    open fun setRedrawOnAllocate(redraw_on_allocate: Boolean): Unit {
         return memScoped { gtk_widget_set_redraw_on_allocate(cptr, redraw_on_allocate.asGboolean())!! }
    }
    open fun setSensitive(sensitive: Boolean): Unit {
         return memScoped { gtk_widget_set_sensitive(cptr, sensitive.asGboolean())!! }
    }
    open fun setSizeRequest(width: Int, height: Int): Unit {
         return memScoped { gtk_widget_set_size_request(cptr, width, height)!! }
    }
    open fun setStateFlags(flags: StateFlags, clear: Boolean): Unit {
         return memScoped { gtk_widget_set_state_flags(cptr, flags, clear.asGboolean())!! }
    }
    open fun setSupportMultidevice(support_multidevice: Boolean): Unit {
         return memScoped { gtk_widget_set_support_multidevice(cptr, support_multidevice.asGboolean())!! }
    }
    open fun setTooltipMarkup(markup: String): Unit {
         return memScoped { gtk_widget_set_tooltip_markup(cptr, markup)!! }
    }
    open fun setTooltipText(text: String): Unit {
         return memScoped { gtk_widget_set_tooltip_text(cptr, text)!! }
    }
    open fun setTooltipWindow(custom_window: Window): Unit {
         return memScoped { gtk_widget_set_tooltip_window(cptr, Window.cptr(custom_window))!! }
    }
    open fun setValign(align: Align): Unit {
         return memScoped { gtk_widget_set_valign(cptr, align)!! }
    }
    open fun setVexpand(expand: Boolean): Unit {
         return memScoped { gtk_widget_set_vexpand(cptr, expand.asGboolean())!! }
    }
    open fun setVexpandSet(set: Boolean): Unit {
         return memScoped { gtk_widget_set_vexpand_set(cptr, set.asGboolean())!! }
    }
    open fun setVisible(visible: Boolean): Unit {
         return memScoped { gtk_widget_set_visible(cptr, visible.asGboolean())!! }
    }
    open fun setVisual(visual: com.charlag.kgtk.demo.gdk.Visual): Unit {
         return memScoped { gtk_widget_set_visual(cptr, com.charlag.kgtk.demo.gdk.Visual.cptr(visual))!! }
    }
    open fun setWindow(window: com.charlag.kgtk.demo.gdk.Window): Unit {
         return memScoped { gtk_widget_set_window(cptr, com.charlag.kgtk.demo.gdk.Window.cptr(window))!! }
    }
    open fun shapeCombineRegion(region: com.charlag.kgtk.demo.cairo.Region): Unit {
         return memScoped { gtk_widget_shape_combine_region(cptr, com.charlag.kgtk.demo.cairo.Region.cptr(region))!! }
    }
    open fun show(): Unit {
         return memScoped { gtk_widget_show(cptr)!! }
    }
    open fun showAll(): Unit {
         return memScoped { gtk_widget_show_all(cptr)!! }
    }
    open fun showNow(): Unit {
         return memScoped { gtk_widget_show_now(cptr)!! }
    }
    open fun sizeAllocate(allocation: com.charlag.kgtk.demo.gdk.Rectangle): Unit {
         return memScoped { gtk_widget_size_allocate(cptr, com.charlag.kgtk.demo.gdk.Rectangle.cptr(allocation))!! }
    }
    open fun sizeAllocateWithBaseline(allocation: com.charlag.kgtk.demo.gdk.Rectangle, baseline: Int): Unit {
         return memScoped { gtk_widget_size_allocate_with_baseline(cptr, com.charlag.kgtk.demo.gdk.Rectangle.cptr(allocation), baseline)!! }
    }
    open fun styleGetProperty(property_name: String, value: com.charlag.kgtk.demo.gobject.Value): Unit {
         return memScoped { gtk_widget_style_get_property(cptr, property_name, com.charlag.kgtk.demo.gobject.Value.cptr(value))!! }
    }
    open fun thawChildNotify(): Unit {
         return memScoped { gtk_widget_thaw_child_notify(cptr)!! }
    }
    open fun translateCoordinates(dest_widget: Widget, src_x: Int, src_y: Int, dest_x: Int, dest_y: Int): Boolean {
         return memScoped { gtk_widget_translate_coordinates(cptr, Widget.cptr(dest_widget), src_x, src_y, stub("non-in param"), stub("non-in param"))!! } != 0
    }
    open fun triggerTooltipQuery(): Unit {
         return memScoped { gtk_widget_trigger_tooltip_query(cptr)!! }
    }
    open fun unmap(): Unit {
         return memScoped { gtk_widget_unmap(cptr)!! }
    }
    open fun unparent(): Unit {
         return memScoped { gtk_widget_unparent(cptr)!! }
    }
    open fun unrealize(): Unit {
         return memScoped { gtk_widget_unrealize(cptr)!! }
    }
    open fun unregisterWindow(window: com.charlag.kgtk.demo.gdk.Window): Unit {
         return memScoped { gtk_widget_unregister_window(cptr, com.charlag.kgtk.demo.gdk.Window.cptr(window))!! }
    }
    open fun unsetStateFlags(flags: StateFlags): Unit {
         return memScoped { gtk_widget_unset_state_flags(cptr, flags)!! }
    }
    fun setOnAccelClosuresChanged(cb: () -> Unit) {
        do_connect(cptr, "accel-closures-changed", cb)
    }

    fun setOnButtonPressEvent(cb: () -> Unit) {
        do_connect(cptr, "button-press-event", cb)
    }

    fun setOnButtonReleaseEvent(cb: () -> Unit) {
        do_connect(cptr, "button-release-event", cb)
    }

    fun setOnCanActivateAccel(cb: () -> Unit) {
        do_connect(cptr, "can-activate-accel", cb)
    }

    fun setOnChildNotify(cb: () -> Unit) {
        do_connect(cptr, "child-notify", cb)
    }

    fun setOnCompositedChanged(cb: () -> Unit) {
        do_connect(cptr, "composited-changed", cb)
    }

    fun setOnConfigureEvent(cb: () -> Unit) {
        do_connect(cptr, "configure-event", cb)
    }

    fun setOnDamageEvent(cb: () -> Unit) {
        do_connect(cptr, "damage-event", cb)
    }

    fun setOnDeleteEvent(cb: () -> Unit) {
        do_connect(cptr, "delete-event", cb)
    }

    fun setOnDestroy(cb: () -> Unit) {
        do_connect(cptr, "destroy", cb)
    }

    fun setOnDestroyEvent(cb: () -> Unit) {
        do_connect(cptr, "destroy-event", cb)
    }

    fun setOnDirectionChanged(cb: () -> Unit) {
        do_connect(cptr, "direction-changed", cb)
    }

    fun setOnDragBegin(cb: () -> Unit) {
        do_connect(cptr, "drag-begin", cb)
    }

    fun setOnDragDataDelete(cb: () -> Unit) {
        do_connect(cptr, "drag-data-delete", cb)
    }

    fun setOnDragDataGet(cb: () -> Unit) {
        do_connect(cptr, "drag-data-get", cb)
    }

    fun setOnDragDataReceived(cb: () -> Unit) {
        do_connect(cptr, "drag-data-received", cb)
    }

    fun setOnDragDrop(cb: () -> Unit) {
        do_connect(cptr, "drag-drop", cb)
    }

    fun setOnDragEnd(cb: () -> Unit) {
        do_connect(cptr, "drag-end", cb)
    }

    fun setOnDragFailed(cb: () -> Unit) {
        do_connect(cptr, "drag-failed", cb)
    }

    fun setOnDragLeave(cb: () -> Unit) {
        do_connect(cptr, "drag-leave", cb)
    }

    fun setOnDragMotion(cb: () -> Unit) {
        do_connect(cptr, "drag-motion", cb)
    }

    fun setOnDraw(cb: () -> Unit) {
        do_connect(cptr, "draw", cb)
    }

    fun setOnEnterNotifyEvent(cb: () -> Unit) {
        do_connect(cptr, "enter-notify-event", cb)
    }

    fun setOnEvent(cb: () -> Unit) {
        do_connect(cptr, "event", cb)
    }

    fun setOnEventAfter(cb: () -> Unit) {
        do_connect(cptr, "event-after", cb)
    }

    fun setOnFocus(cb: () -> Unit) {
        do_connect(cptr, "focus", cb)
    }

    fun setOnFocusInEvent(cb: () -> Unit) {
        do_connect(cptr, "focus-in-event", cb)
    }

    fun setOnFocusOutEvent(cb: () -> Unit) {
        do_connect(cptr, "focus-out-event", cb)
    }

    fun setOnGrabBrokenEvent(cb: () -> Unit) {
        do_connect(cptr, "grab-broken-event", cb)
    }

    fun setOnGrabFocus(cb: () -> Unit) {
        do_connect(cptr, "grab-focus", cb)
    }

    fun setOnGrabNotify(cb: () -> Unit) {
        do_connect(cptr, "grab-notify", cb)
    }

    fun setOnHide(cb: () -> Unit) {
        do_connect(cptr, "hide", cb)
    }

    fun setOnHierarchyChanged(cb: () -> Unit) {
        do_connect(cptr, "hierarchy-changed", cb)
    }

    fun setOnKeyPressEvent(cb: () -> Unit) {
        do_connect(cptr, "key-press-event", cb)
    }

    fun setOnKeyReleaseEvent(cb: () -> Unit) {
        do_connect(cptr, "key-release-event", cb)
    }

    fun setOnKeynavFailed(cb: () -> Unit) {
        do_connect(cptr, "keynav-failed", cb)
    }

    fun setOnLeaveNotifyEvent(cb: () -> Unit) {
        do_connect(cptr, "leave-notify-event", cb)
    }

    fun setOnMap(cb: () -> Unit) {
        do_connect(cptr, "map", cb)
    }

    fun setOnMapEvent(cb: () -> Unit) {
        do_connect(cptr, "map-event", cb)
    }

    fun setOnMnemonicActivate(cb: () -> Unit) {
        do_connect(cptr, "mnemonic-activate", cb)
    }

    fun setOnMotionNotifyEvent(cb: () -> Unit) {
        do_connect(cptr, "motion-notify-event", cb)
    }

    fun setOnMoveFocus(cb: () -> Unit) {
        do_connect(cptr, "move-focus", cb)
    }

    fun setOnParentSet(cb: () -> Unit) {
        do_connect(cptr, "parent-set", cb)
    }

    fun setOnPopupMenu(cb: () -> Unit) {
        do_connect(cptr, "popup-menu", cb)
    }

    fun setOnPropertyNotifyEvent(cb: () -> Unit) {
        do_connect(cptr, "property-notify-event", cb)
    }

    fun setOnProximityInEvent(cb: () -> Unit) {
        do_connect(cptr, "proximity-in-event", cb)
    }

    fun setOnProximityOutEvent(cb: () -> Unit) {
        do_connect(cptr, "proximity-out-event", cb)
    }

    fun setOnQueryTooltip(cb: () -> Unit) {
        do_connect(cptr, "query-tooltip", cb)
    }

    fun setOnRealize(cb: () -> Unit) {
        do_connect(cptr, "realize", cb)
    }

    fun setOnScreenChanged(cb: () -> Unit) {
        do_connect(cptr, "screen-changed", cb)
    }

    fun setOnScrollEvent(cb: () -> Unit) {
        do_connect(cptr, "scroll-event", cb)
    }

    fun setOnSelectionClearEvent(cb: () -> Unit) {
        do_connect(cptr, "selection-clear-event", cb)
    }

    fun setOnSelectionGet(cb: () -> Unit) {
        do_connect(cptr, "selection-get", cb)
    }

    fun setOnSelectionNotifyEvent(cb: () -> Unit) {
        do_connect(cptr, "selection-notify-event", cb)
    }

    fun setOnSelectionReceived(cb: () -> Unit) {
        do_connect(cptr, "selection-received", cb)
    }

    fun setOnSelectionRequestEvent(cb: () -> Unit) {
        do_connect(cptr, "selection-request-event", cb)
    }

    fun setOnShow(cb: () -> Unit) {
        do_connect(cptr, "show", cb)
    }

    fun setOnShowHelp(cb: () -> Unit) {
        do_connect(cptr, "show-help", cb)
    }

    fun setOnSizeAllocate(cb: () -> Unit) {
        do_connect(cptr, "size-allocate", cb)
    }

    fun setOnStateChanged(cb: () -> Unit) {
        do_connect(cptr, "state-changed", cb)
    }

    fun setOnStateFlagsChanged(cb: () -> Unit) {
        do_connect(cptr, "state-flags-changed", cb)
    }

    fun setOnStyleSet(cb: () -> Unit) {
        do_connect(cptr, "style-set", cb)
    }

    fun setOnStyleUpdated(cb: () -> Unit) {
        do_connect(cptr, "style-updated", cb)
    }

    fun setOnTouchEvent(cb: () -> Unit) {
        do_connect(cptr, "touch-event", cb)
    }

    fun setOnUnmap(cb: () -> Unit) {
        do_connect(cptr, "unmap", cb)
    }

    fun setOnUnmapEvent(cb: () -> Unit) {
        do_connect(cptr, "unmap-event", cb)
    }

    fun setOnUnrealize(cb: () -> Unit) {
        do_connect(cptr, "unrealize", cb)
    }

    fun setOnVisibilityNotifyEvent(cb: () -> Unit) {
        do_connect(cptr, "visibility-notify-event", cb)
    }

    fun setOnWindowStateEvent(cb: () -> Unit) {
        do_connect(cptr, "window-state-event", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 30505568UL
        fun cptr(obj: Widget): CPointer<GtkWidget> = obj.cptr
        fun getDefaultDirection(): TextDirection {
    return memScoped { gtk_widget_get_default_direction()!! }
}
        fun setDefaultDirection(dir: TextDirection): Unit {
    return memScoped { gtk_widget_set_default_direction(dir)!! }
}
    }
}

class WidgetClass(private val cptr: CPointer<cnames.structs._GtkWidgetClass>) /* struct */ {
    fun bindTemplateCallbackFull(callback_name: String, callback_symbol: com.charlag.kgtk.demo.gobject.Callback): Unit {
         return stub()
    }
    fun bindTemplateChildFull(`name`: String, internal_child: Boolean, struct_offset: Long): Unit {
         return stub()
    }
    fun findStyleProperty(property_name: String): com.charlag.kgtk.demo.gobject.ParamSpec {
         return stub()
    }
    fun getCssName(): String {
         return stub()
    }
    fun installStyleProperty(pspec: com.charlag.kgtk.demo.gobject.ParamSpec): Unit {
         return stub()
    }
    fun listStyleProperties(n_properties: UInt): List<com.charlag.kgtk.demo.gobject.ParamSpec> {
         return stub()
    }
    fun setAccessibleRole(role: com.charlag.kgtk.demo.atk.Role): Unit {
         return stub()
    }
    fun setAccessibleType(type: GType): Unit {
         return stub()
    }
    fun setConnectFunc(connect_func: BuilderConnectFunc, connect_data: Any, connect_data_destroy: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    fun setCssName(`name`: String): Unit {
         return stub()
    }
    fun setTemplate(template_bytes: com.charlag.kgtk.demo.glib.Bytes): Unit {
         return stub()
    }
    fun setTemplateFromResource(resource_name: String): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: WidgetClass): CPointer<cnames.structs._GtkWidgetClass> = obj.cptr
    }
}

typealias WidgetHelpType = GtkWidgetHelpType

class WidgetPath(private val cptr: CPointer<cnames.structs._GtkWidgetPath>) /* struct */ {
    fun new(): WidgetPath {
         return stub()
    }
    fun appendForWidget(widget: Widget): Int {
         return stub()
    }
    fun appendType(type: GType): Int {
         return stub()
    }
    fun appendWithSiblings(siblings: WidgetPath, sibling_index: UInt): Int {
         return stub()
    }
    fun copy(): WidgetPath {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getObjectType(): GType {
         return stub()
    }
    fun hasParent(type: GType): Boolean {
         return stub()
    }
    fun isType(type: GType): Boolean {
         return stub()
    }
    fun iterAddClass(pos: Int, `name`: String): Unit {
         return stub()
    }
    fun iterAddRegion(pos: Int, `name`: String, flags: RegionFlags): Unit {
         return stub()
    }
    fun iterClearClasses(pos: Int): Unit {
         return stub()
    }
    fun iterClearRegions(pos: Int): Unit {
         return stub()
    }
    fun iterGetName(pos: Int): String {
         return stub()
    }
    fun iterGetObjectName(pos: Int): String {
         return stub()
    }
    fun iterGetObjectType(pos: Int): GType {
         return stub()
    }
    fun iterGetSiblingIndex(pos: Int): UInt {
         return stub()
    }
    fun iterGetSiblings(pos: Int): WidgetPath {
         return stub()
    }
    fun iterGetState(pos: Int): StateFlags {
         return stub()
    }
    fun iterHasClass(pos: Int, `name`: String): Boolean {
         return stub()
    }
    fun iterHasName(pos: Int, `name`: String): Boolean {
         return stub()
    }
    fun iterHasQclass(pos: Int, qname: UInt): Boolean {
         return stub()
    }
    fun iterHasQname(pos: Int, qname: UInt): Boolean {
         return stub()
    }
    fun iterHasQregion(pos: Int, qname: UInt, flags: RegionFlags): Boolean {
         return stub()
    }
    fun iterHasRegion(pos: Int, `name`: String, flags: RegionFlags): Boolean {
         return stub()
    }
    fun iterListClasses(pos: Int): List<String> {
         return stub()
    }
    fun iterListRegions(pos: Int): List<String> {
         return stub()
    }
    fun iterRemoveClass(pos: Int, `name`: String): Unit {
         return stub()
    }
    fun iterRemoveRegion(pos: Int, `name`: String): Unit {
         return stub()
    }
    fun iterSetName(pos: Int, `name`: String): Unit {
         return stub()
    }
    fun iterSetObjectName(pos: Int, `name`: String): Unit {
         return stub()
    }
    fun iterSetObjectType(pos: Int, type: GType): Unit {
         return stub()
    }
    fun iterSetState(pos: Int, state: StateFlags): Unit {
         return stub()
    }
    fun length(): Int {
         return stub()
    }
    fun prependType(type: GType): Unit {
         return stub()
    }
    fun ref(): WidgetPath {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: WidgetPath): CPointer<cnames.structs._GtkWidgetPath> = obj.cptr
    }
}

open class Window internal constructor (private val cptr: CPointer<GtkWindow>) : Bin(cptr.reinterpret()), com.charlag.kgtk.demo.atk.ImplementorIface, Buildable, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(type: WindowType) : this(memScoped { gtk_window_new(type)!! }.reinterpret())

// TODO method set_default_icon_list(), passing lists
    open fun activateDefault(): Boolean {
         return memScoped { gtk_window_activate_default(cptr)!! } != 0
    }
    open fun activateFocus(): Boolean {
         return memScoped { gtk_window_activate_focus(cptr)!! } != 0
    }
    open fun activateKey(event: com.charlag.kgtk.demo.gdk.EventKey): Boolean {
         return memScoped { gtk_window_activate_key(cptr, com.charlag.kgtk.demo.gdk.EventKey.cptr(event))!! } != 0
    }
    open fun addAccelGroup(accel_group: AccelGroup): Unit {
         return memScoped { gtk_window_add_accel_group(cptr, AccelGroup.cptr(accel_group))!! }
    }
    open fun addMnemonic(keyval: UInt, target: Widget): Unit {
         return memScoped { gtk_window_add_mnemonic(cptr, keyval, Widget.cptr(target))!! }
    }
    open fun beginMoveDrag(button: Int, root_x: Int, root_y: Int, timestamp: UInt): Unit {
         return memScoped { gtk_window_begin_move_drag(cptr, button, root_x, root_y, timestamp)!! }
    }
    open fun beginResizeDrag(edge: com.charlag.kgtk.demo.gdk.WindowEdge, button: Int, root_x: Int, root_y: Int, timestamp: UInt): Unit {
         return memScoped { gtk_window_begin_resize_drag(cptr, edge, button, root_x, root_y, timestamp)!! }
    }
    open fun close(): Unit {
         return memScoped { gtk_window_close(cptr)!! }
    }
    open fun deiconify(): Unit {
         return memScoped { gtk_window_deiconify(cptr)!! }
    }
    open fun fullscreen(): Unit {
         return memScoped { gtk_window_fullscreen(cptr)!! }
    }
    open fun fullscreenOnMonitor(screen: com.charlag.kgtk.demo.gdk.Screen, monitor: Int): Unit {
         return memScoped { gtk_window_fullscreen_on_monitor(cptr, com.charlag.kgtk.demo.gdk.Screen.cptr(screen), monitor)!! }
    }
    open fun getAcceptFocus(): Boolean {
         return memScoped { gtk_window_get_accept_focus(cptr)!! } != 0
    }
    open fun getApplication(): Application {
         return Application(memScoped { gtk_window_get_application(cptr)!! })
    }
    open fun getAttachedTo(): Widget {
         return Widget(memScoped { gtk_window_get_attached_to(cptr)!! })
    }
    open fun getDecorated(): Boolean {
         return memScoped { gtk_window_get_decorated(cptr)!! } != 0
    }
    open fun getDefaultSize(width: Int, height: Int): Unit {
         return memScoped { gtk_window_get_default_size(cptr, stub("non-in param"), stub("non-in param"))!! }
    }
    open fun getDefaultWidget(): Widget {
         return Widget(memScoped { gtk_window_get_default_widget(cptr)!! })
    }
    open fun getDeletable(): Boolean {
         return memScoped { gtk_window_get_deletable(cptr)!! } != 0
    }
    open fun getDestroyWithParent(): Boolean {
         return memScoped { gtk_window_get_destroy_with_parent(cptr)!! } != 0
    }
    open fun getFocus(): Widget {
         return Widget(memScoped { gtk_window_get_focus(cptr)!! })
    }
    open fun getFocusOnMap(): Boolean {
         return memScoped { gtk_window_get_focus_on_map(cptr)!! } != 0
    }
    open fun getFocusVisible(): Boolean {
         return memScoped { gtk_window_get_focus_visible(cptr)!! } != 0
    }
    open fun getGravity(): com.charlag.kgtk.demo.gdk.Gravity {
         return memScoped { gtk_window_get_gravity(cptr)!! }
    }
    open fun getGroup(): WindowGroup {
         return WindowGroup(memScoped { gtk_window_get_group(cptr)!! })
    }
    open fun getHideTitlebarWhenMaximized(): Boolean {
         return memScoped { gtk_window_get_hide_titlebar_when_maximized(cptr)!! } != 0
    }
    open fun getIcon(): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return com.charlag.kgtk.demo.gdkpixbuf.Pixbuf(memScoped { gtk_window_get_icon(cptr)!! })
    }
    open fun getIconList(): List<com.charlag.kgtk.demo.gdkpixbuf.Pixbuf> {
         return memScoped { gtk_window_get_icon_list(cptr)!! }.toList<GdkPixbuf>().map { com.charlag.kgtk.demo.gdkpixbuf.Pixbuf(it) }
    }
    open fun getIconName(): String {
         return memScoped { gtk_window_get_icon_name(cptr)!! }.toKString()
    }
    open fun getMnemonicModifier(): com.charlag.kgtk.demo.gdk.ModifierType {
         return /* TODO: ret int GI_INFO_TYPE_FLAGS*/ memScoped { gtk_window_get_mnemonic_modifier(cptr)!! }
    }
    open fun getMnemonicsVisible(): Boolean {
         return memScoped { gtk_window_get_mnemonics_visible(cptr)!! } != 0
    }
    open fun getModal(): Boolean {
         return memScoped { gtk_window_get_modal(cptr)!! } != 0
    }
    open fun getPosition(root_x: Int, root_y: Int): Unit {
         return memScoped { gtk_window_get_position(cptr, stub("non-in param"), stub("non-in param"))!! }
    }
    open fun getResizable(): Boolean {
         return memScoped { gtk_window_get_resizable(cptr)!! } != 0
    }
    open fun getRole(): String {
         return memScoped { gtk_window_get_role(cptr)!! }.toKString()
    }
    override fun getScreen(): com.charlag.kgtk.demo.gdk.Screen {
         return com.charlag.kgtk.demo.gdk.Screen(memScoped { gtk_window_get_screen(cptr)!! })
    }
    open fun getSize(width: Int, height: Int): Unit {
         return memScoped { gtk_window_get_size(cptr, stub("non-in param"), stub("non-in param"))!! }
    }
    open fun getSkipPagerHint(): Boolean {
         return memScoped { gtk_window_get_skip_pager_hint(cptr)!! } != 0
    }
    open fun getSkipTaskbarHint(): Boolean {
         return memScoped { gtk_window_get_skip_taskbar_hint(cptr)!! } != 0
    }
    open fun getTitle(): String {
         return memScoped { gtk_window_get_title(cptr)!! }.toKString()
    }
    open fun getTitlebar(): Widget {
         return Widget(memScoped { gtk_window_get_titlebar(cptr)!! })
    }
    open fun getTransientFor(): Window {
         return Window(memScoped { gtk_window_get_transient_for(cptr)!! })
    }
    open fun getTypeHint(): com.charlag.kgtk.demo.gdk.WindowTypeHint {
         return memScoped { gtk_window_get_type_hint(cptr)!! }
    }
    open fun getUrgencyHint(): Boolean {
         return memScoped { gtk_window_get_urgency_hint(cptr)!! } != 0
    }
    open fun getWindowType(): WindowType {
         return memScoped { gtk_window_get_window_type(cptr)!! }
    }
    open fun hasGroup(): Boolean {
         return memScoped { gtk_window_has_group(cptr)!! } != 0
    }
    open fun hasToplevelFocus(): Boolean {
         return memScoped { gtk_window_has_toplevel_focus(cptr)!! } != 0
    }
    open fun iconify(): Unit {
         return memScoped { gtk_window_iconify(cptr)!! }
    }
    open fun isActive(): Boolean {
         return memScoped { gtk_window_is_active(cptr)!! } != 0
    }
    open fun isMaximized(): Boolean {
         return memScoped { gtk_window_is_maximized(cptr)!! } != 0
    }
    open fun maximize(): Unit {
         return memScoped { gtk_window_maximize(cptr)!! }
    }
    open fun mnemonicActivate(keyval: UInt, modifier: com.charlag.kgtk.demo.gdk.ModifierType): Boolean {
         return memScoped { gtk_window_mnemonic_activate(cptr, keyval, modifier)!! } != 0
    }
    open fun move(x: Int, y: Int): Unit {
         return memScoped { gtk_window_move(cptr, x, y)!! }
    }
    open fun present(): Unit {
         return memScoped { gtk_window_present(cptr)!! }
    }
    open fun presentWithTime(timestamp: UInt): Unit {
         return memScoped { gtk_window_present_with_time(cptr, timestamp)!! }
    }
    open fun propagateKeyEvent(event: com.charlag.kgtk.demo.gdk.EventKey): Boolean {
         return memScoped { gtk_window_propagate_key_event(cptr, com.charlag.kgtk.demo.gdk.EventKey.cptr(event))!! } != 0
    }
    open fun removeAccelGroup(accel_group: AccelGroup): Unit {
         return memScoped { gtk_window_remove_accel_group(cptr, AccelGroup.cptr(accel_group))!! }
    }
    open fun removeMnemonic(keyval: UInt, target: Widget): Unit {
         return memScoped { gtk_window_remove_mnemonic(cptr, keyval, Widget.cptr(target))!! }
    }
    open fun resize(width: Int, height: Int): Unit {
         return memScoped { gtk_window_resize(cptr, width, height)!! }
    }
    open fun setAcceptFocus(setting: Boolean): Unit {
         return memScoped { gtk_window_set_accept_focus(cptr, setting.asGboolean())!! }
    }
    open fun setApplication(application: Application): Unit {
         return memScoped { gtk_window_set_application(cptr, Application.cptr(application))!! }
    }
    open fun setAttachedTo(attach_widget: Widget): Unit {
         return memScoped { gtk_window_set_attached_to(cptr, Widget.cptr(attach_widget))!! }
    }
    open fun setDecorated(setting: Boolean): Unit {
         return memScoped { gtk_window_set_decorated(cptr, setting.asGboolean())!! }
    }
    open fun setDefault(default_widget: Widget): Unit {
         return memScoped { gtk_window_set_default(cptr, Widget.cptr(default_widget))!! }
    }
    open fun setDefaultSize(width: Int, height: Int): Unit {
         return memScoped { gtk_window_set_default_size(cptr, width, height)!! }
    }
    open fun setDeletable(setting: Boolean): Unit {
         return memScoped { gtk_window_set_deletable(cptr, setting.asGboolean())!! }
    }
    open fun setDestroyWithParent(setting: Boolean): Unit {
         return memScoped { gtk_window_set_destroy_with_parent(cptr, setting.asGboolean())!! }
    }
    open fun setFocus(focus: Widget): Unit {
         return memScoped { gtk_window_set_focus(cptr, Widget.cptr(focus))!! }
    }
    open fun setFocusOnMap(setting: Boolean): Unit {
         return memScoped { gtk_window_set_focus_on_map(cptr, setting.asGboolean())!! }
    }
    open fun setFocusVisible(setting: Boolean): Unit {
         return memScoped { gtk_window_set_focus_visible(cptr, setting.asGboolean())!! }
    }
    open fun setGeometryHints(geometry_widget: Widget, geometry: com.charlag.kgtk.demo.gdk.Geometry, geom_mask: com.charlag.kgtk.demo.gdk.WindowHints): Unit {
         return memScoped { gtk_window_set_geometry_hints(cptr, Widget.cptr(geometry_widget), com.charlag.kgtk.demo.gdk.Geometry.cptr(geometry), geom_mask)!! }
    }
    open fun setGravity(gravity: com.charlag.kgtk.demo.gdk.Gravity): Unit {
         return memScoped { gtk_window_set_gravity(cptr, gravity)!! }
    }
    open fun setHasUserRefCount(setting: Boolean): Unit {
         return memScoped { gtk_window_set_has_user_ref_count(cptr, setting.asGboolean())!! }
    }
    open fun setHideTitlebarWhenMaximized(setting: Boolean): Unit {
         return memScoped { gtk_window_set_hide_titlebar_when_maximized(cptr, setting.asGboolean())!! }
    }
    open fun setIcon(icon: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): Unit {
         return memScoped { gtk_window_set_icon(cptr, com.charlag.kgtk.demo.gdkpixbuf.Pixbuf.cptr(icon))!! }
    }
    open fun setIconFromFile(filename: String): Boolean {
         return memScoped {
    val _err = allocPointerTo<GError>()
    val _result = gtk_window_set_icon_from_file(cptr, filename, _err.ptr)
    if (_err.value != null) { g_error_free(_err.value); error("GError") }
    _result!!
} != 0
    }
// TODO method set_icon_list(), passing lists
    open fun setIconName(`name`: String): Unit {
         return memScoped { gtk_window_set_icon_name(cptr, `name`)!! }
    }
    open fun setKeepAbove(setting: Boolean): Unit {
         return memScoped { gtk_window_set_keep_above(cptr, setting.asGboolean())!! }
    }
    open fun setKeepBelow(setting: Boolean): Unit {
         return memScoped { gtk_window_set_keep_below(cptr, setting.asGboolean())!! }
    }
    open fun setMnemonicModifier(modifier: com.charlag.kgtk.demo.gdk.ModifierType): Unit {
         return memScoped { gtk_window_set_mnemonic_modifier(cptr, modifier)!! }
    }
    open fun setMnemonicsVisible(setting: Boolean): Unit {
         return memScoped { gtk_window_set_mnemonics_visible(cptr, setting.asGboolean())!! }
    }
    open fun setModal(modal: Boolean): Unit {
         return memScoped { gtk_window_set_modal(cptr, modal.asGboolean())!! }
    }
    open fun setPosition(position: WindowPosition): Unit {
         return memScoped { gtk_window_set_position(cptr, position)!! }
    }
    open fun setResizable(resizable: Boolean): Unit {
         return memScoped { gtk_window_set_resizable(cptr, resizable.asGboolean())!! }
    }
    open fun setRole(role: String): Unit {
         return memScoped { gtk_window_set_role(cptr, role)!! }
    }
    open fun setScreen(screen: com.charlag.kgtk.demo.gdk.Screen): Unit {
         return memScoped { gtk_window_set_screen(cptr, com.charlag.kgtk.demo.gdk.Screen.cptr(screen))!! }
    }
    open fun setSkipPagerHint(setting: Boolean): Unit {
         return memScoped { gtk_window_set_skip_pager_hint(cptr, setting.asGboolean())!! }
    }
    open fun setSkipTaskbarHint(setting: Boolean): Unit {
         return memScoped { gtk_window_set_skip_taskbar_hint(cptr, setting.asGboolean())!! }
    }
    open fun setStartupId(startup_id: String): Unit {
         return memScoped { gtk_window_set_startup_id(cptr, startup_id)!! }
    }
    open fun setTitle(title: String): Unit {
         return memScoped { gtk_window_set_title(cptr, title)!! }
    }
    open fun setTitlebar(titlebar: Widget): Unit {
         return memScoped { gtk_window_set_titlebar(cptr, Widget.cptr(titlebar))!! }
    }
    open fun setTransientFor(parent: Window): Unit {
         return memScoped { gtk_window_set_transient_for(cptr, Window.cptr(parent))!! }
    }
    open fun setTypeHint(hint: com.charlag.kgtk.demo.gdk.WindowTypeHint): Unit {
         return memScoped { gtk_window_set_type_hint(cptr, hint)!! }
    }
    open fun setUrgencyHint(setting: Boolean): Unit {
         return memScoped { gtk_window_set_urgency_hint(cptr, setting.asGboolean())!! }
    }
    open fun stick(): Unit {
         return memScoped { gtk_window_stick(cptr)!! }
    }
    open fun unfullscreen(): Unit {
         return memScoped { gtk_window_unfullscreen(cptr)!! }
    }
    open fun unmaximize(): Unit {
         return memScoped { gtk_window_unmaximize(cptr)!! }
    }
    open fun unstick(): Unit {
         return memScoped { gtk_window_unstick(cptr)!! }
    }
    fun setOnActivateDefault(cb: () -> Unit) {
        do_connect(cptr, "activate-default", cb)
    }

    fun setOnActivateFocus(cb: () -> Unit) {
        do_connect(cptr, "activate-focus", cb)
    }

    fun setOnEnableDebugging(cb: () -> Unit) {
        do_connect(cptr, "enable-debugging", cb)
    }

    fun setOnKeysChanged(cb: () -> Unit) {
        do_connect(cptr, "keys-changed", cb)
    }

    fun setOnSetFocus(cb: () -> Unit) {
        do_connect(cptr, "set-focus", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 31094528UL
        fun cptr(obj: Window): CPointer<GtkWindow> = obj.cptr
        fun getDefaultIconList(): List<com.charlag.kgtk.demo.gdkpixbuf.Pixbuf> {
    return memScoped { gtk_window_get_default_icon_list()!! }.toList<GdkPixbuf>().map { com.charlag.kgtk.demo.gdkpixbuf.Pixbuf(it) }
}
        fun getDefaultIconName(): String {
    return memScoped { gtk_window_get_default_icon_name()!! }.toKString()
}
        fun listToplevels(): List<Widget> {
    return memScoped { gtk_window_list_toplevels()!! }.toList<GtkWidget>().map { Widget(it) }
}
        fun setAutoStartupNotification(setting: Boolean): Unit {
    return memScoped { gtk_window_set_auto_startup_notification(setting.asGboolean())!! }
}
        fun setDefaultIcon(icon: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf): Unit {
    return memScoped { gtk_window_set_default_icon(com.charlag.kgtk.demo.gdkpixbuf.Pixbuf.cptr(icon))!! }
}
        fun setDefaultIconFromFile(filename: String): Boolean {
    return memScoped {
    val _err = allocPointerTo<GError>()
    val _result = gtk_window_set_default_icon_from_file(filename, _err.ptr)
    if (_err.value != null) { g_error_free(_err.value); error("GError") }
    _result!!
} != 0
}
        fun setDefaultIconName(`name`: String): Unit {
    return memScoped { gtk_window_set_default_icon_name(`name`)!! }
}
        fun setInteractiveDebugging(enable: Boolean): Unit {
    return memScoped { gtk_window_set_interactive_debugging(enable.asGboolean())!! }
}
    }
}

class WindowClass(private val cptr: CPointer<cnames.structs._GtkWindowClass>) /* struct */ {
    companion object {
        fun cptr(obj: WindowClass): CPointer<cnames.structs._GtkWindowClass> = obj.cptr
    }
}

class WindowGeometryInfo(private val cptr: CPointer<cnames.structs._GtkWindowGeometryInfo>) /* struct */ {
    companion object {
        fun cptr(obj: WindowGeometryInfo): CPointer<cnames.structs._GtkWindowGeometryInfo> = obj.cptr
    }
}

open class WindowGroup internal constructor (private val cptr: CPointer<GtkWindowGroup>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<GtkWindowGroup>>())

    open fun addWindow(window: Window): Unit {
         return stub()
    }
    open fun getCurrentDeviceGrab(device: com.charlag.kgtk.demo.gdk.Device): Widget {
         return stub()
    }
    open fun getCurrentGrab(): Widget {
         return stub()
    }
    open fun listWindows(): List<Window> {
         return stub()
    }
    open fun removeWindow(window: Window): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 32100672UL
        fun cptr(obj: WindowGroup): CPointer<GtkWindowGroup> = obj.cptr
    }
}

class WindowGroupClass(private val cptr: CPointer<cnames.structs._GtkWindowGroupClass>) /* struct */ {
    companion object {
        fun cptr(obj: WindowGroupClass): CPointer<cnames.structs._GtkWindowGroupClass> = obj.cptr
    }
}

typealias WindowPosition = GtkWindowPosition

typealias WindowType = GtkWindowType

typealias WrapMode = GtkWrapMode

fun accelGroupsActivate(`object`:  com.charlag.kgtk.demo.gobject.Object, accel_key:  UInt, accel_mods:  com.charlag.kgtk.demo.gdk.ModifierType): Boolean = TODO()
fun accelGroupsFromObject(`object`:  com.charlag.kgtk.demo.gobject.Object): List<AccelGroup> = TODO()
fun acceleratorGetDefaultModMask(): com.charlag.kgtk.demo.gdk.ModifierType = TODO()
fun acceleratorGetLabel(accelerator_key:  UInt, accelerator_mods:  com.charlag.kgtk.demo.gdk.ModifierType): String = TODO()
fun acceleratorGetLabelWithKeycode(display:  com.charlag.kgtk.demo.gdk.Display, accelerator_key:  UInt, keycode:  UInt, accelerator_mods:  com.charlag.kgtk.demo.gdk.ModifierType): String = TODO()
fun acceleratorName(accelerator_key:  UInt, accelerator_mods:  com.charlag.kgtk.demo.gdk.ModifierType): String = TODO()
fun acceleratorNameWithKeycode(display:  com.charlag.kgtk.demo.gdk.Display, accelerator_key:  UInt, keycode:  UInt, accelerator_mods:  com.charlag.kgtk.demo.gdk.ModifierType): String = TODO()
fun acceleratorParse(accelerator:  String, accelerator_key:  UInt, accelerator_mods:  com.charlag.kgtk.demo.gdk.ModifierType): Unit = TODO()
fun acceleratorParseWithKeycode(accelerator:  String, accelerator_key:  UInt, accelerator_codes:  List<UInt>, accelerator_mods:  com.charlag.kgtk.demo.gdk.ModifierType): Unit = TODO()
fun acceleratorSetDefaultModMask(default_mod_mask:  com.charlag.kgtk.demo.gdk.ModifierType): Unit = TODO()
fun acceleratorValid(keyval:  UInt, modifiers:  com.charlag.kgtk.demo.gdk.ModifierType): Boolean = TODO()
fun alternativeDialogButtonOrder(screen:  com.charlag.kgtk.demo.gdk.Screen): Boolean = TODO()
fun bindingEntryAddSignalFromString(binding_set:  BindingSet, signal_desc:  String): com.charlag.kgtk.demo.glib.TokenType = TODO()
fun bindingEntryAddSignall(binding_set:  BindingSet, keyval:  UInt, modifiers:  com.charlag.kgtk.demo.gdk.ModifierType, signal_name:  String, binding_args:  List<BindingArg>): Unit = TODO()
fun bindingEntryRemove(binding_set:  BindingSet, keyval:  UInt, modifiers:  com.charlag.kgtk.demo.gdk.ModifierType): Unit = TODO()
fun bindingEntrySkip(binding_set:  BindingSet, keyval:  UInt, modifiers:  com.charlag.kgtk.demo.gdk.ModifierType): Unit = TODO()
fun bindingSetFind(set_name:  String): BindingSet = TODO()
fun bindingsActivate(`object`:  com.charlag.kgtk.demo.gobject.Object, keyval:  UInt, modifiers:  com.charlag.kgtk.demo.gdk.ModifierType): Boolean = TODO()
fun bindingsActivateEvent(`object`:  com.charlag.kgtk.demo.gobject.Object, event:  com.charlag.kgtk.demo.gdk.EventKey): Boolean = TODO()
fun builderErrorQuark(): UInt = TODO()
fun cairoShouldDrawWindow(cr:  com.charlag.kgtk.demo.cairo.Context, window:  com.charlag.kgtk.demo.gdk.Window): Boolean = TODO()
fun cairoTransformToWindow(cr:  com.charlag.kgtk.demo.cairo.Context, widget:  Widget, window:  com.charlag.kgtk.demo.gdk.Window): Unit = TODO()
fun checkVersion(required_major:  UInt, required_minor:  UInt, required_micro:  UInt): String = TODO()
fun cssProviderErrorQuark(): UInt = TODO()
fun deviceGrabAdd(widget:  Widget, device:  com.charlag.kgtk.demo.gdk.Device, block_others:  Boolean): Unit = TODO()
fun deviceGrabRemove(widget:  Widget, device:  com.charlag.kgtk.demo.gdk.Device): Unit = TODO()
fun disableSetlocale(): Unit = TODO()
fun distributeNaturalAllocation(extra_space:  Int, n_requested_sizes:  UInt, sizes:  RequestedSize): Int = TODO()
fun dragCancel(context:  com.charlag.kgtk.demo.gdk.DragContext): Unit = TODO()
fun dragFinish(context:  com.charlag.kgtk.demo.gdk.DragContext, success:  Boolean, del:  Boolean, time_:  UInt): Unit = TODO()
fun dragGetSourceWidget(context:  com.charlag.kgtk.demo.gdk.DragContext): Widget = TODO()
fun dragSetIconDefault(context:  com.charlag.kgtk.demo.gdk.DragContext): Unit = TODO()
fun dragSetIconGicon(context:  com.charlag.kgtk.demo.gdk.DragContext, icon:  com.charlag.kgtk.demo.gio.Icon, hot_x:  Int, hot_y:  Int): Unit = TODO()
fun dragSetIconName(context:  com.charlag.kgtk.demo.gdk.DragContext, icon_name:  String, hot_x:  Int, hot_y:  Int): Unit = TODO()
fun dragSetIconPixbuf(context:  com.charlag.kgtk.demo.gdk.DragContext, pixbuf:  com.charlag.kgtk.demo.gdkpixbuf.Pixbuf, hot_x:  Int, hot_y:  Int): Unit = TODO()
fun dragSetIconStock(context:  com.charlag.kgtk.demo.gdk.DragContext, stock_id:  String, hot_x:  Int, hot_y:  Int): Unit = TODO()
fun dragSetIconSurface(context:  com.charlag.kgtk.demo.gdk.DragContext, surface:  com.charlag.kgtk.demo.cairo.Surface): Unit = TODO()
fun dragSetIconWidget(context:  com.charlag.kgtk.demo.gdk.DragContext, widget:  Widget, hot_x:  Int, hot_y:  Int): Unit = TODO()
fun drawInsertionCursor(widget:  Widget, cr:  com.charlag.kgtk.demo.cairo.Context, location:  com.charlag.kgtk.demo.gdk.Rectangle, is_primary:  Boolean, direction:  TextDirection, draw_arrow:  Boolean): Unit = TODO()
fun eventsPending(): Boolean = TODO()
fun `false`(): Boolean = TODO()
fun fileChooserErrorQuark(): UInt = TODO()
fun getBinaryAge(): UInt = TODO()
fun getCurrentEvent(): com.charlag.kgtk.demo.gdk.Event = TODO()
fun getCurrentEventDevice(): com.charlag.kgtk.demo.gdk.Device = TODO()
fun getCurrentEventState(state:  com.charlag.kgtk.demo.gdk.ModifierType): Boolean = TODO()
fun getCurrentEventTime(): UInt = TODO()
fun getDebugFlags(): UInt = TODO()
fun getDefaultLanguage(): com.charlag.kgtk.demo.pango.Language = TODO()
fun getEventWidget(event:  com.charlag.kgtk.demo.gdk.Event): Widget = TODO()
fun getInterfaceAge(): UInt = TODO()
fun getLocaleDirection(): TextDirection = TODO()
fun getMajorVersion(): UInt = TODO()
fun getMicroVersion(): UInt = TODO()
fun getMinorVersion(): UInt = TODO()
fun getOptionGroup(open_default_display:  Boolean): com.charlag.kgtk.demo.glib.OptionGroup = TODO()
fun grabGetCurrent(): Widget = TODO()
fun iconSizeFromName(`name`:  String): Int = TODO()
fun iconSizeGetName(size:  Int): String = TODO()
fun iconSizeLookup(size:  Int, width:  Int, height:  Int): Boolean = TODO()
fun iconSizeLookupForSettings(settings:  Settings, size:  Int, width:  Int, height:  Int): Boolean = TODO()
fun iconSizeRegister(`name`:  String, width:  Int, height:  Int): Int = TODO()
fun iconSizeRegisterAlias(alias:  String, target:  Int): Unit = TODO()
fun iconThemeErrorQuark(): UInt = TODO()
fun init(argc:  Int, argv:  List<String>): Unit = TODO()
fun initCheck(argc:  Int, argv:  List<String>): Boolean = TODO()
fun initWithArgs(argc:  Int, argv:  List<String>, parameter_string:  String, entries:  List<com.charlag.kgtk.demo.glib.OptionEntry>, translation_domain:  String): Boolean = TODO()
fun keySnooperRemove(snooper_handler_id:  UInt): Unit = TODO()
fun main(): Unit = TODO()
fun mainDoEvent(event:  com.charlag.kgtk.demo.gdk.Event): Unit = TODO()
fun mainIteration(): Boolean = TODO()
fun mainIterationDo(blocking:  Boolean): Boolean = TODO()
fun mainLevel(): UInt = TODO()
fun mainQuit(): Unit = TODO()
fun paintArrow(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, shadow_type:  ShadowType, widget:  Widget, detail:  String, arrow_type:  ArrowType, fill:  Boolean, x:  Int, y:  Int, width:  Int, height:  Int): Unit = TODO()
fun paintBox(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, shadow_type:  ShadowType, widget:  Widget, detail:  String, x:  Int, y:  Int, width:  Int, height:  Int): Unit = TODO()
fun paintBoxGap(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, shadow_type:  ShadowType, widget:  Widget, detail:  String, x:  Int, y:  Int, width:  Int, height:  Int, gap_side:  PositionType, gap_x:  Int, gap_width:  Int): Unit = TODO()
fun paintCheck(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, shadow_type:  ShadowType, widget:  Widget, detail:  String, x:  Int, y:  Int, width:  Int, height:  Int): Unit = TODO()
fun paintDiamond(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, shadow_type:  ShadowType, widget:  Widget, detail:  String, x:  Int, y:  Int, width:  Int, height:  Int): Unit = TODO()
fun paintExpander(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, widget:  Widget, detail:  String, x:  Int, y:  Int, expander_style:  ExpanderStyle): Unit = TODO()
fun paintExtension(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, shadow_type:  ShadowType, widget:  Widget, detail:  String, x:  Int, y:  Int, width:  Int, height:  Int, gap_side:  PositionType): Unit = TODO()
fun paintFlatBox(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, shadow_type:  ShadowType, widget:  Widget, detail:  String, x:  Int, y:  Int, width:  Int, height:  Int): Unit = TODO()
fun paintFocus(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, widget:  Widget, detail:  String, x:  Int, y:  Int, width:  Int, height:  Int): Unit = TODO()
fun paintHandle(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, shadow_type:  ShadowType, widget:  Widget, detail:  String, x:  Int, y:  Int, width:  Int, height:  Int, orientation:  Orientation): Unit = TODO()
fun paintHline(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, widget:  Widget, detail:  String, x1:  Int, x2:  Int, y:  Int): Unit = TODO()
fun paintLayout(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, use_text:  Boolean, widget:  Widget, detail:  String, x:  Int, y:  Int, layout:  com.charlag.kgtk.demo.pango.Layout): Unit = TODO()
fun paintOption(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, shadow_type:  ShadowType, widget:  Widget, detail:  String, x:  Int, y:  Int, width:  Int, height:  Int): Unit = TODO()
fun paintResizeGrip(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, widget:  Widget, detail:  String, edge:  com.charlag.kgtk.demo.gdk.WindowEdge, x:  Int, y:  Int, width:  Int, height:  Int): Unit = TODO()
fun paintShadow(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, shadow_type:  ShadowType, widget:  Widget, detail:  String, x:  Int, y:  Int, width:  Int, height:  Int): Unit = TODO()
fun paintShadowGap(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, shadow_type:  ShadowType, widget:  Widget, detail:  String, x:  Int, y:  Int, width:  Int, height:  Int, gap_side:  PositionType, gap_x:  Int, gap_width:  Int): Unit = TODO()
fun paintSlider(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, shadow_type:  ShadowType, widget:  Widget, detail:  String, x:  Int, y:  Int, width:  Int, height:  Int, orientation:  Orientation): Unit = TODO()
fun paintSpinner(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, widget:  Widget, detail:  String, step:  UInt, x:  Int, y:  Int, width:  Int, height:  Int): Unit = TODO()
fun paintTab(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, shadow_type:  ShadowType, widget:  Widget, detail:  String, x:  Int, y:  Int, width:  Int, height:  Int): Unit = TODO()
fun paintVline(style:  Style, cr:  com.charlag.kgtk.demo.cairo.Context, state_type:  StateType, widget:  Widget, detail:  String, y1_:  Int, y2_:  Int, x:  Int): Unit = TODO()
fun paperSizeGetDefault(): String = TODO()
fun paperSizeGetPaperSizes(include_custom:  Boolean): List<PaperSize> = TODO()
fun parseArgs(argc:  Int, argv:  List<String>): Boolean = TODO()
fun printErrorQuark(): UInt = TODO()
fun printRunPageSetupDialog(parent:  Window, page_setup:  PageSetup, settings:  PrintSettings): PageSetup = TODO()
fun printRunPageSetupDialogAsync(parent:  Window, page_setup:  PageSetup, settings:  PrintSettings, done_cb:  PageSetupDoneFunc, data:  Any): Unit = TODO()
fun propagateEvent(widget:  Widget, event:  com.charlag.kgtk.demo.gdk.Event): Unit = TODO()
fun rcAddDefaultFile(filename:  String): Unit = TODO()
fun rcFindModuleInPath(module_file:  String): String = TODO()
fun rcFindPixmapInPath(settings:  Settings, scanner:  com.charlag.kgtk.demo.glib.Scanner, pixmap_file:  String): String = TODO()
fun rcGetDefaultFiles(): List<String> = TODO()
fun rcGetImModuleFile(): String = TODO()
fun rcGetImModulePath(): String = TODO()
fun rcGetModuleDir(): String = TODO()
fun rcGetStyle(widget:  Widget): Style = TODO()
fun rcGetStyleByPaths(settings:  Settings, widget_path:  String, class_path:  String, type:  GType): Style = TODO()
fun rcGetThemeDir(): String = TODO()
fun rcParse(filename:  String): Unit = TODO()
fun rcParseColor(scanner:  com.charlag.kgtk.demo.glib.Scanner, color:  com.charlag.kgtk.demo.gdk.Color): UInt = TODO()
fun rcParseColorFull(scanner:  com.charlag.kgtk.demo.glib.Scanner, style:  RcStyle, color:  com.charlag.kgtk.demo.gdk.Color): UInt = TODO()
fun rcParsePriority(scanner:  com.charlag.kgtk.demo.glib.Scanner, priority:  PathPriorityType): UInt = TODO()
fun rcParseState(scanner:  com.charlag.kgtk.demo.glib.Scanner, state:  StateType): UInt = TODO()
fun rcParseString(rc_string:  String): Unit = TODO()
fun rcPropertyParseBorder(pspec:  com.charlag.kgtk.demo.gobject.ParamSpec, gstring:  com.charlag.kgtk.demo.glib.String, property_value:  com.charlag.kgtk.demo.gobject.Value): Boolean = TODO()
fun rcPropertyParseColor(pspec:  com.charlag.kgtk.demo.gobject.ParamSpec, gstring:  com.charlag.kgtk.demo.glib.String, property_value:  com.charlag.kgtk.demo.gobject.Value): Boolean = TODO()
fun rcPropertyParseEnum(pspec:  com.charlag.kgtk.demo.gobject.ParamSpec, gstring:  com.charlag.kgtk.demo.glib.String, property_value:  com.charlag.kgtk.demo.gobject.Value): Boolean = TODO()
fun rcPropertyParseFlags(pspec:  com.charlag.kgtk.demo.gobject.ParamSpec, gstring:  com.charlag.kgtk.demo.glib.String, property_value:  com.charlag.kgtk.demo.gobject.Value): Boolean = TODO()
fun rcPropertyParseRequisition(pspec:  com.charlag.kgtk.demo.gobject.ParamSpec, gstring:  com.charlag.kgtk.demo.glib.String, property_value:  com.charlag.kgtk.demo.gobject.Value): Boolean = TODO()
fun rcReparseAll(): Boolean = TODO()
fun rcReparseAllForSettings(settings:  Settings, force_load:  Boolean): Boolean = TODO()
fun rcResetStyles(settings:  Settings): Unit = TODO()
fun rcSetDefaultFiles(filenames:  List<String>): Unit = TODO()
fun recentChooserErrorQuark(): UInt = TODO()
fun recentManagerErrorQuark(): UInt = TODO()
fun renderActivity(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x:  Double, y:  Double, width:  Double, height:  Double): Unit = TODO()
fun renderArrow(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, angle:  Double, x:  Double, y:  Double, size:  Double): Unit = TODO()
fun renderBackground(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x:  Double, y:  Double, width:  Double, height:  Double): Unit = TODO()
fun renderBackgroundGetClip(context:  StyleContext, x:  Double, y:  Double, width:  Double, height:  Double, out_clip:  com.charlag.kgtk.demo.gdk.Rectangle): Unit = TODO()
fun renderCheck(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x:  Double, y:  Double, width:  Double, height:  Double): Unit = TODO()
fun renderExpander(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x:  Double, y:  Double, width:  Double, height:  Double): Unit = TODO()
fun renderExtension(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x:  Double, y:  Double, width:  Double, height:  Double, gap_side:  PositionType): Unit = TODO()
fun renderFocus(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x:  Double, y:  Double, width:  Double, height:  Double): Unit = TODO()
fun renderFrame(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x:  Double, y:  Double, width:  Double, height:  Double): Unit = TODO()
fun renderFrameGap(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x:  Double, y:  Double, width:  Double, height:  Double, gap_side:  PositionType, xy0_gap:  Double, xy1_gap:  Double): Unit = TODO()
fun renderHandle(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x:  Double, y:  Double, width:  Double, height:  Double): Unit = TODO()
fun renderIcon(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, pixbuf:  com.charlag.kgtk.demo.gdkpixbuf.Pixbuf, x:  Double, y:  Double): Unit = TODO()
fun renderIconPixbuf(context:  StyleContext, source:  IconSource, size:  Int): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf = TODO()
fun renderIconSurface(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, surface:  com.charlag.kgtk.demo.cairo.Surface, x:  Double, y:  Double): Unit = TODO()
fun renderInsertionCursor(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x:  Double, y:  Double, layout:  com.charlag.kgtk.demo.pango.Layout, index:  Int, direction:  com.charlag.kgtk.demo.pango.Direction): Unit = TODO()
fun renderLayout(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x:  Double, y:  Double, layout:  com.charlag.kgtk.demo.pango.Layout): Unit = TODO()
fun renderLine(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x0:  Double, y0:  Double, x1:  Double, y1:  Double): Unit = TODO()
fun renderOption(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x:  Double, y:  Double, width:  Double, height:  Double): Unit = TODO()
fun renderSlider(context:  StyleContext, cr:  com.charlag.kgtk.demo.cairo.Context, x:  Double, y:  Double, width:  Double, height:  Double, orientation:  Orientation): Unit = TODO()
fun rgbToHsv(r:  Double, g:  Double, b:  Double, h:  Double, s:  Double, v:  Double): Unit = TODO()
fun selectionAddTarget(widget:  Widget, selection:  com.charlag.kgtk.demo.gdk.Atom, target:  com.charlag.kgtk.demo.gdk.Atom, info:  UInt): Unit = TODO()
fun selectionAddTargets(widget:  Widget, selection:  com.charlag.kgtk.demo.gdk.Atom, targets:  List<TargetEntry>, ntargets:  UInt): Unit = TODO()
fun selectionClearTargets(widget:  Widget, selection:  com.charlag.kgtk.demo.gdk.Atom): Unit = TODO()
fun selectionConvert(widget:  Widget, selection:  com.charlag.kgtk.demo.gdk.Atom, target:  com.charlag.kgtk.demo.gdk.Atom, time_:  UInt): Boolean = TODO()
fun selectionOwnerSet(widget:  Widget, selection:  com.charlag.kgtk.demo.gdk.Atom, time_:  UInt): Boolean = TODO()
fun selectionOwnerSetForDisplay(display:  com.charlag.kgtk.demo.gdk.Display, widget:  Widget, selection:  com.charlag.kgtk.demo.gdk.Atom, time_:  UInt): Boolean = TODO()
fun selectionRemoveAll(widget:  Widget): Unit = TODO()
fun setDebugFlags(flags:  UInt): Unit = TODO()
fun showUri(screen:  com.charlag.kgtk.demo.gdk.Screen, uri:  String, timestamp:  UInt): Boolean = TODO()
fun showUriOnWindow(parent:  Window, uri:  String, timestamp:  UInt): Boolean = TODO()
fun stockAdd(items:  List<StockItem>, n_items:  UInt): Unit = TODO()
fun stockAddStatic(items:  List<StockItem>, n_items:  UInt): Unit = TODO()
fun stockListIds(): List<String> = TODO()
fun stockLookup(stock_id:  String, item:  StockItem): Boolean = TODO()
fun stockSetTranslateFunc(domain:  String, func:  TranslateFunc, data:  Any, notify:  com.charlag.kgtk.demo.glib.DestroyNotify): Unit = TODO()
fun targetTableFree(targets:  List<TargetEntry>, n_targets:  Int): Unit = TODO()
fun targetTableNewFromList(list:  TargetList, n_targets:  Int): List<TargetEntry> = TODO()
fun targetsIncludeImage(targets:  List<com.charlag.kgtk.demo.gdk.Atom>, n_targets:  Int, writable:  Boolean): Boolean = TODO()
fun targetsIncludeRichText(targets:  List<com.charlag.kgtk.demo.gdk.Atom>, n_targets:  Int, buffer:  TextBuffer): Boolean = TODO()
fun targetsIncludeText(targets:  List<com.charlag.kgtk.demo.gdk.Atom>, n_targets:  Int): Boolean = TODO()
fun targetsIncludeUri(targets:  List<com.charlag.kgtk.demo.gdk.Atom>, n_targets:  Int): Boolean = TODO()
fun testCreateSimpleWindow(window_title:  String, dialog_text:  String): Widget = TODO()
fun testFindLabel(widget:  Widget, label_pattern:  String): Widget = TODO()
fun testFindSibling(base_widget:  Widget, widget_type:  GType): Widget = TODO()
fun testFindWidget(widget:  Widget, label_pattern:  String, widget_type:  GType): Widget = TODO()
fun testListAllTypes(n_types:  UInt): List<GType> = TODO()
fun testRegisterAllTypes(): Unit = TODO()
fun testSliderGetValue(widget:  Widget): Double = TODO()
fun testSliderSetPerc(widget:  Widget, percentage:  Double): Unit = TODO()
fun testSpinButtonClick(spinner:  SpinButton, button:  UInt, upwards:  Boolean): Boolean = TODO()
fun testTextGet(widget:  Widget): String = TODO()
fun testTextSet(widget:  Widget, string:  String): Unit = TODO()
fun testWidgetClick(widget:  Widget, button:  UInt, modifiers:  com.charlag.kgtk.demo.gdk.ModifierType): Boolean = TODO()
fun testWidgetSendKey(widget:  Widget, keyval:  UInt, modifiers:  com.charlag.kgtk.demo.gdk.ModifierType): Boolean = TODO()
fun testWidgetWaitForDraw(widget:  Widget): Unit = TODO()
fun treeGetRowDragData(selection_data:  SelectionData, tree_model:  TreeModel, path:  TreePath): Boolean = TODO()
fun treeRowReferenceDeleted(proxy:  com.charlag.kgtk.demo.gobject.Object, path:  TreePath): Unit = TODO()
fun treeRowReferenceInserted(proxy:  com.charlag.kgtk.demo.gobject.Object, path:  TreePath): Unit = TODO()
fun treeSetRowDragData(selection_data:  SelectionData, tree_model:  TreeModel, path:  TreePath): Boolean = TODO()
fun `true`(): Boolean = TODO()
