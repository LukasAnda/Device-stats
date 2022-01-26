package com.lukasanda.devicestats.utils

private const val FACTOR = 1024L


val Long.kb: Float
    get() = this.toFloat() / FACTOR

val Long.mb: Float
    get() = this.toFloat() / (FACTOR * FACTOR)

val Long.gb: Float
    get() = this.toFloat() / (FACTOR * FACTOR * FACTOR)

val Long.tb: Float
    get() = this.toFloat() / (FACTOR * FACTOR * FACTOR * FACTOR)
