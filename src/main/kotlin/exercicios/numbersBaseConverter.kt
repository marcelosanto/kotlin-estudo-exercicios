package src.main.kotlin.exercicios

import kotlin.math.pow

fun main() {

    while (true) {
        println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)")
        val fromOrTo = readln()

        if (fromOrTo == "/from") {
            print("Enter number in decimal system: ")
            val number = readln().toInt()

            print("Enter target base: ")
            val baseNumber = readln().toInt()

            println(convertNumberFrom(number, baseNumber))
        } else if (fromOrTo == "/to") {
            print("Enter source number: ")
            val number = readln()

            print("Enter source base: ")
            val baseNumber = readln().toInt()

            println(convertNumberTO(number, baseNumber))

        } else break
    }

}

fun convertNumberFrom(number: Int, baseNumber: Int): String {
    var binaryN = 0
    var count = 0
    var decimalNumber = number
    val hexadecimalList = mutableListOf<Int>()
    var result = ""

    while (decimalNumber != 0) {
        val rem = decimalNumber % baseNumber

        if (baseNumber == 16) hexadecimalList.add(rem)

        val c = 10.toDouble().pow(count)
        binaryN += (rem * c).toInt()
        decimalNumber /= baseNumber
        count++
    }

    if (hexadecimalList.isNotEmpty() && baseNumber == 16) {
        hexadecimalList.reverse()

        for (i in hexadecimalList) {
            result += when (i) {
                10 -> "A"
                11 -> "B"
                12 -> "C"
                13 -> "D"
                14 -> "E"
                15 -> "F"
                else -> i.toString()
            }
        }
    } else result = binaryN.toString()

    return "Conversion result: $result"

}

fun convertNumberTO(number: String, baseNumber: Int): String {
    val numbersTo = mutableListOf<Int>()

    for (i in number) {
        when (i) {
            'a' -> numbersTo.add(10)
            'b' -> numbersTo.add(11)
            'c' -> numbersTo.add(12)
            'd' -> numbersTo.add(13)
            'e' -> numbersTo.add(14)
            'f' -> numbersTo.add(15)
            else -> numbersTo.add(i.toString().toInt())
        }
    }

    numbersTo.reverse()

    var binaryN = 0

    for ((count, i) in numbersTo.withIndex()) {
        val rem = i * baseNumber.toDouble().pow(count)
        binaryN += rem.toInt()
    }

    return "Conversion to decimal result: $binaryN"

}