package com.study.data.di

import com.study.data.RepositoryImpl
import com.study.domain.repository.CoinRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal interface DataModule {

    @Singleton
    @Binds
    fun bindCoinRepository(
        repository: RepositoryImpl
    ): CoinRepository
}