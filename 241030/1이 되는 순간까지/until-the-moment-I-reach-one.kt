import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(result(n))
}

fun result(n: Int): Int {
    if(n == 1) {
        return 0
    }

    if(n % 2 == 0) {
        return result(n / 2) + 1
    } else {
        return result(n / 3) + 1
    }    
}