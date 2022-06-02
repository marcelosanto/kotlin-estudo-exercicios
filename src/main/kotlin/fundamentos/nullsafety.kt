package src.main.kotlin.fundamentos

fun main() {

    // ?: elvis operator
    // ? null safety operator
    var list: List<Int?> = listOf(1, 2, null, 3)
    var listaNullable: List<Int?>? = null

    var nome: String? = null
    val sizeN: Int = nome?.length ?: 0

    println(sizeN)
}
