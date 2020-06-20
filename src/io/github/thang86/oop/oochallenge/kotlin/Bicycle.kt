package io.github.thang86.oop.oochallenge.kotlin


fun main(args: Array<String>) {
    var bicycle = MountainBike(12,5,9,5)
    bicycle.printDescription()
}
abstract class Bicycle(var cadence: Int, var gear: Int, var speed: Int) {

    fun applyBrake(decrement: Int) {
        speed += decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }
    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence " +
                "travelling at a speed of $speed.")
    }

}

class MountainBike( var seatHeight:Int, cadence: Int,gear: Int,speed: Int):Bicycle(cadence,gear,speed){
    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

class RoadBike( var tireWidth:Int, cadence: Int,gear: Int,speed: Int):Bicycle(cadence,gear,speed){
    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}