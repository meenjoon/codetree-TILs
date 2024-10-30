import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(fiboncci(n = n))
}

fun fiboncci(n: Int): Int {
    if(n < 1) {
        return 0
    }
    if(n == 1) {
        return 1
    }

    return fiboncci(n-1) + fiboncci(n -2)
}