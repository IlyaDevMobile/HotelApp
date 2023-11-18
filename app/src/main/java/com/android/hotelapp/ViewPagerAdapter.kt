package com.android.hotelapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private var image: List<Int>) :
    RecyclerView.Adapter<ViewPagerAdapter.PagerViewHolder>() {


    inner class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.itemImage)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter.PagerViewHolder {
        return PagerViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.hotel_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.PagerViewHolder, position: Int) {
        holder.image.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return image.size
    }


}