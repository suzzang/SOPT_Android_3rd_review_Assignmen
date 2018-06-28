package com.sujeong.thirdseminar_review

import android.media.Image
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MainViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
    var busnumber : TextView = itemView!!.findViewById(R.id.bus_num) as TextView
    var buskind : TextView = itemView!!.findViewById(R.id.bus_kind) as TextView
    var busimg : ImageView = itemView!!.findViewById(R.id.bus_img) as ImageView
}