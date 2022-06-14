package com.laksana.retrofitlatihan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.laksana.retrofitlatihan.databinding.ItemPostBinding

class PostAdapter(private val lists: ArrayList<PostResponse>): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    inner class PostViewHolder(private val binding: ItemPostBinding ): RecyclerView.ViewHolder(binding.root) {
        fun bind(postResponse: PostResponse) {
            with(binding) {
                /*
                val text = "id: $(postResponse.id)\n" +
                        "title: $(postResponse.text"
                */

                val text = "id: ${postResponse.id} \n" +
                        "title: ${postResponse.text}"
                tvText.text = text

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val binding = ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(lists[position])
    }

    override fun getItemCount(): Int {
        return lists.size
    }
}