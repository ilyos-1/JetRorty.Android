object Versions {
    const val Compose = "1.4.1"
    const val CoreKtx = "1.9.0"
}

object SupportLib {
    const val CoreKtx = "androidx.core:core-ktx:${Versions.CoreKtx}"
    const val Appcompat = "androidx.appcompat:appcompat:1.6.1"
    const val Material = "com.google.android.material:material:1.8.0"
    const val CoroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4"
    const val CoroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4"
    const val LifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1"
    const val ActivityKtx = "androidx.activity:activity-ktx:1.7.0"

    const val Splashscreen = "androidx.core:core-splashscreen:1.0.0"
    const val Timber = "com.jakewharton.timber:timber:5.0.1"
    const val Paging = "androidx.paging:paging-runtime-ktx:3.1.1"
}

object ComposeLib {
    const val Ui = "androidx.compose.ui:ui:1.4.0"
    const val Material = "androidx.compose.material:material:1.4.0"
    const val Preview = "androidx.compose.ui:ui-tooling-preview:1.4.0"
    const val Runtime = "androidx.compose.runtime:runtime:1.4.0"
    const val Foundation = "androidx.compose.foundation:foundation:1.4.0"
    const val MaterialIconCore = "androidx.compose.material:material-icons-core:1.4.0"
    const val MaterialIconExtended = "androidx.compose.material:material-icons-extended:1.4.0"
    const val Tooling = "androidx.compose.ui:ui-tooling:1.4.0"
    const val Manifest = "androidx.compose.ui:ui-test-manifest:1.4.0"

    const val Activity = "androidx.activity:activity-compose:1.7.0"
    const val ViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1"
    const val ConstraintLayout = "androidx.constraintlayout:constraintlayout-compose:1.0.1"
    const val Lottie = "com.airbnb.android:lottie-compose:6.0.0"
    const val Paging = "androidx.paging:paging-compose:1.0.0-alpha18"
    const val Coil = "io.coil-kt:coil-compose:2.3.0"
}

object NavigationLib {
    const val Navigation = "androidx.navigation:navigation-compose:2.5.3"
    const val DestinationCore = "io.github.raamcosta.compose-destinations:core:1.8.38-beta"
    const val DestinationKsp = "io.github.raamcosta.compose-destinations:ksp:1.8.38-beta"
    const val DestinationAnimation =
        "io.github.raamcosta.compose-destinations:animations-core:1.8.38-beta"
}

object AccompanistLib {
    const val Swiperefresh = "com.google.accompanist:accompanist-swiperefresh:0.30.0"
    const val Systemuicontroller = "com.google.accompanist:accompanist-systemuicontroller:0.30.0"
    const val Insets = "com.google.accompanist:accompanist-insets:0.30.0"
    const val PlaceholderMaterial = "com.google.accompanist:accompanist-placeholder-material:0.30.0"
    const val NavigationMaterial = "com.google.accompanist:accompanist-navigation-material:0.30.0"
    const val Permissions = "com.google.accompanist:accompanist-permissions:0.30.0"
    const val Pager = "com.google.accompanist:accompanist-pager:0.30.0"
    const val Indicators = "com.google.accompanist:accompanist-pager-indicators:0.30.0"
    const val Webview = "com.google.accompanist:accompanist-webview:0.30.0"
}

object NetworkLib {
    const val Moshi = "com.squareup.moshi:moshi-kotlin:1.14.0"
    const val MoshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:1.14.0"
    const val MoshiLazyAdapter = "com.serjltt.moshi:moshi-lazy-adapters:2.2"
    const val Retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
    const val RetrofitMoshi = "com.squareup.retrofit2:converter-moshi:2.9.0"
    const val Okhttp = "com.squareup.okhttp3:okhttp:5.0.0-alpha.11"
    const val LoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.1"
    const val ChuckerDebug = "com.github.chuckerteam.chucker:library:3.5.2"
    const val ChuckerRelease = "com.github.chuckerteam.chucker:library-no-op:3.5.2"

    const val KotlinXSerialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0"
    const val KotlinXSerializationRetrofit =
        "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0"
}

object StorageLib {
    const val RoomKtx = "androidx.room:room-ktx:2.5.1"
    const val RoomCompiler = "androidx.room:room-compiler:2.5.1"
    const val DatastorePref = "androidx.datastore:datastore-preferences:1.0.0"
    const val Datastore = "androidx.datastore:datastore:1.0.0"
    const val SecurityPref = "androidx.security:security-crypto-ktx:1.1.0-alpha05"
}

object FirebaseLib {
    const val Base = "com.google.android.gms:play-services-base:18.2.0"
    const val Analytic = "com.google.firebase:firebase-analytics-ktx:21.2.1"
    const val Crashlytics = "com.google.firebase:firebase-crashlytics-ktx:18.3.6"
    const val Push = "com.google.firebase:firebase-messaging-ktx:23.1.2"
    const val Config = "com.google.firebase:firebase-config-ktx:21.3.0"
}

object HuaweiLib {
    const val Core = "com.huawei.agconnect:agconnect-core:1.8.1.300"
    const val Base = "com.huawei.hms:base:6.6.0.300"
    const val Analytic = "com.huawei.hms:hianalytics:6.10.0.300"
    const val Crashlytics = "com.huawei.agconnect:agconnect-crash:1.8.1.300"
    const val Push = "com.huawei.hms:push:6.9.0.300"
    const val Config = "com.huawei.agconnect:agconnect-remoteconfig:1.8.1.300"
}

object DaggerHiltLib {
    const val Android = "com.google.dagger:hilt-android:2.45"
    const val Compiler = "com.google.dagger:hilt-android-compiler:2.45"
    const val Compose = "androidx.hilt:hilt-navigation-compose:1.0.0"
}

object TestingLib {
    const val Junit = "junit:junit:4.13.2"
    const val Coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4"
    const val Truth = "com.google.truth:truth:1.1.3"
    const val Robolectric = "org.robolectric:robolectric:4.9.2"
    const val Turbine = "app.cash.turbine:turbine:0.12.3"
    const val Mockk = "io.mockk:mockk:1.13.4"
    const val Okhttp = "com.squareup.okhttp3:mockwebserver:5.0.0-alpha.11"
}

object AndroidTestingLib {
    const val JunitExt = "androidx.test.ext:junit:1.1.5"
    const val ComposeTestJunit = "androidx.compose.ui:ui-test-junit4:1.4.0"
    const val EspressoCore = "androidx.test.espresso:espresso-core:3.5.1"
}