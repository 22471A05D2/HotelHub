package com.example.hotelhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity6 : AppCompatActivity() {
    lateinit var room_btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        room_btn=findViewById(R.id.room_btn)
        room_btn.setOnClickListener{
            val i = Intent(this, MainActivity7::class.java)
            startActivity(i)
        }



    }
}