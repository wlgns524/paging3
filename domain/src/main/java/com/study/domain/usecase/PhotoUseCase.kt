package com.study.domain.usecase

import androidx.paging.PagingData
import com.study.domain.model.Photo
import io.reactivex.Flowable
import kotlinx.coroutines.flow.Flow


interface PhotoUseCase {
    fun getRxPhoto(page: Int): Flowable<PagingData<Photo>>
    fun getCoroutinePhoto(page: Int): Flow<PagingData<Photo>>
}