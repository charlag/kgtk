package com.charlag.kgtk.demo

import com.charlag.kgtk.demo.gtk.*

fun main(args: Array<String>) {
    val app = Application("com.charlag.kgtk.demo", 0u)

    app.setOnActivate {
        println("On activate $app")
        val window = ApplicationWindow(app)
        window.set_title("K-GTK")
        window.set_default_size(300, 300)

        val buttonBox = ButtonBox(Orientation.GTK_ORIENTATION_HORIZONTAL)
        window.add(buttonBox)

        val button = Button.new_with_label("K-GTK yeah!")
        button.setOnClicked {
            println("Button clicked!")
            button.set_label("Clicked!")
        }
        buttonBox.add(button)

        window.show_all()
    }

    app.run(args.size, args.toList())
}