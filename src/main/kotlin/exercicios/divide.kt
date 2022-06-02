package exercicios

fun divide(a: Long, b: Long): Double {
    if (b > 0) {
        return a.toDouble() / b.toDouble()
    }

    return 0.0
}

fun main() {
    val a = 500000000000
    val b = 200000000000

    println(divide(a, b))
}
