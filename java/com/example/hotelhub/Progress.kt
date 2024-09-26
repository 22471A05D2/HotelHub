package com.example.hotelhub

import android.content.Intent
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.CheckBox
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.content.ContextCompat

class Progress : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)
        val progressBar: ProgressBar = findViewById(R.id.progressBar)


        progressBar.visibility = View.VISIBLE



        Handler().postDelayed({
            progressBar.visibility = View.GONE
        }, 5000) // Hides after 3 seconds
        progressBar.setOnClickListener {
            Toast.makeText(this,"click on tick" ,Toast.LENGTH_SHORT).show()
            val i = Intent(this, MainActivity13::class.java)
            startActivity(i)
        }


        // Set an OnCheckedChangeListener to handle check/uncheck events
    }

}






