package com.example.mykotlindemo.data

enum class Human {
    MAN, WOMAN
}
fun isMan(data: Human) = when (data){
    Human.MAN -> true
    Human.WOMAN -> false
    //这里不需要else分支，编译器自动推到出逻辑已经完备
}

fun printHuman(){
    println(Human.MAN == Human.MAN)
    println(Human.MAN === Human.MAN) //=== 三个等号，比较的是值和引用地址相等，一般用户比较对象是否相等
}