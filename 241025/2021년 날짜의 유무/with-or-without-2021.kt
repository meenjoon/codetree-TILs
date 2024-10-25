import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    if(validDay(month = a, day = b)) print("Yes") else print("No")
}

fun validDay(
    month: Int,
    day: Int,
): Boolean {
    val map = mutableMapOf<Int, Int>()
    map[1] = 31
    map[2] = 28
    map[3] = 31
    map[4] = 30
    map[5] = 31
    map[6] = 30
    map[7] = 31
    map[8] = 31
    map[9] = 30
    map[10] = 31
    map[11] = 30
    map[12] = 31

    val monthOfMaxDay = map.getOrDefault(month, -1)
    
    if(day > monthOfMaxDay) return false else return true
}