import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().filter { it.isDigit() }.toInt()
    val b = sc.nextLine().filter { it.isDigit() }.toInt()

    print("${a + b}")
}