import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(recurs(n = n, isEven = (n % 2 == 0)))
}

fun recurs(n: Int, isEven: Boolean): Int {
    if(n == 1) {
        return 0
    } 

    if(isEven) {
        val result = n / 2
        return recurs(n = result, isEven = (result % 2 == 0)) + 1
    } else {
        val result = 3 * n + 1
        return recurs(n = result, isEven = (result % 2 == 0)) + 1
    }
}