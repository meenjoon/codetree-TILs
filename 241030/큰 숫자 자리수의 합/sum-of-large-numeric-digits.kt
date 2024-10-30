import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b, c) = sc.nextLine().trim().split(" ").map{ it.toInt() }

    val n = a * b * c

    print(recur(n = n))
}

fun recur(n: Int): Int {
    if(n < 10) {
        return n
    }

    return recur(n = n / 10) + n % 10
}