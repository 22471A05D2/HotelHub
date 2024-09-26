package com.example.hotelhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar

class MainActivity14 : AppCompatActivity() {
    lateinit var wbed:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main14)
        wbed=findViewById(R.id.wbed)
        val ratingBar: RatingBar = findViewById(R.id.ratingBar)
        val rating: RatingBar = findViewById(R.id.rating)
        val rate: RatingBar = findViewById(R.id.rate)
        val starSize = 5
        ratingBar.rating = 4.0f
        rating.rating=4.3f
        rate.rating=4.5f// Set initial rating
        wbed.setOnClickListener{
            var i= Intent(this,MainActivity15::class.java)
            startActivity(i)
        }
    }
}