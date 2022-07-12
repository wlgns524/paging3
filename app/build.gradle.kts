plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = App.compileSdk
    buildToolsVersion = App.buildTools

    defaultConfig {
        applicationId = "com.study.paging3"
        minSdk = App.minSdk
        targetSdk = App.targetSdk
        versionCode = App.versionCode
        versionName = App.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
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

    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":remote"))
    implementation(project(":local"))

    implementation(Core.coreKtx)
    implementation(Core.stdLib)

    implementation(View.appcompat)
    implementation(View.material)
    implementation(View.constraintLayout)
    implementation(View.swipeRefreshLayout)
    implementation(View.navigationFragment)
    implementation(View.navigationUi)
    implementation(View.fragmentKtx)
    implementation(View.pagingRuntime)
    implementation(View.pagingCommon)
    implementation(View.glide)

    implementation(LifeCycle.lifecycleViewModel)
    implementation(LifeCycle.lifecycleSavedstate)
    implementation(LifeCycle.lifecycleCommon)
    implementation(LifeCycle.lifecycleService)
    implementation(LifeCycle.lifecycleProcess)

    implementation(DI.daggerHiltAndroid)
    implementation(DI.hiltViewModel)

    kapt(DI.daggerHiltAndroidAnnotation)
    kapt(DI.jetpackHiltCompilerAnnotation)

    implementation(Rx.rxAndroid)
    implementation(Rx.rxJava)
    implementation(Rx.rxKotlin)

    implementation("gun0912.ted:tedpermission:2.2.3")
}