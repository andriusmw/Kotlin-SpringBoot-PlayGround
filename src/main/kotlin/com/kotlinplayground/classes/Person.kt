package com.kotlinplayground.classes

class Person {

    fun action(){
        println("Person Walks")
    }
}

fun main(){
    //creating an instance of the class, now we can access this class data and functions
    val person = Person()
    person.action()
}