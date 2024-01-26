package com.kotlinplayground.functions

import java.time.LocalDate

//----------------------------------------------------
// when a functions does not return anything it has a return type of : Unit
fun printName(name: String){

    println("Name is: $name")
}
//´-----------------------------------------------------
//------------VAR 1  , VAR 2 : RETURN TYPE OF THE VALUE
fun addition(x: Int, y: Int): Int {

    return x+y
}
//-------------------------------------------------------------
fun addition_approach1(x: Int, y: Int) = x+y


//-------------------------------------------------
// using = "default value" we can assign default value to function properties in case we do get them when
//the function is called
fun printPersonDetails(name: String,
                       email: String = "",
                       dob: LocalDate = LocalDate.now()){
    println("Name is $name and the email is $email" +
            "and the dob is $dob")
}



//-------------------------------------
fun main(){
    printName("Dilip")
   val result =  addition(1,2)
    println("Result is $result")

    val result1 =  addition_approach1(1,2)
    println("Result is $result1")

    printPersonDetails("Dilip", "abc@gmail.com", LocalDate.parse("2000-01-01"))
    printPersonDetails("Dilip")

}

