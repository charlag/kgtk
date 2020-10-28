package com.charlag.kgtk.demo

import com.charlag.kgtk.demo.gtk.Application

fun main(args: Array<String>) {
    Application("com.charlag.kgtk.demo", 0u)
            .run(args.size, args.toList())
}