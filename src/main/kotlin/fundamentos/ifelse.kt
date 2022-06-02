package fundamentos

fun main() {
    println(parOuImpar(84))
    println(parOuImpar(97))
    println(parOuImpar(995))
    println(parOuImpar(976))
}

fun parOuImpar(numero: Int): String {
    return if (numero % 2 == 0) "par" else "Impar"
}
