package io.github.thang86.squences




fun main(args: Array<String>) {

    var immutableMap = mapOf<Int,Car>(1 to Car("green","Toyota",2015),
            2 to Car("red","Ford",2016),
            3 to Car("siliver","Toyota",2020),
            4 to Car("red","Ford",2019),
            5 to Car("green","BWM",2015),
            6 to Car("yellow","Honda",2019)
            )

    val imutablList = listOf<Car>(
            Car("green","Toyota",2015),
            Car("yellow","Honda",2019),
            Car("red","Ford",2016),
            Car("siliver","Toyota",2020)
    )
    println(immutableMap.asSequence().filter { it -> it.value.model=="Ford" }.map { it -> it.value.color }.toList())

    var model = imutablList.asSequence()
            .filter { println("filter $it ");  it.model.endsWith("a") }
            .map {println("map $it "); it.model }

    for (i in model){
        println(i)
    }
}
data class Car(val color:String,val model: String,var year:Int)

