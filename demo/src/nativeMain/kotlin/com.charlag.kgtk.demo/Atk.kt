// Namespace: Atk
@file:Suppress("RemoveRedundantBackticks", "UNUSED_PARAMETER", "FunctionName", "RedundantUnitReturnType", "unused", "RemoveRedundantQualifierName")
package com.charlag.kgtk.demo.atk

import com.charlag.kgtk.demo.prelude.*
import gtk3.*
import kotlinx.cinterop.*
import com.charlag.kgtk.demo.prelude.GType

interface Action : InteropWrapper {
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
        const val G_TYPE: gtk3.GType = 7244240UL
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
    open fun isSelectedLink(): Boolean {
         return stub()
    }
    open fun isValid(): Boolean {
         return stub()
    }
    fun setOnLinkActivated(cb: () -> Unit) {
        do_connect(cptr, "link-activated", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 6316240UL
        fun cptr(obj: Hyperlink): CPointer<AtkHyperlink> = obj.cptr
    }
}

class HyperlinkClass(private val cptr: CPointer<cnames.structs._AtkHyperlinkClass>) /* struct */ {
    companion object {
        fun cptr(obj: HyperlinkClass): CPointer<cnames.structs._AtkHyperlinkClass> = obj.cptr
    }
}

interface HyperlinkImpl : InteropWrapper {
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
    open fun threadsEnter(): Unit {
         return stub()
    }
    open fun threadsLeave(): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 5861248UL
        fun cptr(obj: Misc): CPointer<AtkMisc> = obj.cptr
        fun getInstance(): Misc {
    return stub()
}
    }
}

class MiscClass(private val cptr: CPointer<cnames.structs._AtkMiscClass>) /* struct */ {
    companion object {
        fun cptr(obj: MiscClass): CPointer<cnames.structs._AtkMiscClass> = obj.cptr
    }
}

open class NoOpObject internal constructor (private val cptr: CPointer<AtkNoOpObject>) : Object(cptr.reinterpret()), Action, Component, Document, EditableText, Hypertext, Image, Selection, Table, TableCell, Text, Value, Window, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(obj: com.charlag.kgtk.demo.gobject.Object) : this(stub<CPointer<AtkNoOpObject>>())

    companion object {
        const val G_TYPE: gtk3.GType = 4247024UL
        fun cptr(obj: NoOpObject): CPointer<AtkNoOpObject> = obj.cptr
    }
}

class NoOpObjectClass(private val cptr: CPointer<cnames.structs._AtkNoOpObjectClass>) /* struct */ {
    companion object {
        fun cptr(obj: NoOpObjectClass): CPointer<cnames.structs._AtkNoOpObjectClass> = obj.cptr
    }
}

open class NoOpObjectFactory internal constructor (private val cptr: CPointer<AtkNoOpObjectFactory>) : ObjectFactory(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<AtkNoOpObjectFactory>>())

    companion object {
        const val G_TYPE: gtk3.GType = 5711776UL
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
    open fun getLayer(): Layer {
         return stub()
    }
    open fun getMdiZorder(): Int {
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
    open fun removePropertyChangeHandler(handler_id: UInt): Unit {
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
        const val G_TYPE: gtk3.GType = 4153344UL
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
        const val G_TYPE: gtk3.GType = 5711536UL
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
        const val G_TYPE: gtk3.GType = 4901632UL
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
        const val G_TYPE: gtk3.GType = 4397952UL
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
        const val G_TYPE: gtk3.GType = 4326704UL
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
        const val G_TYPE: gtk3.GType = 6300080UL
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
        const val G_TYPE: gtk3.GType = 9043504UL
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
        const val G_TYPE: gtk3.GType = 4557792UL
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
    companion object {
        fun cptr(obj: Table): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<AtkTable>) : Table {
        override val rawPtr: COpaquePointer = cptr
    }
}

interface TableCell : InteropWrapper {
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
        const val G_TYPE: gtk3.GType = 5500080UL
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
