import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val str = "* "

    var cnt = n

    repeat(n) {
        println("${str.repeat(cnt)}")
        cnt--
    }
}