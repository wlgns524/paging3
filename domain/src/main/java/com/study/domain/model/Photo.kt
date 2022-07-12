package com.study.domain.model

data class Photo(
    val albumId: Long,
    val id: Long,
    val title: String,
    val url: String,
    val thumbnailUrl: String,
    var isLike: Boolean
)