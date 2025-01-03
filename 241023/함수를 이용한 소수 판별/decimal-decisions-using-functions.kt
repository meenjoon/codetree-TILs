import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    var sumNum = 0
    for(i in a..b) {
        if(isPrimeNumber(num = i)) sumNum += i
    }

    print("$sumNum")
}

fun isPrimeNumber(
    num: Int
): Boolean {
    if(num == 1) {
        return false
    }
    if(num == 2) {
        return true
    }

    var isPrimeNumber = true

    for(i in 2..num-1) {
        if(num % i == 0) {
            isPrimeNumber = false
            break
        }
    }

    return if(isPrimeNumber) true else false
}