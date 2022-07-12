package com.study.local.model.mapper

internal interface Mapper<E, D> {
    fun mapToData(from: E): D

    fun mapToLocal(from: D): E
}