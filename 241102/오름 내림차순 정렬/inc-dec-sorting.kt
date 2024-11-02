import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()
    val a = sc.nextLine().trim().split(" ").map { it.toInt() }.toIntArray()

    // a.sort()
    // println(a.joinToString(separator = " "))

    // a.reverse()
    // println(a.joinToString(separator = " "))

    println(a.sorted().joinToString(separator = " "))
    println(a.sortedDescending().joinToString(separator = " "))
}