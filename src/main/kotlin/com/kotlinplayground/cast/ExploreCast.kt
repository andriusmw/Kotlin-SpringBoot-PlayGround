package com.kotlinplayground.cast

import com.kotlinplayground.classes.Course

fun checkType(type: Any) {

    when (type){
        is Course -> {
            println(type)
        }
        is String -> {
            println(type.lowercase())
        }


    }
}

fun castNumber(any: Any) {
    when(any){
        //this only happens if the any we receive is Double Type
        any as Double -> println("Value is Double")
        // if not, we get a java exception
    }
}

//--------------------------------MAIN-----------------------------------------
fun main() {

    //Instancing our class
    val course = Course(1,
        "Reactive Programing in Modern Java",
        "Dilip")

    checkType(course)
    checkType("Dilip")

    castNumber(1.0)
    //castNumber(1) --> this throws an error cause of the type

    val number = 1
    val numberDouble = number.toDouble()
    println(numberDouble)
    //with this we could convert an Int into a Double for making work our "as Double" Scenario
}



// ----------------------------END OF MAIN -------------------------------------------

