// Namespace: Pango
@file:Suppress("RemoveRedundantBackticks", "UNUSED_PARAMETER", "FunctionName", "RedundantUnitReturnType", "unused", "RemoveRedundantQualifierName")
package com.charlag.kgtk.demo.pango

import com.charlag.kgtk.demo.prelude.*
import gtk3.*
import kotlinx.cinterop.*
import com.charlag.kgtk.demo.prelude.GType

val ANALYSIS_FLAG_CENTERED_BASELINE: Int get() = TODO()

val ANALYSIS_FLAG_IS_ELLIPSIS: Int get() = TODO()

val ANALYSIS_FLAG_NEED_HYPHEN: Int get() = TODO()

val ATTR_INDEX_FROM_TEXT_BEGINNING: Int get() = TODO()

typealias Alignment = PangoAlignment

class Analysis(private val cptr: CPointer<cnames.structs._PangoAnalysis>) /* struct */ {
    companion object {
        fun cptr(obj: Analysis): CPointer<cnames.structs._PangoAnalysis> = obj.cptr
    }
}

class AttrClass(private val cptr: CPointer<cnames.structs._PangoAttrClass>) /* struct */ {
    companion object {
        fun cptr(obj: AttrClass): CPointer<cnames.structs._PangoAttrClass> = obj.cptr
    }
}

class AttrColor(private val cptr: CPointer<cnames.structs._PangoAttrColor>) /* struct */ {
    companion object {
        fun cptr(obj: AttrColor): CPointer<cnames.structs._PangoAttrColor> = obj.cptr
    }
}

typealias AttrDataCopyFunc = (user_data:  Any) -> Any

typealias AttrFilterFunc = (attribute:  Attribute, user_data:  Any) -> Boolean

class AttrFloat(private val cptr: CPointer<cnames.structs._PangoAttrFloat>) /* struct */ {
    companion object {
        fun cptr(obj: AttrFloat): CPointer<cnames.structs._PangoAttrFloat> = obj.cptr
    }
}

class AttrFontDesc(private val cptr: CPointer<cnames.structs._PangoAttrFontDesc>) /* struct */ {
    fun new(desc: FontDescription): Attribute {
         return stub()
    }
    companion object {
        fun cptr(obj: AttrFontDesc): CPointer<cnames.structs._PangoAttrFontDesc> = obj.cptr
    }
}

class AttrFontFeatures(private val cptr: CPointer<cnames.structs._PangoAttrFontFeatures>) /* struct */ {
    fun new(features: String): Attribute {
         return stub()
    }
    companion object {
        fun cptr(obj: AttrFontFeatures): CPointer<cnames.structs._PangoAttrFontFeatures> = obj.cptr
    }
}

class AttrInt(private val cptr: CPointer<cnames.structs._PangoAttrInt>) /* struct */ {
    companion object {
        fun cptr(obj: AttrInt): CPointer<cnames.structs._PangoAttrInt> = obj.cptr
    }
}

class AttrIterator(private val cptr: CPointer<cnames.structs._PangoAttrIterator>) /* struct */ {
    fun copy(): AttrIterator {
         return stub()
    }
    fun destroy(): Unit {
         return stub()
    }
    fun get(type: AttrType): Attribute {
         return stub()
    }
    fun getAttrs(): List<Attribute> {
         return stub()
    }
    fun getFont(desc: FontDescription, language: Language, extra_attrs: List<Attribute>): Unit {
         return stub()
    }
    fun next(): Boolean {
         return stub()
    }
    fun range(start: Int, end: Int): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: AttrIterator): CPointer<cnames.structs._PangoAttrIterator> = obj.cptr
    }
}

class AttrLanguage(private val cptr: CPointer<cnames.structs._PangoAttrLanguage>) /* struct */ {
    fun new(language: Language): Attribute {
         return stub()
    }
    companion object {
        fun cptr(obj: AttrLanguage): CPointer<cnames.structs._PangoAttrLanguage> = obj.cptr
    }
}

class AttrList(private val cptr: CPointer<cnames.structs._PangoAttrList>) /* struct */ {
    fun new(): AttrList {
         return stub()
    }
    fun change(attr: Attribute): Unit {
         return stub()
    }
    fun copy(): AttrList {
         return stub()
    }
    fun filter(func: AttrFilterFunc, data: Any): AttrList {
         return stub()
    }
    fun getAttributes(): List<Attribute> {
         return stub()
    }
    fun getIterator(): AttrIterator {
         return stub()
    }
    fun insert(attr: Attribute): Unit {
         return stub()
    }
    fun insertBefore(attr: Attribute): Unit {
         return stub()
    }
    fun ref(): AttrList {
         return stub()
    }
    fun splice(other: AttrList, pos: Int, len: Int): Unit {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun update(pos: Int, remove: Int, add: Int): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: AttrList): CPointer<cnames.structs._PangoAttrList> = obj.cptr
    }
}

class AttrShape(private val cptr: CPointer<cnames.structs._PangoAttrShape>) /* struct */ {
    fun new(ink_rect: Rectangle, logical_rect: Rectangle): Attribute {
         return stub()
    }
    fun newWithData(ink_rect: Rectangle, logical_rect: Rectangle, data: Any, copy_func: AttrDataCopyFunc, destroy_func: com.charlag.kgtk.demo.glib.DestroyNotify): Attribute {
         return stub()
    }
    companion object {
        fun cptr(obj: AttrShape): CPointer<cnames.structs._PangoAttrShape> = obj.cptr
    }
}

class AttrSize(private val cptr: CPointer<cnames.structs._PangoAttrSize>) /* struct */ {
    fun new(size: Int): Attribute {
         return stub()
    }
    fun newAbsolute(size: Int): Attribute {
         return stub()
    }
    companion object {
        fun cptr(obj: AttrSize): CPointer<cnames.structs._PangoAttrSize> = obj.cptr
    }
}

class AttrString(private val cptr: CPointer<cnames.structs._PangoAttrString>) /* struct */ {
    companion object {
        fun cptr(obj: AttrString): CPointer<cnames.structs._PangoAttrString> = obj.cptr
    }
}

typealias AttrType = PangoAttrType

class Attribute(private val cptr: CPointer<cnames.structs._PangoAttribute>) /* struct */ {
    fun copy(): Attribute {
         return stub()
    }
    fun destroy(): Unit {
         return stub()
    }
    fun equal(attr2: Attribute): Boolean {
         return stub()
    }
    fun init(klass: AttrClass): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Attribute): CPointer<cnames.structs._PangoAttribute> = obj.cptr
    }
}

typealias BidiType = PangoBidiType

class Color(private val cptr: CPointer<cnames.structs._PangoColor>) /* struct */ {
    fun copy(): Color {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun parse(spec: String): Boolean {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    companion object {
        fun cptr(obj: Color): CPointer<cnames.structs._PangoColor> = obj.cptr
    }
}

open class Context internal constructor (private val cptr: CPointer<PangoContext>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<PangoContext>>())

    open fun changed(): Unit {
         return stub()
    }
    open fun getBaseDir(): Direction {
         return stub()
    }
    open fun getBaseGravity(): Gravity {
         return stub()
    }
    open fun getFontDescription(): FontDescription {
         return stub()
    }
    open fun getFontMap(): FontMap {
         return stub()
    }
    open fun getGravity(): Gravity {
         return stub()
    }
    open fun getGravityHint(): GravityHint {
         return stub()
    }
    open fun getLanguage(): Language {
         return stub()
    }
    open fun getMatrix(): Matrix {
         return stub()
    }
    open fun getMetrics(desc: FontDescription, language: Language): FontMetrics {
         return stub()
    }
    open fun getRoundGlyphPositions(): Boolean {
         return stub()
    }
    open fun getSerial(): UInt {
         return stub()
    }
    open fun listFamilies(families: List<FontFamily>, n_families: Int): Unit {
         return stub()
    }
    open fun loadFont(desc: FontDescription): Font {
         return stub()
    }
    open fun loadFontset(desc: FontDescription, language: Language): Fontset {
         return stub()
    }
    open fun setBaseDir(direction: Direction): Unit {
         return stub()
    }
    open fun setBaseGravity(gravity: Gravity): Unit {
         return stub()
    }
    open fun setFontDescription(desc: FontDescription): Unit {
         return stub()
    }
    open fun setFontMap(font_map: FontMap): Unit {
         return stub()
    }
    open fun setGravityHint(hint: GravityHint): Unit {
         return stub()
    }
    open fun setLanguage(language: Language): Unit {
         return stub()
    }
    open fun setMatrix(matrix: Matrix): Unit {
         return stub()
    }
    open fun setRoundGlyphPositions(round_positions: Boolean): Unit {
         return stub()
    }
    companion object {
        val G_TYPE: gtk3.GType get() = pango_context_get_type()
        fun cptr(obj: Context): CPointer<PangoContext> = obj.cptr
    }
}

class ContextClass(private val cptr: CPointer<cnames.structs._PangoContextClass>) /* struct */ {
    companion object {
        fun cptr(obj: ContextClass): CPointer<cnames.structs._PangoContextClass> = obj.cptr
    }
}

open class Coverage internal constructor (private val cptr: CPointer<PangoCoverage>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor() : this(stub<CPointer<PangoCoverage>>())

    open fun copy(): Coverage {
         return stub()
    }
    open fun get(index_: Int): CoverageLevel {
         return stub()
    }
    override fun ref(): Coverage {
         return stub()
    }
    open fun set(index_: Int, level: CoverageLevel): Unit {
         return stub()
    }
    override fun unref(): Unit {
         return stub()
    }
    companion object {
        val G_TYPE: gtk3.GType get() = pango_coverage_get_type()
        fun cptr(obj: Coverage): CPointer<PangoCoverage> = obj.cptr
    }
}

typealias CoverageLevel = PangoCoverageLevel

typealias Direction = PangoDirection

val ENGINE_TYPE_LANG: String get() = TODO()

val ENGINE_TYPE_SHAPE: String get() = TODO()

typealias EllipsizeMode = PangoEllipsizeMode

class EngineClass(private val cptr: CPointer<cnames.structs._PangoEngineClass>) /* struct */ {
    companion object {
        fun cptr(obj: EngineClass): CPointer<cnames.structs._PangoEngineClass> = obj.cptr
    }
}

class EngineInfo(private val cptr: CPointer<cnames.structs._PangoEngineInfo>) /* struct */ {
    companion object {
        fun cptr(obj: EngineInfo): CPointer<cnames.structs._PangoEngineInfo> = obj.cptr
    }
}

class EngineLangClass(private val cptr: CPointer<cnames.structs._PangoEngineLangClass>) /* struct */ {
    companion object {
        fun cptr(obj: EngineLangClass): CPointer<cnames.structs._PangoEngineLangClass> = obj.cptr
    }
}

class EngineScriptInfo(private val cptr: CPointer<cnames.structs._PangoEngineScriptInfo>) /* struct */ {
    companion object {
        fun cptr(obj: EngineScriptInfo): CPointer<cnames.structs._PangoEngineScriptInfo> = obj.cptr
    }
}

class EngineShapeClass(private val cptr: CPointer<cnames.structs._PangoEngineShapeClass>) /* struct */ {
    companion object {
        fun cptr(obj: EngineShapeClass): CPointer<cnames.structs._PangoEngineShapeClass> = obj.cptr
    }
}

open class Font internal constructor (private val cptr: CPointer<PangoFont>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun describe(): FontDescription {
         return stub()
    }
    open fun describeWithAbsoluteSize(): FontDescription {
         return stub()
    }
    open fun getCoverage(language: Language): Coverage {
         return stub()
    }
    open fun getFontMap(): FontMap {
         return stub()
    }
    open fun getGlyphExtents(glyph: UInt, ink_rect: Rectangle, logical_rect: Rectangle): Unit {
         return stub()
    }
    open fun getMetrics(language: Language): FontMetrics {
         return stub()
    }
    open fun hasChar(wc: Char): Boolean {
         return stub()
    }
    companion object {
        val G_TYPE: gtk3.GType get() = pango_font_get_type()
        fun cptr(obj: Font): CPointer<PangoFont> = obj.cptr
        fun descriptionsFree(descs: List<FontDescription>, n_descs: Int): Unit {
    return stub()
}
    }
}

class FontClass(private val cptr: CPointer<cnames.structs._PangoFontClass>) /* struct */ {
    companion object {
        fun cptr(obj: FontClass): CPointer<cnames.structs._PangoFontClass> = obj.cptr
    }
}

class FontDescription(private val cptr: CPointer<cnames.structs._PangoFontDescription>) /* struct */ {
    fun new(): FontDescription {
         return stub()
    }
    fun betterMatch(old_match: FontDescription, new_match: FontDescription): Boolean {
         return stub()
    }
    fun copy(): FontDescription {
         return stub()
    }
    fun copyStatic(): FontDescription {
         return stub()
    }
    fun equal(desc2: FontDescription): Boolean {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getFamily(): String {
         return stub()
    }
    fun getGravity(): Gravity {
         return stub()
    }
    fun getSetFields(): FontMask {
         return stub()
    }
    fun getSize(): Int {
         return stub()
    }
    fun getSizeIsAbsolute(): Boolean {
         return stub()
    }
    fun getStretch(): Stretch {
         return stub()
    }
    fun getStyle(): Style {
         return stub()
    }
    fun getVariant(): Variant {
         return stub()
    }
    fun getVariations(): String {
         return stub()
    }
    fun getWeight(): Weight {
         return stub()
    }
    fun hash(): UInt {
         return stub()
    }
    fun merge(desc_to_merge: FontDescription, replace_existing: Boolean): Unit {
         return stub()
    }
    fun mergeStatic(desc_to_merge: FontDescription, replace_existing: Boolean): Unit {
         return stub()
    }
    fun setAbsoluteSize(size: Double): Unit {
         return stub()
    }
    fun setFamily(family: String): Unit {
         return stub()
    }
    fun setFamilyStatic(family: String): Unit {
         return stub()
    }
    fun setGravity(gravity: Gravity): Unit {
         return stub()
    }
    fun setSize(size: Int): Unit {
         return stub()
    }
    fun setStretch(stretch: Stretch): Unit {
         return stub()
    }
    fun setStyle(style: Style): Unit {
         return stub()
    }
    fun setVariant(variant: Variant): Unit {
         return stub()
    }
    fun setVariations(variations: String): Unit {
         return stub()
    }
    fun setVariationsStatic(variations: String): Unit {
         return stub()
    }
    fun setWeight(weight: Weight): Unit {
         return stub()
    }
    fun toFilename(): String {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    fun unsetFields(to_unset: FontMask): Unit {
         return stub()
    }
    fun fromString(str: String): FontDescription {
         return stub()
    }
    companion object {
        fun cptr(obj: FontDescription): CPointer<cnames.structs._PangoFontDescription> = obj.cptr
    }
}

open class FontFace internal constructor (private val cptr: CPointer<PangoFontFace>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun describe(): FontDescription {
         return stub()
    }
    open fun getFaceName(): String {
         return stub()
    }
    open fun isSynthesized(): Boolean {
         return stub()
    }
    open fun listSizes(sizes: List<Int>, n_sizes: Int): Unit {
         return stub()
    }
    companion object {
        val G_TYPE: gtk3.GType get() = pango_font_face_get_type()
        fun cptr(obj: FontFace): CPointer<PangoFontFace> = obj.cptr
    }
}

class FontFaceClass(private val cptr: CPointer<cnames.structs._PangoFontFaceClass>) /* struct */ {
    companion object {
        fun cptr(obj: FontFaceClass): CPointer<cnames.structs._PangoFontFaceClass> = obj.cptr
    }
}

open class FontFamily internal constructor (private val cptr: CPointer<PangoFontFamily>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun getName(): String {
         return stub()
    }
    open fun isMonospace(): Boolean {
         return stub()
    }
    open fun isVariable(): Boolean {
         return stub()
    }
    open fun listFaces(faces: List<FontFace>, n_faces: Int): Unit {
         return stub()
    }
    companion object {
        val G_TYPE: gtk3.GType get() = pango_font_family_get_type()
        fun cptr(obj: FontFamily): CPointer<PangoFontFamily> = obj.cptr
    }
}

class FontFamilyClass(private val cptr: CPointer<cnames.structs._PangoFontFamilyClass>) /* struct */ {
    companion object {
        fun cptr(obj: FontFamilyClass): CPointer<cnames.structs._PangoFontFamilyClass> = obj.cptr
    }
}

open class FontMap internal constructor (private val cptr: CPointer<PangoFontMap>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun changed(): Unit {
         return stub()
    }
    open fun createContext(): Context {
         return stub()
    }
    open fun getSerial(): UInt {
         return stub()
    }
    open fun listFamilies(families: List<FontFamily>, n_families: Int): Unit {
         return stub()
    }
    open fun loadFont(context: Context, desc: FontDescription): Font {
         return stub()
    }
    open fun loadFontset(context: Context, desc: FontDescription, language: Language): Fontset {
         return stub()
    }
    companion object {
        val G_TYPE: gtk3.GType get() = pango_font_map_get_type()
        fun cptr(obj: FontMap): CPointer<PangoFontMap> = obj.cptr
    }
}

class FontMapClass(private val cptr: CPointer<cnames.structs._PangoFontMapClass>) /* struct */ {
    companion object {
        fun cptr(obj: FontMapClass): CPointer<cnames.structs._PangoFontMapClass> = obj.cptr
    }
}

typealias FontMask = PangoFontMask

class FontMetrics(private val cptr: CPointer<cnames.structs._PangoFontMetrics>) /* struct */ {
    fun getApproximateCharWidth(): Int {
         return stub()
    }
    fun getApproximateDigitWidth(): Int {
         return stub()
    }
    fun getAscent(): Int {
         return stub()
    }
    fun getDescent(): Int {
         return stub()
    }
    fun getHeight(): Int {
         return stub()
    }
    fun getStrikethroughPosition(): Int {
         return stub()
    }
    fun getStrikethroughThickness(): Int {
         return stub()
    }
    fun getUnderlinePosition(): Int {
         return stub()
    }
    fun getUnderlineThickness(): Int {
         return stub()
    }
    fun ref(): FontMetrics {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: FontMetrics): CPointer<cnames.structs._PangoFontMetrics> = obj.cptr
    }
}

open class Fontset internal constructor (private val cptr: CPointer<PangoFontset>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun foreach(func: FontsetForeachFunc, data: Any): Unit {
         return stub()
    }
    open fun getFont(wc: UInt): Font {
         return stub()
    }
    open fun getMetrics(): FontMetrics {
         return stub()
    }
    companion object {
        val G_TYPE: gtk3.GType get() = pango_fontset_get_type()
        fun cptr(obj: Fontset): CPointer<PangoFontset> = obj.cptr
    }
}

class FontsetClass(private val cptr: CPointer<cnames.structs._PangoFontsetClass>) /* struct */ {
    companion object {
        fun cptr(obj: FontsetClass): CPointer<cnames.structs._PangoFontsetClass> = obj.cptr
    }
}

typealias FontsetForeachFunc = (fontset:  Fontset, font:  Font, user_data:  Any) -> Boolean

open class FontsetSimple internal constructor (private val cptr: CPointer<PangoFontsetSimple>) : Fontset(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(language: Language) : this(stub<CPointer<PangoFontsetSimple>>())

    open fun append(font: Font): Unit {
         return stub()
    }
    open fun size(): Int {
         return stub()
    }
    companion object {
        val G_TYPE: gtk3.GType get() = pango_fontset_simple_get_type()
        fun cptr(obj: FontsetSimple): CPointer<PangoFontsetSimple> = obj.cptr
    }
}

class FontsetSimpleClass(private val cptr: CPointer<cnames.structs._PangoFontsetSimpleClass>) /* struct */ {
    companion object {
        fun cptr(obj: FontsetSimpleClass): CPointer<cnames.structs._PangoFontsetSimpleClass> = obj.cptr
    }
}

val GLYPH_EMPTY: UInt get() = TODO()

val GLYPH_INVALID_INPUT: UInt get() = TODO()

val GLYPH_UNKNOWN_FLAG: UInt get() = TODO()

class GlyphGeometry(private val cptr: CPointer<cnames.structs._PangoGlyphGeometry>) /* struct */ {
    companion object {
        fun cptr(obj: GlyphGeometry): CPointer<cnames.structs._PangoGlyphGeometry> = obj.cptr
    }
}

class GlyphInfo(private val cptr: CPointer<cnames.structs._PangoGlyphInfo>) /* struct */ {
    companion object {
        fun cptr(obj: GlyphInfo): CPointer<cnames.structs._PangoGlyphInfo> = obj.cptr
    }
}

class GlyphItem(private val cptr: CPointer<cnames.structs._PangoGlyphItem>) /* struct */ {
    fun applyAttrs(text: String, list: AttrList): List<GlyphItem> {
         return stub()
    }
    fun copy(): GlyphItem {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getLogicalWidths(text: String, logical_widths: List<Int>): Unit {
         return stub()
    }
    fun letterSpace(text: String, log_attrs: List<LogAttr>, letter_spacing: Int): Unit {
         return stub()
    }
    fun split(text: String, split_index: Int): GlyphItem {
         return stub()
    }
    companion object {
        fun cptr(obj: GlyphItem): CPointer<cnames.structs._PangoGlyphItem> = obj.cptr
    }
}

class GlyphItemIter(private val cptr: CPointer<cnames.structs._PangoGlyphItemIter>) /* struct */ {
    fun copy(): GlyphItemIter {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun initEnd(glyph_item: GlyphItem, text: String): Boolean {
         return stub()
    }
    fun initStart(glyph_item: GlyphItem, text: String): Boolean {
         return stub()
    }
    fun nextCluster(): Boolean {
         return stub()
    }
    fun prevCluster(): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: GlyphItemIter): CPointer<cnames.structs._PangoGlyphItemIter> = obj.cptr
    }
}

class GlyphString(private val cptr: CPointer<cnames.structs._PangoGlyphString>) /* struct */ {
    fun new(): GlyphString {
         return stub()
    }
    fun copy(): GlyphString {
         return stub()
    }
    fun extents(font: Font, ink_rect: Rectangle, logical_rect: Rectangle): Unit {
         return stub()
    }
    fun extentsRange(start: Int, end: Int, font: Font, ink_rect: Rectangle, logical_rect: Rectangle): Unit {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getLogicalWidths(text: String, length: Int, embedding_level: Int, logical_widths: List<Int>): Unit {
         return stub()
    }
    fun getWidth(): Int {
         return stub()
    }
    fun indexToX(text: String, length: Int, analysis: Analysis, index_: Int, trailing: Boolean, x_pos: Int): Unit {
         return stub()
    }
    fun setSize(new_len: Int): Unit {
         return stub()
    }
    fun xToIndex(text: String, length: Int, analysis: Analysis, x_pos: Int, index_: Int, trailing: Int): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: GlyphString): CPointer<cnames.structs._PangoGlyphString> = obj.cptr
    }
}

class GlyphVisAttr(private val cptr: CPointer<cnames.structs._PangoGlyphVisAttr>) /* struct */ {
    companion object {
        fun cptr(obj: GlyphVisAttr): CPointer<cnames.structs._PangoGlyphVisAttr> = obj.cptr
    }
}

typealias Gravity = PangoGravity

typealias GravityHint = PangoGravityHint

class Item(private val cptr: CPointer<cnames.structs._PangoItem>) /* struct */ {
    fun new(): Item {
         return stub()
    }
    fun applyAttrs(iter: AttrIterator): Unit {
         return stub()
    }
    fun copy(): Item {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun split(split_index: Int, split_offset: Int): Item {
         return stub()
    }
    companion object {
        fun cptr(obj: Item): CPointer<cnames.structs._PangoItem> = obj.cptr
    }
}

class Language(private val cptr: CPointer<cnames.structs._PangoLanguage>) /* struct */ {
    fun getSampleString(): String {
         return stub()
    }
    fun getScripts(num_scripts: Int): List<Script> {
         return stub()
    }
    fun includesScript(script: Script): Boolean {
         return stub()
    }
    fun matches(range_list: String): Boolean {
         return stub()
    }
    override fun toString(): String {
         return stub()
    }
    fun fromString(language: String): Language {
         return stub()
    }
    fun getDefault(): Language {
         return stub()
    }
    companion object {
        fun cptr(obj: Language): CPointer<cnames.structs._PangoLanguage> = obj.cptr
    }
}

open class Layout internal constructor (private val cptr: CPointer<PangoLayout>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    constructor(context: Context) : this(stub<CPointer<PangoLayout>>())

    open fun contextChanged(): Unit {
         return stub()
    }
    open fun copy(): Layout {
         return stub()
    }
    open fun getAlignment(): Alignment {
         return stub()
    }
    open fun getAttributes(): AttrList {
         return stub()
    }
    open fun getAutoDir(): Boolean {
         return stub()
    }
    open fun getBaseline(): Int {
         return stub()
    }
    open fun getCharacterCount(): Int {
         return stub()
    }
    open fun getContext(): Context {
         return stub()
    }
    open fun getCursorPos(index_: Int, strong_pos: Rectangle, weak_pos: Rectangle): Unit {
         return stub()
    }
    open fun getEllipsize(): EllipsizeMode {
         return stub()
    }
    open fun getExtents(ink_rect: Rectangle, logical_rect: Rectangle): Unit {
         return stub()
    }
    open fun getFontDescription(): FontDescription {
         return stub()
    }
    open fun getHeight(): Int {
         return stub()
    }
    open fun getIndent(): Int {
         return stub()
    }
    open fun getIter(): LayoutIter {
         return stub()
    }
    open fun getJustify(): Boolean {
         return stub()
    }
    open fun getLine(line: Int): LayoutLine {
         return stub()
    }
    open fun getLineCount(): Int {
         return stub()
    }
    open fun getLineReadonly(line: Int): LayoutLine {
         return stub()
    }
    open fun getLineSpacing(): Float {
         return stub()
    }
    open fun getLines(): List<LayoutLine> {
         return stub()
    }
    open fun getLinesReadonly(): List<LayoutLine> {
         return stub()
    }
    open fun getLogAttrs(attrs: List<LogAttr>, n_attrs: Int): Unit {
         return stub()
    }
    open fun getLogAttrsReadonly(n_attrs: Int): List<LogAttr> {
         return stub()
    }
    open fun getPixelExtents(ink_rect: Rectangle, logical_rect: Rectangle): Unit {
         return stub()
    }
    open fun getPixelSize(width: Int, height: Int): Unit {
         return stub()
    }
    open fun getSerial(): UInt {
         return stub()
    }
    open fun getSingleParagraphMode(): Boolean {
         return stub()
    }
    open fun getSize(width: Int, height: Int): Unit {
         return stub()
    }
    open fun getSpacing(): Int {
         return stub()
    }
    open fun getTabs(): TabArray {
         return stub()
    }
    open fun getText(): String {
         return stub()
    }
    open fun getUnknownGlyphsCount(): Int {
         return stub()
    }
    open fun getWidth(): Int {
         return stub()
    }
    open fun getWrap(): WrapMode {
         return stub()
    }
    open fun indexToLineX(index_: Int, trailing: Boolean, line: Int, x_pos: Int): Unit {
         return stub()
    }
    open fun indexToPos(index_: Int, pos: Rectangle): Unit {
         return stub()
    }
    open fun isEllipsized(): Boolean {
         return stub()
    }
    open fun isWrapped(): Boolean {
         return stub()
    }
    open fun moveCursorVisually(strong: Boolean, old_index: Int, old_trailing: Int, direction: Int, new_index: Int, new_trailing: Int): Unit {
         return stub()
    }
    open fun setAlignment(alignment: Alignment): Unit {
         return stub()
    }
    open fun setAttributes(attrs: AttrList): Unit {
         return stub()
    }
    open fun setAutoDir(auto_dir: Boolean): Unit {
         return stub()
    }
    open fun setEllipsize(ellipsize: EllipsizeMode): Unit {
         return stub()
    }
    open fun setFontDescription(desc: FontDescription): Unit {
         return stub()
    }
    open fun setHeight(height: Int): Unit {
         return stub()
    }
    open fun setIndent(indent: Int): Unit {
         return stub()
    }
    open fun setJustify(justify: Boolean): Unit {
         return stub()
    }
    open fun setLineSpacing(factor: Float): Unit {
         return stub()
    }
    open fun setMarkup(markup: String, length: Int): Unit {
         return stub()
    }
    open fun setMarkupWithAccel(markup: String, length: Int, accel_marker: Char, accel_char: Char): Unit {
         return stub()
    }
    open fun setSingleParagraphMode(setting: Boolean): Unit {
         return stub()
    }
    open fun setSpacing(spacing: Int): Unit {
         return stub()
    }
    open fun setTabs(tabs: TabArray): Unit {
         return stub()
    }
    open fun setText(text: String, length: Int): Unit {
         return stub()
    }
    open fun setWidth(width: Int): Unit {
         return stub()
    }
    open fun setWrap(wrap: WrapMode): Unit {
         return stub()
    }
    open fun xyToIndex(x: Int, y: Int, index_: Int, trailing: Int): Boolean {
         return stub()
    }
    companion object {
        val G_TYPE: gtk3.GType get() = pango_layout_get_type()
        fun cptr(obj: Layout): CPointer<PangoLayout> = obj.cptr
    }
}

class LayoutClass(private val cptr: CPointer<cnames.structs._PangoLayoutClass>) /* struct */ {
    companion object {
        fun cptr(obj: LayoutClass): CPointer<cnames.structs._PangoLayoutClass> = obj.cptr
    }
}

class LayoutIter(private val cptr: CPointer<cnames.structs._PangoLayoutIter>) /* struct */ {
    fun atLastLine(): Boolean {
         return stub()
    }
    fun copy(): LayoutIter {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getBaseline(): Int {
         return stub()
    }
    fun getCharExtents(logical_rect: Rectangle): Unit {
         return stub()
    }
    fun getClusterExtents(ink_rect: Rectangle, logical_rect: Rectangle): Unit {
         return stub()
    }
    fun getIndex(): Int {
         return stub()
    }
    fun getLayout(): Layout {
         return stub()
    }
    fun getLayoutExtents(ink_rect: Rectangle, logical_rect: Rectangle): Unit {
         return stub()
    }
    fun getLine(): LayoutLine {
         return stub()
    }
    fun getLineExtents(ink_rect: Rectangle, logical_rect: Rectangle): Unit {
         return stub()
    }
    fun getLineReadonly(): LayoutLine {
         return stub()
    }
    fun getLineYrange(y0_: Int, y1_: Int): Unit {
         return stub()
    }
    fun getRun(): GlyphItem {
         return stub()
    }
    fun getRunExtents(ink_rect: Rectangle, logical_rect: Rectangle): Unit {
         return stub()
    }
    fun getRunReadonly(): GlyphItem {
         return stub()
    }
    fun nextChar(): Boolean {
         return stub()
    }
    fun nextCluster(): Boolean {
         return stub()
    }
    fun nextLine(): Boolean {
         return stub()
    }
    fun nextRun(): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: LayoutIter): CPointer<cnames.structs._PangoLayoutIter> = obj.cptr
    }
}

class LayoutLine(private val cptr: CPointer<cnames.structs._PangoLayoutLine>) /* struct */ {
    fun getExtents(ink_rect: Rectangle, logical_rect: Rectangle): Unit {
         return stub()
    }
    fun getHeight(height: Int): Unit {
         return stub()
    }
    fun getPixelExtents(ink_rect: Rectangle, logical_rect: Rectangle): Unit {
         return stub()
    }
    fun getXRanges(start_index: Int, end_index: Int, ranges: List<Int>, n_ranges: Int): Unit {
         return stub()
    }
    fun indexToX(index_: Int, trailing: Boolean, x_pos: Int): Unit {
         return stub()
    }
    fun ref(): LayoutLine {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun xToIndex(x_pos: Int, index_: Int, trailing: Int): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: LayoutLine): CPointer<cnames.structs._PangoLayoutLine> = obj.cptr
    }
}

class LogAttr(private val cptr: CPointer<cnames.structs._PangoLogAttr>) /* struct */ {
    companion object {
        fun cptr(obj: LogAttr): CPointer<cnames.structs._PangoLogAttr> = obj.cptr
    }
}

class Matrix(private val cptr: CPointer<cnames.structs._PangoMatrix>) /* struct */ {
    fun concat(new_matrix: Matrix): Unit {
         return stub()
    }
    fun copy(): Matrix {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getFontScaleFactor(): Double {
         return stub()
    }
    fun getFontScaleFactors(xscale: Double, yscale: Double): Unit {
         return stub()
    }
    fun rotate(degrees: Double): Unit {
         return stub()
    }
    fun scale(scale_x: Double, scale_y: Double): Unit {
         return stub()
    }
    fun transformDistance(dx: Double, dy: Double): Unit {
         return stub()
    }
    fun transformPixelRectangle(rect: Rectangle): Unit {
         return stub()
    }
    fun transformPoint(x: Double, y: Double): Unit {
         return stub()
    }
    fun transformRectangle(rect: Rectangle): Unit {
         return stub()
    }
    fun translate(tx: Double, ty: Double): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Matrix): CPointer<cnames.structs._PangoMatrix> = obj.cptr
    }
}

val RENDER_TYPE_NONE: String get() = TODO()

class Rectangle(private val cptr: CPointer<cnames.structs._PangoRectangle>) /* struct */ {
    companion object {
        fun cptr(obj: Rectangle): CPointer<cnames.structs._PangoRectangle> = obj.cptr
    }
}

typealias RenderPart = PangoRenderPart

open class Renderer internal constructor (private val cptr: CPointer<PangoRenderer>) : com.charlag.kgtk.demo.gobject.Object(cptr.reinterpret()), InteropWrapper {
    override val rawPtr: COpaquePointer = cptr
    open fun activate(): Unit {
         return stub()
    }
    open fun deactivate(): Unit {
         return stub()
    }
    open fun drawErrorUnderline(x: Int, y: Int, width: Int, height: Int): Unit {
         return stub()
    }
    open fun drawGlyph(font: Font, glyph: UInt, x: Double, y: Double): Unit {
         return stub()
    }
    open fun drawGlyphItem(text: String, glyph_item: GlyphItem, x: Int, y: Int): Unit {
         return stub()
    }
    open fun drawGlyphs(font: Font, glyphs: GlyphString, x: Int, y: Int): Unit {
         return stub()
    }
    open fun drawLayout(layout: Layout, x: Int, y: Int): Unit {
         return stub()
    }
    open fun drawLayoutLine(line: LayoutLine, x: Int, y: Int): Unit {
         return stub()
    }
    open fun drawRectangle(part: RenderPart, x: Int, y: Int, width: Int, height: Int): Unit {
         return stub()
    }
    open fun drawTrapezoid(part: RenderPart, y1_: Double, x11: Double, x21: Double, y2: Double, x12: Double, x22: Double): Unit {
         return stub()
    }
    open fun getAlpha(part: RenderPart): UShort {
         return stub()
    }
    open fun getColor(part: RenderPart): Color {
         return stub()
    }
    open fun getLayout(): Layout {
         return stub()
    }
    open fun getLayoutLine(): LayoutLine {
         return stub()
    }
    open fun getMatrix(): Matrix {
         return stub()
    }
    open fun partChanged(part: RenderPart): Unit {
         return stub()
    }
    open fun setAlpha(part: RenderPart, alpha: UShort): Unit {
         return stub()
    }
    open fun setColor(part: RenderPart, color: Color): Unit {
         return stub()
    }
    open fun setMatrix(matrix: Matrix): Unit {
         return stub()
    }
    companion object {
        val G_TYPE: gtk3.GType get() = pango_renderer_get_type()
        fun cptr(obj: Renderer): CPointer<PangoRenderer> = obj.cptr
    }
}

class RendererClass(private val cptr: CPointer<cnames.structs._PangoRendererClass>) /* struct */ {
    companion object {
        fun cptr(obj: RendererClass): CPointer<cnames.structs._PangoRendererClass> = obj.cptr
    }
}

val SCALE: Int get() = TODO()

typealias Script = PangoScript

class ScriptIter(private val cptr: CPointer<cnames.structs._PangoScriptIter>) /* struct */ {
    fun new(text: String, length: Int): ScriptIter {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getRange(start: String, end: String, script: Script): Unit {
         return stub()
    }
    fun next(): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: ScriptIter): CPointer<cnames.structs._PangoScriptIter> = obj.cptr
    }
}

typealias ShapeFlags = PangoShapeFlags

typealias ShowFlags = PangoShowFlags

typealias Stretch = PangoStretch

typealias Style = PangoStyle

typealias TabAlign = PangoTabAlign

class TabArray(private val cptr: CPointer<cnames.structs._PangoTabArray>) /* struct */ {
    fun new(initial_size: Int, positions_in_pixels: Boolean): TabArray {
         return stub()
    }
    fun copy(): TabArray {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getPositionsInPixels(): Boolean {
         return stub()
    }
    fun getSize(): Int {
         return stub()
    }
    fun getTab(tab_index: Int, alignment: TabAlign, location: Int): Unit {
         return stub()
    }
    fun getTabs(alignments: TabAlign, locations: List<Int>): Unit {
         return stub()
    }
    fun resize(new_size: Int): Unit {
         return stub()
    }
    fun setTab(tab_index: Int, alignment: TabAlign, location: Int): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: TabArray): CPointer<cnames.structs._PangoTabArray> = obj.cptr
    }
}

val UNKNOWN_GLYPH_HEIGHT: Int get() = TODO()

val UNKNOWN_GLYPH_WIDTH: Int get() = TODO()

typealias Underline = PangoUnderline

val VERSION_MIN_REQUIRED: Int get() = TODO()

typealias Variant = PangoVariant

typealias Weight = PangoWeight

typealias WrapMode = PangoWrapMode

fun attrAllowBreaksNew(allow_breaks:  Boolean): Attribute = TODO()
fun attrBackgroundAlphaNew(alpha:  UShort): Attribute = TODO()
fun attrBackgroundNew(red:  UShort, green:  UShort, blue:  UShort): Attribute = TODO()
fun attrFallbackNew(enable_fallback:  Boolean): Attribute = TODO()
fun attrFamilyNew(family:  String): Attribute = TODO()
fun attrFontDescNew(desc:  FontDescription): Attribute = TODO()
fun attrFontFeaturesNew(features:  String): Attribute = TODO()
fun attrForegroundAlphaNew(alpha:  UShort): Attribute = TODO()
fun attrForegroundNew(red:  UShort, green:  UShort, blue:  UShort): Attribute = TODO()
fun attrGravityHintNew(hint:  GravityHint): Attribute = TODO()
fun attrGravityNew(gravity:  Gravity): Attribute = TODO()
fun attrInsertHyphensNew(insert_hyphens:  Boolean): Attribute = TODO()
fun attrLanguageNew(language:  Language): Attribute = TODO()
fun attrLetterSpacingNew(letter_spacing:  Int): Attribute = TODO()
fun attrRiseNew(rise:  Int): Attribute = TODO()
fun attrScaleNew(scale_factor:  Double): Attribute = TODO()
fun attrShapeNew(ink_rect:  Rectangle, logical_rect:  Rectangle): Attribute = TODO()
fun attrShapeNewWithData(ink_rect:  Rectangle, logical_rect:  Rectangle, data:  Any, copy_func:  AttrDataCopyFunc, destroy_func:  com.charlag.kgtk.demo.glib.DestroyNotify): Attribute = TODO()
fun attrShowNew(flags:  ShowFlags): Attribute = TODO()
fun attrSizeNew(size:  Int): Attribute = TODO()
fun attrSizeNewAbsolute(size:  Int): Attribute = TODO()
fun attrStretchNew(stretch:  Stretch): Attribute = TODO()
fun attrStrikethroughColorNew(red:  UShort, green:  UShort, blue:  UShort): Attribute = TODO()
fun attrStrikethroughNew(strikethrough:  Boolean): Attribute = TODO()
fun attrStyleNew(style:  Style): Attribute = TODO()
fun attrTypeGetName(type:  AttrType): String = TODO()
fun attrTypeRegister(`name`:  String): AttrType = TODO()
fun attrUnderlineColorNew(red:  UShort, green:  UShort, blue:  UShort): Attribute = TODO()
fun attrUnderlineNew(underline:  Underline): Attribute = TODO()
fun attrVariantNew(variant:  Variant): Attribute = TODO()
fun attrWeightNew(weight:  Weight): Attribute = TODO()
fun bidiTypeForUnichar(ch:  Char): BidiType = TODO()
fun `break`(text:  String, length:  Int, analysis:  Analysis, attrs:  List<LogAttr>, attrs_len:  Int): Unit = TODO()
fun defaultBreak(text:  String, length:  Int, analysis:  Analysis, attrs:  LogAttr, attrs_len:  Int): Unit = TODO()
fun extentsToPixels(inclusive:  Rectangle, nearest:  Rectangle): Unit = TODO()
fun findBaseDir(text:  String, length:  Int): Direction = TODO()
fun findParagraphBoundary(text:  String, length:  Int, paragraph_delimiter_index:  Int, next_paragraph_start:  Int): Unit = TODO()
fun fontDescriptionFromString(str:  String): FontDescription = TODO()
fun getLogAttrs(text:  String, length:  Int, level:  Int, language:  Language, log_attrs:  List<LogAttr>, attrs_len:  Int): Unit = TODO()
fun getMirrorChar(ch:  Char, mirrored_ch:  Char): Boolean = TODO()
fun gravityGetForMatrix(matrix:  Matrix): Gravity = TODO()
fun gravityGetForScript(script:  Script, base_gravity:  Gravity, hint:  GravityHint): Gravity = TODO()
fun gravityGetForScriptAndWidth(script:  Script, wide:  Boolean, base_gravity:  Gravity, hint:  GravityHint): Gravity = TODO()
fun gravityToRotation(gravity:  Gravity): Double = TODO()
fun isZeroWidth(ch:  Char): Boolean = TODO()
fun itemize(context:  Context, text:  String, start_index:  Int, length:  Int, attrs:  AttrList, cached_iter:  AttrIterator): List<Item> = TODO()
fun itemizeWithBaseDir(context:  Context, base_dir:  Direction, text:  String, start_index:  Int, length:  Int, attrs:  AttrList, cached_iter:  AttrIterator): List<Item> = TODO()
fun languageFromString(language:  String): Language = TODO()
fun languageGetDefault(): Language = TODO()
fun log2visGetEmbeddingLevels(text:  String, length:  Int, pbase_dir:  Direction): UByte = TODO()
fun markupParserFinish(context:  com.charlag.kgtk.demo.glib.MarkupParseContext, attr_list:  AttrList, text:  String, accel_char:  Char): Boolean = TODO()
fun markupParserNew(accel_marker:  Char): com.charlag.kgtk.demo.glib.MarkupParseContext = TODO()
fun parseEnum(type:  GType, str:  String, value:  Int, warn:  Boolean, possible_values:  String): Boolean = TODO()
fun parseMarkup(markup_text:  String, length:  Int, accel_marker:  Char, attr_list:  AttrList, text:  String, accel_char:  Char): Boolean = TODO()
fun parseStretch(str:  String, stretch:  Stretch, warn:  Boolean): Boolean = TODO()
fun parseStyle(str:  String, style:  Style, warn:  Boolean): Boolean = TODO()
fun parseVariant(str:  String, variant:  Variant, warn:  Boolean): Boolean = TODO()
fun parseWeight(str:  String, weight:  Weight, warn:  Boolean): Boolean = TODO()
fun quantizeLineGeometry(thickness:  Int, position:  Int): Unit = TODO()
fun readLine(stream:  Any, str:  com.charlag.kgtk.demo.glib.String): Int = TODO()
fun reorderItems(logical_items:  List<Item>): List<Item> = TODO()
fun scanInt(pos:  String, `out`:  Int): Boolean = TODO()
fun scanString(pos:  String, `out`:  com.charlag.kgtk.demo.glib.String): Boolean = TODO()
fun scanWord(pos:  String, `out`:  com.charlag.kgtk.demo.glib.String): Boolean = TODO()
fun scriptForUnichar(ch:  Char): Script = TODO()
fun scriptGetSampleLanguage(script:  Script): Language = TODO()
fun shape(text:  String, length:  Int, analysis:  Analysis, glyphs:  GlyphString): Unit = TODO()
fun shapeFull(item_text:  String, item_length:  Int, paragraph_text:  String, paragraph_length:  Int, analysis:  Analysis, glyphs:  GlyphString): Unit = TODO()
fun shapeWithFlags(item_text:  String, item_length:  Int, paragraph_text:  String, paragraph_length:  Int, analysis:  Analysis, glyphs:  GlyphString, flags:  ShapeFlags): Unit = TODO()
fun skipSpace(pos:  String): Boolean = TODO()
fun splitFileList(str:  String): List<String> = TODO()
fun tailorBreak(text:  String, length:  Int, analysis:  Analysis, offset:  Int, log_attrs:  List<LogAttr>, log_attrs_len:  Int): Unit = TODO()
fun trimString(str:  String): String = TODO()
fun unicharDirection(ch:  Char): Direction = TODO()
fun unitsFromDouble(d:  Double): Int = TODO()
fun unitsToDouble(i:  Int): Double = TODO()
fun version(): Int = TODO()
fun versionCheck(required_major:  Int, required_minor:  Int, required_micro:  Int): String = TODO()
fun versionString(): String = TODO()
