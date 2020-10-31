package com.example.hackapp1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register_activity.*

class Register_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_activity)



            etregister_next.setOnClickListener {

            Toast.makeText(this,"Loading", Toast.LENGTH_SHORT).show()
            if(etaccess.text.trim().isNotEmpty()){

                intent = Intent(this,register_activity_page2::class.java);
                startActivity(intent)

            }else{
                Toast.makeText(this,"Access Code was Incorrect.", Toast.LENGTH_LONG).show()

            }
        }

        etaccess_call.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:6056666666")
            startActivity(intent)
        }
        Registed_user.setOnClickListener{
            intent = Intent(this,MainActivity::class.java);
            startActivity(intent)
        }


    }
}