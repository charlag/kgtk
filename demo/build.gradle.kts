plugins {
    kotlin("multiplatform") version "1.4.10"
}

kotlin {
    linuxX64("native") {
        binaries {
            executable {
                entryPoint = "com.charlag.kgtk.demo.main"
            }
        }
        compilations["main"].cinterops {
            val gtk3 by creating {
                listOf("/opt/local/include", "/usr/include", "/usr/local/include").forEach {
                    includeDirs(
                            "$it/atk-1.0",
                            "$it/gdk-pixbuf-2.0",
                            "$it/cairo",
                            "$it/harfbuzz",
                            "$it/pango-1.0",
                            "$it/gtk-3.0",
                            "$it/glib-2.0"
                    )
                }
                includeDirs(
                        "/opt/local/lib/glib-2.0/include",
                        "/usr/lib/x86_64-linux-gnu/glib-2.0/include",
                        "/usr/local/lib/glib-2.0/include"
                )
            }
        }
    }
}