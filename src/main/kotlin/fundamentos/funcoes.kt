package fundamentos

fun main() {
//    val soma: Int = retornaSoma(20, 30)
//    println(soma)
//
//    print("Informe um numero: ")
//    val numero01 = readLine()!!.toInt()
//
//    print("Informe mais um numero: ")
//    val numero02 = readLine()!!.toInt()
//
//    print("O resultado da soma é: ${retornaSoma(numero01, numero02)}")

    val a = 157
    println(getLastDigit(a))

}

fun retornaSoma(x: Int = 0, y: Int = 0): Int {
    return x * y
}

fun getLastDigit(a: Int): Char = a.toString()[a.toString().length - 1]
