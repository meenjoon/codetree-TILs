import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val a = sc.next()

    val map = mutableMapOf<Char, Int>()
    differentString(str = a, map = map)

    var isDifferent = false
    // map.entries.forEachIndexed { index, entry ->
    //     if(entry.value >= 2) {
    //         isDiffrent = true
    //     }
    // }
    for ((index, entry) in map.entries.withIndex()) {
        if (entry.value >= 2) {
            isDifferent = true
            break
        }
    }

    if(isDifferent) print("Yes") else print("No")
}

fun differentString(
    str: String,
    map: MutableMap<Char, Int>,
) {
    str.forEachIndexed { index, value ->
        map[value] = map.getOrDefault(value, 0) + 1
    }
}