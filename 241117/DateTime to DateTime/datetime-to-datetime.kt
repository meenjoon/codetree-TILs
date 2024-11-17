import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (day, hour, min) = sc.nextLine().trim().split(" ").map{ it.toInt() }

    val first = (11 * 24 * 60) + (11 * 60) + 11
    val second = (day * 24 * 60) + (hour * 60) + min

    if(first > second) {
        print("-1")
    } else {
        print("${second - first}")
    }
}