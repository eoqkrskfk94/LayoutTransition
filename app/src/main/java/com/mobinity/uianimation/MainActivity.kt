package com.mobinity.uianimation

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val homeFragment = FirstFragment()
        val sideFragment = SecondFragment()

        supportFragmentManager.beginTransaction().replace(R.id.frame_layout, homeFragment).commit()

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_1 -> {
                    // Respond to navigation item 1 reselection
                    println("sds")
                    supportFragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right).replace(R.id.frame_layout, homeFragment).commit()
                    true

                }
                R.id.page_2 -> {
                    // Respond to navigation item 2 reselection
                    supportFragmentManager.beginTransaction().setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left).replace(R.id.frame_layout, sideFragment).commit()
                    true
                }

                else -> false
            }
        }
    }
}