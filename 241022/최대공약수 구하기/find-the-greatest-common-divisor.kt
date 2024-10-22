import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }
    
    isMaxCommonDivisor(num1 = a, num2 = b)
}

fun isMaxCommonDivisor(
    num1: Int,
    num2: Int,
) {
    val num1CommnDivisorList = mutableListOf<Int>()
    val num2CommnDivisorList = mutableListOf<Int>()

    for(i in 1..num1) {
        if(num1 % i == 0) {
            num1CommnDivisorList.add(i)
        }
    }

    for(i in 1..num2) {
        if(num2 % i == 0) {
            num2CommnDivisorList.add(i)
        }
    }

    val commonDivisors = num1CommnDivisorList.intersect(num2CommnDivisorList)
    val maxCommonDivisors = commonDivisors.maxOrNull()

    print("$maxCommonDivisors")
}