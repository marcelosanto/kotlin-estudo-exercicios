package exercicios

fun main() {

    val x = 100

    when (x) {
        in 1..4 -> print("few")
        in 5..9 -> print("several")
        in 10..19 -> print("pack")
        in 20..49 -> print("lots")
        in 50..99 -> print("horde")
        in 100..249 -> print("throng")
        in 250..499 -> print("swarm")
        in 500..999 -> print("zounds")
        in 1000..99999 -> print("legion")
        else -> print("no army")
    }


}
