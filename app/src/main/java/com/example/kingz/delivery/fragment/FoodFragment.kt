package com.example.kingz.delivery.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.kingz.delivery.R

/**
 * A simple [Fragment] subclass.
 */
 class FoodFragment : Fragment() {
    lateinit var sign_up_btn: Button



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





    }

}