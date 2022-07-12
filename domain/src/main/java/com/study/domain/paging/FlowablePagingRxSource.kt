package com.study.domain.paging

import androidx.paging.PagingState
import androidx.paging.rxjava2.RxPagingSource
import com.study.domain.model.Photo
import com.study.domain.repository.CoinRepository
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers


class FlowablePagingRxSource(
    private val repository: CoinRepository,
    private val limit: Int
) : RxPagingSource<Int, Photo>() {

    override fun getRefreshKey(state: PagingState<Int, Photo>): Int? {
        return state.anchorPosition
    }

    override fun loadSingle(params: LoadParams<Int>): Single<LoadResult<Int, Photo>> {
        val position = params.key ?: 1
        return repository.getRxPhoto(position, limit)
            .subscribeOn(Schedulers.io())
            .map { toLoadResult(it, position) }
            .onErrorReturn { LoadResult.Error(it) }
    }

    private fun toLoadResult(data: List<Photo>, position: Int): LoadResult<Int, Photo> {
        return LoadResult.Page(
            data = data,
            prevKey = if (position > 1) position - 1 else null,
            nextKey = if (position == data.size) null else position + 1
        )
    }
}