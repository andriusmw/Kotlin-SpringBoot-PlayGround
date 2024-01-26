package com.kotlinplayground.functions


const val courseName = "Kotlin Programming"
//top level property usable across all app

fun topLevelFunction() : Int {
    return (0..100).random()
}

fun main() {
    val num = topLevelFunction()
    println("Num is : $num")
}