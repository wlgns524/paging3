package com.study.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.study.data.BuildConfig
import com.study.local.model.CoinEntity
import com.study.local.room.dao.CoinDao

@Database(entities = [CoinEntity::class], exportSchema = false, version = 1)
internal abstract class CoinDatabase : RoomDatabase() {
    abstract val coinDao: CoinDao

    companion object {
        private const val DATABASE_NAME = BuildConfig.LIBRARY_PACKAGE_NAME + ".db"
        fun create(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            CoinDatabase::class.java,
            DATABASE_NAME
        )
            .addMigrations()
            .build()
    }
}