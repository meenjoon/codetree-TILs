import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    val star = "* "
    val empty = "  "

    for(i in 1..n) {
        val starCnt = (2 * i) - 1
        val emptyCnt = n - i

        print("${empty.repeat(emptyCnt)}")
        println("${star.repeat(starCnt)}")
    }
}