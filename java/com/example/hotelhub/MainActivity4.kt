package com.example.hotelhub

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat

class MainActivity4 : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var btn_1:Button
lateinit var t1:TextView
    lateinit var btn_2:Button
    lateinit var btn_3:Button



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        textView=findViewById(R.id.textView)
        btn_1=findViewById(R.id.btn_1)
        btn_2=findViewById(R.id.btn_2)
        btn_3=findViewById(R.id.btn_3)
        t1=findViewById(R.id.t1)
        t1.setOnClickListener{
            val i = Intent(this, MainActivity24::class.java)
            startActivity(i)

        }




        btn_1.setOnClickListener {
        if (btn_1.isClickable()) {
            Toast.makeText(this, "location Accessed", Toast.LENGTH_SHORT).show()
            val i = Intent(this, MainActivity6::class.java)
            startActivity(i)
        }
    }
        btn_2.setOnClickListener{
            if (btn_2.isClickable()) {

                Toast.makeText(this, "Accessed ony this time", Toast.LENGTH_SHORT).show()
                val i = Intent(this, MainActivity6::class.java)
                startActivity(i)
            }
        }
        btn_3.setOnClickListener {
            if (btn_3.isClickable()){
                Toast.makeText(this, "Access failed", Toast.LENGTH_SHORT).show()

            }
        }

    }

    



}