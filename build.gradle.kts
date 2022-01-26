buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Libs.androidGradlePlugin)
        classpath(Libs.Kotlin.Plugin.gradle)
//        classpath("com.google.gms:google-services:4.3.10")
//        classpath("com.google.firebase:firebase-crashlytics-gradle:2.8.1")
        classpath(Libs.Kotlin.Plugin.serialization)
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    }
}

allprojects {
    repositories {
        google()
        maven { setUrl("https://jitpack.io") }
        mavenCentral()
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}