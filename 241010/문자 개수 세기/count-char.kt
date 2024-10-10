import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim()

    val b = sc.next()[0]

    val cnt = a.count{ it == b }

    print("$cnt")
}