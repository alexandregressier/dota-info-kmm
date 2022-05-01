@file:Suppress("PropertyName")

import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

// Plugins —————————————————————————————————————————————————————————————————————————————————————————————————————————————
plugins {
    id("com.osacky.doctor")
    kotlin("multiplatform") apply false
    kotlin("native.cocoapods") apply false
    kotlin("android") apply false
    id("com.android.application") apply false
    id("com.android.library") apply false
}

// Properties ——————————————————————————————————————————————————————————————————————————————————————————————————————————
apply("properties.gradle.kts")
val GRADLE_VERSION: String by extra

// Gradle Doctor ———————————————————————————————————————————————————————————————————————————————————————————————————————
doctor {
    disallowCleanTaskDependencies.set(false)
}

// Projects ————————————————————————————————————————————————————————————————————————————————————————————————————————————
subprojects {
    afterEvaluate {
        project.extensions.findByType<KotlinMultiplatformExtension>()?.apply {
            sourceSets.removeAll { sourceSet ->
                setOf(
                    "androidAndroidTestRelease",
                    "androidTestFixtures",
                    "androidTestFixturesDebug",
                    "androidTestFixturesRelease",
                ).contains(sourceSet.name)
            }
        }
    }
}

// Tasks ———————————————————————————————————————————————————————————————————————————————————————————————————————————————
tasks {
    wrapper {
        gradleVersion = GRADLE_VERSION
    }
    register<Delete>("clean") {
        delete(rootProject.buildDir)
    }
}