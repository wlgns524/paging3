package com.study.remote.di

import com.study.data.source.remote.RemoteDataSource
import com.study.remote.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
internal interface RemoteDataModule {

    @Singleton
    @Binds
    fun bindRemoteDataSource(
        remoteDataSource: RemoteDataSourceImpl
    ): RemoteDataSource
}