package com.study.local.model.mapper

import com.study.data.model.PhotoData
import com.study.local.model.CoinEntity

internal object CoinListMapper : Mapper<List<CoinEntity>, List<PhotoData>> {
    override fun mapToData(from: List<CoinEntity>): List<PhotoData> {
        return from.map(CoinMapper::mapToData)
    }

    override fun mapToLocal(from: List<PhotoData>): List<CoinEntity> {
        return from.map(CoinMapper::mapToLocal)
    }
}