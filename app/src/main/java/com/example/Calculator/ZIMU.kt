package com.example.Calculator

import android.R.string
import android.content.Context
import java.io.File
import java.util.*

fun main() {
    var result = ""
    var oldTime = "00:00:00.00"
    var newTime = ""
    var list = mutableListOf<String>()
    list = File("/Users/forms/AndroidStudioProjects/MyKotlinDemo20220721/app/src/main/assets/demo.txt").readLines() as MutableList<String>

//    list = data.split("\n") as MutableList<String>
//    第一步
    for ((index,e) in list.withIndex()){
        if (e.length >11){
            newTime = e.substring(0, 11)
            result = "$oldTime --> $newTime"
            result = "$result\n${e.substring(12, e.length)}"

            oldTime = newTime
            println(result)
        }
    }

////第二步
//    val list = mutableListOf<String>()
//    for ((index, e) in stringArray.withIndex()) {
//        val ddd = "${e}\nxyc"
//        list.add(ddd)
//        if (index % 2 == 0 && index > 0) {
//            val ccc = "${stringArray[index]}\nxyc"
//            list[index - 2] = ccc
//        }
//    }
//    print(list.toString().replace("[","").replace("]","").replace("xyc, ", ""))
}