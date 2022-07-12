buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${Versions.gradleVersion}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Versions.daggerHiltAndroidVersion}")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}