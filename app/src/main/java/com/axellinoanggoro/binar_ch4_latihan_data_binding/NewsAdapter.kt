package com.axellinoanggoro.binar_ch4_latihan_data_binding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.axellinoanggoro.binar_ch4_latihan_data_binding.databinding.ItemNewsBinding

class NewsAdapter(private var listNews: ArrayList<ListNews>) :
    RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    class ViewHolder(var binding: ItemNewsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun movePage(itemData: ListNews) {
            binding.news = itemData

            binding.card.setOnClickListener {
                val move = Bundle()
                move.putSerializable("key", itemData)
                Navigation.findNavController(itemView)
                    .navigate(R.id.action_newsFragment_to_detailFragment2, move)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.ViewHolder {
        var view = ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsAdapter.ViewHolder, position: Int) {
        var dataNews = listNews[position]
        holder.movePage(dataNews)
    }

    override fun getItemCount(): Int {
        return listNews.size
    }
}