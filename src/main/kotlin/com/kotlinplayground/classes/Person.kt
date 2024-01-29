package com.kotlinplayground.classes
        //Primary constructor
class Person(val name: String = "",
             val age: Int = 0
) {
    //Secondary constructor
    var email: String = ""
    var nameLength: Int = 0
    init {
        println("Inside Init Block")
        nameLength = name.length
    }

    constructor(_email: String,
                _name: String = "Jordan",
                _age: Int = 10
    ): this(_name,_age){
        email = _email
        //line above sends values to var email, but you can also use the "this()" call to make pass values to
        //properties defined in the secondary constructor. The secondary constructor redefines the values of the
        //primary constructor it overwrites it.
    }

    fun action(){
        println("Person Walks")
    }
}

fun main(){
    /*
    //creating an instance of the class, now we can access this class data and functions
    val person = Person( "Alex", 25)
    person.action()
    println("Name: ${person.name} and age: ${person.age}")

    //Creating multiple instances of the same class with default values
    val person1 = Person()
    println("Name1: ${person1.name} and age: ${person1.age}")

    val person2 = Person(_email = "abc@gmail.com")
    println("Name2: ${person2.name} and age: ${person2.age} and email is: ${person2.email}")

    val person3 = Person(_email = "abc@gmail.com",)
    println("Name3: ${person3.name} and age: ${person3.age} and email is: ${person3.email}")

    We commented all of this to not see too much times the value of the init
    cause we are instacing many times the Person Class Object */

    val person4 = Person(_email = "abc@gmail.com",_name = "Michael Jackson", _age = 25000)
    println("Name4: ${person4.name} and age: ${person4.age} and email is: ${person4.email} " +
            "and NameLength is: ${person4.nameLength}")

}