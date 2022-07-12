package com.study.paging3.util.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.load.model.LazyHeaders


@BindingAdapter(
    value = ["src"]
)
fun ImageView.bindSrc(
    imageUrl: String
) {
    try {
        Glide.with(this)
            .asBitmap()
            .load(
                GlideUrl(
                    imageUrl, LazyHeaders.Builder()
                        .addHeader("User-Agent", "your-user-agent")
                        .build()
                )
            )
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(this)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}