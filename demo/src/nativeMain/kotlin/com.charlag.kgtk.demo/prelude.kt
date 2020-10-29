package com.charlag.kgtk.demo.prelude 

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