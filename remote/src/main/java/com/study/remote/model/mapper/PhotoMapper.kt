package com.study.remote.model.mapper

import com.study.data.model.PhotoData
import com.study.remote.model.response.PhotoResponse


internal object PhotoMapper : Mapper<PhotoResponse, PhotoData> {
    override fun mapToData(from: PhotoResponse): PhotoData {
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