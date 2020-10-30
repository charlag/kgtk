// Namespace: Atk
@file:Suppress("RemoveRedundantBackticks", "UNUSED_PARAMETER", "FunctionName", "RedundantUnitReturnType", "unused", "RemoveRedundantQualifierName")
package com.charlag.kgtk.demo.atk

import com.charlag.kgtk.demo.prelude.*
import gtk3.*
import kotlinx.cinterop.*
import com.charlag.kgtk.demo.prelude.GType

interface Action : InteropWrapper {
    fun doAction(i: Int): Boolean = stub("Action default impl")

    fun getDescription(i: Int): String = stub("Action default impl")

    fun getKeybinding(i: Int): String = stub("Action default impl")

    fun getLocalizedName(i: Int): String = stub("Action default impl")

    fun getNActions(): Int = stub("Action default impl")

    fun getName(i: Int): String = stub("Action default impl")

    fun setDescription(i: Int, desc: String): Boolean = stub("Action default impl")

    companion object {
        fun cptr(obj: Action): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkAction>) : Action {
        override val rawPtr: COpaquePointer = cptr
    }
}

class ActionIface(private val cptr: CPointer<cnames.structs._AtkActionIface>) /* struct */ {
    companion object {
        fun cptr(obj: ActionIface): CPointer<cnames.structs._AtkActionIface> = obj.cptr
    }
}

class Attribute(private val cptr: CPointer<cnames.structs._AtkAttribute>) /* struct */ {
    fun setFree(attrib_set: List<Any>): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Attribute): CPointer<cnames.structs._AtkAttribute> = obj.cptr
    }
}

val BINARY_AGE: Int get() = TODO()

interface Component : InteropWrapper {
    fun contains(x: Int, y: Int, coord_type: CoordType): Boolean = stub("Component default impl")

    fun getAlpha(): Double = stub("Component default impl")

    fun getExtents(x: Int, y: Int, width: Int, height: Int, coord_type: CoordType): Unit = stub("Component default impl")

    fun getLayer(): Layer = stub("Component default impl")

    fun getMdiZorder(): Int = stub("Component default impl")

    fun grabFocus(): Boolean = stub("Component default impl")

    fun refAccessibleAtPoint(x: Int, y: Int, coord_type: CoordType): Object = stub("Component default impl")

    fun scrollTo(type: ScrollType): Boolean = stub("Component default impl")

    fun scrollToPoint(coords: CoordType, x: Int, y: Int): Boolean = stub("Component default impl")

    fun setExtents(x: Int, y: Int, width: Int, height: Int, coord_type: CoordType): Boolean = stub("Component default impl")

    fun setPosition(x: Int, y: Int, coord_type: CoordType): Boolean = stub("Component default impl")

    fun setSize(width: Int, height: Int): Boolean = stub("Component default impl")

    companion object {
        fun cptr(obj: Component): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkComponent>) : Component {
        override val rawPtr: COpaquePointer = cptr
    }
}

class ComponentIface(private val cptr: CPointer<cnames.structs._AtkComponentIface>) /* struct */ {
    companion object {
        fun cptr(obj: ComponentIface): CPointer<cnames.structs._AtkComponentIface> = obj.cptr
    }
}

typealias CoordType = AtkCoordType

interface Document : InteropWrapper {
    fun getAttributeValue(attribute_name: String): String = stub("Document default impl")

    fun getAttributes(): List<Any> = stub("Document default impl")

    fun getCurrentPageNumber(): Int = stub("Document default impl")

    fun getPageCount(): Int = stub("Document default impl")

    fun setAttributeValue(attribute_name: String, attribute_value: String): Boolean = stub("Document default impl")

    companion object {
        fun cptr(obj: Document): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkDocument>) : Document {
        override val rawPtr: COpaquePointer = cptr
    }
}

class DocumentIface(private val cptr: CPointer<cnames.structs._AtkDocumentIface>) /* struct */ {
    companion object {
        fun cptr(obj: DocumentIface): CPointer<cnames.structs._AtkDocumentIface> = obj.cptr
    }
}

interface EditableText : InteropWrapper {
    fun copyText(start_pos: Int, end_pos: Int): Unit = stub("EditableText default impl")

    fun cutText(start_pos: Int, end_pos: Int): Unit = stub("EditableText default impl")

    fun deleteText(start_pos: Int, end_pos: Int): Unit = stub("EditableText default impl")

    fun insertText(string: String, length: Int, position: Int): Unit = stub("EditableText default impl")

    fun pasteText(position: Int): Unit = stub("EditableText default impl")

    fun setRunAttributes(attrib_set: List<Any>, start_offset: Int, end_offset: Int): Boolean = stub("EditableText default impl")

    fun setTextContents(string: String): Unit = stub("EditableText default impl")

    companion object {
        fun cptr(obj: EditableText): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkEditableText>) : EditableText {
        override val rawPtr: COpaquePointer = cptr
    }
}

class EditableTextIface(private val cptr: CPointer<cnames.structs._AtkEditableTextIface>) /* struct */ {
    companion object {
        fun cptr(obj: EditableTextIface): CPointer<cnames.structs._AtkEditableTextIface> = obj.cptr
    }
}

typealias EventListener = (obj:  Object) -> Unit

typealias EventListenerInit = () -> Unit

typealias FocusHandler = (`object`:  Object, focus_in:  Boolean) -> Unit

typealias Function = (user_data:  Any) -> Boolean

open class GObjectAccessible internal constructor (private val cptr: CPointer<AtkGObjectAccessible>) : Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getObject(): com.charlag.kgtk.demo.gobject.Object {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 25871536UL
        fun cptr(obj: GObjectAccessible): CPointer<AtkGObjectAccessible> = obj.cptr
        fun forObject(obj: com.charlag.kgtk.demo.gobject.Object): Object {
    return stub()
}
    }
}

class GObjectAccessibleClass(private val cptr: CPointer<cnames.structs._AtkGObjectAccessibleClass>) /* struct */ {
    companion object {
        fun cptr(obj: GObjectAccessibleClass): CPointer<cnames.structs._AtkGObjectAccessibleClass> = obj.cptr
    }
}

open class Hyperlink internal constructor (private val cptr: CPointer<AtkHyperlink>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), Action, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getEndIndex(): Int {
         return stub()
    }
    open fun getNAnchors(): Int {
         return stub()
    }
    open fun getObject(i: Int): Object {
         return stub()
    }
    open fun getStartIndex(): Int {
         return stub()
    }
    open fun getUri(i: Int): String {
         return stub()
    }
    open fun isInline(): Boolean {
         return stub()
    }
    open fun isValid(): Boolean {
         return stub()
    }
    fun setOnLinkActivated(cb: () -> Unit) {
        do_connect(cptr, "link-activated", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 25977856UL
        fun cptr(obj: Hyperlink): CPointer<AtkHyperlink> = obj.cptr
    }
}

class HyperlinkClass(private val cptr: CPointer<cnames.structs._AtkHyperlinkClass>) /* struct */ {
    companion object {
        fun cptr(obj: HyperlinkClass): CPointer<cnames.structs._AtkHyperlinkClass> = obj.cptr
    }
}

interface HyperlinkImpl : InteropWrapper {
    fun getHyperlink(): Hyperlink = stub("HyperlinkImpl default impl")

    companion object {
        fun cptr(obj: HyperlinkImpl): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkHyperlinkImpl>) : HyperlinkImpl {
        override val rawPtr: COpaquePointer = cptr
    }
}

class HyperlinkImplIface(private val cptr: CPointer<cnames.structs._AtkHyperlinkImplIface>) /* struct */ {
    companion object {
        fun cptr(obj: HyperlinkImplIface): CPointer<cnames.structs._AtkHyperlinkImplIface> = obj.cptr
    }
}

typealias HyperlinkStateFlags = AtkHyperlinkStateFlags

interface Hypertext : InteropWrapper {
    fun getLink(link_index: Int): Hyperlink = stub("Hypertext default impl")

    fun getLinkIndex(char_index: Int): Int = stub("Hypertext default impl")

    fun getNLinks(): Int = stub("Hypertext default impl")

    companion object {
        fun cptr(obj: Hypertext): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkHypertext>) : Hypertext {
        override val rawPtr: COpaquePointer = cptr
    }
}

class HypertextIface(private val cptr: CPointer<cnames.structs._AtkHypertextIface>) /* struct */ {
    companion object {
        fun cptr(obj: HypertextIface): CPointer<cnames.structs._AtkHypertextIface> = obj.cptr
    }
}

val INTERFACE_AGE: Int get() = TODO()

interface Image : InteropWrapper {
    fun getImageDescription(): String = stub("Image default impl")

    fun getImageLocale(): String = stub("Image default impl")

    fun getImagePosition(x: Int, y: Int, coord_type: CoordType): Unit = stub("Image default impl")

    fun getImageSize(width: Int, height: Int): Unit = stub("Image default impl")

    fun setImageDescription(description: String): Boolean = stub("Image default impl")

    companion object {
        fun cptr(obj: Image): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkImage>) : Image {
        override val rawPtr: COpaquePointer = cptr
    }
}

class ImageIface(private val cptr: CPointer<cnames.structs._AtkImageIface>) /* struct */ {
    companion object {
        fun cptr(obj: ImageIface): CPointer<cnames.structs._AtkImageIface> = obj.cptr
    }
}

class Implementor(private val cptr: CPointer<cnames.structs._AtkImplementor>) /* struct */ {
    fun refAccessible(): Object {
         return stub()
    }
    companion object {
        fun cptr(obj: Implementor): CPointer<cnames.structs._AtkImplementor> = obj.cptr
    }
}

interface ImplementorIface : InteropWrapper {
    companion object {
        fun cptr(obj: ImplementorIface): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkImplementorIface>) : ImplementorIface {
        override val rawPtr: COpaquePointer = cptr
    }
}

class KeyEventStruct(private val cptr: CPointer<cnames.structs._AtkKeyEventStruct>) /* struct */ {
    companion object {
        fun cptr(obj: KeyEventStruct): CPointer<cnames.structs._AtkKeyEventStruct> = obj.cptr
    }
}

typealias KeyEventType = AtkKeyEventType

typealias KeySnoopFunc = (event:  KeyEventStruct, user_data:  Any) -> Int

typealias Layer = AtkLayer

val MAJOR_VERSION: Int get() = TODO()

val MICRO_VERSION: Int get() = TODO()

val MINOR_VERSION: Int get() = TODO()

open class Misc internal constructor (private val cptr: CPointer<AtkMisc>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 34749824UL
        fun cptr(obj: Misc): CPointer<AtkMisc> = obj.cptr
    }
}

class MiscClass(private val cptr: CPointer<cnames.structs._AtkMiscClass>) /* struct */ {
    companion object {
        fun cptr(obj: MiscClass): CPointer<cnames.structs._AtkMiscClass> = obj.cptr
    }
}

open class NoOpObjectFactory internal constructor (private val cptr: CPointer<AtkNoOpObjectFactory>) : ObjectFactory(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<AtkNoOpObjectFactory>>())

    companion object {
        const val G_TYPE: gtk3.GType = 27849856UL
        fun cptr(obj: NoOpObjectFactory): CPointer<AtkNoOpObjectFactory> = obj.cptr
    }
}

class NoOpObjectFactoryClass(private val cptr: CPointer<cnames.structs._AtkNoOpObjectFactoryClass>) /* struct */ {
    companion object {
        fun cptr(obj: NoOpObjectFactoryClass): CPointer<cnames.structs._AtkNoOpObjectFactoryClass> = obj.cptr
    }
}

open class Object internal constructor (private val cptr: CPointer<AtkObject>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun addRelationship(relationship: RelationType, target: Object): Boolean {
         return stub()
    }
    open fun getAccessibleId(): String {
         return stub()
    }
    open fun getAttributes(): List<Any> {
         return stub()
    }
    open fun getDescription(): String {
         return stub()
    }
    open fun getIndexInParent(): Int {
         return stub()
    }
    open fun getNAccessibleChildren(): Int {
         return stub()
    }
    open fun getName(): String {
         return stub()
    }
    open fun getObjectLocale(): String {
         return stub()
    }
    open fun getParent(): Object {
         return stub()
    }
    open fun getRole(): Role {
         return stub()
    }
    open fun initialize(data: Any): Unit {
         return stub()
    }
    open fun notifyStateChange(state: ULong, value: Boolean): Unit {
         return stub()
    }
    open fun peekParent(): Object {
         return stub()
    }
    open fun refAccessibleChild(i: Int): Object {
         return stub()
    }
    open fun refRelationSet(): RelationSet {
         return stub()
    }
    open fun refStateSet(): StateSet {
         return stub()
    }
    open fun removeRelationship(relationship: RelationType, target: Object): Boolean {
         return stub()
    }
    open fun setAccessibleId(`name`: String): Unit {
         return stub()
    }
    open fun setDescription(description: String): Unit {
         return stub()
    }
    open fun setName(`name`: String): Unit {
         return stub()
    }
    open fun setParent(parent: Object): Unit {
         return stub()
    }
    open fun setRole(role: Role): Unit {
         return stub()
    }
    fun setOnActiveDescendantChanged(cb: () -> Unit) {
        do_connect(cptr, "active-descendant-changed", cb)
    }

    fun setOnChildrenChanged(cb: () -> Unit) {
        do_connect(cptr, "children-changed", cb)
    }

    fun setOnFocusEvent(cb: () -> Unit) {
        do_connect(cptr, "focus-event", cb)
    }

    fun setOnPropertyChange(cb: () -> Unit) {
        do_connect(cptr, "property-change", cb)
    }

    fun setOnStateChange(cb: () -> Unit) {
        do_connect(cptr, "state-change", cb)
    }

    fun setOnVisibleDataChanged(cb: () -> Unit) {
        do_connect(cptr, "visible-data-changed", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 26495504UL
        fun cptr(obj: Object): CPointer<AtkObject> = obj.cptr
    }
}

class ObjectClass(private val cptr: CPointer<cnames.structs._AtkObjectClass>) /* struct */ {
    companion object {
        fun cptr(obj: ObjectClass): CPointer<cnames.structs._AtkObjectClass> = obj.cptr
    }
}

open class ObjectFactory internal constructor (private val cptr: CPointer<AtkObjectFactory>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun createAccessible(obj: com.charlag.kgtk.demo.gobject.Object): Object {
         return stub()
    }
    open fun getAccessibleType(): GType {
         return stub()
    }
    open fun invalidate(): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 27479936UL
        fun cptr(obj: ObjectFactory): CPointer<AtkObjectFactory> = obj.cptr
    }
}

class ObjectFactoryClass(private val cptr: CPointer<cnames.structs._AtkObjectFactoryClass>) /* struct */ {
    companion object {
        fun cptr(obj: ObjectFactoryClass): CPointer<cnames.structs._AtkObjectFactoryClass> = obj.cptr
    }
}

open class Plug internal constructor (private val cptr: CPointer<AtkPlug>) : Object(cptr.reinterpret()), Component, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<AtkPlug>>())

    open fun getId(): String {
         return stub()
    }
    open fun setChild(child: Object): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 26496080UL
        fun cptr(obj: Plug): CPointer<AtkPlug> = obj.cptr
    }
}

class PlugClass(private val cptr: CPointer<cnames.structs._AtkPlugClass>) /* struct */ {
    companion object {
        fun cptr(obj: PlugClass): CPointer<cnames.structs._AtkPlugClass> = obj.cptr
    }
}

typealias PropertyChangeHandler = (obj:  Object, vals:  PropertyValues) -> Unit

class PropertyValues(private val cptr: CPointer<cnames.structs._AtkPropertyValues>) /* struct */ {
    companion object {
        fun cptr(obj: PropertyValues): CPointer<cnames.structs._AtkPropertyValues> = obj.cptr
    }
}

class Range(private val cptr: CPointer<cnames.structs._AtkRange>) /* struct */ {
    fun new(lower_limit: Double, upper_limit: Double, description: String): Range {
         return stub()
    }
    fun copy(): Range {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getDescription(): String {
         return stub()
    }
    fun getLowerLimit(): Double {
         return stub()
    }
    fun getUpperLimit(): Double {
         return stub()
    }
    companion object {
        fun cptr(obj: Range): CPointer<cnames.structs._AtkRange> = obj.cptr
    }
}

class Rectangle(private val cptr: CPointer<cnames.structs._AtkRectangle>) /* struct */ {
    companion object {
        fun cptr(obj: Rectangle): CPointer<cnames.structs._AtkRectangle> = obj.cptr
    }
}

open class Registry internal constructor (private val cptr: CPointer<AtkRegistry>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getFactory(type: GType): ObjectFactory {
         return stub()
    }
    open fun getFactoryType(type: GType): GType {
         return stub()
    }
    open fun setFactoryType(type: GType, factory_type: GType): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 28577568UL
        fun cptr(obj: Registry): CPointer<AtkRegistry> = obj.cptr
    }
}

class RegistryClass(private val cptr: CPointer<cnames.structs._AtkRegistryClass>) /* struct */ {
    companion object {
        fun cptr(obj: RegistryClass): CPointer<cnames.structs._AtkRegistryClass> = obj.cptr
    }
}

open class Relation internal constructor (private val cptr: CPointer<AtkRelation>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(targets: List<Object>, n_targets: Int, relationship: RelationType) : this(stub<CPointer<AtkRelation>>())

    open fun addTarget(target: Object): Unit {
         return stub()
    }
    open fun getRelationType(): RelationType {
         return stub()
    }
    open fun getTarget(): List<Object> {
         return stub()
    }
    open fun removeTarget(target: Object): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 28414800UL
        fun cptr(obj: Relation): CPointer<AtkRelation> = obj.cptr
    }
}

class RelationClass(private val cptr: CPointer<cnames.structs._AtkRelationClass>) /* struct */ {
    companion object {
        fun cptr(obj: RelationClass): CPointer<cnames.structs._AtkRelationClass> = obj.cptr
    }
}

open class RelationSet internal constructor (private val cptr: CPointer<AtkRelationSet>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<AtkRelationSet>>())

    open fun add(relation: Relation): Unit {
         return stub()
    }
    open fun addRelationByType(relationship: RelationType, target: Object): Unit {
         return stub()
    }
    open fun contains(relationship: RelationType): Boolean {
         return stub()
    }
    open fun containsTarget(relationship: RelationType, target: Object): Boolean {
         return stub()
    }
    open fun getNRelations(): Int {
         return stub()
    }
    open fun getRelation(i: Int): Relation {
         return stub()
    }
    open fun getRelationByType(relationship: RelationType): Relation {
         return stub()
    }
    open fun remove(relation: Relation): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 25507200UL
        fun cptr(obj: RelationSet): CPointer<AtkRelationSet> = obj.cptr
    }
}

class RelationSetClass(private val cptr: CPointer<cnames.structs._AtkRelationSetClass>) /* struct */ {
    companion object {
        fun cptr(obj: RelationSetClass): CPointer<cnames.structs._AtkRelationSetClass> = obj.cptr
    }
}

typealias RelationType = AtkRelationType

typealias Role = AtkRole

typealias ScrollType = AtkScrollType

interface Selection : InteropWrapper {
    fun addSelection(i: Int): Boolean = stub("Selection default impl")

    fun clearSelection(): Boolean = stub("Selection default impl")

    fun getSelectionCount(): Int = stub("Selection default impl")

    fun isChildSelected(i: Int): Boolean = stub("Selection default impl")

    fun refSelection(i: Int): Object = stub("Selection default impl")

    fun removeSelection(i: Int): Boolean = stub("Selection default impl")

    fun selectAllSelection(): Boolean = stub("Selection default impl")

    companion object {
        fun cptr(obj: Selection): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkSelection>) : Selection {
        override val rawPtr: COpaquePointer = cptr
    }
}

class SelectionIface(private val cptr: CPointer<cnames.structs._AtkSelectionIface>) /* struct */ {
    companion object {
        fun cptr(obj: SelectionIface): CPointer<cnames.structs._AtkSelectionIface> = obj.cptr
    }
}

open class Socket internal constructor (private val cptr: CPointer<AtkSocket>) : Object(cptr.reinterpret()), Component, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<AtkSocket>>())

    open fun embed(plug_id: String): Unit {
         return stub()
    }
    open fun isOccupied(): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 31106368UL
        fun cptr(obj: Socket): CPointer<AtkSocket> = obj.cptr
    }
}

class SocketClass(private val cptr: CPointer<cnames.structs._AtkSocketClass>) /* struct */ {
    companion object {
        fun cptr(obj: SocketClass): CPointer<cnames.structs._AtkSocketClass> = obj.cptr
    }
}

open class StateSet internal constructor (private val cptr: CPointer<AtkStateSet>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<AtkStateSet>>())

    open fun addState(type: StateType): Boolean {
         return stub()
    }
    open fun addStates(types: List<StateType>, n_types: Int): Unit {
         return stub()
    }
    open fun andSets(compare_set: StateSet): StateSet {
         return stub()
    }
    open fun clearStates(): Unit {
         return stub()
    }
    open fun containsState(type: StateType): Boolean {
         return stub()
    }
    open fun containsStates(types: List<StateType>, n_types: Int): Boolean {
         return stub()
    }
    open fun isEmpty(): Boolean {
         return stub()
    }
    open fun orSets(compare_set: StateSet): StateSet {
         return stub()
    }
    open fun removeState(type: StateType): Boolean {
         return stub()
    }
    open fun xorSets(compare_set: StateSet): StateSet {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 29753104UL
        fun cptr(obj: StateSet): CPointer<AtkStateSet> = obj.cptr
    }
}

class StateSetClass(private val cptr: CPointer<cnames.structs._AtkStateSetClass>) /* struct */ {
    companion object {
        fun cptr(obj: StateSetClass): CPointer<cnames.structs._AtkStateSetClass> = obj.cptr
    }
}

typealias StateType = AtkStateType

interface StreamableContent : InteropWrapper {
    fun getMimeType(i: Int): String = stub("StreamableContent default impl")

    fun getNMimeTypes(): Int = stub("StreamableContent default impl")

    fun getStream(mime_type: String): com.charlag.kgtk.demo.glib.IOChannel = stub("StreamableContent default impl")

    fun getUri(mime_type: String): String = stub("StreamableContent default impl")

    companion object {
        fun cptr(obj: StreamableContent): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkStreamableContent>) : StreamableContent {
        override val rawPtr: COpaquePointer = cptr
    }
}

class StreamableContentIface(private val cptr: CPointer<cnames.structs._AtkStreamableContentIface>) /* struct */ {
    companion object {
        fun cptr(obj: StreamableContentIface): CPointer<cnames.structs._AtkStreamableContentIface> = obj.cptr
    }
}

interface Table : InteropWrapper {
    fun addColumnSelection(column: Int): Boolean = stub("Table default impl")

    fun addRowSelection(row: Int): Boolean = stub("Table default impl")

    fun getCaption(): Object = stub("Table default impl")

    fun getColumnDescription(column: Int): String = stub("Table default impl")

    fun getColumnExtentAt(row: Int, column: Int): Int = stub("Table default impl")

    fun getColumnHeader(column: Int): Object = stub("Table default impl")

    fun getNColumns(): Int = stub("Table default impl")

    fun getNRows(): Int = stub("Table default impl")

    fun getRowDescription(row: Int): String = stub("Table default impl")

    fun getRowExtentAt(row: Int, column: Int): Int = stub("Table default impl")

    fun getRowHeader(row: Int): Object = stub("Table default impl")

    fun getSelectedColumns(selected: Int): Int = stub("Table default impl")

    fun getSelectedRows(selected: Int): Int = stub("Table default impl")

    fun getSummary(): Object = stub("Table default impl")

    fun isColumnSelected(column: Int): Boolean = stub("Table default impl")

    fun isRowSelected(row: Int): Boolean = stub("Table default impl")

    fun isSelected(row: Int, column: Int): Boolean = stub("Table default impl")

    fun refAt(row: Int, column: Int): Object = stub("Table default impl")

    fun removeColumnSelection(column: Int): Boolean = stub("Table default impl")

    fun removeRowSelection(row: Int): Boolean = stub("Table default impl")

    fun setCaption(caption: Object): Unit = stub("Table default impl")

    fun setColumnDescription(column: Int, description: String): Unit = stub("Table default impl")

    fun setColumnHeader(column: Int, header: Object): Unit = stub("Table default impl")

    fun setRowDescription(row: Int, description: String): Unit = stub("Table default impl")

    fun setRowHeader(row: Int, header: Object): Unit = stub("Table default impl")

    fun setSummary(accessible: Object): Unit = stub("Table default impl")

    companion object {
        fun cptr(obj: Table): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkTable>) : Table {
        override val rawPtr: COpaquePointer = cptr
    }
}

interface TableCell : InteropWrapper {
    fun getColumnHeaderCells(): List<Object> = stub("TableCell default impl")

    fun getColumnSpan(): Int = stub("TableCell default impl")

    fun getPosition(row: Int, column: Int): Boolean = stub("TableCell default impl")

    fun getRowColumnSpan(row: Int, column: Int, row_span: Int, column_span: Int): Boolean = stub("TableCell default impl")

    fun getRowHeaderCells(): List<Object> = stub("TableCell default impl")

    fun getRowSpan(): Int = stub("TableCell default impl")

    fun getTable(): Object = stub("TableCell default impl")

    companion object {
        fun cptr(obj: TableCell): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkTableCell>) : TableCell {
        override val rawPtr: COpaquePointer = cptr
    }
}

class TableCellIface(private val cptr: CPointer<cnames.structs._AtkTableCellIface>) /* struct */ {
    companion object {
        fun cptr(obj: TableCellIface): CPointer<cnames.structs._AtkTableCellIface> = obj.cptr
    }
}

class TableIface(private val cptr: CPointer<cnames.structs._AtkTableIface>) /* struct */ {
    companion object {
        fun cptr(obj: TableIface): CPointer<cnames.structs._AtkTableIface> = obj.cptr
    }
}

interface Text : InteropWrapper {
    fun freeRanges(ranges: List<TextRange>): Unit = stub("Text default impl")

    fun addSelection(start_offset: Int, end_offset: Int): Boolean = stub("Text default impl")

    fun getBoundedRanges(rect: TextRectangle, coord_type: CoordType, x_clip_type: TextClipType, y_clip_type: TextClipType): List<TextRange> = stub("Text default impl")

    fun getCaretOffset(): Int = stub("Text default impl")

    fun getCharacterAtOffset(offset: Int): Char = stub("Text default impl")

    fun getCharacterCount(): Int = stub("Text default impl")

    fun getCharacterExtents(offset: Int, x: Int, y: Int, width: Int, height: Int, coords: CoordType): Unit = stub("Text default impl")

    fun getDefaultAttributes(): List<Any> = stub("Text default impl")

    fun getNSelections(): Int = stub("Text default impl")

    fun getOffsetAtPoint(x: Int, y: Int, coords: CoordType): Int = stub("Text default impl")

    fun getRangeExtents(start_offset: Int, end_offset: Int, coord_type: CoordType, rect: TextRectangle): Unit = stub("Text default impl")

    fun getRunAttributes(offset: Int, start_offset: Int, end_offset: Int): List<Any> = stub("Text default impl")

    fun getSelection(selection_num: Int, start_offset: Int, end_offset: Int): String = stub("Text default impl")

    fun getStringAtOffset(offset: Int, granularity: TextGranularity, start_offset: Int, end_offset: Int): String = stub("Text default impl")

    fun getText(start_offset: Int, end_offset: Int): String = stub("Text default impl")

    fun removeSelection(selection_num: Int): Boolean = stub("Text default impl")

    fun scrollSubstringTo(start_offset: Int, end_offset: Int, type: ScrollType): Boolean = stub("Text default impl")

    fun scrollSubstringToPoint(start_offset: Int, end_offset: Int, coords: CoordType, x: Int, y: Int): Boolean = stub("Text default impl")

    fun setCaretOffset(offset: Int): Boolean = stub("Text default impl")

    fun setSelection(selection_num: Int, start_offset: Int, end_offset: Int): Boolean = stub("Text default impl")

    companion object {
        fun cptr(obj: Text): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkText>) : Text {
        override val rawPtr: COpaquePointer = cptr
    }
}

typealias TextAttribute = AtkTextAttribute

typealias TextBoundary = AtkTextBoundary

typealias TextClipType = AtkTextClipType

typealias TextGranularity = AtkTextGranularity

class TextIface(private val cptr: CPointer<cnames.structs._AtkTextIface>) /* struct */ {
    companion object {
        fun cptr(obj: TextIface): CPointer<cnames.structs._AtkTextIface> = obj.cptr
    }
}

class TextRange(private val cptr: CPointer<cnames.structs._AtkTextRange>) /* struct */ {
    companion object {
        fun cptr(obj: TextRange): CPointer<cnames.structs._AtkTextRange> = obj.cptr
    }
}

class TextRectangle(private val cptr: CPointer<cnames.structs._AtkTextRectangle>) /* struct */ {
    companion object {
        fun cptr(obj: TextRectangle): CPointer<cnames.structs._AtkTextRectangle> = obj.cptr
    }
}

open class Util internal constructor (private val cptr: CPointer<AtkUtil>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25631648UL
        fun cptr(obj: Util): CPointer<AtkUtil> = obj.cptr
    }
}

class UtilClass(private val cptr: CPointer<cnames.structs._AtkUtilClass>) /* struct */ {
    companion object {
        fun cptr(obj: UtilClass): CPointer<cnames.structs._AtkUtilClass> = obj.cptr
    }
}

val VERSION_MIN_REQUIRED: Int get() = TODO()

interface Value : InteropWrapper {
    fun getIncrement(): Double = stub("Value default impl")

    fun getRange(): Range = stub("Value default impl")

    fun getSubRanges(): List<Range> = stub("Value default impl")

    fun getValueAndText(value: Double, text: String): Unit = stub("Value default impl")

    fun setValue(new_value: Double): Unit = stub("Value default impl")

    companion object {
        fun cptr(obj: Value): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkValue>) : Value {
        override val rawPtr: COpaquePointer = cptr
    }
}

class ValueIface(private val cptr: CPointer<cnames.structs._AtkValueIface>) /* struct */ {
    companion object {
        fun cptr(obj: ValueIface): CPointer<cnames.structs._AtkValueIface> = obj.cptr
    }
}

typealias ValueType = AtkValueType

interface Window : InteropWrapper {
    companion object {
        fun cptr(obj: Window): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkWindow>) : Window {
        override val rawPtr: COpaquePointer = cptr
    }
}

class WindowIface(private val cptr: CPointer<cnames.structs._AtkWindowIface>) /* struct */ {
    companion object {
        fun cptr(obj: WindowIface): CPointer<cnames.structs._AtkWindowIface> = obj.cptr
    }
}

fun attributeSetFree(attrib_set:  List<Any>): Unit = TODO()
fun focusTrackerNotify(`object`:  Object): Unit = TODO()
fun getBinaryAge(): UInt = TODO()
fun getDefaultRegistry(): Registry = TODO()
fun getFocusObject(): Object = TODO()
fun getInterfaceAge(): UInt = TODO()
fun getMajorVersion(): UInt = TODO()
fun getMicroVersion(): UInt = TODO()
fun getMinorVersion(): UInt = TODO()
fun getRoot(): Object = TODO()
fun getToolkitName(): String = TODO()
fun getToolkitVersion(): String = TODO()
fun getVersion(): String = TODO()
fun relationTypeForName(`name`:  String): RelationType = TODO()
fun relationTypeGetName(type:  RelationType): String = TODO()
fun relationTypeRegister(`name`:  String): RelationType = TODO()
fun removeFocusTracker(tracker_id:  UInt): Unit = TODO()
fun removeGlobalEventListener(listener_id:  UInt): Unit = TODO()
fun removeKeyEventListener(listener_id:  UInt): Unit = TODO()
fun roleForName(`name`:  String): Role = TODO()
fun roleGetLocalizedName(role:  Role): String = TODO()
fun roleGetName(role:  Role): String = TODO()
fun roleRegister(`name`:  String): Role = TODO()
fun stateTypeForName(`name`:  String): StateType = TODO()
fun stateTypeGetName(type:  StateType): String = TODO()
fun stateTypeRegister(`name`:  String): StateType = TODO()
fun textAttributeForName(`name`:  String): TextAttribute = TODO()
fun textAttributeGetName(attr:  TextAttribute): String = TODO()
fun textAttributeGetValue(attr:  TextAttribute, index_:  Int): String = TODO()
fun textAttributeRegister(`name`:  String): TextAttribute = TODO()
fun textFreeRanges(ranges:  List<TextRange>): Unit = TODO()
fun valueTypeGetLocalizedName(value_type:  ValueType): String = TODO()
fun valueTypeGetName(value_type:  ValueType): String = TODO()
