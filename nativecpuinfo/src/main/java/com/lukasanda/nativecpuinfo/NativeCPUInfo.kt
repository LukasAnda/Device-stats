package com.lukasanda.nativecpuinfo

class NativeCPUInfo {

    /**
     * A native method that is implemented by the 'cpuinfo' native library,
     * which is packaged with this application.
     */
    external fun getCpuName(): String
    external fun hasARMNeon(): Boolean
    external fun getL1dCaches(): IntArray?
    external fun getL1iCaches(): IntArray?
    external fun getL2Caches(): IntArray?
    external fun getL3Caches(): IntArray?
    external fun getL4Caches(): IntArray?

    companion object {
        // Used to load the 'cpuinfo' library on application startup.
        init {
            System.loadLibrary("nativecpuinfo")
        }
    }

    fun cpuName() = getCpuName()
}