package com.example.todolist_recyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist_recyclerview.R
import com.example.todolist_recyclerview.models.TodoData
import java.math.MathContext

class TodoRecyclerVIewAdapter(val mContext : Context, val mList: List<TodoData>) :
    RecyclerView.Adapter<TodoRecyclerVIewAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val row = LayoutInflater.from(mContext).inflate(R.layout.todo_list_item, parent, false)
        return MyViewHolder(row)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item : TodoData) {

        }
    }
}