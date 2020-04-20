package com.aleyn.mvvm.base

/**
 *   @auther : Aleyn
 *   time   : 2019/11/01
 */
data class BaseResult<out T>(
    val message: String,
    val code: Int,
    val data: T,
    val success: Boolean,
    val exceptionClazz: String
) {
}