import extensions.COMPONENT
import extensions.DOMAIN
import extensions.FRAMEWORK
import extensions.JETFRAMEWORK
import extensions.PROVIDER
import extensions.THEME
import extensions.addNavigationDependencies
import extensions.implementation
import extensions.kapt

plugins {
    id("commons.android-feature")
    id("commons.android-compose")
    id("commons.dagger-hilt")
    id("com.google.devtools.ksp")
}

dependencies {
    JETFRAMEWORK
    FRAMEWORK
    DOMAIN
    PROVIDER
    THEME
    COMPONENT

    addNavigationDependencies()

    // Dagger Hilt
    implementation(DaggerHiltLib.Android)
    kapt(DaggerHiltLib.Compiler)
    implementation(DaggerHiltLib.Compose)
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "com.developersancho.welcome"
}
