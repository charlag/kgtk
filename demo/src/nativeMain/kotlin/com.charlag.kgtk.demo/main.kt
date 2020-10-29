package com.charlag.kgtk.demo

import com.charlag.kgtk.demo.gtk.*

fun main(args: Array<String>) {
    val app = Application("com.charlag.kgtk.demo", 0u)

    app.setOnActivate {
        val window = ApplicationWindow(app)
        window.setTitle("K-GTK")
        window.setDefaultSize(300, 300)

        val buttonBox = ButtonBox(Orientation.GTK_ORIENTATION_HORIZONTAL)
        window.add(buttonBox)

        val button = Button.newWithLabel("K-GTK yeah!")
        button.setOnClicked {
            button.setLabel("Clicked!")
        }
        buttonBox.add(button)

        window.showAll()
    }

    app.run(args.size, args.toList())
}