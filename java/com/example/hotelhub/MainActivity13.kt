package com.example.hotelhub

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity13 : AppCompatActivity() {
    lateinit var  t1:TextView
    lateinit var t2:ImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)
        t1=findViewById(R.id.t1)
        t2=findViewById(R.id.t2)


        t2.setOnClickListener{
            var i= Intent(this,MainActivity7::class.java)
            startActivity(i)

        }
        t1.setOnClickListener{
            var i= Intent(this,MainActivity7::class.java)
            startActivity(i)
        }


        }


    }
