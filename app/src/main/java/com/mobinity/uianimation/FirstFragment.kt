package com.mobinity.uianimation

import android.app.ActivityOptions
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_first, container, false)

        view.iv_imageview.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                val activityOptions = ActivityOptions.makeSceneTransitionAnimation(activity, view.iv_imageview, "transitionImage")
                startActivity(intent,activityOptions.toBundle())

            }
            else{
                startActivity(intent)
            }

        }


        return view
    }


}