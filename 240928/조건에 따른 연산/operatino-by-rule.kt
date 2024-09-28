import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()

    var cnt = 0

    while(n < 1000) {
        val isEven = n % 2 == 0

        if(isEven) {
            n = 3 * n + 1
        } else {
            n = 2 * n + 2
        }
        cnt++
    }

    print("$cnt")
}