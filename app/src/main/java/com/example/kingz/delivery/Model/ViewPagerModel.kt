package com.example.kingz.delivery.Model

import com.example.kingz.delivery.R

/**
 * Created by KinGz on 7/19/2019.
 */
enum class ViewPagerModel private constructor(val titleResId: Int, val layoutResId: Int){

    RED(R.string.one, R.layout.splash_one),
    BLUE(R.string.two, R.layout.splash_two),
    GREEN(R.string.three, R.layout.splash_three),
    PINK(R.string.three, R.layout.splash_four)

}