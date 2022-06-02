package hackerrank

/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {
    // Write your code here
    for (i in 1..n) {
        for (j in 1..n - i) {
            print(" ")
        }
        println("#".repeat(i))
    }


}

fun main(args: Array<String>) {
    val n = 4 //readLine()!!.trim().toInt()

    staircase(n)
}
