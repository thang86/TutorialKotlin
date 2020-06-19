package io.github.thang86.squences




fun main(args: Array<String>) {

    var immutableMap = mapOf<Int,Car>(1 to Car("green","Toyota",2015),
            2 to Car("red","Ford",2016),
            3 to Car("siliver","Toyota",2020),
            4 to Car("red","Ford",2019),
            5 to Car("green","BWM",2015),
            6 to Car("yellow","Honda",2019)
            )

    println(immutableMap)
}
data class Car(val color:String,val model: String,var year:Int)