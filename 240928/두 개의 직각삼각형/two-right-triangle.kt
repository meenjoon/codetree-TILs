import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    var notFirstLineEmptyCnt = 0

    for(i in n downTo 1) {
        if(n != i) {
            val notFirstLineStarCnt = i
            notFirstLineEmptyCnt += 2

            print("${"*".repeat(notFirstLineStarCnt)}")
            print("${" ".repeat(notFirstLineEmptyCnt)}")
            println("${"*".repeat(notFirstLineStarCnt)}")
        } else {
            val firstLintCnt = n * 2
            println("${"*".repeat(firstLintCnt)}")
        }
    }
}