package com.study.data.model.mapper

import com.study.data.model.PhotoData
import com.study.domain.model.Photo

internal object PhotoListMapper : Mapper<List<PhotoData>, List<Photo>> {
    override fun mapToDomain(from: List<PhotoData>): List<Photo> = from.map(PhotoMapper::mapToDomain)
    override fun mapToData(from: List<Photo>): List<PhotoData> = from.map(PhotoMapper::mapToData)
}