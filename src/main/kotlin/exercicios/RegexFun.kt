package src.main.kotlin.exercicios

fun main() {
    val regex = Regex("[a-zA-Z]+\\s*?=\\s*?\\d+|[a-zA-Z]+\\s*?=\\s*?[a-zA-Z]+|[a-zA-Z]")
    val listDeVariaveis = mutableMapOf<String, Int>()

    while (true) {
        val str = readln()
        if (regex.matches(str)) {
            if (str.matches("[a-zA-Z]+".toRegex()) && listDeVariaveis.containsKey(str)) {
                println(listDeVariaveis[str])
            } else if (str.matches("[a-zA-Z]+".toRegex()) && !listDeVariaveis.containsKey(str)) {
                println("Unknown variable")
            } else {
                val (x, y) = str.replace("\\s".toRegex(), "").replace("=", " ").split(" ").toMutableList()
                println("x: $x - y: $y")
                if (y.matches("[a-zA-Z]".toRegex()) && listDeVariaveis.containsKey(y)) {
                    listDeVariaveis[x] = listDeVariaveis[y]!!.toInt()
                } else if (y.matches("[a-zA-Z]".toRegex()) && !listDeVariaveis.containsKey(y)) {
                    println("Unknown variable")
                } else listDeVariaveis[x] = y.toInt()
            }
        }
    }


}

fun imprimirLista(listDeVariaveis: Map<String, Int>) = println(listDeVariaveis)

//fun lol() {
//    val n = "n = 3"
//    val m = "m=4"
//    val a = "a  =   5"
//    val b = "b = a"
//    val v = "v=   7"
//    val N = "N =9"
//
//    println("n: ${regex.matches(n)}")
//    println("m: ${regex.matches(m)}")
//    println("a: ${regex.matches(a)}")
//    println("b: ${regex.matches(b)}")
//    println("v: ${regex.matches(v)}")
//    println("N: ${regex.matches(N)}")
//}