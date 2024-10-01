import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    repeat(n) {
        val a = sc.nextInt()
        val b = sc.nextInt()

        var num = 1
        for(i in a..b) {
            num *= i
        }
        println("$num")
    }
}