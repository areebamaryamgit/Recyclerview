package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class AdpaterGrid (var List: ArrayList<GridModel>,var context: Context):RecyclerView.Adapter<AdpaterGrid.Myviewholder>() {
    inner class Myviewholder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var image = itemView.findViewById<ImageView>(R.id.imageview)
        var home = itemView.findViewById<TextView>(R.id.home)

        fun bind(model: GridModel) {
            image.setImageResource(model.image)
            home.text = model.home
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
      var view =LayoutInflater.from(context).inflate(R.layout.grid_item,parent,false)
       return  Myviewholder(view)
    }

    override fun getItemCount(): Int {
       return List.size
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {
        holder.bind(List[position])
    }
}