package com.study.paging3.view.main.coroutine

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.study.domain.model.Photo
import com.study.domain.usecase.PhotoUseCase
import com.study.paging3.view.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CoroutineViewModel @Inject constructor(
    private val useCase: PhotoUseCase,
) : BaseViewModel() {

    private val _photoList: MutableLiveData<PagingData<Photo>> = MutableLiveData()
    val photoList: LiveData<PagingData<Photo>> = _photoList

    init {
        viewModelScope.launch {
            useCase
                .getCoroutinePhoto(1)
                .cachedIn(viewModelScope)
                .collectLatest { _photoList.value = it}
        }
    }
}