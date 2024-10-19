import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next().filter { it.isDigit() }.map { it.toString().toInt() }.sum()

    print("$a")
}