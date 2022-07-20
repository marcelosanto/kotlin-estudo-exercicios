package src.main.kotlin.exercicios

fun main() {

    val search = "djo@gmail.com ERICK".lowercase().split(" ").toMutableList()
    val lista = mutableListOf(
        "Dwight Joseph djo@gmail.com",
        "Rene Webb webb@gmail.com",
        "Katie Jacobs",
        "Erick Harrington harrington@gmail.com",
        "Myrtle Medina",
        "Erick Burgess"
    )
    val achados = mutableSetOf<String>()
    val strategy = "none"

    // All strategy
    if (strategy == "all") {
        for (x in search) {
            for (i in lista) {
                if (x.toRegex().find(i.lowercase())?.value != null) {
                    achados.add(i)
                }
            }
        }

        for (x in search) {
            for (i in achados) {
                if (x.toRegex().find(i.lowercase())?.value == null) {
                    achados.remove(i)
                }
            }
        }

        for (i in achados) println(i)

    } else if (strategy == "any") {
        for (x in search) {
            for (i in lista) {
                if (x.toRegex().find(i.lowercase())?.value != null) {
                    achados.add(i)
                }
            }
        }

        for (i in achados) println(i)
    } else if (strategy == "none") {
        val teste = mutableSetOf<String>()
        for (x in search) {
            for (i in lista) {
                if (x.toRegex().find(i.lowercase())?.value == null) {
                    teste.add(i)
                } else achados.add(i)
            }
        }

        teste.removeAll(achados)

        for (i in teste) println(i)
    }

}