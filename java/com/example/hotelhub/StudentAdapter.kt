package com.example.hotelhub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(val list:List<StudentModel>): RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {
    class StudentViewHolder(itemview: View): RecyclerView.ViewHolder(itemview) {
        val name: TextView =itemview.findViewById(R.id.text_name)
        val rollnumber: TextView =itemview.findViewById(R.id.text_rollnumber)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        return StudentViewHolder(
            LayoutInflater.from(parent.context)
            .inflate(R.layout.row,parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.name.setText(list[position].name)
        holder.rollnumber.setText(list[position].rollnumber)
    }
}