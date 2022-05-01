@file:Suppress("PropertyName")

import de.fayard.refreshVersions.core.versionFor

// Plugins —————————————————————————————————————————————————————————————————————————————————————————————————————————————
plugins {
    kotlin("android")
    id("com.android.application")
}

// Properties ——————————————————————————————————————————————————————————————————————————————————————————————————————————
val ORG_IDENTIFIER: String by rootProject.extra
val ANDROID_APP_VERSION: String by rootProject.extra
val ANDROID_APP_BUILD_NUMBER: Int by rootProject.extra
val TARGET_ANDROID_SDK_VERSION: Int by rootProject.extra
val MIN_ANDROID_SDK_VERSION: Int by rootProject.extra
val JVM_BYTECODE_VERSION: JavaVersion by rootProject.extra

// Android —————————————————————————————————————————————————————————————————————————————————————————————————————————————
android {
    namespace = "$ORG_IDENTIFIER.android"
    compileSdk = TARGET_ANDROID_SDK_VERSION

    defaultConfig {
        applicationId = ORG_IDENTIFIER
        minSdk = MIN_ANDROID_SDK_VERSION
        targetSdk = TARGET_ANDROID_SDK_VERSION
        versionCode = ANDROID_APP_BUILD_NUMBER
        versionName = ANDROID_APP_VERSION
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    compileOptions {
        sourceCompatibility = JVM_BYTECODE_VERSION
        targetCompatibility = sourceCompatibility
    }
    kotlinOptions {
        jvmTarget = "${compileOptions.sourceCompatibility}"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = versionFor(AndroidX.compose.ui)
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

// Dependencies ————————————————————————————————————————————————————————————————————————————————————————————————————————
dependencies {
    implementation(project(":dotainfo-shared"))

    // Core
    implementation(AndroidX.core.ktx)

    // Lifecycle
    implementation(AndroidX.lifecycle.runtimeKtx)

    // Activity
    implementation(AndroidX.activity.compose)

    // Compose
    implementation(AndroidX.compose.ui)
    implementation(AndroidX.compose.ui.toolingPreview)

    // Material
    implementation("androidx.compose.material:material:${versionFor(AndroidX.compose.ui)}")
}