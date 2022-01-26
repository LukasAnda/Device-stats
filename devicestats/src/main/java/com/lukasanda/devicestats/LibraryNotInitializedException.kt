package com.lukasanda.devicestats

import java.lang.Exception

sealed class LibraryExceptions : Exception() {
    object NotInitialized : LibraryExceptions()
    object InitException : LibraryExceptions()
}
