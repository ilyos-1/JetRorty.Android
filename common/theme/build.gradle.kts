plugins {
    id("commons.android-library")
    id("commons.android-compose")
}

dependencies {
    implementation(SupportLib.Splashscreen)
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "com.developersancho.theme"
}
