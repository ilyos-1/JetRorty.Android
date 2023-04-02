buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:7.4.2")
        classpath("com.huawei.agconnect:agcp:1.6.5.300")
    }
}

plugins {
    id("com.google.devtools.ksp") version "1.8.0-1.0.9" apply false
}

apply<codequality.DependencyUpdatePlugin>()

apply(plugin = "codeanalyzetools.jacoco-multi-report")

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}