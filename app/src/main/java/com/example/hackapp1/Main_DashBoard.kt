package com.example.hackapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main__dash_board.*

class Main_DashBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main__dash_board)

        schedule_card.setOnClickListener {
            intent = Intent(this,scheduling_main::class.java);
            startActivity(intent)
        }

        reports_card.setOnClickListener {
            intent = Intent(this,reports_main::class.java);
            startActivity(intent)
        }

        medication_card.setOnClickListener {
            intent = Intent(this,medication_main::class.java);
            startActivity(intent)
        }

        achivements_card.setOnClickListener {
            intent = Intent(this,achivements_main::class.java);
            startActivity(intent)
        }
    }
}