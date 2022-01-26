package com.lukasanda.devicestats

import android.app.Activity
import android.app.ActivityManager
import android.app.Application
import com.lukasanda.devicestats.models.RAMData
import com.lukasanda.nativecpuinfo.NativeCPUInfo


object DeviceStats {
    private lateinit var application: Application
    private lateinit var activityManager: ActivityManager

    private fun ensureInit() {
        if (!this::application.isInitialized) {
            throw LibraryExceptions.NotInitialized
        }
    }

    @Throws(LibraryExceptions.InitException::class)
    fun init(application: Application) {
        this.application = application
        activityManager = application.getSystemService(Activity.ACTIVITY_SERVICE) as? ActivityManager ?: throw LibraryExceptions.InitException
    }

    fun getRamStats(): RAMData {
        ensureInit()
        val mi = ActivityManager.MemoryInfo()
        activityManager.getMemoryInfo(mi)
        return RAMData(mi.availMem, mi.totalMem, mi.availMem.toDouble() / mi.totalMem)
    }

    fun cpuName() = NativeCPUInfo().getCpuName()


}