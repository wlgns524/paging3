package com.study.data.model


data class PhotoData(
    val albumId: Long,
    val id: Long,
    val title: String,
    val url: String,
    val thumbnailUrl: String,
    var isLike: Boolean
)