package com.devgate.fusionk

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform