package com.example.kingz.delivery

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.kingz.delivery.fragment.FoodFragment

class FoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        supportFragmentManager.beginTransaction()
                .add(R.id.area_main, FoodFragment.newInstance(),"food")
                .commit()

    }
}
