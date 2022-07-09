package src.main.kotlin.exercicios


fun main() {
    val cont = "3 + 8 * ((4 + 3) * 2 + 1) - 6 / (2 + 1)"
    val conta = "8 * 3 + 12 * (4 - 2)"
    //println(chameFuncao(cont))
    println(chameFuncao(conta))

    println("(\\(\\s*\\d+\\s*(\\+|-|\\*|/)\\s*\\d+\\s*\\))".toRegex().find(conta)?.value)
}

fun chameFuncao(str: String): String {
    val regex = Regex("(^\\d+\\s*(\\+|-|\\*|/)\\s*\\d+)+")
    val regex2 = Regex("(\\(\\s*\\d+\\s*(\\+|-|\\*|/)\\s*\\d+\\s*\\))")
    var result = str

    while (true) {
        if (regex.find(result)?.value != null) {
            result = formatNumbers(result)!!
        } else if (regex2.find(result)?.value != null) {

        } else {
            break
        }
    }

    return result
}

fun formatNumbers(str: String): String? {
    val regex = Regex("(\\d+\\s*(\\+|-|\\*|/)\\s*\\d*)+")

    val str2 = regex.find(str)?.value
    val str4 = regex.find(str)?.value?.split(" ")?.toMutableList()
    val str3 = calcNumbers(str4)

    return str2?.let { str.replace(str2, str3) }
}

fun calcNumbers(numbers: MutableList<String>?): String {
    var calcTemp = 0

    if (numbers != null) {
        if (numbers.contains("+")) {
            numbers.remove("+")
            for (i in numbers) {
                calcTemp += i.toInt()
            }
        } else if (numbers.contains("*")) {
            numbers.remove("*")
            for (i in numbers) {
                if (calcTemp == 0) calcTemp = 1
                calcTemp *= i.toInt()
            }
        } else if (numbers.contains("-")) {
            numbers.remove("-")
        } else if (numbers.contains("/")) {
            numbers.remove("/")
        }
    }

    return calcTemp.toString()
}
