package com.sujeong.thirdseminar_review

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class MainAdapter(private var mainItems : ArrayList<MainData>) : RecyclerView.Adapter<MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
       var mainView = LayoutInflater.from(parent.context).inflate(R.layout.main_item,parent,false)
        return MainViewHolder(mainView)
    }

    override fun getItemCount(): Int = mainItems.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.busnumber.text = mainItems[position].busnumber
        holder.busnumber.setTextColor(Color.parseColor(mainItems[position].color))
        holder.buskind.text = mainItems[position].buskind
        holder.busimg.setBackgroundColor(Color.parseColor(mainItems[position].color))
    }
}