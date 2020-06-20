package io.github.thang86.oop

import java.time.Year

fun main(args: Array<String>) {

    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string as is", false)
    println(someClass1.someString)
    println(someClass2.someString)

    var thisNumberImpletment =45

    wantSomeInterface(object :SomeInterface{

        override fun mustImplement(num: Int): String {
            thisNumberImpletment++
            return "This is from mustImplement : ${num * 100}"
        }


    })
    println(thisNumberImpletment)

}

object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."


}

class SomeClass private constructor(val someString: String) {


    companion object {
        private var privateVar = 6

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.toLowerCase())
            }
            else {
                return SomeClass(str.toUpperCase())
            }
        }
    }
}
interface SomeInterface{
    fun mustImplement(num:Int):String
}
fun wantSomeInterface(si:SomeInterface){
    println("Printing from wantSomeInterface: ${si.mustImplement(22)}")
}
