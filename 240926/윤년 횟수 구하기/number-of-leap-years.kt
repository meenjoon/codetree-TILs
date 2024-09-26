import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var isYoon = 0
    for(i in 1..n) {
        if((i % 4 == 0) && !(i % 100 == 0 && i % 400 != 0)) {
            isYoon ++   
        }
    }

    print("$isYoon")
}