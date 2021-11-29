package com.aplas.library_aplas_monitoring

import android.util.Log

class libDebug {
    companion object Builder {
        private const val TAG = "LIB_EXAMPLE_ANDROID"

        fun i(message:String){
            Log.i(TAG, message)
        }
    }
}