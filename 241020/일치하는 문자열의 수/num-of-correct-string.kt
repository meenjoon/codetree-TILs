import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val a = sc.next()

    var cnt = 0
    repeat(n) {
        val b = sc.next()

        if(a == b) {
            cnt++
        }
    }

    print("$cnt")
}