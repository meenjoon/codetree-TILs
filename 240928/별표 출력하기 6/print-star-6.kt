import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val star = "* "
    val empty = "  "

    for(i in n downTo 1) {
        val topStarCnt = (2 * i) - 1
        val topEmptyCnt = n - i
        print("${empty.repeat(topEmptyCnt)}")
        println("${star.repeat(topStarCnt)}")
    }
    
    var bottomEmptyCnt = n -2
    for(i in 3..(2 * n) - 1 step 2) {
        print("${empty.repeat(bottomEmptyCnt)}")
        println("${star.repeat(i)}")
        bottomEmptyCnt--
    }
}