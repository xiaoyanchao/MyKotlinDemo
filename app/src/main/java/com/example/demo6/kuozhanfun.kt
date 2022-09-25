package com.example.demo6

//String 扩展函数
fun String.lastElement(): Char?{
    if (this.isEmpty()){
        return null
    }
    return this[length-1]
}

//String 扩展属性
val String.lastElement1: Char?
    get() = if (isEmpty()){
         null
    }else {
        get(length-1)
    }

fun main() {
    val name = "xyc"
    println(name.lastElement())
    print(name.lastElement1)
}