package com.study.data.model.mapper

internal interface Mapper<E, D> {
    fun mapToDomain(from: E): D

    fun mapToData(from: D): E
}