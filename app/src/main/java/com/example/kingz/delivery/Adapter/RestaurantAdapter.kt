package com.example.kingz.delivery.Adapter

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kingz.delivery.Holder.RestaurantHolder
import com.example.kingz.delivery.Interface.ItemClickListener
import com.example.kingz.delivery.R

/**
 * Created by KinGz on 7/26/2019.
 */
class RestaurantAdapter(private val c: Context, private val imgs: IntArray, private val status: Array<String>,private val minute: Array<String>, private val arrow: IntArray) : RecyclerView.Adapter<RestaurantHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.restaurant_view, null)

        return RestaurantHolder(v)
    }


    override fun onBindViewHolder(holder: RestaurantHolder, position: Int) {

        holder.image.setImageResource(imgs[position])
        holder.statusView.text = status[position]
        holder.arrowRight.setImageResource(arrow[position])
        holder.minuteText.text = minute[position]

//        holder.setItemClickListener(object : ItemClickListener {
//            override fun onItemClick(v: View, pos: Int) {
//                val activity = v.context as AppCompatActivity
//                val fragment = F()
//                activity.supportFragmentManager
//                        .beginTransaction()
//                        .replace(R.id.container, fragment)
//                        .addToBackStack(null)
//                        .commit()
//
//            }
//        })
    }

    override fun getItemCount(): Int {
        return arrow.size
    }


}