package com.kotlinplayground.nulls

//--------------------------DATA CLASSES ------------------------------
data class  Movie(
    val id: Int?,
    val name: String
)

//-------------------------------MAIN -----------------------------------------
fun main() {

    var nameNullable : String?  = null

    //printName(nameNullable!!)

    nameNullable?.run {
    printName(this)}

    println("ValueLength is: ${nameNullable?.length}") // SafeOperator
   /* if(nameNullable!=null){
       println("ValueLength is: ${nameNullable.length}")

    } */
    nameNullable = "Alex"
    //val length = nameNullable?.length?.toLong() ?: 0 // ?: Elvis operator
    val length = nameNullable.length.toLong() ?: 0 // ?: Elvis operator

    println("length: $length")

    nameNullable = "Dilip"
    println("Value is: $nameNullable")

    var name: String = "Dillip2" // this can not be null cause it has not the ? at the end
    println("Value is: $name")

    //New instance of data class Movie
    val movie = Movie(null,"Avengers")
    val savedMovie = saveMovie(movie)
   println( savedMovie.id!!) // means cannot be null - non-null assertions!!
    println("savedMovie= $savedMovie")
}

//------------------------------- OTHER FUNCTIONS ---------------------------------

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
    // .copy() copies the object or instance and adds properties inside the parentesis

}

//--------------------------------------------

fun printName(name: String){
    println("Name is : $name")
}

