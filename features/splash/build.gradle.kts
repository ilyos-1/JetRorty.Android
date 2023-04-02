import extensions.DOMAIN
import extensions.FRAMEWORK
import extensions.addCommonDependencies
import extensions.implementation
import extensions.kapt

plugins {
    id("commons.android-library")
    id("commons.dagger-hilt")
}

dependencies {
    FRAMEWORK
    DOMAIN

    addCommonDependencies()

    implementation(SupportLib.Splashscreen)
    // Dagger Hilt
    implementation(DaggerHiltLib.Android)
    kapt(DaggerHiltLib.Compiler)
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "com.developersancho.splash"
}
