package src.main.kotlin.exercicios


fun main() {
    val cont = "3 + 8 * ((4 + 3) * 2 + 1) - 6 / (2 + 1)"
    val conta = "8 * 3 + 12 * (4 - 2)"
    println(formatNumbers(cont))
    println(formatNumbers(conta))
}

fun formatNumbers(str: String): String? {
    val regex = Regex("\\d+\\s*(\\+|-|\\*|/)\\s*\\d+")
    val str2 = regex.find(str)?.value

    return str2
}