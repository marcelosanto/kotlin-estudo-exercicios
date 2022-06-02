package exercicios

fun main() {
    val number1 = 1
    val number2 = 2
    val number3 = 3
    val number4 = 4

    println(isGreater(number1, number2, number3, number4))
}

fun isGreater(number1: Int, number2: Int, number3: Int, number4: Int): Boolean = number1 + number2 > number3 + number4
