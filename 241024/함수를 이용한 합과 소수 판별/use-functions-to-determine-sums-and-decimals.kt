import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    var cnt = 0
    for(i in a..b) {
        if(isPrimeNumber(num = i) && isDigitSumOfEven(num = i)) {
            cnt++
        }
    }

    print("$cnt")
}

fun isPrimeNumber(
    num: Int,
): Boolean {
    if(num == 1) {
        return false
    }

    for(i in 2..num - 1){
        if(num % i == 0) {
            return false
            break
        }
    }

    return true
}

fun isDigitSumOfEven(
    num: Int,
): Boolean {
    val numStr = num.toString()
    
    var sumNum = 0
    for(i in 0..numStr.length - 1) {
        val digit = numStr[i].toString().toInt()
        sumNum += digit
    }

    if(sumNum % 2 == 0) return true else return false

    // return "$num".map { it.toString().toInt() }.sum() % 2 == 0
}