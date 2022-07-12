plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(App.compileSdk)

    defaultConfig {
    }

    defaultConfig {
        minSdk = App.minSdk
        targetSdk = App.targetSdk
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":data"))

    implementation(Core.coreKtx)
    implementation(Core.stdLib)
    implementation(Rx.rxJava)

    implementation(DI.daggerHiltAndroid)
    kapt(DI.daggerHiltAndroidAnnotation)

    api(Local.roomRuntime)
    kapt(Local.roomCompiler)
    implementation(Local.roomRxjava)
}