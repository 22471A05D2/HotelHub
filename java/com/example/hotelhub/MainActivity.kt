package com.example.hotelhub

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var ImageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ImageView = findViewById(R.id.imageView)

        ImageView.setOnClickListener{
            val i=Intent(
                this,
                MainActivity2::class.java
            )
            startActivity(i)
        }



    }
}
