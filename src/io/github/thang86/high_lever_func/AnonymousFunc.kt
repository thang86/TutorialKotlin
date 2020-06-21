package io.github.thang86.high_lever_func

fun main(args: Array<String>) {
    var program = Program()
   // program.fibonacci(10)
    program.fibonacci(10,object :Process{
        override fun execute(value: Int) {
            print("$value  ")
        }

    })
}

interface Process {
    fun execute(value: Int)
}

class Program {
    fun fibonacci(limit: Int, action: Process) {
        var prev = 0
        var preprev = 0
        var current = 1
        for (i in 1..limit) {
            action.execute(current)
            ///print("${current}  ")
            var temp = current
            preprev = prev
            prev = temp
            current = prev + preprev
        }
        println()

    }
}