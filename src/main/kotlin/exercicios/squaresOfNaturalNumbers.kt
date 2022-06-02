package src.main.kotlin.exercicios

import kotlin.math.sqrt

fun main() {
    var n = 50

    for (nSqrt in 1..n) {
        var result = sqrt(nSqrt.toFloat())

        if (result.toDouble() % 1 == 0.0) println("$nSqrt")

    }
}
