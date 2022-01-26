object Libs {

    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.1"
    const val coreLibraryDesugaring = "com.android.tools:desugar_jdk_libs:1.1.5"

    const val junit = "junit:junit:4.13"

    object Kotlin {

        private const val version = "1.5.30"

        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
        const val reflect = "org.jetbrains.kotlin:kotlin-reflect:$version"
        const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.2"

        object Plugin {

            const val gradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
            const val serialization = "org.jetbrains.kotlin:kotlin-serialization:$version"
        }
    }

    object Coroutines {

        private const val version = "1.5.1"

        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object View {

        const val material = "com.google.android.material:material:1.3.0"
    }

    object AndroidX {

        const val appcompat = "androidx.appcompat:appcompat:1.3.0"
        const val coreKtx = "androidx.core:core-ktx:1.6.0"

        object View {

            const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.0"
            const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
        }

        object Activity {

            const val activityCompose = "androidx.activity:activity-compose:1.3.1"
        }

        object Compose {

            @Suppress("MemberVisibilityCanBePrivate")
            const val version = "1.0.1"

            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val material = "androidx.compose.material:material:$version"
            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val test = "androidx.compose.ui:ui-test:$version"
            const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
            const val uiUtil = "androidx.compose.ui:ui-util:${version}"
            const val viewBinding = "androidx.compose.ui:ui-viewbinding:$version"
        }

        object Navigation {

            private const val version = "2.3.5"
            const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        }

        object Test {

            private const val version = "1.4.0"

            const val core = "androidx.test:core:$version"
            const val runner = "androidx.test:runner:$version"
            const val rules = "androidx.test:rules:$version"

            const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"

            object Ext {

                private const val version = "1.1.2"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }
        }

        object Lifecycle {

            private const val version = "2.3.1"
            const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07"
        }
    }

    object Network {

        private const val retrofitVersion = "2.9.0"

        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val gsonSerializationConverter = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
        const val kotlinxSerializationConverter = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0"
        const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:4.9.1"
        const val networkResponseAdapter = "com.github.haroldadmin:NetworkResponseAdapter:4.2.1"
        const val scalarConverterFactory = "com.squareup.retrofit2:converter-scalars:2.1.0"
    }

    object Persistence {

        object Room {
            const val version = "2.3.0"

            const val runtime = "androidx.room:room-runtime:$version"
            const val compiler = "androidx.room:room-compiler:$version"
            const val ktx = "androidx.room:room-ktx:$version"
        }
    }

    object Koin {

        private const val version = "3.1.2"

        const val android = "io.insert-koin:koin-android:$version"
        const val core = "io.insert-koin:koin-core:$version"
        const val test = "io.insert-koin:koin-test:$version"
    }

    object Firebase {

        const val core = "com.google.firebase:firebase-core:19.0.0"
        const val crashlytics = "com.google.firebase:firebase-crashlytics:18.2.0"
        const val analytics = "com.google.firebase:firebase-analytics:19.0.0"
        const val inAppMessaging = "com.google.firebase:firebase-inappmessaging-display:20.0.0"
        const val perf = "com.google.firebase:firebase-perf:20.0.2"
    }
}
