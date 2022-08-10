package src.main.kotlin.fundamentos

fun main() {

    val listOfItems = listOf("Alice", "Marcelo", "Gabriel", "Maquerle")
    val listOfNumbers = listOf(1, 22, 33, 66, 99)
    val finder = Finder(listOfNumbers)

    finder.findItem(66) {
        println("Found: $it")
    }
}

class Finder<T>(private val list: List<T>) {
    fun findItem(element: T, foundItem: (element: T?) -> Unit) {
        val itemFoundList = list.filter { it == element }

        if (itemFoundList.isNullOrEmpty()) foundItem(null)
        else foundItem(itemFoundList.first())
    }
}