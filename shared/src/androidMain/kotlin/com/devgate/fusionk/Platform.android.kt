package com.devgate.fusionk

class AndroidPlatform : Platform {
    override val name: String = "K ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()