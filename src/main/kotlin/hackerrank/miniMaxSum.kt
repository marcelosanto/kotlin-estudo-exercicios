package hackerrank

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arrd: Array<Int>): Unit {
    // Write your code here

    val arr = mutableListOf<Long>(793810624, 895642170, 685903712, 623789054, 468592370)
    val minAndMax = mutableListOf<Long>()

    val sum1 = arr[1] + arr[2] + arr[3] + arr[4]
    val sum2 = arr[0] + arr[2] + arr[3] + arr[4]
    val sum3 = arr[0] + arr[1] + arr[3] + arr[4]
    val sum4 = arr[0] + arr[1] + arr[2] + arr[4]
    val sum5 = arr[0] + arr[1] + arr[2] + arr[3]

    minAndMax.add(sum1)
    minAndMax.add(sum2)
    minAndMax.add(sum3)
    minAndMax.add(sum4)
    minAndMax.add(sum5)

    println("${minAndMax.minOrNull()} ${minAndMax.maxOrNull()}")

}

fun main(args: Array<String>) {

    val arr =
        intArrayOf(1, 2, 3, 4, 5).toTypedArray()//readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
