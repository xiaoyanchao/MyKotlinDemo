package com.example.objectDemo

//object 关键字
class Person{
    companion object InnerSingleton{
        @JvmStatic
        fun foo(){}
    }
}

fun main() {
    Person.InnerSingleton.foo()
    User.create("xxx")
}

//工厂模式
//私有的构造函数，外部无法调用
class User private constructor(name: String){
    companion object {
        @JvmStatic
        fun create(name: String): User {
            return User(name)
        }
    }
}