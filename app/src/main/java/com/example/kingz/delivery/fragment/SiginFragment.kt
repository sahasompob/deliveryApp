package com.example.kingz.delivery.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.kingz.delivery.R
import kotlinx.android.synthetic.main.fragment_sign_in.view.*
import android.content.Intent
import com.example.kingz.delivery.HomeActivity


/**
 * A simple [Fragment] subclass.
 */
 class SiginFragment : Fragment() {
    lateinit var sign_in_btn: Button



    companion object {
        fun newInstance(): SiginFragment {
            var fragment = SiginFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var rootView = inflater!!.inflate(R.layout.fragment_sign_in, container, false)
        initInstance(rootView)
        return rootView
    }

    fun initInstance(root: View) {

        sign_in_btn = root.sign_in_btn
//
        sign_in_btn.setOnClickListener {

            val intent = Intent(activity, HomeActivity::class.java)
            startActivity(intent)


        }



    }

}