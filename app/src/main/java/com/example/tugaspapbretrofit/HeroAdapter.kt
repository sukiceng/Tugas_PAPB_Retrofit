package com.example.tugaspapbretrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.tugaspapbretrofit.Model.Data
import com.example.tugaspapbretrofit.databinding.ItemHolderHeroBinding

class HeroAdapter(private val listHero: List<Data>) :
    RecyclerView.Adapter<HeroAdapter.ItemHeroViewHolder>() {
    inner class ItemHeroViewHolder(private val binding: ItemHolderHeroBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val itemImage: ImageView = itemView.findViewById(R.id.heroImage)
        fun bind(data: Data) {
            with(binding) {
                textHeroName.text = data.title
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ItemHeroViewHolder {
        val binding =
            ItemHolderHeroBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemHeroViewHolder(binding)
    }
    override fun getItemCount(): Int = listHero.size

    override fun onBindViewHolder(holder: ItemHeroViewHolder, position: Int) {
        holder.bind(listHero[position])
        Glide.with(holder.itemView.context)
            .load(listHero[position].image)
            .centerCrop()
            .into(holder.itemImage)
    }
}

