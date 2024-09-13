package com.alief.latihan6_alief.adapter

import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import com.alief.latihan6_alief.RecycleViewCardMovie

class MovieAdapter constructor(
    private val getActivity: RecycleViewCardMovie,
    private val movieList: List<ModelMovie>) :
    class MyViewHolder (itemView : View): RecycleView.ViewHolder(itemView){
        val txtmovie : TextView = itemView.findViewById(R.id.txtMovie)
        val imgmovie : TextView = itemView.findViewById(R.id.imgMovie)
        val cardView : TextView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder{
        val view = layoutInflater.from(parent)
    }

