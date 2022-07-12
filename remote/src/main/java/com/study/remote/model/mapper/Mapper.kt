package com.study.remote.model.mapper

internal interface Mapper<R, D> {
    fun mapToData(from: R): D
}