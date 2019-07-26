package com.example.kingz.delivery.Holder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.kingz.delivery.Interface.ItemClickListener
import com.example.kingz.delivery.R

/**
 * Created by KinGz on 7/26/2019.
 */
class RestaurantHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    var image: ImageView
    var statusView: TextView
    var minuteText: TextView
    var arrowRight: ImageView

    private var itemClickListener: ItemClickListener? = null

    init {
        image = itemView.findViewById(R.id.im_machine)
        statusView = itemView.findViewById(R.id.restaurant_name)
        arrowRight = itemView.findViewById(R.id.im_ic_arrow_right)
        minuteText = itemView.findViewById(R.id.number_text)

        itemView.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        this.itemClickListener!!.onItemClick(v, layoutPosition)

    }

    fun setItemClickListener(ic: ItemClickListener) {
        this.itemClickListener = ic
    }
}