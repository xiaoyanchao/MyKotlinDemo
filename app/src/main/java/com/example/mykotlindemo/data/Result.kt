package com.example.mykotlindemo.data

import java.lang.Exception

sealed class Result<out R>{
    data class Success<out T>(val data: T, val message: String = ""): Result<T>()
    data class Error(val exception: Exception): Result<Nothing>()
    data class Loading(val time: Long= System.currentTimeMillis()): Result<Nothing>()
}
