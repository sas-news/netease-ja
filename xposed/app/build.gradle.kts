plugins {
    id("com.android.application")
}

android {
    namespace = "app.neteaseja.xposed"
    compileSdk = 34

    defaultConfig {
        applicationId = "app.neteaseja.xposed"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    compileOnly("de.robv.android.xposed:api:82")
}
