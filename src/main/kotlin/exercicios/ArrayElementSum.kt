package src.main.kotlin.exercicios

import kotlin.random.Random

fun findSumK(a: IntArray, k: Int) {
    /*for (i in a.indices) {
        for (j in i + i until a.size) {
            if (a[i] + a[j] == k) println("The indices are $i and $j")
        }
    }*/

    val map = hashMapOf<Int, Int>()

    for (i in a.indices) {
        val element = a[i]
        val result = k - element
        if (map.containsKey(result)) {
            val j = map[result]
            println("The indices are $i and $j")
        }
        map[element] = i
    }
}

fun main() {
    val random = Random(42)
    val a = IntArray(10_000) {
        random.nextInt(-100_000_000, 100_000_000)
    }

    val start = System.currentTimeMillis()

    findSumK(a, 32)

    val end = System.currentTimeMillis()

    println("Elapsed time: ${end - start}ms")
}
