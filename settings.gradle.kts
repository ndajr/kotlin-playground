pluginManagement {
    val kotlinVersion: String by settings
    val quarkusVersion: String by settings
    plugins {
        id("org.jetbrains.kotlin.jvm") version kotlinVersion
        id("org.jetbrains.kotlin.plugin.allopen") version kotlinVersion
        id("io.quarkus") version quarkusVersion
    }
}
