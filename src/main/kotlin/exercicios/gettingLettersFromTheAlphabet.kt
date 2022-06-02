package exercicios

fun main() {
    val abc = mutableListOf(
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "u",
        "v",
        "w",
        "x",
        "y",
        "z"
    )
    val res = mutableListOf<String>()

    val str = "o"

    for (i in abc) {
        if (i != str) {
            res.add(i)
        } else {
            break
        }
    }
    println(res.joinToString().replace(",", "").replace(" ", ""))
}
