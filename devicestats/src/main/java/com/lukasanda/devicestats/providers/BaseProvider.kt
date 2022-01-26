package com.lukasanda.devicestats.providers

interface BaseProvider<T> {
    fun getData() : T
}