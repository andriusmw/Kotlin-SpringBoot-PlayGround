package com.kotlinplayground.basics

fun main() {

    val range = 1..10
    for(i in range){
        println("i : $i")
    }

    val reverseRange = 10 downTo 1
    for(i in reverseRange){
        println("i : $i")
    }

    //it goes 2 by 2
    for(i in reverseRange step 2){
        println("ReverseRange with Skip : $i")
    }


}