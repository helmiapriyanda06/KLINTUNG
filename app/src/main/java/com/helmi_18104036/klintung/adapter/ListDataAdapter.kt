package com.helmi_18104036.klintung.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.helmi_18104036.klintung.DetailActivity
import com.helmi_18104036.klintung.R
import com.helmi_18104036.klintung.model.DataModel

class ListDataAdapter(val listData:ArrayList<DataModel>, val context: Context): RecyclerView.Adapter<ListDataAdapter.ListViewHolder>(){
    inner class ListViewHolder(view: View): RecyclerView.ViewHolder(view){
        var tvName: TextView = view.findViewById(R.id.tv_title)
        var tvDesc: TextView = view.findViewById(R.id.tv_description)
        var imgItem: ImageView = view.findViewById(R.id.img_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return  ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = listData[position]
        Glide.with(holder.itemView.context)
            .load(data.image)
            .apply(RequestOptions().override(180,172))
            .into(holder.imgItem)
        holder.tvName.text = data.title
        holder.tvDesc.text = data.description
        holder.itemView.setOnClickListener {
            val move = Intent(context, DetailActivity::class.java)
            move.putExtra(DetailActivity.EXTRA_DATA,data)
            context.startActivity(move)
        }
    }

    override fun getItemCount(): Int {
        return listData.size
    }

}