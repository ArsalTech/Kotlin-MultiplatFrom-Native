package com.devgate.fusionk


class IOSPlatform: Platform {
    override val name: String = "iOS 17"
}

actual fun getPlatform(): Platform = IOSPlatform()