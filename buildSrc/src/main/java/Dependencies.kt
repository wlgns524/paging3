object App {
    const val compileSdk = 30
    const val minSdk = 24
    const val targetSdk = 30
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val buildTools = "30.0.3"
}

object View {
    //appcompat
    const val appcompat: String = "androidx.appcompat:appcompat:${Versions.appcompatVersion}"

    //material
    const val material: String = "com.google.android.material:material:${Versions.materialVersion}"

    //constraintLayout
    const val constraintLayout: String =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintVersion}"

    //swipeRefresh
    const val swipeRefreshLayout: String =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayoutVersion}"

    //glide
    const val glide: String = "com.github.bumptech.glide:glide:${Versions.glideVersion}"

    //fragment
    const val fragmentKtx: String = "androidx.fragment:fragment-ktx:${Versions.fragmentKtxVersion}"

    //paging

    const val pagingRuntime: String = "androidx.paging:paging-runtime:${Versions.pagingVersion}"
    const val pagingRxjava2: String = "androidx.paging:paging-rxjava2:${Versions.pagingVersion}"
    const val pagingCommon: String = "androidx.paging:paging-common:${Versions.pagingVersion}"


    //navigation
    const val navigationFragment: String =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val navigationUi: String =
        "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"
}

object LifeCycle {
    const val lifecycleViewModel: String =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModelKtxVersion}"
    const val lifecycleSavedstate: String =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycleViewModelKtxVersion}"
    const val lifecycleCommon: String =
        "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycleVersion}"
    const val lifecycleService: String =
        "androidx.lifecycle:lifecycle-service:${Versions.lifecycleVersion}"
    const val lifecycleProcess: String =
        "androidx.lifecycle:lifecycle-process:${Versions.lifecycleVersion}"
}

object Remote {
    const val retrofit: String = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val retrofitConverter: String =
        "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"

    const val loggingInterceptor: String =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpVersion}"
    const val retrofitAdapter: String =
        "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofitVersion}"
    const val okHttp: String = "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"

    const val stetho: String = "com.facebook.stetho:stetho:${Versions.stethoVersion}"
    const val stethoOkHttp: String = "com.facebook.stetho:stetho-okhttp3:${Versions.stethoVersion}"
}

object Test {
    const val junit: String = "junit:junit:${Versions.junitVersion}"
    const val testJunit: String = "androidx.test.ext:junit:${Versions.testJunitVersion}"
    const val mockwebserver: String =
        "com.squareup.okhttp3:mockwebserver:${Versions.mockWebServerVersion}"
    //androidx.arch.core.executor.testing.InstantTaskExecutorRule 사용을 위함
    const val coreTesting: String =
        "androidx.arch.core:core-testing:mockwebserver:${Versions.coreTestingVersion}"
    const val robolectric: String = "org.robolectric:robolectric:${Versions.robolectricVersion}"

}

object Rx {
    const val rxJava: String = "io.reactivex.rxjava2:rxjava:${Versions.rxJavaVersion}"
    const val rxAndroid: String = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroidVersion}"
    const val rxKotlin: String = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlinVersion}"
}

object DI {
    const val daggerHiltAndroid: String =
        "com.google.dagger:hilt-android:${Versions.daggerHiltAndroidVersion}"
    const val hiltViewModel: String =
        "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.androidHiltVersion}"
    const val daggerHiltAndroidAnnotation: String =
        "com.google.dagger:hilt-android-compiler:${Versions.daggerHiltAndroidVersion}"
    const val jetpackHiltCompilerAnnotation: String =
        "androidx.hilt:hilt-compiler:${Versions.androidHiltVersion}"
}

object Coroutines {
    const val core: String =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
}

object Core {
    const val coreKtx: String = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val stdLib: String = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
}

object Local {
    const val roomRxjava = "androidx.room:room-rxjava2:${Versions.roomVersion}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
}

object Versions {
    const val gradleVersion = "7.0.4"
    const val kotlinVersion = "1.5.21"
    const val retrofitVersion = "2.9.0"
    const val fragmentKtxVersion = "1.3.5"
    const val okHttpVersion = "4.8.0"
    const val stethoVersion = "1.5.1"
    const val coreKtxVersion = "1.3.0"
    const val rxJavaVersion = "2.2.19"
    const val rxKotlinVersion = "2.4.0"
    const val rxAndroidVersion = "2.1.1"
    const val navigationVersion = "2.3.1"
    const val pagingVersion = "3.0.0"
    const val appcompatVersion = "1.2.0"
    const val constraintVersion = "1.1.3"
    const val roomVersion = "2.3.0"
    const val materialVersion = "1.2.1"
    const val swipeRefreshLayoutVersion = "1.1.0"
    const val glideVersion = "4.11.0"
    const val lifecycleViewModelKtxVersion = "2.2.0"
    const val lifecycleVersion = "2.2.0"
    const val daggerHiltAndroidVersion = "2.36"
    const val androidHiltVersion = "1.0.0-alpha02"
    const val coroutinesVersion = "1.6.0"
    const val junitVersion = "4.13.2"
    const val testJunitVersion = "1.1.3"
    const val mockWebServerVersion = "4.9.3"
    const val coreTestingVersion = "2.1.0"
    const val robolectricVersion = "4.8"
}