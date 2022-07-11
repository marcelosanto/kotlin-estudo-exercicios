package src.main.kotlin.exercicios


fun main() {
    val cont = "3 + 8 * ((4 + 3) * 2 + 1) - 6 / (2 + 1)"
    val conta = "2 - 2 + 3"


    println(calculatorFunction(cont))
    println(calculatorFunction(conta))

}

fun calculatorFunction(str: String): String {
    val noParentheses = Regex("(^\\d+\\s*(\\+|-|\\*|/)\\s*\\d+)+")
    val withParentheses = Regex("(\\(\\s*\\d+\\s*(\\+|-|\\*|/)\\s*\\d+\\s*(\\+|-|\\*|/)?\\s*\\d*\\s*\\))")
    var result = str

    while (true) {
        if (withParentheses.find(result)?.value != null) {
            result = sumWithParentheses(result)
        } else if (noParentheses.find(result)?.value != null) {
            result = calcNumbers(result)
        } else {
            break
        }
    }

    return result
}

fun calcNumbers(numbers: String): String {
    var calcTemp = 0
    var result = ""

    val regexMulti = Regex("\\d+\\s*\\*\\s*\\d+")
    val regexDiv = Regex("\\d+\\s*/\\s*\\d+")
    val regexSub = Regex("\\d+\\s*-\\s*\\d+")
    val regexSum = Regex("\\d+\\s*\\+\\s*\\d+")

    val calculator: (Int, Int, String) -> Int = function()

    if (regexMulti.find(numbers)?.value != null) {
        val teste = regexMulti.find(numbers)?.value?.split(" ")?.toMutableList()
        val temp = regexMulti.find(numbers)?.value
        calcTemp = teste?.let { calculator(teste[0].toInt(), teste[2].toInt(), teste[1]) }!!
        result = numbers.replace(temp!!, calcTemp.toString())

    } else if (regexDiv.find(numbers)?.value != null) {
        val teste = regexDiv.find(numbers)?.value?.split(" ")?.toMutableList()
        val temp = regexDiv.find(numbers)?.value
        calcTemp = teste?.let { calculator(teste[0].toInt(), teste[2].toInt(), teste[1]) }!!
        result = numbers.replace(temp!!, calcTemp.toString())
    } else if (regexSub.find(numbers)?.value != null) {
        val teste = regexSub.find(numbers)?.value?.split(" ")?.toMutableList()
        val temp = regexSub.find(numbers)?.value
        calcTemp = teste?.let { calculator(teste[0].toInt(), teste[2].toInt(), teste[1]) }!!
        result = numbers.replace(temp!!, calcTemp.toString())
    } else if (regexSum.find(numbers)?.value != null) {
        val teste = regexSum.find(numbers)?.value?.split(" ")?.toMutableList()
        val temp = regexSum.find(numbers)?.value
        calcTemp = teste?.let { calculator(teste[0].toInt(), teste[2].toInt(), teste[1]) }!!
        result = numbers.replace(temp!!, calcTemp.toString())
    }

    return result
}

private fun function(): (Int, Int, String) -> Int {
    val calculator: (Int, Int, String) -> Int = { number01: Int, number02: Int, operation: String ->
        when (operation) {
            "+" -> number01 + number02
            "-" -> number01 - number02
            "*" -> number01 * number02
            "/" -> number01 / number02
            else -> 0
        }
    }
    return calculator
}

fun sumWithParentheses(str: String): String {
    val parents = "(\\(\\s*\\d+\\s*(\\+|-|\\*|/)\\s*\\d+\\s*(\\+|-|\\*|/)?\\s*\\d*\\s*\\))".toRegex().find(str)?.value

    var parentes = parents?.replace("(", "")?.replace(")", "").let { calcNumbers(it!!) }

    if (parentes.split(" ").toMutableList().size > 1) {
        parentes = "($parentes)"
    }

    return str.replace(parents!!, parentes)
}
