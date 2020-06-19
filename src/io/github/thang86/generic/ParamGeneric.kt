package io.github.thang86.generic

import java.math.BigDecimal

fun main(args: Array<String>) {

    var mixed :List<Any> = listOf("ThangTX",BigDecimal(12),12,"fall")
    var bigNumber = getElementsOfType<BigDecimal>(mixed)

    for (item in bigNumber){
        print("${item}  ")
    }



}
inline fun <reified T> getElementsOfType(colection:List<Any>):List<T>{
    var newList:MutableList<T> = mutableListOf()

    for (item in colection){
        if (item is T){
            newList.add(item)
        }
    }

    return newList
}