package com.study.data.source.remote


import com.study.data.model.PhotoData
import io.reactivex.Single

interface RemoteDataSource {
    fun getRxPhotos(page: Int, limit: Int): Single<List<PhotoData>>
    suspend fun getCoroutinePhotos(page: Int, limit: Int): List<PhotoData>
}