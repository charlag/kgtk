// Namespace: GObject
@file:Suppress("RemoveRedundantBackticks", "UNUSED_PARAMETER", "FunctionName", "RedundantUnitReturnType", "unused", "RemoveRedundantQualifierName")
package com.charlag.kgtk.demo.gobject

import com.charlag.kgtk.demo.prelude.*
import gtk3.*
import kotlinx.cinterop.*
import com.charlag.kgtk.demo.prelude.GType

typealias BaseFinalizeFunc = (g_class:  TypeClass) -> Unit

typealias BaseInitFunc = (g_class:  TypeClass) -> Unit

open class Binding internal constructor (private val cptr: CPointer<GBinding>) : Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getFlags(): BindingFlags {
         return stub()
    }
    open fun getSource(): Object {
         return stub()
    }
    open fun getSourceProperty(): String {
         return stub()
    }
    open fun getTarget(): Object {
         return stub()
    }
    open fun getTargetProperty(): String {
         return stub()
    }
    open fun unbind(): Unit {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 25978048UL
        fun cptr(obj: Binding): CPointer<GBinding> = obj.cptr
    }
}

typealias BindingFlags = GBindingFlags

typealias BindingTransformFunc = (binding:  Binding, from_value:  Value, to_value:  Value, user_data:  Any) -> Boolean

typealias BoxedCopyFunc = (boxed:  Any) -> Any

typealias BoxedFreeFunc = (boxed:  Any) -> Unit

class CClosure(private val cptr: CPointer<cnames.structs._GCClosure>) /* struct */ {
    fun marshalBOOLEANBOXEDBOXED(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalBOOLEANFLAGS(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalSTRINGOBJECTPOINTER(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDBOOLEAN(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDBOXED(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDCHAR(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDDOUBLE(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDENUM(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDFLAGS(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDFLOAT(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDINT(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDLONG(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDOBJECT(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDPARAM(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDPOINTER(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDSTRING(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDUCHAR(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDUINT(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDUINTPOINTER(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDULONG(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDVARIANT(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalVOIDVOID(closure: Closure, return_value: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    fun marshalGeneric(closure: Closure, return_gvalue: Value, n_param_values: UInt, param_values: Value, invocation_hint: Any, marshal_data: Any): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: CClosure): CPointer<cnames.structs._GCClosure> = obj.cptr
    }
}

typealias Callback = () -> Unit

typealias ClassFinalizeFunc = (g_class:  TypeClass, class_data:  Any) -> Unit

typealias ClassInitFunc = (g_class:  TypeClass, class_data:  Any) -> Unit

class Closure(private val cptr: CPointer<cnames.structs._GClosure>) /* struct */ {
    fun newObject(sizeof_closure: UInt, `object`: Object): Closure {
         return stub()
    }
    fun newSimple(sizeof_closure: UInt, data: Any): Closure {
         return stub()
    }
    fun invalidate(): Unit {
         return stub()
    }
    fun invoke(return_value: Value, n_param_values: UInt, param_values: List<Value>, invocation_hint: Any): Unit {
         return stub()
    }
    fun ref(): Closure {
         return stub()
    }
    fun sink(): Unit {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Closure): CPointer<cnames.structs._GClosure> = obj.cptr
    }
}

typealias ClosureMarshal = (closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  List<Value>, invocation_hint:  Any, marshal_data:  Any) -> Unit

typealias ClosureNotify = (data:  Any, closure:  Closure) -> Unit

class ClosureNotifyData(private val cptr: CPointer<cnames.structs._GClosureNotifyData>) /* struct */ {
    companion object {
        fun cptr(obj: ClosureNotifyData): CPointer<cnames.structs._GClosureNotifyData> = obj.cptr
    }
}

typealias ConnectFlags = GConnectFlags

class EnumClass(private val cptr: CPointer<cnames.structs._GEnumClass>) /* struct */ {
    companion object {
        fun cptr(obj: EnumClass): CPointer<cnames.structs._GEnumClass> = obj.cptr
    }
}

class EnumValue(private val cptr: CPointer<cnames.structs._GEnumValue>) /* struct */ {
    companion object {
        fun cptr(obj: EnumValue): CPointer<cnames.structs._GEnumValue> = obj.cptr
    }
}

class FlagsClass(private val cptr: CPointer<cnames.structs._GFlagsClass>) /* struct */ {
    companion object {
        fun cptr(obj: FlagsClass): CPointer<cnames.structs._GFlagsClass> = obj.cptr
    }
}

class FlagsValue(private val cptr: CPointer<cnames.structs._GFlagsValue>) /* struct */ {
    companion object {
        fun cptr(obj: FlagsValue): CPointer<cnames.structs._GFlagsValue> = obj.cptr
    }
}

open class InitiallyUnowned internal constructor (private val cptr: CPointer<GInitiallyUnowned>) : Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25885056UL
        fun cptr(obj: InitiallyUnowned): CPointer<GInitiallyUnowned> = obj.cptr
    }
}

class InitiallyUnownedClass(private val cptr: CPointer<cnames.structs._GInitiallyUnownedClass>) /* struct */ {
    companion object {
        fun cptr(obj: InitiallyUnownedClass): CPointer<cnames.structs._GInitiallyUnownedClass> = obj.cptr
    }
}

typealias InstanceInitFunc = (instance:  TypeInstance, g_class:  TypeClass) -> Unit

typealias InterfaceFinalizeFunc = (g_iface:  TypeInterface, iface_data:  Any) -> Unit

class InterfaceInfo(private val cptr: CPointer<cnames.structs._GInterfaceInfo>) /* struct */ {
    companion object {
        fun cptr(obj: InterfaceInfo): CPointer<cnames.structs._GInterfaceInfo> = obj.cptr
    }
}

typealias InterfaceInitFunc = (g_iface:  TypeInterface, iface_data:  Any) -> Unit

open class Object internal constructor (private val cptr: CPointer<GObject>) : InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun bindProperty(source_property: String, target: Object, target_property: String, flags: BindingFlags): Binding {
         return stub()
    }
    open fun bindPropertyFull(source_property: String, target: Object, target_property: String, flags: BindingFlags, transform_to: Closure, transform_from: Closure): Binding {
         return stub()
    }
    open fun forceFloating(): Unit {
         return stub()
    }
    open fun freezeNotify(): Unit {
         return stub()
    }
    open fun getData(key: String): Any {
         return stub()
    }
    open fun getProperty(property_name: String, value: Value): Unit {
         return stub()
    }
    open fun getQdata(quark: UInt): Any {
         return stub()
    }
    open fun getv(n_properties: UInt, names: List<String>, values: List<Value>): Unit {
         return stub()
    }
    open fun isFloating(): Boolean {
         return stub()
    }
    open fun notify(property_name: String): Unit {
         return stub()
    }
    open fun notifyByPspec(pspec: ParamSpec): Unit {
         return stub()
    }
    open fun ref(): Object {
         return stub()
    }
    open fun refSink(): Object {
         return stub()
    }
    open fun runDispose(): Unit {
         return stub()
    }
    open fun setData(key: String, data: Any): Unit {
         return stub()
    }
    open fun setProperty(property_name: String, value: Value): Unit {
         return stub()
    }
    open fun stealData(key: String): Any {
         return stub()
    }
    open fun stealQdata(quark: UInt): Any {
         return stub()
    }
    open fun thawNotify(): Unit {
         return stub()
    }
    open fun unref(): Unit {
         return stub()
    }
    open fun watchClosure(closure: Closure): Unit {
         return stub()
    }
    fun setOnNotify(cb: () -> Unit) {
        do_connect(cptr, "notify", cb)
    }

    companion object {
        const val G_TYPE: gtk3.GType = 80UL
        fun cptr(obj: Object): CPointer<GObject> = obj.cptr
        fun compatControl(what: ULong, data: Any): ULong {
    return stub()
}
        fun interfaceFindProperty(g_iface: TypeInterface, property_name: String): ParamSpec {
    return stub()
}
        fun interfaceInstallProperty(g_iface: TypeInterface, pspec: ParamSpec): Unit {
    return stub()
}
        fun interfaceListProperties(g_iface: TypeInterface, n_properties_p: UInt): List<ParamSpec> {
    return stub()
}
    }
}

class ObjectClass(private val cptr: CPointer<cnames.structs._GObjectClass>) /* struct */ {
    fun findProperty(property_name: String): ParamSpec {
         return stub()
    }
    fun installProperties(n_pspecs: UInt, pspecs: List<ParamSpec>): Unit {
         return stub()
    }
    fun installProperty(property_id: UInt, pspec: ParamSpec): Unit {
         return stub()
    }
    fun listProperties(n_properties: UInt): List<ParamSpec> {
         return stub()
    }
    fun overrideProperty(property_id: UInt, `name`: String): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: ObjectClass): CPointer<cnames.structs._GObjectClass> = obj.cptr
    }
}

class ObjectConstructParam(private val cptr: CPointer<cnames.structs._GObjectConstructParam>) /* struct */ {
    companion object {
        fun cptr(obj: ObjectConstructParam): CPointer<cnames.structs._GObjectConstructParam> = obj.cptr
    }
}

typealias ObjectFinalizeFunc = (`object`:  Object) -> Unit

typealias ObjectGetPropertyFunc = (`object`:  Object, property_id:  UInt, value:  Value, pspec:  ParamSpec) -> Unit

typealias ObjectSetPropertyFunc = (`object`:  Object, property_id:  UInt, value:  Value, pspec:  ParamSpec) -> Unit

val PARAM_MASK: Int get() = TODO()

val PARAM_STATIC_STRINGS: Int get() = TODO()

val PARAM_USER_SHIFT: Int get() = TODO()

typealias ParamFlags = GParamFlags

open class ParamSpec internal constructor (private val cptr: CPointer<GParamSpec>) : InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getBlurb(): String {
         return stub()
    }
    open fun getDefaultValue(): Value {
         return stub()
    }
    open fun getName(): String {
         return stub()
    }
    open fun getNameQuark(): UInt {
         return stub()
    }
    open fun getNick(): String {
         return stub()
    }
    open fun getQdata(quark: UInt): Any {
         return stub()
    }
    open fun getRedirectTarget(): ParamSpec {
         return stub()
    }
    open fun setQdata(quark: UInt, data: Any): Unit {
         return stub()
    }
    open fun sink(): Unit {
         return stub()
    }
    open fun stealQdata(quark: UInt): Any {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 76UL
        fun cptr(obj: ParamSpec): CPointer<GParamSpec> = obj.cptr
    }
}

open class ParamSpecBoolean internal constructor (private val cptr: CPointer<GParamSpecBoolean>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25306016UL
        fun cptr(obj: ParamSpecBoolean): CPointer<GParamSpecBoolean> = obj.cptr
    }
}

open class ParamSpecBoxed internal constructor (private val cptr: CPointer<GParamSpecBoxed>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25313136UL
        fun cptr(obj: ParamSpecBoxed): CPointer<GParamSpecBoxed> = obj.cptr
    }
}

open class ParamSpecChar internal constructor (private val cptr: CPointer<GParamSpecChar>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25305440UL
        fun cptr(obj: ParamSpecChar): CPointer<GParamSpecChar> = obj.cptr
    }
}

class ParamSpecClass(private val cptr: CPointer<cnames.structs._GParamSpecClass>) /* struct */ {
    companion object {
        fun cptr(obj: ParamSpecClass): CPointer<cnames.structs._GParamSpecClass> = obj.cptr
    }
}

open class ParamSpecDouble internal constructor (private val cptr: CPointer<GParamSpecDouble>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25311904UL
        fun cptr(obj: ParamSpecDouble): CPointer<GParamSpecDouble> = obj.cptr
    }
}

open class ParamSpecEnum internal constructor (private val cptr: CPointer<GParamSpecEnum>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25310832UL
        fun cptr(obj: ParamSpecEnum): CPointer<GParamSpecEnum> = obj.cptr
    }
}

open class ParamSpecFlags internal constructor (private val cptr: CPointer<GParamSpecFlags>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25311152UL
        fun cptr(obj: ParamSpecFlags): CPointer<GParamSpecFlags> = obj.cptr
    }
}

open class ParamSpecFloat internal constructor (private val cptr: CPointer<GParamSpecFloat>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25311584UL
        fun cptr(obj: ParamSpecFloat): CPointer<GParamSpecFloat> = obj.cptr
    }
}

open class ParamSpecGType internal constructor (private val cptr: CPointer<GParamSpecGType>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25317584UL
        fun cptr(obj: ParamSpecGType): CPointer<GParamSpecGType> = obj.cptr
    }
}

open class ParamSpecInt internal constructor (private val cptr: CPointer<GParamSpecInt>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25306288UL
        fun cptr(obj: ParamSpecInt): CPointer<GParamSpecInt> = obj.cptr
    }
}

open class ParamSpecInt64 internal constructor (private val cptr: CPointer<GParamSpecInt64>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25308624UL
        fun cptr(obj: ParamSpecInt64): CPointer<GParamSpecInt64> = obj.cptr
    }
}

open class ParamSpecLong internal constructor (private val cptr: CPointer<GParamSpecLong>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25308000UL
        fun cptr(obj: ParamSpecLong): CPointer<GParamSpecLong> = obj.cptr
    }
}

open class ParamSpecObject internal constructor (private val cptr: CPointer<GParamSpecObject>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25316528UL
        fun cptr(obj: ParamSpecObject): CPointer<GParamSpecObject> = obj.cptr
    }
}

open class ParamSpecOverride internal constructor (private val cptr: CPointer<GParamSpecOverride>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25317024UL
        fun cptr(obj: ParamSpecOverride): CPointer<GParamSpecOverride> = obj.cptr
    }
}

open class ParamSpecParam internal constructor (private val cptr: CPointer<GParamSpecParam>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25312672UL
        fun cptr(obj: ParamSpecParam): CPointer<GParamSpecParam> = obj.cptr
    }
}

open class ParamSpecPointer internal constructor (private val cptr: CPointer<GParamSpecPointer>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25313456UL
        fun cptr(obj: ParamSpecPointer): CPointer<GParamSpecPointer> = obj.cptr
    }
}

class ParamSpecPool(private val cptr: CPointer<cnames.structs._GParamSpecPool>) /* struct */ {
    fun insert(pspec: ParamSpec, owner_type: GType): Unit {
         return stub()
    }
    fun list(owner_type: GType, n_pspecs_p: UInt): List<ParamSpec> {
         return stub()
    }
    fun listOwned(owner_type: GType): List<ParamSpec> {
         return stub()
    }
    fun lookup(param_name: String, owner_type: GType, walk_ancestors: Boolean): ParamSpec {
         return stub()
    }
    fun remove(pspec: ParamSpec): Unit {
         return stub()
    }
    fun new(type_prefixing: Boolean): ParamSpecPool {
         return stub()
    }
    companion object {
        fun cptr(obj: ParamSpecPool): CPointer<cnames.structs._GParamSpecPool> = obj.cptr
    }
}

open class ParamSpecString internal constructor (private val cptr: CPointer<GParamSpecString>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25312352UL
        fun cptr(obj: ParamSpecString): CPointer<GParamSpecString> = obj.cptr
    }
}

class ParamSpecTypeInfo(private val cptr: CPointer<cnames.structs._GParamSpecTypeInfo>) /* struct */ {
    companion object {
        fun cptr(obj: ParamSpecTypeInfo): CPointer<cnames.structs._GParamSpecTypeInfo> = obj.cptr
    }
}

open class ParamSpecUChar internal constructor (private val cptr: CPointer<GParamSpecUChar>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25305744UL
        fun cptr(obj: ParamSpecUChar): CPointer<GParamSpecUChar> = obj.cptr
    }
}

open class ParamSpecUInt internal constructor (private val cptr: CPointer<GParamSpecUInt>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25306576UL
        fun cptr(obj: ParamSpecUInt): CPointer<GParamSpecUInt> = obj.cptr
    }
}

open class ParamSpecUInt64 internal constructor (private val cptr: CPointer<GParamSpecUInt64>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25309024UL
        fun cptr(obj: ParamSpecUInt64): CPointer<GParamSpecUInt64> = obj.cptr
    }
}

open class ParamSpecULong internal constructor (private val cptr: CPointer<GParamSpecULong>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25308304UL
        fun cptr(obj: ParamSpecULong): CPointer<GParamSpecULong> = obj.cptr
    }
}

open class ParamSpecUnichar internal constructor (private val cptr: CPointer<GParamSpecUnichar>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25310416UL
        fun cptr(obj: ParamSpecUnichar): CPointer<GParamSpecUnichar> = obj.cptr
    }
}

open class ParamSpecValueArray internal constructor (private val cptr: CPointer<GParamSpecValueArray>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25316208UL
        fun cptr(obj: ParamSpecValueArray): CPointer<GParamSpecValueArray> = obj.cptr
    }
}

open class ParamSpecVariant internal constructor (private val cptr: CPointer<GParamSpecVariant>) : ParamSpec(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    companion object {
        const val G_TYPE: gtk3.GType = 25318096UL
        fun cptr(obj: ParamSpecVariant): CPointer<GParamSpecVariant> = obj.cptr
    }
}

class Parameter(private val cptr: CPointer<cnames.structs._GParameter>) /* struct */ {
    companion object {
        fun cptr(obj: Parameter): CPointer<cnames.structs._GParameter> = obj.cptr
    }
}

val SIGNAL_FLAGS_MASK: Int get() = TODO()

val SIGNAL_MATCH_MASK: Int get() = TODO()

typealias SignalAccumulator = (ihint:  SignalInvocationHint, return_accu:  Value, handler_return:  Value, data:  Any) -> Boolean

typealias SignalEmissionHook = (ihint:  SignalInvocationHint, n_param_values:  UInt, param_values:  List<Value>, data:  Any) -> Boolean

typealias SignalFlags = GSignalFlags

class SignalInvocationHint(private val cptr: CPointer<cnames.structs._GSignalInvocationHint>) /* struct */ {
    companion object {
        fun cptr(obj: SignalInvocationHint): CPointer<cnames.structs._GSignalInvocationHint> = obj.cptr
    }
}

typealias SignalMatchType = GSignalMatchType

class SignalQuery(private val cptr: CPointer<cnames.structs._GSignalQuery>) /* struct */ {
    companion object {
        fun cptr(obj: SignalQuery): CPointer<cnames.structs._GSignalQuery> = obj.cptr
    }
}

val TYPE_FLAG_RESERVED_ID_BIT: ULong get() = TODO()

val TYPE_FUNDAMENTAL_MAX: Int get() = TODO()

val TYPE_FUNDAMENTAL_SHIFT: Int get() = TODO()

val TYPE_RESERVED_BSE_FIRST: Int get() = TODO()

val TYPE_RESERVED_BSE_LAST: Int get() = TODO()

val TYPE_RESERVED_GLIB_FIRST: Int get() = TODO()

val TYPE_RESERVED_GLIB_LAST: Int get() = TODO()

val TYPE_RESERVED_USER_FIRST: Int get() = TODO()

typealias ToggleNotify = (data:  Any, `object`:  Object, is_last_ref:  Boolean) -> Unit

class TypeCValue(private val cptr: CPointer<cnames.structs._GTypeCValue>) /* union */ {
    companion object {
        fun cptr(obj: TypeCValue): CPointer<cnames.structs._GTypeCValue> = obj.cptr
    }
}

class TypeClass(private val cptr: CPointer<cnames.structs._GTypeClass>) /* struct */ {
    fun addPrivate(private_size: ULong): Unit {
         return stub()
    }
    fun getPrivate(private_type: GType): Any {
         return stub()
    }
    fun peekParent(): TypeClass {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun adjustPrivateOffset(g_class: Any, private_size_or_offset: Int): Unit {
         return stub()
    }
    fun peek(type: GType): TypeClass {
         return stub()
    }
    fun peekStatic(type: GType): TypeClass {
         return stub()
    }
    fun ref(type: GType): TypeClass {
         return stub()
    }
    companion object {
        fun cptr(obj: TypeClass): CPointer<cnames.structs._GTypeClass> = obj.cptr
    }
}

typealias TypeClassCacheFunc = (cache_data:  Any, g_class:  TypeClass) -> Boolean

typealias TypeDebugFlags = GTypeDebugFlags

typealias TypeFlags = GTypeFlags

typealias TypeFundamentalFlags = GTypeFundamentalFlags

class TypeFundamentalInfo(private val cptr: CPointer<cnames.structs._GTypeFundamentalInfo>) /* struct */ {
    companion object {
        fun cptr(obj: TypeFundamentalInfo): CPointer<cnames.structs._GTypeFundamentalInfo> = obj.cptr
    }
}

class TypeInfo(private val cptr: CPointer<cnames.structs._GTypeInfo>) /* struct */ {
    companion object {
        fun cptr(obj: TypeInfo): CPointer<cnames.structs._GTypeInfo> = obj.cptr
    }
}

class TypeInstance(private val cptr: CPointer<cnames.structs._GTypeInstance>) /* struct */ {
    fun getPrivate(private_type: GType): Any {
         return stub()
    }
    companion object {
        fun cptr(obj: TypeInstance): CPointer<cnames.structs._GTypeInstance> = obj.cptr
    }
}

class TypeInterface(private val cptr: CPointer<cnames.structs._GTypeInterface>) /* struct */ {
    fun peekParent(): TypeInterface {
         return stub()
    }
    fun addPrerequisite(interface_type: GType, prerequisite_type: GType): Unit {
         return stub()
    }
    fun getPlugin(instance_type: GType, interface_type: GType): TypePlugin {
         return stub()
    }
    fun peek(instance_class: TypeClass, iface_type: GType): TypeInterface {
         return stub()
    }
    fun prerequisites(interface_type: GType, n_prerequisites: UInt): List<GType> {
         return stub()
    }
    companion object {
        fun cptr(obj: TypeInterface): CPointer<cnames.structs._GTypeInterface> = obj.cptr
    }
}

typealias TypeInterfaceCheckFunc = (check_data:  Any, g_iface:  TypeInterface) -> Unit

open class TypeModule internal constructor (private val cptr: CPointer<GTypeModule>) : Object(cptr.reinterpret()), TypePlugin, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun addInterface(instance_type: GType, interface_type: GType, interface_info: InterfaceInfo): Unit {
         return stub()
    }
    open fun registerEnum(`name`: String, const_static_values: EnumValue): GType {
         return stub()
    }
    open fun registerFlags(`name`: String, const_static_values: FlagsValue): GType {
         return stub()
    }
    open fun registerType(parent_type: GType, type_name: String, type_info: TypeInfo, flags: TypeFlags): GType {
         return stub()
    }
    open fun setName(`name`: String): Unit {
         return stub()
    }
    override fun unuse(): Unit {
         return stub()
    }
    override fun use(): Boolean {
         return stub()
    }
    companion object {
        const val G_TYPE: gtk3.GType = 27446000UL
        fun cptr(obj: TypeModule): CPointer<GTypeModule> = obj.cptr
    }
}

class TypeModuleClass(private val cptr: CPointer<cnames.structs._GTypeModuleClass>) /* struct */ {
    companion object {
        fun cptr(obj: TypeModuleClass): CPointer<cnames.structs._GTypeModuleClass> = obj.cptr
    }
}

interface TypePlugin : InteropWrapper {
    fun completeInterfaceInfo(instance_type: GType, interface_type: GType, info: InterfaceInfo): Unit = stub("TypePlugin default impl")

    fun completeTypeInfo(g_type: GType, info: TypeInfo, value_table: TypeValueTable): Unit = stub("TypePlugin default impl")

    fun unuse(): Unit = stub("TypePlugin default impl")

    fun use(): Any = stub("use(): Incompatible override")

    companion object {
        fun cptr(obj: TypePlugin): CPointer<GActionGroup> = obj.rawPtr.reinterpret()
    }

    class Erased(private val cptr: CPointer<GTypePlugin>) : TypePlugin {
        override val rawPtr: COpaquePointer = cptr
    }
}

class TypePluginClass(private val cptr: CPointer<cnames.structs._GTypePluginClass>) /* struct */ {
    companion object {
        fun cptr(obj: TypePluginClass): CPointer<cnames.structs._GTypePluginClass> = obj.cptr
    }
}

typealias TypePluginCompleteInterfaceInfo = (plugin:  TypePlugin, instance_type:  GType, interface_type:  GType, info:  InterfaceInfo) -> Unit

typealias TypePluginCompleteTypeInfo = (plugin:  TypePlugin, g_type:  GType, info:  TypeInfo, value_table:  TypeValueTable) -> Unit

typealias TypePluginUnuse = (plugin:  TypePlugin) -> Unit

typealias TypePluginUse = (plugin:  TypePlugin) -> Unit

class TypeQuery(private val cptr: CPointer<cnames.structs._GTypeQuery>) /* struct */ {
    companion object {
        fun cptr(obj: TypeQuery): CPointer<cnames.structs._GTypeQuery> = obj.cptr
    }
}

class TypeValueTable(private val cptr: CPointer<cnames.structs._GTypeValueTable>) /* struct */ {
    companion object {
        fun cptr(obj: TypeValueTable): CPointer<cnames.structs._GTypeValueTable> = obj.cptr
    }
}

val VALUE_NOCOPY_CONTENTS: Int get() = TODO()

class Value(private val cptr: CPointer<cnames.structs._GValue>) /* struct */ {
    fun copy(dest_value: Value): Unit {
         return stub()
    }
    fun dupObject(): Object {
         return stub()
    }
    fun dupString(): String {
         return stub()
    }
    fun dupVariant(): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    fun fitsPointer(): Boolean {
         return stub()
    }
    fun getBoolean(): Boolean {
         return stub()
    }
    fun getBoxed(): Any {
         return stub()
    }
    fun getChar(): Byte {
         return stub()
    }
    fun getDouble(): Double {
         return stub()
    }
    fun getEnum(): Int {
         return stub()
    }
    fun getFlags(): UInt {
         return stub()
    }
    fun getFloat(): Float {
         return stub()
    }
    fun getGtype(): GType {
         return stub()
    }
    fun getInt(): Int {
         return stub()
    }
    fun getInt64(): Long {
         return stub()
    }
    fun getLong(): Long {
         return stub()
    }
    fun getObject(): Object {
         return stub()
    }
    fun getParam(): ParamSpec {
         return stub()
    }
    fun getPointer(): Any {
         return stub()
    }
    fun getSchar(): Byte {
         return stub()
    }
    fun getString(): String {
         return stub()
    }
    fun getUchar(): UByte {
         return stub()
    }
    fun getUint(): UInt {
         return stub()
    }
    fun getUint64(): ULong {
         return stub()
    }
    fun getUlong(): ULong {
         return stub()
    }
    fun getVariant(): com.charlag.kgtk.demo.glib.Variant {
         return stub()
    }
    fun init(g_type: GType): Value {
         return stub()
    }
    fun initFromInstance(instance: TypeInstance): Unit {
         return stub()
    }
    fun peekPointer(): Any {
         return stub()
    }
    fun reset(): Value {
         return stub()
    }
    fun setBoolean(v_boolean: Boolean): Unit {
         return stub()
    }
    fun setBoxed(v_boxed: Any): Unit {
         return stub()
    }
    fun setBoxedTakeOwnership(v_boxed: Any): Unit {
         return stub()
    }
    fun setChar(v_char: Byte): Unit {
         return stub()
    }
    fun setDouble(v_double: Double): Unit {
         return stub()
    }
    fun setEnum(v_enum: Int): Unit {
         return stub()
    }
    fun setFlags(v_flags: UInt): Unit {
         return stub()
    }
    fun setFloat(v_float: Float): Unit {
         return stub()
    }
    fun setGtype(v_gtype: GType): Unit {
         return stub()
    }
    fun setInstance(instance: Any): Unit {
         return stub()
    }
    fun setInt(v_int: Int): Unit {
         return stub()
    }
    fun setInt64(v_int64: Long): Unit {
         return stub()
    }
    fun setLong(v_long: Long): Unit {
         return stub()
    }
    fun setObject(v_object: Object): Unit {
         return stub()
    }
    fun setParam(param: ParamSpec): Unit {
         return stub()
    }
    fun setPointer(v_pointer: Any): Unit {
         return stub()
    }
    fun setSchar(v_char: Byte): Unit {
         return stub()
    }
    fun setStaticBoxed(v_boxed: Any): Unit {
         return stub()
    }
    fun setStaticString(v_string: String): Unit {
         return stub()
    }
    fun setString(v_string: String): Unit {
         return stub()
    }
    fun setStringTakeOwnership(v_string: String): Unit {
         return stub()
    }
    fun setUchar(v_uchar: UByte): Unit {
         return stub()
    }
    fun setUint(v_uint: UInt): Unit {
         return stub()
    }
    fun setUint64(v_uint64: ULong): Unit {
         return stub()
    }
    fun setUlong(v_ulong: ULong): Unit {
         return stub()
    }
    fun setVariant(variant: com.charlag.kgtk.demo.glib.Variant): Unit {
         return stub()
    }
    fun takeBoxed(v_boxed: Any): Unit {
         return stub()
    }
    fun takeString(v_string: String): Unit {
         return stub()
    }
    fun takeVariant(variant: com.charlag.kgtk.demo.glib.Variant): Unit {
         return stub()
    }
    fun transform(dest_value: Value): Boolean {
         return stub()
    }
    fun unset(): Unit {
         return stub()
    }
    fun typeCompatible(src_type: GType, dest_type: GType): Boolean {
         return stub()
    }
    fun typeTransformable(src_type: GType, dest_type: GType): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: Value): CPointer<cnames.structs._GValue> = obj.cptr
    }
}

class ValueArray(private val cptr: CPointer<cnames.structs._GValueArray>) /* struct */ {
    fun new(n_prealloced: UInt): ValueArray {
         return stub()
    }
    fun append(value: Value): ValueArray {
         return stub()
    }
    fun copy(): ValueArray {
         return stub()
    }
    fun getNth(index_: UInt): Value {
         return stub()
    }
    fun insert(index_: UInt, value: Value): ValueArray {
         return stub()
    }
    fun prepend(value: Value): ValueArray {
         return stub()
    }
    fun remove(index_: UInt): ValueArray {
         return stub()
    }
    fun sort(compare_func: com.charlag.kgtk.demo.glib.CompareDataFunc, user_data: Any): ValueArray {
         return stub()
    }
    companion object {
        fun cptr(obj: ValueArray): CPointer<cnames.structs._GValueArray> = obj.cptr
    }
}

typealias ValueTransform = (src_value:  Value, dest_value:  Value) -> Unit

typealias WeakNotify = (data:  Any, where_the_object_was:  Object) -> Unit

class WeakRef(private val cptr: CPointer<cnames.structs._GWeakRef>) /* struct */ {
    companion object {
        fun cptr(obj: WeakRef): CPointer<cnames.structs._GWeakRef> = obj.cptr
    }
}

class _Value__data__union(private val cptr: CPointer<cnames.structs._G_Value__data__union>) /* union */ {
    companion object {
        fun cptr(obj: _Value__data__union): CPointer<cnames.structs._G_Value__data__union> = obj.cptr
    }
}

fun boxedCopy(boxed_type:  GType, src_boxed:  Any): Any = TODO()
fun boxedFree(boxed_type:  GType, boxed:  Any): Unit = TODO()
fun cclosureMarshalBOOLEANBOXEDBOXED(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalBOOLEANFLAGS(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalSTRINGOBJECTPOINTER(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDBOOLEAN(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDBOXED(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDCHAR(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDDOUBLE(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDENUM(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDFLAGS(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDFLOAT(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDINT(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDLONG(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDOBJECT(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDPARAM(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDPOINTER(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDSTRING(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDUCHAR(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDUINT(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDUINTPOINTER(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDULONG(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDVARIANT(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalVOIDVOID(closure:  Closure, return_value:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun cclosureMarshalGeneric(closure:  Closure, return_gvalue:  Value, n_param_values:  UInt, param_values:  Value, invocation_hint:  Any, marshal_data:  Any): Unit = TODO()
fun clearSignalHandler(handler_id_ptr:  ULong, instance:  Object): Unit = TODO()
fun enumCompleteTypeInfo(g_enum_type:  GType, info:  TypeInfo, const_values:  EnumValue): Unit = TODO()
fun enumGetValue(enum_class:  EnumClass, value:  Int): EnumValue = TODO()
fun enumGetValueByName(enum_class:  EnumClass, `name`:  String): EnumValue = TODO()
fun enumGetValueByNick(enum_class:  EnumClass, nick:  String): EnumValue = TODO()
fun enumRegisterStatic(`name`:  String, const_static_values:  EnumValue): GType = TODO()
fun enumToString(g_enum_type:  GType, value:  Int): String = TODO()
fun flagsCompleteTypeInfo(g_flags_type:  GType, info:  TypeInfo, const_values:  FlagsValue): Unit = TODO()
fun flagsGetFirstValue(flags_class:  FlagsClass, value:  UInt): FlagsValue = TODO()
fun flagsGetValueByName(flags_class:  FlagsClass, `name`:  String): FlagsValue = TODO()
fun flagsGetValueByNick(flags_class:  FlagsClass, nick:  String): FlagsValue = TODO()
fun flagsRegisterStatic(`name`:  String, const_static_values:  FlagsValue): GType = TODO()
fun flagsToString(flags_type:  GType, value:  UInt): String = TODO()
fun gtypeGetType(): GType = TODO()
fun paramSpecBoolean(`name`:  String, nick:  String, blurb:  String, default_value:  Boolean, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecBoxed(`name`:  String, nick:  String, blurb:  String, boxed_type:  GType, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecChar(`name`:  String, nick:  String, blurb:  String, minimum:  Byte, maximum:  Byte, default_value:  Byte, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecDouble(`name`:  String, nick:  String, blurb:  String, minimum:  Double, maximum:  Double, default_value:  Double, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecEnum(`name`:  String, nick:  String, blurb:  String, enum_type:  GType, default_value:  Int, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecFlags(`name`:  String, nick:  String, blurb:  String, flags_type:  GType, default_value:  UInt, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecFloat(`name`:  String, nick:  String, blurb:  String, minimum:  Float, maximum:  Float, default_value:  Float, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecGtype(`name`:  String, nick:  String, blurb:  String, is_a_type:  GType, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecInt(`name`:  String, nick:  String, blurb:  String, minimum:  Int, maximum:  Int, default_value:  Int, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecInt64(`name`:  String, nick:  String, blurb:  String, minimum:  Long, maximum:  Long, default_value:  Long, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecLong(`name`:  String, nick:  String, blurb:  String, minimum:  Long, maximum:  Long, default_value:  Long, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecObject(`name`:  String, nick:  String, blurb:  String, object_type:  GType, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecParam(`name`:  String, nick:  String, blurb:  String, param_type:  GType, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecPointer(`name`:  String, nick:  String, blurb:  String, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecPoolNew(type_prefixing:  Boolean): ParamSpecPool = TODO()
fun paramSpecString(`name`:  String, nick:  String, blurb:  String, default_value:  String, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecUchar(`name`:  String, nick:  String, blurb:  String, minimum:  UByte, maximum:  UByte, default_value:  UByte, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecUint(`name`:  String, nick:  String, blurb:  String, minimum:  UInt, maximum:  UInt, default_value:  UInt, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecUint64(`name`:  String, nick:  String, blurb:  String, minimum:  ULong, maximum:  ULong, default_value:  ULong, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecUlong(`name`:  String, nick:  String, blurb:  String, minimum:  ULong, maximum:  ULong, default_value:  ULong, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecUnichar(`name`:  String, nick:  String, blurb:  String, default_value:  Char, flags:  ParamFlags): ParamSpec = TODO()
fun paramSpecVariant(`name`:  String, nick:  String, blurb:  String, type:  com.charlag.kgtk.demo.glib.VariantType, default_value:  com.charlag.kgtk.demo.glib.Variant, flags:  ParamFlags): ParamSpec = TODO()
fun paramTypeRegisterStatic(`name`:  String, pspec_info:  ParamSpecTypeInfo): GType = TODO()
fun paramValueConvert(pspec:  ParamSpec, src_value:  Value, dest_value:  Value, strict_validation:  Boolean): Boolean = TODO()
fun paramValueDefaults(pspec:  ParamSpec, value:  Value): Boolean = TODO()
fun paramValueSetDefault(pspec:  ParamSpec, value:  Value): Unit = TODO()
fun paramValueValidate(pspec:  ParamSpec, value:  Value): Boolean = TODO()
fun paramValuesCmp(pspec:  ParamSpec, value1:  Value, value2:  Value): Int = TODO()
fun pointerTypeRegisterStatic(`name`:  String): GType = TODO()
fun signalAccumulatorFirstWins(ihint:  SignalInvocationHint, return_accu:  Value, handler_return:  Value, dummy:  Any): Boolean = TODO()
fun signalAccumulatorTrueHandled(ihint:  SignalInvocationHint, return_accu:  Value, handler_return:  Value, dummy:  Any): Boolean = TODO()
fun signalAddEmissionHook(signal_id:  UInt, detail:  UInt, hook_func:  SignalEmissionHook, hook_data:  Any, data_destroy:  com.charlag.kgtk.demo.glib.DestroyNotify): ULong = TODO()
fun signalChainFromOverridden(instance_and_params:  List<Value>, return_value:  Value): Unit = TODO()
fun signalConnectClosure(instance:  Object, detailed_signal:  String, closure:  Closure, after:  Boolean): ULong = TODO()
fun signalConnectClosureById(instance:  Object, signal_id:  UInt, detail:  UInt, closure:  Closure, after:  Boolean): ULong = TODO()
fun signalEmitv(instance_and_params:  List<Value>, signal_id:  UInt, detail:  UInt, return_value:  Value): Unit = TODO()
fun signalGetInvocationHint(instance:  Object): SignalInvocationHint = TODO()
fun signalHandlerBlock(instance:  Object, handler_id:  ULong): Unit = TODO()
fun signalHandlerDisconnect(instance:  Object, handler_id:  ULong): Unit = TODO()
fun signalHandlerFind(instance:  Object, mask:  SignalMatchType, signal_id:  UInt, detail:  UInt, closure:  Closure, func:  Any, data:  Any): ULong = TODO()
fun signalHandlerIsConnected(instance:  Object, handler_id:  ULong): Boolean = TODO()
fun signalHandlerUnblock(instance:  Object, handler_id:  ULong): Unit = TODO()
fun signalHandlersBlockMatched(instance:  Object, mask:  SignalMatchType, signal_id:  UInt, detail:  UInt, closure:  Closure, func:  Any, data:  Any): UInt = TODO()
fun signalHandlersDestroy(instance:  Object): Unit = TODO()
fun signalHandlersDisconnectMatched(instance:  Object, mask:  SignalMatchType, signal_id:  UInt, detail:  UInt, closure:  Closure, func:  Any, data:  Any): UInt = TODO()
fun signalHandlersUnblockMatched(instance:  Object, mask:  SignalMatchType, signal_id:  UInt, detail:  UInt, closure:  Closure, func:  Any, data:  Any): UInt = TODO()
fun signalHasHandlerPending(instance:  Object, signal_id:  UInt, detail:  UInt, may_be_blocked:  Boolean): Boolean = TODO()
fun signalListIds(itype:  GType, n_ids:  UInt): List<UInt> = TODO()
fun signalLookup(`name`:  String, itype:  GType): UInt = TODO()
fun signalName(signal_id:  UInt): String = TODO()
fun signalOverrideClassClosure(signal_id:  UInt, instance_type:  GType, class_closure:  Closure): Unit = TODO()
fun signalParseName(detailed_signal:  String, itype:  GType, signal_id_p:  UInt, detail_p:  UInt, force_detail_quark:  Boolean): Boolean = TODO()
fun signalQuery(signal_id:  UInt, query:  SignalQuery): Unit = TODO()
fun signalRemoveEmissionHook(signal_id:  UInt, hook_id:  ULong): Unit = TODO()
fun signalStopEmission(instance:  Object, signal_id:  UInt, detail:  UInt): Unit = TODO()
fun signalStopEmissionByName(instance:  Object, detailed_signal:  String): Unit = TODO()
fun signalTypeCclosureNew(itype:  GType, struct_offset:  UInt): Closure = TODO()
fun sourceSetClosure(source:  com.charlag.kgtk.demo.glib.Source, closure:  Closure): Unit = TODO()
fun sourceSetDummyCallback(source:  com.charlag.kgtk.demo.glib.Source): Unit = TODO()
fun strdupValueContents(value:  Value): String = TODO()
fun typeAddClassPrivate(class_type:  GType, private_size:  ULong): Unit = TODO()
fun typeAddInstancePrivate(class_type:  GType, private_size:  ULong): Int = TODO()
fun typeAddInterfaceDynamic(instance_type:  GType, interface_type:  GType, plugin:  TypePlugin): Unit = TODO()
fun typeAddInterfaceStatic(instance_type:  GType, interface_type:  GType, info:  InterfaceInfo): Unit = TODO()
fun typeCheckClassIsA(g_class:  TypeClass, is_a_type:  GType): Boolean = TODO()
fun typeCheckInstance(instance:  TypeInstance): Boolean = TODO()
fun typeCheckInstanceIsA(instance:  TypeInstance, iface_type:  GType): Boolean = TODO()
fun typeCheckInstanceIsFundamentallyA(instance:  TypeInstance, fundamental_type:  GType): Boolean = TODO()
fun typeCheckIsValueType(type:  GType): Boolean = TODO()
fun typeCheckValue(value:  Value): Boolean = TODO()
fun typeCheckValueHolds(value:  Value, type:  GType): Boolean = TODO()
fun typeChildren(type:  GType, n_children:  UInt): List<GType> = TODO()
fun typeClassAdjustPrivateOffset(g_class:  Any, private_size_or_offset:  Int): Unit = TODO()
fun typeClassPeek(type:  GType): TypeClass = TODO()
fun typeClassPeekStatic(type:  GType): TypeClass = TODO()
fun typeClassRef(type:  GType): TypeClass = TODO()
fun typeDefaultInterfacePeek(g_type:  GType): TypeInterface = TODO()
fun typeDefaultInterfaceRef(g_type:  GType): TypeInterface = TODO()
fun typeDefaultInterfaceUnref(g_iface:  TypeInterface): Unit = TODO()
fun typeDepth(type:  GType): UInt = TODO()
fun typeEnsure(type:  GType): Unit = TODO()
fun typeFreeInstance(instance:  TypeInstance): Unit = TODO()
fun typeFromName(`name`:  String): GType = TODO()
fun typeFundamental(type_id:  GType): GType = TODO()
fun typeFundamentalNext(): GType = TODO()
fun typeGetInstanceCount(type:  GType): Int = TODO()
fun typeGetPlugin(type:  GType): TypePlugin = TODO()
fun typeGetQdata(type:  GType, quark:  UInt): Any = TODO()
fun typeGetTypeRegistrationSerial(): UInt = TODO()
fun typeInit(): Unit = TODO()
fun typeInitWithDebugFlags(debug_flags:  TypeDebugFlags): Unit = TODO()
fun typeInterfaceAddPrerequisite(interface_type:  GType, prerequisite_type:  GType): Unit = TODO()
fun typeInterfaceGetPlugin(instance_type:  GType, interface_type:  GType): TypePlugin = TODO()
fun typeInterfacePeek(instance_class:  TypeClass, iface_type:  GType): TypeInterface = TODO()
fun typeInterfacePrerequisites(interface_type:  GType, n_prerequisites:  UInt): List<GType> = TODO()
fun typeInterfaces(type:  GType, n_interfaces:  UInt): List<GType> = TODO()
fun typeIsA(type:  GType, is_a_type:  GType): Boolean = TODO()
fun typeName(type:  GType): String = TODO()
fun typeNameFromClass(g_class:  TypeClass): String = TODO()
fun typeNameFromInstance(instance:  TypeInstance): String = TODO()
fun typeNextBase(leaf_type:  GType, root_type:  GType): GType = TODO()
fun typeParent(type:  GType): GType = TODO()
fun typeQname(type:  GType): UInt = TODO()
fun typeQuery(type:  GType, query:  TypeQuery): Unit = TODO()
fun typeRegisterDynamic(parent_type:  GType, type_name:  String, plugin:  TypePlugin, flags:  TypeFlags): GType = TODO()
fun typeRegisterFundamental(type_id:  GType, type_name:  String, info:  TypeInfo, finfo:  TypeFundamentalInfo, flags:  TypeFlags): GType = TODO()
fun typeRegisterStatic(parent_type:  GType, type_name:  String, info:  TypeInfo, flags:  TypeFlags): GType = TODO()
fun typeSetQdata(type:  GType, quark:  UInt, data:  Any): Unit = TODO()
fun typeTestFlags(type:  GType, flags:  UInt): Boolean = TODO()
fun valueTypeCompatible(src_type:  GType, dest_type:  GType): Boolean = TODO()
fun valueTypeTransformable(src_type:  GType, dest_type:  GType): Boolean = TODO()
