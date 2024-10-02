import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map{ it.toInt() }.filter{ it % 2 == 0 }.reversed().joinToString(separator = " ")

    print("$a")
}