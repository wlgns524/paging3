package com.study.remote.model.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PhotoResponse(
    @SerializedName("albumId")
    @Expose
    val albumId: Long,
    @SerializedName("id")
    @Expose
    val id: Long,
    @SerializedName("title")
    @Expose
    val title: String,
    @SerializedName("url")
    @Expose
    val url: String,
    @SerializedName("thumbnailUrl")
    @Expose
    val thumbnailUrl: String
)