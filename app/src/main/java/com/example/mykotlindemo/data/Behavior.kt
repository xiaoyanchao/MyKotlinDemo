package com.example.mykotlindemo.data

import android.util.Log

interface Behavior {
    //接口内的可以有属性
    val canWalk: Boolean
    fun walk() {
        if (canWalk){
            Log.i("MainActivity.man","can walk")
        }else {
            Log.i("MainActivity.man","cannot walk")
        }
    }
}