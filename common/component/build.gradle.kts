import extensions.JETFRAMEWORK
import extensions.THEME

plugins {
    id("commons.android-library")
    id("commons.android-compose")
}

dependencies {
    THEME
    JETFRAMEWORK
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "com.developersancho.component"
}
