package src.main.kotlin.exercicios


fun main() {
    val letras = Regex("[a-zA-Z]+")
    val listDeVariaveis = mutableMapOf<String, Int>()

    while (true) {
        val str = readln().trimEnd()
        if (str.isBlank()) {
            continue
        } else if (letras.find(str)?.value == null) {
            println(calculatorFunction(str))
        } else if (letras.find(str)?.value != null && "/[a-zA-Z]".toRegex().find(str)?.value == null) {
            if ("=".toRegex().find(str)?.value != null) {
                val (x, y) = str.replace("\\s*".toRegex(), "").split("=")
                listDeVariaveis[x] = y.toInt()
                println(listDeVariaveis)
            } else {
                if (listDeVariaveis[str] != null) println(listDeVariaveis[str])
                else println("Unknown variable")
            }
        } else if ("/[a-zA-Z]".toRegex().find(str)?.value != null) break
    }

}

fun formatMultipleSigns(calculatorNumbers: String): String {
    val multipleSigns = Regex("[+|-]{2,}")

    var tempNumbersMutiplySings = calculatorNumbers

    if (multipleSigns.find(tempNumbersMutiplySings)?.value != null) {
        val temp = multipleSigns.find(tempNumbersMutiplySings)?.value

        if (temp!!.matches("-+".toRegex())) {
            if (temp!!.length % 2 == 0) {
                tempNumbersMutiplySings = tempNumbersMutiplySings.replace(temp, "+")
            } else tempNumbersMutiplySings = tempNumbersMutiplySings.replace(temp, "-")
        } else tempNumbersMutiplySings = tempNumbersMutiplySings.replace(temp, "+")
    }

    return tempNumbersMutiplySings
}

fun calculatorFunction(str: String): String {
    val noParentheses = Regex("(^-?\\d+\\s*(\\+|-|\\*|/|\\^)\\s*\\d+)+")
    val withParentheses = Regex("(\\(\\s*\\d+\\s*(\\+|-|\\*|/|\\^)\\s*\\d+\\s*(\\+|-|\\*|/|\\^)?\\s*\\d*\\s*\\))")
    val multipleSigns = Regex("[+|-]{2,}")
    var result = str

    while (true) {
        if (multipleSigns.find(result)?.value != null) {
            result = formatMultipleSigns(result)
        } else if (withParentheses.find(result)?.value != null) {
            result = sumWithParentheses(result, withParentheses)
        } else if (noParentheses.find(result)?.value != null) {
            result = calcNumbers(result)
        } else {
            break
        }
    }

    return result
}

fun calcNumbers(numbers: String): String {
    var calcTemp: Int
    var result: String

    val regexMulti = Regex("-?\\d+\\s*\\*\\s*\\d+")
    val regexDiv = Regex("-?\\d+\\s*/\\s*\\d+")
    val regexElev = Regex("-?\\d+\\s*\\^\\s*\\d+")

    val calculator: (Int, Int, String) -> Int = function()

    if (regexElev.find(numbers)?.value != null) {
        val (x, y) = regexElev.find(numbers)?.value?.replace("\\s*".toRegex(), "")?.split("^")!!.map { it.toInt() }
        val temp = regexElev.find(numbers)?.value
        result = numbers.replace(temp!!, elevado(x, y).toString())

    } else if (regexMulti.find(numbers)?.value != null) {
        val teste = regexMulti.find(numbers)?.value?.replace("\\s*".toRegex(), "")?.replace("*", " * ")?.split(" ")
            ?.toMutableList()

        val temp = regexMulti.find(numbers)?.value

        calcTemp = teste?.let { calculator(teste[0].toInt(), teste[2].toInt(), teste[1]) }!!
        result = numbers.replace(temp!!, calcTemp.toString())


    } else if (regexDiv.find(numbers)?.value != null) {
        val teste = regexDiv.find(numbers)?.value?.replace("\\s*".toRegex(), "")?.replace("/", " / ")?.split(" ")
            ?.toMutableList()
        val temp = regexDiv.find(numbers)?.value

        calcTemp = teste?.let { calculator(teste[0].toInt(), teste[2].toInt(), teste[1]) }!!
        result = numbers.replace(temp!!, calcTemp.toString())
    } else {
        val listInt = mutableListOf<Int>()

        numbers.replace("\\s+".toRegex(), "").replace("-", ",-").replace("+", ",+").replace("^,".toRegex(), "")
            .split(",").map { listInt.add(it.toInt()) }

        result = listInt.sum().toString()
    }

    return result
}

fun elevado(x: Int, y: Int): Int {
    //valor x elevado
    var h = 1

    for (i in 1..y) {
        h *= x
    }

    return h
}

private fun function(): (Int, Int, String) -> Int {
    val calculator: (Int, Int, String) -> Int = { number01: Int, number02: Int, operation: String ->

        when (operation) {
            "*" -> number01 * number02
            "/" -> number01 / number02
            else -> 0
        }
    }
    return calculator
}

fun sumWithParentheses(str: String, regex: Regex): String {
    val parents = regex.find(str)?.value

    var parentes = parents?.replace("(", "")?.replace(")", "").let { calcNumbers(it!!) }

    if (parentes.split(" ").toMutableList().size > 1) {
        parentes = "($parentes)"
    }

    return str.replace(parents!!, parentes)
}

