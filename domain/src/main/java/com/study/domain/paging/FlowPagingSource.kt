package com.study.domain.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.study.domain.model.Photo
import com.study.domain.repository.CoinRepository


class FlowPagingSource(
    private val repository: CoinRepository,
    private val limit: Int
) : PagingSource<Int, Photo>() {
    override fun getRefreshKey(state: PagingState<Int, Photo>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Photo> {
        val position = params.key ?: 1
        return try {
            repository.getCoroutinePhoto(
                page = position,
                limit = limit
            ).run {
                toLoadResult(this, position)
            }
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
    }

    private fun toLoadResult(data: List<Photo>, position: Int): LoadResult<Int, Photo> {
        return LoadResult.Page(
            data = data,
            prevKey = if (position > 1) position - 1 else null,
            nextKey = if (position == data.size) null else position + 1
        )
    }
}