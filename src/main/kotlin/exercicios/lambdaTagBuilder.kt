package src.main.kotlin.exercicios

/* Do not change code below */
fun builderString(
    builder: StringBuilder.(String) -> Unit
): String {
    val stringBuilder = StringBuilder()
    stringBuilder.builder("")
    return stringBuilder.toString()
}

fun main() {
    val a = readln()
    val res = builderString {
        // write your code here
        append("<tag>$a</tag>")
    }
    println(res)
}