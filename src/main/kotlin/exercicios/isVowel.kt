package exercicios

fun main() {
    println(isVowel('e'))
}

fun isVowel(letter: Char): Boolean {
    val vogais = mutableListOf<Char>('a', 'e', 'i', 'o', 'u')
    for (i in vogais) {
        if (letter.lowercaseChar() == i) return true
    }
    return false
}
