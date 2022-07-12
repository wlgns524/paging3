package com.study.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "coin")
internal data class CoinEntity(

    @PrimaryKey
    @ColumnInfo(name = "albumId")
    val albumId: Long,

    @ColumnInfo(name = "id")
    val id: Long,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "url")
    val url: String,

    @ColumnInfo(name = "thumbnailUrl")
    val thumbnailUrl: String
)