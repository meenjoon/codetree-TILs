import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(recurs(n = n))
}

fun recurs(n: Int): Int {
    if(n <= 1) {
        return 1
    }
    if(n == 2) {
        return 2
    }

    return recurs(n / 3) + recurs(n - 1)
}