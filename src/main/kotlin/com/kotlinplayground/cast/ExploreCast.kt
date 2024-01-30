package com.kotlinplayground.cast

import com.kotlinplayground.classes.Course

fun checkType(type: Any) {

    when (type){
        is Course -> {
            println(type)
        }
    }
}


//--------------------------------MAIN-----------------------------------------
fun main() {

    //Instancing our class
    val course = Course(1,
        "Reactive Programing in Modern Java",
        "Dilip")

    checkType(course)
}

// ----------------------------END OF MAIN -------------------------------------------
