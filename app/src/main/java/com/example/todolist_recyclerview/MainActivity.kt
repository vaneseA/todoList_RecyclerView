package com.example.todolist_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
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
        mPagerAdapter = MainViewPagerAdapter(this)
        mainViewPage.adapter = mPagerAdapter

//      바텀네비게이션 클릭이벤트처리
        bottomNav.setOnItemSelectedListener {
           when(it.itemId) {
               R.id.home -> mainViewPage.currentItem = 0
               R.id.paper -> mainViewPage.currentItem= 1
               R.id.profile -> mainViewPage.currentItem= 2
           }
            return@setOnItemSelectedListener true
        }

//        뷰 페이저 연결
        mainViewPage.registerOnPageChangeCallback(object :ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            bottomNav.menu.getItem(position).isChecked = true
            }
        })
    }
}