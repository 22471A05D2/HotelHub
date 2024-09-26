package com.example.hotelhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar

class MainActivity22 : AppCompatActivity() {
    lateinit var s1:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main22)
        s1=findViewById(R.id.s1)
        val ratingBar: RatingBar = findViewById(R.id.ratingBar)
        val rating: RatingBar = findViewById(R.id.rating)
        val rate: RatingBar = findViewById(R.id.rate)
        val starSize = 5
        ratingBar.rating = 4.0f
        rating.rating=4.3f
        rate.rating=4.5f// Set initial rating
        s1.setOnClickListener{
            var i= Intent(this,MainActivity23::class.java)
            startActivity(i)
        }
    }
}