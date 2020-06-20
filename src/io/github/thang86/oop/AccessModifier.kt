package io.github.thang86.oop

fun main(args: Array<String>) {
    val employee:Employee = Employee("Thang")
    println(employee.firstName)
    println(employee.fullTime)

}
class Employee (val firstName:String, fullTime:Boolean=true){

    val fullTime = fullTime
    get() {
        return  field
    }

}