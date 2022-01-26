plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    kotlin("plugin.serialization")
    id("androidx.navigation.safeargs.kotlin")
    id("kotlin-android-extensions")
//    id("com.google.gms.google-services")
//    id("com.google.firebase.crashlytics")
}

android {
    setCompileSdkVersion(32)

    defaultConfig {
        applicationId = "com.lukasanda.sunshineweather"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    coreLibraryDesugaring(Libs.coreLibraryDesugaring)

    implementation(Libs.Kotlin.stdlib)

    implementation(Libs.Coroutines.android)
    implementation(Libs.Coroutines.core)

    implementation(Libs.AndroidX.appcompat)
    implementation(Libs.AndroidX.coreKtx)
    implementation(Libs.AndroidX.Lifecycle.livedataKtx)
    implementation(Libs.AndroidX.Lifecycle.viewModelKtx)
    implementation(Libs.AndroidX.Navigation.fragmentKtx)
    implementation(Libs.AndroidX.Navigation.uiKtx)

    /* XML view */
    implementation(Libs.View.material)
    implementation(Libs.AndroidX.View.constraintLayout)
    implementation(Libs.AndroidX.View.swipeRefreshLayout)
    // Dialogs
    implementation("com.afollestad.material-dialogs:core:3.1.1")
    // Tooltips
    implementation("com.github.takusemba:spotlight:2.0.1")

    /* JSON */
    implementation(Libs.Kotlin.serialization)
    /* DEPENDENCY INJECTION */
    implementation(Libs.Koin.android)

    implementation(project(":devicestats"))

    /* LOCATION */
//    implementation("com.google.android.gms:play-services-location:19.0.1")

    /* FIREBASE */
//    implementation(Libs.Firebase.core)
//    implementation(Libs.Firebase.crashlytics)
//    implementation(Libs.Firebase.analytics)

    /* GOOGLE SERVICES */
//    implementation("com.google.android.play:core-ktx:1.8.1")

    /* TESTING */
    androidTestImplementation(Libs.AndroidX.Test.Ext.junit)
    androidTestImplementation(Libs.AndroidX.Test.espressoCore)
    androidTestImplementation(Libs.AndroidX.Test.runner)
}