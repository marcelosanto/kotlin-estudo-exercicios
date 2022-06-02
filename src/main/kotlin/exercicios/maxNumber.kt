package exercicios

import java.util.*

fun main() {
    // While loops  The first position of the largest element

    val scanner = Scanner(System.`in`)
    val arrayList = emptyList<Int>().toMutableList()
    var maxNumber = 0
    var indexNumber = 0

    while (scanner.hasNext()) {
        arrayList += scanner.next()!!.toInt()

        maxNumber = arrayList.maxOf { it }
        indexNumber = arrayList.indexOf(maxNumber)
    }

    print("$maxNumber ${indexNumber + 1}")
}
