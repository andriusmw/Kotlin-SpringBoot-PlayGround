package com.kotlinplayground.classes

open class User(val name: String){
    open var isLoggedIn : Boolean = false
    open fun login(){
        println("Inside User Login")
    }
}
//Inheritance is only allowed if you use the "open" keyword before the class
//This is creating a new class with a primary constructor which has a name property of type string
// and it "extends" the User open class.
class Student(name: String) : User(name){
    override var isLoggedIn : Boolean = false

    companion object {
      const  val noOfEnrrolledCourses = 10
        fun country() = "USA"
    }

    override fun login(){
        println("Inside Student Login")
        //Override nullyfies the extended function and instead it will use this one when called
        super.login()
        //Now we have to use super. in order to access the previous login() function
    }
}

class Instructor(name: String) : User(name)

fun main() {
    //Create 2 instances , one of type student and other from tupe instructor
    //however both of those instances refers to the same open class User
    val student = Student("Alex")
    println("Name is ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("student value is: ${student.isLoggedIn}")

    val country = Student.country()
    println("Coutry is: $country")
    println("noOfEnrrolledCourses is: ${Student.noOfEnrrolledCourses}")

    val instructor = Instructor("Dillip")
    println("Name is ${instructor.name}")
    instructor.login()
}