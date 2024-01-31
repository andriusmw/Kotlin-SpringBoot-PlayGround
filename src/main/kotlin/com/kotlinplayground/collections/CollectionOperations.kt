package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

//---------------------------------MAIN----------------------

fun main() {

    val courseList = courseList()

    //exploreFilter(courseList) -uncomment to see the explorerFilter results
    exploreMap(courseList)
}


//---------------------------- FUNCTIONS  -------------------------

fun exploreMap(courseList: MutableList<Course>) {

   val courses =  courseList.map { "${it.name} - ${it.category}" }
       .forEach{
           println("courses: $it")
       }




}


//---------------------------------------------

fun exploreFilter(courseList: MutableList<Course>) {

    val developmentCourses = courseList
        // it is a word in kotlin to access each one of the collection item.
        // remember we are accessing data on dataset.data.kt so some classes we don't know come from there
        .filter { it.category == CourseCategory.DEVELOPEMENT }
        .forEach {
            println("developmentCourses: $it")
        }

}