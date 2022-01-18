package dependencies

object Libs {

    object Coroutines {
        private const val version = "1.6.0"
        const val coroutine_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val coroutine_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
    }

    const val okHttp = "com.squareup.okhttp3:okhttp:4.7.2"

    const val appStartUp = "androidx.startup:startup-runtime:1.0.0"

    object LeakCanary {
        private const val version = "2.4"
        const val leakCanary = "com.squareup.leakcanary:leakcanary-android:$version"
        const val plumber = "com.squareup.leakcanary:plumber-android:$version"
    }

    object Glide {
        private const val glideVersion = "4.11.0"
        const val core = "com.github.bumptech.glide:glide:$glideVersion"
        const val compiler = "com.github.bumptech.glide:compiler:$glideVersion"
        const val recyclerView = "com.github.bumptech.glide:recyclerview-integration:$glideVersion"

    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:1.2.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    }

    object Ktx {
        const val core = "androidx.core:core-ktx:1.3.2"
        const val fragment = "androidx.fragment:fragment-ktx:$1.2.5"
        const val activity = "androidx.activity:activity-ktx:1.1.0"
    }

    object LifeCycle {
        private const val lifeCycleVersion = "2.2.0"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$lifeCycleVersion"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifeCycleVersion"
        const val test = "androidx.arch.core:core-testing:$lifeCycleVersion"
    }

    object Room {
        private const val version = "2.2.6"

        const val core = "androidx.room:room-runtime:$version"
        const val processor = "androidx.room:room-compiler:$version"
        const val ktx = "androidx.room:room-ktx:$version"

    }

    object Navigation {
        private const val version = "2.3.2"

        const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
        const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        const val dynamicFeature =
            "androidx.navigation:navigation-dynamic-features-fragment:$version"
    }

    object WorkManager {
        private const val version = "2.4.0"

        const val coreKtx = "androidx.work:work-runtime-ktx:$version"
    }

    object Dagger {
        private const val daggerVersion = "2.30.1"
        const val core = "com.google.dagger:dagger:$daggerVersion"
        const val compiler = "com.google.dagger:dagger-compiler:$daggerVersion"
    }

    object Stetho {
        private const val stethoVersion = "1.5.1"
        const val stetho = "com.facebook.stetho:stetho:$stethoVersion"
        const val stethoOk = "com.facebook.stetho:stetho-okhttp3:$stethoVersion"
    }

    object Retrofit {
        private const val retrofitVersion = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val moshiConverter = "com.squareup.retrofit2:converter-moshi:$retrofitVersion"
        const val rxAdapter = "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"
    }

    object Moshi {
        private const val moshiVersion = "1.9.3"
        const val core = "com.squareup.moshi:moshi:$moshiVersion"
        const val codeGen = "com.squareup.moshi:moshi-kotlin-codegen:$moshiVersion"
    }

}

object Configs {
    val compileSdkVersion = 31
    val buildToolsVersion = "30.0.2"
    val minSdkVersion = 21
    val tagerSdkVersion = 30
    val versionCode = 1
    val versionName = "1.0"
}