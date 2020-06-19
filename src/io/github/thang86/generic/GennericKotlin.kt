package io.github.thang86.generic

import java.math.BigDecimal

fun main(args: Array<String>) {

    val list = mutableListOf<String>("Thang")
    list.add("Thang86")
    list.add("Thang96")
    printColection(list)

    val dbList = mutableListOf<BigDecimal>();
    dbList.add(BigDecimal(1000.3))
    dbList.add(BigDecimal(10.3))
    dbList.add(BigDecimal(153.3))
    printColection(dbList)


    // number
    var listNumber = listOf(1,2,3,4,5,6)

    var listShort:List<Short?> = listOf(10,20,30,40,50,60)

    var listFloat:List<Float?> = listOf(10.3f,20.4f,30.5f,40.6f,50.7f,60.8f)

//    printColection(listShort)
//    printColection(listShort)
//    printColection(listFloat)
//    convertToInt(listNumber)

//    convertToInt(listShort)

//    convertToInt(listFloat)

//    append(StringBuffer("ss"),StringBuffer("lo"))




}
fun <T> printColection( colections:List<T>){
    for (item in colections){
        println(item)
    }
}
// extension function
//fun <T> List<T>.printColection(){
//    for (item in this){
//        println(item)
//    }
//}

fun <T:Number?> convertToInt(colection:List<T>){
    for (item in colection){
        print("${item?.toInt()}  ")
    }
    println()
}
fun <T> append(item1:T,item2:T) where T:CharSequence,T:Appendable{
    println("The string append : ${item1.append(item2)}")

}

