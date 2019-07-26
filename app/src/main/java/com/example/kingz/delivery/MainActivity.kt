package com.example.kingz.delivery

import android.content.*
import android.os.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.example.kingz.delivery.fragment.*


class MainActivity : AppCompatActivity() {
//    private lateinit var homeToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.beginTransaction()
                .add(R.id.area_main,StarterFragment.newInstance(),"stater")
                .commit()
    }


}
