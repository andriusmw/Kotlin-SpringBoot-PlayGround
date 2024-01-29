package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface  CourseRepository {

    fun getById(id: Int) : Course

    //Gets the course, saves it and return the id
    fun save(course: Course) : Int {
        println("course: $course")
        return course.id
    }
}

interface Repository {
    fun getAll() : Any
}

class SqlCourseRepository : CourseRepository, Repository{
    override fun getById(id: Int): Course {
        return Course(id,
            "Reactive Programing in Modern Java",
            "Dilip")

    }

    override fun getAll(): Any {
      return 1
    }

}


class NoSqlCourseRepository : CourseRepository{
    override fun getById(id: Int): Course {
        return Course(id,
            "Reactive Programing in Modern Java",
            "Dilip")

    }

    override fun save(course: Course): Int {
        println("course in NoSQL...: $course")
        return course.id
    }
}

fun main() {
    val  sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("Course is $course")
    val courseId = sqlCourseRepository.save(Course(5,
        "Reactive Programing in Modern Java",
        "Dilip"))
    println("Saved Course Id is $courseId")


    val  nosqlCourseRepository = NoSqlCourseRepository()
    val course1 = nosqlCourseRepository.getById(2)
    println("Course is $course1")
    val savedCourseId = nosqlCourseRepository.save(Course(6,
        "Reactive Programing in Modern Java",
        "Dilip"))

    println("Saved Course Id in NoSQL... is $savedCourseId")
}