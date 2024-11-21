import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val map = mutableMapOf<Int, Int>()
    repeat(n) {
        val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

        for(i in a..b) {
            map[i] = map.getOrDefault(i, 0) + 1
        }
    }

    val duplicatedMaxNum = map.values.maxOrNull()

    print(duplicatedMaxNum)
}