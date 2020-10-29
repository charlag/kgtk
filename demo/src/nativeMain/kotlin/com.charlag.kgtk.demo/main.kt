package com.charlag.kgtk.demo

import com.charlag.kgtk.demo.gtk.Application
import com.charlag.kgtk.demo.gtk.ApplicationWindow

fun main(args: Array<String>) {
    val app = Application("com.charlag.kgtk.demo", 0u)

    app.setOnActivate {
        println("On activate $app")
        val window = ApplicationWindow(app)
        window.set_title("K-GTK")
        window.set_default_size(300, 300)
        window.show_all()
    }

    app.run(args.size, args.toList())
}