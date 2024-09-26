package com.example.hotelhub

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.view.isVisible
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class Details : AppCompatActivity() {
    lateinit var editText_name: EditText
    lateinit var editText_rollnumber: EditText
    lateinit var button: Button
    lateinit var db: FirebaseDatabase
    lateinit var recyclerView: RecyclerView
    lateinit var list: ArrayList<StudentModel>
    lateinit var adapterStudent: StudentAdapter


    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        recyclerView = findViewById(R.id.myrecyclerview)
        editText_name = findViewById(R.id.et_name)
        editText_rollnumber = findViewById(R.id.et_rollnumber)
        button = findViewById(R.id.button)
        db = FirebaseDatabase.getInstance()
        list = ArrayList<StudentModel>()


        button.setOnClickListener(
            View.OnClickListener
            {

                val myname = editText_name.text.toString()
                val myrollnumbr = editText_rollnumber.text.toString()
//                editText_name.error="requried"
//                editText_rollnumber.error="requried"
                val list = StudentModel(myname, myrollnumbr)
                db.reference.child("Nec").push().setValue(list)
                editText_name.text.clear()
                editText_rollnumber.text.clear()

            Toast.makeText(
                    applicationContext, "success :" +myname, Toast.LENGTH_SHORT
                ).show()
                val i = Intent(this,Progress::class.java)
                startActivity(i)


            })


    }

    fun retrieveData(view: View) {

        val messagesReference = db.reference.child("Nec")

        messagesReference.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val message = dataSnapshot.children.mapNotNull {
                    it.getValue(StudentModel::class.java)
                }
                list.clear()
                for (i in message) {
                    list.add(StudentModel(i.name, i.rollnumber))

                }
                adapterStudent = StudentAdapter(list)
                recyclerView.adapter=adapterStudent
                recyclerView.layoutManager=LinearLayoutManager(this@Details)


            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Handle errors here.
                Toast.makeText(applicationContext, "Failed", Toast.LENGTH_SHORT).show()
            }
        })


    }



}











