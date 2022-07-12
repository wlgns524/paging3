package com.study.data.source.local

import com.study.data.model.PhotoData
import io.reactivex.Completable
import io.reactivex.Single

interface LocalDataSource {
    fun selectAll(): Single<List<PhotoData>>

    fun insert(photo: PhotoData): Completable

    fun delete(photo: PhotoData): Completable
}