package io.github.thang86.high_lever_func


fun main(args: Array<String>) {
    wantFuncSomething(object :MyInteface{
        override fun wantPrintSomething(value: Int) = "This is must implement: ${value}"

    })
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

interface MyInteface{
    fun wantPrintSomething(value: Int):String
}
fun wantFuncSomething(si:MyInteface){
    println("Want func something: ${si.wantPrintSomething(20)}")
}