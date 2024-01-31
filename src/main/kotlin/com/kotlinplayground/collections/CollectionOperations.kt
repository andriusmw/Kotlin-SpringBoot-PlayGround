package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {

    val courseList = courseList()

    exploreFilter(courseList)
}

fun exploreFilter(courseList: MutableList<Course>) {

    val developmentCourses = courseList
        // it is a word in kotlin to access each one of the collection item.
        // remember we are accessing data on dataset.data.kt so some classes we don't know come from there
        .filter { it.category == CourseCategory.DEVELOPEMENT }
        .forEach {
            println("developmentCourses: $it")
        }

}