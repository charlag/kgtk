package com.charlag.kgtk.generator.typelib

import girepository.*
import kotlinx.cinterop.*

class Repository {
    private val instance = g_irepository_get_default()

    fun require(namespace: String, version: String, flags: GIRepositoryLoadFlags) {
        memScoped {
            val err = alloc<CPointerVar<GError>>()
            g_irepository_require(instance, namespace, version, flags, err.ptr)
            err.pointed?.let { error ->
                error("Oopsie ${error.message?.toKString()}")
            }
        }
    }

    val loadedNamespaces: Sequence<String>
        get() = g_irepository_get_loaded_namespaces(instance)!!.iterate().map { it.toKString() }

    fun infos(namespace: String): Sequence<BaseInfo> {
        return getSequence(g_irepository_get_n_infos(instance, namespace)) {
            val ptr = g_irepository_get_info(null, namespace, it)!!
            // TODO: correct type here
            typedTypeInfo(ptr)
        }
    }
}

private fun typedTypeInfo(ptr: CPointer<GIBaseInfo>): BaseInfo {
    return when (val type = g_base_info_get_type(ptr)) {
        GIInfoType.GI_INFO_TYPE_CALLBACK -> CallbackInfo(ptr)
        GIInfoType.GI_INFO_TYPE_TYPE -> TypeInfo(ptr)
        GIInfoType.GI_INFO_TYPE_VFUNC -> FunctionInfo(ptr)
        GIInfoType.GI_INFO_TYPE_VALUE -> ValueInfo(ptr)
        GIInfoType.GI_INFO_TYPE_STRUCT -> StructInfo(ptr)
        GIInfoType.GI_INFO_TYPE_ENUM -> EnumInfo(ptr)
        GIInfoType.GI_INFO_TYPE_INTERFACE -> InterfaceInfo(ptr)
        GIInfoType.GI_INFO_TYPE_FUNCTION -> FunctionInfo(ptr)
        GIInfoType.GI_INFO_TYPE_OBJECT -> ObjectInfo(ptr)
        GIInfoType.GI_INFO_TYPE_FLAGS -> EnumInfo(ptr)
        GIInfoType.GI_INFO_TYPE_CONSTANT -> ConstantInfo(ptr)
        GIInfoType.GI_INFO_TYPE_UNION -> UnionInfo(ptr)
        GIInfoType.GI_INFO_TYPE_BOXED,
        GIInfoType.GI_INFO_TYPE_ARG,
        GIInfoType.GI_INFO_TYPE_INVALID,
        GIInfoType.GI_INFO_TYPE_INVALID_0,
        GIInfoType.GI_INFO_TYPE_PROPERTY,
        GIInfoType.GI_INFO_TYPE_SIGNAL,
        GIInfoType.GI_INFO_TYPE_FIELD,
        GIInfoType.GI_INFO_TYPE_UNRESOLVED -> error("Top-level $type?")
    }
}

open class BaseInfo(private val instance: CPointer<GIBaseInfo>) {
    val name: String
        get() = g_base_info_get_name(instance)?.toKString() ?: ""
    val namespace: String
        get() = g_base_info_get_namespace(instance)!!.toKString()
    val type: GIInfoType
        get() = g_base_info_get_type(instance)
}

open class CallableInfo(private val instance: CPointer<GICallableInfo>) : BaseInfo(instance) {
    val args: Sequence<ArgInfo>
        get() = getSequence(g_callable_info_get_n_args(instance)) {
            val ptr = g_callable_info_get_arg(instance, it)!!
            ArgInfo(ptr)
        }
    val returnType: TypeInfo get() = TypeInfo(g_callable_info_get_return_type(instance)!!)
}

class FunctionInfo(private val instance: CPointer<GIFunctionInfo>) : CallableInfo(instance) {
    val flags: GIFunctionInfoFlags get() = g_function_info_get_flags(instance)
    val symbol: String get() = g_function_info_get_symbol(instance)?.toKString() ?: ""

    override fun toString(): String {
        return "FunctionInfo(name=$name,symbol=${symbol},args=${args.toList()},ret=${returnType})"
    }
}

class CallbackInfo(private val instance: CPointer<GICallbackInfo>) : CallableInfo(instance)

class ArgInfo(private val instance: CPointer<GIArgInfo>) : CallableInfo(instance) {
    val argType: TypeInfo get() = TypeInfo(g_arg_info_get_type(instance)!!)
    val direction: GIDirection get() = g_arg_info_get_direction(instance)
    val transfer: GITransfer get() = g_arg_info_get_ownership_transfer(instance)
    val scope: GIScopeType get() = g_arg_info_get_scope(instance)
    val mayBeNull: Boolean get() = g_arg_info_may_be_null(instance) != 0
    val isCallerAllocates: Boolean get() = g_arg_info_is_caller_allocates(instance) != 0
    val isOptional: Boolean get() = g_arg_info_is_optional(instance) != 0
    val isReturnValue: Boolean get() = g_arg_info_is_return_value(instance) != 0

    override fun toString(): String {
        return "ArgInfo(name=$name,argType=$argType,direction=$direction,transfer=$transfer," +
                "scope=$scope,mayBeNull=$mayBeNull,isCallerAllocates=$isCallerAllocates," +
                "isOptional=$isOptional,isReturnValue=$isReturnValue)"
    }
}

open class RegisteredTypeInfo(private val instance: CPointer<GITypeInfo>) : BaseInfo(instance) {
    val typeName: String?
        get() = g_registered_type_info_get_type_name(instance)?.toKString()
    val gtype: GType
        get() = g_registered_type_info_get_g_type(instance)
}

class ObjectInfo(private val instance: CPointer<GIObjectInfo>) : RegisteredTypeInfo(instance) {
    val parent: ObjectInfo?
        get() = g_object_info_get_parent(instance)?.let { ObjectInfo(it) }
    val methods: Sequence<FunctionInfo>
        get() = getSequence(g_object_info_get_n_methods(instance)) {
            val pointer = g_object_info_get_method(instance, it)!!
            FunctionInfo(pointer)
        }
    val interfaces: Sequence<InterfaceInfo>
        get() = getSequence(g_object_info_get_n_interfaces(instance)) {
            val ptr = g_object_info_get_interface(instance, it)!!
            InterfaceInfo(ptr)
        }
    val fields: Sequence<FieldInfo>
        get() = getSequence(g_object_info_get_n_fields(instance)) {
            val ptr = g_object_info_get_field(instance, it)!!
            FieldInfo(ptr)
        }
    val signals: Sequence<SignalInfo>
        get() = getSequence(g_object_info_get_n_signals(instance)) {
            val ptr = g_object_info_get_signal(instance, it)!!
            SignalInfo(ptr)
        }

    fun findMethod(name: String): FunctionInfo? {
        return g_object_info_find_method(instance, name)?.let(::FunctionInfo)
    }

    fun subTypeOf(other: ObjectInfo): Boolean {
        return parent == other || parent?.subTypeOf(other) ?: false
    }
}

class InterfaceInfo(private val instance: CPointer<GIInterfaceInfo>) : RegisteredTypeInfo(instance) {
    val isRegistered: Boolean get() = gi_is_registered_type_info(instance) != 0
    override fun toString(): String {
        return "InterfaceInfo(name=$name,isRegistered=${isRegistered},type=${type})"
    }
}

class FieldInfo(private val instance: CPointer<GIFieldInfo>) : BaseInfo(instance) {
    val fieldType: TypeInfo
        get() = TypeInfo(g_field_info_get_type(instance)!!)
}

class TypeInfo(private val instance: CPointer<GITypeInfo>) : BaseInfo(instance) {
    val tag: GITypeTag get() = g_type_info_get_tag(instance)
    val interfaceInfo: InterfaceInfo?
        get() = g_type_info_get_interface(instance)?.let(::InterfaceInfo)
    val isPointer: Boolean
        get() = g_type_info_is_pointer(instance) != 0

    fun paramType(at: Int): TypeInfo? = g_type_info_get_param_type(instance, at)?.let(::TypeInfo)

    override fun toString(): String {
        return "TypeInfo(name=$name,tag=$tag,interfaceInfo=$interfaceInfo},isPointer=${isPointer})"
    }
}

class StructInfo(private val instance: CPointer<GIStructInfo>) : RegisteredTypeInfo(instance) {
    val methods: Sequence<FunctionInfo>
        get() = getSequence(g_struct_info_get_n_methods(instance)) {
            val ptr = g_struct_info_get_method(instance, it)!!
            FunctionInfo(ptr)
        }
}

class EnumInfo(private val instance: CPointer<GIEnumInfo>) : BaseInfo(instance) {
    val values: Sequence<ValueInfo>
        get() = getSequence(g_enum_info_get_n_values(instance)) {
            val ptr = g_enum_info_get_value(instance, it)!!
            ValueInfo(ptr)
        }
}

class ValueInfo(private val instance: CPointer<GIValueInfo>) : BaseInfo(instance) {
    val value: gint64 get() = g_value_info_get_value(instance)
}

class ConstantInfo(private val instance: CPointer<GIConstantInfo>) : BaseInfo(instance) {
    val constantType: TypeInfo get() = TypeInfo(g_constant_info_get_type(instance)!!)
}

class UnionInfo(private val instance: CPointer<GIUnionInfo>) : RegisteredTypeInfo(instance) {
    val methods: Sequence<FunctionInfo>
        get() = getSequence(g_union_info_get_n_methods(instance)) {
            val ptr = g_union_info_get_method(instance, it)!!
            FunctionInfo(ptr)
        }
}

class SignalInfo(private val instance: CPointer<GISignalInfo>) : CallableInfo(instance)

private fun CPointer<CPointerVar<gcharVar>>.iterate(): Sequence<CPointer<gcharVar>> {
    var i = -1
    return generateSequence {
        i++
        // We try to load until it's null and that's when generateSequence stops
        this[i]
    }
}

private inline fun <T> getSequence(number: Int, crossinline next: (Int) -> T): Sequence<T> {
    var index = 0
    return generateSequence {
        if (index < number) {
            next(index++)
        } else {
            null
        }
    }
}