package com.example.androidtest.application

import android.app.Application
import android.os.Handler
import android.os.Looper
import java.lang.Exception

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Handler(Looper.getMainLooper()).post(Runnable {
            while (true) {
                try {
                    Looper.loop()
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        })
    }

}