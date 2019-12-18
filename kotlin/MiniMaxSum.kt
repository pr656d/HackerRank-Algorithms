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

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {
    // Sort the array
    arr.sorted().run {
        // Get sum of all elements as Long
        val total = LongArray(this.size) { this[it].toLong() }.sum()
        
        // Min sum will be total - maximun value
    	val min = total - this.last()
        
    	// Max sum will be total - minimum value
    	val max = total - this.first()
        
        // Print result
    	println("$min $max")
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
