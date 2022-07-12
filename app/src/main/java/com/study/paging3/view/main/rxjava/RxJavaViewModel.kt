package com.study.paging3.view.main.rxjava

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.PagingData
import com.study.domain.model.Photo
import com.study.domain.usecase.PhotoUseCase
import com.study.paging3.view.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.Flowable
import javax.inject.Inject

@HiltViewModel
class RxJavaViewModel @Inject constructor(
    private val useCase: PhotoUseCase,
) : BaseViewModel() {

    private val _photoList: MutableLiveData<PagingData<Photo>> = MutableLiveData()
    val photoList: LiveData<PagingData<Photo>> = _photoList

    init {
        Flowable.defer { useCase.getRxPhoto(1) }
            .subscribe(_photoList::setValue)
            .dispose()
    }
}