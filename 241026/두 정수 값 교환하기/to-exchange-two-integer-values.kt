import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val(newA, newB) = swap(a = a, b = b)
    print("$newA $newB")
}

fun swap(
    a: Int,
    b: Int,
): Pair<Int, Int> {
    val temp = a
    
    val newA = b
    val newB = temp

    return Pair(newA, newB)
}