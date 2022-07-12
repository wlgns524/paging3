package com.study.data.model.mapper

import com.study.data.model.PhotoData
import com.study.domain.model.Photo

internal object PhotoMapper : Mapper<PhotoData, Photo> {
    override fun mapToDomain(from: PhotoData): Photo {
        return from.let {
            Photo(
                albumId = it.albumId,
                id = it.id,
                title = it.title,
                url = it.url,
                thumbnailUrl = it.thumbnailUrl,
                isLike = it.isLike
            )
        }
    }

    override fun mapToData(from: Photo): PhotoData {
        return from.let {
            PhotoData(
                albumId = it.albumId,
                id = it.id,
                title = it.title,
                url = it.url,
                thumbnailUrl = it.thumbnailUrl,
                isLike = false
            )
        }
    }
}