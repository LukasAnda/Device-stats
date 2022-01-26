package com.lukasanda.devicestats.providers

import android.app.ActivityManager
import com.lukasanda.devicestats.models.RAMData

class RAMDataProvider(private val activityManager: ActivityManager) : BaseProvider<RAMData> {
    override fun getData(): RAMData {
        val memoryInfo = ActivityManager.MemoryInfo()
        activityManager.getMemoryInfo(memoryInfo)

        return RAMData(memoryInfo.availMem, memoryInfo.totalMem, memoryInfo.availMem.toDouble() / memoryInfo.totalMem.toDouble() * 100.0)
    }

}