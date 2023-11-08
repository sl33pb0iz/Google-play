package com.example.googleplaystore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class HorizontalItem(
    val imgUrl: String,
    val text: String,
    val rating: Float,
)

class HorizontalRecyclerViewAdapter(private val data: List<HorizontalItem>) :
    RecyclerView.Adapter<HorizontalRecyclerViewAdapter.HorizontalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.horizontal_item_layout, parent, false)
        return HorizontalViewHolder(view)
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        val item = data[position]
        holder.textView.text = item.text
        holder.ratingView.text = item.rating.toString()
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class HorizontalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView = itemView.findViewById(R.id.item_text)
        var imageView: ImageView = itemView.findViewById(R.id.item_image)
        var ratingView: TextView = itemView.findViewById(R.id.item_rating)
        var starIcon: ImageView = itemView.findViewById(R.id.star_icon)
    }
}

