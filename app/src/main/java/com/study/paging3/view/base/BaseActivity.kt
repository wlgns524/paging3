package com.study.paging3.view.base

import android.os.Bundle
import android.util.Log
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.study.paging3.BR
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.plugins.RxJavaPlugins

abstract class BaseActivity<VDB, VM> :
    AppCompatActivity() where VDB : ViewDataBinding, VM : BaseViewModel {

    @LayoutRes
    protected open val layoutResId: Int = 0
    private val compositeDisposable = CompositeDisposable()

    private lateinit var viewDataBinding: VDB
    protected abstract val viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView<VDB>(this, layoutResId).apply {
            setVariable(BR.viewModel, viewModel)
            lifecycleOwner = this@BaseActivity
        }
        RxJavaPlugins.setErrorHandler { Log.w("#APP ${this.localClassName}", it) }
    }

    override fun onDestroy() {
        compositeDisposable.clear()
        super.onDestroy()
    }
}