package exercicios

fun main() {

    val saldo = readln().toInt()
    val listPurchase = emptyList<Int>().toMutableList()

    while (saldo >= 0) {
        listPurchase += readLine()!!.split(" ").map { it.toInt() }

        if (listPurchase.isNotEmpty() && saldo > 0) {
            var balance = saldo
            var divida = 0
            for (element in listPurchase) {
                if (balance >= element) {
                    balance -= element
                } else {
                    divida = element
                }
            }

            if (divida > balance) {
                print("Error, insufficient funds for the purchase. Your balance is ${balance}, but you need ${divida}.")
                break
            } else {
                print("Thank you for choosing us to manage your account! Your balance is ${balance}.")
                break
            }
        }
    }
}
