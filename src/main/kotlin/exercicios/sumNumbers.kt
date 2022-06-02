package src.main.kotlin.exercicios

import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val arrayList = ArrayList<Int>()
    var sumNumbers = 0

    while (scanner.hasNext()) {
        val numbers = scanner.next()!!.toInt()
        if (numbers == 0) break else arrayList += numbers
    }

    if (arrayList.isNotEmpty()) sumNumbers = arrayList.reduce { sum, element -> sum + element }

    print("$sumNumbers")
}
