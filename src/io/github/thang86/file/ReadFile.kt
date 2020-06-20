package io.github.thang86.file

import java.io.File
import java.nio.charset.Charset

fun main(args: Array<String>) {
   var line =  File("filename.txt").reader().readLines()
   line.forEach{println(it)}
}