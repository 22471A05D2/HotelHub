package com.example.hotelhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity7 : AppCompatActivity() {

       lateinit var one:TextView
       lateinit var two:TextView
       lateinit var three:TextView
       lateinit var four:TextView
       lateinit var five:TextView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main7)

            one=findViewById(R.id.one)
            two=findViewById(R.id.two)
            three=findViewById(R.id.three)
            four=findViewById(R.id.four)
            five=findViewById(R.id.five)

            one.setOnClickListener {
                var i= Intent(this,MainActivity8::class.java)
                startActivity(i)
            }
            two.setOnClickListener {
                var i= Intent(this,MainActivity8::class.java)
                startActivity(i)
            }

            three.setOnClickListener {
                var j=Intent(this,MainActivity9::class.java)
                startActivity(j)
            }
            four.setOnClickListener {
                var i= Intent(this,MainActivity10::class.java)
                startActivity(i)
            }
            five.setOnClickListener {
                var k=Intent(this,MainActivity10::class.java)
                startActivity(k)
            }

        }
    }