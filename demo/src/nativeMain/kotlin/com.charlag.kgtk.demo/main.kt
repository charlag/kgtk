package com.charlag.kgtk.demo

import com.charlag.kgtk.demo.gtk.Application
import com.charlag.kgtk.demo.gtk.ApplicationWindow
import gtk3.G_CONNECT_SWAPPED
import gtk3.g_signal_connect_data
import kotlinx.cinterop.*

fun main(args: Array<String>) {
    val app = Application("com.charlag.kgtk.demo", 0u)

    val lambda = {
        println("On activate $app")
        val window = ApplicationWindow(app)
        window.set_title("K-GTK")
        window.set_default_size(300, 300)
        window.show_all()
    }

    val stableRef = StableRef.create(lambda)
    g_signal_connect_data(Application.cptr(app), "activate", staticCFunction<COpaquePointer, Unit> { lambdaPtr ->
        lambdaPtr.asStableRef<() -> Unit>().get()()
    }.reinterpret(), stableRef.asCPointer(), null, G_CONNECT_SWAPPED)

    app.run(args.size, args.toList())

}