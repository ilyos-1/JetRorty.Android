import extensions.FRAMEWORK
import extensions.MODEL
import extensions.addNetworkDependencies
import extensions.implementation
import extensions.kapt

plugins {
    id("commons.android-library")
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
    id("codeanalyzetools.jacoco-report")
}

dependencies {
    FRAMEWORK
    MODEL

    // Network
    addNetworkDependencies()

    // Dagger Hilt
    implementation(DaggerHiltLib.Android)
    kapt(DaggerHiltLib.Compiler)
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "com.developersancho.remote"
}
