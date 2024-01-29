package com.kotlinplayground.classes

import java.lang.IllegalArgumentException

class Item() {
    var name: String = ""
    var price: Double = 0.0
  /*  get() = field
    //feil gets the las var as reference

   */

    get() {
        println("Inside getter")
        return field
    }

    set(value) {
        println("Inside thr Setter")
        if(value>= 0.0) {
            println("Inside thr Setter > if")
            field = value
        } else {
            throw IllegalArgumentException("Negative price is not allowed")
        }
    }


    constructor(_name: String) : this(){
        name = _name
    }
}

fun main() {
    val item = Item("Iphone")
    println("Item name is ${item.name}")
    item.name = "Iphone 13"
    println("Item name is ${item.name}")

    item.price = 10.0
    println(item.price)

}