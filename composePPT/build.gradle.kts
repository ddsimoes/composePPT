import org.jetbrains.kotlin.gradle.plugin.PLUGIN_CLASSPATH_CONFIGURATION_NAME

plugins {
    id("kotlin")
    id("com.vanniktech.maven.publish")
    id("org.jetbrains.kotlin.plugin.compose") version "2.1.20"
}

dependencies {
    api("org.jetbrains.compose.runtime:runtime:1.8.1")

    implementation("org.apache.poi:poi:5.2.2")
    implementation("org.apache.poi:poi-ooxml:5.2.2")

    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")

}

tasks.test {
    useJUnitPlatform()
}

allprojects {
    group = "com.fatihgiris.composePPT"
    version = "0.1.0"

    plugins.withId("com.vanniktech.maven.publish") {
        mavenPublish {
            sonatypeHost = com.vanniktech.maven.publish.SonatypeHost.S01
        }
    }
}

kotlin {
    jvmToolchain(11)
}