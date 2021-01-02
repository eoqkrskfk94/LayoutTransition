package com.mobinity.uianimation

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_imageview.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                val activityOptions = ActivityOptions.makeSceneTransitionAnimation(this, iv_imageview, "transitionImage")
                startActivity(intent,activityOptions.toBundle())
                println("here")
            }
            else{
                startActivity(intent)
            }

        }
    }
}