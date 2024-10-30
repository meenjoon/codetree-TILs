import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    print(sumNum(n = n))
}

fun sumNum(n: Int): Int {
    if(n < 10) {
        return n * n
    }

    return sumNum(n / 10) + (n % 10).toDouble().pow(2).toInt()
}