package com.example.coco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import timber.log.Timber

// Splash 화면 만들기
// handler -> 3초 뒤에 다른 액티비티로 이동
// https://developer.android.com/develop/ui/views/launch/splash-screen

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()   // splashScreen 뜨게 하기

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        Timber.d("onCreate")
    }
}