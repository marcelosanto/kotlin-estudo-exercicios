package src.main.kotlin.exercicios

fun main() {
    val str = readln().split(" ").toMutableList()
    var temp = ""

    for (i in str) {
        if (i.length > temp.length) temp = i
    }

    println(temp)
}