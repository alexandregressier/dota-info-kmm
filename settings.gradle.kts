// Plugins —————————————————————————————————————————————————————————————————————————————————————————————————————————————
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

plugins {
    id("de.fayard.refreshVersions") version "0.40.1"
}

// refreshVersions —————————————————————————————————————————————————————————————————————————————————————————————————————
refreshVersions {
    rejectVersionIf {
        candidate.stabilityLevel.isLessStableThan(current.stabilityLevel)
    }
}

// Dependencies ————————————————————————————————————————————————————————————————————————————————————————————————————————
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

// Projects ————————————————————————————————————————————————————————————————————————————————————————————————————————————
rootProject.name = "dota-info-kmm"
include(
    ":dotainfo-shared",
    ":dotainfo-android-app",
)