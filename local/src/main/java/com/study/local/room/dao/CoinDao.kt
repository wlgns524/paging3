package com.study.local.room.dao

import androidx.room.*
import com.study.local.model.CoinEntity
import io.reactivex.Completable
import io.reactivex.Single


@Dao
internal interface CoinDao {

    @Query("SELECT count(*) > 0 FROM coin WHERE id = :id LIMIT 1")
    fun existsById(id: String): Single<Boolean>

    @Query("SELECT * FROM coin")
    fun selectAll(): Single<List<CoinEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(coin: CoinEntity): Completable

    @Delete
    fun delete(coin: CoinEntity): Completable
}
