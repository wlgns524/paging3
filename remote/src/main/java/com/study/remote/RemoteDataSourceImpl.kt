package com.study.remote

import com.study.data.model.PhotoData
import com.study.data.source.remote.RemoteDataSource
import com.study.remote.model.mapper.PhotoListMapper
import com.study.remote.model.mapper.PhotoMapper
import com.study.remote.retrofit.api.PhotoApi
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


internal class RemoteDataSourceImpl @Inject constructor(
    private val api: PhotoApi,
) : RemoteDataSource {

    override fun getRxPhotos(page: Int, limit: Int): Single<List<PhotoData>> {
        return api.getRxPhotos(page, limit)
            .map(PhotoListMapper::mapToData)
            .onErrorReturn { emptyList() }
            .observeOn(Schedulers.io())
    }

    override suspend fun getCoroutinePhotos(page: Int, limit: Int): List<PhotoData> {
        return api.getCoroutinePhotos(page, limit).map(PhotoMapper::mapToData)
    }
}