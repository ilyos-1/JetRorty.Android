import extensions.FRAMEWORK
import extensions.LOCAL
import extensions.MODEL
import extensions.REMOTE
import extensions.REPOSITORY
import extensions.implementation
import extensions.kapt

plugins {
    id("commons.android-library")
    id("dagger.hilt.android.plugin")
    id("codeanalyzetools.jacoco-report")
}

dependencies {
    FRAMEWORK
    MODEL
    LOCAL
    REMOTE
    REPOSITORY

    // Dagger Hilt
    implementation(DaggerHiltLib.Android)
    kapt(DaggerHiltLib.Compiler)
    // Paging
    implementation(SupportLib.Paging)
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "com.developersancho.domain"
}
