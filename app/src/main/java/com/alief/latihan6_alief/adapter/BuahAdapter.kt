package com.alief.latihan6_alief.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.alief.latihan6_alief.R
import com.alief.latihan6_alief.model_buah


class buah_adapter
    (val itemList: ArrayList<model_buah>):
    RecyclerView.Adapter<buah_adapter.ModelViewHolder>(){

    class ModelViewHolder (itemView: View):RecyclerView.ViewHolder(itemView) {
        lateinit var ItemImage : ImageView
        lateinit var itemtext : TextView

        init {
            ItemImage = itemView.findViewById(R.id.gambar)as ImageView
            itemtext = itemtext.findViewById(R.id.nama)as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_customimage,parent, false)
        return ModelViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.ItemImage.setImageResource(itemList[position].image)
        holder.itemtext.setText()
    }
}
