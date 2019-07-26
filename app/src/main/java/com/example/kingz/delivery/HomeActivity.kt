package com.example.kingz.delivery

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.TextView
import com.example.kingz.delivery.fragment.HomeFragment

class HomeActivity : AppCompatActivity() {
    lateinit var toolbar: ActionBar
    private lateinit var homeToolbar: Toolbar
    private lateinit var textTitle: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        homeToolbar = findViewById(R.id.toolbar_top)
        textTitle = findViewById(R.id.toolbar_title)
        setSupportActionBar(homeToolbar)

        toolbar = supportActionBar!!
        val bottomNavigation: BottomNavigationView = findViewById(R.id.navigationView)

        supportFragmentManager.beginTransaction()
                .add(R.id.area_main, HomeFragment.newInstance(),"home")
                .commit()

    }


}