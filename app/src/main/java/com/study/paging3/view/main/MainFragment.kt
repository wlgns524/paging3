package com.study.paging3.view.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.study.paging3.R
import com.study.paging3.databinding.FragmentMainBinding
import com.study.paging3.view.base.BaseFragment
import com.study.paging3.view.main.adapter.MainViewPagerAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>() {

    override val layoutResId: Int = R.layout.fragment_main
    override val viewModel: MainViewModel by viewModels()

    @Override
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(viewDataBinding!!) {
            with(vpMain) {
                isUserInputEnabled = false
                adapter = MainViewPagerAdapter(this@MainFragment)
            }
            TabLayoutMediator(tlMain, vpMain) { tab, position ->
                when (position) {
                    0 -> tab.text = "RxJava"
                    1 -> tab.text = "Coroutine"
                }
            }.attach()
        }
    }

}