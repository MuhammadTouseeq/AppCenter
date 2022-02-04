package com.smartdev.appcenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.crashes.Crashes

import com.microsoft.appcenter.analytics.Analytics

import com.microsoft.appcenter.AppCenter




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(
            application, "3cac0ebe-8c32-4314-9aca-6afd4a97fdf1",
            Analytics::class.java, Crashes::class.java
        )
    }
}