package com.example.fetch_android_interview.UI


import androidx.recyclerview.widget.RecyclerView
import com.example.fetch_android_interview.data.models.ResponseListItem
import com.example.fetch_android_interview.databinding.ListItemBinding

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.fetch_android_interview.data.models.ResponseList


class ListAdapter():RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {
    private var dataSet = listOf<ResponseListItem>()
    class ListItemViewHolder(private val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun attach(item: ResponseListItem) {
                binding.textView.text = item.name
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListItemViewHolder(binding)
    }
    fun setData(list: List<ResponseListItem>){
        this.dataSet = list
        notifyDataSetChanged()
    }
    override fun getItemCount(): Int {
        return this.dataSet.size
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.attach(this.dataSet[position])
    }
}
