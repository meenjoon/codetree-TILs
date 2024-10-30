import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(factorial(n = n))
}

fun factorial(n: Int): Int {
    if(n <= 1) {
        return 1
    }

    return factorial(n-1) * n
}