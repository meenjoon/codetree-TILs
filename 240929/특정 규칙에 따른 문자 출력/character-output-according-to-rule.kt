import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val str = "@ "
    val empty = "  "

    var emptyCnt = n - 1
    for(i in 1..n) {
        print("${empty.repeat(emptyCnt)}")
        println("${str.repeat(i)}")
        emptyCnt--
    }

    for(i in (n - 1) downTo 1) {
        println("${str.repeat(i)}")
    }
}