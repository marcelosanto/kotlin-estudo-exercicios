package exercicios

fun main() {
//    val str = readln()
//
//    when (str.length) {
//        in 1..4 -> print(str.length)
//        else -> print("")
//    }

    when (readln().trim().toInt()) {
        in 1..4 -> print("Yes!")
        else -> print("Unknown number")
    }

}
