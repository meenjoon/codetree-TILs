import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    a.forEach { num ->
        print("${num.toChar()} ")
    }
}