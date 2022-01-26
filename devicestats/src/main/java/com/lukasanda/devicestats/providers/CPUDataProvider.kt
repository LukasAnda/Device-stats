package com.lukasanda.devicestats.providers

import android.os.Build
import com.lukasanda.devicestats.models.CPUData
import java.io.RandomAccessFile

class CPUDataProvider() : BaseProvider<CPUData> {
    override fun getData(): CPUData {
        val coreCount = Runtime.getRuntime().availableProcessors()
        val abi = Build.SUPPORTED_ABIS[0]
        val frequencies = (0 until coreCount).map { core ->
            val currentFrequency = runCatching {
                RandomAccessFile("$CPU_INFO_PATH$core$CPU_CURRENT_FREQUENCY", "r").use {
                    it.readLine().toLong() / 1000
                }
            }.getOrElse { -1 }

            val minFrequency = runCatching {
                RandomAccessFile("$CPU_INFO_PATH$core$CPU_MIN_FREQUENCY", "r").use {
                    it.readLine().toLong() / 1000
                }
            }.getOrElse { -1 }

            val maxFrequency = runCatching {
                RandomAccessFile("$CPU_INFO_PATH$core$CPU_MAX_FREQUENCY", "r").use {
                    it.readLine().toLong() / 1000
                }
            }.getOrElse { -1 }

            CPUData.Frequency(minFrequency, maxFrequency, currentFrequency)
        }

        return CPUData("", abi, coreCount, false, frequencies, "", "", "", "", "")
    }

    companion object {
        const val CPU_INFO_PATH = "/sys/devices/system/cpu/cpu"
        const val CPU_CURRENT_FREQUENCY = "/cpufreq/scaling_cur_freq"
        const val CPU_MAX_FREQUENCY = "/cpufreq/cpuinfo_min_freq"
        const val CPU_MIN_FREQUENCY = "/cpufreq/cpuinfo_min_freq"
    }
}