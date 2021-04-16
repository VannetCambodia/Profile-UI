package com.recyclerview.profileui

import android.content.res.Resources

class Util {

    fun getScreenWidth(): Int {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    fun getScreenHeight():Int{
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }
}