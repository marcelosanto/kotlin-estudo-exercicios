package src.main.kotlin.exercicios

fun main() {
    val numA = 10000
    val numB = 10
    val x = numA / numB
    val z = numA - numB * x
    val y = "$numA = $numB * $x + $z"

    println(y)
}