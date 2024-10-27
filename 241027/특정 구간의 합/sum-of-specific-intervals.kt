import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }
    val q = sc.nextLine().trim().split(" ").map { it.toInt() }

    repeat(m) {
        val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }
        println("${result(num = Pair(first = a, second = b), list = q)}")
    }
}

fun result(
    num: Pair<Int, Int>,
    list: List<Int>,
): Int {
    var result = 0

    for(i in num.first-1..num.second-1) {
        result += list[i]
    } 
    
    return result
}