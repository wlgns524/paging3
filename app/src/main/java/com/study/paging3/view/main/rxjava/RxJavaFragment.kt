package com.study.paging3.view.main.rxjava

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.study.paging3.R
import com.study.paging3.databinding.FragmentRxjavaBinding
import com.study.paging3.view.base.BaseFragment
import com.study.paging3.view.main.adapter.CoinRecyclerAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RxJavaFragment : BaseFragment<FragmentRxjavaBinding, RxJavaViewModel>() {

    override val layoutResId: Int = R.layout.fragment_rxjava
    override val viewModel: RxJavaViewModel by viewModels()

    private lateinit var mAdapter: CoinRecyclerAdapter

    @Override
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mAdapter = CoinRecyclerAdapter()
        with(viewDataBinding!!) {
            rvCoin.apply {
                adapter = mAdapter
            }
        }

        with(viewModel) {
            photoList.observe(viewLifecycleOwner, {
                mAdapter.submitData(lifecycle, it)
            })
        }
    }
}