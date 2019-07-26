package com.example.kingz.delivery.Adapter

/**
 * Created by KinGz on 7/19/2019.
 */

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.view.PagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kingz.delivery.Model.ViewPagerModel
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.kingz.delivery.fragment.SplashScreen1
import com.example.kingz.delivery.fragment.SplashScreen2
import com.example.kingz.delivery.fragment.SplashScreen3
import com.example.kingz.delivery.fragment.SplashScreen4


class CustomPagerAdapter internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val COUNT = 4

    override fun getItem(position: Int): Fragment? {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = SplashScreen1()
            1 -> fragment = SplashScreen2()
            2 -> fragment = SplashScreen3()
            3 -> fragment = SplashScreen4()
        }

        return fragment
    }

    override fun getCount(): Int {
        return COUNT
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "Tab " + (position + 1)
    }
}
