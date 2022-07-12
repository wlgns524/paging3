package com.study.paging3.view.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.rxkotlin.addTo

abstract class BaseViewModel : ViewModel() {
    private val compositeDisposable: CompositeDisposable by lazy(::CompositeDisposable)

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }

    protected fun <T> Observable<T>.bind(to: MutableLiveData<T>) {
        this.observeOn(AndroidSchedulers.mainThread())
            .subscribe(to::setValue)
            .addTo(compositeDisposable)
    }

    protected fun Disposable.addDisposable() {
        compositeDisposable.add(this)
    }
}