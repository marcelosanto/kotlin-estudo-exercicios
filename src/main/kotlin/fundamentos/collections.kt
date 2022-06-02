package fundamentos

fun main() {
    var lista = listOf(1, 2, 3, 4, 5, 6) // listOF -> lista imutavel
    val pares = lista.filter { it % 2 == 0 }
    val impares = lista.filter { it % 2 != 0 }

    // for (item in pares) println(item)

    //  impares.forEach {
    //      println(it)
    // }

    var lista_02 = mutableListOf(1, 2, 3, 4, 5, 6, 98)
    /* println(lista_02)

     lista_02.add(14)
     println(lista_02)

     lista_02.removeAt(0)
     println(lista_02)

     lista_02.remove(98)
     println(lista_02)*/

    var setNumeros = setOf(1, 2, 3, 3, 1) // setOf não recebe valores duplicados
    //println(setNumeros)

    var mapNomeIdade = mutableMapOf("Marcelo" to 30, "alice" to 2)
    // println(mapNomeIdade)

    mapNomeIdade.put("Marquele", 28)
    // println(mapNomeIdade)

    val types: ArrayList<String> = arrayListOf(
        "grass",
        "ice",
        "rock",
        "water",
        "fire",
        "grass",
        "ice",
        "rock",
        "water",
        "fire",
        "grass",
        "ice",
        "rock",
        "water",
        "fire",
        "grass",
        "ice",
        "rock",
        "water",
        "fire"
    )
    val filterTypes: ArrayList<String> = arrayListOf("rock", "fire", "song", "children")

    /*for (typ in types) {
        for (ita in filterTypes) {
            if (ita.contains(typ)) {
                println("$ita = $typ")
            }
        }
    }*/

    val indicesArray: ArrayList<Int> = arrayListOf(80, 100)
    val typesAdd: ArrayList<String> = ArrayList()
    //print(types[2])

    /* for (i in indicesArray[0]..indicesArray[1]) {
         typesAdd.add(types[i])
     }*/

    /*println("TypesAdd: ${typesAdd.size} - Types: ${types.size}")
    print(typesAdd)*/

    println(weaknessPokemon("fire"))
}

fun weaknessPokemon(type: String): List<String> = when (type) {
    "normal" -> listOf("fight")


    "fire" -> listOf("water", "ground", "rock")


    "water" -> listOf("grass", "electric")


    "grass" -> listOf("fire", "ice", "poison", "flying", "bug")


    "electric" -> listOf("ground")


    "ice" -> listOf("fire", "fighting", "rock", "steel")


    "fighting" -> listOf("flying", "psychic", "fairy")


    "poison" -> listOf("ground", "psychic")


    "ground" -> listOf("water", "grass", "ice")


    "flying" -> listOf("electric", "ice", "rock")


    "psychic" -> listOf("bug", "ghost", "dark")


    "bug" -> listOf("flying", "rock", "fire")


    "rock" -> listOf("water", "grass", "fighting", "ground", "steel")


    "ghost" -> listOf("ghost", "dark")


    "dragon" -> listOf("ice", "dragon", "fairy")


    "dark" -> listOf("fighting", "bug", "fairy")


    "steel" -> listOf("fire", "fighting", "ground")


    "fairy" -> listOf("poison", "steel")


    else -> listOf("deu ruim")
}
