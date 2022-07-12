package com.study.domain.di

import com.study.domain.usecase.PhotoUseCase
import com.study.domain.usecase.PhotoUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal interface DomainModule {

    @Singleton
    @Binds
    fun bindCoinUseCase(
        useCase: PhotoUseCaseImpl
    ): PhotoUseCase
}

