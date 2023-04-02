package commons

import com.android.build.api.dsl.BuildType
import extensions.addCommonDependencies
import extensions.addTestDependencies
import gradle.kotlin.dsl.accessors._5c8c6bc9348d2bc79fb6ce061d552d81.android
import gradle.kotlin.dsl.accessors._5c8c6bc9348d2bc79fb6ce061d552d81.kotlin
import gradle.kotlin.dsl.accessors._5c8c6bc9348d2bc79fb6ce061d552d81.kotlinOptions
import gradle.kotlin.dsl.accessors._5c8c6bc9348d2bc79fb6ce061d552d81.sourceSets
import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.dependencies
import java.io.File

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.parcelize")
    id("org.jetbrains.kotlin.kapt")
}

android {
    compileSdk = Configs.CompileSdk

    defaultConfig {
        minSdk = Configs.MinSdk
        targetSdk = Configs.TargetSdk
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            buildConfigStringField("BASE_URL", Configs.Release.BaseUrl)
            buildConfigStringField("DB_NAME", Configs.Release.DbName)
        }

        debug {
            buildConfigStringField("BASE_URL", Configs.Debug.BaseUrl)
            buildConfigStringField("DB_NAME", Configs.Debug.DbName)
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
        freeCompilerArgs = Configs.FreeCompilerArgs
    }

    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

android.libraryVariants.all {
    val variantName = name
    kotlin.sourceSets {
        getByName("main") {
            kotlin.srcDir(File("build/generated/ksp/$variantName/kotlin"))
        }
    }
}

fun BuildType.buildConfigStringField(name: String, value: String) {
    this.buildConfigField("String", name, "\"$value\"")
}

dependencies {
    // Common
    addCommonDependencies()
    // Test
    addTestDependencies()
}