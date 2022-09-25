package com.example.objectDemo

interface A{
    fun funA()
}

interface B {
    fun funB()
}

abstract class Man{
    abstract fun findMan()
}

fun main(){

    val main = object : Man(), A, B{
        override fun funA() {

        }

        override fun funB() {

        }

        override fun findMan() {

        }

    }

    UserManager3.getInstance("Tom")
    PersonManager.getInstance("TIMI")
}
//普通单例模式
object UserManager{
    fun login(){}
}
//其他四种单例模式
//上述单例模式缺点：
// 第一，无法懒加载；第二，不支持传参。
//第一种：借助懒加载委托
object UserManager1{
    val user by lazy { loadUser()  }
    private fun loadUser(): User {
        return User.create("tom")
    }
    fun login(){}
}

//第二种：伴生对象 Double Check
class UserManager3 private constructor(name: String) {
    companion object {
        @Volatile private var INSTANCE: UserManager3? = null

        fun getInstance(name: String): UserManager3 =
            // 第一次判空
            INSTANCE?: synchronized(this) {
                // 第二次判空
                INSTANCE?:UserManager3(name).also { INSTANCE = it }
            }
    }
}

class UserManager4 private constructor(name: String){
    companion object: BaseSingleton<String, UserManager4>() {
        override fun creator(param: String): UserManager4 = UserManager4(param)
    }
}

class PersonManager private constructor(name: String){
    companion object{
        private var INSTANCE: PersonManager? = null
        fun getInstance(name: String): PersonManager =
            INSTANCE?: synchronized(this){
                INSTANCE?: PersonManager(name).also { INSTANCE = it }
            }
    }
}

class PersonManager1 private constructor(name: String){
    companion object: BaseSingleton<String, PersonManager1>() {
        override fun creator(param: String): PersonManager1 {
            return PersonManager1(param)
        }
    }
}

//抽象类模板
abstract class BaseSingleton<in P, out T>{
    @Volatile
    private var instance: T? = null
    protected abstract fun creator(param: P): T
    fun getInstance(param: P): T =
        instance?: synchronized(this){
            instance?:creator(param).also { instance = it }
        }
}



