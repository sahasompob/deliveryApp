package com.example.kingz.delivery.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.kingz.delivery.FoodActivity
import com.example.kingz.delivery.MainActivity
import com.example.kingz.delivery.R
import kotlinx.android.synthetic.main.fragment_home.view.*

/**
 * A simple [Fragment] subclass.
 */
 class HomeFragment : Fragment() {
    lateinit var sign_up_btn: Button
    lateinit var food_layout: LinearLayout




    companion object {
        fun newInstance(): HomeFragment {
            var fragment = HomeFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var rootView = inflater!!.inflate(R.layout.fragment_home, container, false)
        initInstance(rootView)
        return rootView
    }

    fun initInstance(root: View) {

        food_layout = root.food_layout

        food_layout.setOnClickListener {

            val intent = Intent(activity, FoodActivity::class.java)
            startActivity(intent)

        }

    }

}