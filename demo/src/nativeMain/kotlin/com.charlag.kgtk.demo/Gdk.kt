// Namespace: Gdk
@file:Suppress("RemoveRedundantBackticks", "UNUSED_PARAMETER", "FunctionName", "RedundantUnitReturnType", "unused", "RemoveRedundantQualifierName")
package com.charlag.kgtk.demo.gdk

import com.charlag.kgtk.demo.prelude.*
import gtk3.*
import kotlinx.cinterop.*
import com.charlag.kgtk.demo.prelude.GType

typealias AnchorHints = GdkAnchorHints

open class AppLaunchContext internal constructor (private val cptr: CPointer<GdkAppLaunchContext>) : com.charlag.kgtk.demo.gio.AppLaunchContext(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun setDesktop(desktop: Int): Unit {
         return stub()
    }
    open fun setIcon(icon: com.charlag.kgtk.demo.gio.Icon): Unit {
         return stub()
    }
    open fun setIconName(icon_name: String): Unit {
         return stub()
    }
    open fun setScreen(screen: Screen): Unit {
         return stub()
    }
    open fun setTimestamp(timestamp: UInt): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 36454752UL
        fun cptr(obj: AppLaunchContext): CPointer<GdkAppLaunchContext> = obj.cptr
    }
}

class Atom(private val cptr: CPointer<cnames.structs._GdkAtom>) /* struct */ {
    fun `name`(): String {
         return stub()
    }
    fun intern(atom_name: String, only_if_exists: Boolean): Atom {
         return stub()
    }
    fun internStaticString(atom_name: String): Atom {
         return stub()
    }
    companion object {
        fun cptr(obj: Atom): CPointer<cnames.structs._GdkAtom> = obj.cptr
    }
}

typealias AxisFlags = GdkAxisFlags

typealias AxisUse = GdkAxisUse

val BUTTON_MIDDLE: Int get() = TODO()

val BUTTON_PRIMARY: Int get() = TODO()

val BUTTON_SECONDARY: Int get() = TODO()

typealias ByteOrder = GdkByteOrder

val CURRENT_TIME: Int get() = TODO()

class Color(private val cptr: CPointer<cnames.structs._GdkColor>) /* struct */ {
    fun copy(): Color {
         return stub()
    }
    fun equal(colorb: Color): Boolean {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun hash(): UInt {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    fun parse(spec: String, color: Color): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: Color): CPointer<cnames.structs._GdkColor> = obj.cptr
    }
}

typealias CrossingMode = GdkCrossingMode

open class Cursor internal constructor (private val cptr: CPointer<GdkCursor>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getCursorType(): CursorType {
         return stub()
    }
    open fun getDisplay(): Display {
         return stub()
    }
    open fun getImage(): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf {
         return stub()
    }
    open fun getSurface(x_hot: Double, y_hot: Double): com.charlag.kgtk.demo.cairo.Surface {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 34720528UL
        fun cptr(obj: Cursor): CPointer<GdkCursor> = obj.cptr
        fun newForDisplay(display: Display, cursor_type: CursorType): Cursor = Cursor(stub<CPointer<GdkCursor>>()) 
        fun newFromName(display: Display, `name`: String): Cursor = Cursor(stub<CPointer<GdkCursor>>()) 
        fun newFromPixbuf(display: Display, pixbuf: com.charlag.kgtk.demo.gdkpixbuf.Pixbuf, x: Int, y: Int): Cursor = Cursor(stub<CPointer<GdkCursor>>()) 
        fun newFromSurface(display: Display, surface: com.charlag.kgtk.demo.cairo.Surface, x: Double, y: Double): Cursor = Cursor(stub<CPointer<GdkCursor>>()) 
    }
}

typealias CursorType = GdkCursorType

open class Device internal constructor (private val cptr: CPointer<GdkDevice>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getAssociatedDevice(): Device {
         return stub()
    }
    open fun getAxes(): AxisFlags {
         return stub()
    }
    open fun getAxisUse(index_: UInt): AxisUse {
         return stub()
    }
    open fun getDeviceType(): DeviceType {
         return stub()
    }
    open fun getDisplay(): Display {
         return stub()
    }
    open fun getHasCursor(): Boolean {
         return stub()
    }
    open fun getKey(index_: UInt, keyval: UInt, modifiers: ModifierType): Boolean {
         return stub()
    }
    open fun getLastEventWindow(): Window {
         return stub()
    }
    open fun getMode(): InputMode {
         return stub()
    }
    open fun getNAxes(): Int {
         return stub()
    }
    open fun getNKeys(): Int {
         return stub()
    }
    open fun getName(): String {
         return stub()
    }
    open fun getPosition(screen: Screen, x: Int, y: Int): Unit {
         return stub()
    }
    open fun getPositionDouble(screen: Screen, x: Double, y: Double): Unit {
         return stub()
    }
    open fun getProductId(): String {
         return stub()
    }
    open fun getSeat(): Seat {
         return stub()
    }
    open fun getSource(): InputSource {
         return stub()
    }
    open fun getVendorId(): String {
         return stub()
    }
    open fun getWindowAtPosition(win_x: Int, win_y: Int): Window {
         return stub()
    }
    open fun getWindowAtPositionDouble(win_x: Double, win_y: Double): Window {
         return stub()
    }
    open fun listAxes(): List<Atom> {
         return stub()
    }
    open fun listSlaveDevices(): List<Device> {
         return stub()
    }
    open fun setAxisUse(index_: UInt, use: AxisUse): Unit {
         return stub()
    }
    open fun setKey(index_: UInt, keyval: UInt, modifiers: ModifierType): Unit {
         return stub()
    }
    open fun setMode(mode: InputMode): Boolean {
         return stub()
    }
    open fun warp(screen: Screen, x: Int, y: Int): Unit {
         return stub()
    }
    fun setOnChanged(cb: () -> Unit) {
        do_connect(cptr, "changed", cb)
    }

    fun setOnToolChanged(cb: () -> Unit) {
        do_connect(cptr, "tool-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 28308336UL
        fun cptr(obj: Device): CPointer<GdkDevice> = obj.cptr
    }
}

open class DeviceManager internal constructor (private val cptr: CPointer<GdkDeviceManager>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getDisplay(): Display {
         return stub()
    }
    fun setOnDeviceAdded(cb: () -> Unit) {
        do_connect(cptr, "device-added", cb)
    }

    fun setOnDeviceChanged(cb: () -> Unit) {
        do_connect(cptr, "device-changed", cb)
    }

    fun setOnDeviceRemoved(cb: () -> Unit) {
        do_connect(cptr, "device-removed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 25660496UL
        fun cptr(obj: DeviceManager): CPointer<GdkDeviceManager> = obj.cptr
    }
}

interface DevicePad : InteropWrapper {
    fun getFeatureGroup(feature: DevicePadFeature, feature_idx: Int): Int = stub("DevicePad default impl")

    fun getGroupNModes(group_idx: Int): Int = stub("DevicePad default impl")

    fun getNFeatures(feature: DevicePadFeature): Int = stub("DevicePad default impl")

    fun getNGroups(): Int = stub("DevicePad default impl")

    companion object {
        fun cptr(obj: DevicePad): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GdkDevicePad>) : DevicePad {
        override val rawPtr: COpaquePointer = cptr
    }
}

typealias DevicePadFeature = GdkDevicePadFeature

class DevicePadInterface(private val cptr: CPointer<cnames.structs._GdkDevicePadInterface>) /* struct */ {
    companion object {
        fun cptr(obj: DevicePadInterface): CPointer<cnames.structs._GdkDevicePadInterface> = obj.cptr
    }
}

open class DeviceTool internal constructor (private val cptr: CPointer<GdkDeviceTool>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getHardwareId(): ULong {
         return stub()
    }
    open fun getSerial(): ULong {
         return stub()
    }
    open fun getToolType(): DeviceToolType {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 26733440UL
        fun cptr(obj: DeviceTool): CPointer<GdkDeviceTool> = obj.cptr
    }
}

typealias DeviceToolType = GdkDeviceToolType

typealias DeviceType = GdkDeviceType

open class Display internal constructor (private val cptr: CPointer<GdkDisplay>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun beep(): Unit {
         return stub()
    }
    open fun close(): Unit {
         return stub()
    }
    open fun deviceIsGrabbed(device: Device): Boolean {
         return stub()
    }
    open fun flush(): Unit {
         return stub()
    }
    open fun getAppLaunchContext(): AppLaunchContext {
         return stub()
    }
    open fun getDefaultCursorSize(): UInt {
         return stub()
    }
    open fun getDefaultGroup(): Window {
         return stub()
    }
    open fun getDefaultScreen(): Screen {
         return stub()
    }
    open fun getDefaultSeat(): Seat {
         return stub()
    }
    open fun getEvent(): Event {
         return stub()
    }
    open fun getMaximalCursorSize(width: UInt, height: UInt): Unit {
         return stub()
    }
    open fun getMonitor(monitor_num: Int): Monitor {
         return stub()
    }
    open fun getMonitorAtPoint(x: Int, y: Int): Monitor {
         return stub()
    }
    open fun getMonitorAtWindow(window: Window): Monitor {
         return stub()
    }
    open fun getNMonitors(): Int {
         return stub()
    }
    open fun getName(): String {
         return stub()
    }
    open fun getPrimaryMonitor(): Monitor {
         return stub()
    }
    open fun hasPending(): Boolean {
         return stub()
    }
    open fun isClosed(): Boolean {
         return stub()
    }
    open fun listSeats(): List<Seat> {
         return stub()
    }
    open fun notifyStartupComplete(startup_id: String): Unit {
         return stub()
    }
    open fun peekEvent(): Event {
         return stub()
    }
    open fun putEvent(event: Event): Unit {
         return stub()
    }
    open fun requestSelectionNotification(selection: Atom): Boolean {
         return stub()
    }
    open fun setDoubleClickDistance(distance: UInt): Unit {
         return stub()
    }
    open fun setDoubleClickTime(msec: UInt): Unit {
         return stub()
    }
    open fun storeClipboard(clipboard_window: Window, time_: UInt, targets: List<Atom>, n_targets: Int): Unit {
         return stub()
    }
    open fun supportsClipboardPersistence(): Boolean {
         return stub()
    }
    open fun supportsCursorAlpha(): Boolean {
         return stub()
    }
    open fun supportsCursorColor(): Boolean {
         return stub()
    }
    open fun supportsInputShapes(): Boolean {
         return stub()
    }
    open fun supportsSelectionNotification(): Boolean {
         return stub()
    }
    open fun supportsShapes(): Boolean {
         return stub()
    }
    open fun sync(): Unit {
         return stub()
    }
    fun setOnClosed(cb: () -> Unit) {
        do_connect(cptr, "closed", cb)
    }

    fun setOnMonitorAdded(cb: () -> Unit) {
        do_connect(cptr, "monitor-added", cb)
    }

    fun setOnMonitorRemoved(cb: () -> Unit) {
        do_connect(cptr, "monitor-removed", cb)
    }

    fun setOnOpened(cb: () -> Unit) {
        do_connect(cptr, "opened", cb)
    }

    fun setOnSeatAdded(cb: () -> Unit) {
        do_connect(cptr, "seat-added", cb)
    }

    fun setOnSeatRemoved(cb: () -> Unit) {
        do_connect(cptr, "seat-removed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 27287792UL
        fun cptr(obj: Display): CPointer<GdkDisplay> = obj.cptr
        fun getDefault(): Display {
    return stub()
}
        fun open(display_name: String): Display {
    return stub()
}
    }
}

open class DisplayManager internal constructor (private val cptr: CPointer<GdkDisplayManager>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getDefaultDisplay(): Display {
         return stub()
    }
    open fun listDisplays(): List<Display> {
         return stub()
    }
    open fun openDisplay(`name`: String): Display {
         return stub()
    }
    open fun setDefaultDisplay(display: Display): Unit {
         return stub()
    }
    fun setOnDisplayOpened(cb: () -> Unit) {
        do_connect(cptr, "display-opened", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 28047792UL
        fun cptr(obj: DisplayManager): CPointer<GdkDisplayManager> = obj.cptr
        fun get(): DisplayManager {
    return stub()
}
    }
}

typealias DragAction = GdkDragAction

typealias DragCancelReason = GdkDragCancelReason

open class DragContext internal constructor (private val cptr: CPointer<GdkDragContext>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getActions(): DragAction {
         return stub()
    }
    open fun getDestWindow(): Window {
         return stub()
    }
    open fun getDevice(): Device {
         return stub()
    }
    open fun getDragWindow(): Window {
         return stub()
    }
    open fun getProtocol(): DragProtocol {
         return stub()
    }
    open fun getSelectedAction(): DragAction {
         return stub()
    }
    open fun getSourceWindow(): Window {
         return stub()
    }
    open fun getSuggestedAction(): DragAction {
         return stub()
    }
    open fun listTargets(): List<Atom> {
         return stub()
    }
    open fun manageDnd(ipc_window: Window, actions: DragAction): Boolean {
         return stub()
    }
    open fun setDevice(device: Device): Unit {
         return stub()
    }
    open fun setHotspot(hot_x: Int, hot_y: Int): Unit {
         return stub()
    }
    fun setOnActionChanged(cb: () -> Unit) {
        do_connect(cptr, "action-changed", cb)
    }

    fun setOnCancel(cb: () -> Unit) {
        do_connect(cptr, "cancel", cb)
    }

    fun setOnDndFinished(cb: () -> Unit) {
        do_connect(cptr, "dnd-finished", cb)
    }

    fun setOnDropPerformed(cb: () -> Unit) {
        do_connect(cptr, "drop-performed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 26300272UL
        fun cptr(obj: DragContext): CPointer<GdkDragContext> = obj.cptr
    }
}

typealias DragProtocol = GdkDragProtocol

open class DrawingContext internal constructor (private val cptr: CPointer<GdkDrawingContext>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getCairoContext(): com.charlag.kgtk.demo.cairo.Context {
         return stub()
    }
    open fun getClip(): com.charlag.kgtk.demo.cairo.Region {
         return stub()
    }
    open fun getWindow(): Window {
         return stub()
    }
    open fun isValid(): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 27509392UL
        fun cptr(obj: DrawingContext): CPointer<GdkDrawingContext> = obj.cptr
    }
}

class DrawingContextClass(private val cptr: CPointer<cnames.structs._GdkDrawingContextClass>) /* struct */ {
    companion object {
        fun cptr(obj: DrawingContextClass): CPointer<cnames.structs._GdkDrawingContextClass> = obj.cptr
    }
}

val EVENT_PROPAGATE: Boolean get() = TODO()

val EVENT_STOP: Boolean get() = TODO()

class Event(private val cptr: CPointer<cnames.structs._GdkEvent>) /* union */ {
    fun new(type: EventType): Event {
         return stub()
    }
    fun GetAngle(event2: Event, angle: Double): Boolean {
         return stub()
    }
    fun GetCenter(event2: Event, x: Double, y: Double): Boolean {
         return stub()
    }
    fun GetDistance(event2: Event, distance: Double): Boolean {
         return stub()
    }
    fun copy(): Event {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getAxis(axis_use: AxisUse, value: Double): Boolean {
         return stub()
    }
    fun getButton(button: UInt): Boolean {
         return stub()
    }
    fun getClickCount(click_count: UInt): Boolean {
         return stub()
    }
    fun getCoords(x_win: Double, y_win: Double): Boolean {
         return stub()
    }
    fun getDevice(): Device {
         return stub()
    }
    fun getDeviceTool(): DeviceTool {
         return stub()
    }
    fun getEventSequence(): EventSequence {
         return stub()
    }
    fun getEventType(): EventType {
         return stub()
    }
    fun getKeycode(keycode: UShort): Boolean {
         return stub()
    }
    fun getKeyval(keyval: UInt): Boolean {
         return stub()
    }
    fun getPointerEmulated(): Boolean {
         return stub()
    }
    fun getRootCoords(x_root: Double, y_root: Double): Boolean {
         return stub()
    }
    fun getScancode(): Int {
         return stub()
    }
    fun getScreen(): Screen {
         return stub()
    }
    fun getScrollDeltas(delta_x: Double, delta_y: Double): Boolean {
         return stub()
    }
    fun getScrollDirection(direction: ScrollDirection): Boolean {
         return stub()
    }
    fun getSeat(): Seat {
         return stub()
    }
    fun getSourceDevice(): Device {
         return stub()
    }
    fun getState(state: ModifierType): Boolean {
         return stub()
    }
    fun getTime(): UInt {
         return stub()
    }
    fun getWindow(): Window {
         return stub()
    }
    fun isScrollStopEvent(): Boolean {
         return stub()
    }
    fun put(): Unit {
         return stub()
    }
    fun setDevice(device: Device): Unit {
         return stub()
    }
    fun setDeviceTool(tool: DeviceTool): Unit {
         return stub()
    }
    fun setScreen(screen: Screen): Unit {
         return stub()
    }
    fun setSourceDevice(device: Device): Unit {
         return stub()
    }
    fun triggersContextMenu(): Boolean {
         return stub()
    }
    fun get(): Event {
         return stub()
    }
    fun handlerSet(func: EventFunc, data: Any, notify: com.charlag.kgtk.demo.glib.DestroyNotify): Unit {
         return stub()
    }
    fun peek(): Event {
         return stub()
    }
    fun requestMotions(event: EventMotion): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Event): CPointer<cnames.structs._GdkEvent> = obj.cptr
    }
}

class EventAny(private val cptr: CPointer<cnames.structs._GdkEventAny>) /* struct */ {
    companion object {
        fun cptr(obj: EventAny): CPointer<cnames.structs._GdkEventAny> = obj.cptr
    }
}

class EventButton(private val cptr: CPointer<cnames.structs._GdkEventButton>) /* struct */ {
    companion object {
        fun cptr(obj: EventButton): CPointer<cnames.structs._GdkEventButton> = obj.cptr
    }
}

class EventConfigure(private val cptr: CPointer<cnames.structs._GdkEventConfigure>) /* struct */ {
    companion object {
        fun cptr(obj: EventConfigure): CPointer<cnames.structs._GdkEventConfigure> = obj.cptr
    }
}

class EventCrossing(private val cptr: CPointer<cnames.structs._GdkEventCrossing>) /* struct */ {
    companion object {
        fun cptr(obj: EventCrossing): CPointer<cnames.structs._GdkEventCrossing> = obj.cptr
    }
}

class EventDND(private val cptr: CPointer<cnames.structs._GdkEventDND>) /* struct */ {
    companion object {
        fun cptr(obj: EventDND): CPointer<cnames.structs._GdkEventDND> = obj.cptr
    }
}

class EventExpose(private val cptr: CPointer<cnames.structs._GdkEventExpose>) /* struct */ {
    companion object {
        fun cptr(obj: EventExpose): CPointer<cnames.structs._GdkEventExpose> = obj.cptr
    }
}

class EventFocus(private val cptr: CPointer<cnames.structs._GdkEventFocus>) /* struct */ {
    companion object {
        fun cptr(obj: EventFocus): CPointer<cnames.structs._GdkEventFocus> = obj.cptr
    }
}

typealias EventFunc = (event:  Event, data:  Any) -> Unit

class EventGrabBroken(private val cptr: CPointer<cnames.structs._GdkEventGrabBroken>) /* struct */ {
    companion object {
        fun cptr(obj: EventGrabBroken): CPointer<cnames.structs._GdkEventGrabBroken> = obj.cptr
    }
}

class EventKey(private val cptr: CPointer<cnames.structs._GdkEventKey>) /* struct */ {
    companion object {
        fun cptr(obj: EventKey): CPointer<cnames.structs._GdkEventKey> = obj.cptr
    }
}

typealias EventMask = GdkEventMask

class EventMotion(private val cptr: CPointer<cnames.structs._GdkEventMotion>) /* struct */ {
    companion object {
        fun cptr(obj: EventMotion): CPointer<cnames.structs._GdkEventMotion> = obj.cptr
    }
}

class EventOwnerChange(private val cptr: CPointer<cnames.structs._GdkEventOwnerChange>) /* struct */ {
    companion object {
        fun cptr(obj: EventOwnerChange): CPointer<cnames.structs._GdkEventOwnerChange> = obj.cptr
    }
}

class EventPadAxis(private val cptr: CPointer<cnames.structs._GdkEventPadAxis>) /* struct */ {
    companion object {
        fun cptr(obj: EventPadAxis): CPointer<cnames.structs._GdkEventPadAxis> = obj.cptr
    }
}

class EventPadButton(private val cptr: CPointer<cnames.structs._GdkEventPadButton>) /* struct */ {
    companion object {
        fun cptr(obj: EventPadButton): CPointer<cnames.structs._GdkEventPadButton> = obj.cptr
    }
}

class EventPadGroupMode(private val cptr: CPointer<cnames.structs._GdkEventPadGroupMode>) /* struct */ {
    companion object {
        fun cptr(obj: EventPadGroupMode): CPointer<cnames.structs._GdkEventPadGroupMode> = obj.cptr
    }
}

class EventProperty(private val cptr: CPointer<cnames.structs._GdkEventProperty>) /* struct */ {
    companion object {
        fun cptr(obj: EventProperty): CPointer<cnames.structs._GdkEventProperty> = obj.cptr
    }
}

class EventProximity(private val cptr: CPointer<cnames.structs._GdkEventProximity>) /* struct */ {
    companion object {
        fun cptr(obj: EventProximity): CPointer<cnames.structs._GdkEventProximity> = obj.cptr
    }
}

class EventScroll(private val cptr: CPointer<cnames.structs._GdkEventScroll>) /* struct */ {
    companion object {
        fun cptr(obj: EventScroll): CPointer<cnames.structs._GdkEventScroll> = obj.cptr
    }
}

class EventSelection(private val cptr: CPointer<cnames.structs._GdkEventSelection>) /* struct */ {
    companion object {
        fun cptr(obj: EventSelection): CPointer<cnames.structs._GdkEventSelection> = obj.cptr
    }
}

class EventSequence(private val cptr: CPointer<cnames.structs._GdkEventSequence>) /* struct */ {
    companion object {
        fun cptr(obj: EventSequence): CPointer<cnames.structs._GdkEventSequence> = obj.cptr
    }
}

class EventSetting(private val cptr: CPointer<cnames.structs._GdkEventSetting>) /* struct */ {
    companion object {
        fun cptr(obj: EventSetting): CPointer<cnames.structs._GdkEventSetting> = obj.cptr
    }
}

class EventTouch(private val cptr: CPointer<cnames.structs._GdkEventTouch>) /* struct */ {
    companion object {
        fun cptr(obj: EventTouch): CPointer<cnames.structs._GdkEventTouch> = obj.cptr
    }
}

class EventTouchpadPinch(private val cptr: CPointer<cnames.structs._GdkEventTouchpadPinch>) /* struct */ {
    companion object {
        fun cptr(obj: EventTouchpadPinch): CPointer<cnames.structs._GdkEventTouchpadPinch> = obj.cptr
    }
}

class EventTouchpadSwipe(private val cptr: CPointer<cnames.structs._GdkEventTouchpadSwipe>) /* struct */ {
    companion object {
        fun cptr(obj: EventTouchpadSwipe): CPointer<cnames.structs._GdkEventTouchpadSwipe> = obj.cptr
    }
}

typealias EventType = GdkEventType

class EventVisibility(private val cptr: CPointer<cnames.structs._GdkEventVisibility>) /* struct */ {
    companion object {
        fun cptr(obj: EventVisibility): CPointer<cnames.structs._GdkEventVisibility> = obj.cptr
    }
}

class EventWindowState(private val cptr: CPointer<cnames.structs._GdkEventWindowState>) /* struct */ {
    companion object {
        fun cptr(obj: EventWindowState): CPointer<cnames.structs._GdkEventWindowState> = obj.cptr
    }
}

typealias FilterFunc = (xevent:  Any, event:  Event, data:  Any) -> FilterReturn

typealias FilterReturn = GdkFilterReturn

open class FrameClock internal constructor (private val cptr: CPointer<GdkFrameClock>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun beginUpdating(): Unit {
         return stub()
    }
    open fun endUpdating(): Unit {
         return stub()
    }
    open fun getCurrentTimings(): FrameTimings {
         return stub()
    }
    open fun getFrameCounter(): Long {
         return stub()
    }
    open fun getFrameTime(): Long {
         return stub()
    }
    open fun getHistoryStart(): Long {
         return stub()
    }
    open fun getRefreshInfo(base_time: Long, refresh_interval_return: Long, presentation_time_return: Long): Unit {
         return stub()
    }
    open fun getTimings(frame_counter: Long): FrameTimings {
         return stub()
    }
    open fun requestPhase(phase: FrameClockPhase): Unit {
         return stub()
    }
    fun setOnAfterPaint(cb: () -> Unit) {
        do_connect(cptr, "after-paint", cb)
    }

    fun setOnBeforePaint(cb: () -> Unit) {
        do_connect(cptr, "before-paint", cb)
    }

    fun setOnFlushEvents(cb: () -> Unit) {
        do_connect(cptr, "flush-events", cb)
    }

    fun setOnLayout(cb: () -> Unit) {
        do_connect(cptr, "layout", cb)
    }

    fun setOnPaint(cb: () -> Unit) {
        do_connect(cptr, "paint", cb)
    }

    fun setOnResumeEvents(cb: () -> Unit) {
        do_connect(cptr, "resume-events", cb)
    }

    fun setOnUpdate(cb: () -> Unit) {
        do_connect(cptr, "update", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 26273248UL
        fun cptr(obj: FrameClock): CPointer<GdkFrameClock> = obj.cptr
    }
}

class FrameClockClass(private val cptr: CPointer<cnames.structs._GdkFrameClockClass>) /* struct */ {
    companion object {
        fun cptr(obj: FrameClockClass): CPointer<cnames.structs._GdkFrameClockClass> = obj.cptr
    }
}

typealias FrameClockPhase = GdkFrameClockPhase

class FrameTimings(private val cptr: CPointer<cnames.structs._GdkFrameTimings>) /* struct */ {
    fun getComplete(): Boolean {
         return stub()
    }
    fun getFrameCounter(): Long {
         return stub()
    }
    fun getFrameTime(): Long {
         return stub()
    }
    fun getPredictedPresentationTime(): Long {
         return stub()
    }
    fun getPresentationTime(): Long {
         return stub()
    }
    fun getRefreshInterval(): Long {
         return stub()
    }
    fun ref(): FrameTimings {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: FrameTimings): CPointer<cnames.structs._GdkFrameTimings> = obj.cptr
    }
}

typealias FullscreenMode = GdkFullscreenMode

open class GLContext internal constructor (private val cptr: CPointer<GdkGLContext>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getDebugEnabled(): Boolean {
         return stub()
    }
    open fun getDisplay(): Display {
         return stub()
    }
    open fun getForwardCompatible(): Boolean {
         return stub()
    }
    open fun getRequiredVersion(major: Int, minor: Int): Unit {
         return stub()
    }
    open fun getSharedContext(): GLContext {
         return stub()
    }
    open fun getUseEs(): Boolean {
         return stub()
    }
    open fun getVersion(major: Int, minor: Int): Unit {
         return stub()
    }
    open fun getWindow(): Window {
         return stub()
    }
    open fun isLegacy(): Boolean {
         return stub()
    }
    open fun makeCurrent(): Unit {
         return stub()
    }
    open fun realize(): Boolean {
         return stub()
    }
    open fun setDebugEnabled(enabled: Boolean): Unit {
         return stub()
    }
    open fun setForwardCompatible(compatible: Boolean): Unit {
         return stub()
    }
    open fun setRequiredVersion(major: Int, minor: Int): Unit {
         return stub()
    }
    open fun setUseEs(use_es: Int): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 25610560UL
        fun cptr(obj: GLContext): CPointer<GdkGLContext> = obj.cptr
        fun clearCurrent(): Unit {
    return stub()
}
        fun getCurrent(): GLContext {
    return stub()
}
    }
}

typealias GLError = GdkGLError

class Geometry(private val cptr: CPointer<cnames.structs._GdkGeometry>) /* struct */ {
    companion object {
        fun cptr(obj: Geometry): CPointer<cnames.structs._GdkGeometry> = obj.cptr
    }
}

typealias GrabOwnership = GdkGrabOwnership

typealias GrabStatus = GdkGrabStatus

typealias Gravity = GdkGravity

typealias InputMode = GdkInputMode

typealias InputSource = GdkInputSource

val KEY_0: Int get() = TODO()

val KEY_1: Int get() = TODO()

val KEY_2: Int get() = TODO()

val KEY_3: Int get() = TODO()

val KEY_3270_AltCursor: Int get() = TODO()

val KEY_3270_Attn: Int get() = TODO()

val KEY_3270_BackTab: Int get() = TODO()

val KEY_3270_ChangeScreen: Int get() = TODO()

val KEY_3270_Copy: Int get() = TODO()

val KEY_3270_CursorBlink: Int get() = TODO()

val KEY_3270_CursorSelect: Int get() = TODO()

val KEY_3270_DeleteWord: Int get() = TODO()

val KEY_3270_Duplicate: Int get() = TODO()

val KEY_3270_Enter: Int get() = TODO()

val KEY_3270_EraseEOF: Int get() = TODO()

val KEY_3270_EraseInput: Int get() = TODO()

val KEY_3270_ExSelect: Int get() = TODO()

val KEY_3270_FieldMark: Int get() = TODO()

val KEY_3270_Ident: Int get() = TODO()

val KEY_3270_Jump: Int get() = TODO()

val KEY_3270_KeyClick: Int get() = TODO()

val KEY_3270_Left2: Int get() = TODO()

val KEY_3270_PA1: Int get() = TODO()

val KEY_3270_PA2: Int get() = TODO()

val KEY_3270_PA3: Int get() = TODO()

val KEY_3270_Play: Int get() = TODO()

val KEY_3270_PrintScreen: Int get() = TODO()

val KEY_3270_Quit: Int get() = TODO()

val KEY_3270_Record: Int get() = TODO()

val KEY_3270_Reset: Int get() = TODO()

val KEY_3270_Right2: Int get() = TODO()

val KEY_3270_Rule: Int get() = TODO()

val KEY_3270_Setup: Int get() = TODO()

val KEY_3270_Test: Int get() = TODO()

val KEY_4: Int get() = TODO()

val KEY_5: Int get() = TODO()

val KEY_6: Int get() = TODO()

val KEY_7: Int get() = TODO()

val KEY_8: Int get() = TODO()

val KEY_9: Int get() = TODO()

val KEY_A: Int get() = TODO()

val KEY_AE: Int get() = TODO()

val KEY_Aacute: Int get() = TODO()

val KEY_Abelowdot: Int get() = TODO()

val KEY_Abreve: Int get() = TODO()

val KEY_Abreveacute: Int get() = TODO()

val KEY_Abrevebelowdot: Int get() = TODO()

val KEY_Abrevegrave: Int get() = TODO()

val KEY_Abrevehook: Int get() = TODO()

val KEY_Abrevetilde: Int get() = TODO()

val KEY_AccessX_Enable: Int get() = TODO()

val KEY_AccessX_Feedback_Enable: Int get() = TODO()

val KEY_Acircumflex: Int get() = TODO()

val KEY_Acircumflexacute: Int get() = TODO()

val KEY_Acircumflexbelowdot: Int get() = TODO()

val KEY_Acircumflexgrave: Int get() = TODO()

val KEY_Acircumflexhook: Int get() = TODO()

val KEY_Acircumflextilde: Int get() = TODO()

val KEY_AddFavorite: Int get() = TODO()

val KEY_Adiaeresis: Int get() = TODO()

val KEY_Agrave: Int get() = TODO()

val KEY_Ahook: Int get() = TODO()

val KEY_Alt_L: Int get() = TODO()

val KEY_Alt_R: Int get() = TODO()

val KEY_Amacron: Int get() = TODO()

val KEY_Aogonek: Int get() = TODO()

val KEY_ApplicationLeft: Int get() = TODO()

val KEY_ApplicationRight: Int get() = TODO()

val KEY_Arabic_0: Int get() = TODO()

val KEY_Arabic_1: Int get() = TODO()

val KEY_Arabic_2: Int get() = TODO()

val KEY_Arabic_3: Int get() = TODO()

val KEY_Arabic_4: Int get() = TODO()

val KEY_Arabic_5: Int get() = TODO()

val KEY_Arabic_6: Int get() = TODO()

val KEY_Arabic_7: Int get() = TODO()

val KEY_Arabic_8: Int get() = TODO()

val KEY_Arabic_9: Int get() = TODO()

val KEY_Arabic_ain: Int get() = TODO()

val KEY_Arabic_alef: Int get() = TODO()

val KEY_Arabic_alefmaksura: Int get() = TODO()

val KEY_Arabic_beh: Int get() = TODO()

val KEY_Arabic_comma: Int get() = TODO()

val KEY_Arabic_dad: Int get() = TODO()

val KEY_Arabic_dal: Int get() = TODO()

val KEY_Arabic_damma: Int get() = TODO()

val KEY_Arabic_dammatan: Int get() = TODO()

val KEY_Arabic_ddal: Int get() = TODO()

val KEY_Arabic_farsi_yeh: Int get() = TODO()

val KEY_Arabic_fatha: Int get() = TODO()

val KEY_Arabic_fathatan: Int get() = TODO()

val KEY_Arabic_feh: Int get() = TODO()

val KEY_Arabic_fullstop: Int get() = TODO()

val KEY_Arabic_gaf: Int get() = TODO()

val KEY_Arabic_ghain: Int get() = TODO()

val KEY_Arabic_ha: Int get() = TODO()

val KEY_Arabic_hah: Int get() = TODO()

val KEY_Arabic_hamza: Int get() = TODO()

val KEY_Arabic_hamza_above: Int get() = TODO()

val KEY_Arabic_hamza_below: Int get() = TODO()

val KEY_Arabic_hamzaonalef: Int get() = TODO()

val KEY_Arabic_hamzaonwaw: Int get() = TODO()

val KEY_Arabic_hamzaonyeh: Int get() = TODO()

val KEY_Arabic_hamzaunderalef: Int get() = TODO()

val KEY_Arabic_heh: Int get() = TODO()

val KEY_Arabic_heh_doachashmee: Int get() = TODO()

val KEY_Arabic_heh_goal: Int get() = TODO()

val KEY_Arabic_jeem: Int get() = TODO()

val KEY_Arabic_jeh: Int get() = TODO()

val KEY_Arabic_kaf: Int get() = TODO()

val KEY_Arabic_kasra: Int get() = TODO()

val KEY_Arabic_kasratan: Int get() = TODO()

val KEY_Arabic_keheh: Int get() = TODO()

val KEY_Arabic_khah: Int get() = TODO()

val KEY_Arabic_lam: Int get() = TODO()

val KEY_Arabic_madda_above: Int get() = TODO()

val KEY_Arabic_maddaonalef: Int get() = TODO()

val KEY_Arabic_meem: Int get() = TODO()

val KEY_Arabic_noon: Int get() = TODO()

val KEY_Arabic_noon_ghunna: Int get() = TODO()

val KEY_Arabic_peh: Int get() = TODO()

val KEY_Arabic_percent: Int get() = TODO()

val KEY_Arabic_qaf: Int get() = TODO()

val KEY_Arabic_question_mark: Int get() = TODO()

val KEY_Arabic_ra: Int get() = TODO()

val KEY_Arabic_rreh: Int get() = TODO()

val KEY_Arabic_sad: Int get() = TODO()

val KEY_Arabic_seen: Int get() = TODO()

val KEY_Arabic_semicolon: Int get() = TODO()

val KEY_Arabic_shadda: Int get() = TODO()

val KEY_Arabic_sheen: Int get() = TODO()

val KEY_Arabic_sukun: Int get() = TODO()

val KEY_Arabic_superscript_alef: Int get() = TODO()

val KEY_Arabic_switch: Int get() = TODO()

val KEY_Arabic_tah: Int get() = TODO()

val KEY_Arabic_tatweel: Int get() = TODO()

val KEY_Arabic_tcheh: Int get() = TODO()

val KEY_Arabic_teh: Int get() = TODO()

val KEY_Arabic_tehmarbuta: Int get() = TODO()

val KEY_Arabic_thal: Int get() = TODO()

val KEY_Arabic_theh: Int get() = TODO()

val KEY_Arabic_tteh: Int get() = TODO()

val KEY_Arabic_veh: Int get() = TODO()

val KEY_Arabic_waw: Int get() = TODO()

val KEY_Arabic_yeh: Int get() = TODO()

val KEY_Arabic_yeh_baree: Int get() = TODO()

val KEY_Arabic_zah: Int get() = TODO()

val KEY_Arabic_zain: Int get() = TODO()

val KEY_Aring: Int get() = TODO()

val KEY_Armenian_AT: Int get() = TODO()

val KEY_Armenian_AYB: Int get() = TODO()

val KEY_Armenian_BEN: Int get() = TODO()

val KEY_Armenian_CHA: Int get() = TODO()

val KEY_Armenian_DA: Int get() = TODO()

val KEY_Armenian_DZA: Int get() = TODO()

val KEY_Armenian_E: Int get() = TODO()

val KEY_Armenian_FE: Int get() = TODO()

val KEY_Armenian_GHAT: Int get() = TODO()

val KEY_Armenian_GIM: Int get() = TODO()

val KEY_Armenian_HI: Int get() = TODO()

val KEY_Armenian_HO: Int get() = TODO()

val KEY_Armenian_INI: Int get() = TODO()

val KEY_Armenian_JE: Int get() = TODO()

val KEY_Armenian_KE: Int get() = TODO()

val KEY_Armenian_KEN: Int get() = TODO()

val KEY_Armenian_KHE: Int get() = TODO()

val KEY_Armenian_LYUN: Int get() = TODO()

val KEY_Armenian_MEN: Int get() = TODO()

val KEY_Armenian_NU: Int get() = TODO()

val KEY_Armenian_O: Int get() = TODO()

val KEY_Armenian_PE: Int get() = TODO()

val KEY_Armenian_PYUR: Int get() = TODO()

val KEY_Armenian_RA: Int get() = TODO()

val KEY_Armenian_RE: Int get() = TODO()

val KEY_Armenian_SE: Int get() = TODO()

val KEY_Armenian_SHA: Int get() = TODO()

val KEY_Armenian_TCHE: Int get() = TODO()

val KEY_Armenian_TO: Int get() = TODO()

val KEY_Armenian_TSA: Int get() = TODO()

val KEY_Armenian_TSO: Int get() = TODO()

val KEY_Armenian_TYUN: Int get() = TODO()

val KEY_Armenian_VEV: Int get() = TODO()

val KEY_Armenian_VO: Int get() = TODO()

val KEY_Armenian_VYUN: Int get() = TODO()

val KEY_Armenian_YECH: Int get() = TODO()

val KEY_Armenian_ZA: Int get() = TODO()

val KEY_Armenian_ZHE: Int get() = TODO()

val KEY_Armenian_accent: Int get() = TODO()

val KEY_Armenian_amanak: Int get() = TODO()

val KEY_Armenian_apostrophe: Int get() = TODO()

val KEY_Armenian_at: Int get() = TODO()

val KEY_Armenian_ayb: Int get() = TODO()

val KEY_Armenian_ben: Int get() = TODO()

val KEY_Armenian_but: Int get() = TODO()

val KEY_Armenian_cha: Int get() = TODO()

val KEY_Armenian_da: Int get() = TODO()

val KEY_Armenian_dza: Int get() = TODO()

val KEY_Armenian_e: Int get() = TODO()

val KEY_Armenian_exclam: Int get() = TODO()

val KEY_Armenian_fe: Int get() = TODO()

val KEY_Armenian_full_stop: Int get() = TODO()

val KEY_Armenian_ghat: Int get() = TODO()

val KEY_Armenian_gim: Int get() = TODO()

val KEY_Armenian_hi: Int get() = TODO()

val KEY_Armenian_ho: Int get() = TODO()

val KEY_Armenian_hyphen: Int get() = TODO()

val KEY_Armenian_ini: Int get() = TODO()

val KEY_Armenian_je: Int get() = TODO()

val KEY_Armenian_ke: Int get() = TODO()

val KEY_Armenian_ken: Int get() = TODO()

val KEY_Armenian_khe: Int get() = TODO()

val KEY_Armenian_ligature_ew: Int get() = TODO()

val KEY_Armenian_lyun: Int get() = TODO()

val KEY_Armenian_men: Int get() = TODO()

val KEY_Armenian_nu: Int get() = TODO()

val KEY_Armenian_o: Int get() = TODO()

val KEY_Armenian_paruyk: Int get() = TODO()

val KEY_Armenian_pe: Int get() = TODO()

val KEY_Armenian_pyur: Int get() = TODO()

val KEY_Armenian_question: Int get() = TODO()

val KEY_Armenian_ra: Int get() = TODO()

val KEY_Armenian_re: Int get() = TODO()

val KEY_Armenian_se: Int get() = TODO()

val KEY_Armenian_separation_mark: Int get() = TODO()

val KEY_Armenian_sha: Int get() = TODO()

val KEY_Armenian_shesht: Int get() = TODO()

val KEY_Armenian_tche: Int get() = TODO()

val KEY_Armenian_to: Int get() = TODO()

val KEY_Armenian_tsa: Int get() = TODO()

val KEY_Armenian_tso: Int get() = TODO()

val KEY_Armenian_tyun: Int get() = TODO()

val KEY_Armenian_verjaket: Int get() = TODO()

val KEY_Armenian_vev: Int get() = TODO()

val KEY_Armenian_vo: Int get() = TODO()

val KEY_Armenian_vyun: Int get() = TODO()

val KEY_Armenian_yech: Int get() = TODO()

val KEY_Armenian_yentamna: Int get() = TODO()

val KEY_Armenian_za: Int get() = TODO()

val KEY_Armenian_zhe: Int get() = TODO()

val KEY_Atilde: Int get() = TODO()

val KEY_AudibleBell_Enable: Int get() = TODO()

val KEY_AudioCycleTrack: Int get() = TODO()

val KEY_AudioForward: Int get() = TODO()

val KEY_AudioLowerVolume: Int get() = TODO()

val KEY_AudioMedia: Int get() = TODO()

val KEY_AudioMicMute: Int get() = TODO()

val KEY_AudioMute: Int get() = TODO()

val KEY_AudioNext: Int get() = TODO()

val KEY_AudioPause: Int get() = TODO()

val KEY_AudioPlay: Int get() = TODO()

val KEY_AudioPreset: Int get() = TODO()

val KEY_AudioPrev: Int get() = TODO()

val KEY_AudioRaiseVolume: Int get() = TODO()

val KEY_AudioRandomPlay: Int get() = TODO()

val KEY_AudioRecord: Int get() = TODO()

val KEY_AudioRepeat: Int get() = TODO()

val KEY_AudioRewind: Int get() = TODO()

val KEY_AudioStop: Int get() = TODO()

val KEY_Away: Int get() = TODO()

val KEY_B: Int get() = TODO()

val KEY_Babovedot: Int get() = TODO()

val KEY_Back: Int get() = TODO()

val KEY_BackForward: Int get() = TODO()

val KEY_BackSpace: Int get() = TODO()

val KEY_Battery: Int get() = TODO()

val KEY_Begin: Int get() = TODO()

val KEY_Blue: Int get() = TODO()

val KEY_Bluetooth: Int get() = TODO()

val KEY_Book: Int get() = TODO()

val KEY_BounceKeys_Enable: Int get() = TODO()

val KEY_Break: Int get() = TODO()

val KEY_BrightnessAdjust: Int get() = TODO()

val KEY_Byelorussian_SHORTU: Int get() = TODO()

val KEY_Byelorussian_shortu: Int get() = TODO()

val KEY_C: Int get() = TODO()

val KEY_CD: Int get() = TODO()

val KEY_CH: Int get() = TODO()

val KEY_C_H: Int get() = TODO()

val KEY_C_h: Int get() = TODO()

val KEY_Cabovedot: Int get() = TODO()

val KEY_Cacute: Int get() = TODO()

val KEY_Calculator: Int get() = TODO()

val KEY_Calendar: Int get() = TODO()

val KEY_Cancel: Int get() = TODO()

val KEY_Caps_Lock: Int get() = TODO()

val KEY_Ccaron: Int get() = TODO()

val KEY_Ccedilla: Int get() = TODO()

val KEY_Ccircumflex: Int get() = TODO()

val KEY_Ch: Int get() = TODO()

val KEY_Clear: Int get() = TODO()

val KEY_ClearGrab: Int get() = TODO()

val KEY_Close: Int get() = TODO()

val KEY_Codeinput: Int get() = TODO()

val KEY_ColonSign: Int get() = TODO()

val KEY_Community: Int get() = TODO()

val KEY_ContrastAdjust: Int get() = TODO()

val KEY_Control_L: Int get() = TODO()

val KEY_Control_R: Int get() = TODO()

val KEY_Copy: Int get() = TODO()

val KEY_CruzeiroSign: Int get() = TODO()

val KEY_Cut: Int get() = TODO()

val KEY_CycleAngle: Int get() = TODO()

val KEY_Cyrillic_A: Int get() = TODO()

val KEY_Cyrillic_BE: Int get() = TODO()

val KEY_Cyrillic_CHE: Int get() = TODO()

val KEY_Cyrillic_CHE_descender: Int get() = TODO()

val KEY_Cyrillic_CHE_vertstroke: Int get() = TODO()

val KEY_Cyrillic_DE: Int get() = TODO()

val KEY_Cyrillic_DZHE: Int get() = TODO()

val KEY_Cyrillic_E: Int get() = TODO()

val KEY_Cyrillic_EF: Int get() = TODO()

val KEY_Cyrillic_EL: Int get() = TODO()

val KEY_Cyrillic_EM: Int get() = TODO()

val KEY_Cyrillic_EN: Int get() = TODO()

val KEY_Cyrillic_EN_descender: Int get() = TODO()

val KEY_Cyrillic_ER: Int get() = TODO()

val KEY_Cyrillic_ES: Int get() = TODO()

val KEY_Cyrillic_GHE: Int get() = TODO()

val KEY_Cyrillic_GHE_bar: Int get() = TODO()

val KEY_Cyrillic_HA: Int get() = TODO()

val KEY_Cyrillic_HARDSIGN: Int get() = TODO()

val KEY_Cyrillic_HA_descender: Int get() = TODO()

val KEY_Cyrillic_I: Int get() = TODO()

val KEY_Cyrillic_IE: Int get() = TODO()

val KEY_Cyrillic_IO: Int get() = TODO()

val KEY_Cyrillic_I_macron: Int get() = TODO()

val KEY_Cyrillic_JE: Int get() = TODO()

val KEY_Cyrillic_KA: Int get() = TODO()

val KEY_Cyrillic_KA_descender: Int get() = TODO()

val KEY_Cyrillic_KA_vertstroke: Int get() = TODO()

val KEY_Cyrillic_LJE: Int get() = TODO()

val KEY_Cyrillic_NJE: Int get() = TODO()

val KEY_Cyrillic_O: Int get() = TODO()

val KEY_Cyrillic_O_bar: Int get() = TODO()

val KEY_Cyrillic_PE: Int get() = TODO()

val KEY_Cyrillic_SCHWA: Int get() = TODO()

val KEY_Cyrillic_SHA: Int get() = TODO()

val KEY_Cyrillic_SHCHA: Int get() = TODO()

val KEY_Cyrillic_SHHA: Int get() = TODO()

val KEY_Cyrillic_SHORTI: Int get() = TODO()

val KEY_Cyrillic_SOFTSIGN: Int get() = TODO()

val KEY_Cyrillic_TE: Int get() = TODO()

val KEY_Cyrillic_TSE: Int get() = TODO()

val KEY_Cyrillic_U: Int get() = TODO()

val KEY_Cyrillic_U_macron: Int get() = TODO()

val KEY_Cyrillic_U_straight: Int get() = TODO()

val KEY_Cyrillic_U_straight_bar: Int get() = TODO()

val KEY_Cyrillic_VE: Int get() = TODO()

val KEY_Cyrillic_YA: Int get() = TODO()

val KEY_Cyrillic_YERU: Int get() = TODO()

val KEY_Cyrillic_YU: Int get() = TODO()

val KEY_Cyrillic_ZE: Int get() = TODO()

val KEY_Cyrillic_ZHE: Int get() = TODO()

val KEY_Cyrillic_ZHE_descender: Int get() = TODO()

val KEY_Cyrillic_a: Int get() = TODO()

val KEY_Cyrillic_be: Int get() = TODO()

val KEY_Cyrillic_che: Int get() = TODO()

val KEY_Cyrillic_che_descender: Int get() = TODO()

val KEY_Cyrillic_che_vertstroke: Int get() = TODO()

val KEY_Cyrillic_de: Int get() = TODO()

val KEY_Cyrillic_dzhe: Int get() = TODO()

val KEY_Cyrillic_e: Int get() = TODO()

val KEY_Cyrillic_ef: Int get() = TODO()

val KEY_Cyrillic_el: Int get() = TODO()

val KEY_Cyrillic_em: Int get() = TODO()

val KEY_Cyrillic_en: Int get() = TODO()

val KEY_Cyrillic_en_descender: Int get() = TODO()

val KEY_Cyrillic_er: Int get() = TODO()

val KEY_Cyrillic_es: Int get() = TODO()

val KEY_Cyrillic_ghe: Int get() = TODO()

val KEY_Cyrillic_ghe_bar: Int get() = TODO()

val KEY_Cyrillic_ha: Int get() = TODO()

val KEY_Cyrillic_ha_descender: Int get() = TODO()

val KEY_Cyrillic_hardsign: Int get() = TODO()

val KEY_Cyrillic_i: Int get() = TODO()

val KEY_Cyrillic_i_macron: Int get() = TODO()

val KEY_Cyrillic_ie: Int get() = TODO()

val KEY_Cyrillic_io: Int get() = TODO()

val KEY_Cyrillic_je: Int get() = TODO()

val KEY_Cyrillic_ka: Int get() = TODO()

val KEY_Cyrillic_ka_descender: Int get() = TODO()

val KEY_Cyrillic_ka_vertstroke: Int get() = TODO()

val KEY_Cyrillic_lje: Int get() = TODO()

val KEY_Cyrillic_nje: Int get() = TODO()

val KEY_Cyrillic_o: Int get() = TODO()

val KEY_Cyrillic_o_bar: Int get() = TODO()

val KEY_Cyrillic_pe: Int get() = TODO()

val KEY_Cyrillic_schwa: Int get() = TODO()

val KEY_Cyrillic_sha: Int get() = TODO()

val KEY_Cyrillic_shcha: Int get() = TODO()

val KEY_Cyrillic_shha: Int get() = TODO()

val KEY_Cyrillic_shorti: Int get() = TODO()

val KEY_Cyrillic_softsign: Int get() = TODO()

val KEY_Cyrillic_te: Int get() = TODO()

val KEY_Cyrillic_tse: Int get() = TODO()

val KEY_Cyrillic_u: Int get() = TODO()

val KEY_Cyrillic_u_macron: Int get() = TODO()

val KEY_Cyrillic_u_straight: Int get() = TODO()

val KEY_Cyrillic_u_straight_bar: Int get() = TODO()

val KEY_Cyrillic_ve: Int get() = TODO()

val KEY_Cyrillic_ya: Int get() = TODO()

val KEY_Cyrillic_yeru: Int get() = TODO()

val KEY_Cyrillic_yu: Int get() = TODO()

val KEY_Cyrillic_ze: Int get() = TODO()

val KEY_Cyrillic_zhe: Int get() = TODO()

val KEY_Cyrillic_zhe_descender: Int get() = TODO()

val KEY_D: Int get() = TODO()

val KEY_DOS: Int get() = TODO()

val KEY_Dabovedot: Int get() = TODO()

val KEY_Dcaron: Int get() = TODO()

val KEY_Delete: Int get() = TODO()

val KEY_Display: Int get() = TODO()

val KEY_Documents: Int get() = TODO()

val KEY_DongSign: Int get() = TODO()

val KEY_Down: Int get() = TODO()

val KEY_Dstroke: Int get() = TODO()

val KEY_E: Int get() = TODO()

val KEY_ENG: Int get() = TODO()

val KEY_ETH: Int get() = TODO()

val KEY_EZH: Int get() = TODO()

val KEY_Eabovedot: Int get() = TODO()

val KEY_Eacute: Int get() = TODO()

val KEY_Ebelowdot: Int get() = TODO()

val KEY_Ecaron: Int get() = TODO()

val KEY_Ecircumflex: Int get() = TODO()

val KEY_Ecircumflexacute: Int get() = TODO()

val KEY_Ecircumflexbelowdot: Int get() = TODO()

val KEY_Ecircumflexgrave: Int get() = TODO()

val KEY_Ecircumflexhook: Int get() = TODO()

val KEY_Ecircumflextilde: Int get() = TODO()

val KEY_EcuSign: Int get() = TODO()

val KEY_Ediaeresis: Int get() = TODO()

val KEY_Egrave: Int get() = TODO()

val KEY_Ehook: Int get() = TODO()

val KEY_Eisu_Shift: Int get() = TODO()

val KEY_Eisu_toggle: Int get() = TODO()

val KEY_Eject: Int get() = TODO()

val KEY_Emacron: Int get() = TODO()

val KEY_End: Int get() = TODO()

val KEY_Eogonek: Int get() = TODO()

val KEY_Escape: Int get() = TODO()

val KEY_Eth: Int get() = TODO()

val KEY_Etilde: Int get() = TODO()

val KEY_EuroSign: Int get() = TODO()

val KEY_Excel: Int get() = TODO()

val KEY_Execute: Int get() = TODO()

val KEY_Explorer: Int get() = TODO()

val KEY_F: Int get() = TODO()

val KEY_F1: Int get() = TODO()

val KEY_F10: Int get() = TODO()

val KEY_F11: Int get() = TODO()

val KEY_F12: Int get() = TODO()

val KEY_F13: Int get() = TODO()

val KEY_F14: Int get() = TODO()

val KEY_F15: Int get() = TODO()

val KEY_F16: Int get() = TODO()

val KEY_F17: Int get() = TODO()

val KEY_F18: Int get() = TODO()

val KEY_F19: Int get() = TODO()

val KEY_F2: Int get() = TODO()

val KEY_F20: Int get() = TODO()

val KEY_F21: Int get() = TODO()

val KEY_F22: Int get() = TODO()

val KEY_F23: Int get() = TODO()

val KEY_F24: Int get() = TODO()

val KEY_F25: Int get() = TODO()

val KEY_F26: Int get() = TODO()

val KEY_F27: Int get() = TODO()

val KEY_F28: Int get() = TODO()

val KEY_F29: Int get() = TODO()

val KEY_F3: Int get() = TODO()

val KEY_F30: Int get() = TODO()

val KEY_F31: Int get() = TODO()

val KEY_F32: Int get() = TODO()

val KEY_F33: Int get() = TODO()

val KEY_F34: Int get() = TODO()

val KEY_F35: Int get() = TODO()

val KEY_F4: Int get() = TODO()

val KEY_F5: Int get() = TODO()

val KEY_F6: Int get() = TODO()

val KEY_F7: Int get() = TODO()

val KEY_F8: Int get() = TODO()

val KEY_F9: Int get() = TODO()

val KEY_FFrancSign: Int get() = TODO()

val KEY_Fabovedot: Int get() = TODO()

val KEY_Farsi_0: Int get() = TODO()

val KEY_Farsi_1: Int get() = TODO()

val KEY_Farsi_2: Int get() = TODO()

val KEY_Farsi_3: Int get() = TODO()

val KEY_Farsi_4: Int get() = TODO()

val KEY_Farsi_5: Int get() = TODO()

val KEY_Farsi_6: Int get() = TODO()

val KEY_Farsi_7: Int get() = TODO()

val KEY_Farsi_8: Int get() = TODO()

val KEY_Farsi_9: Int get() = TODO()

val KEY_Farsi_yeh: Int get() = TODO()

val KEY_Favorites: Int get() = TODO()

val KEY_Finance: Int get() = TODO()

val KEY_Find: Int get() = TODO()

val KEY_First_Virtual_Screen: Int get() = TODO()

val KEY_Forward: Int get() = TODO()

val KEY_FrameBack: Int get() = TODO()

val KEY_FrameForward: Int get() = TODO()

val KEY_G: Int get() = TODO()

val KEY_Gabovedot: Int get() = TODO()

val KEY_Game: Int get() = TODO()

val KEY_Gbreve: Int get() = TODO()

val KEY_Gcaron: Int get() = TODO()

val KEY_Gcedilla: Int get() = TODO()

val KEY_Gcircumflex: Int get() = TODO()

val KEY_Georgian_an: Int get() = TODO()

val KEY_Georgian_ban: Int get() = TODO()

val KEY_Georgian_can: Int get() = TODO()

val KEY_Georgian_char: Int get() = TODO()

val KEY_Georgian_chin: Int get() = TODO()

val KEY_Georgian_cil: Int get() = TODO()

val KEY_Georgian_don: Int get() = TODO()

val KEY_Georgian_en: Int get() = TODO()

val KEY_Georgian_fi: Int get() = TODO()

val KEY_Georgian_gan: Int get() = TODO()

val KEY_Georgian_ghan: Int get() = TODO()

val KEY_Georgian_hae: Int get() = TODO()

val KEY_Georgian_har: Int get() = TODO()

val KEY_Georgian_he: Int get() = TODO()

val KEY_Georgian_hie: Int get() = TODO()

val KEY_Georgian_hoe: Int get() = TODO()

val KEY_Georgian_in: Int get() = TODO()

val KEY_Georgian_jhan: Int get() = TODO()

val KEY_Georgian_jil: Int get() = TODO()

val KEY_Georgian_kan: Int get() = TODO()

val KEY_Georgian_khar: Int get() = TODO()

val KEY_Georgian_las: Int get() = TODO()

val KEY_Georgian_man: Int get() = TODO()

val KEY_Georgian_nar: Int get() = TODO()

val KEY_Georgian_on: Int get() = TODO()

val KEY_Georgian_par: Int get() = TODO()

val KEY_Georgian_phar: Int get() = TODO()

val KEY_Georgian_qar: Int get() = TODO()

val KEY_Georgian_rae: Int get() = TODO()

val KEY_Georgian_san: Int get() = TODO()

val KEY_Georgian_shin: Int get() = TODO()

val KEY_Georgian_tan: Int get() = TODO()

val KEY_Georgian_tar: Int get() = TODO()

val KEY_Georgian_un: Int get() = TODO()

val KEY_Georgian_vin: Int get() = TODO()

val KEY_Georgian_we: Int get() = TODO()

val KEY_Georgian_xan: Int get() = TODO()

val KEY_Georgian_zen: Int get() = TODO()

val KEY_Georgian_zhar: Int get() = TODO()

val KEY_Go: Int get() = TODO()

val KEY_Greek_ALPHA: Int get() = TODO()

val KEY_Greek_ALPHAaccent: Int get() = TODO()

val KEY_Greek_BETA: Int get() = TODO()

val KEY_Greek_CHI: Int get() = TODO()

val KEY_Greek_DELTA: Int get() = TODO()

val KEY_Greek_EPSILON: Int get() = TODO()

val KEY_Greek_EPSILONaccent: Int get() = TODO()

val KEY_Greek_ETA: Int get() = TODO()

val KEY_Greek_ETAaccent: Int get() = TODO()

val KEY_Greek_GAMMA: Int get() = TODO()

val KEY_Greek_IOTA: Int get() = TODO()

val KEY_Greek_IOTAaccent: Int get() = TODO()

val KEY_Greek_IOTAdiaeresis: Int get() = TODO()

val KEY_Greek_IOTAdieresis: Int get() = TODO()

val KEY_Greek_KAPPA: Int get() = TODO()

val KEY_Greek_LAMBDA: Int get() = TODO()

val KEY_Greek_LAMDA: Int get() = TODO()

val KEY_Greek_MU: Int get() = TODO()

val KEY_Greek_NU: Int get() = TODO()

val KEY_Greek_OMEGA: Int get() = TODO()

val KEY_Greek_OMEGAaccent: Int get() = TODO()

val KEY_Greek_OMICRON: Int get() = TODO()

val KEY_Greek_OMICRONaccent: Int get() = TODO()

val KEY_Greek_PHI: Int get() = TODO()

val KEY_Greek_PI: Int get() = TODO()

val KEY_Greek_PSI: Int get() = TODO()

val KEY_Greek_RHO: Int get() = TODO()

val KEY_Greek_SIGMA: Int get() = TODO()

val KEY_Greek_TAU: Int get() = TODO()

val KEY_Greek_THETA: Int get() = TODO()

val KEY_Greek_UPSILON: Int get() = TODO()

val KEY_Greek_UPSILONaccent: Int get() = TODO()

val KEY_Greek_UPSILONdieresis: Int get() = TODO()

val KEY_Greek_XI: Int get() = TODO()

val KEY_Greek_ZETA: Int get() = TODO()

val KEY_Greek_accentdieresis: Int get() = TODO()

val KEY_Greek_alpha: Int get() = TODO()

val KEY_Greek_alphaaccent: Int get() = TODO()

val KEY_Greek_beta: Int get() = TODO()

val KEY_Greek_chi: Int get() = TODO()

val KEY_Greek_delta: Int get() = TODO()

val KEY_Greek_epsilon: Int get() = TODO()

val KEY_Greek_epsilonaccent: Int get() = TODO()

val KEY_Greek_eta: Int get() = TODO()

val KEY_Greek_etaaccent: Int get() = TODO()

val KEY_Greek_finalsmallsigma: Int get() = TODO()

val KEY_Greek_gamma: Int get() = TODO()

val KEY_Greek_horizbar: Int get() = TODO()

val KEY_Greek_iota: Int get() = TODO()

val KEY_Greek_iotaaccent: Int get() = TODO()

val KEY_Greek_iotaaccentdieresis: Int get() = TODO()

val KEY_Greek_iotadieresis: Int get() = TODO()

val KEY_Greek_kappa: Int get() = TODO()

val KEY_Greek_lambda: Int get() = TODO()

val KEY_Greek_lamda: Int get() = TODO()

val KEY_Greek_mu: Int get() = TODO()

val KEY_Greek_nu: Int get() = TODO()

val KEY_Greek_omega: Int get() = TODO()

val KEY_Greek_omegaaccent: Int get() = TODO()

val KEY_Greek_omicron: Int get() = TODO()

val KEY_Greek_omicronaccent: Int get() = TODO()

val KEY_Greek_phi: Int get() = TODO()

val KEY_Greek_pi: Int get() = TODO()

val KEY_Greek_psi: Int get() = TODO()

val KEY_Greek_rho: Int get() = TODO()

val KEY_Greek_sigma: Int get() = TODO()

val KEY_Greek_switch: Int get() = TODO()

val KEY_Greek_tau: Int get() = TODO()

val KEY_Greek_theta: Int get() = TODO()

val KEY_Greek_upsilon: Int get() = TODO()

val KEY_Greek_upsilonaccent: Int get() = TODO()

val KEY_Greek_upsilonaccentdieresis: Int get() = TODO()

val KEY_Greek_upsilondieresis: Int get() = TODO()

val KEY_Greek_xi: Int get() = TODO()

val KEY_Greek_zeta: Int get() = TODO()

val KEY_Green: Int get() = TODO()

val KEY_H: Int get() = TODO()

val KEY_Hangul: Int get() = TODO()

val KEY_Hangul_A: Int get() = TODO()

val KEY_Hangul_AE: Int get() = TODO()

val KEY_Hangul_AraeA: Int get() = TODO()

val KEY_Hangul_AraeAE: Int get() = TODO()

val KEY_Hangul_Banja: Int get() = TODO()

val KEY_Hangul_Cieuc: Int get() = TODO()

val KEY_Hangul_Codeinput: Int get() = TODO()

val KEY_Hangul_Dikeud: Int get() = TODO()

val KEY_Hangul_E: Int get() = TODO()

val KEY_Hangul_EO: Int get() = TODO()

val KEY_Hangul_EU: Int get() = TODO()

val KEY_Hangul_End: Int get() = TODO()

val KEY_Hangul_Hanja: Int get() = TODO()

val KEY_Hangul_Hieuh: Int get() = TODO()

val KEY_Hangul_I: Int get() = TODO()

val KEY_Hangul_Ieung: Int get() = TODO()

val KEY_Hangul_J_Cieuc: Int get() = TODO()

val KEY_Hangul_J_Dikeud: Int get() = TODO()

val KEY_Hangul_J_Hieuh: Int get() = TODO()

val KEY_Hangul_J_Ieung: Int get() = TODO()

val KEY_Hangul_J_Jieuj: Int get() = TODO()

val KEY_Hangul_J_Khieuq: Int get() = TODO()

val KEY_Hangul_J_Kiyeog: Int get() = TODO()

val KEY_Hangul_J_KiyeogSios: Int get() = TODO()

val KEY_Hangul_J_KkogjiDalrinIeung: Int get() = TODO()

val KEY_Hangul_J_Mieum: Int get() = TODO()

val KEY_Hangul_J_Nieun: Int get() = TODO()

val KEY_Hangul_J_NieunHieuh: Int get() = TODO()

val KEY_Hangul_J_NieunJieuj: Int get() = TODO()

val KEY_Hangul_J_PanSios: Int get() = TODO()

val KEY_Hangul_J_Phieuf: Int get() = TODO()

val KEY_Hangul_J_Pieub: Int get() = TODO()

val KEY_Hangul_J_PieubSios: Int get() = TODO()

val KEY_Hangul_J_Rieul: Int get() = TODO()

val KEY_Hangul_J_RieulHieuh: Int get() = TODO()

val KEY_Hangul_J_RieulKiyeog: Int get() = TODO()

val KEY_Hangul_J_RieulMieum: Int get() = TODO()

val KEY_Hangul_J_RieulPhieuf: Int get() = TODO()

val KEY_Hangul_J_RieulPieub: Int get() = TODO()

val KEY_Hangul_J_RieulSios: Int get() = TODO()

val KEY_Hangul_J_RieulTieut: Int get() = TODO()

val KEY_Hangul_J_Sios: Int get() = TODO()

val KEY_Hangul_J_SsangKiyeog: Int get() = TODO()

val KEY_Hangul_J_SsangSios: Int get() = TODO()

val KEY_Hangul_J_Tieut: Int get() = TODO()

val KEY_Hangul_J_YeorinHieuh: Int get() = TODO()

val KEY_Hangul_Jamo: Int get() = TODO()

val KEY_Hangul_Jeonja: Int get() = TODO()

val KEY_Hangul_Jieuj: Int get() = TODO()

val KEY_Hangul_Khieuq: Int get() = TODO()

val KEY_Hangul_Kiyeog: Int get() = TODO()

val KEY_Hangul_KiyeogSios: Int get() = TODO()

val KEY_Hangul_KkogjiDalrinIeung: Int get() = TODO()

val KEY_Hangul_Mieum: Int get() = TODO()

val KEY_Hangul_MultipleCandidate: Int get() = TODO()

val KEY_Hangul_Nieun: Int get() = TODO()

val KEY_Hangul_NieunHieuh: Int get() = TODO()

val KEY_Hangul_NieunJieuj: Int get() = TODO()

val KEY_Hangul_O: Int get() = TODO()

val KEY_Hangul_OE: Int get() = TODO()

val KEY_Hangul_PanSios: Int get() = TODO()

val KEY_Hangul_Phieuf: Int get() = TODO()

val KEY_Hangul_Pieub: Int get() = TODO()

val KEY_Hangul_PieubSios: Int get() = TODO()

val KEY_Hangul_PostHanja: Int get() = TODO()

val KEY_Hangul_PreHanja: Int get() = TODO()

val KEY_Hangul_PreviousCandidate: Int get() = TODO()

val KEY_Hangul_Rieul: Int get() = TODO()

val KEY_Hangul_RieulHieuh: Int get() = TODO()

val KEY_Hangul_RieulKiyeog: Int get() = TODO()

val KEY_Hangul_RieulMieum: Int get() = TODO()

val KEY_Hangul_RieulPhieuf: Int get() = TODO()

val KEY_Hangul_RieulPieub: Int get() = TODO()

val KEY_Hangul_RieulSios: Int get() = TODO()

val KEY_Hangul_RieulTieut: Int get() = TODO()

val KEY_Hangul_RieulYeorinHieuh: Int get() = TODO()

val KEY_Hangul_Romaja: Int get() = TODO()

val KEY_Hangul_SingleCandidate: Int get() = TODO()

val KEY_Hangul_Sios: Int get() = TODO()

val KEY_Hangul_Special: Int get() = TODO()

val KEY_Hangul_SsangDikeud: Int get() = TODO()

val KEY_Hangul_SsangJieuj: Int get() = TODO()

val KEY_Hangul_SsangKiyeog: Int get() = TODO()

val KEY_Hangul_SsangPieub: Int get() = TODO()

val KEY_Hangul_SsangSios: Int get() = TODO()

val KEY_Hangul_Start: Int get() = TODO()

val KEY_Hangul_SunkyeongeumMieum: Int get() = TODO()

val KEY_Hangul_SunkyeongeumPhieuf: Int get() = TODO()

val KEY_Hangul_SunkyeongeumPieub: Int get() = TODO()

val KEY_Hangul_Tieut: Int get() = TODO()

val KEY_Hangul_U: Int get() = TODO()

val KEY_Hangul_WA: Int get() = TODO()

val KEY_Hangul_WAE: Int get() = TODO()

val KEY_Hangul_WE: Int get() = TODO()

val KEY_Hangul_WEO: Int get() = TODO()

val KEY_Hangul_WI: Int get() = TODO()

val KEY_Hangul_YA: Int get() = TODO()

val KEY_Hangul_YAE: Int get() = TODO()

val KEY_Hangul_YE: Int get() = TODO()

val KEY_Hangul_YEO: Int get() = TODO()

val KEY_Hangul_YI: Int get() = TODO()

val KEY_Hangul_YO: Int get() = TODO()

val KEY_Hangul_YU: Int get() = TODO()

val KEY_Hangul_YeorinHieuh: Int get() = TODO()

val KEY_Hangul_switch: Int get() = TODO()

val KEY_Hankaku: Int get() = TODO()

val KEY_Hcircumflex: Int get() = TODO()

val KEY_Hebrew_switch: Int get() = TODO()

val KEY_Help: Int get() = TODO()

val KEY_Henkan: Int get() = TODO()

val KEY_Henkan_Mode: Int get() = TODO()

val KEY_Hibernate: Int get() = TODO()

val KEY_Hiragana: Int get() = TODO()

val KEY_Hiragana_Katakana: Int get() = TODO()

val KEY_History: Int get() = TODO()

val KEY_Home: Int get() = TODO()

val KEY_HomePage: Int get() = TODO()

val KEY_HotLinks: Int get() = TODO()

val KEY_Hstroke: Int get() = TODO()

val KEY_Hyper_L: Int get() = TODO()

val KEY_Hyper_R: Int get() = TODO()

val KEY_I: Int get() = TODO()

val KEY_ISO_Center_Object: Int get() = TODO()

val KEY_ISO_Continuous_Underline: Int get() = TODO()

val KEY_ISO_Discontinuous_Underline: Int get() = TODO()

val KEY_ISO_Emphasize: Int get() = TODO()

val KEY_ISO_Enter: Int get() = TODO()

val KEY_ISO_Fast_Cursor_Down: Int get() = TODO()

val KEY_ISO_Fast_Cursor_Left: Int get() = TODO()

val KEY_ISO_Fast_Cursor_Right: Int get() = TODO()

val KEY_ISO_Fast_Cursor_Up: Int get() = TODO()

val KEY_ISO_First_Group: Int get() = TODO()

val KEY_ISO_First_Group_Lock: Int get() = TODO()

val KEY_ISO_Group_Latch: Int get() = TODO()

val KEY_ISO_Group_Lock: Int get() = TODO()

val KEY_ISO_Group_Shift: Int get() = TODO()

val KEY_ISO_Last_Group: Int get() = TODO()

val KEY_ISO_Last_Group_Lock: Int get() = TODO()

val KEY_ISO_Left_Tab: Int get() = TODO()

val KEY_ISO_Level2_Latch: Int get() = TODO()

val KEY_ISO_Level3_Latch: Int get() = TODO()

val KEY_ISO_Level3_Lock: Int get() = TODO()

val KEY_ISO_Level3_Shift: Int get() = TODO()

val KEY_ISO_Level5_Latch: Int get() = TODO()

val KEY_ISO_Level5_Lock: Int get() = TODO()

val KEY_ISO_Level5_Shift: Int get() = TODO()

val KEY_ISO_Lock: Int get() = TODO()

val KEY_ISO_Move_Line_Down: Int get() = TODO()

val KEY_ISO_Move_Line_Up: Int get() = TODO()

val KEY_ISO_Next_Group: Int get() = TODO()

val KEY_ISO_Next_Group_Lock: Int get() = TODO()

val KEY_ISO_Partial_Line_Down: Int get() = TODO()

val KEY_ISO_Partial_Line_Up: Int get() = TODO()

val KEY_ISO_Partial_Space_Left: Int get() = TODO()

val KEY_ISO_Partial_Space_Right: Int get() = TODO()

val KEY_ISO_Prev_Group: Int get() = TODO()

val KEY_ISO_Prev_Group_Lock: Int get() = TODO()

val KEY_ISO_Release_Both_Margins: Int get() = TODO()

val KEY_ISO_Release_Margin_Left: Int get() = TODO()

val KEY_ISO_Release_Margin_Right: Int get() = TODO()

val KEY_ISO_Set_Margin_Left: Int get() = TODO()

val KEY_ISO_Set_Margin_Right: Int get() = TODO()

val KEY_Iabovedot: Int get() = TODO()

val KEY_Iacute: Int get() = TODO()

val KEY_Ibelowdot: Int get() = TODO()

val KEY_Ibreve: Int get() = TODO()

val KEY_Icircumflex: Int get() = TODO()

val KEY_Idiaeresis: Int get() = TODO()

val KEY_Igrave: Int get() = TODO()

val KEY_Ihook: Int get() = TODO()

val KEY_Imacron: Int get() = TODO()

val KEY_Insert: Int get() = TODO()

val KEY_Iogonek: Int get() = TODO()

val KEY_Itilde: Int get() = TODO()

val KEY_J: Int get() = TODO()

val KEY_Jcircumflex: Int get() = TODO()

val KEY_K: Int get() = TODO()

val KEY_KP_0: Int get() = TODO()

val KEY_KP_1: Int get() = TODO()

val KEY_KP_2: Int get() = TODO()

val KEY_KP_3: Int get() = TODO()

val KEY_KP_4: Int get() = TODO()

val KEY_KP_5: Int get() = TODO()

val KEY_KP_6: Int get() = TODO()

val KEY_KP_7: Int get() = TODO()

val KEY_KP_8: Int get() = TODO()

val KEY_KP_9: Int get() = TODO()

val KEY_KP_Add: Int get() = TODO()

val KEY_KP_Begin: Int get() = TODO()

val KEY_KP_Decimal: Int get() = TODO()

val KEY_KP_Delete: Int get() = TODO()

val KEY_KP_Divide: Int get() = TODO()

val KEY_KP_Down: Int get() = TODO()

val KEY_KP_End: Int get() = TODO()

val KEY_KP_Enter: Int get() = TODO()

val KEY_KP_Equal: Int get() = TODO()

val KEY_KP_F1: Int get() = TODO()

val KEY_KP_F2: Int get() = TODO()

val KEY_KP_F3: Int get() = TODO()

val KEY_KP_F4: Int get() = TODO()

val KEY_KP_Home: Int get() = TODO()

val KEY_KP_Insert: Int get() = TODO()

val KEY_KP_Left: Int get() = TODO()

val KEY_KP_Multiply: Int get() = TODO()

val KEY_KP_Next: Int get() = TODO()

val KEY_KP_Page_Down: Int get() = TODO()

val KEY_KP_Page_Up: Int get() = TODO()

val KEY_KP_Prior: Int get() = TODO()

val KEY_KP_Right: Int get() = TODO()

val KEY_KP_Separator: Int get() = TODO()

val KEY_KP_Space: Int get() = TODO()

val KEY_KP_Subtract: Int get() = TODO()

val KEY_KP_Tab: Int get() = TODO()

val KEY_KP_Up: Int get() = TODO()

val KEY_Kana_Lock: Int get() = TODO()

val KEY_Kana_Shift: Int get() = TODO()

val KEY_Kanji: Int get() = TODO()

val KEY_Kanji_Bangou: Int get() = TODO()

val KEY_Katakana: Int get() = TODO()

val KEY_KbdBrightnessDown: Int get() = TODO()

val KEY_KbdBrightnessUp: Int get() = TODO()

val KEY_KbdLightOnOff: Int get() = TODO()

val KEY_Kcedilla: Int get() = TODO()

val KEY_Keyboard: Int get() = TODO()

val KEY_Korean_Won: Int get() = TODO()

val KEY_L: Int get() = TODO()

val KEY_L1: Int get() = TODO()

val KEY_L10: Int get() = TODO()

val KEY_L2: Int get() = TODO()

val KEY_L3: Int get() = TODO()

val KEY_L4: Int get() = TODO()

val KEY_L5: Int get() = TODO()

val KEY_L6: Int get() = TODO()

val KEY_L7: Int get() = TODO()

val KEY_L8: Int get() = TODO()

val KEY_L9: Int get() = TODO()

val KEY_Lacute: Int get() = TODO()

val KEY_Last_Virtual_Screen: Int get() = TODO()

val KEY_Launch0: Int get() = TODO()

val KEY_Launch1: Int get() = TODO()

val KEY_Launch2: Int get() = TODO()

val KEY_Launch3: Int get() = TODO()

val KEY_Launch4: Int get() = TODO()

val KEY_Launch5: Int get() = TODO()

val KEY_Launch6: Int get() = TODO()

val KEY_Launch7: Int get() = TODO()

val KEY_Launch8: Int get() = TODO()

val KEY_Launch9: Int get() = TODO()

val KEY_LaunchA: Int get() = TODO()

val KEY_LaunchB: Int get() = TODO()

val KEY_LaunchC: Int get() = TODO()

val KEY_LaunchD: Int get() = TODO()

val KEY_LaunchE: Int get() = TODO()

val KEY_LaunchF: Int get() = TODO()

val KEY_Lbelowdot: Int get() = TODO()

val KEY_Lcaron: Int get() = TODO()

val KEY_Lcedilla: Int get() = TODO()

val KEY_Left: Int get() = TODO()

val KEY_LightBulb: Int get() = TODO()

val KEY_Linefeed: Int get() = TODO()

val KEY_LiraSign: Int get() = TODO()

val KEY_LogGrabInfo: Int get() = TODO()

val KEY_LogOff: Int get() = TODO()

val KEY_LogWindowTree: Int get() = TODO()

val KEY_Lstroke: Int get() = TODO()

val KEY_M: Int get() = TODO()

val KEY_Mabovedot: Int get() = TODO()

val KEY_Macedonia_DSE: Int get() = TODO()

val KEY_Macedonia_GJE: Int get() = TODO()

val KEY_Macedonia_KJE: Int get() = TODO()

val KEY_Macedonia_dse: Int get() = TODO()

val KEY_Macedonia_gje: Int get() = TODO()

val KEY_Macedonia_kje: Int get() = TODO()

val KEY_Mae_Koho: Int get() = TODO()

val KEY_Mail: Int get() = TODO()

val KEY_MailForward: Int get() = TODO()

val KEY_Market: Int get() = TODO()

val KEY_Massyo: Int get() = TODO()

val KEY_Meeting: Int get() = TODO()

val KEY_Memo: Int get() = TODO()

val KEY_Menu: Int get() = TODO()

val KEY_MenuKB: Int get() = TODO()

val KEY_MenuPB: Int get() = TODO()

val KEY_Messenger: Int get() = TODO()

val KEY_Meta_L: Int get() = TODO()

val KEY_Meta_R: Int get() = TODO()

val KEY_MillSign: Int get() = TODO()

val KEY_ModeLock: Int get() = TODO()

val KEY_Mode_switch: Int get() = TODO()

val KEY_MonBrightnessDown: Int get() = TODO()

val KEY_MonBrightnessUp: Int get() = TODO()

val KEY_MouseKeys_Accel_Enable: Int get() = TODO()

val KEY_MouseKeys_Enable: Int get() = TODO()

val KEY_Muhenkan: Int get() = TODO()

val KEY_Multi_key: Int get() = TODO()

val KEY_MultipleCandidate: Int get() = TODO()

val KEY_Music: Int get() = TODO()

val KEY_MyComputer: Int get() = TODO()

val KEY_MySites: Int get() = TODO()

val KEY_N: Int get() = TODO()

val KEY_Nacute: Int get() = TODO()

val KEY_NairaSign: Int get() = TODO()

val KEY_Ncaron: Int get() = TODO()

val KEY_Ncedilla: Int get() = TODO()

val KEY_New: Int get() = TODO()

val KEY_NewSheqelSign: Int get() = TODO()

val KEY_News: Int get() = TODO()

val KEY_Next: Int get() = TODO()

val KEY_Next_VMode: Int get() = TODO()

val KEY_Next_Virtual_Screen: Int get() = TODO()

val KEY_Ntilde: Int get() = TODO()

val KEY_Num_Lock: Int get() = TODO()

val KEY_O: Int get() = TODO()

val KEY_OE: Int get() = TODO()

val KEY_Oacute: Int get() = TODO()

val KEY_Obarred: Int get() = TODO()

val KEY_Obelowdot: Int get() = TODO()

val KEY_Ocaron: Int get() = TODO()

val KEY_Ocircumflex: Int get() = TODO()

val KEY_Ocircumflexacute: Int get() = TODO()

val KEY_Ocircumflexbelowdot: Int get() = TODO()

val KEY_Ocircumflexgrave: Int get() = TODO()

val KEY_Ocircumflexhook: Int get() = TODO()

val KEY_Ocircumflextilde: Int get() = TODO()

val KEY_Odiaeresis: Int get() = TODO()

val KEY_Odoubleacute: Int get() = TODO()

val KEY_OfficeHome: Int get() = TODO()

val KEY_Ograve: Int get() = TODO()

val KEY_Ohook: Int get() = TODO()

val KEY_Ohorn: Int get() = TODO()

val KEY_Ohornacute: Int get() = TODO()

val KEY_Ohornbelowdot: Int get() = TODO()

val KEY_Ohorngrave: Int get() = TODO()

val KEY_Ohornhook: Int get() = TODO()

val KEY_Ohorntilde: Int get() = TODO()

val KEY_Omacron: Int get() = TODO()

val KEY_Ooblique: Int get() = TODO()

val KEY_Open: Int get() = TODO()

val KEY_OpenURL: Int get() = TODO()

val KEY_Option: Int get() = TODO()

val KEY_Oslash: Int get() = TODO()

val KEY_Otilde: Int get() = TODO()

val KEY_Overlay1_Enable: Int get() = TODO()

val KEY_Overlay2_Enable: Int get() = TODO()

val KEY_P: Int get() = TODO()

val KEY_Pabovedot: Int get() = TODO()

val KEY_Page_Down: Int get() = TODO()

val KEY_Page_Up: Int get() = TODO()

val KEY_Paste: Int get() = TODO()

val KEY_Pause: Int get() = TODO()

val KEY_PesetaSign: Int get() = TODO()

val KEY_Phone: Int get() = TODO()

val KEY_Pictures: Int get() = TODO()

val KEY_Pointer_Accelerate: Int get() = TODO()

val KEY_Pointer_Button1: Int get() = TODO()

val KEY_Pointer_Button2: Int get() = TODO()

val KEY_Pointer_Button3: Int get() = TODO()

val KEY_Pointer_Button4: Int get() = TODO()

val KEY_Pointer_Button5: Int get() = TODO()

val KEY_Pointer_Button_Dflt: Int get() = TODO()

val KEY_Pointer_DblClick1: Int get() = TODO()

val KEY_Pointer_DblClick2: Int get() = TODO()

val KEY_Pointer_DblClick3: Int get() = TODO()

val KEY_Pointer_DblClick4: Int get() = TODO()

val KEY_Pointer_DblClick5: Int get() = TODO()

val KEY_Pointer_DblClick_Dflt: Int get() = TODO()

val KEY_Pointer_DfltBtnNext: Int get() = TODO()

val KEY_Pointer_DfltBtnPrev: Int get() = TODO()

val KEY_Pointer_Down: Int get() = TODO()

val KEY_Pointer_DownLeft: Int get() = TODO()

val KEY_Pointer_DownRight: Int get() = TODO()

val KEY_Pointer_Drag1: Int get() = TODO()

val KEY_Pointer_Drag2: Int get() = TODO()

val KEY_Pointer_Drag3: Int get() = TODO()

val KEY_Pointer_Drag4: Int get() = TODO()

val KEY_Pointer_Drag5: Int get() = TODO()

val KEY_Pointer_Drag_Dflt: Int get() = TODO()

val KEY_Pointer_EnableKeys: Int get() = TODO()

val KEY_Pointer_Left: Int get() = TODO()

val KEY_Pointer_Right: Int get() = TODO()

val KEY_Pointer_Up: Int get() = TODO()

val KEY_Pointer_UpLeft: Int get() = TODO()

val KEY_Pointer_UpRight: Int get() = TODO()

val KEY_PowerDown: Int get() = TODO()

val KEY_PowerOff: Int get() = TODO()

val KEY_Prev_VMode: Int get() = TODO()

val KEY_Prev_Virtual_Screen: Int get() = TODO()

val KEY_PreviousCandidate: Int get() = TODO()

val KEY_Print: Int get() = TODO()

val KEY_Prior: Int get() = TODO()

val KEY_Q: Int get() = TODO()

val KEY_R: Int get() = TODO()

val KEY_R1: Int get() = TODO()

val KEY_R10: Int get() = TODO()

val KEY_R11: Int get() = TODO()

val KEY_R12: Int get() = TODO()

val KEY_R13: Int get() = TODO()

val KEY_R14: Int get() = TODO()

val KEY_R15: Int get() = TODO()

val KEY_R2: Int get() = TODO()

val KEY_R3: Int get() = TODO()

val KEY_R4: Int get() = TODO()

val KEY_R5: Int get() = TODO()

val KEY_R6: Int get() = TODO()

val KEY_R7: Int get() = TODO()

val KEY_R8: Int get() = TODO()

val KEY_R9: Int get() = TODO()

val KEY_RFKill: Int get() = TODO()

val KEY_Racute: Int get() = TODO()

val KEY_Rcaron: Int get() = TODO()

val KEY_Rcedilla: Int get() = TODO()

val KEY_Red: Int get() = TODO()

val KEY_Redo: Int get() = TODO()

val KEY_Refresh: Int get() = TODO()

val KEY_Reload: Int get() = TODO()

val KEY_RepeatKeys_Enable: Int get() = TODO()

val KEY_Reply: Int get() = TODO()

val KEY_Return: Int get() = TODO()

val KEY_Right: Int get() = TODO()

val KEY_RockerDown: Int get() = TODO()

val KEY_RockerEnter: Int get() = TODO()

val KEY_RockerUp: Int get() = TODO()

val KEY_Romaji: Int get() = TODO()

val KEY_RotateWindows: Int get() = TODO()

val KEY_RotationKB: Int get() = TODO()

val KEY_RotationPB: Int get() = TODO()

val KEY_RupeeSign: Int get() = TODO()

val KEY_S: Int get() = TODO()

val KEY_SCHWA: Int get() = TODO()

val KEY_Sabovedot: Int get() = TODO()

val KEY_Sacute: Int get() = TODO()

val KEY_Save: Int get() = TODO()

val KEY_Scaron: Int get() = TODO()

val KEY_Scedilla: Int get() = TODO()

val KEY_Scircumflex: Int get() = TODO()

val KEY_ScreenSaver: Int get() = TODO()

val KEY_ScrollClick: Int get() = TODO()

val KEY_ScrollDown: Int get() = TODO()

val KEY_ScrollUp: Int get() = TODO()

val KEY_Scroll_Lock: Int get() = TODO()

val KEY_Search: Int get() = TODO()

val KEY_Select: Int get() = TODO()

val KEY_SelectButton: Int get() = TODO()

val KEY_Send: Int get() = TODO()

val KEY_Serbian_DJE: Int get() = TODO()

val KEY_Serbian_DZE: Int get() = TODO()

val KEY_Serbian_JE: Int get() = TODO()

val KEY_Serbian_LJE: Int get() = TODO()

val KEY_Serbian_NJE: Int get() = TODO()

val KEY_Serbian_TSHE: Int get() = TODO()

val KEY_Serbian_dje: Int get() = TODO()

val KEY_Serbian_dze: Int get() = TODO()

val KEY_Serbian_je: Int get() = TODO()

val KEY_Serbian_lje: Int get() = TODO()

val KEY_Serbian_nje: Int get() = TODO()

val KEY_Serbian_tshe: Int get() = TODO()

val KEY_Shift_L: Int get() = TODO()

val KEY_Shift_Lock: Int get() = TODO()

val KEY_Shift_R: Int get() = TODO()

val KEY_Shop: Int get() = TODO()

val KEY_SingleCandidate: Int get() = TODO()

val KEY_Sinh_a: Int get() = TODO()

val KEY_Sinh_aa: Int get() = TODO()

val KEY_Sinh_aa2: Int get() = TODO()

val KEY_Sinh_ae: Int get() = TODO()

val KEY_Sinh_ae2: Int get() = TODO()

val KEY_Sinh_aee: Int get() = TODO()

val KEY_Sinh_aee2: Int get() = TODO()

val KEY_Sinh_ai: Int get() = TODO()

val KEY_Sinh_ai2: Int get() = TODO()

val KEY_Sinh_al: Int get() = TODO()

val KEY_Sinh_au: Int get() = TODO()

val KEY_Sinh_au2: Int get() = TODO()

val KEY_Sinh_ba: Int get() = TODO()

val KEY_Sinh_bha: Int get() = TODO()

val KEY_Sinh_ca: Int get() = TODO()

val KEY_Sinh_cha: Int get() = TODO()

val KEY_Sinh_dda: Int get() = TODO()

val KEY_Sinh_ddha: Int get() = TODO()

val KEY_Sinh_dha: Int get() = TODO()

val KEY_Sinh_dhha: Int get() = TODO()

val KEY_Sinh_e: Int get() = TODO()

val KEY_Sinh_e2: Int get() = TODO()

val KEY_Sinh_ee: Int get() = TODO()

val KEY_Sinh_ee2: Int get() = TODO()

val KEY_Sinh_fa: Int get() = TODO()

val KEY_Sinh_ga: Int get() = TODO()

val KEY_Sinh_gha: Int get() = TODO()

val KEY_Sinh_h2: Int get() = TODO()

val KEY_Sinh_ha: Int get() = TODO()

val KEY_Sinh_i: Int get() = TODO()

val KEY_Sinh_i2: Int get() = TODO()

val KEY_Sinh_ii: Int get() = TODO()

val KEY_Sinh_ii2: Int get() = TODO()

val KEY_Sinh_ja: Int get() = TODO()

val KEY_Sinh_jha: Int get() = TODO()

val KEY_Sinh_jnya: Int get() = TODO()

val KEY_Sinh_ka: Int get() = TODO()

val KEY_Sinh_kha: Int get() = TODO()

val KEY_Sinh_kunddaliya: Int get() = TODO()

val KEY_Sinh_la: Int get() = TODO()

val KEY_Sinh_lla: Int get() = TODO()

val KEY_Sinh_lu: Int get() = TODO()

val KEY_Sinh_lu2: Int get() = TODO()

val KEY_Sinh_luu: Int get() = TODO()

val KEY_Sinh_luu2: Int get() = TODO()

val KEY_Sinh_ma: Int get() = TODO()

val KEY_Sinh_mba: Int get() = TODO()

val KEY_Sinh_na: Int get() = TODO()

val KEY_Sinh_ndda: Int get() = TODO()

val KEY_Sinh_ndha: Int get() = TODO()

val KEY_Sinh_ng: Int get() = TODO()

val KEY_Sinh_ng2: Int get() = TODO()

val KEY_Sinh_nga: Int get() = TODO()

val KEY_Sinh_nja: Int get() = TODO()

val KEY_Sinh_nna: Int get() = TODO()

val KEY_Sinh_nya: Int get() = TODO()

val KEY_Sinh_o: Int get() = TODO()

val KEY_Sinh_o2: Int get() = TODO()

val KEY_Sinh_oo: Int get() = TODO()

val KEY_Sinh_oo2: Int get() = TODO()

val KEY_Sinh_pa: Int get() = TODO()

val KEY_Sinh_pha: Int get() = TODO()

val KEY_Sinh_ra: Int get() = TODO()

val KEY_Sinh_ri: Int get() = TODO()

val KEY_Sinh_rii: Int get() = TODO()

val KEY_Sinh_ru2: Int get() = TODO()

val KEY_Sinh_ruu2: Int get() = TODO()

val KEY_Sinh_sa: Int get() = TODO()

val KEY_Sinh_sha: Int get() = TODO()

val KEY_Sinh_ssha: Int get() = TODO()

val KEY_Sinh_tha: Int get() = TODO()

val KEY_Sinh_thha: Int get() = TODO()

val KEY_Sinh_tta: Int get() = TODO()

val KEY_Sinh_ttha: Int get() = TODO()

val KEY_Sinh_u: Int get() = TODO()

val KEY_Sinh_u2: Int get() = TODO()

val KEY_Sinh_uu: Int get() = TODO()

val KEY_Sinh_uu2: Int get() = TODO()

val KEY_Sinh_va: Int get() = TODO()

val KEY_Sinh_ya: Int get() = TODO()

val KEY_Sleep: Int get() = TODO()

val KEY_SlowKeys_Enable: Int get() = TODO()

val KEY_Spell: Int get() = TODO()

val KEY_SplitScreen: Int get() = TODO()

val KEY_Standby: Int get() = TODO()

val KEY_Start: Int get() = TODO()

val KEY_StickyKeys_Enable: Int get() = TODO()

val KEY_Stop: Int get() = TODO()

val KEY_Subtitle: Int get() = TODO()

val KEY_Super_L: Int get() = TODO()

val KEY_Super_R: Int get() = TODO()

val KEY_Support: Int get() = TODO()

val KEY_Suspend: Int get() = TODO()

val KEY_Switch_VT_1: Int get() = TODO()

val KEY_Switch_VT_10: Int get() = TODO()

val KEY_Switch_VT_11: Int get() = TODO()

val KEY_Switch_VT_12: Int get() = TODO()

val KEY_Switch_VT_2: Int get() = TODO()

val KEY_Switch_VT_3: Int get() = TODO()

val KEY_Switch_VT_4: Int get() = TODO()

val KEY_Switch_VT_5: Int get() = TODO()

val KEY_Switch_VT_6: Int get() = TODO()

val KEY_Switch_VT_7: Int get() = TODO()

val KEY_Switch_VT_8: Int get() = TODO()

val KEY_Switch_VT_9: Int get() = TODO()

val KEY_Sys_Req: Int get() = TODO()

val KEY_T: Int get() = TODO()

val KEY_THORN: Int get() = TODO()

val KEY_Tab: Int get() = TODO()

val KEY_Tabovedot: Int get() = TODO()

val KEY_TaskPane: Int get() = TODO()

val KEY_Tcaron: Int get() = TODO()

val KEY_Tcedilla: Int get() = TODO()

val KEY_Terminal: Int get() = TODO()

val KEY_Terminate_Server: Int get() = TODO()

val KEY_Thai_baht: Int get() = TODO()

val KEY_Thai_bobaimai: Int get() = TODO()

val KEY_Thai_chochan: Int get() = TODO()

val KEY_Thai_chochang: Int get() = TODO()

val KEY_Thai_choching: Int get() = TODO()

val KEY_Thai_chochoe: Int get() = TODO()

val KEY_Thai_dochada: Int get() = TODO()

val KEY_Thai_dodek: Int get() = TODO()

val KEY_Thai_fofa: Int get() = TODO()

val KEY_Thai_fofan: Int get() = TODO()

val KEY_Thai_hohip: Int get() = TODO()

val KEY_Thai_honokhuk: Int get() = TODO()

val KEY_Thai_khokhai: Int get() = TODO()

val KEY_Thai_khokhon: Int get() = TODO()

val KEY_Thai_khokhuat: Int get() = TODO()

val KEY_Thai_khokhwai: Int get() = TODO()

val KEY_Thai_khorakhang: Int get() = TODO()

val KEY_Thai_kokai: Int get() = TODO()

val KEY_Thai_lakkhangyao: Int get() = TODO()

val KEY_Thai_lekchet: Int get() = TODO()

val KEY_Thai_lekha: Int get() = TODO()

val KEY_Thai_lekhok: Int get() = TODO()

val KEY_Thai_lekkao: Int get() = TODO()

val KEY_Thai_leknung: Int get() = TODO()

val KEY_Thai_lekpaet: Int get() = TODO()

val KEY_Thai_leksam: Int get() = TODO()

val KEY_Thai_leksi: Int get() = TODO()

val KEY_Thai_leksong: Int get() = TODO()

val KEY_Thai_leksun: Int get() = TODO()

val KEY_Thai_lochula: Int get() = TODO()

val KEY_Thai_loling: Int get() = TODO()

val KEY_Thai_lu: Int get() = TODO()

val KEY_Thai_maichattawa: Int get() = TODO()

val KEY_Thai_maiek: Int get() = TODO()

val KEY_Thai_maihanakat: Int get() = TODO()

val KEY_Thai_maihanakat_maitho: Int get() = TODO()

val KEY_Thai_maitaikhu: Int get() = TODO()

val KEY_Thai_maitho: Int get() = TODO()

val KEY_Thai_maitri: Int get() = TODO()

val KEY_Thai_maiyamok: Int get() = TODO()

val KEY_Thai_moma: Int get() = TODO()

val KEY_Thai_ngongu: Int get() = TODO()

val KEY_Thai_nikhahit: Int get() = TODO()

val KEY_Thai_nonen: Int get() = TODO()

val KEY_Thai_nonu: Int get() = TODO()

val KEY_Thai_oang: Int get() = TODO()

val KEY_Thai_paiyannoi: Int get() = TODO()

val KEY_Thai_phinthu: Int get() = TODO()

val KEY_Thai_phophan: Int get() = TODO()

val KEY_Thai_phophung: Int get() = TODO()

val KEY_Thai_phosamphao: Int get() = TODO()

val KEY_Thai_popla: Int get() = TODO()

val KEY_Thai_rorua: Int get() = TODO()

val KEY_Thai_ru: Int get() = TODO()

val KEY_Thai_saraa: Int get() = TODO()

val KEY_Thai_saraaa: Int get() = TODO()

val KEY_Thai_saraae: Int get() = TODO()

val KEY_Thai_saraaimaimalai: Int get() = TODO()

val KEY_Thai_saraaimaimuan: Int get() = TODO()

val KEY_Thai_saraam: Int get() = TODO()

val KEY_Thai_sarae: Int get() = TODO()

val KEY_Thai_sarai: Int get() = TODO()

val KEY_Thai_saraii: Int get() = TODO()

val KEY_Thai_sarao: Int get() = TODO()

val KEY_Thai_sarau: Int get() = TODO()

val KEY_Thai_saraue: Int get() = TODO()

val KEY_Thai_sarauee: Int get() = TODO()

val KEY_Thai_sarauu: Int get() = TODO()

val KEY_Thai_sorusi: Int get() = TODO()

val KEY_Thai_sosala: Int get() = TODO()

val KEY_Thai_soso: Int get() = TODO()

val KEY_Thai_sosua: Int get() = TODO()

val KEY_Thai_thanthakhat: Int get() = TODO()

val KEY_Thai_thonangmontho: Int get() = TODO()

val KEY_Thai_thophuthao: Int get() = TODO()

val KEY_Thai_thothahan: Int get() = TODO()

val KEY_Thai_thothan: Int get() = TODO()

val KEY_Thai_thothong: Int get() = TODO()

val KEY_Thai_thothung: Int get() = TODO()

val KEY_Thai_topatak: Int get() = TODO()

val KEY_Thai_totao: Int get() = TODO()

val KEY_Thai_wowaen: Int get() = TODO()

val KEY_Thai_yoyak: Int get() = TODO()

val KEY_Thai_yoying: Int get() = TODO()

val KEY_Thorn: Int get() = TODO()

val KEY_Time: Int get() = TODO()

val KEY_ToDoList: Int get() = TODO()

val KEY_Tools: Int get() = TODO()

val KEY_TopMenu: Int get() = TODO()

val KEY_TouchpadOff: Int get() = TODO()

val KEY_TouchpadOn: Int get() = TODO()

val KEY_TouchpadToggle: Int get() = TODO()

val KEY_Touroku: Int get() = TODO()

val KEY_Travel: Int get() = TODO()

val KEY_Tslash: Int get() = TODO()

val KEY_U: Int get() = TODO()

val KEY_UWB: Int get() = TODO()

val KEY_Uacute: Int get() = TODO()

val KEY_Ubelowdot: Int get() = TODO()

val KEY_Ubreve: Int get() = TODO()

val KEY_Ucircumflex: Int get() = TODO()

val KEY_Udiaeresis: Int get() = TODO()

val KEY_Udoubleacute: Int get() = TODO()

val KEY_Ugrave: Int get() = TODO()

val KEY_Uhook: Int get() = TODO()

val KEY_Uhorn: Int get() = TODO()

val KEY_Uhornacute: Int get() = TODO()

val KEY_Uhornbelowdot: Int get() = TODO()

val KEY_Uhorngrave: Int get() = TODO()

val KEY_Uhornhook: Int get() = TODO()

val KEY_Uhorntilde: Int get() = TODO()

val KEY_Ukrainian_GHE_WITH_UPTURN: Int get() = TODO()

val KEY_Ukrainian_I: Int get() = TODO()

val KEY_Ukrainian_IE: Int get() = TODO()

val KEY_Ukrainian_YI: Int get() = TODO()

val KEY_Ukrainian_ghe_with_upturn: Int get() = TODO()

val KEY_Ukrainian_i: Int get() = TODO()

val KEY_Ukrainian_ie: Int get() = TODO()

val KEY_Ukrainian_yi: Int get() = TODO()

val KEY_Ukranian_I: Int get() = TODO()

val KEY_Ukranian_JE: Int get() = TODO()

val KEY_Ukranian_YI: Int get() = TODO()

val KEY_Ukranian_i: Int get() = TODO()

val KEY_Ukranian_je: Int get() = TODO()

val KEY_Ukranian_yi: Int get() = TODO()

val KEY_Umacron: Int get() = TODO()

val KEY_Undo: Int get() = TODO()

val KEY_Ungrab: Int get() = TODO()

val KEY_Uogonek: Int get() = TODO()

val KEY_Up: Int get() = TODO()

val KEY_Uring: Int get() = TODO()

val KEY_User1KB: Int get() = TODO()

val KEY_User2KB: Int get() = TODO()

val KEY_UserPB: Int get() = TODO()

val KEY_Utilde: Int get() = TODO()

val KEY_V: Int get() = TODO()

val KEY_VendorHome: Int get() = TODO()

val KEY_Video: Int get() = TODO()

val KEY_View: Int get() = TODO()

val KEY_VoidSymbol: Int get() = TODO()

val KEY_W: Int get() = TODO()

val KEY_WLAN: Int get() = TODO()

val KEY_WWAN: Int get() = TODO()

val KEY_WWW: Int get() = TODO()

val KEY_Wacute: Int get() = TODO()

val KEY_WakeUp: Int get() = TODO()

val KEY_Wcircumflex: Int get() = TODO()

val KEY_Wdiaeresis: Int get() = TODO()

val KEY_WebCam: Int get() = TODO()

val KEY_Wgrave: Int get() = TODO()

val KEY_WheelButton: Int get() = TODO()

val KEY_WindowClear: Int get() = TODO()

val KEY_WonSign: Int get() = TODO()

val KEY_Word: Int get() = TODO()

val KEY_X: Int get() = TODO()

val KEY_Xabovedot: Int get() = TODO()

val KEY_Xfer: Int get() = TODO()

val KEY_Y: Int get() = TODO()

val KEY_Yacute: Int get() = TODO()

val KEY_Ybelowdot: Int get() = TODO()

val KEY_Ycircumflex: Int get() = TODO()

val KEY_Ydiaeresis: Int get() = TODO()

val KEY_Yellow: Int get() = TODO()

val KEY_Ygrave: Int get() = TODO()

val KEY_Yhook: Int get() = TODO()

val KEY_Ytilde: Int get() = TODO()

val KEY_Z: Int get() = TODO()

val KEY_Zabovedot: Int get() = TODO()

val KEY_Zacute: Int get() = TODO()

val KEY_Zcaron: Int get() = TODO()

val KEY_Zen_Koho: Int get() = TODO()

val KEY_Zenkaku: Int get() = TODO()

val KEY_Zenkaku_Hankaku: Int get() = TODO()

val KEY_ZoomIn: Int get() = TODO()

val KEY_ZoomOut: Int get() = TODO()

val KEY_Zstroke: Int get() = TODO()

val KEY_a: Int get() = TODO()

val KEY_aacute: Int get() = TODO()

val KEY_abelowdot: Int get() = TODO()

val KEY_abovedot: Int get() = TODO()

val KEY_abreve: Int get() = TODO()

val KEY_abreveacute: Int get() = TODO()

val KEY_abrevebelowdot: Int get() = TODO()

val KEY_abrevegrave: Int get() = TODO()

val KEY_abrevehook: Int get() = TODO()

val KEY_abrevetilde: Int get() = TODO()

val KEY_acircumflex: Int get() = TODO()

val KEY_acircumflexacute: Int get() = TODO()

val KEY_acircumflexbelowdot: Int get() = TODO()

val KEY_acircumflexgrave: Int get() = TODO()

val KEY_acircumflexhook: Int get() = TODO()

val KEY_acircumflextilde: Int get() = TODO()

val KEY_acute: Int get() = TODO()

val KEY_adiaeresis: Int get() = TODO()

val KEY_ae: Int get() = TODO()

val KEY_agrave: Int get() = TODO()

val KEY_ahook: Int get() = TODO()

val KEY_amacron: Int get() = TODO()

val KEY_ampersand: Int get() = TODO()

val KEY_aogonek: Int get() = TODO()

val KEY_apostrophe: Int get() = TODO()

val KEY_approxeq: Int get() = TODO()

val KEY_approximate: Int get() = TODO()

val KEY_aring: Int get() = TODO()

val KEY_asciicircum: Int get() = TODO()

val KEY_asciitilde: Int get() = TODO()

val KEY_asterisk: Int get() = TODO()

val KEY_at: Int get() = TODO()

val KEY_atilde: Int get() = TODO()

val KEY_b: Int get() = TODO()

val KEY_babovedot: Int get() = TODO()

val KEY_backslash: Int get() = TODO()

val KEY_ballotcross: Int get() = TODO()

val KEY_bar: Int get() = TODO()

val KEY_because: Int get() = TODO()

val KEY_blank: Int get() = TODO()

val KEY_botintegral: Int get() = TODO()

val KEY_botleftparens: Int get() = TODO()

val KEY_botleftsqbracket: Int get() = TODO()

val KEY_botleftsummation: Int get() = TODO()

val KEY_botrightparens: Int get() = TODO()

val KEY_botrightsqbracket: Int get() = TODO()

val KEY_botrightsummation: Int get() = TODO()

val KEY_bott: Int get() = TODO()

val KEY_botvertsummationconnector: Int get() = TODO()

val KEY_braceleft: Int get() = TODO()

val KEY_braceright: Int get() = TODO()

val KEY_bracketleft: Int get() = TODO()

val KEY_bracketright: Int get() = TODO()

val KEY_braille_blank: Int get() = TODO()

val KEY_braille_dot_1: Int get() = TODO()

val KEY_braille_dot_10: Int get() = TODO()

val KEY_braille_dot_2: Int get() = TODO()

val KEY_braille_dot_3: Int get() = TODO()

val KEY_braille_dot_4: Int get() = TODO()

val KEY_braille_dot_5: Int get() = TODO()

val KEY_braille_dot_6: Int get() = TODO()

val KEY_braille_dot_7: Int get() = TODO()

val KEY_braille_dot_8: Int get() = TODO()

val KEY_braille_dot_9: Int get() = TODO()

val KEY_braille_dots_1: Int get() = TODO()

val KEY_braille_dots_12: Int get() = TODO()

val KEY_braille_dots_123: Int get() = TODO()

val KEY_braille_dots_1234: Int get() = TODO()

val KEY_braille_dots_12345: Int get() = TODO()

val KEY_braille_dots_123456: Int get() = TODO()

val KEY_braille_dots_1234567: Int get() = TODO()

val KEY_braille_dots_12345678: Int get() = TODO()

val KEY_braille_dots_1234568: Int get() = TODO()

val KEY_braille_dots_123457: Int get() = TODO()

val KEY_braille_dots_1234578: Int get() = TODO()

val KEY_braille_dots_123458: Int get() = TODO()

val KEY_braille_dots_12346: Int get() = TODO()

val KEY_braille_dots_123467: Int get() = TODO()

val KEY_braille_dots_1234678: Int get() = TODO()

val KEY_braille_dots_123468: Int get() = TODO()

val KEY_braille_dots_12347: Int get() = TODO()

val KEY_braille_dots_123478: Int get() = TODO()

val KEY_braille_dots_12348: Int get() = TODO()

val KEY_braille_dots_1235: Int get() = TODO()

val KEY_braille_dots_12356: Int get() = TODO()

val KEY_braille_dots_123567: Int get() = TODO()

val KEY_braille_dots_1235678: Int get() = TODO()

val KEY_braille_dots_123568: Int get() = TODO()

val KEY_braille_dots_12357: Int get() = TODO()

val KEY_braille_dots_123578: Int get() = TODO()

val KEY_braille_dots_12358: Int get() = TODO()

val KEY_braille_dots_1236: Int get() = TODO()

val KEY_braille_dots_12367: Int get() = TODO()

val KEY_braille_dots_123678: Int get() = TODO()

val KEY_braille_dots_12368: Int get() = TODO()

val KEY_braille_dots_1237: Int get() = TODO()

val KEY_braille_dots_12378: Int get() = TODO()

val KEY_braille_dots_1238: Int get() = TODO()

val KEY_braille_dots_124: Int get() = TODO()

val KEY_braille_dots_1245: Int get() = TODO()

val KEY_braille_dots_12456: Int get() = TODO()

val KEY_braille_dots_124567: Int get() = TODO()

val KEY_braille_dots_1245678: Int get() = TODO()

val KEY_braille_dots_124568: Int get() = TODO()

val KEY_braille_dots_12457: Int get() = TODO()

val KEY_braille_dots_124578: Int get() = TODO()

val KEY_braille_dots_12458: Int get() = TODO()

val KEY_braille_dots_1246: Int get() = TODO()

val KEY_braille_dots_12467: Int get() = TODO()

val KEY_braille_dots_124678: Int get() = TODO()

val KEY_braille_dots_12468: Int get() = TODO()

val KEY_braille_dots_1247: Int get() = TODO()

val KEY_braille_dots_12478: Int get() = TODO()

val KEY_braille_dots_1248: Int get() = TODO()

val KEY_braille_dots_125: Int get() = TODO()

val KEY_braille_dots_1256: Int get() = TODO()

val KEY_braille_dots_12567: Int get() = TODO()

val KEY_braille_dots_125678: Int get() = TODO()

val KEY_braille_dots_12568: Int get() = TODO()

val KEY_braille_dots_1257: Int get() = TODO()

val KEY_braille_dots_12578: Int get() = TODO()

val KEY_braille_dots_1258: Int get() = TODO()

val KEY_braille_dots_126: Int get() = TODO()

val KEY_braille_dots_1267: Int get() = TODO()

val KEY_braille_dots_12678: Int get() = TODO()

val KEY_braille_dots_1268: Int get() = TODO()

val KEY_braille_dots_127: Int get() = TODO()

val KEY_braille_dots_1278: Int get() = TODO()

val KEY_braille_dots_128: Int get() = TODO()

val KEY_braille_dots_13: Int get() = TODO()

val KEY_braille_dots_134: Int get() = TODO()

val KEY_braille_dots_1345: Int get() = TODO()

val KEY_braille_dots_13456: Int get() = TODO()

val KEY_braille_dots_134567: Int get() = TODO()

val KEY_braille_dots_1345678: Int get() = TODO()

val KEY_braille_dots_134568: Int get() = TODO()

val KEY_braille_dots_13457: Int get() = TODO()

val KEY_braille_dots_134578: Int get() = TODO()

val KEY_braille_dots_13458: Int get() = TODO()

val KEY_braille_dots_1346: Int get() = TODO()

val KEY_braille_dots_13467: Int get() = TODO()

val KEY_braille_dots_134678: Int get() = TODO()

val KEY_braille_dots_13468: Int get() = TODO()

val KEY_braille_dots_1347: Int get() = TODO()

val KEY_braille_dots_13478: Int get() = TODO()

val KEY_braille_dots_1348: Int get() = TODO()

val KEY_braille_dots_135: Int get() = TODO()

val KEY_braille_dots_1356: Int get() = TODO()

val KEY_braille_dots_13567: Int get() = TODO()

val KEY_braille_dots_135678: Int get() = TODO()

val KEY_braille_dots_13568: Int get() = TODO()

val KEY_braille_dots_1357: Int get() = TODO()

val KEY_braille_dots_13578: Int get() = TODO()

val KEY_braille_dots_1358: Int get() = TODO()

val KEY_braille_dots_136: Int get() = TODO()

val KEY_braille_dots_1367: Int get() = TODO()

val KEY_braille_dots_13678: Int get() = TODO()

val KEY_braille_dots_1368: Int get() = TODO()

val KEY_braille_dots_137: Int get() = TODO()

val KEY_braille_dots_1378: Int get() = TODO()

val KEY_braille_dots_138: Int get() = TODO()

val KEY_braille_dots_14: Int get() = TODO()

val KEY_braille_dots_145: Int get() = TODO()

val KEY_braille_dots_1456: Int get() = TODO()

val KEY_braille_dots_14567: Int get() = TODO()

val KEY_braille_dots_145678: Int get() = TODO()

val KEY_braille_dots_14568: Int get() = TODO()

val KEY_braille_dots_1457: Int get() = TODO()

val KEY_braille_dots_14578: Int get() = TODO()

val KEY_braille_dots_1458: Int get() = TODO()

val KEY_braille_dots_146: Int get() = TODO()

val KEY_braille_dots_1467: Int get() = TODO()

val KEY_braille_dots_14678: Int get() = TODO()

val KEY_braille_dots_1468: Int get() = TODO()

val KEY_braille_dots_147: Int get() = TODO()

val KEY_braille_dots_1478: Int get() = TODO()

val KEY_braille_dots_148: Int get() = TODO()

val KEY_braille_dots_15: Int get() = TODO()

val KEY_braille_dots_156: Int get() = TODO()

val KEY_braille_dots_1567: Int get() = TODO()

val KEY_braille_dots_15678: Int get() = TODO()

val KEY_braille_dots_1568: Int get() = TODO()

val KEY_braille_dots_157: Int get() = TODO()

val KEY_braille_dots_1578: Int get() = TODO()

val KEY_braille_dots_158: Int get() = TODO()

val KEY_braille_dots_16: Int get() = TODO()

val KEY_braille_dots_167: Int get() = TODO()

val KEY_braille_dots_1678: Int get() = TODO()

val KEY_braille_dots_168: Int get() = TODO()

val KEY_braille_dots_17: Int get() = TODO()

val KEY_braille_dots_178: Int get() = TODO()

val KEY_braille_dots_18: Int get() = TODO()

val KEY_braille_dots_2: Int get() = TODO()

val KEY_braille_dots_23: Int get() = TODO()

val KEY_braille_dots_234: Int get() = TODO()

val KEY_braille_dots_2345: Int get() = TODO()

val KEY_braille_dots_23456: Int get() = TODO()

val KEY_braille_dots_234567: Int get() = TODO()

val KEY_braille_dots_2345678: Int get() = TODO()

val KEY_braille_dots_234568: Int get() = TODO()

val KEY_braille_dots_23457: Int get() = TODO()

val KEY_braille_dots_234578: Int get() = TODO()

val KEY_braille_dots_23458: Int get() = TODO()

val KEY_braille_dots_2346: Int get() = TODO()

val KEY_braille_dots_23467: Int get() = TODO()

val KEY_braille_dots_234678: Int get() = TODO()

val KEY_braille_dots_23468: Int get() = TODO()

val KEY_braille_dots_2347: Int get() = TODO()

val KEY_braille_dots_23478: Int get() = TODO()

val KEY_braille_dots_2348: Int get() = TODO()

val KEY_braille_dots_235: Int get() = TODO()

val KEY_braille_dots_2356: Int get() = TODO()

val KEY_braille_dots_23567: Int get() = TODO()

val KEY_braille_dots_235678: Int get() = TODO()

val KEY_braille_dots_23568: Int get() = TODO()

val KEY_braille_dots_2357: Int get() = TODO()

val KEY_braille_dots_23578: Int get() = TODO()

val KEY_braille_dots_2358: Int get() = TODO()

val KEY_braille_dots_236: Int get() = TODO()

val KEY_braille_dots_2367: Int get() = TODO()

val KEY_braille_dots_23678: Int get() = TODO()

val KEY_braille_dots_2368: Int get() = TODO()

val KEY_braille_dots_237: Int get() = TODO()

val KEY_braille_dots_2378: Int get() = TODO()

val KEY_braille_dots_238: Int get() = TODO()

val KEY_braille_dots_24: Int get() = TODO()

val KEY_braille_dots_245: Int get() = TODO()

val KEY_braille_dots_2456: Int get() = TODO()

val KEY_braille_dots_24567: Int get() = TODO()

val KEY_braille_dots_245678: Int get() = TODO()

val KEY_braille_dots_24568: Int get() = TODO()

val KEY_braille_dots_2457: Int get() = TODO()

val KEY_braille_dots_24578: Int get() = TODO()

val KEY_braille_dots_2458: Int get() = TODO()

val KEY_braille_dots_246: Int get() = TODO()

val KEY_braille_dots_2467: Int get() = TODO()

val KEY_braille_dots_24678: Int get() = TODO()

val KEY_braille_dots_2468: Int get() = TODO()

val KEY_braille_dots_247: Int get() = TODO()

val KEY_braille_dots_2478: Int get() = TODO()

val KEY_braille_dots_248: Int get() = TODO()

val KEY_braille_dots_25: Int get() = TODO()

val KEY_braille_dots_256: Int get() = TODO()

val KEY_braille_dots_2567: Int get() = TODO()

val KEY_braille_dots_25678: Int get() = TODO()

val KEY_braille_dots_2568: Int get() = TODO()

val KEY_braille_dots_257: Int get() = TODO()

val KEY_braille_dots_2578: Int get() = TODO()

val KEY_braille_dots_258: Int get() = TODO()

val KEY_braille_dots_26: Int get() = TODO()

val KEY_braille_dots_267: Int get() = TODO()

val KEY_braille_dots_2678: Int get() = TODO()

val KEY_braille_dots_268: Int get() = TODO()

val KEY_braille_dots_27: Int get() = TODO()

val KEY_braille_dots_278: Int get() = TODO()

val KEY_braille_dots_28: Int get() = TODO()

val KEY_braille_dots_3: Int get() = TODO()

val KEY_braille_dots_34: Int get() = TODO()

val KEY_braille_dots_345: Int get() = TODO()

val KEY_braille_dots_3456: Int get() = TODO()

val KEY_braille_dots_34567: Int get() = TODO()

val KEY_braille_dots_345678: Int get() = TODO()

val KEY_braille_dots_34568: Int get() = TODO()

val KEY_braille_dots_3457: Int get() = TODO()

val KEY_braille_dots_34578: Int get() = TODO()

val KEY_braille_dots_3458: Int get() = TODO()

val KEY_braille_dots_346: Int get() = TODO()

val KEY_braille_dots_3467: Int get() = TODO()

val KEY_braille_dots_34678: Int get() = TODO()

val KEY_braille_dots_3468: Int get() = TODO()

val KEY_braille_dots_347: Int get() = TODO()

val KEY_braille_dots_3478: Int get() = TODO()

val KEY_braille_dots_348: Int get() = TODO()

val KEY_braille_dots_35: Int get() = TODO()

val KEY_braille_dots_356: Int get() = TODO()

val KEY_braille_dots_3567: Int get() = TODO()

val KEY_braille_dots_35678: Int get() = TODO()

val KEY_braille_dots_3568: Int get() = TODO()

val KEY_braille_dots_357: Int get() = TODO()

val KEY_braille_dots_3578: Int get() = TODO()

val KEY_braille_dots_358: Int get() = TODO()

val KEY_braille_dots_36: Int get() = TODO()

val KEY_braille_dots_367: Int get() = TODO()

val KEY_braille_dots_3678: Int get() = TODO()

val KEY_braille_dots_368: Int get() = TODO()

val KEY_braille_dots_37: Int get() = TODO()

val KEY_braille_dots_378: Int get() = TODO()

val KEY_braille_dots_38: Int get() = TODO()

val KEY_braille_dots_4: Int get() = TODO()

val KEY_braille_dots_45: Int get() = TODO()

val KEY_braille_dots_456: Int get() = TODO()

val KEY_braille_dots_4567: Int get() = TODO()

val KEY_braille_dots_45678: Int get() = TODO()

val KEY_braille_dots_4568: Int get() = TODO()

val KEY_braille_dots_457: Int get() = TODO()

val KEY_braille_dots_4578: Int get() = TODO()

val KEY_braille_dots_458: Int get() = TODO()

val KEY_braille_dots_46: Int get() = TODO()

val KEY_braille_dots_467: Int get() = TODO()

val KEY_braille_dots_4678: Int get() = TODO()

val KEY_braille_dots_468: Int get() = TODO()

val KEY_braille_dots_47: Int get() = TODO()

val KEY_braille_dots_478: Int get() = TODO()

val KEY_braille_dots_48: Int get() = TODO()

val KEY_braille_dots_5: Int get() = TODO()

val KEY_braille_dots_56: Int get() = TODO()

val KEY_braille_dots_567: Int get() = TODO()

val KEY_braille_dots_5678: Int get() = TODO()

val KEY_braille_dots_568: Int get() = TODO()

val KEY_braille_dots_57: Int get() = TODO()

val KEY_braille_dots_578: Int get() = TODO()

val KEY_braille_dots_58: Int get() = TODO()

val KEY_braille_dots_6: Int get() = TODO()

val KEY_braille_dots_67: Int get() = TODO()

val KEY_braille_dots_678: Int get() = TODO()

val KEY_braille_dots_68: Int get() = TODO()

val KEY_braille_dots_7: Int get() = TODO()

val KEY_braille_dots_78: Int get() = TODO()

val KEY_braille_dots_8: Int get() = TODO()

val KEY_breve: Int get() = TODO()

val KEY_brokenbar: Int get() = TODO()

val KEY_c: Int get() = TODO()

val KEY_c_h: Int get() = TODO()

val KEY_cabovedot: Int get() = TODO()

val KEY_cacute: Int get() = TODO()

val KEY_careof: Int get() = TODO()

val KEY_caret: Int get() = TODO()

val KEY_caron: Int get() = TODO()

val KEY_ccaron: Int get() = TODO()

val KEY_ccedilla: Int get() = TODO()

val KEY_ccircumflex: Int get() = TODO()

val KEY_cedilla: Int get() = TODO()

val KEY_cent: Int get() = TODO()

val KEY_ch: Int get() = TODO()

val KEY_checkerboard: Int get() = TODO()

val KEY_checkmark: Int get() = TODO()

val KEY_circle: Int get() = TODO()

val KEY_club: Int get() = TODO()

val KEY_colon: Int get() = TODO()

val KEY_comma: Int get() = TODO()

val KEY_containsas: Int get() = TODO()

val KEY_copyright: Int get() = TODO()

val KEY_cr: Int get() = TODO()

val KEY_crossinglines: Int get() = TODO()

val KEY_cuberoot: Int get() = TODO()

val KEY_currency: Int get() = TODO()

val KEY_cursor: Int get() = TODO()

val KEY_d: Int get() = TODO()

val KEY_dabovedot: Int get() = TODO()

val KEY_dagger: Int get() = TODO()

val KEY_dcaron: Int get() = TODO()

val KEY_dead_A: Int get() = TODO()

val KEY_dead_E: Int get() = TODO()

val KEY_dead_I: Int get() = TODO()

val KEY_dead_O: Int get() = TODO()

val KEY_dead_U: Int get() = TODO()

val KEY_dead_a: Int get() = TODO()

val KEY_dead_abovecomma: Int get() = TODO()

val KEY_dead_abovedot: Int get() = TODO()

val KEY_dead_abovereversedcomma: Int get() = TODO()

val KEY_dead_abovering: Int get() = TODO()

val KEY_dead_aboveverticalline: Int get() = TODO()

val KEY_dead_acute: Int get() = TODO()

val KEY_dead_belowbreve: Int get() = TODO()

val KEY_dead_belowcircumflex: Int get() = TODO()

val KEY_dead_belowcomma: Int get() = TODO()

val KEY_dead_belowdiaeresis: Int get() = TODO()

val KEY_dead_belowdot: Int get() = TODO()

val KEY_dead_belowmacron: Int get() = TODO()

val KEY_dead_belowring: Int get() = TODO()

val KEY_dead_belowtilde: Int get() = TODO()

val KEY_dead_belowverticalline: Int get() = TODO()

val KEY_dead_breve: Int get() = TODO()

val KEY_dead_capital_schwa: Int get() = TODO()

val KEY_dead_caron: Int get() = TODO()

val KEY_dead_cedilla: Int get() = TODO()

val KEY_dead_circumflex: Int get() = TODO()

val KEY_dead_currency: Int get() = TODO()

val KEY_dead_dasia: Int get() = TODO()

val KEY_dead_diaeresis: Int get() = TODO()

val KEY_dead_doubleacute: Int get() = TODO()

val KEY_dead_doublegrave: Int get() = TODO()

val KEY_dead_e: Int get() = TODO()

val KEY_dead_grave: Int get() = TODO()

val KEY_dead_greek: Int get() = TODO()

val KEY_dead_hook: Int get() = TODO()

val KEY_dead_horn: Int get() = TODO()

val KEY_dead_i: Int get() = TODO()

val KEY_dead_invertedbreve: Int get() = TODO()

val KEY_dead_iota: Int get() = TODO()

val KEY_dead_longsolidusoverlay: Int get() = TODO()

val KEY_dead_lowline: Int get() = TODO()

val KEY_dead_macron: Int get() = TODO()

val KEY_dead_o: Int get() = TODO()

val KEY_dead_ogonek: Int get() = TODO()

val KEY_dead_perispomeni: Int get() = TODO()

val KEY_dead_psili: Int get() = TODO()

val KEY_dead_semivoiced_sound: Int get() = TODO()

val KEY_dead_small_schwa: Int get() = TODO()

val KEY_dead_stroke: Int get() = TODO()

val KEY_dead_tilde: Int get() = TODO()

val KEY_dead_u: Int get() = TODO()

val KEY_dead_voiced_sound: Int get() = TODO()

val KEY_decimalpoint: Int get() = TODO()

val KEY_degree: Int get() = TODO()

val KEY_diaeresis: Int get() = TODO()

val KEY_diamond: Int get() = TODO()

val KEY_digitspace: Int get() = TODO()

val KEY_dintegral: Int get() = TODO()

val KEY_division: Int get() = TODO()

val KEY_dollar: Int get() = TODO()

val KEY_doubbaselinedot: Int get() = TODO()

val KEY_doubleacute: Int get() = TODO()

val KEY_doubledagger: Int get() = TODO()

val KEY_doublelowquotemark: Int get() = TODO()

val KEY_downarrow: Int get() = TODO()

val KEY_downcaret: Int get() = TODO()

val KEY_downshoe: Int get() = TODO()

val KEY_downstile: Int get() = TODO()

val KEY_downtack: Int get() = TODO()

val KEY_dstroke: Int get() = TODO()

val KEY_e: Int get() = TODO()

val KEY_eabovedot: Int get() = TODO()

val KEY_eacute: Int get() = TODO()

val KEY_ebelowdot: Int get() = TODO()

val KEY_ecaron: Int get() = TODO()

val KEY_ecircumflex: Int get() = TODO()

val KEY_ecircumflexacute: Int get() = TODO()

val KEY_ecircumflexbelowdot: Int get() = TODO()

val KEY_ecircumflexgrave: Int get() = TODO()

val KEY_ecircumflexhook: Int get() = TODO()

val KEY_ecircumflextilde: Int get() = TODO()

val KEY_ediaeresis: Int get() = TODO()

val KEY_egrave: Int get() = TODO()

val KEY_ehook: Int get() = TODO()

val KEY_eightsubscript: Int get() = TODO()

val KEY_eightsuperior: Int get() = TODO()

val KEY_elementof: Int get() = TODO()

val KEY_ellipsis: Int get() = TODO()

val KEY_em3space: Int get() = TODO()

val KEY_em4space: Int get() = TODO()

val KEY_emacron: Int get() = TODO()

val KEY_emdash: Int get() = TODO()

val KEY_emfilledcircle: Int get() = TODO()

val KEY_emfilledrect: Int get() = TODO()

val KEY_emopencircle: Int get() = TODO()

val KEY_emopenrectangle: Int get() = TODO()

val KEY_emptyset: Int get() = TODO()

val KEY_emspace: Int get() = TODO()

val KEY_endash: Int get() = TODO()

val KEY_enfilledcircbullet: Int get() = TODO()

val KEY_enfilledsqbullet: Int get() = TODO()

val KEY_eng: Int get() = TODO()

val KEY_enopencircbullet: Int get() = TODO()

val KEY_enopensquarebullet: Int get() = TODO()

val KEY_enspace: Int get() = TODO()

val KEY_eogonek: Int get() = TODO()

val KEY_equal: Int get() = TODO()

val KEY_eth: Int get() = TODO()

val KEY_etilde: Int get() = TODO()

val KEY_exclam: Int get() = TODO()

val KEY_exclamdown: Int get() = TODO()

val KEY_ezh: Int get() = TODO()

val KEY_f: Int get() = TODO()

val KEY_fabovedot: Int get() = TODO()

val KEY_femalesymbol: Int get() = TODO()

val KEY_ff: Int get() = TODO()

val KEY_figdash: Int get() = TODO()

val KEY_filledlefttribullet: Int get() = TODO()

val KEY_filledrectbullet: Int get() = TODO()

val KEY_filledrighttribullet: Int get() = TODO()

val KEY_filledtribulletdown: Int get() = TODO()

val KEY_filledtribulletup: Int get() = TODO()

val KEY_fiveeighths: Int get() = TODO()

val KEY_fivesixths: Int get() = TODO()

val KEY_fivesubscript: Int get() = TODO()

val KEY_fivesuperior: Int get() = TODO()

val KEY_fourfifths: Int get() = TODO()

val KEY_foursubscript: Int get() = TODO()

val KEY_foursuperior: Int get() = TODO()

val KEY_fourthroot: Int get() = TODO()

val KEY_function: Int get() = TODO()

val KEY_g: Int get() = TODO()

val KEY_gabovedot: Int get() = TODO()

val KEY_gbreve: Int get() = TODO()

val KEY_gcaron: Int get() = TODO()

val KEY_gcedilla: Int get() = TODO()

val KEY_gcircumflex: Int get() = TODO()

val KEY_grave: Int get() = TODO()

val KEY_greater: Int get() = TODO()

val KEY_greaterthanequal: Int get() = TODO()

val KEY_guillemotleft: Int get() = TODO()

val KEY_guillemotright: Int get() = TODO()

val KEY_h: Int get() = TODO()

val KEY_hairspace: Int get() = TODO()

val KEY_hcircumflex: Int get() = TODO()

val KEY_heart: Int get() = TODO()

val KEY_hebrew_aleph: Int get() = TODO()

val KEY_hebrew_ayin: Int get() = TODO()

val KEY_hebrew_bet: Int get() = TODO()

val KEY_hebrew_beth: Int get() = TODO()

val KEY_hebrew_chet: Int get() = TODO()

val KEY_hebrew_dalet: Int get() = TODO()

val KEY_hebrew_daleth: Int get() = TODO()

val KEY_hebrew_doublelowline: Int get() = TODO()

val KEY_hebrew_finalkaph: Int get() = TODO()

val KEY_hebrew_finalmem: Int get() = TODO()

val KEY_hebrew_finalnun: Int get() = TODO()

val KEY_hebrew_finalpe: Int get() = TODO()

val KEY_hebrew_finalzade: Int get() = TODO()

val KEY_hebrew_finalzadi: Int get() = TODO()

val KEY_hebrew_gimel: Int get() = TODO()

val KEY_hebrew_gimmel: Int get() = TODO()

val KEY_hebrew_he: Int get() = TODO()

val KEY_hebrew_het: Int get() = TODO()

val KEY_hebrew_kaph: Int get() = TODO()

val KEY_hebrew_kuf: Int get() = TODO()

val KEY_hebrew_lamed: Int get() = TODO()

val KEY_hebrew_mem: Int get() = TODO()

val KEY_hebrew_nun: Int get() = TODO()

val KEY_hebrew_pe: Int get() = TODO()

val KEY_hebrew_qoph: Int get() = TODO()

val KEY_hebrew_resh: Int get() = TODO()

val KEY_hebrew_samech: Int get() = TODO()

val KEY_hebrew_samekh: Int get() = TODO()

val KEY_hebrew_shin: Int get() = TODO()

val KEY_hebrew_taf: Int get() = TODO()

val KEY_hebrew_taw: Int get() = TODO()

val KEY_hebrew_tet: Int get() = TODO()

val KEY_hebrew_teth: Int get() = TODO()

val KEY_hebrew_waw: Int get() = TODO()

val KEY_hebrew_yod: Int get() = TODO()

val KEY_hebrew_zade: Int get() = TODO()

val KEY_hebrew_zadi: Int get() = TODO()

val KEY_hebrew_zain: Int get() = TODO()

val KEY_hebrew_zayin: Int get() = TODO()

val KEY_hexagram: Int get() = TODO()

val KEY_horizconnector: Int get() = TODO()

val KEY_horizlinescan1: Int get() = TODO()

val KEY_horizlinescan3: Int get() = TODO()

val KEY_horizlinescan5: Int get() = TODO()

val KEY_horizlinescan7: Int get() = TODO()

val KEY_horizlinescan9: Int get() = TODO()

val KEY_hstroke: Int get() = TODO()

val KEY_ht: Int get() = TODO()

val KEY_hyphen: Int get() = TODO()

val KEY_i: Int get() = TODO()

val KEY_iTouch: Int get() = TODO()

val KEY_iacute: Int get() = TODO()

val KEY_ibelowdot: Int get() = TODO()

val KEY_ibreve: Int get() = TODO()

val KEY_icircumflex: Int get() = TODO()

val KEY_identical: Int get() = TODO()

val KEY_idiaeresis: Int get() = TODO()

val KEY_idotless: Int get() = TODO()

val KEY_ifonlyif: Int get() = TODO()

val KEY_igrave: Int get() = TODO()

val KEY_ihook: Int get() = TODO()

val KEY_imacron: Int get() = TODO()

val KEY_implies: Int get() = TODO()

val KEY_includedin: Int get() = TODO()

val KEY_includes: Int get() = TODO()

val KEY_infinity: Int get() = TODO()

val KEY_integral: Int get() = TODO()

val KEY_intersection: Int get() = TODO()

val KEY_iogonek: Int get() = TODO()

val KEY_itilde: Int get() = TODO()

val KEY_j: Int get() = TODO()

val KEY_jcircumflex: Int get() = TODO()

val KEY_jot: Int get() = TODO()

val KEY_k: Int get() = TODO()

val KEY_kana_A: Int get() = TODO()

val KEY_kana_CHI: Int get() = TODO()

val KEY_kana_E: Int get() = TODO()

val KEY_kana_FU: Int get() = TODO()

val KEY_kana_HA: Int get() = TODO()

val KEY_kana_HE: Int get() = TODO()

val KEY_kana_HI: Int get() = TODO()

val KEY_kana_HO: Int get() = TODO()

val KEY_kana_HU: Int get() = TODO()

val KEY_kana_I: Int get() = TODO()

val KEY_kana_KA: Int get() = TODO()

val KEY_kana_KE: Int get() = TODO()

val KEY_kana_KI: Int get() = TODO()

val KEY_kana_KO: Int get() = TODO()

val KEY_kana_KU: Int get() = TODO()

val KEY_kana_MA: Int get() = TODO()

val KEY_kana_ME: Int get() = TODO()

val KEY_kana_MI: Int get() = TODO()

val KEY_kana_MO: Int get() = TODO()

val KEY_kana_MU: Int get() = TODO()

val KEY_kana_N: Int get() = TODO()

val KEY_kana_NA: Int get() = TODO()

val KEY_kana_NE: Int get() = TODO()

val KEY_kana_NI: Int get() = TODO()

val KEY_kana_NO: Int get() = TODO()

val KEY_kana_NU: Int get() = TODO()

val KEY_kana_O: Int get() = TODO()

val KEY_kana_RA: Int get() = TODO()

val KEY_kana_RE: Int get() = TODO()

val KEY_kana_RI: Int get() = TODO()

val KEY_kana_RO: Int get() = TODO()

val KEY_kana_RU: Int get() = TODO()

val KEY_kana_SA: Int get() = TODO()

val KEY_kana_SE: Int get() = TODO()

val KEY_kana_SHI: Int get() = TODO()

val KEY_kana_SO: Int get() = TODO()

val KEY_kana_SU: Int get() = TODO()

val KEY_kana_TA: Int get() = TODO()

val KEY_kana_TE: Int get() = TODO()

val KEY_kana_TI: Int get() = TODO()

val KEY_kana_TO: Int get() = TODO()

val KEY_kana_TSU: Int get() = TODO()

val KEY_kana_TU: Int get() = TODO()

val KEY_kana_U: Int get() = TODO()

val KEY_kana_WA: Int get() = TODO()

val KEY_kana_WO: Int get() = TODO()

val KEY_kana_YA: Int get() = TODO()

val KEY_kana_YO: Int get() = TODO()

val KEY_kana_YU: Int get() = TODO()

val KEY_kana_a: Int get() = TODO()

val KEY_kana_closingbracket: Int get() = TODO()

val KEY_kana_comma: Int get() = TODO()

val KEY_kana_conjunctive: Int get() = TODO()

val KEY_kana_e: Int get() = TODO()

val KEY_kana_fullstop: Int get() = TODO()

val KEY_kana_i: Int get() = TODO()

val KEY_kana_middledot: Int get() = TODO()

val KEY_kana_o: Int get() = TODO()

val KEY_kana_openingbracket: Int get() = TODO()

val KEY_kana_switch: Int get() = TODO()

val KEY_kana_tsu: Int get() = TODO()

val KEY_kana_tu: Int get() = TODO()

val KEY_kana_u: Int get() = TODO()

val KEY_kana_ya: Int get() = TODO()

val KEY_kana_yo: Int get() = TODO()

val KEY_kana_yu: Int get() = TODO()

val KEY_kappa: Int get() = TODO()

val KEY_kcedilla: Int get() = TODO()

val KEY_kra: Int get() = TODO()

val KEY_l: Int get() = TODO()

val KEY_lacute: Int get() = TODO()

val KEY_latincross: Int get() = TODO()

val KEY_lbelowdot: Int get() = TODO()

val KEY_lcaron: Int get() = TODO()

val KEY_lcedilla: Int get() = TODO()

val KEY_leftanglebracket: Int get() = TODO()

val KEY_leftarrow: Int get() = TODO()

val KEY_leftcaret: Int get() = TODO()

val KEY_leftdoublequotemark: Int get() = TODO()

val KEY_leftmiddlecurlybrace: Int get() = TODO()

val KEY_leftopentriangle: Int get() = TODO()

val KEY_leftpointer: Int get() = TODO()

val KEY_leftradical: Int get() = TODO()

val KEY_leftshoe: Int get() = TODO()

val KEY_leftsinglequotemark: Int get() = TODO()

val KEY_leftt: Int get() = TODO()

val KEY_lefttack: Int get() = TODO()

val KEY_less: Int get() = TODO()

val KEY_lessthanequal: Int get() = TODO()

val KEY_lf: Int get() = TODO()

val KEY_logicaland: Int get() = TODO()

val KEY_logicalor: Int get() = TODO()

val KEY_lowleftcorner: Int get() = TODO()

val KEY_lowrightcorner: Int get() = TODO()

val KEY_lstroke: Int get() = TODO()

val KEY_m: Int get() = TODO()

val KEY_mabovedot: Int get() = TODO()

val KEY_macron: Int get() = TODO()

val KEY_malesymbol: Int get() = TODO()

val KEY_maltesecross: Int get() = TODO()

val KEY_marker: Int get() = TODO()

val KEY_masculine: Int get() = TODO()

val KEY_minus: Int get() = TODO()

val KEY_minutes: Int get() = TODO()

val KEY_mu: Int get() = TODO()

val KEY_multiply: Int get() = TODO()

val KEY_musicalflat: Int get() = TODO()

val KEY_musicalsharp: Int get() = TODO()

val KEY_n: Int get() = TODO()

val KEY_nabla: Int get() = TODO()

val KEY_nacute: Int get() = TODO()

val KEY_ncaron: Int get() = TODO()

val KEY_ncedilla: Int get() = TODO()

val KEY_ninesubscript: Int get() = TODO()

val KEY_ninesuperior: Int get() = TODO()

val KEY_nl: Int get() = TODO()

val KEY_nobreakspace: Int get() = TODO()

val KEY_notapproxeq: Int get() = TODO()

val KEY_notelementof: Int get() = TODO()

val KEY_notequal: Int get() = TODO()

val KEY_notidentical: Int get() = TODO()

val KEY_notsign: Int get() = TODO()

val KEY_ntilde: Int get() = TODO()

val KEY_numbersign: Int get() = TODO()

val KEY_numerosign: Int get() = TODO()

val KEY_o: Int get() = TODO()

val KEY_oacute: Int get() = TODO()

val KEY_obarred: Int get() = TODO()

val KEY_obelowdot: Int get() = TODO()

val KEY_ocaron: Int get() = TODO()

val KEY_ocircumflex: Int get() = TODO()

val KEY_ocircumflexacute: Int get() = TODO()

val KEY_ocircumflexbelowdot: Int get() = TODO()

val KEY_ocircumflexgrave: Int get() = TODO()

val KEY_ocircumflexhook: Int get() = TODO()

val KEY_ocircumflextilde: Int get() = TODO()

val KEY_odiaeresis: Int get() = TODO()

val KEY_odoubleacute: Int get() = TODO()

val KEY_oe: Int get() = TODO()

val KEY_ogonek: Int get() = TODO()

val KEY_ograve: Int get() = TODO()

val KEY_ohook: Int get() = TODO()

val KEY_ohorn: Int get() = TODO()

val KEY_ohornacute: Int get() = TODO()

val KEY_ohornbelowdot: Int get() = TODO()

val KEY_ohorngrave: Int get() = TODO()

val KEY_ohornhook: Int get() = TODO()

val KEY_ohorntilde: Int get() = TODO()

val KEY_omacron: Int get() = TODO()

val KEY_oneeighth: Int get() = TODO()

val KEY_onefifth: Int get() = TODO()

val KEY_onehalf: Int get() = TODO()

val KEY_onequarter: Int get() = TODO()

val KEY_onesixth: Int get() = TODO()

val KEY_onesubscript: Int get() = TODO()

val KEY_onesuperior: Int get() = TODO()

val KEY_onethird: Int get() = TODO()

val KEY_ooblique: Int get() = TODO()

val KEY_openrectbullet: Int get() = TODO()

val KEY_openstar: Int get() = TODO()

val KEY_opentribulletdown: Int get() = TODO()

val KEY_opentribulletup: Int get() = TODO()

val KEY_ordfeminine: Int get() = TODO()

val KEY_oslash: Int get() = TODO()

val KEY_otilde: Int get() = TODO()

val KEY_overbar: Int get() = TODO()

val KEY_overline: Int get() = TODO()

val KEY_p: Int get() = TODO()

val KEY_pabovedot: Int get() = TODO()

val KEY_paragraph: Int get() = TODO()

val KEY_parenleft: Int get() = TODO()

val KEY_parenright: Int get() = TODO()

val KEY_partdifferential: Int get() = TODO()

val KEY_partialderivative: Int get() = TODO()

val KEY_percent: Int get() = TODO()

val KEY_period: Int get() = TODO()

val KEY_periodcentered: Int get() = TODO()

val KEY_permille: Int get() = TODO()

val KEY_phonographcopyright: Int get() = TODO()

val KEY_plus: Int get() = TODO()

val KEY_plusminus: Int get() = TODO()

val KEY_prescription: Int get() = TODO()

val KEY_prolongedsound: Int get() = TODO()

val KEY_punctspace: Int get() = TODO()

val KEY_q: Int get() = TODO()

val KEY_quad: Int get() = TODO()

val KEY_question: Int get() = TODO()

val KEY_questiondown: Int get() = TODO()

val KEY_quotedbl: Int get() = TODO()

val KEY_quoteleft: Int get() = TODO()

val KEY_quoteright: Int get() = TODO()

val KEY_r: Int get() = TODO()

val KEY_racute: Int get() = TODO()

val KEY_radical: Int get() = TODO()

val KEY_rcaron: Int get() = TODO()

val KEY_rcedilla: Int get() = TODO()

val KEY_registered: Int get() = TODO()

val KEY_rightanglebracket: Int get() = TODO()

val KEY_rightarrow: Int get() = TODO()

val KEY_rightcaret: Int get() = TODO()

val KEY_rightdoublequotemark: Int get() = TODO()

val KEY_rightmiddlecurlybrace: Int get() = TODO()

val KEY_rightmiddlesummation: Int get() = TODO()

val KEY_rightopentriangle: Int get() = TODO()

val KEY_rightpointer: Int get() = TODO()

val KEY_rightshoe: Int get() = TODO()

val KEY_rightsinglequotemark: Int get() = TODO()

val KEY_rightt: Int get() = TODO()

val KEY_righttack: Int get() = TODO()

val KEY_s: Int get() = TODO()

val KEY_sabovedot: Int get() = TODO()

val KEY_sacute: Int get() = TODO()

val KEY_scaron: Int get() = TODO()

val KEY_scedilla: Int get() = TODO()

val KEY_schwa: Int get() = TODO()

val KEY_scircumflex: Int get() = TODO()

val KEY_script_switch: Int get() = TODO()

val KEY_seconds: Int get() = TODO()

val KEY_section: Int get() = TODO()

val KEY_semicolon: Int get() = TODO()

val KEY_semivoicedsound: Int get() = TODO()

val KEY_seveneighths: Int get() = TODO()

val KEY_sevensubscript: Int get() = TODO()

val KEY_sevensuperior: Int get() = TODO()

val KEY_signaturemark: Int get() = TODO()

val KEY_signifblank: Int get() = TODO()

val KEY_similarequal: Int get() = TODO()

val KEY_singlelowquotemark: Int get() = TODO()

val KEY_sixsubscript: Int get() = TODO()

val KEY_sixsuperior: Int get() = TODO()

val KEY_slash: Int get() = TODO()

val KEY_soliddiamond: Int get() = TODO()

val KEY_space: Int get() = TODO()

val KEY_squareroot: Int get() = TODO()

val KEY_ssharp: Int get() = TODO()

val KEY_sterling: Int get() = TODO()

val KEY_stricteq: Int get() = TODO()

val KEY_t: Int get() = TODO()

val KEY_tabovedot: Int get() = TODO()

val KEY_tcaron: Int get() = TODO()

val KEY_tcedilla: Int get() = TODO()

val KEY_telephone: Int get() = TODO()

val KEY_telephonerecorder: Int get() = TODO()

val KEY_therefore: Int get() = TODO()

val KEY_thinspace: Int get() = TODO()

val KEY_thorn: Int get() = TODO()

val KEY_threeeighths: Int get() = TODO()

val KEY_threefifths: Int get() = TODO()

val KEY_threequarters: Int get() = TODO()

val KEY_threesubscript: Int get() = TODO()

val KEY_threesuperior: Int get() = TODO()

val KEY_tintegral: Int get() = TODO()

val KEY_topintegral: Int get() = TODO()

val KEY_topleftparens: Int get() = TODO()

val KEY_topleftradical: Int get() = TODO()

val KEY_topleftsqbracket: Int get() = TODO()

val KEY_topleftsummation: Int get() = TODO()

val KEY_toprightparens: Int get() = TODO()

val KEY_toprightsqbracket: Int get() = TODO()

val KEY_toprightsummation: Int get() = TODO()

val KEY_topt: Int get() = TODO()

val KEY_topvertsummationconnector: Int get() = TODO()

val KEY_trademark: Int get() = TODO()

val KEY_trademarkincircle: Int get() = TODO()

val KEY_tslash: Int get() = TODO()

val KEY_twofifths: Int get() = TODO()

val KEY_twosubscript: Int get() = TODO()

val KEY_twosuperior: Int get() = TODO()

val KEY_twothirds: Int get() = TODO()

val KEY_u: Int get() = TODO()

val KEY_uacute: Int get() = TODO()

val KEY_ubelowdot: Int get() = TODO()

val KEY_ubreve: Int get() = TODO()

val KEY_ucircumflex: Int get() = TODO()

val KEY_udiaeresis: Int get() = TODO()

val KEY_udoubleacute: Int get() = TODO()

val KEY_ugrave: Int get() = TODO()

val KEY_uhook: Int get() = TODO()

val KEY_uhorn: Int get() = TODO()

val KEY_uhornacute: Int get() = TODO()

val KEY_uhornbelowdot: Int get() = TODO()

val KEY_uhorngrave: Int get() = TODO()

val KEY_uhornhook: Int get() = TODO()

val KEY_uhorntilde: Int get() = TODO()

val KEY_umacron: Int get() = TODO()

val KEY_underbar: Int get() = TODO()

val KEY_underscore: Int get() = TODO()

val KEY_union: Int get() = TODO()

val KEY_uogonek: Int get() = TODO()

val KEY_uparrow: Int get() = TODO()

val KEY_upcaret: Int get() = TODO()

val KEY_upleftcorner: Int get() = TODO()

val KEY_uprightcorner: Int get() = TODO()

val KEY_upshoe: Int get() = TODO()

val KEY_upstile: Int get() = TODO()

val KEY_uptack: Int get() = TODO()

val KEY_uring: Int get() = TODO()

val KEY_utilde: Int get() = TODO()

val KEY_v: Int get() = TODO()

val KEY_variation: Int get() = TODO()

val KEY_vertbar: Int get() = TODO()

val KEY_vertconnector: Int get() = TODO()

val KEY_voicedsound: Int get() = TODO()

val KEY_vt: Int get() = TODO()

val KEY_w: Int get() = TODO()

val KEY_wacute: Int get() = TODO()

val KEY_wcircumflex: Int get() = TODO()

val KEY_wdiaeresis: Int get() = TODO()

val KEY_wgrave: Int get() = TODO()

val KEY_x: Int get() = TODO()

val KEY_xabovedot: Int get() = TODO()

val KEY_y: Int get() = TODO()

val KEY_yacute: Int get() = TODO()

val KEY_ybelowdot: Int get() = TODO()

val KEY_ycircumflex: Int get() = TODO()

val KEY_ydiaeresis: Int get() = TODO()

val KEY_yen: Int get() = TODO()

val KEY_ygrave: Int get() = TODO()

val KEY_yhook: Int get() = TODO()

val KEY_ytilde: Int get() = TODO()

val KEY_z: Int get() = TODO()

val KEY_zabovedot: Int get() = TODO()

val KEY_zacute: Int get() = TODO()

val KEY_zcaron: Int get() = TODO()

val KEY_zerosubscript: Int get() = TODO()

val KEY_zerosuperior: Int get() = TODO()

val KEY_zstroke: Int get() = TODO()

open class Keymap internal constructor (private val cptr: CPointer<GdkKeymap>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun addVirtualModifiers(state: ModifierType): Unit {
         return stub()
    }
    open fun getCapsLockState(): Boolean {
         return stub()
    }
    open fun getDirection(): com.charlag.kgtk.demo.pango.Direction {
         return stub()
    }
    open fun getEntriesForKeycode(hardware_keycode: UInt, keys: List<KeymapKey>, keyvals: List<UInt>, n_entries: Int): Boolean {
         return stub()
    }
    open fun getEntriesForKeyval(keyval: UInt, keys: List<KeymapKey>, n_keys: Int): Boolean {
         return stub()
    }
    open fun getModifierMask(intent: ModifierIntent): ModifierType {
         return stub()
    }
    open fun getModifierState(): UInt {
         return stub()
    }
    open fun getNumLockState(): Boolean {
         return stub()
    }
    open fun getScrollLockState(): Boolean {
         return stub()
    }
    open fun haveBidiLayouts(): Boolean {
         return stub()
    }
    open fun lookupKey(key: KeymapKey): UInt {
         return stub()
    }
    open fun mapVirtualModifiers(state: ModifierType): Boolean {
         return stub()
    }
    open fun translateKeyboardState(hardware_keycode: UInt, state: ModifierType, group: Int, keyval: UInt, effective_group: Int, level: Int, consumed_modifiers: ModifierType): Boolean {
         return stub()
    }
    fun setOnDirectionChanged(cb: () -> Unit) {
        do_connect(cptr, "direction-changed", cb)
    }

    fun setOnKeysChanged(cb: () -> Unit) {
        do_connect(cptr, "keys-changed", cb)
    }

    fun setOnStateChanged(cb: () -> Unit) {
        do_connect(cptr, "state-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 29049456UL
        fun cptr(obj: Keymap): CPointer<GdkKeymap> = obj.cptr
        fun getForDisplay(display: Display): Keymap {
    return stub()
}
    }
}

class KeymapKey(private val cptr: CPointer<cnames.structs._GdkKeymapKey>) /* struct */ {
    companion object {
        fun cptr(obj: KeymapKey): CPointer<cnames.structs._GdkKeymapKey> = obj.cptr
    }
}

val MAJOR_VERSION: Int get() = TODO()

val MAX_TIMECOORD_AXES: Int get() = TODO()

val MICRO_VERSION: Int get() = TODO()

val MINOR_VERSION: Int get() = TODO()

typealias ModifierIntent = GdkModifierIntent

typealias ModifierType = GdkModifierType

open class Monitor internal constructor (private val cptr: CPointer<GdkMonitor>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getDisplay(): Display {
         return stub()
    }
    open fun getGeometry(geometry: Rectangle): Unit {
         return stub()
    }
    open fun getHeightMm(): Int {
         return stub()
    }
    open fun getManufacturer(): String {
         return stub()
    }
    open fun getModel(): String {
         return stub()
    }
    open fun getRefreshRate(): Int {
         return stub()
    }
    open fun getScaleFactor(): Int {
         return stub()
    }
    open fun getSubpixelLayout(): SubpixelLayout {
         return stub()
    }
    open fun getWidthMm(): Int {
         return stub()
    }
    open fun getWorkarea(workarea: Rectangle): Unit {
         return stub()
    }
    open fun isPrimary(): Boolean {
         return stub()
    }
    fun setOnInvalidate(cb: () -> Unit) {
        do_connect(cptr, "invalidate", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 26320704UL
        fun cptr(obj: Monitor): CPointer<GdkMonitor> = obj.cptr
    }
}

class MonitorClass(private val cptr: CPointer<cnames.structs._GdkMonitorClass>) /* struct */ {
    companion object {
        fun cptr(obj: MonitorClass): CPointer<cnames.structs._GdkMonitorClass> = obj.cptr
    }
}

typealias NotifyType = GdkNotifyType

typealias OwnerChange = GdkOwnerChange

val PARENT_RELATIVE: Int get() = TODO()

val PRIORITY_REDRAW: Int get() = TODO()

class Point(private val cptr: CPointer<cnames.structs._GdkPoint>) /* struct */ {
    companion object {
        fun cptr(obj: Point): CPointer<cnames.structs._GdkPoint> = obj.cptr
    }
}

typealias PropMode = GdkPropMode

typealias PropertyState = GdkPropertyState

class RGBA(private val cptr: CPointer<cnames.structs._GdkRGBA>) /* struct */ {
    fun copy(): RGBA {
         return stub()
    }
    fun equal(p2: RGBA): Boolean {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun hash(): UInt {
         return stub()
    }
    fun parse(spec: String): Boolean {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    companion object {
        fun cptr(obj: RGBA): CPointer<cnames.structs._GdkRGBA> = obj.cptr
    }
}

class Rectangle(private val cptr: CPointer<GdkRectangle>) /* struct */ {
    fun equal(rect2: Rectangle): Boolean {
         return stub()
    }
    fun intersect(src2: Rectangle, dest: Rectangle): Boolean {
         return stub()
    }
    fun union(src2: Rectangle, dest: Rectangle): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Rectangle): CPointer<GdkRectangle> = obj.cptr
    }
}

open class Screen internal constructor (private val cptr: CPointer<GdkScreen>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getDisplay(): Display {
         return stub()
    }
    open fun getFontOptions(): com.charlag.kgtk.demo.cairo.FontOptions {
         return stub()
    }
    open fun getResolution(): Double {
         return stub()
    }
    open fun getRgbaVisual(): Visual {
         return stub()
    }
    open fun getRootWindow(): Window {
         return stub()
    }
    open fun getSetting(`name`: String, value: com.charlag.kgtk.demo.gobject.Value): Boolean {
         return stub()
    }
    open fun getSystemVisual(): Visual {
         return stub()
    }
    open fun getToplevelWindows(): List<Window> {
         return stub()
    }
    open fun getWindowStack(): List<Window> {
         return stub()
    }
    open fun isComposited(): Boolean {
         return stub()
    }
    open fun listVisuals(): List<Visual> {
         return stub()
    }
    open fun setFontOptions(options: com.charlag.kgtk.demo.cairo.FontOptions): Unit {
         return stub()
    }
    open fun setResolution(dpi: Double): Unit {
         return stub()
    }
    fun setOnCompositedChanged(cb: () -> Unit) {
        do_connect(cptr, "composited-changed", cb)
    }

    fun setOnMonitorsChanged(cb: () -> Unit) {
        do_connect(cptr, "monitors-changed", cb)
    }

    fun setOnSizeChanged(cb: () -> Unit) {
        do_connect(cptr, "size-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 26108768UL
        fun cptr(obj: Screen): CPointer<GdkScreen> = obj.cptr
        fun getDefault(): Screen {
    return stub()
}
    }
}

typealias ScrollDirection = GdkScrollDirection

open class Seat internal constructor (private val cptr: CPointer<GdkSeat>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getCapabilities(): SeatCapabilities {
         return stub()
    }
    open fun getDisplay(): Display {
         return stub()
    }
    open fun getKeyboard(): Device {
         return stub()
    }
    open fun getPointer(): Device {
         return stub()
    }
    open fun getSlaves(capabilities: SeatCapabilities): List<Device> {
         return stub()
    }
    open fun grab(window: Window, capabilities: SeatCapabilities, owner_events: Boolean, cursor: Cursor, event: Event, prepare_func: SeatGrabPrepareFunc, prepare_func_data: Any): GrabStatus {
         return stub()
    }
    open fun ungrab(): Unit {
         return stub()
    }
    fun setOnDeviceAdded(cb: () -> Unit) {
        do_connect(cptr, "device-added", cb)
    }

    fun setOnDeviceRemoved(cb: () -> Unit) {
        do_connect(cptr, "device-removed", cb)
    }

    fun setOnToolAdded(cb: () -> Unit) {
        do_connect(cptr, "tool-added", cb)
    }

    fun setOnToolRemoved(cb: () -> Unit) {
        do_connect(cptr, "tool-removed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 27013120UL
        fun cptr(obj: Seat): CPointer<GdkSeat> = obj.cptr
    }
}

typealias SeatCapabilities = GdkSeatCapabilities

typealias SeatGrabPrepareFunc = (seat:  Seat, window:  Window, user_data:  Any) -> Unit

typealias SettingAction = GdkSettingAction

typealias Status = GdkStatus

typealias SubpixelLayout = GdkSubpixelLayout

class TimeCoord(private val cptr: CPointer<cnames.structs._GdkTimeCoord>) /* struct */ {
    companion object {
        fun cptr(obj: TimeCoord): CPointer<cnames.structs._GdkTimeCoord> = obj.cptr
    }
}

typealias TouchpadGesturePhase = GdkTouchpadGesturePhase

typealias VisibilityState = GdkVisibilityState

open class Visual internal constructor (private val cptr: CPointer<GdkVisual>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getBluePixelDetails(mask: UInt, shift: Int, precision: Int): Unit {
         return stub()
    }
    open fun getDepth(): Int {
         return stub()
    }
    open fun getGreenPixelDetails(mask: UInt, shift: Int, precision: Int): Unit {
         return stub()
    }
    open fun getRedPixelDetails(mask: UInt, shift: Int, precision: Int): Unit {
         return stub()
    }
    open fun getScreen(): Screen {
         return stub()
    }
    open fun getVisualType(): VisualType {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 26093984UL
        fun cptr(obj: Visual): CPointer<GdkVisual> = obj.cptr
    }
}

typealias VisualType = GdkVisualType

typealias WMDecoration = GdkWMDecoration

typealias WMFunction = GdkWMFunction

open class Window internal constructor (private val cptr: CPointer<GdkWindow>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(parent: Window, attributes: WindowAttr, attributes_mask: WindowAttributesType) : this(stub<CPointer<GdkWindow>>())

    open fun beep(): Unit {
         return stub()
    }
    open fun beginDrawFrame(region: com.charlag.kgtk.demo.cairo.Region): DrawingContext {
         return stub()
    }
    open fun beginMoveDrag(button: Int, root_x: Int, root_y: Int, timestamp: UInt): Unit {
         return stub()
    }
    open fun beginMoveDragForDevice(device: Device, button: Int, root_x: Int, root_y: Int, timestamp: UInt): Unit {
         return stub()
    }
    open fun beginResizeDrag(edge: WindowEdge, button: Int, root_x: Int, root_y: Int, timestamp: UInt): Unit {
         return stub()
    }
    open fun beginResizeDragForDevice(edge: WindowEdge, device: Device, button: Int, root_x: Int, root_y: Int, timestamp: UInt): Unit {
         return stub()
    }
    open fun coordsFromParent(parent_x: Double, parent_y: Double, x: Double, y: Double): Unit {
         return stub()
    }
    open fun coordsToParent(x: Double, y: Double, parent_x: Double, parent_y: Double): Unit {
         return stub()
    }
    open fun createGlContext(): GLContext {
         return stub()
    }
    open fun createSimilarImageSurface(format: Int, width: Int, height: Int, scale: Int): com.charlag.kgtk.demo.cairo.Surface {
         return stub()
    }
    open fun createSimilarSurface(content: com.charlag.kgtk.demo.cairo.Content, width: Int, height: Int): com.charlag.kgtk.demo.cairo.Surface {
         return stub()
    }
    open fun deiconify(): Unit {
         return stub()
    }
    open fun destroy(): Unit {
         return stub()
    }
    open fun destroyNotify(): Unit {
         return stub()
    }
    open fun endDrawFrame(context: DrawingContext): Unit {
         return stub()
    }
    open fun endPaint(): Unit {
         return stub()
    }
    open fun ensureNative(): Boolean {
         return stub()
    }
    open fun focus(timestamp: UInt): Unit {
         return stub()
    }
    open fun freezeUpdates(): Unit {
         return stub()
    }
    open fun fullscreen(): Unit {
         return stub()
    }
    open fun fullscreenOnMonitor(monitor: Int): Unit {
         return stub()
    }
    open fun geometryChanged(): Unit {
         return stub()
    }
    open fun getAcceptFocus(): Boolean {
         return stub()
    }
    open fun getChildren(): List<Window> {
         return stub()
    }
    open fun getChildrenWithUserData(user_data: Any): List<Window> {
         return stub()
    }
    open fun getClipRegion(): com.charlag.kgtk.demo.cairo.Region {
         return stub()
    }
    open fun getCursor(): Cursor {
         return stub()
    }
    open fun getDecorations(decorations: WMDecoration): Boolean {
         return stub()
    }
    open fun getDeviceCursor(device: Device): Cursor {
         return stub()
    }
    open fun getDeviceEvents(device: Device): EventMask {
         return stub()
    }
    open fun getDevicePosition(device: Device, x: Int, y: Int, mask: ModifierType): Window {
         return stub()
    }
    open fun getDevicePositionDouble(device: Device, x: Double, y: Double, mask: ModifierType): Window {
         return stub()
    }
    open fun getDisplay(): Display {
         return stub()
    }
    open fun getDragProtocol(target: Window): DragProtocol {
         return stub()
    }
    open fun getEffectiveParent(): Window {
         return stub()
    }
    open fun getEffectiveToplevel(): Window {
         return stub()
    }
    open fun getEventCompression(): Boolean {
         return stub()
    }
    open fun getEvents(): EventMask {
         return stub()
    }
    open fun getFocusOnMap(): Boolean {
         return stub()
    }
    open fun getFrameClock(): FrameClock {
         return stub()
    }
    open fun getFrameExtents(rect: Rectangle): Unit {
         return stub()
    }
    open fun getFullscreenMode(): FullscreenMode {
         return stub()
    }
    open fun getGeometry(x: Int, y: Int, width: Int, height: Int): Unit {
         return stub()
    }
    open fun getGroup(): Window {
         return stub()
    }
    open fun getHeight(): Int {
         return stub()
    }
    open fun getModalHint(): Boolean {
         return stub()
    }
    open fun getOrigin(x: Int, y: Int): Int {
         return stub()
    }
    open fun getParent(): Window {
         return stub()
    }
    open fun getPassThrough(): Boolean {
         return stub()
    }
    open fun getPosition(x: Int, y: Int): Unit {
         return stub()
    }
    open fun getRootCoords(x: Int, y: Int, root_x: Int, root_y: Int): Unit {
         return stub()
    }
    open fun getRootOrigin(x: Int, y: Int): Unit {
         return stub()
    }
    open fun getScaleFactor(): Int {
         return stub()
    }
    open fun getScreen(): Screen {
         return stub()
    }
    open fun getSourceEvents(source: InputSource): EventMask {
         return stub()
    }
    open fun getState(): WindowState {
         return stub()
    }
    open fun getSupportMultidevice(): Boolean {
         return stub()
    }
    open fun getToplevel(): Window {
         return stub()
    }
    open fun getTypeHint(): WindowTypeHint {
         return stub()
    }
    open fun getUpdateArea(): com.charlag.kgtk.demo.cairo.Region {
         return stub()
    }
    open fun getUserData(data: Any): Unit {
         return stub()
    }
    open fun getVisibleRegion(): com.charlag.kgtk.demo.cairo.Region {
         return stub()
    }
    open fun getVisual(): Visual {
         return stub()
    }
    open fun getWidth(): Int {
         return stub()
    }
    open fun getWindowType(): WindowType {
         return stub()
    }
    open fun hasNative(): Boolean {
         return stub()
    }
    open fun hide(): Unit {
         return stub()
    }
    open fun iconify(): Unit {
         return stub()
    }
    open fun inputShapeCombineRegion(shape_region: com.charlag.kgtk.demo.cairo.Region, offset_x: Int, offset_y: Int): Unit {
         return stub()
    }
    open fun invalidateMaybeRecurse(region: com.charlag.kgtk.demo.cairo.Region, child_func: WindowChildFunc, user_data: Any): Unit {
         return stub()
    }
    open fun invalidateRect(rect: Rectangle, invalidate_children: Boolean): Unit {
         return stub()
    }
    open fun invalidateRegion(region: com.charlag.kgtk.demo.cairo.Region, invalidate_children: Boolean): Unit {
         return stub()
    }
    open fun isDestroyed(): Boolean {
         return stub()
    }
    open fun isInputOnly(): Boolean {
         return stub()
    }
    open fun isShaped(): Boolean {
         return stub()
    }
    open fun isViewable(): Boolean {
         return stub()
    }
    open fun isVisible(): Boolean {
         return stub()
    }
    open fun lower(): Unit {
         return stub()
    }
    open fun markPaintFromClip(cr: com.charlag.kgtk.demo.cairo.Context): Unit {
         return stub()
    }
    open fun maximize(): Unit {
         return stub()
    }
    open fun mergeChildInputShapes(): Unit {
         return stub()
    }
    open fun mergeChildShapes(): Unit {
         return stub()
    }
    open fun move(x: Int, y: Int): Unit {
         return stub()
    }
    open fun moveRegion(region: com.charlag.kgtk.demo.cairo.Region, dx: Int, dy: Int): Unit {
         return stub()
    }
    open fun moveResize(x: Int, y: Int, width: Int, height: Int): Unit {
         return stub()
    }
    open fun moveToRect(rect: Rectangle, rect_anchor: Gravity, window_anchor: Gravity, anchor_hints: AnchorHints, rect_anchor_dx: Int, rect_anchor_dy: Int): Unit {
         return stub()
    }
    open fun peekChildren(): List<Window> {
         return stub()
    }
    open fun raise(): Unit {
         return stub()
    }
    open fun registerDnd(): Unit {
         return stub()
    }
    open fun reparent(new_parent: Window, x: Int, y: Int): Unit {
         return stub()
    }
    open fun resize(width: Int, height: Int): Unit {
         return stub()
    }
    open fun restack(sibling: Window, above: Boolean): Unit {
         return stub()
    }
    open fun scroll(dx: Int, dy: Int): Unit {
         return stub()
    }
    open fun setAcceptFocus(accept_focus: Boolean): Unit {
         return stub()
    }
    open fun setChildInputShapes(): Unit {
         return stub()
    }
    open fun setChildShapes(): Unit {
         return stub()
    }
    open fun setCursor(cursor: Cursor): Unit {
         return stub()
    }
    open fun setDecorations(decorations: WMDecoration): Unit {
         return stub()
    }
    open fun setDeviceCursor(device: Device, cursor: Cursor): Unit {
         return stub()
    }
    open fun setDeviceEvents(device: Device, event_mask: EventMask): Unit {
         return stub()
    }
    open fun setEventCompression(event_compression: Boolean): Unit {
         return stub()
    }
    open fun setEvents(event_mask: EventMask): Unit {
         return stub()
    }
    open fun setFocusOnMap(focus_on_map: Boolean): Unit {
         return stub()
    }
    open fun setFullscreenMode(mode: FullscreenMode): Unit {
         return stub()
    }
    open fun setFunctions(functions: WMFunction): Unit {
         return stub()
    }
    open fun setGeometryHints(geometry: Geometry, geom_mask: WindowHints): Unit {
         return stub()
    }
    open fun setGroup(leader: Window): Unit {
         return stub()
    }
    open fun setIconList(pixbufs: List<com.charlag.kgtk.demo.gdkpixbuf.Pixbuf>): Unit {
         return stub()
    }
    open fun setIconName(`name`: String): Unit {
         return stub()
    }
    open fun setKeepAbove(setting: Boolean): Unit {
         return stub()
    }
    open fun setKeepBelow(setting: Boolean): Unit {
         return stub()
    }
    open fun setModalHint(modal: Boolean): Unit {
         return stub()
    }
    open fun setOpacity(opacity: Double): Unit {
         return stub()
    }
    open fun setOpaqueRegion(region: com.charlag.kgtk.demo.cairo.Region): Unit {
         return stub()
    }
    open fun setOverrideRedirect(override_redirect: Boolean): Unit {
         return stub()
    }
    open fun setPassThrough(pass_through: Boolean): Unit {
         return stub()
    }
    open fun setRole(role: String): Unit {
         return stub()
    }
    open fun setShadowWidth(left: Int, right: Int, top: Int, bottom: Int): Unit {
         return stub()
    }
    open fun setSkipPagerHint(skips_pager: Boolean): Unit {
         return stub()
    }
    open fun setSkipTaskbarHint(skips_taskbar: Boolean): Unit {
         return stub()
    }
    open fun setSourceEvents(source: InputSource, event_mask: EventMask): Unit {
         return stub()
    }
    open fun setStartupId(startup_id: String): Unit {
         return stub()
    }
    open fun setSupportMultidevice(support_multidevice: Boolean): Unit {
         return stub()
    }
    open fun setTitle(title: String): Unit {
         return stub()
    }
    open fun setTransientFor(parent: Window): Unit {
         return stub()
    }
    open fun setTypeHint(hint: WindowTypeHint): Unit {
         return stub()
    }
    open fun setUrgencyHint(urgent: Boolean): Unit {
         return stub()
    }
    open fun setUserData(user_data: com.charlag.kgtk.demo.gobject.Object): Unit {
         return stub()
    }
    open fun shapeCombineRegion(shape_region: com.charlag.kgtk.demo.cairo.Region, offset_x: Int, offset_y: Int): Unit {
         return stub()
    }
    open fun show(): Unit {
         return stub()
    }
    open fun showUnraised(): Unit {
         return stub()
    }
    open fun showWindowMenu(event: Event): Boolean {
         return stub()
    }
    open fun stick(): Unit {
         return stub()
    }
    open fun thawUpdates(): Unit {
         return stub()
    }
    open fun unfullscreen(): Unit {
         return stub()
    }
    open fun unmaximize(): Unit {
         return stub()
    }
    open fun unstick(): Unit {
         return stub()
    }
    open fun withdraw(): Unit {
         return stub()
    }
    fun setOnCreateSurface(cb: () -> Unit) {
        do_connect(cptr, "create-surface", cb)
    }

    fun setOnFromEmbedder(cb: () -> Unit) {
        do_connect(cptr, "from-embedder", cb)
    }

    fun setOnMovedToRect(cb: () -> Unit) {
        do_connect(cptr, "moved-to-rect", cb)
    }

    fun setOnPickEmbeddedChild(cb: () -> Unit) {
        do_connect(cptr, "pick-embedded-child", cb)
    }

    fun setOnToEmbedder(cb: () -> Unit) {
        do_connect(cptr, "to-embedder", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 26479872UL
        fun cptr(obj: Window): CPointer<GdkWindow> = obj.cptr
        fun constrainSize(geometry: Geometry, flags: WindowHints, width: Int, height: Int, new_width: Int, new_height: Int): Unit {
    return stub()
}
    }
}

class WindowAttr(private val cptr: CPointer<cnames.structs._GdkWindowAttr>) /* struct */ {
    companion object {
        fun cptr(obj: WindowAttr): CPointer<cnames.structs._GdkWindowAttr> = obj.cptr
    }
}

typealias WindowAttributesType = GdkWindowAttributesType

typealias WindowChildFunc = (window:  Window, user_data:  Any) -> Boolean

class WindowClass(private val cptr: CPointer<cnames.structs._GdkWindowClass>) /* struct */ {
    companion object {
        fun cptr(obj: WindowClass): CPointer<cnames.structs._GdkWindowClass> = obj.cptr
    }
}

typealias WindowEdge = GdkWindowEdge

typealias WindowHints = GdkWindowHints

typealias WindowInvalidateHandlerFunc = (window:  Window, region:  com.charlag.kgtk.demo.cairo.Region) -> Unit

class WindowRedirect(private val cptr: CPointer<cnames.structs._GdkWindowRedirect>) /* struct */ {
    companion object {
        fun cptr(obj: WindowRedirect): CPointer<cnames.structs._GdkWindowRedirect> = obj.cptr
    }
}

typealias WindowState = GdkWindowState

typealias WindowType = GdkWindowType

typealias WindowTypeHint = GdkWindowTypeHint

typealias WindowWindowClass = GdkWindowWindowClass

fun addOptionEntriesLibgtkOnly(group:  com.charlag.kgtk.demo.glib.OptionGroup): Unit = TODO()
fun atomIntern(atom_name:  String, only_if_exists:  Boolean): Atom = TODO()
fun atomInternStaticString(atom_name:  String): Atom = TODO()
fun beep(): Unit = TODO()
fun cairoCreate(window:  Window): com.charlag.kgtk.demo.cairo.Context = TODO()
fun cairoDrawFromGl(cr:  com.charlag.kgtk.demo.cairo.Context, window:  Window, source:  Int, source_type:  Int, buffer_scale:  Int, x:  Int, y:  Int, width:  Int, height:  Int): Unit = TODO()
fun cairoGetClipRectangle(cr:  com.charlag.kgtk.demo.cairo.Context, rect:  Rectangle): Boolean = TODO()
fun cairoGetDrawingContext(cr:  com.charlag.kgtk.demo.cairo.Context): DrawingContext = TODO()
fun cairoRectangle(cr:  com.charlag.kgtk.demo.cairo.Context, rectangle:  Rectangle): Unit = TODO()
fun cairoRegion(cr:  com.charlag.kgtk.demo.cairo.Context, region:  com.charlag.kgtk.demo.cairo.Region): Unit = TODO()
fun cairoRegionCreateFromSurface(surface:  com.charlag.kgtk.demo.cairo.Surface): com.charlag.kgtk.demo.cairo.Region = TODO()
fun cairoSetSourceColor(cr:  com.charlag.kgtk.demo.cairo.Context, color:  Color): Unit = TODO()
fun cairoSetSourcePixbuf(cr:  com.charlag.kgtk.demo.cairo.Context, pixbuf:  com.charlag.kgtk.demo.gdkpixbuf.Pixbuf, pixbuf_x:  Double, pixbuf_y:  Double): Unit = TODO()
fun cairoSetSourceRgba(cr:  com.charlag.kgtk.demo.cairo.Context, rgba:  RGBA): Unit = TODO()
fun cairoSetSourceWindow(cr:  com.charlag.kgtk.demo.cairo.Context, window:  Window, x:  Double, y:  Double): Unit = TODO()
fun cairoSurfaceCreateFromPixbuf(pixbuf:  com.charlag.kgtk.demo.gdkpixbuf.Pixbuf, scale:  Int, for_window:  Window): com.charlag.kgtk.demo.cairo.Surface = TODO()
fun colorParse(spec:  String, color:  Color): Boolean = TODO()
fun disableMultidevice(): Unit = TODO()
fun dragAbort(context:  DragContext, time_:  UInt): Unit = TODO()
fun dragBegin(window:  Window, targets:  List<Atom>): DragContext = TODO()
fun dragBeginForDevice(window:  Window, device:  Device, targets:  List<Atom>): DragContext = TODO()
fun dragBeginFromPoint(window:  Window, device:  Device, targets:  List<Atom>, x_root:  Int, y_root:  Int): DragContext = TODO()
fun dragDrop(context:  DragContext, time_:  UInt): Unit = TODO()
fun dragDropDone(context:  DragContext, success:  Boolean): Unit = TODO()
fun dragDropSucceeded(context:  DragContext): Boolean = TODO()
fun dragFindWindowForScreen(context:  DragContext, drag_window:  Window, screen:  Screen, x_root:  Int, y_root:  Int, dest_window:  Window, protocol:  DragProtocol): Unit = TODO()
fun dragGetSelection(context:  DragContext): Atom = TODO()
fun dragMotion(context:  DragContext, dest_window:  Window, protocol:  DragProtocol, x_root:  Int, y_root:  Int, suggested_action:  DragAction, possible_actions:  DragAction, time_:  UInt): Boolean = TODO()
fun dragStatus(context:  DragContext, action:  DragAction, time_:  UInt): Unit = TODO()
fun dropFinish(context:  DragContext, success:  Boolean, time_:  UInt): Unit = TODO()
fun dropReply(context:  DragContext, accepted:  Boolean, time_:  UInt): Unit = TODO()
fun errorTrapPop(): Int = TODO()
fun errorTrapPopIgnored(): Unit = TODO()
fun errorTrapPush(): Unit = TODO()
fun eventGet(): Event = TODO()
fun eventHandlerSet(func:  EventFunc, data:  Any, notify:  com.charlag.kgtk.demo.glib.DestroyNotify): Unit = TODO()
fun eventPeek(): Event = TODO()
fun eventRequestMotions(event:  EventMotion): Unit = TODO()
fun eventsGetAngle(event1:  Event, event2:  Event, angle:  Double): Boolean = TODO()
fun eventsGetCenter(event1:  Event, event2:  Event, x:  Double, y:  Double): Boolean = TODO()
fun eventsGetDistance(event1:  Event, event2:  Event, distance:  Double): Boolean = TODO()
fun eventsPending(): Boolean = TODO()
fun flush(): Unit = TODO()
fun getDefaultRootWindow(): Window = TODO()
fun getDisplay(): String = TODO()
fun getDisplayArgName(): String = TODO()
fun getProgramClass(): String = TODO()
fun getShowEvents(): Boolean = TODO()
fun glErrorQuark(): UInt = TODO()
fun init(argc:  Int, argv:  List<String>): Unit = TODO()
fun initCheck(argc:  Int, argv:  List<String>): Boolean = TODO()
fun keyboardGrab(window:  Window, owner_events:  Boolean, time_:  UInt): GrabStatus = TODO()
fun keyboardUngrab(time_:  UInt): Unit = TODO()
fun keyvalConvertCase(symbol:  UInt, lower:  UInt, upper:  UInt): Unit = TODO()
fun keyvalFromName(keyval_name:  String): UInt = TODO()
fun keyvalIsLower(keyval:  UInt): Boolean = TODO()
fun keyvalIsUpper(keyval:  UInt): Boolean = TODO()
fun keyvalName(keyval:  UInt): String = TODO()
fun keyvalToLower(keyval:  UInt): UInt = TODO()
fun keyvalToUnicode(keyval:  UInt): UInt = TODO()
fun keyvalToUpper(keyval:  UInt): UInt = TODO()
fun listVisuals(): List<Visual> = TODO()
fun notifyStartupComplete(): Unit = TODO()
fun notifyStartupCompleteWithId(startup_id:  String): Unit = TODO()
fun offscreenWindowGetEmbedder(window:  Window): Window = TODO()
fun offscreenWindowGetSurface(window:  Window): com.charlag.kgtk.demo.cairo.Surface = TODO()
fun offscreenWindowSetEmbedder(window:  Window, embedder:  Window): Unit = TODO()
fun pangoContextGet(): com.charlag.kgtk.demo.pango.Context = TODO()
fun pangoContextGetForDisplay(display:  Display): com.charlag.kgtk.demo.pango.Context = TODO()
fun pangoContextGetForScreen(screen:  Screen): com.charlag.kgtk.demo.pango.Context = TODO()
fun parseArgs(argc:  Int, argv:  List<String>): Unit = TODO()
fun pixbufGetFromSurface(surface:  com.charlag.kgtk.demo.cairo.Surface, src_x:  Int, src_y:  Int, width:  Int, height:  Int): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf = TODO()
fun pixbufGetFromWindow(window:  Window, src_x:  Int, src_y:  Int, width:  Int, height:  Int): com.charlag.kgtk.demo.gdkpixbuf.Pixbuf = TODO()
fun pointerGrab(window:  Window, owner_events:  Boolean, event_mask:  EventMask, confine_to:  Window, cursor:  Cursor, time_:  UInt): GrabStatus = TODO()
fun pointerIsGrabbed(): Boolean = TODO()
fun pointerUngrab(time_:  UInt): Unit = TODO()
fun preParseLibgtkOnly(): Unit = TODO()
fun propertyDelete(window:  Window, property:  Atom): Unit = TODO()
fun propertyGet(window:  Window, property:  Atom, type:  Atom, offset:  ULong, length:  ULong, pdelete:  Int, actual_property_type:  Atom, actual_format:  Int, actual_length:  Int, data:  List<UByte>): Boolean = TODO()
fun queryDepths(depths:  List<Int>, count:  Int): Unit = TODO()
fun queryVisualTypes(visual_types:  List<VisualType>, count:  Int): Unit = TODO()
fun selectionConvert(requestor:  Window, selection:  Atom, target:  Atom, time_:  UInt): Unit = TODO()
fun selectionOwnerGet(selection:  Atom): Window = TODO()
fun selectionOwnerGetForDisplay(display:  Display, selection:  Atom): Window = TODO()
fun selectionOwnerSet(owner:  Window, selection:  Atom, time_:  UInt, send_event:  Boolean): Boolean = TODO()
fun selectionOwnerSetForDisplay(display:  Display, owner:  Window, selection:  Atom, time_:  UInt, send_event:  Boolean): Boolean = TODO()
fun selectionSendNotify(requestor:  Window, selection:  Atom, target:  Atom, property:  Atom, time_:  UInt): Unit = TODO()
fun selectionSendNotifyForDisplay(display:  Display, requestor:  Window, selection:  Atom, target:  Atom, property:  Atom, time_:  UInt): Unit = TODO()
fun setAllowedBackends(backends:  String): Unit = TODO()
fun setDoubleClickTime(msec:  UInt): Unit = TODO()
fun setProgramClass(program_class:  String): Unit = TODO()
fun setShowEvents(show_events:  Boolean): Unit = TODO()
fun settingGet(`name`:  String, value:  com.charlag.kgtk.demo.gobject.Value): Boolean = TODO()
fun synthesizeWindowState(window:  Window, unset_flags:  WindowState, set_flags:  WindowState): Unit = TODO()
fun testRenderSync(window:  Window): Unit = TODO()
fun testSimulateButton(window:  Window, x:  Int, y:  Int, button:  UInt, modifiers:  ModifierType, button_pressrelease:  EventType): Boolean = TODO()
fun testSimulateKey(window:  Window, x:  Int, y:  Int, keyval:  UInt, modifiers:  ModifierType, key_pressrelease:  EventType): Boolean = TODO()
fun textPropertyToUtf8ListForDisplay(display:  Display, encoding:  Atom, format:  Int, text:  List<UByte>, length:  Int, list:  List<String>): Int = TODO()
fun threadsAddIdle(priority:  Int, function:  com.charlag.kgtk.demo.glib.SourceFunc, data:  Any, notify:  com.charlag.kgtk.demo.glib.DestroyNotify): UInt = TODO()
fun threadsAddTimeout(priority:  Int, interval:  UInt, function:  com.charlag.kgtk.demo.glib.SourceFunc, data:  Any, notify:  com.charlag.kgtk.demo.glib.DestroyNotify): UInt = TODO()
fun threadsAddTimeoutSeconds(priority:  Int, interval:  UInt, function:  com.charlag.kgtk.demo.glib.SourceFunc, data:  Any, notify:  com.charlag.kgtk.demo.glib.DestroyNotify): UInt = TODO()
fun threadsEnter(): Unit = TODO()
fun threadsInit(): Unit = TODO()
fun threadsLeave(): Unit = TODO()
fun unicodeToKeyval(wc:  UInt): UInt = TODO()
fun utf8ToStringTarget(str:  String): String = TODO()
