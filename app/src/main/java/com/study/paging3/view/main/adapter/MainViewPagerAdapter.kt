package com.study.paging3.view.main.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.study.paging3.view.main.coroutine.CoroutineFragment
import com.study.paging3.view.main.rxjava.RxJavaFragment

class MainViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> RxJavaFragment()
            1 -> CoroutineFragment()
            else -> throw RuntimeException("must not be null")
        }
    }

    companion object {
        private const val NUM_PAGES = 2
    }
}