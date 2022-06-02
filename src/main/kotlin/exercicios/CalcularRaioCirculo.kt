import java.lang.Math.PI

fun main() {
    val circulo = 15 // var => variável imutável
    //val pi = 3.141516 // val => variável mutável

    print("Informe o tamanho do circulo: ")
    val circuloTamanho:Int = readLine()!!.toInt()
    val valorDoRaio = circuloTamanho/(2*PI)

    println("Circulo mede: $circulo" )
    println("Valor do Raio do Circulo: $valorDoRaio")
}
