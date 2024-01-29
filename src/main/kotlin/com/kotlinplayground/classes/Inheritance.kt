package com.kotlinplayground.classes

open class User(val name: String){
    open fun login(){
        println("Inside User Login")
    }
}
//Inheritance is only allowed if you use the "open" keyword before the class
//This is creating a new class with a primary constructor which has a name property of type string
// and it "extends" the User open class.
class Student(name: String) : User(name){
    override fun login(){
        println("Inside Student Login")
    }
}

class Instructor(name: String) : User(name)

fun main() {
    //Create 2 instances , one of type student and other from tupe instructor
    //however both of those instances refers to the same open class User
    val student = Student("Alex")
    println("Name is ${student.name}")
    student.login()

    val instructor = Instructor("Dillip")
    println("Name is ${instructor.name}")
    instructor.login()
}