package com.kotlinplayground.collections

fun main() {
    val addLambda = {x: Int ->x+x}

   val addResult =  addLambda(3)
    println("addResult: $addResult")

    val multipleLambda = {x: Int, y: Int ->
        println("X is $x and Y is $y")
        x*y} // result is what you do on the last line
    val addMultipleResult =  multipleLambda(2,3)
    println("addMultipleResult: $addMultipleResult")
}