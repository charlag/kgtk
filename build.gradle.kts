import org.jetbrains.kotlin.gradle.plugin.mpp.DefaultCInteropSettings
import org.jetbrains.kotlin.gradle.plugin.mpp.Executable

plugins {
    kotlin("multiplatform") version "1.4.10"
}

repositories {
    mavenCentral()
}

val GOBJECT_INTROSPECTION_PKG = "gobject-introspection-1.0"

kotlin {
    linuxX64("native") {
        binaries {
            executable {
                entryPoint = "com.charlag.kgtk.main"
                pkgConfig(GOBJECT_INTROSPECTION_PKG)
            }
        }
        compilations["main"].cinterops {
            val girepository by creating {
                pkgConfig(GOBJECT_INTROSPECTION_PKG)
            }
        }
    }
}

/**
 * Runs `pkg-config`:
 * https://github.com/JetBrains/kotlin-native/issues/1534#issuecomment-384894431
 *
 * taken from https://gist.github.com/micolous/c00b14b2dc321fdb0eab8ad796d71b80
 */
fun runPkgConfig(
        vararg packageNames: String,
        cflags: Boolean = false,
        libs: Boolean = false
): List<String> {
    val p = ProcessBuilder(
            *(listOfNotNull(
                    "pkg-config",
                    if (cflags) "--cflags-only-I" else null,
                    if (libs) "--libs" else null
            ).toTypedArray() + packageNames)
    ).run {
        // https://github.com/JetBrains/kotlin-native/issues/3484#issuecomment-544926683
        environment()["PKG_CONFIG_ALLOW_SYSTEM_LIBS"] = "1"
        start()
    }.also { it.waitFor(10, TimeUnit.SECONDS) }

    if (p.exitValue() != 0) {
        throw GradleException(
                "Error executing pkg-config: ${
                    p.errorStream.bufferedReader().readText()
                }"
        )
    }

    return p.inputStream.bufferedReader().readText().split(" ").map { it.trim() }
}

/**
 * Add include ("-Isomething") flags to cinterop so it can find headers.
 */
fun DefaultCInteropSettings.pkgConfig(vararg packageNames: String) {
    compilerOpts.addAll(runPkgConfig(*packageNames, cflags = true))
}

/**
 * Add include ("-Isomething") flags to cinterop so it can find headers.
 */
fun Executable.pkgConfig(vararg packageNames: String) {
    linkerOpts.addAll(runPkgConfig(*packageNames, libs = true))
}