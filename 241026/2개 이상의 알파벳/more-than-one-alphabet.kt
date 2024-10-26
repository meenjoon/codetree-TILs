import java.util.*
import kotlin.math.*
fun main() {
    val sc = Scanner(System.`in`)
    
    val a = sc.next()
    val map = mutableMapOf<Char, Int>()
    differentString(str = a, map = map)

    var cnt = 0
    // map.entries.forEachIndexed { index, entry ->
    //     cnt++
    // }
    for ((index, entry) in map.entries.withIndex()) {
        cnt++
    }
    
    if(cnt >= 2) print("Yes") else print("No")
}
fun differentString(
    str: String,
    map: MutableMap<Char, Int>,
) {
    str.forEachIndexed { index, value ->
        map[value] = map.getOrDefault(value, 0) + 1
    }
}