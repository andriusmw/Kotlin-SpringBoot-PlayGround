package com.kotlinplayground.basics

fun main() {
    // if-else

    var name = "Alex"
    name = "Chloe"

    if (name.length == 4) {
        println("Name is Four Characters")
    } else {
        println("Name is NOT Four Characters")
    }

    //------------------------------------
    //In Kotlin when an if-else block is an expression( var)
    // it returns it last statement

    var result = if (name.length == 4) {
        println("Name is Four Characters")
        name
    } else {
        println("Name is NOT Four Characters")
        name.length
    }
    println("result: $result")

    // --------------------------------------------------
    // 1-GOLD, 2- SILVER, 3- BRONZE

    var position = 1

    val medal = if (position == 1) {
        "GOLD"
    } else if (position == 2) {
        "SILVER"
    } else if (position == 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }

    println(medal)


    //when

    // 1-GOLD, 2- SILVER, 3- BRONZE

    var position2 = 3

    val medal2 = when (position2) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }
    println(medal2)



}