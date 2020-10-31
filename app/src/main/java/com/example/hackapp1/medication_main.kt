package com.example.hackapp1

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_medication_main.*
import kotlinx.android.synthetic.main.activity_scheduling_main.*
import kotlinx.android.synthetic.main.activity_scheduling_main.expandableLayout

class medication_main : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medication_main)

        medication_schedule.setOnClickListener {
            if (expandableLayout_btn.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(medication_schedule,AutoTransition())
                expandableLayout_btn.visibility = View.VISIBLE
            } else {
                TransitionManager.beginDelayedTransition(medication_schedule, AutoTransition())
                expandableLayout_btn.visibility = View.GONE
            }
        }

        view_prescription.setOnClickListener {
            if (expandableLayout.visibility == View.GONE) {
                TransitionManager.beginDelayedTransition(view_prescription,AutoTransition())
                expandableLayout.visibility = View.VISIBLE
            } else {
                TransitionManager.beginDelayedTransition(view_prescription, AutoTransition())
                expandableLayout.visibility = View.GONE
            }
        }



    }
}