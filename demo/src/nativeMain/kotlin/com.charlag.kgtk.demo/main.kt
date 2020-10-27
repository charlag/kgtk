package com.charlag.kgtk.demo

import com.charlag.kgtk.demo.gio.ApplicationFlags
import com.charlag.kgtk.demo.gtk.Application

fun main(args: Array<String>) {
    Application("com.charlag.kgtk.demo", ApplicationFlags.flags_none)
            .run(args.size, args)
}