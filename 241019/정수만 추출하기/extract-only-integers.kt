import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ")

    val tempA = a.takeWhile { it.isDigit() }.toInt()
    val tempB = b.takeWhile { it.isDigit() }.toInt()

    print("${tempA + tempB}")
}