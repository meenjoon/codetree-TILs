import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val map = mutableMapOf<Int, Int>()
    repeat(n) {
        val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

        for(i in a..b-1) {
            map[i] = map.getOrDefault(i, 0) + 1
        }
    }

    val formattedMap = map.values.filter { it >= n }

    var rememberValue = Int.MIN_VALUE
    var duplicatedMaxNum = 0
    for((index, entry) in map.entries.withIndex()) {
        if(index == 0) {
            rememberValue = entry.value
            continue
        } else {
            if((rememberValue == entry.value) && (duplicatedMaxNum <= rememberValue)) {
                duplicatedMaxNum = rememberValue
            }
                rememberValue = entry.value
            }
        }

        print(duplicatedMaxNum)

    // print(map.values.maxOrNull())
}