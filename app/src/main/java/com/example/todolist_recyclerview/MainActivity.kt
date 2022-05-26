package com.example.todolist_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todolist_recyclerview.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    private fun setupEvents() {

    }
    private fun  setValues() {
        mPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = mPagerAdapter

        mainTabLayout.setupWithViewPager(viewPager)
    }
}