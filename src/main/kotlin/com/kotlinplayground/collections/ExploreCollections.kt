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
}