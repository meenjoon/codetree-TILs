import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var cnt = 0
    repeat(10) {
        val a = sc.nextInt()
        if(a % 2 == 1) {
            cnt++
        }
    }

    print("$cnt")
}