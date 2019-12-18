import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    val total = arr.count().toDouble()
    val fractionOfZeros = arr.count { it == 0 } / total
    val fractionOfPositives = arr.count { it > 0 } / total
    val fractionOfNegatives = arr.count {it < 0 } / total
    println("%.4f".format(fractionOfPositives))
    println("%.4f".format(fractionOfNegatives))
    println("%.4f".format(fractionOfZeros))
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
