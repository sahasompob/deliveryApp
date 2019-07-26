package com.example.kingz.delivery.fragment


import android.os.Bundle
import android.content.Intent
import android.provider.Settings
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.example.kingz.delivery.R
import kotlinx.android.synthetic.main.fragment_register.view.*
import kotlinx.android.synthetic.main.fragment_starter.view.*


/**
 * A simple [Fragment] subclass.
 */
 class RegisterFragment: Fragment() {
    lateinit var sign_up_btn: Button



    companion object {
        fun newInstance(): RegisterFragment {
            var fragment = RegisterFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var rootView = inflater!!.inflate(R.layout.fragment_register, container, false)
        initInstance(rootView)
        return rootView
    }

    fun initInstance(root: View) {

        sign_up_btn = root.sign_up_btn

        sign_up_btn.setOnClickListener {

            fragmentManager?.beginTransaction()
                    ?.replace(R.id.area_main,SMSFragment.newInstance(),"sms_confirm")
                    ?.addToBackStack("sms_confirm")
                    ?.commit()

        }



    }

}
