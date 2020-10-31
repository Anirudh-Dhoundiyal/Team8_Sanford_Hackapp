package com.example.hackapp1


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register_activity.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

            Toast.makeText(this,"Loading",Toast.LENGTH_SHORT).show()
            if (etPhone.text.trim().isNotEmpty() && etPassword.text.trim().isNotEmpty()){
                intent = Intent(this,Main_DashBoard::class.java);
                startActivity(intent)

            }else{
                Toast.makeText(this,"Number or Password was incorrect.",Toast.LENGTH_LONG).show()

            }
        }

        Register.setOnClickListener {
            intent = Intent(this,Register_activity::class.java);
        startActivity(intent)
        }

        FrgtPass.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:6056666666")
            startActivity(intent)
        }

    }


}

