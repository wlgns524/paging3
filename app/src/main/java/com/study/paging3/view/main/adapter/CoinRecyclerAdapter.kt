package com.study.paging3.view.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.study.domain.model.Photo
import com.study.paging3.BR
import com.study.paging3.databinding.ItemCoinBinding

class CoinRecyclerAdapter : PagingDataAdapter<Photo, CoinRecyclerAdapter.CoinViewHolder>(
    object : DiffUtil.ItemCallback<Photo>() {
        override fun areItemsTheSame(oldItem: Photo, newItem: Photo): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Photo, newItem: Photo): Boolean {
            return oldItem == newItem
        }
    }
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        return CoinViewHolder(
            ItemCoinBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
        getItem(position)?.let {
            holder.onBind(it)
        }
    }

    class CoinViewHolder(private val binding: ItemCoinBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: Photo) {
            with(binding) {
                setVariable(BR.item, item)
            }
        }
    }
}