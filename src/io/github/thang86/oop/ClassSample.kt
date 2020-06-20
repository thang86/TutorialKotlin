package io.github.thang86.oop

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Thang",15)
    laserPrinter.printModel()
    SomethingElse("whatever")
}

abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer: ${modelName}")

    open abstract fun bestSellingPrrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName) {
    override fun printModel() = println("The model name of this laser: ${modelName}")
    override fun bestSellingPrrice(): Double = 129.9
}

class SpecialLaserPrinter(modelName: String, ppm: Int) : LaserPrinter(modelName, ppm) {
    override fun printModel() = println("The model name of this special: ${modelName}")
}

open class Something :MySubInterface{
    override fun MyFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun MySubFunction(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    val someString: String

    constructor(someString: String) {
        this.someString = someString
        println("parent contructor")
    }
}

class SomethingElse : Something {
    constructor(someStringParam: String) : super(someStringParam) {
        println("child contructor")

    }
}

interface MyInterface {
    fun MyFunction(str:String):String
}

interface MySubInterface : MyInterface {
    fun MySubFunction(num:Int):String
}