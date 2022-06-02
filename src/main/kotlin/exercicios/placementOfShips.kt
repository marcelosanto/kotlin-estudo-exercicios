package exercicios

fun main() {

    val x = mutableListOf<Int>(1, 2, 3, 4, 5)
    val y = mutableListOf<Int>(1, 2, 3, 4, 5)
    val w = mutableListOf<MutableList<String>>()

    repeat(3) {
        val z = readln().split(" ")
        w.add(z as MutableList<String>)
    }

    for (i in w.indices) {
        x.remove(w[i][0].toInt())
        y.remove(w[i][1].toInt())
        //println("${w[i][0].toInt()} ${w[i][1].toInt()}")
    }

    println(x.joinToString().replace(",", ""))
    println(y.joinToString().replace(",", ""))
//    println("${w[0][0].toInt()} ${w[0][1].toInt()}")
//    println("${w[1][0].toInt()} ${w[1][1].toInt()}")
//    println("${w[2][0].toInt()} ${w[2][1].toInt()}")
}
