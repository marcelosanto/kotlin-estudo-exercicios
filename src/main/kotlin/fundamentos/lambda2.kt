package src.main.kotlin.fundamentos

fun String.magic(init: String.() -> String): String {
    return init(this)
}

fun main() {
    val str = readLine()!!
    val res = str.magic {
        uppercase().reversed().dropLast(1)
    }
    println(res)
}