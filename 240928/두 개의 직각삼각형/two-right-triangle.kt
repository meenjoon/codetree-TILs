import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    // 방법 1.
    // var notFirstLineEmptyCnt = 0

    // for(i in n downTo 1) {
    //     if(n != i) {
    //         val notFirstLineStarCnt = i
    //         notFirstLineEmptyCnt += 2

    //         print("${"*".repeat(notFirstLineStarCnt)}")
    //         print("${" ".repeat(notFirstLineEmptyCnt)}")
    //         println("${"*".repeat(notFirstLineStarCnt)}")
    //     } else {
    //         val firstLintCnt = n * 2
    //         println("${"*".repeat(firstLintCnt)}")
    //     }
    // }

    // 방법 2.(규칙 찾음)
    for(i in n downTo 1) {
        val emptyCnt = 2 * (n - i)

        print("${"*".repeat(i)}")
        print("${" ".repeat(emptyCnt)}")
        print("${"*".repeat(i)}")
        println("")
    }
}