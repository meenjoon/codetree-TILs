import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }
    
    isMinimumCommonMultiple(num1 = a, num2 = b)
}

fun isMinimumCommonMultiple(
    num1: Int,
    num2: Int,
) {
    val minNum = if(num1 > num2) num2 else num1

    var isMaxCommonDivisor = -1
    for(i in minNum downTo 1) {
        if(num1 % i == 0 && num2 % i == 0) {
            isMaxCommonDivisor = i
            break
        }
    }

    val minimumCommonMultiple = isMaxCommonDivisor * (num1 / isMaxCommonDivisor) * (num2 / isMaxCommonDivisor)
    
    print("$minimumCommonMultiple")
}