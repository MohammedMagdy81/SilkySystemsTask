package com.example.silkysystemstask.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.silkysystemstask.databinding.ItemHomeBinding
import com.example.silkysystemstask.models.ItemHomeModel

class HomeAdapter(private var itemList: List<ItemHomeModel>) :
    RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    fun setData(itemList: List<ItemHomeModel>) {
        this.itemList = itemList
        notifyDataSetChanged()
    }


    inner class HomeViewHolder(private val binding: ItemHomeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(homeModel: ItemHomeModel) {
            binding.apply {
                textTitle.text = homeModel.title
                textPrice.text = homeModel.price.toString()
                Glide.with(binding.root)
                    .load(homeModel.image)
                    .into(imageItem)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val itemBinding: ItemHomeBinding = ItemHomeBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return HomeViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(itemList[position])
    }
}