import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().trim().split(" ").map { it.toInt() }

    val list = n.takeWhile { it != 0 }.map { value ->
        if (value % 2 == 1) {
            value + 3 
        } else {
            value / 2
        }
    }

    println(list.joinToString(separator = " "))
}