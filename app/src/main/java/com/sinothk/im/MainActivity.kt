package com.sinothk.im

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sinothk.im.config.IMConfig

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Thread({
            IMConfig.init(applicationContext)
        }).start()
    }
}
