package com.example.todolist_recyclerview.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.todolist_recyclerview.fragments.GoalFragment
import com.example.todolist_recyclerview.fragments.SettingFragment
import com.example.todolist_recyclerview.fragments.TodoFragment

class MainViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() = 3

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> TodoFragment()
            1 -> GoalFragment()
            else -> SettingFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "TodoList"
            1 -> "Goal"
            else -> "Setting"
        }
    }
}