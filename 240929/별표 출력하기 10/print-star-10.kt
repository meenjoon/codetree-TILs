import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    val star = "* "

    var nextLintStarCnt = 0
    for(i in 1..n) {
        nextLintStarCnt = (n + 1) - i
        println("${star.repeat(i)}")
        println("${star.repeat(nextLintStarCnt)}")
    }
}