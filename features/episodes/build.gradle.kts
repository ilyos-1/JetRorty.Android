import extensions.COMPONENT
import extensions.DOMAIN
import extensions.FRAMEWORK
import extensions.JETFRAMEWORK
import extensions.MODEL
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

ksp {
    arg("compose-destinations.mode", "navgraphs")
    arg("compose-destinations.moduleName", "episodes")
}

dependencies {
    JETFRAMEWORK
    FRAMEWORK
    MODEL
    DOMAIN
    PROVIDER
    THEME
    COMPONENT

    addNavigationDependencies()

    // Dagger Hilt
    implementation(DaggerHiltLib.Android)
    kapt(DaggerHiltLib.Compiler)
    implementation(DaggerHiltLib.Compose)

    // Paging
    implementation(SupportLib.Paging)
    implementation(ComposeLib.Paging)
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "com.developersancho.episodes"
}
