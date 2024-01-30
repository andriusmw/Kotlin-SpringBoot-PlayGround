package com.kotlinplayground.nulls

data class  Movie(
    val id: Int?,
    val name: String
)


fun main() {

    var nameNullable : String?  = null
    println("Value is: $nameNullable")

    nameNullable = "Dilip"
    println("Value is: $nameNullable")

    var name: String = "Dillip2" // this can not be null cause it has not the ? at the end
    println("Value is: $name")

    //New instance of data class Movie
    val movie = Movie(null,"Avengers")
    val savedMovie = saveMovie(movie)
    println("savedMovie= $savedMovie")
}

fun saveMovie(movie: Movie): Movie {
    return movie.copy(id = 1)
    // .copy() copies the object or instance and adds properties inside the parentesis

}
