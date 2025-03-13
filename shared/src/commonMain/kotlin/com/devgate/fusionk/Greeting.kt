package com.devgate.fusionk

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "  Fusion, ${platform.name}!"
    }
}