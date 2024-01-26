package com.kotlinplayground.functions

// when a functions does not return anything it has a return type of : Unit
fun printName(name: String){

    println("Name is: $name")
}
//------------VAR 1  , VAR 2 : RETURN TYPE OF THE VALUE
fun addition(x: Int, y: Int): Int {

    return x+y
}

fun addition_approach1(x: Int, y: Int) = x+y


//-------------------------------------
fun main(){
    printName("Dilip")
   val result =  addition(1,2)
    println("Result is $result")

    val result1 =  addition_approach1(1,2)
    println("Result is $result1")
}

