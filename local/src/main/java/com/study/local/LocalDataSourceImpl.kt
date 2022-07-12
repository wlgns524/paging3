package com.study.local

import com.study.data.model.PhotoData
import com.study.data.source.local.LocalDataSource
import com.study.local.model.mapper.CoinListMapper
import com.study.local.model.mapper.CoinMapper
import com.study.local.room.dao.CoinDao
import io.reactivex.Completable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


internal class LocalDataSourceImpl @Inject constructor(
    private val coinDao: CoinDao,
) : LocalDataSource {

    override fun selectAll(): Single<List<PhotoData>> {
        return coinDao.selectAll()
            .map(CoinListMapper::mapToData)
            .subscribeOn(Schedulers.io())
    }

    override fun insert(photo: PhotoData): Completable {
        return coinDao
            .insert(CoinMapper.mapToLocal(photo))
            .subscribeOn(Schedulers.io())
    }

    override fun delete(photo: PhotoData): Completable {
        return coinDao
            .delete(CoinMapper.mapToLocal(photo))
            .subscribeOn(Schedulers.io())
    }
}