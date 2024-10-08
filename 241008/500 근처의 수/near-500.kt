import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    val maxList = a.filter { it < 500 }
    val minList = a.filter { it > 500 }

    val maxNum = maxList.maxOrNull()
    val minNum = minList.minOrNull()

    print("$maxNum $minNum")
}