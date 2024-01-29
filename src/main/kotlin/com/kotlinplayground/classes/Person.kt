package com.kotlinplayground.classes

class Person(val name: String,
             val age: Int
) {

    fun action(){
        println("Person Walks")
    }
}

fun main(){
    //creating an instance of the class, now we can access this class data and functions
    val person = Person( "Alex", 25)
    person.action()
    println("Name: ${person.name} and age: ${person.age}")
}