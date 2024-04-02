package com.example.themeal.dependencies_injection.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class TheMealApplication() : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}