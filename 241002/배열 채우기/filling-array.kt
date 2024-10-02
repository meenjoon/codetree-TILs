import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").filter { it.toInt() > 0 }.reversed().joinToString(separator = " ")

    print("$a")
}