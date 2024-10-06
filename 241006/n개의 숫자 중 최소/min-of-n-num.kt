import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    val minNum = a.minOrNull()

    val minCnt = a.count { it == minNum }

    print("$minNum $minCnt") 
}