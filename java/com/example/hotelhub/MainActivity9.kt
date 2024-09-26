package com.example.hotelhub

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity9 : AppCompatActivity() {
    lateinit var Single: Button
    lateinit var Double: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)
        Single=findViewById(R.id.Single)
        Double=findViewById(R.id.Double)

        Single.setOnClickListener {
            var i= Intent(this,MainActivity16::class.java)
            startActivity(i)
        }

        Double.setOnClickListener{
            var i= Intent(this,MainActivity18::class.java)
            startActivity(i)
        }

    }
}