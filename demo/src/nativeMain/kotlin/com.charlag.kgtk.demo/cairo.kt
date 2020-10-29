// Namespace: cairo
@file:Suppress("RemoveRedundantBackticks", "UNUSED_PARAMETER", "FunctionName", "RedundantUnitReturnType", "unused", "RemoveRedundantQualifierName")
package com.charlag.kgtk.demo.cairo

import com.charlag.kgtk.demo.prelude.*
import gtk3.*
import kotlinx.cinterop.*
import com.charlag.kgtk.demo.prelude.GType

class Context(private val cptr: CPointer<cnames.structs._cairo>) /* struct */ {
    companion object {
        fun cptr(obj: Context): CPointer<cnames.structs._cairo> = obj.cptr
    }
}

class Device(private val cptr: CPointer<cnames.structs._cairo_device>) /* struct */ {
    companion object {
        fun cptr(obj: Device): CPointer<cnames.structs._cairo_device> = obj.cptr
    }
}

class Surface(private val cptr: CPointer<cnames.structs._cairo_surface>) /* struct */ {
    companion object {
        fun cptr(obj: Surface): CPointer<cnames.structs._cairo_surface> = obj.cptr
    }
}

class Matrix(private val cptr: CPointer<cnames.structs._cairo_matrix>) /* struct */ {
    companion object {
        fun cptr(obj: Matrix): CPointer<cnames.structs._cairo_matrix> = obj.cptr
    }
}

class Pattern(private val cptr: CPointer<cnames.structs._cairo_pattern>) /* struct */ {
    companion object {
        fun cptr(obj: Pattern): CPointer<cnames.structs._cairo_pattern> = obj.cptr
    }
}

class Region(private val cptr: CPointer<cnames.structs._cairo_region>) /* struct */ {
    companion object {
        fun cptr(obj: Region): CPointer<cnames.structs._cairo_region> = obj.cptr
    }
}

typealias Content = cairo_content_t

class FontOptions(private val cptr: CPointer<cairo_font_options_t>) /* struct */ {
    companion object {
        fun cptr(obj: FontOptions): CPointer<cairo_font_options_t> = obj.cptr
    }
}

class FontFace(private val cptr: CPointer<cnames.structs._cairo_fontface>) /* struct */ {
    companion object {
        fun cptr(obj: FontFace): CPointer<cnames.structs._cairo_fontface> = obj.cptr
    }
}

class ScaledFont(private val cptr: CPointer<cnames.structs._cairo_scaledfont>) /* struct */ {
    companion object {
        fun cptr(obj: ScaledFont): CPointer<cnames.structs._cairo_scaledfont> = obj.cptr
    }
}

class Path(private val cptr: CPointer<cnames.structs._cairo_path>) /* struct */ {
    companion object {
        fun cptr(obj: Path): CPointer<cnames.structs._cairo_path> = obj.cptr
    }
}

class Rectangle(private val cptr: CPointer<cnames.structs._cairo_rectangle>) /* struct */ {
    companion object {
        fun cptr(obj: Rectangle): CPointer<cnames.structs._cairo_rectangle> = obj.cptr
    }
}

class RectangleInt(private val cptr: CPointer<cnames.structs._cairo_rectangleint>) /* struct */ {
    companion object {
        fun cptr(obj: RectangleInt): CPointer<cnames.structs._cairo_rectangleint> = obj.cptr
    }
}

