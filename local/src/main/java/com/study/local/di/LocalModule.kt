package com.study.local.di

import android.app.Application
import android.content.Context
import com.study.local.room.CoinDatabase
import com.study.local.room.dao.CoinDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class LocalModule {

    @Singleton
    @Provides
    fun provideContext(application: Application): Context = application.applicationContext

    @Singleton
    @Provides
    fun provideDatabase(context: Context): CoinDatabase = CoinDatabase.create(context)

    @Singleton
    @Provides
    fun provideCoinDao(database: CoinDatabase): CoinDao = database.coinDao
}