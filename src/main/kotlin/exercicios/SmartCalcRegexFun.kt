package src.main.kotlin.exercicios


fun main() {
    val cont = "3 + 8 * ((4 + 3) * 2 + 1) - 6 / (2 + 1)"
    val conta = "8 * 3 + 12 * (4 - 2)"
    val conta2 = "(7 * 2 + 1)"
    //println(chameFuncao(cont))
    //println(chameFuncao(conta2))

}

fun chameFuncao(str: String): String {
    val regex = Regex("(^\\d+\\s*(\\+|-|\\*|/)\\s*\\d+)+")
    val regex2 = Regex("(\\(\\s*\\d+\\s*(\\+|-|\\*|/)\\s*\\d+\\s*(\\+|-|\\*|/)?\\s*\\d*\\s*\\))")
    var result = str

    while (true) {
        if (regex2.find(result)?.value != null) {
            result = resolverParenteses(result)
            println("parentes: $result")
        } else if (regex.find(result)?.value != null) {
            result = calcNumbers(result)
            println("normal: $result")
        } else {
            break
        }
    }

    return result
}

fun calcNumbers(numbers: String): String {
    println("nbr: $numbers")
    var calcTemp = 0
    var result = ""

    val str = numbers

    val regexMult = Regex("\\d+\\s*\\*\\s*\\d+")
    val regexDiv = Regex("\\d+\\s*/\\s*\\d+")
    val regexSub = Regex("\\d+\\s*-\\s*\\d+")
    val regexSum = Regex("\\d+\\s*\\+\\s*\\d+")

    val calculadora: (Int, Int, String) -> Int = { numero1: Int, numero2: Int, operacao: String ->
        when (operacao) {
            "+" -> numero1 + numero2
            "-" -> numero1 - numero2
            "*" -> numero1 * numero2
            "/" -> numero1 / numero2
            else -> 0
        }
    }

    if (regexMult.find(str)?.value != null) {
        val teste = regexMult.find(str)?.value?.split(" ")?.toMutableList()
        val temp = regexMult.find(str)?.value

        calcTemp = teste?.let { calculadora(teste[0].toInt(), teste[2].toInt(), teste[1]) }!!

        result = str.replace(temp!!, calcTemp.toString())

    } else if (regexDiv.find(str)?.value != null) {
        val teste = regexDiv.find(str)?.value?.split(" ")?.toMutableList()
        val temp = regexDiv.find(str)?.value
        calcTemp = teste?.let { calculadora(teste[0].toInt(), teste[2].toInt(), teste[1]) }!!
        result = str.replace(temp!!, calcTemp.toString())
    } else if (regexSub.find(str)?.value != null) {
        val teste = regexSub.find(str)?.value?.split(" ")?.toMutableList()
        val temp = regexSub.find(str)?.value
        calcTemp = teste?.let { calculadora(teste[0].toInt(), teste[2].toInt(), teste[1]) }!!
        result = str.replace(temp!!, calcTemp.toString())
    } else if (regexSum.find(str)?.value != null) {
        val teste = regexSum.find(str)?.value?.split(" ")?.toMutableList()
        val temp = regexSum.find(str)?.value
        calcTemp = teste?.let { calculadora(teste[0].toInt(), teste[2].toInt(), teste[1]) }!!
        result = str.replace(temp!!, calcTemp.toString())
    }

    return result
}

fun resolverParenteses(str: String): String {
    val conta = str
    val parents = "(\\(\\s*\\d+\\s*(\\+|-|\\*|/)\\s*\\d+\\s*(\\+|-|\\*|/)?\\s*\\d*\\s*\\))".toRegex().find(conta)?.value
    println("prt: $parents")

    var parentes = parents?.replace("(", "")?.replace(")", "")

    val replace = conta.replace(parents!!, calcNumbers(parentes!!))

    println("rpl: $replace")

    return replace


}
