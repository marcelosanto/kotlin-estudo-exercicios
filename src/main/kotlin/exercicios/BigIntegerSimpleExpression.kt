package src.main.kotlin.exercicios

fun main() {
    val a = readln().toBigInteger()
    val b = readln().toBigInteger()
    val c = readln().toBigInteger()
    val d = readln().toBigInteger()

    val result = a.abs() * b + c - d

    print(result)

}