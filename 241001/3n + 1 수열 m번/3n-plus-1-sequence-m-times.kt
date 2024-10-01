import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val m = sc.nextInt()

    repeat(m) {
        var n = sc.nextInt()

        var cnt = 0
        while(n != 1) {
            if(n % 2 ==0) {
                n /= 2
            } else {
                n = (3 * n) + 1
            }
            cnt++
        }
        println("$cnt")
    }
}