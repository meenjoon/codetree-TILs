import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var cnt = 1
    repeat(n) {
        println("${"*".repeat(cnt)}")
        cnt += 2
    }
}