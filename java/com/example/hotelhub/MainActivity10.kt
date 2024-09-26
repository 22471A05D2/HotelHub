package com.example.hotelhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity10 : AppCompatActivity() {
    lateinit var Single: Button
    lateinit var Double: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)
        Single=findViewById(R.id.Single)
        Double=findViewById(R.id.Double)
        Single.setOnClickListener {
            var i= Intent(this,MainActivity20::class.java)
            startActivity(i)
        }

        Double.setOnClickListener{
            var i= Intent(this,MainActivity22::class.java)
            startActivity(i)
        }
    }
}