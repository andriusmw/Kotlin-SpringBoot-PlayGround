package com.kotlinplayground.collections

fun main() {
   val names =  listOf("Alex","Ben","Chloe")
    println("Names: $names")

    val namesMutableList =  mutableListOf("Alex","Ben","Chloe")
    println("namesMutableList: $namesMutableList")
    namesMutableList.add("Adam")
    println("namesMutableList after: $namesMutableList")

   val set = setOf("Alex","Ben","Chloe")
    println("set: $set")

    val mutableSet = mutableSetOf("Alex","Ben","Chloe")
    println("mutableset: $mutableSet")
    mutableSet.add("Adam")
    println("mutableset after: $mutableSet")

   val nameAgeMap =  mapOf("Dilip" to 34, "Scooby" to 4)
    println("nameAgeMap: $nameAgeMap")

    val mutableNameAgeMap =  mutableMapOf("Dilip" to 34, "Scooby" to 4)
    println("mutableNameAgeMap: $mutableNameAgeMap")
    //name MutableMapOf  [KEY] = VALUE
    mutableNameAgeMap["abc"] = 100
    println("mutableNameAgeMap after: $mutableNameAgeMap")


}