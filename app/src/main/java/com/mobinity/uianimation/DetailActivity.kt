package com.mobinity.uianimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.*
import android.view.animation.OvershootInterpolator

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        setContentView(R.layout.activity_detail)

//        window.sharedElementEnterTransition = TransitionSet().apply {
//            //bounce 정도 설정
//            interpolator = OvershootInterpolator(1.0f)
//            ordering = TransitionSet.ORDERING_TOGETHER
//            addTransition(ChangeBounds().apply {
//                pathMotion = ArcMotion()
//            })
//            addTransition(ChangeTransform())
//            addTransition(ChangeClipBounds())
//            addTransition(ChangeImageTransform())
//            println("here")
//        }

        super.onCreate(savedInstanceState)
    }

}