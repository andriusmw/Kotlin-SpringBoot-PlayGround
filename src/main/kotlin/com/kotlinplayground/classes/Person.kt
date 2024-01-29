package com.kotlinplayground.classes

class Person(val name: String = "",
             val age: Int = 0
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

    //Creating multiple instances of the same class with default values
    val person1 = Person()
    println("Name: ${person1.name} and age: ${person1.age}")


}