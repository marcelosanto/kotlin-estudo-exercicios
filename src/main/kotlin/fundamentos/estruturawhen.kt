package fundamentos

fun main() {
    //val x = 31

    ////when (x) {

    //  5, -5 -> println("x == 5")
    //   8 -> println("x == 8")
    //  10 -> {
    //      println("x == 10")
    //      println("x é uma dezena")
    //  }
    //  in 22..24 -> println("que viagem")
    //  !in 25..30 -> println("Não conheco esse numero")
    //  else -> println("Numero não mapeado")
    // }

    when {
        comecaComOi(5) -> println("5")
        comecaComOi("oi, tudo bem?") -> println("oi, tudo bem?")
    }
}

fun comecaComOi(x: Any): Boolean {
    return when (x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}
