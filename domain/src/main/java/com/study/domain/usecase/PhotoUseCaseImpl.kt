package com.study.domain.usecase

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.rxjava2.flowable
import com.study.domain.model.Photo
import com.study.domain.paging.FlowPagingSource
import com.study.domain.paging.FlowablePagingRxSource
import com.study.domain.repository.CoinRepository
import io.reactivex.Flowable
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

internal class PhotoUseCaseImpl @Inject constructor(
    private val repository: CoinRepository,
) : PhotoUseCase {

    override fun getRxPhoto(page: Int): Flowable<PagingData<Photo>> {
        return Pager(
            PagingConfig(
                pageSize = PAGE_LIMIT,
                enablePlaceholders = true,
                prefetchDistance = 5,
                initialLoadSize = PAGE_LIMIT
            ), page
        ) {
            FlowablePagingRxSource(repository, PAGE_LIMIT)
        }.flowable
    }

    override fun getCoroutinePhoto(page: Int): Flow<PagingData<Photo>> {
        return Pager(
            PagingConfig(
                pageSize = PAGE_LIMIT,
                enablePlaceholders = true,
                prefetchDistance = 5,
                initialLoadSize = PAGE_LIMIT
            ), page
        ) {
            FlowPagingSource(repository, PAGE_LIMIT)
        }.flow
    }


    companion object {
        const val PAGE_LIMIT = 20
    }
}
