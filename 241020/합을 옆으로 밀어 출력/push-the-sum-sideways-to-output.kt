import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var sumNum = 0
    repeat(n) {
        sumNum += sc.nextInt()
    }

    val sb = StringBuilder(sumNum.toString())
    
    val firstNum = sb[0]
    sb.delete(0, 1)
    sb.append(firstNum)

    print("$sb")
}