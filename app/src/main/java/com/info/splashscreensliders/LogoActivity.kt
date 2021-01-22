package com.info.splashscreensliders

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.info.splashscreensliders.view.IntroSlider

class LogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)
        Thread {
            try {
                Thread.sleep(2000)
                startActivity(Intent(this@LogoActivity, IntroSlider::class.java))
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }.start()
    }
}