package exercicios

fun main() {

    println("Bem vindo ao Cinema: ")
    println("Quer escolher seu assento? y or n")
    val str = readln()

    while (str.isNotEmpty()) {

        println("1. Show the seats")
        println("2. Buy a ticket")
        println("0. Exit")

        val opt = readln().toInt()

        when (opt) {
            1 -> println("Show the seats")
            2 -> println("Buy a ticket")
            0 -> break
        }
    }
}
