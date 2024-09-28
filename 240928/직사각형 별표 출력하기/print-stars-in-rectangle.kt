import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val h = sc.nextInt()
    val w = sc.nextInt()

    val str = "* ".repeat(w)

    repeat(h) {
        println(str)
    }
}