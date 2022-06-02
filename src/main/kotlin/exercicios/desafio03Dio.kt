package src.main.kotlin.exercicios

fun main(args: Array<String>) {

    /*val input = readLine()!!.split(" ").map { it.toInt() }

    val a = input[0]
    val b = input[1]
    val c = input[2]
    val d = input[3]

    if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
        println("Valores aceitos")
    } else {
        println("Valores nao aceitos")
    }*/

    /*val N = readLine()!!.toInt()

    for (i in 1..N) {

        val x = readLine()!!
        val result = x.filter { it.isLetter() }

        if (result.first().isUpperCase()) {
            val rst = x.filter { it.isDigit() }
            println(-rst[0].digitToInt() + rst[1].digitToInt())
        } else {
            val rst = x.filter { it.isDigit() }
            println(rst[0].digitToInt() + rst[1].digitToInt())
        }


    }*/

    /* repeat(4) {
         val x = readln()
         val bol = x.filter { it.isDigit() }

         if (bol.isNotEmpty()) print("true") else print("false")
     }*/

    //Do not touch code below
    val inputList: MutableList<MutableList<String>> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toMutableList()
        inputList.add(strings)
    }
    //write your code here
    //val arraySize = inputList.size - 1
    //println("${inputList[0].first()} ${inputList[0].last()}")
    //println("${inputList[arraySize].first()} ${inputList[arraySize].last()}")
    println("[${inputList.last()}, ${inputList.first()}]")
}

private fun sumOrSub(x: String, b: Boolean) {
    val rst = x.filter { it.isDigit() }
    println(-rst[0].digitToInt() + rst[1].digitToInt())
}
