package src.main.kotlin.exercicios

fun main() {

    println(func(listOf(1, 2, 3, 4, 5)))
}

fun func(array: List<Int>): Int {
    if (array.isEmpty()) return -1

    var result = 0

    for (element in array) {
        result += element
    }

    return result / array.size
}