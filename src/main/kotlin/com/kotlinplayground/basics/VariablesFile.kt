package com.kotlinplayground.basics

import com.kotlinplayground.functions.courseName
import com.kotlinplayground.functions.topLevelFunction

fun main() {
    // val = const
    val name : String = "Dilip";
    println(name)

    var age : Int = 34
    println(age)
    age = 35
    println(age)

    val salary = 30000L
    // with the L at the end it assumes it is a Long type
    println(salary)

    val course = "Jotlin Spring"
    println("course : $course" )
    println("course : $course and the course length is: ${course.length}")

    val multiLine = "ABC \n DEF"
    println(multiLine)

    // the triple " writes in different lines without changing columns
    val multiLine1 =  """
        ABC
        DEF
        """.trimIndent()
    println(multiLine1)
    topLevelFunction()
    val num = topLevelFunction()
    println("Num is : $num")
   println(courseName)
}