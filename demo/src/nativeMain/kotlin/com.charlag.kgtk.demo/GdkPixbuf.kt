// Namespace: GdkPixbuf
@file:Suppress("RemoveRedundantBackticks", "UNUSED_PARAMETER", "FunctionName", "RedundantUnitReturnType", "unused", "RemoveRedundantQualifierName")
package com.charlag.kgtk.demo.gdkpixbuf

import com.charlag.kgtk.demo.prelude.*
import gtk3.*
import kotlinx.cinterop.*
import com.charlag.kgtk.demo.prelude.GType

enum class Colorspace {}

enum class InterpType {}

val PIXBUF_FEATURES_H: Int get() = TODO()

val PIXBUF_MAJOR: Int get() = TODO()

val PIXBUF_MICRO: Int get() = TODO()

val PIXBUF_MINOR: Int get() = TODO()

val PIXBUF_VERSION: String get() = TODO()

open class Pixbuf internal constructor (private val cptr: CPointer<GdkPixbuf>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), com.charlag.kgtk.demo.gio.Icon, com.charlag.kgtk.demo.gio.LoadableIcon, InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(colorspace: Colorspace, has_alpha: Boolean, bits_per_sample: Int, width: Int, height: Int) : this(stub<CPointer<GdkPixbuf>>())

    open fun addAlpha(substitute_color: Boolean, r: UByte, g: UByte, b: UByte): Pixbuf {
         return stub()
    }
    open fun applyEmbeddedOrientation(): Pixbuf {
         return stub()
    }
    open fun composite(dest: Pixbuf, dest_x: Int, dest_y: Int, dest_width: Int, dest_height: Int, offset_x: Double, offset_y: Double, scale_x: Double, scale_y: Double, interp_type: InterpType, overall_alpha: Int): Unit {
         return stub()
    }
    open fun compositeColor(dest: Pixbuf, dest_x: Int, dest_y: Int, dest_width: Int, dest_height: Int, offset_x: Double, offset_y: Double, scale_x: Double, scale_y: Double, interp_type: InterpType, overall_alpha: Int, check_x: Int, check_y: Int, check_size: Int, color1: UInt, color2: UInt): Unit {
         return stub()
    }
    open fun compositeColorSimple(dest_width: Int, dest_height: Int, interp_type: InterpType, overall_alpha: Int, check_size: Int, color1: UInt, color2: UInt): Pixbuf {
         return stub()
    }
    open fun copy(): Pixbuf {
         return stub()
    }
    open fun copyArea(src_x: Int, src_y: Int, width: Int, height: Int, dest_pixbuf: Pixbuf, dest_x: Int, dest_y: Int): Unit {
         return stub()
    }
    open fun copyOptions(dest_pixbuf: Pixbuf): Boolean {
         return stub()
    }
    open fun fill(pixel: UInt): Unit {
         return stub()
    }
    open fun flip(horizontal: Boolean): Pixbuf {
         return stub()
    }
    open fun getBitsPerSample(): Int {
         return stub()
    }
    open fun getByteLength(): ULong {
         return stub()
    }
    open fun getColorspace(): Colorspace {
         return stub()
    }
    open fun getHasAlpha(): Boolean {
         return stub()
    }
    open fun getHeight(): Int {
         return stub()
    }
    open fun getNChannels(): Int {
         return stub()
    }
    open fun getOption(key: String): String {
         return stub()
    }
    open fun getOptions(): HashMap<String, String> {
         return stub()
    }
    open fun getPixels(length: UInt): List<UByte> {
         return stub()
    }
    open fun getRowstride(): Int {
         return stub()
    }
    open fun getWidth(): Int {
         return stub()
    }
    open fun newSubpixbuf(src_x: Int, src_y: Int, width: Int, height: Int): Pixbuf {
         return stub()
    }
    open fun readPixelBytes(): com.charlag.kgtk.demo.glib.Bytes {
         return stub()
    }
    open fun readPixels(): UByte {
         return stub()
    }
    open fun removeOption(key: String): Boolean {
         return stub()
    }
    open fun rotateSimple(angle: PixbufRotation): Pixbuf {
         return stub()
    }
    open fun saturateAndPixelate(dest: Pixbuf, saturation: Float, pixelate: Boolean): Unit {
         return stub()
    }
    open fun saveToBufferv(buffer: List<UByte>, buffer_size: ULong, type: String, option_keys: List<String>, option_values: List<String>): Boolean {
         return stub()
    }
    open fun saveToCallbackv(save_func: PixbufSaveFunc, user_data: Any, type: String, option_keys: List<String>, option_values: List<String>): Boolean {
         return stub()
    }
    open fun saveToStreamv(stream: com.charlag.kgtk.demo.gio.OutputStream, type: String, option_keys: List<String>, option_values: List<String>, cancellable: com.charlag.kgtk.demo.gio.Cancellable): Boolean {
         return stub()
    }
    open fun saveToStreamvAsync(stream: com.charlag.kgtk.demo.gio.OutputStream, type: String, option_keys: List<String>, option_values: List<String>, cancellable: com.charlag.kgtk.demo.gio.Cancellable, callback: com.charlag.kgtk.demo.gio.AsyncReadyCallback, user_data: Any): Unit {
         return stub()
    }
    open fun savev(filename: String, type: String, option_keys: List<String>, option_values: List<String>): Boolean {
         return stub()
    }
    open fun scale(dest: Pixbuf, dest_x: Int, dest_y: Int, dest_width: Int, dest_height: Int, offset_x: Double, offset_y: Double, scale_x: Double, scale_y: Double, interp_type: InterpType): Unit {
         return stub()
    }
    open fun scaleSimple(dest_width: Int, dest_height: Int, interp_type: InterpType): Pixbuf {
         return stub()
    }
    open fun setOption(key: String, value: String): Boolean {
         return stub()
    }
    companion object {
        val G_TYPE: gtk3.GType get() = gdk_pixbuf_get_type()
        fun cptr(obj: Pixbuf): CPointer<GdkPixbuf> = obj.cptr
        fun newFromBytes(data: com.charlag.kgtk.demo.glib.Bytes, colorspace: Colorspace, has_alpha: Boolean, bits_per_sample: Int, width: Int, height: Int, rowstride: Int): Pixbuf = Pixbuf(stub<CPointer<GdkPixbuf>>()) 
        fun newFromData(data: List<UByte>, colorspace: Colorspace, has_alpha: Boolean, bits_per_sample: Int, width: Int, height: Int, rowstride: Int, destroy_fn: PixbufDestroyNotify, destroy_fn_data: Any): Pixbuf = Pixbuf(stub<CPointer<GdkPixbuf>>()) 
        fun newFromFile(filename: String): Pixbuf = Pixbuf(stub<CPointer<GdkPixbuf>>()) 
        fun newFromFileAtScale(filename: String, width: Int, height: Int, preserve_aspect_ratio: Boolean): Pixbuf = Pixbuf(stub<CPointer<GdkPixbuf>>()) 
        fun newFromFileAtSize(filename: String, width: Int, height: Int): Pixbuf = Pixbuf(stub<CPointer<GdkPixbuf>>()) 
        fun newFromResource(resource_path: String): Pixbuf = Pixbuf(stub<CPointer<GdkPixbuf>>()) 
        fun newFromResourceAtScale(resource_path: String, width: Int, height: Int, preserve_aspect_ratio: Boolean): Pixbuf = Pixbuf(stub<CPointer<GdkPixbuf>>()) 
        fun newFromStream(stream: com.charlag.kgtk.demo.gio.InputStream, cancellable: com.charlag.kgtk.demo.gio.Cancellable): Pixbuf = Pixbuf(stub<CPointer<GdkPixbuf>>()) 
        fun newFromStreamAtScale(stream: com.charlag.kgtk.demo.gio.InputStream, width: Int, height: Int, preserve_aspect_ratio: Boolean, cancellable: com.charlag.kgtk.demo.gio.Cancellable): Pixbuf = Pixbuf(stub<CPointer<GdkPixbuf>>()) 
        fun newFromStreamFinish(async_result: com.charlag.kgtk.demo.gio.AsyncResult): Pixbuf = Pixbuf(stub<CPointer<GdkPixbuf>>()) 
        fun newFromXpmData(data: List<String>): Pixbuf = Pixbuf(stub<CPointer<GdkPixbuf>>()) 
        fun calculateRowstride(colorspace: Colorspace, has_alpha: Boolean, bits_per_sample: Int, width: Int, height: Int): Int {
    return stub()
}
        fun getFileInfo(filename: String, width: Int, height: Int): PixbufFormat {
    return stub()
}
        fun getFileInfoAsync(filename: String, cancellable: com.charlag.kgtk.demo.gio.Cancellable, callback: com.charlag.kgtk.demo.gio.AsyncReadyCallback, user_data: Any): Unit {
    return stub()
}
        fun getFileInfoFinish(async_result: com.charlag.kgtk.demo.gio.AsyncResult, width: Int, height: Int): PixbufFormat {
    return stub()
}
        fun getFormats(): List<PixbufFormat> {
    return stub()
}
        fun initModules(path: String): Boolean {
    return stub()
}
        fun newFromStreamAsync(stream: com.charlag.kgtk.demo.gio.InputStream, cancellable: com.charlag.kgtk.demo.gio.Cancellable, callback: com.charlag.kgtk.demo.gio.AsyncReadyCallback, user_data: Any): Unit {
    return stub()
}
        fun newFromStreamAtScaleAsync(stream: com.charlag.kgtk.demo.gio.InputStream, width: Int, height: Int, preserve_aspect_ratio: Boolean, cancellable: com.charlag.kgtk.demo.gio.Cancellable, callback: com.charlag.kgtk.demo.gio.AsyncReadyCallback, user_data: Any): Unit {
    return stub()
}
        fun saveToStreamFinish(async_result: com.charlag.kgtk.demo.gio.AsyncResult): Boolean {
    return stub()
}
    }
}

class PixbufAnimation

typealias PixbufDestroyNotify = (pixels:  List<UByte>, data:  Any) -> Unit

enum class PixbufFormat {}

enum class PixbufRotation {}

typealias PixbufSaveFunc = (buf:  List<UByte>, count:  ULong, error:  Error, data:  Any) -> Boolean

fun pixbufErrorQuark(): UInt = TODO()
