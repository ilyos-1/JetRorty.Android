import extensions.COMPONENT
import extensions.FEATURE_CHARACTERS
import extensions.FEATURE_EPISODES
import extensions.FEATURE_LOCATIONS
import extensions.FEATURE_SETTINGS
import extensions.PROVIDER
import extensions.THEME
import extensions.addNavigationDependencies

plugins {
    id("commons.android-feature")
    id("commons.android-compose")
    id("com.google.devtools.ksp")
}

ksp {
    arg("compose-destinations.mode", "navgraphs")
    arg("compose-destinations.moduleName", "home")
}

dependencies {
    PROVIDER
    THEME
    COMPONENT

    FEATURE_CHARACTERS
    FEATURE_EPISODES
    FEATURE_LOCATIONS
    FEATURE_SETTINGS

    addNavigationDependencies()
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "com.developersancho.home"
}
