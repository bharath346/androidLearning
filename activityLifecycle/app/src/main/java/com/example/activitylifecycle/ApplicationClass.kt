package com.example.activitylifecycle

import android.app.Application
import android.util.Log

class ApplicationClass: Application() {
    private val APPLICATION_CYCLE = "ApplicationLifecycle"
    override fun onCreate() {
        super.onCreate()
        Log.d(APPLICATION_CYCLE, "onCreate() method is called")
    }

    override fun onTerminate() {
        super.onTerminate()
        Log.d(APPLICATION_CYCLE, "onTerminate() method is called")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.d(APPLICATION_CYCLE, "onLowMemory() method is called")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Log.d(APPLICATION_CYCLE, "onTrimMemory() method is called")
    }
}