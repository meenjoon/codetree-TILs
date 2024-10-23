import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()

    print("${findNum(num = a)}")
}

fun findNum(
    num: Int,
): String {
    var digitSum = 0
    num.toString().forEach {
        val digit = it.toString().toInt()
        digitSum += digit
    }

    if(num % 2 == 0 && digitSum % 5 == 0) {
        return "Yes"
    } else {
        return "No"
    }
}