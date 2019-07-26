package com.example.kingz.delivery.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.kingz.delivery.HomeActivity
import com.example.kingz.delivery.R
import kotlinx.android.synthetic.main.fragment_sms_confirm.view.*

/**
 * A simple [Fragment] subclass.
 */
 class SMSFragment : Fragment() {
    lateinit var done_btn: Button


    companion object {
        fun newInstance(): SMSFragment {
            var fragment = SMSFragment()
            var args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        var rootView = inflater!!.inflate(R.layout.fragment_sms_confirm, container, false)
        initInstance(rootView)
        return rootView
    }

    fun initInstance(root: View) {

        done_btn = root.done_btn



        done_btn.setOnClickListener {

            val intent = Intent(activity, HomeActivity::class.java)
            startActivity(intent)

        }



    }

}