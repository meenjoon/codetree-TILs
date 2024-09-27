import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()

    var result = n
    var cnt = 1

    while(result > 1) {
        result = result / cnt
        cnt++
    }

    print("${cnt - 1}")
}