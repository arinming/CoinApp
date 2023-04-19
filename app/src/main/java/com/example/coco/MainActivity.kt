package com.example.coco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "onCreate")
        Timber.d("onCreate")
        Timber.tag("MainActivity").d("onCreate")
        Timber.tag("MainActivity").e("onCreate")
    }
}