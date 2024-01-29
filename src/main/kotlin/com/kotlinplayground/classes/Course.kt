package com.kotlinplayground.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String
)

fun main() {
    //Instancing our class
    val course = Course(1,
        "Reactive Programing in Modern Java",
    "Dilip")

    println(course)
    // Data class provides you the full info of the object, if we printlin()
    // the item instance of the previous exercise we would not see the full data, we would
    //need to access each property with item.name and what happens if there is a property
    // that we don't know about? we would be missing it.
}