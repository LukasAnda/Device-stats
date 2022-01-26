package com.lukasanda.devicestats.models

data class StorageData(
    val freeInternalMemorySize: Long,
    val totalInternalMemorySize: Long,
    val freeExternalMemorySize: Long,
    val totalExternalMemorySize: Long,
)
