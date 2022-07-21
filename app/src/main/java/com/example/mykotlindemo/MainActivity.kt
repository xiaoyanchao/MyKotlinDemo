package com.example.mykotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mykotlindemo.data.Man
import com.example.mykotlindemo.data.Person

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
    }

    private fun initData() {
        initPerson()
    }

    private fun initPerson() {
        val person = Person("xyc", 12)
        Log.i("MainActivity.person1", "hello! my name is ${person.name} and age is ${person.age} and ${person.isAdult()}")
        Log.i("MainActivity.person2", "hello! my name is ${person.name} and age is ${person.age} and ${person.isAdult2}")
        person.age = 20
        Log.i("MainActivity.person3", "hello! my name is ${person.name} and age is ${person.age} and ${person.isAdult()}")
        Log.i("MainActivity.person4", "hello! my name is ${person.name} and age is ${person.age} and ${person.isAdult2}")
        val man = Man()
        Log.i("MainActivity.man1","" + man.walk())
    }
}