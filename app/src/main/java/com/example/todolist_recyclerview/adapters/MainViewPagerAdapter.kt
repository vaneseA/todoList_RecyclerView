package com.example.todolist_recyclerview.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.todolist_recyclerview.fragments.GoalFragment
import com.example.todolist_recyclerview.fragments.SettingFragment
import com.example.todolist_recyclerview.fragments.TodoFragment

class MainViewPagerAdapter(fa :FragmentActivity) : FragmentStateAdapter(fa){
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return  when (position){
            0 -> TodoFragment()
            1 -> GoalFragment()
            else -> SettingFragment()
        }
    }
}