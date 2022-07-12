package src.main.kotlin.fundamentos

fun main(args: Array<String>) {

    val lista = mutableMapOf("a" to 10, "b" to 20, "c" to 30)

    var text = "a+b+c-3"
    val regex = Regex("[a-zA-z]+")
    val matches = regex.findAll(text)
    val names = matches.map { it.groupValues[0] }.toMutableList()

    for (i in names.iterator()) {
        if (lista[i] != null) {
            println(lista[i])
            text = text.replace(i, lista[i].toString())

        } else {
            println("Unknown variable")
        }
    }
    println(text)

}