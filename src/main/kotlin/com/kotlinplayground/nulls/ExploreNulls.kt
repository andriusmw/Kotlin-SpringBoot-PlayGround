package com.kotlinplayground.nulls

//--------------------------DATA CLASSES ------------------------------
data class  Movie(
    val id: Int?,
    val name: String
)

//-------------------------------MAIN -----------------------------------------
fun main() {

    var nameNullable : String?  = null
    println("ValueLength is: ${nameNullable?.length}") // SafeOperator
   /* if(nameNullable!=null){
       println("ValueLength is: ${nameNullable.length}")

    } */
    val length = nameNullable?.length ?: 0 // ?: Elvis operator
    println("length: $length")

    nameNullable = "Dilip"
    println("Value is: $nameNullable")

    var name: String = "Dillip2" // this can not be null cause it has not the ? at the end
    println("Value is: $name")

    //New instance of data class Movie
    val movie = Movie(null,"Avengers")
    val savedMovie = saveMovie(movie)
    println("savedMovie= $savedMovie")
}

//------------------------------- OTHER FUNCTIONS ---------------------------------

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
    // .copy() copies the object or instance and adds properties inside the parentesis

}
