package src.main.kotlin.exercicios

fun main() {
    val x = readln().toBigInteger()
    val y = readln().toBigInteger()
    val z = x.gcd(y)
    val result = (x * y) / z

    println(result)
}