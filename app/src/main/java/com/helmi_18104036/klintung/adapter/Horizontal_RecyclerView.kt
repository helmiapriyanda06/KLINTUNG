package com.helmi_18104036.klintung.adapter


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.helmi_18104036.klintung.DetailActivity
import com.helmi_18104036.klintung.R
import com.helmi_18104036.klintung.data.DataWisata.listData

 class Horizontal_RecyclerView(val context:Context): RecyclerView.Adapter<Horizontal_RecyclerView.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {
        val  view = LayoutInflater.from(parent.context).inflate(R.layout.row, parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = listData[position]
        Glide.with(holder.itemView.context)
            .load(listData[position].image)
            .apply(RequestOptions().override(350,550))
            .into(holder.img)
        holder.itemView.setOnClickListener {
            val move = Intent(context, DetailActivity::class.java)
            move.putExtra(DetailActivity.EXTRA_DATA,data)
            context.startActivity(move)
        }

    }

    override fun getItemCount(): Int {
        return 25
    }

    class MyViewHolder(itemView: View ): RecyclerView.ViewHolder(itemView){
        val img:ImageView = itemView.findViewById(R.id.img_item)
    }

    }

