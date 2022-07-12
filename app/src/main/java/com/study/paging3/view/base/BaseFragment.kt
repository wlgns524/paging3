package com.study.paging3.view.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import com.study.paging3.BR

abstract class BaseFragment<VDB, VM> : Fragment() where VDB : ViewDataBinding, VM : BaseViewModel {

    @LayoutRes
    protected open val layoutResId: Int = 0
    protected var viewDataBinding: VDB? = null
    protected abstract val viewModel: VM

    lateinit var isConnection: LiveData<Boolean>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutResId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewDataBinding = DataBindingUtil.bind<VDB>(view)?.apply {
            lifecycleOwner = viewLifecycleOwner
            setVariable(BR.viewModel, viewModel)
        }
    }


    @Throws(IllegalStateException::class)
    protected fun requireViewDataBinding(): VDB {
        if (viewDataBinding == null) {
            throw IllegalStateException("viewDataBinding is null")
        }
        return viewDataBinding!!
    }

    override fun onDestroyView() {
        viewDataBinding = null
        super.onDestroyView()
    }
}