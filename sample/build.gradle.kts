import org.jetbrains.kotlin.gradle.plugin.PLUGIN_CLASSPATH_CONFIGURATION_NAME

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.kotlin.plugin.compose") version "2.1.20"
}

dependencies {
    implementation(project(":composePPT"))
}

kotlin {
    jvmToolchain(11)
}