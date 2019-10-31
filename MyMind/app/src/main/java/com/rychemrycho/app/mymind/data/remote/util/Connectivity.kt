package com.rychemrycho.app.mymind.data.remote.util

import android.content.Context
import android.net.ConnectivityManager

class Connectivity {
    fun Context.isInternetAvailable(): Boolean {
        val connectivityManager = this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return connectivityManager.activeNetworkInfo?.isConnected ?: false
    }
}