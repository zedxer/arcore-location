package com.corebuild.arlocation.demo.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.corebuild.arlocation.demo.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(
            {
                //changed here
                startActivity(Intent(this, AugmentedRealityLocationActivity::class.java))
                this.finish()
            }, (2500).toLong()
        )

    }
}