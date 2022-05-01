// Applications ————————————————————————————————————————————————————————————————————————————————————————————————————————
val ORG_IDENTIFIER by extra("dev.gressier.dotainfo")

// Project Versions ————————————————————————————————————————————————————————————————————————————————————————————————————
val SHARED_MODULE_VERSION by extra("0.1.0")
val ANDROID_APP_VERSION by extra("0.1.0")
val ANDROID_APP_BUILD_NUMBER by extra(1)
val IOS_APP_VERSION by extra("0.1.0")
val IOS_APP_BUILD_NUMBER by extra(1)

// Android —————————————————————————————————————————————————————————————————————————————————————————————————————————————
val TARGET_ANDROID_SDK_VERSION by extra(32)
val MIN_ANDROID_SDK_VERSION by extra(26)

// iOS —————————————————————————————————————————————————————————————————————————————————————————————————————————————————
val TARGET_IOS_VERSION by extra("14.1")

// Build ———————————————————————————————————————————————————————————————————————————————————————————————————————————————
val GRADLE_VERSION by extra("7.4.2")
val JVM_BYTECODE_VERSION by extra(JavaVersion.VERSION_11)