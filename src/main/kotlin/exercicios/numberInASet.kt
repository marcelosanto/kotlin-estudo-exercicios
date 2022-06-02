package exercicios

fun main() {
    val x = readln().toInt()
    val numberList = mutableListOf<Int>()

    repeat(x) {
        val y = readln().toInt()
        numberList.add(y)
    }

    val w = readln().toInt().toInt()

    if (numberList.contains(w)) print("YES")
    else println("NO")
}
