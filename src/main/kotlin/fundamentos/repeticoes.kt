package fundamentos

fun main() {
    //print10()
    val arr = arrayOf(
        "ubV",
        "CVCU23G1",
        "LfBw",
        "Jmmx2yEb",
        "jZZiiLq",
        "WYG4",
        "dEh9SFO0",
        "bSHqsns",
        "6118J",
        "9VQ",
        "z8mqJo9B",
        "6WhOpRdm",
        "38R446U",
        "7I8IFCc"
    )

    //printArray(arr)
    //whileMenorQue10()
    doWhileMenorQue10()
}

fun print10() {
    for (numero in 1..10) println(numero)
}

fun printArray(array: Array<String>) {
    for (item in array) println(item)
}

fun whileMenorQue10() {
    var x = 0
    while (x < 10) {
        println(x)
        x++
    }
}

fun doWhileMenorQue10() {
    var x = 0
    do {
        println(x)
        x++
    } while (x < 10)
}
