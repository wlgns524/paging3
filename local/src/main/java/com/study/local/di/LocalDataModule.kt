package com.study.local.di

import com.study.data.source.local.LocalDataSource
import com.study.local.LocalDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal interface LocalDataModule {

    @Singleton
    @Binds
    fun bindCoinLocalDataSource(
        localDataSource: LocalDataSourceImpl
    ): LocalDataSource

}