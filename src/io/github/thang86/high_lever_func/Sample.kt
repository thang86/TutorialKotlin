package io.github.thang86.high_lever_func

/**
 * Extension class la cho phep them cac method and prop vao ben trong 1 class of interface
 * ma khong phai ke thua lai class day
 */

fun main(args: Array<String>) {

}

class A{
    fun methodA(){
        println("Method A of class A")
    }
    fun methodX(){
        println("Method X of class A")
    }

    fun B.methodB2(){
        methodA()
        this.methodB()
        methodX() // method b
        this@A.methodX()// call method of A
    }
    fun callB2FromA(b:B){
        b.methodB2()

    }
}

class B{
    fun methodB(){
        println("Method B of class B")
    }
    fun methodX(){
        println("Method X of class B ")
    }
}
