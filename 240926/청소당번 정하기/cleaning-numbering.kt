import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var cleanA = 0
    var cleanB = 0
    var cleanC = 0

    for (i in 1..n) {
        when {
            i % 12 == 0 -> cleanC++
            i % 3 == 0 -> cleanB++
            i % 2 == 0 -> cleanA++
        }
    }

    print("$cleanA $cleanB $cleanC")
}