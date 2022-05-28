package com.example.todolist_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todolist_recyclerview.models.TodoData
import kotlinx.android.synthetic.main.activity_detail_todo.*

class DetailTodoActivity : AppCompatActivity() {

    lateinit var todoData : TodoData
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_todo)
        setupEvents()
        setValues()
    }

    private fun setupEvents() {

    }

    private fun setValues() {
        todoData = intent.getSerializableExtra("TodoData") as TodoData

        titleTxt.text = todoData.todoTitle
        placeTxt.text = todoData.place
        ratingBar.rating = todoData.rating.toFloat()
    }
}