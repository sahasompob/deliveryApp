package com.example.kingz.delivery

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v4.view.ViewPager
import android.view.View
import android.widget.Toast
import com.example.kingz.delivery.Adapter.CustomPagerAdapter
import kotlinx.android.synthetic.main.activity_splash.*
import com.example.kingz.delivery.R.id.pager
import com.viewpagerindicator.CirclePageIndicator


class SplashActivity : FragmentActivity() {

    var adapter: CustomPagerAdapter? = null
    var pager: ViewPager? = null
    var indicator: CirclePageIndicator? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        adapter =  CustomPagerAdapter(getSupportFragmentManager());
        pager = findViewById<ViewPager>(R.id.pager)
        pager?.setAdapter(adapter)

        indicator =  findViewById<CirclePageIndicator>(R.id.indicator)
        indicator?.setViewPager(pager);



        skip_btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

        next_btn.setOnClickListener {

            var current_position = pager?.getCurrentItem()

            if (current_position==3){

                val intent = Intent(this, MainActivity::class.java)
                // start your next activity
                startActivity(intent)

            }else{

                pager?.setCurrentItem(pager?.getCurrentItem()!!.plus(1))



            }






        }

    }
}
