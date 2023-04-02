plugins {
    id("commons.android-library")
    id("commons.android-compose")
}

dependencies {
    implementation(SupportLib.Splashscreen)
}
android {
    namespace = "com.developersancho.theme"
}
