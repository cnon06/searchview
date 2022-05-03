package com.cnon.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val countryList: MutableList<CountryModel>, val mRV: RecyclerView) : RecyclerView.Adapter<Adapter.ModelViewHolder>() {





    class ModelViewHolder(view: View) : RecyclerView.ViewHolder(view) {
      //  val countryName: TextView = view.findViewById(R.id.countryName)
        val capitalName: TextView = view.findViewById(R.id.capitalName)
        val flagImage: ImageView = view.findViewById(R.id.flagImage)
      //  val delete: ImageView = view.findViewById(R.id.delete)
      //  val copy: ImageView = view.findViewById(R.id.copy)


        fun bindItems(item: CountryModel) {

        //    countryName.setText(item.countryName)
            capitalName.setText(item.countryName)
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


       // println("onBindViewHolder position: "+position)

        /*
          holder.delete.setOnClickListener {


           countryList.removeAt(holder.getAdapterPosition())
            notifyItemRemoved(holder.getAdapterPosition()
      }
       holder.copy.setOnClickListener {

           countryList.add(holder.getAdapterPosition(),countryList.get(holder.getAdapterPosition()))
            notifyItemInserted(holder.getAdapterPosition())
            notifyItemRangeChanged(holder.getAdapterPosition(),countryList.size)
           if(holder.getAdapterPosition()==1)   mRV.scrollToPosition(0)
            if(holder.getAdapterPosition()==countryList.size-1)   mRV.scrollToPosition(countryList.size-1)

        }

         */






    }

   



}