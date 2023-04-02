plugins {
    id("commons.android-library")
    id("commons.android-compose")
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "com.developersancho.provider"
}
