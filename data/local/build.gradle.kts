import extensions.FRAMEWORK
import extensions.MODEL
import extensions.implementation
import extensions.kapt
import extensions.ksp

plugins {
    id("commons.android-library")
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
    id("codeanalyzetools.jacoco-report")
}

dependencies {
    FRAMEWORK
    MODEL

    implementation(StorageLib.RoomKtx)
    ksp(StorageLib.RoomCompiler)

    // Dagger Hilt
    implementation(DaggerHiltLib.Android)
    kapt(DaggerHiltLib.Compiler)
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "com.developersancho.local"
}
