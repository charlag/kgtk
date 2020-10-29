package com.charlag.kgtk.demo

import com.charlag.kgtk.demo.gtk.*
import kotlinx.cinterop.staticCFunction
import platform.posix.SIGABRT
import platform.posix.signal
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    signal(SIGABRT, staticCFunction { _ -> exitProcess(0) })

    val app = Application("com.charlag.kgtk.demo", 0u)

    app.setOnActivate {
        val window = ApplicationWindow(app)
        window.setTitle("K-GTK")
        window.setDefaultSize(300, 300)

        val box = Box(Orientation.GTK_ORIENTATION_VERTICAL, 40)
        box.setAllMargins(60)
        window.add(box)

        var count = 0
        val label = Label("")

        fun redraw() {
            label.setMarkup("Clicked <b>$count</b>")
        }

        val button = Button.newWithLabel("K-GTK yeah!")
        button.setOnClicked {
            count++
            redraw()
        }
        box.add(label)
        box.add(button)

        val linkButton = LinkButton("https://kotlinlang.org")
        box.add(linkButton)

        redraw()

        window.showAll()
    }

    app.run(args.size, args.toList())
}

fun Widget.setAllMargins(margin: Int) {
    setMarginLeft(margin)
    setMarginRight(margin)
    setMarginTop(margin)
    setMarginBottom(margin)
}