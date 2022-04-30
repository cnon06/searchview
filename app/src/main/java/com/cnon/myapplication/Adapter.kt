package com.cnon.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val countryList: MutableList<CountryModel>) : RecyclerView.Adapter<Adapter.ModelViewHolder>() {

    class ModelViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val countryName: TextView = view.findViewById(R.id.countryName)
        val capitalName: TextView = view.findViewById(R.id.capitalName)
        val flagImage: ImageView = view.findViewById(R.id.flagImage)

        fun bindItems(item: CountryModel) {
            countryName.setText(item.countryName)
            capitalName.setText(item.capitalName)
            flagImage.setImageResource(item.flagImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return ModelViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
        holder.bindItems(countryList.get(position))
    }
}