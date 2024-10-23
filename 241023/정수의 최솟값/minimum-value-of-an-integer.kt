import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b, c) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val numList = listOf(a, b, c)
    print("${findMinimumNum(numList)}")
}

fun findMinimumNum(
    numList: List<Int>
): Int {
    val minimumNum = numList.minOrNull()

    return minimumNum ?: -1
}