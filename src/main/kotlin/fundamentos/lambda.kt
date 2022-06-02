package fundamentos

fun main() {

    //val lambdaName: (InputType) -> ReturnType = (arguments: InputType -> body)

    val greeter: (String) -> String = { name: String -> "Hello $name" }
    println(greeter("Marcelo"))

    val somaDoisNumeros: (Int, Int) -> Int = { numero1: Int, numero2: Int -> numero1 + numero2 }
    println(somaDoisNumeros(2, 9))

    val calculadora: (Int, Int, String) -> Int = { numero1: Int, numero2: Int, operacao: String ->
        when (operacao) {
            "+" -> numero1 + numero2
            "-" -> numero1 - numero2
            "*" -> numero1 * numero2
            "/" -> numero1 / numero2
            else -> 0
        }
    }

    println(calculadora(210, 30, "/"))
}
