import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n,k) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val map = mutableMapOf<Int,Int>()

    repeat(k) {
        val (a,b) = sc.nextLine().trim().split(" ").map { it.toInt() }
        for(i in a..b) {
            map[i] = map.getOrDefault(i, 0) + 1
        }
    }

    val maxBlock = map.values.maxOrNull()

    // var maxBlock = Int.MIN_VALUE
    // for((index, entry) in map.entries.withIndex()) {
    //     if(maxBlock <= entry.value) {
    //         maxBlock = entry.value
    //     }
    // }

    print(maxBlock)
}