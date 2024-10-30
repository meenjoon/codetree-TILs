import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(result(n = n, isOdd = (n % 2 == 1)))
}

fun result(n: Int, isOdd: Boolean): Int {
    if(isOdd && n == 1) {
        return 1
    }
    if(!isOdd && n == 2) {
        return 2
    }

    return if(isOdd) {
        result(n = n-1, isOdd = isOdd) + if(n % 2 == 1) n else 0
    } else {
        result(n = n-1, isOdd = isOdd) + if(n % 2 == 0) n else 0
    }
}