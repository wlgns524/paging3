plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdk = App.compileSdk

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

    testOptions {
        unitTests {
            isIncludeAndroidResources = true
            isReturnDefaultValues = true

        }
    }
}

dependencies {
    implementation(project(":data"))

    implementation(Core.coreKtx)
    implementation(Core.stdLib)

    implementation(Rx.rxJava)
    implementation(DI.daggerHiltAndroid)

    kapt(DI.daggerHiltAndroidAnnotation)

    implementation(Remote.retrofit)
    api(Remote.retrofitConverter)
    api(Remote.retrofitAdapter)
    implementation(Remote.okHttp)
    implementation(Remote.loggingInterceptor)
}

