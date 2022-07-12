package com.study.remote.model.mapper

import com.study.data.model.PhotoData
import com.study.remote.model.response.PhotoResponse


internal object PhotoListMapper : Mapper<List<PhotoResponse>, List<PhotoData>> {
    override fun mapToData(from: List<PhotoResponse>): List<PhotoData> =
        from.map(PhotoMapper::mapToData)
}