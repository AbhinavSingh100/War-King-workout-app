plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.testing.warking_workoutapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.testing.warking_workoutapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
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
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.database)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation(libs.volley)
    dependencies {

        // add the dependency for the Google AI client SDK for Android
        implementation("com.google.ai.client.generativeai:generativeai:0.7.0")

        // Required for one-shot operations (to use `ListenableFuture` from Guava Android)
        implementation("com.google.guava:guava:31.0.1-android")

        // Required for streaming operations (to use `Publisher` from Reactive Streams)
        implementation("org.reactivestreams:reactive-streams:1.0.4")
    }

    implementation(platform("com.google.firebase:firebase-bom:33.3.0"))
    implementation("com.google.firebase:firebase-database")
    implementation("com.github.bumptech.glide:glide:4.12.0")
}