import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    print("${numSquare(a = a, b = b)}")
}

fun numSquare(
    a: Int,
    b: Int,
): Int {
    return a.toDouble().pow(b).toInt()
}