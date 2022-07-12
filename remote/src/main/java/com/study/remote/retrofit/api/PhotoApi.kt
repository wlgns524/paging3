package com.study.remote.retrofit.api

import com.study.remote.model.response.PhotoResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

internal interface PhotoApi {

    @GET("photos")
    fun getRxPhotos(
        @Query("_page") page: Int,
        @Query("_limit") limit: Int,
    ): Single<List<PhotoResponse>>

    @GET("photos")
    suspend fun getCoroutinePhotos(
        @Query("_page") page: Int,
        @Query("_limit") limit: Int,
    ): List<PhotoResponse>
}