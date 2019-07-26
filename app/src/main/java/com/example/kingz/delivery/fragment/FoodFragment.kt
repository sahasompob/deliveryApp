package com.example.kingz.delivery.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.kingz.delivery.Adapter.RestaurantAdapter
import com.example.kingz.delivery.R
import kotlinx.android.synthetic.main.fragment_food.view.*

/**
 * A simple [Fragment] subclass.
 */
 class FoodFragment : Fragment() {

    val imgShow = arrayOf(R.drawable.test_image,R.drawable.test_image,R.drawable.test_image,R.drawable.test_image,R.drawable.test_image,R.drawable.test_image)
    val minuteaText = arrayOf("50","50","50","50","50","50")
    val tusView = arrayOf("Washing Machine","Washing Machine","Washing Machine","Washing Machine","Washing Machine","Washing Machine")
    val arrow = arrayOf(R.drawable.ic_watch_later,R.drawable.ic_watch_later,R.drawable.ic_watch_later,R.drawable.ic_watch_later,R.drawable.ic_watch_later,R.drawable.ic_watch_later)
    private lateinit var adapter: RestaurantAdapter
    lateinit var rv : RecyclerView



    companion object {
        fun newInstance(): FoodFragment {
            var fragment = FoodFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var rootView = inflater!!.inflate(R.layout.fragment_food, container, false)


        initInstance(rootView)
        return rootView
    }

    fun initInstance(root: View) {
        rv = root.restaurant_recycleview


        adapter = RestaurantAdapter(context, imgShow.toIntArray(), tusView,minuteaText,
                arrow.toIntArray())
        val mLayoutManager = LinearLayoutManager(context)
        rv.layoutManager = mLayoutManager
        rv.itemAnimator = DefaultItemAnimator()
        rv.adapter = adapter


    }

}