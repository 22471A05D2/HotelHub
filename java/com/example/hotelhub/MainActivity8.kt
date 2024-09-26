package com.example.hotelhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity8 : AppCompatActivity() {
    lateinit var Single:TextView
    lateinit var Double:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
        Single=findViewById(R.id.Single)
        Double=findViewById(R.id.Double)

        Single.setOnClickListener {
            var i= Intent(this,MainActivity11::class.java)
            startActivity(i)
        }

        Double.setOnClickListener{
            var i=Intent(this,MainActivity14::class.java)
            startActivity(i)
        }


    }
}