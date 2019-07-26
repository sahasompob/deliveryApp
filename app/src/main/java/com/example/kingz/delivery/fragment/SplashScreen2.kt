package com.example.kingz.delivery.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kingz.delivery.R

/**
 * A simple [Fragment] subclass.
 */
class SplashScreen2 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var rootView = inflater!!.inflate(R.layout.splash_two, container, false)
        initInstance(rootView)
        return rootView
    }

    fun initInstance(root: View) {

    }


}// Required empty public constructor