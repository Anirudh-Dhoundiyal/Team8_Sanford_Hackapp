package com.example.hackapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register_page2.*

class register_activity_page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page2)

        etregister_finish.setOnClickListener {

            Toast.makeText(this,"Loading", Toast.LENGTH_SHORT).show()
            if (etnewpass.text.trim() == etnewpass_confrm.text.trim()){
                intent = Intent(this,Main_DashBoard::class.java);
                startActivity(intent)

            }else{
                Toast.makeText(this,"Password was not confirmed.", Toast.LENGTH_LONG).show()

            }
        }






    }
}