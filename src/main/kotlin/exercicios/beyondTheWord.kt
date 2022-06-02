package exercicios

fun main() {
    val str = "hello"
    val abc = mutableListOf(
        "a",
        "b",
        "c",
        "d",
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

    for (i in str) {
        if (abc.contains(i.toString())) abc.remove(i.toString())
    }


    println(abc.joinToString().replace(",", "").replace(" ", ""))
}
