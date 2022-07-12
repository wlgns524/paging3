package com.study.domain.repository

import com.study.domain.model.Photo
import io.reactivex.Single

interface CoinRepository {
    fun getRxPhoto(page: Int, limit: Int): Single<List<Photo>>
    suspend fun getCoroutinePhoto(page: Int, limit: Int): List<Photo>

    //TODO - Local 추후 연결 예정
    fun getLocalPhoto(): Single<List<Photo>>
}