// Namespace: GLib
@file:Suppress("RemoveRedundantBackticks", "UNUSED_PARAMETER", "FunctionName", "RedundantUnitReturnType", "unused", "RemoveRedundantQualifierName")
package com.charlag.kgtk.demo.glib

import com.charlag.kgtk.demo.prelude.*
import gtk3.*
import kotlinx.cinterop.*
import com.charlag.kgtk.demo.prelude.GType

val ANALYZER_ANALYZING: Int get() = TODO()

val ASCII_DTOSTR_BUF_SIZE: Int get() = TODO()

typealias AsciiType = GAsciiType

class AsyncQueue(private val cptr: CPointer<cnames.structs._GAsyncQueue>) /* struct */ {
    fun length(): Int {
         return stub()
    }
    fun lengthUnlocked(): Int {
         return stub()
    }
    fun lock(): Unit {
         return stub()
    }
    fun pop(): Any {
         return stub()
    }
    fun popUnlocked(): Any {
         return stub()
    }
    fun push(data: Any): Unit {
         return stub()
    }
    fun pushFront(item: Any): Unit {
         return stub()
    }
    fun pushFrontUnlocked(item: Any): Unit {
         return stub()
    }
    fun pushUnlocked(data: Any): Unit {
         return stub()
    }
    fun refUnlocked(): Unit {
         return stub()
    }
    fun remove(item: Any): Boolean {
         return stub()
    }
    fun removeUnlocked(item: Any): Boolean {
         return stub()
    }
    fun timedPop(end_time: TimeVal): Any {
         return stub()
    }
    fun timedPopUnlocked(end_time: TimeVal): Any {
         return stub()
    }
    fun timeoutPop(timeout: ULong): Any {
         return stub()
    }
    fun timeoutPopUnlocked(timeout: ULong): Any {
         return stub()
    }
    fun tryPop(): Any {
         return stub()
    }
    fun tryPopUnlocked(): Any {
         return stub()
    }
    fun unlock(): Unit {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun unrefAndUnlock(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: AsyncQueue): CPointer<cnames.structs._GAsyncQueue> = obj.cptr
    }
}

val BIG_ENDIAN: Int get() = TODO()

class BookmarkFile(private val cptr: CPointer<cnames.structs._GBookmarkFile>) /* struct */ {
    fun addApplication(uri: String, `name`: String, exec: String): Unit {
         return stub()
    }
    fun addGroup(uri: String, group: String): Unit {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getAdded(uri: String): Long {
         return stub()
    }
    fun getAppInfo(uri: String, `name`: String, exec: String, count: UInt, stamp: Long): Boolean {
         return stub()
    }
    fun getApplications(uri: String, length: ULong): List<String> {
         return stub()
    }
    fun getDescription(uri: String): String {
         return stub()
    }
    fun getGroups(uri: String, length: ULong): List<String> {
         return stub()
    }
    fun getIcon(uri: String, href: String, mime_type: String): Boolean {
         return stub()
    }
    fun getIsPrivate(uri: String): Boolean {
         return stub()
    }
    fun getMimeType(uri: String): String {
         return stub()
    }
    fun getModified(uri: String): Long {
         return stub()
    }
    fun getSize(): Int {
         return stub()
    }
    fun getTitle(uri: String): String {
         return stub()
    }
    fun getUris(length: ULong): List<String> {
         return stub()
    }
    fun getVisited(uri: String): Long {
         return stub()
    }
    fun hasApplication(uri: String, `name`: String): Boolean {
         return stub()
    }
    fun hasGroup(uri: String, group: String): Boolean {
         return stub()
    }
    fun hasItem(uri: String): Boolean {
         return stub()
    }
    fun loadFromData(data: List<UByte>, length: ULong): Boolean {
         return stub()
    }
    fun loadFromDataDirs(file: String, full_path: String): Boolean {
         return stub()
    }
    fun loadFromFile(filename: String): Boolean {
         return stub()
    }
    fun moveItem(old_uri: String, new_uri: String): Boolean {
         return stub()
    }
    fun removeApplication(uri: String, `name`: String): Boolean {
         return stub()
    }
    fun removeGroup(uri: String, group: String): Boolean {
         return stub()
    }
    fun removeItem(uri: String): Boolean {
         return stub()
    }
    fun setAdded(uri: String, added: Long): Unit {
         return stub()
    }
    fun setAppInfo(uri: String, `name`: String, exec: String, count: Int, stamp: Long): Boolean {
         return stub()
    }
    fun setDescription(uri: String, description: String): Unit {
         return stub()
    }
    fun setGroups(uri: String, groups: List<String>, length: ULong): Unit {
         return stub()
    }
    fun setIcon(uri: String, href: String, mime_type: String): Unit {
         return stub()
    }
    fun setIsPrivate(uri: String, is_private: Boolean): Unit {
         return stub()
    }
    fun setMimeType(uri: String, mime_type: String): Unit {
         return stub()
    }
    fun setModified(uri: String, modified: Long): Unit {
         return stub()
    }
    fun setTitle(uri: String, title: String): Unit {
         return stub()
    }
    fun setVisited(uri: String, visited: Long): Unit {
         return stub()
    }
    fun toData(length: ULong): List<UByte> {
         return stub()
    }
    fun toFile(filename: String): Boolean {
         return stub()
    }
    fun errorQuark(): UInt {
         return stub()
    }
    companion object {
        fun cptr(obj: BookmarkFile): CPointer<cnames.structs._GBookmarkFile> = obj.cptr
    }
}

typealias BookmarkFileError = GBookmarkFileError

class ByteArray(private val cptr: CPointer<cnames.structs._GByteArray>) /* struct */ {
    fun free(array: List<UByte>, free_segment: Boolean): UByte {
         return stub()
    }
    fun freeToBytes(array: List<UByte>): Bytes {
         return stub()
    }
    fun new(): List<UByte> {
         return stub()
    }
    fun newTake(data: List<UByte>, len: ULong): List<UByte> {
         return stub()
    }
    fun steal(array: List<UByte>, len: ULong): UByte {
         return stub()
    }
    fun unref(array: List<UByte>): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: ByteArray): CPointer<cnames.structs._GByteArray> = obj.cptr
    }
}

class Bytes(private val cptr: CPointer<cnames.structs._GBytes>) /* struct */ {
    fun new(data: List<UByte>, size: ULong): Bytes {
         return stub()
    }
    fun newTake(data: List<UByte>, size: ULong): Bytes {
         return stub()
    }
    fun compare(bytes2: Bytes): Int {
         return stub()
    }
    fun equal(bytes2: Bytes): Boolean {
         return stub()
    }
    fun getData(size: ULong): List<UByte> {
         return stub()
    }
    fun getSize(): ULong {
         return stub()
    }
    fun hash(): UInt {
         return stub()
    }
    fun newFromBytes(offset: ULong, length: ULong): Bytes {
         return stub()
    }
    fun ref(): Bytes {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun unrefToArray(): List<UByte> {
         return stub()
    }
    fun unrefToData(size: ULong): List<UByte> {
         return stub()
    }
    companion object {
        fun cptr(obj: Bytes): CPointer<cnames.structs._GBytes> = obj.cptr
    }
}

val CSET_A_2_Z: String get() = TODO()

val CSET_DIGITS: String get() = TODO()

val CSET_a_2_z: String get() = TODO()

class Checksum(private val cptr: CPointer<cnames.structs._GChecksum>) /* struct */ {
    fun new(checksum_type: ChecksumType): Checksum {
         return stub()
    }
    fun copy(): Checksum {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getString(): String {
         return stub()
    }
    fun reset(): Unit {
         return stub()
    }
    fun update(data: List<UByte>, length: Long): Unit {
         return stub()
    }
    fun typeGetLength(checksum_type: ChecksumType): Long {
         return stub()
    }
    companion object {
        fun cptr(obj: Checksum): CPointer<cnames.structs._GChecksum> = obj.cptr
    }
}

typealias ChecksumType = GChecksumType

typealias ChildWatchFunc = (pid:  Int, status:  Int, user_data:  Any) -> Unit

typealias ClearHandleFunc = (handle_id:  UInt) -> Unit

typealias CompareDataFunc = (a:  Any, b:  Any, user_data:  Any) -> Int

typealias CompareFunc = (a:  Any, b:  Any) -> Int

class Cond(private val cptr: CPointer<cnames.structs._GCond>) /* struct */ {
    fun broadcast(): Unit {
         return stub()
    }
    fun clear(): Unit {
         return stub()
    }
    fun init(): Unit {
         return stub()
    }
    fun signal(): Unit {
         return stub()
    }
    fun wait(mutex: Mutex): Unit {
         return stub()
    }
    fun waitUntil(mutex: Mutex, end_time: Long): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: Cond): CPointer<cnames.structs._GCond> = obj.cptr
    }
}

typealias ConvertError = GConvertError

typealias CopyFunc = (src:  Any, data:  Any) -> Any

val DATALIST_FLAGS_MASK: Int get() = TODO()

val DATE_BAD_DAY: Int get() = TODO()

val DATE_BAD_JULIAN: Int get() = TODO()

val DATE_BAD_YEAR: Int get() = TODO()

val DIR_SEPARATOR: Int get() = TODO()

val DIR_SEPARATOR_S: String get() = TODO()

class Data(private val cptr: CPointer<cnames.structs._GData>) /* struct */ {
    companion object {
        fun cptr(obj: Data): CPointer<cnames.structs._GData> = obj.cptr
    }
}

typealias DataForeachFunc = (key_id:  UInt, data:  Any, user_data:  Any) -> Unit

class Date(private val cptr: CPointer<cnames.structs._GDate>) /* struct */ {
    fun new(): Date {
         return stub()
    }
    fun newDmy(day: UByte, month: DateMonth, year: UShort): Date {
         return stub()
    }
    fun newJulian(julian_day: UInt): Date {
         return stub()
    }
    fun addDays(n_days: UInt): Unit {
         return stub()
    }
    fun addMonths(n_months: UInt): Unit {
         return stub()
    }
    fun addYears(n_years: UInt): Unit {
         return stub()
    }
    fun clamp(min_date: Date, max_date: Date): Unit {
         return stub()
    }
    fun clear(n_dates: UInt): Unit {
         return stub()
    }
    fun compare(rhs: Date): Int {
         return stub()
    }
    fun copy(): Date {
         return stub()
    }
    fun daysBetween(date2: Date): Int {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getDay(): UByte {
         return stub()
    }
    fun getDayOfYear(): UInt {
         return stub()
    }
    fun getIso8601WeekOfYear(): UInt {
         return stub()
    }
    fun getJulian(): UInt {
         return stub()
    }
    fun getMondayWeekOfYear(): UInt {
         return stub()
    }
    fun getMonth(): DateMonth {
         return stub()
    }
    fun getSundayWeekOfYear(): UInt {
         return stub()
    }
    fun getWeekday(): DateWeekday {
         return stub()
    }
    fun getYear(): UShort {
         return stub()
    }
    fun isFirstOfMonth(): Boolean {
         return stub()
    }
    fun isLastOfMonth(): Boolean {
         return stub()
    }
    fun order(date2: Date): Unit {
         return stub()
    }
    fun setDay(day: UByte): Unit {
         return stub()
    }
    fun setDmy(day: UByte, month: DateMonth, y: UShort): Unit {
         return stub()
    }
    fun setJulian(julian_date: UInt): Unit {
         return stub()
    }
    fun setMonth(month: DateMonth): Unit {
         return stub()
    }
    fun setParse(str: String): Unit {
         return stub()
    }
    fun setTime(time_: Int): Unit {
         return stub()
    }
    fun setTimeT(timet: Long): Unit {
         return stub()
    }
    fun setTimeVal(timeval: TimeVal): Unit {
         return stub()
    }
    fun setYear(year: UShort): Unit {
         return stub()
    }
    fun subtractDays(n_days: UInt): Unit {
         return stub()
    }
    fun subtractMonths(n_months: UInt): Unit {
         return stub()
    }
    fun subtractYears(n_years: UInt): Unit {
         return stub()
    }
    fun toStructTm(tm: Any): Unit {
         return stub()
    }
    fun valid(): Boolean {
         return stub()
    }
    fun getDaysInMonth(month: DateMonth, year: UShort): UByte {
         return stub()
    }
    fun getMondayWeeksInYear(year: UShort): UByte {
         return stub()
    }
    fun getSundayWeeksInYear(year: UShort): UByte {
         return stub()
    }
    fun isLeapYear(year: UShort): Boolean {
         return stub()
    }
    fun strftime(s: String, slen: ULong, format: String, date: Date): ULong {
         return stub()
    }
    fun validDay(day: UByte): Boolean {
         return stub()
    }
    fun validDmy(day: UByte, month: DateMonth, year: UShort): Boolean {
         return stub()
    }
    fun validJulian(julian_date: UInt): Boolean {
         return stub()
    }
    fun validMonth(month: DateMonth): Boolean {
         return stub()
    }
    fun validWeekday(weekday: DateWeekday): Boolean {
         return stub()
    }
    fun validYear(year: UShort): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: Date): CPointer<cnames.structs._GDate> = obj.cptr
    }
}

typealias DateDMY = GDateDMY

typealias DateMonth = GDateMonth

class DateTime(private val cptr: CPointer<cnames.structs._GDateTime>) /* struct */ {
    fun new(tz: TimeZone, year: Int, month: Int, day: Int, hour: Int, minute: Int, seconds: Double): DateTime {
         return stub()
    }
    fun newFromIso8601(text: String, default_tz: TimeZone): DateTime {
         return stub()
    }
    fun newFromTimevalLocal(tv: TimeVal): DateTime {
         return stub()
    }
    fun newFromTimevalUtc(tv: TimeVal): DateTime {
         return stub()
    }
    fun newFromUnixLocal(t: Long): DateTime {
         return stub()
    }
    fun newFromUnixUtc(t: Long): DateTime {
         return stub()
    }
    fun newLocal(year: Int, month: Int, day: Int, hour: Int, minute: Int, seconds: Double): DateTime {
         return stub()
    }
    fun newNow(tz: TimeZone): DateTime {
         return stub()
    }
    fun newNowLocal(): DateTime {
         return stub()
    }
    fun newNowUtc(): DateTime {
         return stub()
    }
    fun newUtc(year: Int, month: Int, day: Int, hour: Int, minute: Int, seconds: Double): DateTime {
         return stub()
    }
    fun add(timespan: Long): DateTime {
         return stub()
    }
    fun addDays(days: Int): DateTime {
         return stub()
    }
    fun addFull(years: Int, months: Int, days: Int, hours: Int, minutes: Int, seconds: Double): DateTime {
         return stub()
    }
    fun addHours(hours: Int): DateTime {
         return stub()
    }
    fun addMinutes(minutes: Int): DateTime {
         return stub()
    }
    fun addMonths(months: Int): DateTime {
         return stub()
    }
    fun addSeconds(seconds: Double): DateTime {
         return stub()
    }
    fun addWeeks(weeks: Int): DateTime {
         return stub()
    }
    fun addYears(years: Int): DateTime {
         return stub()
    }
    fun difference(begin: DateTime): Long {
         return stub()
    }
    fun format(format: String): String {
         return stub()
    }
    fun formatIso8601(): String {
         return stub()
    }
    fun getDayOfMonth(): Int {
         return stub()
    }
    fun getDayOfWeek(): Int {
         return stub()
    }
    fun getDayOfYear(): Int {
         return stub()
    }
    fun getHour(): Int {
         return stub()
    }
    fun getMicrosecond(): Int {
         return stub()
    }
    fun getMinute(): Int {
         return stub()
    }
    fun getMonth(): Int {
         return stub()
    }
    fun getSecond(): Int {
         return stub()
    }
    fun getSeconds(): Double {
         return stub()
    }
    fun getTimezone(): TimeZone {
         return stub()
    }
    fun getTimezoneAbbreviation(): String {
         return stub()
    }
    fun getUtcOffset(): Long {
         return stub()
    }
    fun getWeekNumberingYear(): Int {
         return stub()
    }
    fun getWeekOfYear(): Int {
         return stub()
    }
    fun getYear(): Int {
         return stub()
    }
    fun getYmd(year: Int, month: Int, day: Int): Unit {
         return stub()
    }
    fun isDaylightSavings(): Boolean {
         return stub()
    }
    fun ref(): DateTime {
         return stub()
    }
    fun toLocal(): DateTime {
         return stub()
    }
    fun toTimeval(tv: TimeVal): Boolean {
         return stub()
    }
    fun toTimezone(tz: TimeZone): DateTime {
         return stub()
    }
    fun toUnix(): Long {
         return stub()
    }
    fun toUtc(): DateTime {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun compare(dt1: Any, dt2: Any): Int {
         return stub()
    }
    fun equal(dt1: Any, dt2: Any): Boolean {
         return stub()
    }
    fun hash(datetime: Any): UInt {
         return stub()
    }
    companion object {
        fun cptr(obj: DateTime): CPointer<cnames.structs._GDateTime> = obj.cptr
    }
}

typealias DateWeekday = GDateWeekday

class DebugKey(private val cptr: CPointer<cnames.structs._GDebugKey>) /* struct */ {
    companion object {
        fun cptr(obj: DebugKey): CPointer<cnames.structs._GDebugKey> = obj.cptr
    }
}

typealias DestroyNotify = (data:  Any) -> Unit

class Dir(private val cptr: CPointer<cnames.structs._GDir>) /* struct */ {
    fun close(): Unit {
         return stub()
    }
    fun readName(): String {
         return stub()
    }
    fun rewind(): Unit {
         return stub()
    }
    fun makeTmp(tmpl: String): String {
         return stub()
    }
    companion object {
        fun cptr(obj: Dir): CPointer<cnames.structs._GDir> = obj.cptr
    }
}

class DoubleIEEE754(private val cptr: CPointer<cnames.structs._GDoubleIEEE754>) /* union */ {
    companion object {
        fun cptr(obj: DoubleIEEE754): CPointer<cnames.structs._GDoubleIEEE754> = obj.cptr
    }
}

typealias DuplicateFunc = (data:  Any, user_data:  Any) -> Any

val E: Double get() = TODO()

typealias EqualFunc = (a:  Any, b:  Any) -> Boolean

class Error(private val cptr: CPointer<cnames.structs._GError>) /* struct */ {
    fun newLiteral(domain: UInt, code: Int, message: String): Error {
         return stub()
    }
    fun copy(): Error {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun matches(domain: UInt, code: Int): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: Error): CPointer<cnames.structs._GError> = obj.cptr
    }
}

typealias ErrorType = GErrorType

typealias FileError = GFileError

typealias FileTest = GFileTest

class FloatIEEE754(private val cptr: CPointer<cnames.structs._GFloatIEEE754>) /* union */ {
    companion object {
        fun cptr(obj: FloatIEEE754): CPointer<cnames.structs._GFloatIEEE754> = obj.cptr
    }
}

typealias FormatSizeFlags = GFormatSizeFlags

typealias FreeFunc = (data:  Any) -> Unit

typealias Func = (data:  Any, user_data:  Any) -> Unit

val GINT16_FORMAT: String get() = TODO()

val GINT16_MODIFIER: String get() = TODO()

val GINT32_FORMAT: String get() = TODO()

val GINT32_MODIFIER: String get() = TODO()

val GINT64_FORMAT: String get() = TODO()

val GINT64_MODIFIER: String get() = TODO()

val GINTPTR_FORMAT: String get() = TODO()

val GINTPTR_MODIFIER: String get() = TODO()

val GNUC_FUNCTION: String get() = TODO()

val GNUC_PRETTY_FUNCTION: String get() = TODO()

val GSIZE_FORMAT: String get() = TODO()

val GSIZE_MODIFIER: String get() = TODO()

val GSSIZE_FORMAT: String get() = TODO()

val GSSIZE_MODIFIER: String get() = TODO()

val GUINT16_FORMAT: String get() = TODO()

val GUINT32_FORMAT: String get() = TODO()

val GUINT64_FORMAT: String get() = TODO()

val GUINTPTR_FORMAT: String get() = TODO()

val HAVE_GINT64: Int get() = TODO()

val HAVE_GNUC_VARARGS: Int get() = TODO()

val HAVE_GNUC_VISIBILITY: Int get() = TODO()

val HAVE_GROWING_STACK: Int get() = TODO()

val HAVE_ISO_VARARGS: Int get() = TODO()

typealias HFunc = (key:  Any, value:  Any, user_data:  Any) -> Unit

val HOOK_FLAG_USER_SHIFT: Int get() = TODO()

typealias HRFunc = (key:  Any, value:  Any, user_data:  Any) -> Boolean

typealias HashFunc = (key:  Any) -> UInt

class HashTable(private val cptr: CPointer<cnames.structs._GHashTable>) /* struct */ {
    fun add(hash_table: HashMap<Any, Any>, key: Any): Boolean {
         return stub()
    }
    fun contains(hash_table: HashMap<Any, Any>, key: Any): Boolean {
         return stub()
    }
    fun destroy(hash_table: HashMap<Any, Any>): Unit {
         return stub()
    }
    fun insert(hash_table: HashMap<Any, Any>, key: Any, value: Any): Boolean {
         return stub()
    }
    fun lookup(hash_table: HashMap<Any, Any>, key: Any): Any {
         return stub()
    }
    fun lookupExtended(hash_table: HashMap<Any, Any>, lookup_key: Any, orig_key: Any, value: Any): Boolean {
         return stub()
    }
    fun remove(hash_table: HashMap<Any, Any>, key: Any): Boolean {
         return stub()
    }
    fun removeAll(hash_table: HashMap<Any, Any>): Unit {
         return stub()
    }
    fun replace(hash_table: HashMap<Any, Any>, key: Any, value: Any): Boolean {
         return stub()
    }
    fun size(hash_table: HashMap<Any, Any>): UInt {
         return stub()
    }
    fun steal(hash_table: HashMap<Any, Any>, key: Any): Boolean {
         return stub()
    }
    fun stealAll(hash_table: HashMap<Any, Any>): Unit {
         return stub()
    }
    fun stealExtended(hash_table: HashMap<Any, Any>, lookup_key: Any, stolen_key: Any, stolen_value: Any): Boolean {
         return stub()
    }
    fun unref(hash_table: HashMap<Any, Any>): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: HashTable): CPointer<cnames.structs._GHashTable> = obj.cptr
    }
}

class HashTableIter(private val cptr: CPointer<cnames.structs._GHashTableIter>) /* struct */ {
    fun init(hash_table: HashMap<Any, Any>): Unit {
         return stub()
    }
    fun next(key: Any, value: Any): Boolean {
         return stub()
    }
    fun remove(): Unit {
         return stub()
    }
    fun replace(value: Any): Unit {
         return stub()
    }
    fun steal(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: HashTableIter): CPointer<cnames.structs._GHashTableIter> = obj.cptr
    }
}

class Hmac(private val cptr: CPointer<cnames.structs._GHmac>) /* struct */ {
    fun getDigest(buffer: List<UByte>, digest_len: ULong): Unit {
         return stub()
    }
    fun getString(): String {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun update(data: List<UByte>, length: Long): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Hmac): CPointer<cnames.structs._GHmac> = obj.cptr
    }
}

class Hook(private val cptr: CPointer<cnames.structs._GHook>) /* struct */ {
    fun compareIds(sibling: Hook): Int {
         return stub()
    }
    fun destroy(hook_list: HookList, hook_id: ULong): Boolean {
         return stub()
    }
    fun destroyLink(hook_list: HookList, hook: Hook): Unit {
         return stub()
    }
    fun free(hook_list: HookList, hook: Hook): Unit {
         return stub()
    }
    fun insertBefore(hook_list: HookList, sibling: Hook, hook: Hook): Unit {
         return stub()
    }
    fun prepend(hook_list: HookList, hook: Hook): Unit {
         return stub()
    }
    fun unref(hook_list: HookList, hook: Hook): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Hook): CPointer<cnames.structs._GHook> = obj.cptr
    }
}

typealias HookCheckFunc = (data:  Any) -> Boolean

typealias HookCheckMarshaller = (hook:  Hook, marshal_data:  Any) -> Boolean

typealias HookCompareFunc = (new_hook:  Hook, sibling:  Hook) -> Int

typealias HookFinalizeFunc = (hook_list:  HookList, hook:  Hook) -> Unit

typealias HookFindFunc = (hook:  Hook, data:  Any) -> Boolean

typealias HookFlagMask = GHookFlagMask

typealias HookFunc = (data:  Any) -> Unit

class HookList(private val cptr: CPointer<cnames.structs._GHookList>) /* struct */ {
    fun clear(): Unit {
         return stub()
    }
    fun init(hook_size: UInt): Unit {
         return stub()
    }
    fun invoke(may_recurse: Boolean): Unit {
         return stub()
    }
    fun invokeCheck(may_recurse: Boolean): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: HookList): CPointer<cnames.structs._GHookList> = obj.cptr
    }
}

typealias HookMarshaller = (hook:  Hook, marshal_data:  Any) -> Unit

val IEEE754_DOUBLE_BIAS: Int get() = TODO()

val IEEE754_FLOAT_BIAS: Int get() = TODO()

class IOChannel(private val cptr: CPointer<cnames.structs._GIOChannel>) /* struct */ {
    fun newFile(filename: String, mode: String): IOChannel {
         return stub()
    }
    fun unixNew(fd: Int): IOChannel {
         return stub()
    }
    fun close(): Unit {
         return stub()
    }
    fun flush(): IOStatus {
         return stub()
    }
    fun getBufferCondition(): IOCondition {
         return stub()
    }
    fun getBufferSize(): ULong {
         return stub()
    }
    fun getBuffered(): Boolean {
         return stub()
    }
    fun getCloseOnUnref(): Boolean {
         return stub()
    }
    fun getEncoding(): String {
         return stub()
    }
    fun getFlags(): IOFlags {
         return stub()
    }
    fun getLineTerm(length: Int): String {
         return stub()
    }
    fun init(): Unit {
         return stub()
    }
    fun read(buf: String, count: ULong, bytes_read: ULong): IOError {
         return stub()
    }
    fun readChars(buf: List<UByte>, count: ULong, bytes_read: ULong): IOStatus {
         return stub()
    }
    fun readLine(str_return: String, length: ULong, terminator_pos: ULong): IOStatus {
         return stub()
    }
    fun readLineString(buffer: String, terminator_pos: ULong): IOStatus {
         return stub()
    }
    fun readToEnd(str_return: List<UByte>, length: ULong): IOStatus {
         return stub()
    }
    fun readUnichar(thechar: Char): IOStatus {
         return stub()
    }
    fun ref(): IOChannel {
         return stub()
    }
    fun seek(offset: Long, type: SeekType): IOError {
         return stub()
    }
    fun seekPosition(offset: Long, type: SeekType): IOStatus {
         return stub()
    }
    fun setBufferSize(size: ULong): Unit {
         return stub()
    }
    fun setBuffered(buffered: Boolean): Unit {
         return stub()
    }
    fun setCloseOnUnref(do_close: Boolean): Unit {
         return stub()
    }
    fun setEncoding(encoding: String): IOStatus {
         return stub()
    }
    fun setFlags(flags: IOFlags): IOStatus {
         return stub()
    }
    fun setLineTerm(line_term: String, length: Int): Unit {
         return stub()
    }
    fun shutdown(flush: Boolean): IOStatus {
         return stub()
    }
    fun unixGetFd(): Int {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun write(buf: String, count: ULong, bytes_written: ULong): IOError {
         return stub()
    }
    fun writeChars(buf: List<UByte>, count: Long, bytes_written: ULong): IOStatus {
         return stub()
    }
    fun writeUnichar(thechar: Char): IOStatus {
         return stub()
    }
    fun errorFromErrno(en: Int): IOChannelError {
         return stub()
    }
    fun errorQuark(): UInt {
         return stub()
    }
    companion object {
        fun cptr(obj: IOChannel): CPointer<cnames.structs._GIOChannel> = obj.cptr
    }
}

typealias IOChannelError = GIOChannelError

typealias IOCondition = GIOCondition

typealias IOError = GIOError

typealias IOFlags = GIOFlags

typealias IOFunc = (source:  IOChannel, condition:  IOCondition, data:  Any) -> Boolean

class IOFuncs(private val cptr: CPointer<cnames.structs._GIOFuncs>) /* struct */ {
    companion object {
        fun cptr(obj: IOFuncs): CPointer<cnames.structs._GIOFuncs> = obj.cptr
    }
}

typealias IOStatus = GIOStatus

val KEY_FILE_DESKTOP_GROUP: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_ACTIONS: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_CATEGORIES: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_COMMENT: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_DBUS_ACTIVATABLE: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_EXEC: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_GENERIC_NAME: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_HIDDEN: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_ICON: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_MIME_TYPE: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_NAME: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_NOT_SHOW_IN: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_NO_DISPLAY: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_ONLY_SHOW_IN: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_PATH: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_STARTUP_NOTIFY: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_STARTUP_WM_CLASS: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_TERMINAL: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_TRY_EXEC: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_TYPE: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_URL: String get() = TODO()

val KEY_FILE_DESKTOP_KEY_VERSION: String get() = TODO()

val KEY_FILE_DESKTOP_TYPE_APPLICATION: String get() = TODO()

val KEY_FILE_DESKTOP_TYPE_DIRECTORY: String get() = TODO()

val KEY_FILE_DESKTOP_TYPE_LINK: String get() = TODO()

class KeyFile(private val cptr: CPointer<cnames.structs._GKeyFile>) /* struct */ {
    fun new(): KeyFile {
         return stub()
    }
    fun getBoolean(group_name: String, key: String): Boolean {
         return stub()
    }
    fun getBooleanList(group_name: String, key: String, length: ULong): List<Boolean> {
         return stub()
    }
    fun getComment(group_name: String, key: String): String {
         return stub()
    }
    fun getDouble(group_name: String, key: String): Double {
         return stub()
    }
    fun getDoubleList(group_name: String, key: String, length: ULong): List<Double> {
         return stub()
    }
    fun getGroups(length: ULong): List<String> {
         return stub()
    }
    fun getInt64(group_name: String, key: String): Long {
         return stub()
    }
    fun getInteger(group_name: String, key: String): Int {
         return stub()
    }
    fun getIntegerList(group_name: String, key: String, length: ULong): List<Int> {
         return stub()
    }
    fun getKeys(group_name: String, length: ULong): List<String> {
         return stub()
    }
    fun getLocaleForKey(group_name: String, key: String, locale: String): String {
         return stub()
    }
    fun getLocaleString(group_name: String, key: String, locale: String): String {
         return stub()
    }
    fun getLocaleStringList(group_name: String, key: String, locale: String, length: ULong): List<String> {
         return stub()
    }
    fun getStartGroup(): String {
         return stub()
    }
    fun getString(group_name: String, key: String): String {
         return stub()
    }
    fun getStringList(group_name: String, key: String, length: ULong): List<String> {
         return stub()
    }
    fun getUint64(group_name: String, key: String): ULong {
         return stub()
    }
    fun getValue(group_name: String, key: String): String {
         return stub()
    }
    fun hasGroup(group_name: String): Boolean {
         return stub()
    }
    fun loadFromBytes(bytes: Bytes, flags: KeyFileFlags): Boolean {
         return stub()
    }
    fun loadFromData(data: String, length: ULong, flags: KeyFileFlags): Boolean {
         return stub()
    }
    fun loadFromDataDirs(file: String, full_path: String, flags: KeyFileFlags): Boolean {
         return stub()
    }
    fun loadFromDirs(file: String, search_dirs: List<String>, full_path: String, flags: KeyFileFlags): Boolean {
         return stub()
    }
    fun loadFromFile(file: String, flags: KeyFileFlags): Boolean {
         return stub()
    }
    fun removeComment(group_name: String, key: String): Boolean {
         return stub()
    }
    fun removeGroup(group_name: String): Boolean {
         return stub()
    }
    fun removeKey(group_name: String, key: String): Boolean {
         return stub()
    }
    fun saveToFile(filename: String): Boolean {
         return stub()
    }
    fun setBoolean(group_name: String, key: String, value: Boolean): Unit {
         return stub()
    }
    fun setBooleanList(group_name: String, key: String, list: List<Boolean>, length: ULong): Unit {
         return stub()
    }
    fun setComment(group_name: String, key: String, comment: String): Boolean {
         return stub()
    }
    fun setDouble(group_name: String, key: String, value: Double): Unit {
         return stub()
    }
    fun setDoubleList(group_name: String, key: String, list: List<Double>, length: ULong): Unit {
         return stub()
    }
    fun setInt64(group_name: String, key: String, value: Long): Unit {
         return stub()
    }
    fun setInteger(group_name: String, key: String, value: Int): Unit {
         return stub()
    }
    fun setIntegerList(group_name: String, key: String, list: List<Int>, length: ULong): Unit {
         return stub()
    }
    fun setListSeparator(separator: Byte): Unit {
         return stub()
    }
    fun setLocaleString(group_name: String, key: String, locale: String, string: String): Unit {
         return stub()
    }
    fun setLocaleStringList(group_name: String, key: String, locale: String, list: List<String>, length: ULong): Unit {
         return stub()
    }
    fun setString(group_name: String, key: String, string: String): Unit {
         return stub()
    }
    fun setStringList(group_name: String, key: String, list: List<String>, length: ULong): Unit {
         return stub()
    }
    fun setUint64(group_name: String, key: String, value: ULong): Unit {
         return stub()
    }
    fun setValue(group_name: String, key: String, value: String): Unit {
         return stub()
    }
    fun toData(length: ULong): String {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun errorQuark(): UInt {
         return stub()
    }
    companion object {
        fun cptr(obj: KeyFile): CPointer<cnames.structs._GKeyFile> = obj.cptr
    }
}

typealias KeyFileError = GKeyFileError

typealias KeyFileFlags = GKeyFileFlags

val LITTLE_ENDIAN: Int get() = TODO()

val LN10: Double get() = TODO()

val LN2: Double get() = TODO()

val LOG_2_BASE_10: Double get() = TODO()

val LOG_DOMAIN: Byte get() = TODO()

val LOG_FATAL_MASK: Int get() = TODO()

val LOG_LEVEL_USER_SHIFT: Int get() = TODO()

class LogField(private val cptr: CPointer<cnames.structs._GLogField>) /* struct */ {
    companion object {
        fun cptr(obj: LogField): CPointer<cnames.structs._GLogField> = obj.cptr
    }
}

typealias LogFunc = (log_domain:  String, log_level:  LogLevelFlags, message:  String, user_data:  Any) -> Unit

typealias LogLevelFlags = GLogLevelFlags

typealias LogWriterFunc = (log_level:  LogLevelFlags, fields:  List<LogField>, n_fields:  ULong, user_data:  Any) -> LogWriterOutput

typealias LogWriterOutput = GLogWriterOutput

val MAJOR_VERSION: Int get() = TODO()

val MAXINT16: Short get() = TODO()

val MAXINT32: Int get() = TODO()

val MAXINT64: Long get() = TODO()

val MAXINT8: Byte get() = TODO()

val MAXUINT16: UShort get() = TODO()

val MAXUINT32: UInt get() = TODO()

val MAXUINT64: ULong get() = TODO()

val MAXUINT8: UByte get() = TODO()

val MICRO_VERSION: Int get() = TODO()

val MININT16: Short get() = TODO()

val MININT32: Int get() = TODO()

val MININT64: Long get() = TODO()

val MININT8: Byte get() = TODO()

val MINOR_VERSION: Int get() = TODO()

val MODULE_SUFFIX: String get() = TODO()

class MainContext(private val cptr: CPointer<cnames.structs._GMainContext>) /* struct */ {
    fun new(): MainContext {
         return stub()
    }
    fun acquire(): Boolean {
         return stub()
    }
    fun addPoll(fd: PollFD, priority: Int): Unit {
         return stub()
    }
    fun check(max_priority: Int, fds: List<PollFD>, n_fds: Int): Boolean {
         return stub()
    }
    fun dispatch(): Unit {
         return stub()
    }
    fun findSourceByFuncsUserData(funcs: SourceFuncs, user_data: Any): Source {
         return stub()
    }
    fun findSourceById(source_id: UInt): Source {
         return stub()
    }
    fun findSourceByUserData(user_data: Any): Source {
         return stub()
    }
    fun invokeFull(priority: Int, function: SourceFunc, data: Any, notify: DestroyNotify): Unit {
         return stub()
    }
    fun isOwner(): Boolean {
         return stub()
    }
    fun iteration(may_block: Boolean): Boolean {
         return stub()
    }
    fun pending(): Boolean {
         return stub()
    }
    fun popThreadDefault(): Unit {
         return stub()
    }
    fun prepare(priority: Int): Boolean {
         return stub()
    }
    fun pushThreadDefault(): Unit {
         return stub()
    }
    fun query(max_priority: Int, timeout_: Int, fds: List<PollFD>, n_fds: Int): Int {
         return stub()
    }
    fun ref(): MainContext {
         return stub()
    }
    fun release(): Unit {
         return stub()
    }
    fun removePoll(fd: PollFD): Unit {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun wait(cond: Cond, mutex: Mutex): Boolean {
         return stub()
    }
    fun wakeup(): Unit {
         return stub()
    }
    fun default(): MainContext {
         return stub()
    }
    fun getThreadDefault(): MainContext {
         return stub()
    }
    fun refThreadDefault(): MainContext {
         return stub()
    }
    companion object {
        fun cptr(obj: MainContext): CPointer<cnames.structs._GMainContext> = obj.cptr
    }
}

class MainLoop(private val cptr: CPointer<cnames.structs._GMainLoop>) /* struct */ {
    fun new(context: MainContext, is_running: Boolean): MainLoop {
         return stub()
    }
    fun getContext(): MainContext {
         return stub()
    }
    fun isRunning(): Boolean {
         return stub()
    }
    fun quit(): Unit {
         return stub()
    }
    fun ref(): MainLoop {
         return stub()
    }
    fun run(): Unit {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: MainLoop): CPointer<cnames.structs._GMainLoop> = obj.cptr
    }
}

class MappedFile(private val cptr: CPointer<cnames.structs._GMappedFile>) /* struct */ {
    fun new(filename: String, writable: Boolean): MappedFile {
         return stub()
    }
    fun newFromFd(fd: Int, writable: Boolean): MappedFile {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getBytes(): Bytes {
         return stub()
    }
    fun getContents(): String {
         return stub()
    }
    fun getLength(): ULong {
         return stub()
    }
    fun ref(): MappedFile {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: MappedFile): CPointer<cnames.structs._GMappedFile> = obj.cptr
    }
}

typealias MarkupCollectType = GMarkupCollectType

typealias MarkupError = GMarkupError

class MarkupParseContext(private val cptr: CPointer<cnames.structs._GMarkupParseContext>) /* struct */ {
    fun new(parser: MarkupParser, flags: MarkupParseFlags, user_data: Any, user_data_dnotify: DestroyNotify): MarkupParseContext {
         return stub()
    }
    fun endParse(): Boolean {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getElement(): String {
         return stub()
    }
    fun getPosition(line_number: Int, char_number: Int): Unit {
         return stub()
    }
    fun getUserData(): Any {
         return stub()
    }
    fun parse(text: String, text_len: Long): Boolean {
         return stub()
    }
    fun pop(): Any {
         return stub()
    }
    fun push(parser: MarkupParser, user_data: Any): Unit {
         return stub()
    }
    fun ref(): MarkupParseContext {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: MarkupParseContext): CPointer<cnames.structs._GMarkupParseContext> = obj.cptr
    }
}

typealias MarkupParseFlags = GMarkupParseFlags

class MarkupParser(private val cptr: CPointer<cnames.structs._GMarkupParser>) /* struct */ {
    companion object {
        fun cptr(obj: MarkupParser): CPointer<cnames.structs._GMarkupParser> = obj.cptr
    }
}

class MatchInfo(private val cptr: CPointer<cnames.structs._GMatchInfo>) /* struct */ {
    fun expandReferences(string_to_expand: String): String {
         return stub()
    }
    fun fetch(match_num: Int): String {
         return stub()
    }
    fun fetchAll(): List<String> {
         return stub()
    }
    fun fetchNamed(`name`: String): String {
         return stub()
    }
    fun fetchNamedPos(`name`: String, start_pos: Int, end_pos: Int): Boolean {
         return stub()
    }
    fun fetchPos(match_num: Int, start_pos: Int, end_pos: Int): Boolean {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getMatchCount(): Int {
         return stub()
    }
    fun getRegex(): Regex {
         return stub()
    }
    fun getString(): String {
         return stub()
    }
    fun isPartialMatch(): Boolean {
         return stub()
    }
    fun matches(): Boolean {
         return stub()
    }
    fun next(): Boolean {
         return stub()
    }
    fun ref(): MatchInfo {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: MatchInfo): CPointer<cnames.structs._GMatchInfo> = obj.cptr
    }
}

class MemVTable(private val cptr: CPointer<cnames.structs._GMemVTable>) /* struct */ {
    companion object {
        fun cptr(obj: MemVTable): CPointer<cnames.structs._GMemVTable> = obj.cptr
    }
}

class Mutex(private val cptr: CPointer<cnames.structs._GMutex>) /* union */ {
    fun clear(): Unit {
         return stub()
    }
    fun init(): Unit {
         return stub()
    }
    fun lock(): Unit {
         return stub()
    }
    fun trylock(): Boolean {
         return stub()
    }
    fun unlock(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Mutex): CPointer<cnames.structs._GMutex> = obj.cptr
    }
}

class Node(private val cptr: CPointer<cnames.structs._GNode>) /* struct */ {
    fun childIndex(data: Any): Int {
         return stub()
    }
    fun childPosition(child: Node): Int {
         return stub()
    }
    fun depth(): UInt {
         return stub()
    }
    fun destroy(): Unit {
         return stub()
    }
    fun isAncestor(descendant: Node): Boolean {
         return stub()
    }
    fun maxHeight(): UInt {
         return stub()
    }
    fun nChildren(): UInt {
         return stub()
    }
    fun nNodes(flags: TraverseFlags): UInt {
         return stub()
    }
    fun reverseChildren(): Unit {
         return stub()
    }
    fun unlink(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Node): CPointer<cnames.structs._GNode> = obj.cptr
    }
}

typealias NodeForeachFunc = (node:  Node, data:  Any) -> Unit

typealias NodeTraverseFunc = (node:  Node, data:  Any) -> Boolean

typealias NormalizeMode = GNormalizeMode

typealias NumberParserError = GNumberParserError

val OPTION_REMAINING: String get() = TODO()

class Once(private val cptr: CPointer<cnames.structs._GOnce>) /* struct */ {
    fun initEnter(location: Any): Boolean {
         return stub()
    }
    fun initLeave(location: Any, result: ULong): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Once): CPointer<cnames.structs._GOnce> = obj.cptr
    }
}

typealias OnceStatus = GOnceStatus

typealias OptionArg = GOptionArg

typealias OptionArgFunc = (option_name:  String, value:  String, data:  Any) -> Boolean

class OptionContext(private val cptr: CPointer<cnames.structs._GOptionContext>) /* struct */ {
    fun addGroup(group: OptionGroup): Unit {
         return stub()
    }
    fun addMainEntries(entries: List<OptionEntry>, translation_domain: String): Unit {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getDescription(): String {
         return stub()
    }
    fun getHelp(main_help: Boolean, group: OptionGroup): String {
         return stub()
    }
    fun getHelpEnabled(): Boolean {
         return stub()
    }
    fun getIgnoreUnknownOptions(): Boolean {
         return stub()
    }
    fun getMainGroup(): OptionGroup {
         return stub()
    }
    fun getStrictPosix(): Boolean {
         return stub()
    }
    fun getSummary(): String {
         return stub()
    }
    fun parse(argc: Int, argv: List<String>): Boolean {
         return stub()
    }
    fun parseStrv(arguments: List<String>): Boolean {
         return stub()
    }
    fun setDescription(description: String): Unit {
         return stub()
    }
    fun setHelpEnabled(help_enabled: Boolean): Unit {
         return stub()
    }
    fun setIgnoreUnknownOptions(ignore_unknown: Boolean): Unit {
         return stub()
    }
    fun setMainGroup(group: OptionGroup): Unit {
         return stub()
    }
    fun setStrictPosix(strict_posix: Boolean): Unit {
         return stub()
    }
    fun setSummary(summary: String): Unit {
         return stub()
    }
    fun setTranslateFunc(func: TranslateFunc, data: Any, destroy_notify: DestroyNotify): Unit {
         return stub()
    }
    fun setTranslationDomain(domain: String): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: OptionContext): CPointer<cnames.structs._GOptionContext> = obj.cptr
    }
}

class OptionEntry(private val cptr: CPointer<cnames.structs._GOptionEntry>) /* struct */ {
    companion object {
        fun cptr(obj: OptionEntry): CPointer<cnames.structs._GOptionEntry> = obj.cptr
    }
}

typealias OptionError = GOptionError

typealias OptionErrorFunc = (context:  OptionContext, group:  OptionGroup, data:  Any) -> Unit

typealias OptionFlags = GOptionFlags

class OptionGroup(private val cptr: CPointer<cnames.structs._GOptionGroup>) /* struct */ {
    fun new(`name`: String, description: String, help_description: String, user_data: Any, destroy: DestroyNotify): OptionGroup {
         return stub()
    }
    fun addEntries(entries: List<OptionEntry>): Unit {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun ref(): OptionGroup {
         return stub()
    }
    fun setTranslateFunc(func: TranslateFunc, data: Any, destroy_notify: DestroyNotify): Unit {
         return stub()
    }
    fun setTranslationDomain(domain: String): Unit {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: OptionGroup): CPointer<cnames.structs._GOptionGroup> = obj.cptr
    }
}

typealias OptionParseFunc = (context:  OptionContext, group:  OptionGroup, data:  Any) -> Boolean

val PDP_ENDIAN: Int get() = TODO()

val PI: Double get() = TODO()

val PID_FORMAT: String get() = TODO()

val PI_2: Double get() = TODO()

val PI_4: Double get() = TODO()

val POLLFD_FORMAT: String get() = TODO()

val PRIORITY_DEFAULT: Int get() = TODO()

val PRIORITY_DEFAULT_IDLE: Int get() = TODO()

val PRIORITY_HIGH: Int get() = TODO()

val PRIORITY_HIGH_IDLE: Int get() = TODO()

val PRIORITY_LOW: Int get() = TODO()

class PatternSpec(private val cptr: CPointer<cnames.structs._GPatternSpec>) /* struct */ {
    fun equal(pspec2: PatternSpec): Boolean {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: PatternSpec): CPointer<cnames.structs._GPatternSpec> = obj.cptr
    }
}

class PollFD(private val cptr: CPointer<cnames.structs._GPollFD>) /* struct */ {
    companion object {
        fun cptr(obj: PollFD): CPointer<cnames.structs._GPollFD> = obj.cptr
    }
}

typealias PollFunc = (ufds:  PollFD, nfsd:  UInt, timeout_:  Int) -> Int

typealias PrintFunc = (string:  String) -> Unit

class PtrArray(private val cptr: CPointer<cnames.structs._GPtrArray>) /* struct */ {
    companion object {
        fun cptr(obj: PtrArray): CPointer<cnames.structs._GPtrArray> = obj.cptr
    }
}

class Queue(private val cptr: CPointer<cnames.structs._GQueue>) /* struct */ {
    fun clear(): Unit {
         return stub()
    }
    fun clearFull(free_func: DestroyNotify): Unit {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun freeFull(free_func: DestroyNotify): Unit {
         return stub()
    }
    fun getLength(): UInt {
         return stub()
    }
    fun index(data: Any): Int {
         return stub()
    }
    fun init(): Unit {
         return stub()
    }
    fun isEmpty(): Boolean {
         return stub()
    }
    fun peekHead(): Any {
         return stub()
    }
    fun peekNth(n: UInt): Any {
         return stub()
    }
    fun peekTail(): Any {
         return stub()
    }
    fun popHead(): Any {
         return stub()
    }
    fun popNth(n: UInt): Any {
         return stub()
    }
    fun popTail(): Any {
         return stub()
    }
    fun pushHead(data: Any): Unit {
         return stub()
    }
    fun pushNth(data: Any, n: Int): Unit {
         return stub()
    }
    fun pushTail(data: Any): Unit {
         return stub()
    }
    fun remove(data: Any): Boolean {
         return stub()
    }
    fun removeAll(data: Any): UInt {
         return stub()
    }
    fun reverse(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Queue): CPointer<cnames.structs._GQueue> = obj.cptr
    }
}

class RWLock(private val cptr: CPointer<cnames.structs._GRWLock>) /* struct */ {
    fun clear(): Unit {
         return stub()
    }
    fun init(): Unit {
         return stub()
    }
    fun readerLock(): Unit {
         return stub()
    }
    fun readerTrylock(): Boolean {
         return stub()
    }
    fun readerUnlock(): Unit {
         return stub()
    }
    fun writerLock(): Unit {
         return stub()
    }
    fun writerTrylock(): Boolean {
         return stub()
    }
    fun writerUnlock(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: RWLock): CPointer<cnames.structs._GRWLock> = obj.cptr
    }
}

class Rand(private val cptr: CPointer<cnames.structs._GRand>) /* struct */ {
    fun double(): Double {
         return stub()
    }
    fun doubleRange(begin: Double, end: Double): Double {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun int(): UInt {
         return stub()
    }
    fun intRange(begin: Int, end: Int): Int {
         return stub()
    }
    fun setSeed(seed: UInt): Unit {
         return stub()
    }
    fun setSeedArray(seed: UInt, seed_length: UInt): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Rand): CPointer<cnames.structs._GRand> = obj.cptr
    }
}

class RecMutex(private val cptr: CPointer<cnames.structs._GRecMutex>) /* struct */ {
    fun clear(): Unit {
         return stub()
    }
    fun init(): Unit {
         return stub()
    }
    fun lock(): Unit {
         return stub()
    }
    fun trylock(): Boolean {
         return stub()
    }
    fun unlock(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: RecMutex): CPointer<cnames.structs._GRecMutex> = obj.cptr
    }
}

class Regex(private val cptr: CPointer<cnames.structs._GRegex>) /* struct */ {
    fun new(pattern: String, compile_options: RegexCompileFlags, match_options: RegexMatchFlags): Regex {
         return stub()
    }
    fun getCaptureCount(): Int {
         return stub()
    }
    fun getCompileFlags(): RegexCompileFlags {
         return stub()
    }
    fun getHasCrOrLf(): Boolean {
         return stub()
    }
    fun getMatchFlags(): RegexMatchFlags {
         return stub()
    }
    fun getMaxBackref(): Int {
         return stub()
    }
    fun getMaxLookbehind(): Int {
         return stub()
    }
    fun getPattern(): String {
         return stub()
    }
    fun getStringNumber(`name`: String): Int {
         return stub()
    }
    fun match(string: String, match_options: RegexMatchFlags, match_info: MatchInfo): Boolean {
         return stub()
    }
    fun matchAll(string: String, match_options: RegexMatchFlags, match_info: MatchInfo): Boolean {
         return stub()
    }
    fun matchAllFull(string: List<String>, string_len: Long, start_position: Int, match_options: RegexMatchFlags, match_info: MatchInfo): Boolean {
         return stub()
    }
    fun matchFull(string: List<String>, string_len: Long, start_position: Int, match_options: RegexMatchFlags, match_info: MatchInfo): Boolean {
         return stub()
    }
    fun ref(): Regex {
         return stub()
    }
    fun replace(string: List<String>, string_len: Long, start_position: Int, replacement: String, match_options: RegexMatchFlags): String {
         return stub()
    }
    fun replaceLiteral(string: List<String>, string_len: Long, start_position: Int, replacement: String, match_options: RegexMatchFlags): String {
         return stub()
    }
    fun split(string: String, match_options: RegexMatchFlags): List<String> {
         return stub()
    }
    fun splitFull(string: List<String>, string_len: Long, start_position: Int, match_options: RegexMatchFlags, max_tokens: Int): List<String> {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun checkReplacement(replacement: String, has_references: Boolean): Boolean {
         return stub()
    }
    fun errorQuark(): UInt {
         return stub()
    }
    fun escapeNul(string: String, length: Int): String {
         return stub()
    }
    fun escapeString(string: List<String>, length: Int): String {
         return stub()
    }
    fun matchSimple(pattern: String, string: String, compile_options: RegexCompileFlags, match_options: RegexMatchFlags): Boolean {
         return stub()
    }
    fun splitSimple(pattern: String, string: String, compile_options: RegexCompileFlags, match_options: RegexMatchFlags): List<String> {
         return stub()
    }
    companion object {
        fun cptr(obj: Regex): CPointer<cnames.structs._GRegex> = obj.cptr
    }
}

typealias RegexCompileFlags = GRegexCompileFlags

typealias RegexError = GRegexError

typealias RegexEvalCallback = (match_info:  MatchInfo, result:  String, user_data:  Any) -> Boolean

typealias RegexMatchFlags = GRegexMatchFlags

val SEARCHPATH_SEPARATOR: Int get() = TODO()

val SEARCHPATH_SEPARATOR_S: String get() = TODO()

val SIZEOF_LONG: Int get() = TODO()

val SIZEOF_SIZE_T: Int get() = TODO()

val SIZEOF_SSIZE_T: Int get() = TODO()

val SIZEOF_VOID_P: Int get() = TODO()

class SList(private val cptr: CPointer<cnames.structs._GSList>) /* struct */ {
    companion object {
        fun cptr(obj: SList): CPointer<cnames.structs._GSList> = obj.cptr
    }
}

val SOURCE_CONTINUE: Boolean get() = TODO()

val SOURCE_REMOVE: Boolean get() = TODO()

val SQRT2: Double get() = TODO()

val STR_DELIMITERS: String get() = TODO()

val SYSDEF_AF_INET: Int get() = TODO()

val SYSDEF_AF_INET6: Int get() = TODO()

val SYSDEF_AF_UNIX: Int get() = TODO()

val SYSDEF_MSG_DONTROUTE: Int get() = TODO()

val SYSDEF_MSG_OOB: Int get() = TODO()

val SYSDEF_MSG_PEEK: Int get() = TODO()

class Scanner(private val cptr: CPointer<cnames.structs._GScanner>) /* struct */ {
    fun curLine(): UInt {
         return stub()
    }
    fun curPosition(): UInt {
         return stub()
    }
    fun curToken(): TokenType {
         return stub()
    }
    fun destroy(): Unit {
         return stub()
    }
    fun eof(): Boolean {
         return stub()
    }
    fun getNextToken(): TokenType {
         return stub()
    }
    fun inputFile(input_fd: Int): Unit {
         return stub()
    }
    fun inputText(text: String, text_len: UInt): Unit {
         return stub()
    }
    fun lookupSymbol(symbol: String): Any {
         return stub()
    }
    fun peekNextToken(): TokenType {
         return stub()
    }
    fun scopeAddSymbol(scope_id: UInt, symbol: String, value: Any): Unit {
         return stub()
    }
    fun scopeLookupSymbol(scope_id: UInt, symbol: String): Any {
         return stub()
    }
    fun scopeRemoveSymbol(scope_id: UInt, symbol: String): Unit {
         return stub()
    }
    fun setScope(scope_id: UInt): UInt {
         return stub()
    }
    fun syncFileOffset(): Unit {
         return stub()
    }
    fun unexpToken(expected_token: TokenType, identifier_spec: String, symbol_spec: String, symbol_name: String, message: String, is_error: Int): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Scanner): CPointer<cnames.structs._GScanner> = obj.cptr
    }
}

class ScannerConfig(private val cptr: CPointer<cnames.structs._GScannerConfig>) /* struct */ {
    companion object {
        fun cptr(obj: ScannerConfig): CPointer<cnames.structs._GScannerConfig> = obj.cptr
    }
}

typealias ScannerMsgFunc = (scanner:  Scanner, message:  String, error:  Boolean) -> Unit

typealias SeekType = GSeekType

class Sequence(private val cptr: CPointer<cnames.structs._GSequence>) /* struct */ {
    fun append(data: Any): SequenceIter {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getBeginIter(): SequenceIter {
         return stub()
    }
    fun getEndIter(): SequenceIter {
         return stub()
    }
    fun getIterAtPos(pos: Int): SequenceIter {
         return stub()
    }
    fun getLength(): Int {
         return stub()
    }
    fun isEmpty(): Boolean {
         return stub()
    }
    fun prepend(data: Any): SequenceIter {
         return stub()
    }
    fun get(iter: SequenceIter): Any {
         return stub()
    }
    fun insertBefore(iter: SequenceIter, data: Any): SequenceIter {
         return stub()
    }
    fun move(src: SequenceIter, dest: SequenceIter): Unit {
         return stub()
    }
    fun moveRange(dest: SequenceIter, begin: SequenceIter, end: SequenceIter): Unit {
         return stub()
    }
    fun rangeGetMidpoint(begin: SequenceIter, end: SequenceIter): SequenceIter {
         return stub()
    }
    fun remove(iter: SequenceIter): Unit {
         return stub()
    }
    fun removeRange(begin: SequenceIter, end: SequenceIter): Unit {
         return stub()
    }
    fun set(iter: SequenceIter, data: Any): Unit {
         return stub()
    }
    fun swap(a: SequenceIter, b: SequenceIter): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Sequence): CPointer<cnames.structs._GSequence> = obj.cptr
    }
}

class SequenceIter(private val cptr: CPointer<cnames.structs._GSequenceIter>) /* struct */ {
    fun compare(b: SequenceIter): Int {
         return stub()
    }
    fun getPosition(): Int {
         return stub()
    }
    fun getSequence(): Sequence {
         return stub()
    }
    fun isBegin(): Boolean {
         return stub()
    }
    fun isEnd(): Boolean {
         return stub()
    }
    fun move(delta: Int): SequenceIter {
         return stub()
    }
    fun next(): SequenceIter {
         return stub()
    }
    fun prev(): SequenceIter {
         return stub()
    }
    companion object {
        fun cptr(obj: SequenceIter): CPointer<cnames.structs._GSequenceIter> = obj.cptr
    }
}

typealias SequenceIterCompareFunc = (a:  SequenceIter, b:  SequenceIter, data:  Any) -> Int

typealias ShellError = GShellError

typealias SliceConfig = GSliceConfig

class Source(private val cptr: CPointer<cnames.structs._GSource>) /* struct */ {
    fun new(source_funcs: SourceFuncs, struct_size: UInt): Source {
         return stub()
    }
    fun addChildSource(child_source: Source): Unit {
         return stub()
    }
    fun addPoll(fd: PollFD): Unit {
         return stub()
    }
    fun addUnixFd(fd: Int, events: IOCondition): Any {
         return stub()
    }
    fun attach(context: MainContext): UInt {
         return stub()
    }
    fun destroy(): Unit {
         return stub()
    }
    fun getCanRecurse(): Boolean {
         return stub()
    }
    fun getContext(): MainContext {
         return stub()
    }
    fun getCurrentTime(timeval: TimeVal): Unit {
         return stub()
    }
    fun getId(): UInt {
         return stub()
    }
    fun getName(): String {
         return stub()
    }
    fun getPriority(): Int {
         return stub()
    }
    fun getReadyTime(): Long {
         return stub()
    }
    fun getTime(): Long {
         return stub()
    }
    fun isDestroyed(): Boolean {
         return stub()
    }
    fun modifyUnixFd(tag: Any, new_events: IOCondition): Unit {
         return stub()
    }
    fun queryUnixFd(tag: Any): IOCondition {
         return stub()
    }
    fun ref(): Source {
         return stub()
    }
    fun removeChildSource(child_source: Source): Unit {
         return stub()
    }
    fun removePoll(fd: PollFD): Unit {
         return stub()
    }
    fun removeUnixFd(tag: Any): Unit {
         return stub()
    }
    fun setCallback(func: SourceFunc, data: Any, notify: DestroyNotify): Unit {
         return stub()
    }
    fun setCallbackIndirect(callback_data: Any, callback_funcs: SourceCallbackFuncs): Unit {
         return stub()
    }
    fun setCanRecurse(can_recurse: Boolean): Unit {
         return stub()
    }
    fun setFuncs(funcs: SourceFuncs): Unit {
         return stub()
    }
    fun setName(`name`: String): Unit {
         return stub()
    }
    fun setPriority(priority: Int): Unit {
         return stub()
    }
    fun setReadyTime(ready_time: Long): Unit {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun remove(tag: UInt): Boolean {
         return stub()
    }
    fun removeByFuncsUserData(funcs: SourceFuncs, user_data: Any): Boolean {
         return stub()
    }
    fun removeByUserData(user_data: Any): Boolean {
         return stub()
    }
    fun setNameById(tag: UInt, `name`: String): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Source): CPointer<cnames.structs._GSource> = obj.cptr
    }
}

class SourceCallbackFuncs(private val cptr: CPointer<cnames.structs._GSourceCallbackFuncs>) /* struct */ {
    companion object {
        fun cptr(obj: SourceCallbackFuncs): CPointer<cnames.structs._GSourceCallbackFuncs> = obj.cptr
    }
}

typealias SourceDisposeFunc = (source:  Source) -> Unit

typealias SourceDummyMarshal = () -> Unit

typealias SourceFunc = (user_data:  Any) -> Boolean

class SourceFuncs(private val cptr: CPointer<cnames.structs._GSourceFuncs>) /* struct */ {
    companion object {
        fun cptr(obj: SourceFuncs): CPointer<cnames.structs._GSourceFuncs> = obj.cptr
    }
}

typealias SpawnChildSetupFunc = (user_data:  Any) -> Unit

typealias SpawnError = GSpawnError

typealias SpawnFlags = GSpawnFlags

class String(private val cptr: CPointer<cnames.structs._GString>) /* struct */ {
    fun append(`val`: String): String {
         return stub()
    }
    fun appendC(c: Byte): String {
         return stub()
    }
    fun appendLen(`val`: String, len: Long): String {
         return stub()
    }
    fun appendUnichar(wc: Char): String {
         return stub()
    }
    fun appendUriEscaped(unescaped: String, reserved_chars_allowed: String, allow_utf8: Boolean): String {
         return stub()
    }
    fun asciiDown(): String {
         return stub()
    }
    fun asciiUp(): String {
         return stub()
    }
    fun assign(rval: String): String {
         return stub()
    }
    fun down(): String {
         return stub()
    }
    fun equal(v2: String): Boolean {
         return stub()
    }
    fun erase(pos: Long, len: Long): String {
         return stub()
    }
    fun free(free_segment: Boolean): String {
         return stub()
    }
    fun freeToBytes(): Bytes {
         return stub()
    }
    fun hash(): UInt {
         return stub()
    }
    fun insert(pos: Long, `val`: String): String {
         return stub()
    }
    fun insertC(pos: Long, c: Byte): String {
         return stub()
    }
    fun insertLen(pos: Long, `val`: String, len: Long): String {
         return stub()
    }
    fun insertUnichar(pos: Long, wc: Char): String {
         return stub()
    }
    fun overwrite(pos: ULong, `val`: String): String {
         return stub()
    }
    fun overwriteLen(pos: ULong, `val`: String, len: Long): String {
         return stub()
    }
    fun prepend(`val`: String): String {
         return stub()
    }
    fun prependC(c: Byte): String {
         return stub()
    }
    fun prependLen(`val`: String, len: Long): String {
         return stub()
    }
    fun prependUnichar(wc: Char): String {
         return stub()
    }
    fun setSize(len: ULong): String {
         return stub()
    }
    fun truncate(len: ULong): String {
         return stub()
    }
    fun up(): String {
         return stub()
    }
    companion object {
        fun cptr(obj: String): CPointer<cnames.structs._GString> = obj.cptr
    }
}

class StringChunk(private val cptr: CPointer<cnames.structs._GStringChunk>) /* struct */ {
    fun clear(): Unit {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun insert(string: String): String {
         return stub()
    }
    fun insertConst(string: String): String {
         return stub()
    }
    fun insertLen(string: String, len: Long): String {
         return stub()
    }
    companion object {
        fun cptr(obj: StringChunk): CPointer<cnames.structs._GStringChunk> = obj.cptr
    }
}

val TEST_OPTION_ISOLATE_DIRS: String get() = TODO()

val TIME_SPAN_DAY: Long get() = TODO()

val TIME_SPAN_HOUR: Long get() = TODO()

val TIME_SPAN_MILLISECOND: Long get() = TODO()

val TIME_SPAN_MINUTE: Long get() = TODO()

val TIME_SPAN_SECOND: Long get() = TODO()

class TestCase(private val cptr: CPointer<cnames.structs._GTestCase>) /* struct */ {
    companion object {
        fun cptr(obj: TestCase): CPointer<cnames.structs._GTestCase> = obj.cptr
    }
}

class TestConfig(private val cptr: CPointer<cnames.structs._GTestConfig>) /* struct */ {
    companion object {
        fun cptr(obj: TestConfig): CPointer<cnames.structs._GTestConfig> = obj.cptr
    }
}

typealias TestDataFunc = (user_data:  Any) -> Unit

typealias TestFileType = GTestFileType

typealias TestFixtureFunc = (fixture:  Any, user_data:  Any) -> Unit

typealias TestFunc = () -> Unit

class TestLogBuffer(private val cptr: CPointer<cnames.structs._GTestLogBuffer>) /* struct */ {
    fun free(): Unit {
         return stub()
    }
    fun push(n_bytes: UInt, bytes: UByte): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: TestLogBuffer): CPointer<cnames.structs._GTestLogBuffer> = obj.cptr
    }
}

typealias TestLogFatalFunc = (log_domain:  String, log_level:  LogLevelFlags, message:  String, user_data:  Any) -> Boolean

class TestLogMsg(private val cptr: CPointer<cnames.structs._GTestLogMsg>) /* struct */ {
    fun free(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: TestLogMsg): CPointer<cnames.structs._GTestLogMsg> = obj.cptr
    }
}

typealias TestLogType = GTestLogType

typealias TestResult = GTestResult

typealias TestSubprocessFlags = GTestSubprocessFlags

class TestSuite(private val cptr: CPointer<cnames.structs._GTestSuite>) /* struct */ {
    fun add(test_case: TestCase): Unit {
         return stub()
    }
    fun addSuite(nestedsuite: TestSuite): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: TestSuite): CPointer<cnames.structs._GTestSuite> = obj.cptr
    }
}

typealias TestTrapFlags = GTestTrapFlags

class Thread(private val cptr: CPointer<cnames.structs._GThread>) /* struct */ {
    fun join(): Any {
         return stub()
    }
    fun ref(): Thread {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun errorQuark(): UInt {
         return stub()
    }
    fun exit(retval: Any): Unit {
         return stub()
    }
    fun self(): Thread {
         return stub()
    }
    fun yield(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Thread): CPointer<cnames.structs._GThread> = obj.cptr
    }
}

typealias ThreadError = GThreadError

typealias ThreadFunc = (data:  Any) -> Any

class ThreadPool(private val cptr: CPointer<cnames.structs._GThreadPool>) /* struct */ {
    fun free(immediate: Boolean, wait_: Boolean): Unit {
         return stub()
    }
    fun getMaxThreads(): Int {
         return stub()
    }
    fun getNumThreads(): UInt {
         return stub()
    }
    fun moveToFront(data: Any): Boolean {
         return stub()
    }
    fun push(data: Any): Boolean {
         return stub()
    }
    fun setMaxThreads(max_threads: Int): Boolean {
         return stub()
    }
    fun unprocessed(): UInt {
         return stub()
    }
    fun getMaxIdleTime(): UInt {
         return stub()
    }
    fun getMaxUnusedThreads(): Int {
         return stub()
    }
    fun getNumUnusedThreads(): UInt {
         return stub()
    }
    fun setMaxIdleTime(interval: UInt): Unit {
         return stub()
    }
    fun setMaxUnusedThreads(max_threads: Int): Unit {
         return stub()
    }
    fun stopUnusedThreads(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: ThreadPool): CPointer<cnames.structs._GThreadPool> = obj.cptr
    }
}

typealias TimeType = GTimeType

class TimeVal(private val cptr: CPointer<cnames.structs._GTimeVal>) /* struct */ {
    fun add(microseconds: Long): Unit {
         return stub()
    }
    fun toIso8601(): String {
         return stub()
    }
    fun fromIso8601(iso_date: String, time_: TimeVal): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: TimeVal): CPointer<cnames.structs._GTimeVal> = obj.cptr
    }
}

class TimeZone(private val cptr: CPointer<cnames.structs._GTimeZone>) /* struct */ {
    fun new(identifier: String): TimeZone {
         return stub()
    }
    fun newLocal(): TimeZone {
         return stub()
    }
    fun newOffset(seconds: Int): TimeZone {
         return stub()
    }
    fun newUtc(): TimeZone {
         return stub()
    }
    fun adjustTime(type: TimeType, time_: Long): Int {
         return stub()
    }
    fun findInterval(type: TimeType, time_: Long): Int {
         return stub()
    }
    fun getAbbreviation(interval: Int): String {
         return stub()
    }
    fun getIdentifier(): String {
         return stub()
    }
    fun getOffset(interval: Int): Int {
         return stub()
    }
    fun isDst(interval: Int): Boolean {
         return stub()
    }
    fun ref(): TimeZone {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: TimeZone): CPointer<cnames.structs._GTimeZone> = obj.cptr
    }
}

class Timer(private val cptr: CPointer<cnames.structs._GTimer>) /* struct */ {
    fun `continue`(): Unit {
         return stub()
    }
    fun destroy(): Unit {
         return stub()
    }
    fun elapsed(microseconds: ULong): Double {
         return stub()
    }
    fun isActive(): Boolean {
         return stub()
    }
    fun reset(): Unit {
         return stub()
    }
    fun start(): Unit {
         return stub()
    }
    fun stop(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Timer): CPointer<cnames.structs._GTimer> = obj.cptr
    }
}

typealias TokenType = GTokenType

class TokenValue(private val cptr: CPointer<cnames.structs._GTokenValue>) /* union */ {
    companion object {
        fun cptr(obj: TokenValue): CPointer<cnames.structs._GTokenValue> = obj.cptr
    }
}

typealias TranslateFunc = (str:  String, data:  Any) -> String

class TrashStack(private val cptr: CPointer<cnames.structs._GTrashStack>) /* struct */ {
    fun height(stack_p: TrashStack): UInt {
         return stub()
    }
    fun peek(stack_p: TrashStack): Any {
         return stub()
    }
    fun pop(stack_p: TrashStack): Any {
         return stub()
    }
    fun push(stack_p: TrashStack, data_p: Any): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: TrashStack): CPointer<cnames.structs._GTrashStack> = obj.cptr
    }
}

typealias TraverseFlags = GTraverseFlags

typealias TraverseFunc = (key:  Any, value:  Any, data:  Any) -> Boolean

typealias TraverseType = GTraverseType

class Tree(private val cptr: CPointer<cnames.structs._GTree>) /* struct */ {
    fun destroy(): Unit {
         return stub()
    }
    fun height(): Int {
         return stub()
    }
    fun insert(key: Any, value: Any): Unit {
         return stub()
    }
    fun lookup(key: Any): Any {
         return stub()
    }
    fun lookupExtended(lookup_key: Any, orig_key: Any, value: Any): Boolean {
         return stub()
    }
    fun nnodes(): Int {
         return stub()
    }
    fun remove(key: Any): Boolean {
         return stub()
    }
    fun replace(key: Any, value: Any): Unit {
         return stub()
    }
    fun steal(key: Any): Boolean {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: Tree): CPointer<cnames.structs._GTree> = obj.cptr
    }
}

val UNICHAR_MAX_DECOMPOSITION_LENGTH: Int get() = TODO()

val URI_RESERVED_CHARS_GENERIC_DELIMITERS: String get() = TODO()

val URI_RESERVED_CHARS_SUBCOMPONENT_DELIMITERS: String get() = TODO()

val USEC_PER_SEC: Int get() = TODO()

typealias UnicodeBreakType = GUnicodeBreakType

typealias UnicodeScript = GUnicodeScript

typealias UnicodeType = GUnicodeType

typealias UnixFDSourceFunc = (fd:  Int, condition:  IOCondition, user_data:  Any) -> Boolean

typealias UserDirectory = GUserDirectory

val VA_COPY_AS_ARRAY: Int get() = TODO()

val VERSION_MIN_REQUIRED: Int get() = TODO()

class Variant(private val cptr: CPointer<cnames.structs._GVariant>) /* struct */ {
    fun newArray(child_type: VariantType, children: List<Variant>, n_children: ULong): Variant {
         return stub()
    }
    fun newBoolean(value: Boolean): Variant {
         return stub()
    }
    fun newByte(value: UByte): Variant {
         return stub()
    }
    fun newBytestring(string: List<UByte>): Variant {
         return stub()
    }
    fun newBytestringArray(strv: List<String>, length: Long): Variant {
         return stub()
    }
    fun newDictEntry(key: Variant, value: Variant): Variant {
         return stub()
    }
    fun newDouble(value: Double): Variant {
         return stub()
    }
    fun newFixedArray(element_type: VariantType, elements: Any, n_elements: ULong, element_size: ULong): Variant {
         return stub()
    }
    fun newFromBytes(type: VariantType, bytes: Bytes, trusted: Boolean): Variant {
         return stub()
    }
    fun newFromData(type: VariantType, data: List<UByte>, size: ULong, trusted: Boolean, notify: DestroyNotify, user_data: Any): Variant {
         return stub()
    }
    fun newHandle(value: Int): Variant {
         return stub()
    }
    fun newInt16(value: Short): Variant {
         return stub()
    }
    fun newInt32(value: Int): Variant {
         return stub()
    }
    fun newInt64(value: Long): Variant {
         return stub()
    }
    fun newMaybe(child_type: VariantType, child: Variant): Variant {
         return stub()
    }
    fun newObjectPath(object_path: String): Variant {
         return stub()
    }
    fun newObjv(strv: List<String>, length: Long): Variant {
         return stub()
    }
    fun newSignature(signature: String): Variant {
         return stub()
    }
    fun newString(string: String): Variant {
         return stub()
    }
    fun newStrv(strv: List<String>, length: Long): Variant {
         return stub()
    }
    fun newTuple(children: List<Variant>, n_children: ULong): Variant {
         return stub()
    }
    fun newUint16(value: UShort): Variant {
         return stub()
    }
    fun newUint32(value: UInt): Variant {
         return stub()
    }
    fun newUint64(value: ULong): Variant {
         return stub()
    }
    fun newVariant(value: Variant): Variant {
         return stub()
    }
    fun byteswap(): Variant {
         return stub()
    }
    fun checkFormatString(format_string: String, copy_only: Boolean): Boolean {
         return stub()
    }
    fun classify(): VariantClass {
         return stub()
    }
    fun compare(two: Variant): Int {
         return stub()
    }
    fun dupBytestring(length: ULong): List<UByte> {
         return stub()
    }
    fun dupBytestringArray(length: ULong): List<String> {
         return stub()
    }
    fun dupObjv(length: ULong): List<String> {
         return stub()
    }
    fun dupString(length: ULong): String {
         return stub()
    }
    fun dupStrv(length: ULong): List<String> {
         return stub()
    }
    fun equal(two: Variant): Boolean {
         return stub()
    }
    fun getBoolean(): Boolean {
         return stub()
    }
    fun getByte(): UByte {
         return stub()
    }
    fun getBytestring(): List<UByte> {
         return stub()
    }
    fun getBytestringArray(length: ULong): List<String> {
         return stub()
    }
    fun getChildValue(index_: ULong): Variant {
         return stub()
    }
    fun getData(): Any {
         return stub()
    }
    fun getDataAsBytes(): Bytes {
         return stub()
    }
    fun getDouble(): Double {
         return stub()
    }
    fun getHandle(): Int {
         return stub()
    }
    fun getInt16(): Short {
         return stub()
    }
    fun getInt32(): Int {
         return stub()
    }
    fun getInt64(): Long {
         return stub()
    }
    fun getMaybe(): Variant {
         return stub()
    }
    fun getNormalForm(): Variant {
         return stub()
    }
    fun getObjv(length: ULong): List<String> {
         return stub()
    }
    fun getSize(): ULong {
         return stub()
    }
    fun getString(length: ULong): String {
         return stub()
    }
    fun getStrv(length: ULong): List<String> {
         return stub()
    }
    fun getType(): VariantType {
         return stub()
    }
    fun getTypeString(): String {
         return stub()
    }
    fun getUint16(): UShort {
         return stub()
    }
    fun getUint32(): UInt {
         return stub()
    }
    fun getUint64(): ULong {
         return stub()
    }
    fun getVariant(): Variant {
         return stub()
    }
    fun hash(): UInt {
         return stub()
    }
    fun isContainer(): Boolean {
         return stub()
    }
    fun isFloating(): Boolean {
         return stub()
    }
    fun isNormalForm(): Boolean {
         return stub()
    }
    fun isOfType(type: VariantType): Boolean {
         return stub()
    }
    fun lookupValue(key: String, expected_type: VariantType): Variant {
         return stub()
    }
    fun nChildren(): ULong {
         return stub()
    }
    fun print(type_annotate: Boolean): String {
         return stub()
    }
    fun ref(): Variant {
         return stub()
    }
    fun refSink(): Variant {
         return stub()
    }
    fun store(data: Any): Unit {
         return stub()
    }
    fun takeRef(): Variant {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    fun isObjectPath(string: String): Boolean {
         return stub()
    }
    fun isSignature(string: String): Boolean {
         return stub()
    }
    fun parse(type: VariantType, text: String, limit: String, endptr: String): Variant {
         return stub()
    }
    fun parseErrorPrintContext(error: Error, source_str: String): String {
         return stub()
    }
    fun parseErrorQuark(): UInt {
         return stub()
    }
    fun parserGetErrorQuark(): UInt {
         return stub()
    }
    companion object {
        fun cptr(obj: Variant): CPointer<cnames.structs._GVariant> = obj.cptr
    }
}

class VariantBuilder(private val cptr: CPointer<cnames.structs._GVariantBuilder>) /* struct */ {
    fun new(type: VariantType): VariantBuilder {
         return stub()
    }
    fun addValue(value: Variant): Unit {
         return stub()
    }
    fun close(): Unit {
         return stub()
    }
    fun end(): Variant {
         return stub()
    }
    fun open(type: VariantType): Unit {
         return stub()
    }
    fun ref(): VariantBuilder {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: VariantBuilder): CPointer<cnames.structs._GVariantBuilder> = obj.cptr
    }
}

typealias VariantClass = GVariantClass

class VariantDict(private val cptr: CPointer<cnames.structs._GVariantDict>) /* struct */ {
    fun new(from_asv: Variant): VariantDict {
         return stub()
    }
    fun clear(): Unit {
         return stub()
    }
    fun contains(key: String): Boolean {
         return stub()
    }
    fun end(): Variant {
         return stub()
    }
    fun insertValue(key: String, value: Variant): Unit {
         return stub()
    }
    fun lookupValue(key: String, expected_type: VariantType): Variant {
         return stub()
    }
    fun ref(): VariantDict {
         return stub()
    }
    fun remove(key: String): Boolean {
         return stub()
    }
    fun unref(): Unit {
         return stub()
    }
    companion object {
        fun cptr(obj: VariantDict): CPointer<cnames.structs._GVariantDict> = obj.cptr
    }
}

typealias VariantParseError = GVariantParseError

class VariantType(private val cptr: CPointer<cnames.structs._GVariantType>) /* struct */ {
    fun new(type_string: String): VariantType {
         return stub()
    }
    fun newArray(element: VariantType): VariantType {
         return stub()
    }
    fun newDictEntry(key: VariantType, value: VariantType): VariantType {
         return stub()
    }
    fun newMaybe(element: VariantType): VariantType {
         return stub()
    }
    fun newTuple(items: List<VariantType>, length: Int): VariantType {
         return stub()
    }
    fun copy(): VariantType {
         return stub()
    }
    fun dupString(): String {
         return stub()
    }
    fun element(): VariantType {
         return stub()
    }
    fun equal(type2: VariantType): Boolean {
         return stub()
    }
    fun first(): VariantType {
         return stub()
    }
    fun free(): Unit {
         return stub()
    }
    fun getStringLength(): ULong {
         return stub()
    }
    fun hash(): UInt {
         return stub()
    }
    fun isArray(): Boolean {
         return stub()
    }
    fun isBasic(): Boolean {
         return stub()
    }
    fun isContainer(): Boolean {
         return stub()
    }
    fun isDefinite(): Boolean {
         return stub()
    }
    fun isDictEntry(): Boolean {
         return stub()
    }
    fun isMaybe(): Boolean {
         return stub()
    }
    fun isSubtypeOf(supertype: VariantType): Boolean {
         return stub()
    }
    fun isTuple(): Boolean {
         return stub()
    }
    fun isVariant(): Boolean {
         return stub()
    }
    fun key(): VariantType {
         return stub()
    }
    fun nItems(): ULong {
         return stub()
    }
    fun next(): VariantType {
         return stub()
    }
    fun value(): VariantType {
         return stub()
    }
    fun checked(arg0: String): VariantType {
         return stub()
    }
    fun stringGetDepth(type_string: String): ULong {
         return stub()
    }
    fun stringIsValid(type_string: String): Boolean {
         return stub()
    }
    fun stringScan(string: String, limit: String, endptr: String): Boolean {
         return stub()
    }
    companion object {
        fun cptr(obj: VariantType): CPointer<cnames.structs._GVariantType> = obj.cptr
    }
}

typealias VoidFunc = () -> Unit

val WIN32_MSG_HANDLE: Int get() = TODO()

fun access(filename:  String, mode:  Int): Int = TODO()
fun asciiDigitValue(c:  Byte): Int = TODO()
fun asciiDtostr(buffer:  String, buf_len:  Int, d:  Double): String = TODO()
fun asciiFormatd(buffer:  String, buf_len:  Int, format:  String, d:  Double): String = TODO()
fun asciiStrcasecmp(s1:  String, s2:  String): Int = TODO()
fun asciiStrdown(str:  String, len:  Long): String = TODO()
fun asciiStringToSigned(str:  String, base:  UInt, min:  Long, max:  Long, out_num:  Long): Boolean = TODO()
fun asciiStringToUnsigned(str:  String, base:  UInt, min:  ULong, max:  ULong, out_num:  ULong): Boolean = TODO()
fun asciiStrncasecmp(s1:  String, s2:  String, n:  ULong): Int = TODO()
fun asciiStrtod(nptr:  String, endptr:  String): Double = TODO()
fun asciiStrtoll(nptr:  String, endptr:  String, base:  UInt): Long = TODO()
fun asciiStrtoull(nptr:  String, endptr:  String, base:  UInt): ULong = TODO()
fun asciiStrup(str:  String, len:  Long): String = TODO()
fun asciiTolower(c:  Byte): Byte = TODO()
fun asciiToupper(c:  Byte): Byte = TODO()
fun asciiXdigitValue(c:  Byte): Int = TODO()
fun assertWarning(log_domain:  String, file:  String, line:  Int, pretty_function:  String, expression:  String): Unit = TODO()
fun assertionMessage(domain:  String, file:  String, line:  Int, func:  String, message:  String): Unit = TODO()
fun assertionMessageCmpstr(domain:  String, file:  String, line:  Int, func:  String, expr:  String, arg1:  String, cmp:  String, arg2:  String): Unit = TODO()
fun assertionMessageError(domain:  String, file:  String, line:  Int, func:  String, expr:  String, error:  Error, error_domain:  UInt, error_code:  Int): Unit = TODO()
fun atexit(func:  VoidFunc): Unit = TODO()
fun atomicIntAdd(atomic:  Int, `val`:  Int): Int = TODO()
fun atomicIntAnd(atomic:  UInt, `val`:  UInt): UInt = TODO()
fun atomicIntCompareAndExchange(atomic:  Int, oldval:  Int, newval:  Int): Boolean = TODO()
fun atomicIntDecAndTest(atomic:  Int): Boolean = TODO()
fun atomicIntExchangeAndAdd(atomic:  Int, `val`:  Int): Int = TODO()
fun atomicIntGet(atomic:  Int): Int = TODO()
fun atomicIntInc(atomic:  Int): Unit = TODO()
fun atomicIntOr(atomic:  UInt, `val`:  UInt): UInt = TODO()
fun atomicIntSet(atomic:  Int, newval:  Int): Unit = TODO()
fun atomicIntXor(atomic:  UInt, `val`:  UInt): UInt = TODO()
fun atomicPointerAdd(atomic:  Any, `val`:  Long): Long = TODO()
fun atomicPointerAnd(atomic:  Any, `val`:  ULong): ULong = TODO()
fun atomicPointerCompareAndExchange(atomic:  Any, oldval:  Any, newval:  Any): Boolean = TODO()
fun atomicPointerGet(atomic:  Any): Any = TODO()
fun atomicPointerOr(atomic:  Any, `val`:  ULong): ULong = TODO()
fun atomicPointerSet(atomic:  Any, newval:  Any): Unit = TODO()
fun atomicPointerXor(atomic:  Any, `val`:  ULong): ULong = TODO()
fun atomicRcBoxAcquire(mem_block:  Any): Any = TODO()
fun atomicRcBoxAlloc(block_size:  ULong): Any = TODO()
fun atomicRcBoxAlloc0(block_size:  ULong): Any = TODO()
fun atomicRcBoxDup(block_size:  ULong, mem_block:  Any): Any = TODO()
fun atomicRcBoxGetSize(mem_block:  Any): ULong = TODO()
fun atomicRcBoxRelease(mem_block:  Any): Unit = TODO()
fun atomicRcBoxReleaseFull(mem_block:  Any, clear_func:  DestroyNotify): Unit = TODO()
fun atomicRefCountCompare(arc:  Int, `val`:  Int): Boolean = TODO()
fun atomicRefCountDec(arc:  Int): Boolean = TODO()
fun atomicRefCountInc(arc:  Int): Unit = TODO()
fun atomicRefCountInit(arc:  Int): Unit = TODO()
fun base64Decode(text:  String, out_len:  ULong): List<UByte> = TODO()
fun base64DecodeInplace(text:  List<UByte>, out_len:  ULong): UByte = TODO()
fun base64Encode(data:  List<UByte>, len:  ULong): String = TODO()
fun base64EncodeClose(break_lines:  Boolean, `out`:  List<UByte>, state:  Int, save:  Int): ULong = TODO()
fun base64EncodeStep(`in`:  List<UByte>, len:  ULong, break_lines:  Boolean, `out`:  List<UByte>, state:  Int, save:  Int): ULong = TODO()
fun basename(file_name:  String): String = TODO()
fun bitLock(address:  Int, lock_bit:  Int): Unit = TODO()
fun bitNthLsf(mask:  ULong, nth_bit:  Int): Int = TODO()
fun bitNthMsf(mask:  ULong, nth_bit:  Int): Int = TODO()
fun bitStorage(number:  ULong): UInt = TODO()
fun bitTrylock(address:  Int, lock_bit:  Int): Boolean = TODO()
fun bitUnlock(address:  Int, lock_bit:  Int): Unit = TODO()
fun bookmarkFileErrorQuark(): UInt = TODO()
fun buildFilenamev(args:  List<String>): String = TODO()
fun buildPathv(separator:  String, args:  List<String>): String = TODO()
fun byteArrayFree(array:  List<UByte>, free_segment:  Boolean): UByte = TODO()
fun byteArrayFreeToBytes(array:  List<UByte>): Bytes = TODO()
fun byteArrayNew(): List<UByte> = TODO()
fun byteArrayNewTake(data:  List<UByte>, len:  ULong): List<UByte> = TODO()
fun byteArraySteal(array:  List<UByte>, len:  ULong): UByte = TODO()
fun byteArrayUnref(array:  List<UByte>): Unit = TODO()
fun canonicalizeFilename(filename:  String, relative_to:  String): String = TODO()
fun chdir(path:  String): Int = TODO()
fun checkVersion(required_major:  UInt, required_minor:  UInt, required_micro:  UInt): String = TODO()
fun checksumTypeGetLength(checksum_type:  ChecksumType): Long = TODO()
fun childWatchAdd(priority:  Int, pid:  Int, function:  ChildWatchFunc, data:  Any, notify:  DestroyNotify): UInt = TODO()
fun childWatchSourceNew(pid:  Int): Source = TODO()
fun clearError(): Unit = TODO()
fun close(fd:  Int): Boolean = TODO()
fun computeChecksumForBytes(checksum_type:  ChecksumType, data:  Bytes): String = TODO()
fun computeChecksumForData(checksum_type:  ChecksumType, data:  List<UByte>, length:  ULong): String = TODO()
fun computeChecksumForString(checksum_type:  ChecksumType, str:  String, length:  Long): String = TODO()
fun computeHmacForBytes(digest_type:  ChecksumType, key:  Bytes, data:  Bytes): String = TODO()
fun computeHmacForData(digest_type:  ChecksumType, key:  List<UByte>, key_len:  ULong, data:  List<UByte>, length:  ULong): String = TODO()
fun computeHmacForString(digest_type:  ChecksumType, key:  List<UByte>, key_len:  ULong, str:  String, length:  Long): String = TODO()
fun convert(str:  List<UByte>, len:  Long, to_codeset:  String, from_codeset:  String, bytes_read:  ULong, bytes_written:  ULong): List<UByte> = TODO()
fun convertErrorQuark(): UInt = TODO()
fun convertWithFallback(str:  List<UByte>, len:  Long, to_codeset:  String, from_codeset:  String, fallback:  String, bytes_read:  ULong, bytes_written:  ULong): List<UByte> = TODO()
fun datalistForeach(datalist:  Data, func:  DataForeachFunc, user_data:  Any): Unit = TODO()
fun datalistGetData(datalist:  Data, key:  String): Any = TODO()
fun datalistGetFlags(datalist:  Data): UInt = TODO()
fun datalistIdGetData(datalist:  Data, key_id:  UInt): Any = TODO()
fun datalistSetFlags(datalist:  Data, flags:  UInt): Unit = TODO()
fun datalistUnsetFlags(datalist:  Data, flags:  UInt): Unit = TODO()
fun datasetDestroy(dataset_location:  Any): Unit = TODO()
fun datasetForeach(dataset_location:  Any, func:  DataForeachFunc, user_data:  Any): Unit = TODO()
fun datasetIdGetData(dataset_location:  Any, key_id:  UInt): Any = TODO()
fun dateGetDaysInMonth(month:  DateMonth, year:  UShort): UByte = TODO()
fun dateGetMondayWeeksInYear(year:  UShort): UByte = TODO()
fun dateGetSundayWeeksInYear(year:  UShort): UByte = TODO()
fun dateIsLeapYear(year:  UShort): Boolean = TODO()
fun dateStrftime(s:  String, slen:  ULong, format:  String, date:  Date): ULong = TODO()
fun dateTimeCompare(dt1:  Any, dt2:  Any): Int = TODO()
fun dateTimeEqual(dt1:  Any, dt2:  Any): Boolean = TODO()
fun dateTimeHash(datetime:  Any): UInt = TODO()
fun dateValidDay(day:  UByte): Boolean = TODO()
fun dateValidDmy(day:  UByte, month:  DateMonth, year:  UShort): Boolean = TODO()
fun dateValidJulian(julian_date:  UInt): Boolean = TODO()
fun dateValidMonth(month:  DateMonth): Boolean = TODO()
fun dateValidWeekday(weekday:  DateWeekday): Boolean = TODO()
fun dateValidYear(year:  UShort): Boolean = TODO()
fun dcgettext(domain:  String, msgid:  String, category:  Int): String = TODO()
fun dgettext(domain:  String, msgid:  String): String = TODO()
fun dirMakeTmp(tmpl:  String): String = TODO()
fun directEqual(v1:  Any, v2:  Any): Boolean = TODO()
fun directHash(v:  Any): UInt = TODO()
fun dngettext(domain:  String, msgid:  String, msgid_plural:  String, n:  ULong): String = TODO()
fun doubleEqual(v1:  Any, v2:  Any): Boolean = TODO()
fun doubleHash(v:  Any): UInt = TODO()
fun dpgettext(domain:  String, msgctxtid:  String, msgidoffset:  ULong): String = TODO()
fun dpgettext2(domain:  String, context:  String, msgid:  String): String = TODO()
fun environGetenv(envp:  List<String>, variable:  String): String = TODO()
fun environSetenv(envp:  List<String>, variable:  String, value:  String, overwrite:  Boolean): List<String> = TODO()
fun environUnsetenv(envp:  List<String>, variable:  String): List<String> = TODO()
fun fileErrorFromErrno(err_no:  Int): FileError = TODO()
fun fileErrorQuark(): UInt = TODO()
fun fileGetContents(filename:  String, contents:  List<UByte>, length:  ULong): Boolean = TODO()
fun fileOpenTmp(tmpl:  String, name_used:  String): Int = TODO()
fun fileReadLink(filename:  String): String = TODO()
fun fileSetContents(filename:  String, contents:  List<UByte>, length:  Long): Boolean = TODO()
fun fileTest(filename:  String, test:  FileTest): Boolean = TODO()
fun filenameDisplayBasename(filename:  String): String = TODO()
fun filenameDisplayName(filename:  String): String = TODO()
fun filenameFromUri(uri:  String, hostname:  String): String = TODO()
fun filenameFromUtf8(utf8string:  String, len:  Long, bytes_read:  ULong, bytes_written:  ULong): String = TODO()
fun filenameToUri(filename:  String, hostname:  String): String = TODO()
fun filenameToUtf8(opsysstring:  String, len:  Long, bytes_read:  ULong, bytes_written:  ULong): String = TODO()
fun findProgramInPath(program:  String): String = TODO()
fun formatSize(size:  ULong): String = TODO()
fun formatSizeForDisplay(size:  Long): String = TODO()
fun formatSizeFull(size:  ULong, flags:  FormatSizeFlags): String = TODO()
fun free(mem:  Any): Unit = TODO()
fun getApplicationName(): String = TODO()
fun getCharset(charset:  String): Boolean = TODO()
fun getCodeset(): String = TODO()
fun getConsoleCharset(charset:  String): Boolean = TODO()
fun getCurrentDir(): String = TODO()
fun getCurrentTime(result:  TimeVal): Unit = TODO()
fun getEnviron(): List<String> = TODO()
fun getFilenameCharsets(filename_charsets:  List<String>): Boolean = TODO()
fun getHomeDir(): String = TODO()
fun getHostName(): String = TODO()
fun getLanguageNames(): List<String> = TODO()
fun getLanguageNamesWithCategory(category_name:  String): List<String> = TODO()
fun getLocaleVariants(locale:  String): List<String> = TODO()
fun getMonotonicTime(): Long = TODO()
fun getNumProcessors(): UInt = TODO()
fun getOsInfo(key_name:  String): String = TODO()
fun getPrgname(): String = TODO()
fun getRealName(): String = TODO()
fun getRealTime(): Long = TODO()
fun getSystemConfigDirs(): List<String> = TODO()
fun getSystemDataDirs(): List<String> = TODO()
fun getTmpDir(): String = TODO()
fun getUserCacheDir(): String = TODO()
fun getUserConfigDir(): String = TODO()
fun getUserDataDir(): String = TODO()
fun getUserName(): String = TODO()
fun getUserRuntimeDir(): String = TODO()
fun getUserSpecialDir(directory:  UserDirectory): String = TODO()
fun getenv(variable:  String): String = TODO()
fun hashTableAdd(hash_table:  HashMap<Any, Any>, key:  Any): Boolean = TODO()
fun hashTableContains(hash_table:  HashMap<Any, Any>, key:  Any): Boolean = TODO()
fun hashTableDestroy(hash_table:  HashMap<Any, Any>): Unit = TODO()
fun hashTableInsert(hash_table:  HashMap<Any, Any>, key:  Any, value:  Any): Boolean = TODO()
fun hashTableLookup(hash_table:  HashMap<Any, Any>, key:  Any): Any = TODO()
fun hashTableLookupExtended(hash_table:  HashMap<Any, Any>, lookup_key:  Any, orig_key:  Any, value:  Any): Boolean = TODO()
fun hashTableRemove(hash_table:  HashMap<Any, Any>, key:  Any): Boolean = TODO()
fun hashTableRemoveAll(hash_table:  HashMap<Any, Any>): Unit = TODO()
fun hashTableReplace(hash_table:  HashMap<Any, Any>, key:  Any, value:  Any): Boolean = TODO()
fun hashTableSize(hash_table:  HashMap<Any, Any>): UInt = TODO()
fun hashTableSteal(hash_table:  HashMap<Any, Any>, key:  Any): Boolean = TODO()
fun hashTableStealAll(hash_table:  HashMap<Any, Any>): Unit = TODO()
fun hashTableStealExtended(hash_table:  HashMap<Any, Any>, lookup_key:  Any, stolen_key:  Any, stolen_value:  Any): Boolean = TODO()
fun hashTableUnref(hash_table:  HashMap<Any, Any>): Unit = TODO()
fun hookDestroy(hook_list:  HookList, hook_id:  ULong): Boolean = TODO()
fun hookDestroyLink(hook_list:  HookList, hook:  Hook): Unit = TODO()
fun hookFree(hook_list:  HookList, hook:  Hook): Unit = TODO()
fun hookInsertBefore(hook_list:  HookList, sibling:  Hook, hook:  Hook): Unit = TODO()
fun hookPrepend(hook_list:  HookList, hook:  Hook): Unit = TODO()
fun hookUnref(hook_list:  HookList, hook:  Hook): Unit = TODO()
fun hostnameIsAsciiEncoded(hostname:  String): Boolean = TODO()
fun hostnameIsIpAddress(hostname:  String): Boolean = TODO()
fun hostnameIsNonAscii(hostname:  String): Boolean = TODO()
fun hostnameToAscii(hostname:  String): String = TODO()
fun hostnameToUnicode(hostname:  String): String = TODO()
fun idleAdd(priority:  Int, function:  SourceFunc, data:  Any, notify:  DestroyNotify): UInt = TODO()
fun idleRemoveByData(data:  Any): Boolean = TODO()
fun idleSourceNew(): Source = TODO()
fun int64Equal(v1:  Any, v2:  Any): Boolean = TODO()
fun int64Hash(v:  Any): UInt = TODO()
fun intEqual(v1:  Any, v2:  Any): Boolean = TODO()
fun intHash(v:  Any): UInt = TODO()
fun internStaticString(string:  String): String = TODO()
fun internString(string:  String): String = TODO()
fun ioAddWatch(channel:  IOChannel, priority:  Int, condition:  IOCondition, func:  IOFunc, user_data:  Any, notify:  DestroyNotify): UInt = TODO()
fun ioChannelErrorFromErrno(en:  Int): IOChannelError = TODO()
fun ioChannelErrorQuark(): UInt = TODO()
fun ioCreateWatch(channel:  IOChannel, condition:  IOCondition): Source = TODO()
fun keyFileErrorQuark(): UInt = TODO()
fun listenv(): List<String> = TODO()
fun localeFromUtf8(utf8string:  String, len:  Long, bytes_read:  ULong, bytes_written:  ULong): List<UByte> = TODO()
fun localeToUtf8(opsysstring:  List<UByte>, len:  Long, bytes_read:  ULong, bytes_written:  ULong): String = TODO()
fun logDefaultHandler(log_domain:  String, log_level:  LogLevelFlags, message:  String, unused_data:  Any): Unit = TODO()
fun logRemoveHandler(log_domain:  String, handler_id:  UInt): Unit = TODO()
fun logSetAlwaysFatal(fatal_mask:  LogLevelFlags): LogLevelFlags = TODO()
fun logSetFatalMask(log_domain:  String, fatal_mask:  LogLevelFlags): LogLevelFlags = TODO()
fun logSetHandler(log_domain:  String, log_levels:  LogLevelFlags, log_func:  LogFunc, user_data:  Any, destroy:  DestroyNotify): UInt = TODO()
fun logSetWriterFunc(func:  LogWriterFunc, user_data:  Any, user_data_free:  DestroyNotify): Unit = TODO()
fun logStructuredArray(log_level:  LogLevelFlags, fields:  List<LogField>, n_fields:  ULong): Unit = TODO()
fun logVariant(log_domain:  String, log_level:  LogLevelFlags, fields:  Variant): Unit = TODO()
fun logWriterDefault(log_level:  LogLevelFlags, fields:  List<LogField>, n_fields:  ULong, user_data:  Any): LogWriterOutput = TODO()
fun logWriterFormatFields(log_level:  LogLevelFlags, fields:  List<LogField>, n_fields:  ULong, use_color:  Boolean): String = TODO()
fun logWriterIsJournald(output_fd:  Int): Boolean = TODO()
fun logWriterJournald(log_level:  LogLevelFlags, fields:  List<LogField>, n_fields:  ULong, user_data:  Any): LogWriterOutput = TODO()
fun logWriterStandardStreams(log_level:  LogLevelFlags, fields:  List<LogField>, n_fields:  ULong, user_data:  Any): LogWriterOutput = TODO()
fun logWriterSupportsColor(output_fd:  Int): Boolean = TODO()
fun mainContextDefault(): MainContext = TODO()
fun mainContextGetThreadDefault(): MainContext = TODO()
fun mainContextRefThreadDefault(): MainContext = TODO()
fun mainCurrentSource(): Source = TODO()
fun mainDepth(): Int = TODO()
fun malloc(n_bytes:  ULong): Any = TODO()
fun malloc0(n_bytes:  ULong): Any = TODO()
fun malloc0N(n_blocks:  ULong, n_block_bytes:  ULong): Any = TODO()
fun mallocN(n_blocks:  ULong, n_block_bytes:  ULong): Any = TODO()
fun markupErrorQuark(): UInt = TODO()
fun markupEscapeText(text:  String, length:  Long): String = TODO()
fun memIsSystemMalloc(): Boolean = TODO()
fun memProfile(): Unit = TODO()
fun memSetVtable(vtable:  MemVTable): Unit = TODO()
fun memdup(mem:  Any, byte_size:  UInt): Any = TODO()
fun mkdirWithParents(pathname:  String, mode:  Int): Int = TODO()
fun nullifyPointer(nullify_location:  Any): Unit = TODO()
fun numberParserErrorQuark(): UInt = TODO()
fun onErrorQuery(prg_name:  String): Unit = TODO()
fun onErrorStackTrace(prg_name:  String): Unit = TODO()
fun onceInitEnter(location:  Any): Boolean = TODO()
fun onceInitLeave(location:  Any, result:  ULong): Unit = TODO()
fun optionErrorQuark(): UInt = TODO()
fun parseDebugString(string:  String, keys:  List<DebugKey>, nkeys:  UInt): UInt = TODO()
fun pathGetBasename(file_name:  String): String = TODO()
fun pathGetDirname(file_name:  String): String = TODO()
fun pathIsAbsolute(file_name:  String): Boolean = TODO()
fun pathSkipRoot(file_name:  String): String = TODO()
fun patternMatch(pspec:  PatternSpec, string_length:  UInt, string:  String, string_reversed:  String): Boolean = TODO()
fun patternMatchSimple(pattern:  String, string:  String): Boolean = TODO()
fun patternMatchString(pspec:  PatternSpec, string:  String): Boolean = TODO()
fun pointerBitLock(address:  Any, lock_bit:  Int): Unit = TODO()
fun pointerBitTrylock(address:  Any, lock_bit:  Int): Boolean = TODO()
fun pointerBitUnlock(address:  Any, lock_bit:  Int): Unit = TODO()
fun poll(fds:  PollFD, nfds:  UInt, timeout:  Int): Int = TODO()
fun propagateError(dest:  Error, src:  Error): Unit = TODO()
fun quarkFromStaticString(string:  String): UInt = TODO()
fun quarkFromString(string:  String): UInt = TODO()
fun quarkToString(quark:  UInt): String = TODO()
fun quarkTryString(string:  String): UInt = TODO()
fun randomDouble(): Double = TODO()
fun randomDoubleRange(begin:  Double, end:  Double): Double = TODO()
fun randomInt(): UInt = TODO()
fun randomIntRange(begin:  Int, end:  Int): Int = TODO()
fun randomSetSeed(seed:  UInt): Unit = TODO()
fun rcBoxAcquire(mem_block:  Any): Any = TODO()
fun rcBoxAlloc(block_size:  ULong): Any = TODO()
fun rcBoxAlloc0(block_size:  ULong): Any = TODO()
fun rcBoxDup(block_size:  ULong, mem_block:  Any): Any = TODO()
fun rcBoxGetSize(mem_block:  Any): ULong = TODO()
fun rcBoxRelease(mem_block:  Any): Unit = TODO()
fun rcBoxReleaseFull(mem_block:  Any, clear_func:  DestroyNotify): Unit = TODO()
fun realloc(mem:  Any, n_bytes:  ULong): Any = TODO()
fun reallocN(mem:  Any, n_blocks:  ULong, n_block_bytes:  ULong): Any = TODO()
fun refCountCompare(rc:  Int, `val`:  Int): Boolean = TODO()
fun refCountDec(rc:  Int): Boolean = TODO()
fun refCountInc(rc:  Int): Unit = TODO()
fun refCountInit(rc:  Int): Unit = TODO()
fun refStringAcquire(str:  String): String = TODO()
fun refStringLength(str:  String): ULong = TODO()
fun refStringNew(str:  String): String = TODO()
fun refStringNewIntern(str:  String): String = TODO()
fun refStringNewLen(str:  String, len:  Long): String = TODO()
fun refStringRelease(str:  String): Unit = TODO()
fun regexCheckReplacement(replacement:  String, has_references:  Boolean): Boolean = TODO()
fun regexErrorQuark(): UInt = TODO()
fun regexEscapeNul(string:  String, length:  Int): String = TODO()
fun regexEscapeString(string:  List<String>, length:  Int): String = TODO()
fun regexMatchSimple(pattern:  String, string:  String, compile_options:  RegexCompileFlags, match_options:  RegexMatchFlags): Boolean = TODO()
fun regexSplitSimple(pattern:  String, string:  String, compile_options:  RegexCompileFlags, match_options:  RegexMatchFlags): List<String> = TODO()
fun reloadUserSpecialDirsCache(): Unit = TODO()
fun rmdir(filename:  String): Int = TODO()
fun sequenceGet(iter:  SequenceIter): Any = TODO()
fun sequenceInsertBefore(iter:  SequenceIter, data:  Any): SequenceIter = TODO()
fun sequenceMove(src:  SequenceIter, dest:  SequenceIter): Unit = TODO()
fun sequenceMoveRange(dest:  SequenceIter, begin:  SequenceIter, end:  SequenceIter): Unit = TODO()
fun sequenceRangeGetMidpoint(begin:  SequenceIter, end:  SequenceIter): SequenceIter = TODO()
fun sequenceRemove(iter:  SequenceIter): Unit = TODO()
fun sequenceRemoveRange(begin:  SequenceIter, end:  SequenceIter): Unit = TODO()
fun sequenceSet(iter:  SequenceIter, data:  Any): Unit = TODO()
fun sequenceSwap(a:  SequenceIter, b:  SequenceIter): Unit = TODO()
fun setApplicationName(application_name:  String): Unit = TODO()
fun setErrorLiteral(err:  Error, domain:  UInt, code:  Int, message:  String): Unit = TODO()
fun setPrgname(prgname:  String): Unit = TODO()
fun setenv(variable:  String, value:  String, overwrite:  Boolean): Boolean = TODO()
fun shellErrorQuark(): UInt = TODO()
fun shellParseArgv(command_line:  String, argcp:  Int, argvp:  List<String>): Boolean = TODO()
fun shellQuote(unquoted_string:  String): String = TODO()
fun shellUnquote(quoted_string:  String): String = TODO()
fun sliceAlloc(block_size:  ULong): Any = TODO()
fun sliceAlloc0(block_size:  ULong): Any = TODO()
fun sliceCopy(block_size:  ULong, mem_block:  Any): Any = TODO()
fun sliceFree1(block_size:  ULong, mem_block:  Any): Unit = TODO()
fun sliceFreeChainWithOffset(block_size:  ULong, mem_chain:  Any, next_offset:  ULong): Unit = TODO()
fun sliceGetConfig(ckey:  SliceConfig): Long = TODO()
fun sliceGetConfigState(ckey:  SliceConfig, address:  Long, n_values:  UInt): Long = TODO()
fun sliceSetConfig(ckey:  SliceConfig, value:  Long): Unit = TODO()
fun sourceRemove(tag:  UInt): Boolean = TODO()
fun sourceRemoveByFuncsUserData(funcs:  SourceFuncs, user_data:  Any): Boolean = TODO()
fun sourceRemoveByUserData(user_data:  Any): Boolean = TODO()
fun sourceSetNameById(tag:  UInt, `name`:  String): Unit = TODO()
fun spacedPrimesClosest(num:  UInt): UInt = TODO()
fun spawnAsync(working_directory:  String, argv:  List<String>, envp:  List<String>, flags:  SpawnFlags, child_setup:  SpawnChildSetupFunc, user_data:  Any, child_pid:  Int): Boolean = TODO()
fun spawnAsyncWithFds(working_directory:  String, argv:  List<String>, envp:  List<String>, flags:  SpawnFlags, child_setup:  SpawnChildSetupFunc, user_data:  Any, child_pid:  Int, stdin_fd:  Int, stdout_fd:  Int, stderr_fd:  Int): Boolean = TODO()
fun spawnAsyncWithPipes(working_directory:  String, argv:  List<String>, envp:  List<String>, flags:  SpawnFlags, child_setup:  SpawnChildSetupFunc, user_data:  Any, child_pid:  Int, standard_input:  Int, standard_output:  Int, standard_error:  Int): Boolean = TODO()
fun spawnCheckExitStatus(exit_status:  Int): Boolean = TODO()
fun spawnClosePid(pid:  Int): Unit = TODO()
fun spawnCommandLineAsync(command_line:  String): Boolean = TODO()
fun spawnCommandLineSync(command_line:  String, standard_output:  List<UByte>, standard_error:  List<UByte>, exit_status:  Int): Boolean = TODO()
fun spawnErrorQuark(): UInt = TODO()
fun spawnExitErrorQuark(): UInt = TODO()
fun spawnSync(working_directory:  String, argv:  List<String>, envp:  List<String>, flags:  SpawnFlags, child_setup:  SpawnChildSetupFunc, user_data:  Any, standard_output:  List<UByte>, standard_error:  List<UByte>, exit_status:  Int): Boolean = TODO()
fun stpcpy(dest:  String, src:  String): String = TODO()
fun strEqual(v1:  Any, v2:  Any): Boolean = TODO()
fun strHasPrefix(str:  String, prefix:  String): Boolean = TODO()
fun strHasSuffix(str:  String, suffix:  String): Boolean = TODO()
fun strHash(v:  Any): UInt = TODO()
fun strIsAscii(str:  String): Boolean = TODO()
fun strMatchString(search_term:  String, potential_hit:  String, accept_alternates:  Boolean): Boolean = TODO()
fun strToAscii(str:  String, from_locale:  String): String = TODO()
fun strTokenizeAndFold(string:  String, translit_locale:  String, ascii_alternates:  List<String>): List<String> = TODO()
fun strcanon(string:  String, valid_chars:  String, substitutor:  Byte): String = TODO()
fun strcasecmp(s1:  String, s2:  String): Int = TODO()
fun strchomp(string:  String): String = TODO()
fun strchug(string:  String): String = TODO()
fun strcmp0(str1:  String, str2:  String): Int = TODO()
fun strcompress(source:  String): String = TODO()
fun strdelimit(string:  String, delimiters:  String, new_delimiter:  Byte): String = TODO()
fun strdown(string:  String): String = TODO()
fun strdup(str:  String): String = TODO()
fun strerror(errnum:  Int): String = TODO()
fun strescape(source:  String, exceptions:  String): String = TODO()
fun strfreev(str_array:  String): Unit = TODO()
fun stringNew(init:  String): String = TODO()
fun stringNewLen(init:  String, len:  Long): String = TODO()
fun stringSizedNew(dfl_size:  ULong): String = TODO()
fun stripContext(msgid:  String, msgval:  String): String = TODO()
fun strjoinv(separator:  String, str_array:  String): String = TODO()
fun strlcat(dest:  String, src:  String, dest_size:  ULong): ULong = TODO()
fun strlcpy(dest:  String, src:  String, dest_size:  ULong): ULong = TODO()
fun strncasecmp(s1:  String, s2:  String, n:  UInt): Int = TODO()
fun strndup(str:  String, n:  ULong): String = TODO()
fun strnfill(length:  ULong, fill_char:  Byte): String = TODO()
fun strreverse(string:  String): String = TODO()
fun strrstr(haystack:  String, needle:  String): String = TODO()
fun strrstrLen(haystack:  String, haystack_len:  Long, needle:  String): String = TODO()
fun strsignal(signum:  Int): String = TODO()
fun strstrLen(haystack:  String, haystack_len:  Long, needle:  String): String = TODO()
fun strtod(nptr:  String, endptr:  String): Double = TODO()
fun strup(string:  String): String = TODO()
fun strvContains(strv:  String, str:  String): Boolean = TODO()
fun strvEqual(strv1:  String, strv2:  String): Boolean = TODO()
fun strvGetType(): GType = TODO()
fun strvLength(str_array:  String): UInt = TODO()
fun testAddDataFunc(testpath:  String, test_data:  Any, test_func:  TestDataFunc): Unit = TODO()
fun testAddDataFuncFull(testpath:  String, test_data:  Any, test_func:  TestDataFunc, data_free_func:  DestroyNotify): Unit = TODO()
fun testAddFunc(testpath:  String, test_func:  TestFunc): Unit = TODO()
fun testAssertExpectedMessagesInternal(domain:  String, file:  String, line:  Int, func:  String): Unit = TODO()
fun testBug(bug_uri_snippet:  String): Unit = TODO()
fun testBugBase(uri_pattern:  String): Unit = TODO()
fun testExpectMessage(log_domain:  String, log_level:  LogLevelFlags, pattern:  String): Unit = TODO()
fun testFail(): Unit = TODO()
fun testFailed(): Boolean = TODO()
fun testGetDir(file_type:  TestFileType): String = TODO()
fun testIncomplete(msg:  String): Unit = TODO()
fun testLogTypeName(log_type:  TestLogType): String = TODO()
fun testQueueDestroy(destroy_func:  DestroyNotify, destroy_data:  Any): Unit = TODO()
fun testQueueFree(gfree_pointer:  Any): Unit = TODO()
fun testRandDouble(): Double = TODO()
fun testRandDoubleRange(range_start:  Double, range_end:  Double): Double = TODO()
fun testRandInt(): Int = TODO()
fun testRandIntRange(begin:  Int, end:  Int): Int = TODO()
fun testRun(): Int = TODO()
fun testRunSuite(suite:  TestSuite): Int = TODO()
fun testSetNonfatalAssertions(): Unit = TODO()
fun testSkip(msg:  String): Unit = TODO()
fun testSubprocess(): Boolean = TODO()
fun testSummary(summary:  String): Unit = TODO()
fun testTimerElapsed(): Double = TODO()
fun testTimerLast(): Double = TODO()
fun testTimerStart(): Unit = TODO()
fun testTrapAssertions(domain:  String, file:  String, line:  Int, func:  String, assertion_flags:  ULong, pattern:  String): Unit = TODO()
fun testTrapFork(usec_timeout:  ULong, test_trap_flags:  TestTrapFlags): Boolean = TODO()
fun testTrapHasPassed(): Boolean = TODO()
fun testTrapReachedTimeout(): Boolean = TODO()
fun testTrapSubprocess(test_path:  String, usec_timeout:  ULong, test_flags:  TestSubprocessFlags): Unit = TODO()
fun threadErrorQuark(): UInt = TODO()
fun threadExit(retval:  Any): Unit = TODO()
fun threadPoolGetMaxIdleTime(): UInt = TODO()
fun threadPoolGetMaxUnusedThreads(): Int = TODO()
fun threadPoolGetNumUnusedThreads(): UInt = TODO()
fun threadPoolSetMaxIdleTime(interval:  UInt): Unit = TODO()
fun threadPoolSetMaxUnusedThreads(max_threads:  Int): Unit = TODO()
fun threadPoolStopUnusedThreads(): Unit = TODO()
fun threadSelf(): Thread = TODO()
fun threadYield(): Unit = TODO()
fun timeValFromIso8601(iso_date:  String, time_:  TimeVal): Boolean = TODO()
fun timeoutAdd(priority:  Int, interval:  UInt, function:  SourceFunc, data:  Any, notify:  DestroyNotify): UInt = TODO()
fun timeoutAddSeconds(priority:  Int, interval:  UInt, function:  SourceFunc, data:  Any, notify:  DestroyNotify): UInt = TODO()
fun timeoutSourceNew(interval:  UInt): Source = TODO()
fun timeoutSourceNewSeconds(interval:  UInt): Source = TODO()
fun trashStackHeight(stack_p:  TrashStack): UInt = TODO()
fun trashStackPeek(stack_p:  TrashStack): Any = TODO()
fun trashStackPop(stack_p:  TrashStack): Any = TODO()
fun trashStackPush(stack_p:  TrashStack, data_p:  Any): Unit = TODO()
fun tryMalloc(n_bytes:  ULong): Any = TODO()
fun tryMalloc0(n_bytes:  ULong): Any = TODO()
fun tryMalloc0N(n_blocks:  ULong, n_block_bytes:  ULong): Any = TODO()
fun tryMallocN(n_blocks:  ULong, n_block_bytes:  ULong): Any = TODO()
fun tryRealloc(mem:  Any, n_bytes:  ULong): Any = TODO()
fun tryReallocN(mem:  Any, n_blocks:  ULong, n_block_bytes:  ULong): Any = TODO()
fun ucs4ToUtf16(str:  Char, len:  Long, items_read:  Long, items_written:  Long): UShort = TODO()
fun ucs4ToUtf8(str:  Char, len:  Long, items_read:  Long, items_written:  Long): String = TODO()
fun unicharBreakType(c:  Char): UnicodeBreakType = TODO()
fun unicharCombiningClass(uc:  Char): Int = TODO()
fun unicharCompose(a:  Char, b:  Char, ch:  Char): Boolean = TODO()
fun unicharDecompose(ch:  Char, a:  Char, b:  Char): Boolean = TODO()
fun unicharDigitValue(c:  Char): Int = TODO()
fun unicharFullyDecompose(ch:  Char, compat:  Boolean, result:  Char, result_len:  ULong): ULong = TODO()
fun unicharGetMirrorChar(ch:  Char, mirrored_ch:  Char): Boolean = TODO()
fun unicharGetScript(ch:  Char): UnicodeScript = TODO()
fun unicharIsalnum(c:  Char): Boolean = TODO()
fun unicharIsalpha(c:  Char): Boolean = TODO()
fun unicharIscntrl(c:  Char): Boolean = TODO()
fun unicharIsdefined(c:  Char): Boolean = TODO()
fun unicharIsdigit(c:  Char): Boolean = TODO()
fun unicharIsgraph(c:  Char): Boolean = TODO()
fun unicharIslower(c:  Char): Boolean = TODO()
fun unicharIsmark(c:  Char): Boolean = TODO()
fun unicharIsprint(c:  Char): Boolean = TODO()
fun unicharIspunct(c:  Char): Boolean = TODO()
fun unicharIsspace(c:  Char): Boolean = TODO()
fun unicharIstitle(c:  Char): Boolean = TODO()
fun unicharIsupper(c:  Char): Boolean = TODO()
fun unicharIswide(c:  Char): Boolean = TODO()
fun unicharIswideCjk(c:  Char): Boolean = TODO()
fun unicharIsxdigit(c:  Char): Boolean = TODO()
fun unicharIszerowidth(c:  Char): Boolean = TODO()
fun unicharToUtf8(c:  Char, outbuf:  String): Int = TODO()
fun unicharTolower(c:  Char): Char = TODO()
fun unicharTotitle(c:  Char): Char = TODO()
fun unicharToupper(c:  Char): Char = TODO()
fun unicharType(c:  Char): UnicodeType = TODO()
fun unicharValidate(ch:  Char): Boolean = TODO()
fun unicharXdigitValue(c:  Char): Int = TODO()
fun unicodeCanonicalDecomposition(ch:  Char, result_len:  ULong): Char = TODO()
fun unicodeCanonicalOrdering(string:  Char, len:  ULong): Unit = TODO()
fun unicodeScriptFromIso15924(iso15924:  UInt): UnicodeScript = TODO()
fun unicodeScriptToIso15924(script:  UnicodeScript): UInt = TODO()
fun unixErrorQuark(): UInt = TODO()
fun unixFdAddFull(priority:  Int, fd:  Int, condition:  IOCondition, function:  UnixFDSourceFunc, user_data:  Any, notify:  DestroyNotify): UInt = TODO()
fun unixFdSourceNew(fd:  Int, condition:  IOCondition): Source = TODO()
fun unixGetPasswdEntry(user_name:  String): Any = TODO()
fun unixOpenPipe(fds:  Int, flags:  Int): Boolean = TODO()
fun unixSetFdNonblocking(fd:  Int, nonblock:  Boolean): Boolean = TODO()
fun unixSignalAdd(priority:  Int, signum:  Int, handler:  SourceFunc, user_data:  Any, notify:  DestroyNotify): UInt = TODO()
fun unixSignalSourceNew(signum:  Int): Source = TODO()
fun unlink(filename:  String): Int = TODO()
fun unsetenv(variable:  String): Unit = TODO()
fun uriEscapeString(unescaped:  String, reserved_chars_allowed:  String, allow_utf8:  Boolean): String = TODO()
fun uriListExtractUris(uri_list:  String): List<String> = TODO()
fun uriParseScheme(uri:  String): String = TODO()
fun uriUnescapeSegment(escaped_string:  String, escaped_string_end:  String, illegal_characters:  String): String = TODO()
fun uriUnescapeString(escaped_string:  String, illegal_characters:  String): String = TODO()
fun usleep(microseconds:  ULong): Unit = TODO()
fun utf16ToUcs4(str:  UShort, len:  Long, items_read:  Long, items_written:  Long): Char = TODO()
fun utf16ToUtf8(str:  UShort, len:  Long, items_read:  Long, items_written:  Long): String = TODO()
fun utf8Casefold(str:  String, len:  Long): String = TODO()
fun utf8Collate(str1:  String, str2:  String): Int = TODO()
fun utf8CollateKey(str:  String, len:  Long): String = TODO()
fun utf8CollateKeyForFilename(str:  String, len:  Long): String = TODO()
fun utf8FindNextChar(p:  String, end:  String): String = TODO()
fun utf8FindPrevChar(str:  String, p:  String): String = TODO()
fun utf8GetChar(p:  String): Char = TODO()
fun utf8GetCharValidated(p:  String, max_len:  Long): Char = TODO()
fun utf8MakeValid(str:  String, len:  Long): String = TODO()
fun utf8Normalize(str:  String, len:  Long, mode:  NormalizeMode): String = TODO()
fun utf8OffsetToPointer(str:  String, offset:  Long): String = TODO()
fun utf8PointerToOffset(str:  String, pos:  String): Long = TODO()
fun utf8PrevChar(p:  String): String = TODO()
fun utf8Strchr(p:  String, len:  Long, c:  Char): String = TODO()
fun utf8Strdown(str:  String, len:  Long): String = TODO()
fun utf8Strlen(p:  String, max:  Long): Long = TODO()
fun utf8Strncpy(dest:  String, src:  String, n:  ULong): String = TODO()
fun utf8Strrchr(p:  String, len:  Long, c:  Char): String = TODO()
fun utf8Strreverse(str:  String, len:  Long): String = TODO()
fun utf8Strup(str:  String, len:  Long): String = TODO()
fun utf8Substring(str:  String, start_pos:  Long, end_pos:  Long): String = TODO()
fun utf8ToUcs4(str:  String, len:  Long, items_read:  Long, items_written:  Long): Char = TODO()
fun utf8ToUcs4Fast(str:  String, len:  Long, items_written:  Long): Char = TODO()
fun utf8ToUtf16(str:  String, len:  Long, items_read:  Long, items_written:  Long): UShort = TODO()
fun utf8Validate(str:  List<UByte>, max_len:  Long, end:  String): Boolean = TODO()
fun utf8ValidateLen(str:  List<UByte>, max_len:  ULong, end:  String): Boolean = TODO()
fun uuidStringIsValid(str:  String): Boolean = TODO()
fun uuidStringRandom(): String = TODO()
fun variantGetGtype(): GType = TODO()
fun variantIsObjectPath(string:  String): Boolean = TODO()
fun variantIsSignature(string:  String): Boolean = TODO()
fun variantParse(type:  VariantType, text:  String, limit:  String, endptr:  String): Variant = TODO()
fun variantParseErrorPrintContext(error:  Error, source_str:  String): String = TODO()
fun variantParseErrorQuark(): UInt = TODO()
fun variantParserGetErrorQuark(): UInt = TODO()
fun variantTypeChecked(arg0:  String): VariantType = TODO()
fun variantTypeStringGetDepth(type_string:  String): ULong = TODO()
fun variantTypeStringIsValid(type_string:  String): Boolean = TODO()
fun variantTypeStringScan(string:  String, limit:  String, endptr:  String): Boolean = TODO()
