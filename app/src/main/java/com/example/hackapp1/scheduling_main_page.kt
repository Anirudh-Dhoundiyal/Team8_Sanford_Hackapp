package com.example.hackapp1

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_scheduling_main_page.*

class scheduling_main_page : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scheduling_main_page)


        monday_card.setOnClickListener {
            if (mondayexpandableLayout.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(monday_card,AutoTransition())
                mondayexpandableLayout.visibility = View.VISIBLE
            } else {
                TransitionManager.beginDelayedTransition(monday_card, AutoTransition())
                mondayexpandableLayout.visibility = View.GONE
            }
        }


    }
}