package com.example.mykotlindemo.data

open class Person(val name: String, var age: Int) {
    fun isAdult(): Boolean = age >= 18
    val isAdult1
        get() = age >= 18

    val isAdult2: Boolean
        get() {
            //do something
            return age >= 18
        }

    var age1: Int = 0
}