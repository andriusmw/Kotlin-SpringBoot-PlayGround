package com.kotlinplayground.collections

fun calculate(x: Int, y: Int, op: (x:Int,y: Int)-> Int) : Int {
   return op(x,y)
    //the third parameter is a lambda whic accepts 2 parameters and return an Int
    // after that, the return call for the "third parameter with X and y SO IT IS CALLING BACK
    // TO val result and completes the action on the lambda space, which in this case is
    // a * b ( 2 * 3) so it is = 6. Yisus!!
}





//-------------------------------------------------
fun main() {
    val addLambda = {x: Int ->x+x}

   val addResult =  addLambda(3)
    println("addResult: $addResult")

    val multipleLambda = {x: Int, y: Int ->
        println("X is $x and Y is $y")
        x*y} // result is what you do on the last line
    val addMultipleResult =  multipleLambda(2,3)
    println("addMultipleResult: $addMultipleResult")

    val result = calculate(2,3,{a, b -> a*b})
    println("Result is $result")
}