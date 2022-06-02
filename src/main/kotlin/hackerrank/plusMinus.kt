package hackerrank

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var negative = 0.0
    var positive = 0.0
    var zero = 0.0
    val size = arr.size.toDouble()

    for (i in arr) {
        if (i < 0) negative++
        else if (i == 0) zero++
        else positive++
    }

    val resultPos = positive / size
    val resultNeg = negative / size
    val resultZero = zero / size

    println("%.6f".format(resultPos))
    println("%.6f".format(resultNeg))
    println("%.6f".format(resultZero))
}

fun main(args: Array<String>) {
    //val n = readLine()!!.trim().toInt()

    //val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    //

    val array = intArrayOf(-4, 3, -9, 0, 4, 1)


    plusMinus(array.toTypedArray())
}
