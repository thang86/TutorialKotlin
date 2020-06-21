package io.github.thang86.infixfunction


fun main(args: Array<String>) {
    var header = Header("Thang");
    var header2 = Header("Thuc");
    var header3 = header plus header2
   // var header4 = header + header2
    println(header3.name)
}
class Header(var name:String)

infix operator fun Header.plus(other:Header):Header{
    return Header(this.name+ other.name)
}

