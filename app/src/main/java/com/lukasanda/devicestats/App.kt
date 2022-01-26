package com.lukasanda.devicestats

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        DeviceStats.init(this)
    }
}