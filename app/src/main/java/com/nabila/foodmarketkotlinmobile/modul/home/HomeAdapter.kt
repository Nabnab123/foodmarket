package com.nabila.foodmarketkotlinmobile.modul.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nabila.foodmarketkotlinmobile.R
import com.nabila.foodmarketkotlinmobile.model.dummy.HomeModel
import kotlinx.android.synthetic.main.item_home_horizontal.view.*

class HomeAdapter (
    private val listData : List<HomeModel>,
    private val itemAdapterCallback : ItemAdapterCallback,
) : RecyclerView.Adapter<HomeAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_home_horizontal, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(data: HomeModel, itemAdapterCallback: ItemAdapterCallback){
            itemView.apply {
                tvMakan1.text = data.title
                rbFood.rating = data.rating

                /*Glide.with(context)
                    .load(data.src)
                    .into(ivPoster)*/

                itemView.setOnClickListener { itemAdapterCallback.onClick(it, data) }
            }
        }
    }

    interface ItemAdapterCallback{
        fun onClick(v: View, data:HomeModel)
    }
}