package com.example.hackapp1

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main__dash_board.*
import kotlinx.android.synthetic.main.activity_scheduling_main.*

class scheduling_main : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scheduling_main)

        upschedule_card.setOnClickListener {
            if (expandableLayout.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(upschedule_card,AutoTransition())
                expandableLayout.visibility = View.VISIBLE
            } else {
                TransitionManager.beginDelayedTransition(upschedule_card, AutoTransition())
                expandableLayout.visibility = View.GONE
            }
        }

        uppast_card.setOnClickListener {
            if (expandableLayout.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(uppast_card,AutoTransition())
                pastexpandableLayout.visibility = View.VISIBLE
            } else {
                TransitionManager.beginDelayedTransition(uppast_card, AutoTransition())
                pastexpandableLayout.visibility = View.GONE
            }
        }

        schedule_btn.setOnClickListener {
            intent = Intent(this, scheduling_main_page::class.java);
            startActivity(intent)
        }



    }
}