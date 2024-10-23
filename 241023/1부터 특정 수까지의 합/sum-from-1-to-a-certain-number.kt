import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print("${addAndDivisor(a = n)}")
}

fun addAndDivisor(
    a: Int,
    divide: Int = 10,
): Int {
    var sum = 0
    for(i in 1..a) {
        sum +=i
    }

    return sum / divide
}