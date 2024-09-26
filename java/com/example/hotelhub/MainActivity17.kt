package com.example.hotelhub

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.widget.ArrayAdapter
import android.widget.CalendarView
import android.widget.Spinner
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity17 : AppCompatActivity() {

    private lateinit var calendarView: CalendarView
    private lateinit var buttonShowDates: Button
    private var startDate: Long = 0
    private var endDate: Long = 0
    lateinit var book: Button
    lateinit var pay: Button

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main17)




        calendarView = findViewById(R.id.calendarView)
        buttonShowDates = findViewById(R.id.buttonShowDates)

        book = findViewById(R.id.book)
        pay = findViewById(R.id.pay)
        book = findViewById(R.id.book)
        pay = findViewById(R.id.pay)
        book.setOnClickListener {
            var i = Intent(this, Details::class.java)
            startActivity(i)
        }

        pay.setOnClickListener {
            var url = Uri.parse("https://www.phonepay.com")
            var i = Intent(Intent.ACTION_VIEW)
            i.setData(url)
            startActivity(i)
        }

        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            val calendar = Calendar.getInstance()
            calendar.set(year, month, dayOfMonth)

            // If startDate is not set, set it to the current date
            if (startDate == 0L) {
                startDate = calendar.timeInMillis
                showToast("Start Date Selected: ${formatDate(startDate)}")
            } else {
                endDate = calendar.timeInMillis
                showToast("End Date Selected: ${formatDate(endDate)}")
            }
        }

        buttonShowDates.setOnClickListener {
            if (startDate != 0L && endDate != 0L) {
                showToast("Selected Range: ${formatDate(startDate)} to ${formatDate(endDate)}")
            } else {
                showToast("Please select both start and end dates.")
            }
        }
    }

    private fun formatDate(dateInMillis: Long): String {
        val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        return sdf.format(Date(dateInMillis))
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}



