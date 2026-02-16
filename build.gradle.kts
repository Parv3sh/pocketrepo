plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dagger.hilt.android.plugin")
    id("io.gitlab.arturbosch.detekt") version "1.22.0"
}

android {
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.pocketrepo"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFile(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

detekt {
    config = files("$rootDir/detekt-config.yml")
    parallel = true
    buildUponDefaultConfig = true
    allRules = false
}