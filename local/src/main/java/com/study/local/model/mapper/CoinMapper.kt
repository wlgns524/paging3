package com.study.local.model.mapper

import com.study.data.model.PhotoData
import com.study.local.model.CoinEntity

internal object CoinMapper : Mapper<CoinEntity, PhotoData> {
    override fun mapToData(from: CoinEntity): PhotoData {
        return PhotoData(
            albumId = from.albumId,
            id = from.id,
            title = from.title,
            url = from.url,
            thumbnailUrl = from.thumbnailUrl,
            isLike = true
        )
    }

    override fun mapToLocal(from: PhotoData): CoinEntity {
        return CoinEntity(
            albumId = from.albumId,
            id = from.id,
            title = from.title,
            url = from.url,
            thumbnailUrl = from.thumbnailUrl
        )
    }
}