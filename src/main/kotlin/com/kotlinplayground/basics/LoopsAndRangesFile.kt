package com.kotlinplayground.basics

//-----------------------MAIN ----------------------
fun main() {
/*
    val range = 1..10
    for(i in range){
        println("i : $i")
    }

    val reverseRange = 10 downTo 1
    for(i in reverseRange){
        println("i : $i")
    }

    //it goes 2 by 2
    for(i in reverseRange step 2){
        println("ReverseRange with Skip : $i")
    } */

 exploreWhile()
    exploreDoWhile()

}


// -----------------------------END MAIN ----------------

fun exploreDoWhile() {
    // this enter the do action phase before it is checked
  var i = 0
    do{
        println("Value of i is: $i")
        i++
    } while (i < 5)
}

fun   exploreWhile(){
    var x = 1
    while(x < 5){
        println("Value of X is :$x")
        x++
    }
}