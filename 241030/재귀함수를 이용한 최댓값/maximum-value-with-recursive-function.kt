import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    print(recur(n = a.size-1, max = Int.MIN_VALUE, list = a))
}

fun recur(
    n: Int,
    max: Int,
    list: List<Int>
): Int {
    if(n == 0) {
        return if(list[n] > max) list[n] else max
    }

    return recur(n = n - 1, max = if(list[n] > max) list[n] else max, list = list)
}