package com.example.hotelhub

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity24 : AppCompatActivity() {
    lateinit var checkBox: CheckBox

    lateinit var button1:Button
    lateinit var button2: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main24)
        checkBox=findViewById(R.id.my_checkbox1)
        checkBox=findViewById(R.id.my_checkbox2)
        checkBox=findViewById(R.id.my_checkbox3)

        button1=findViewById(R.id.button1)
        button2=findViewById(R.id.button2)



        button1.setOnClickListener{
            var i= Intent(this,MainActivity7::class.java)
            startActivity(i)
        }


        button2.setOnClickListener{
            var i= Intent(this,MainActivity6::class.java)
            startActivity(i)
            Toast.makeText(this,"You cancelled your booked room",Toast.LENGTH_SHORT).show()
            Toast.makeText(this,"Book a New Room",Toast.LENGTH_SHORT).show()
        }


        // Set an OnCheckedChangeListener to handle check/uncheck events
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Code to execute when the checkbox is checked
                println("Checkbox is checked")



            } else {
                // Code to execute when the checkbox is unchecked
                println("Checkbox is unchecked")
            }
        }
    }
}


