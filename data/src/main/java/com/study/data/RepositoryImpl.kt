package com.study.data

import com.study.data.model.mapper.PhotoListMapper
import com.study.data.model.mapper.PhotoMapper
import com.study.data.source.local.LocalDataSource
import com.study.data.source.remote.RemoteDataSource
import com.study.domain.model.Photo
import com.study.domain.repository.CoinRepository
import io.reactivex.Single
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val remote: RemoteDataSource,
    private val local: LocalDataSource
) : CoinRepository {
    override fun getRxPhoto(page: Int, limit: Int): Single<List<Photo>> {
        return remote.getRxPhotos(page, limit).map(PhotoListMapper::mapToDomain)
    }

    override suspend fun getCoroutinePhoto(page: Int, limit: Int): List<Photo> {
        return remote.getCoroutinePhotos(page, limit)
            .map(PhotoMapper::mapToDomain)
    }

    override fun getLocalPhoto(): Single<List<Photo>> {
        return local.selectAll().map(PhotoListMapper::mapToDomain)
    }
}