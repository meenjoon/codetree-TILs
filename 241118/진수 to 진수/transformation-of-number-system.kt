import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a,b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val n = sc.next()

    val digit = toDigit(str = n, numberic = a)
    val bNumberic = toNumberic(digit = digit, numberic = b)

    print(bNumberic)
}

fun toDigit(
    str: String,
    numberic: Int,
): Int {
    val reversedStr = str.reversed()

    var num = 0
    for(i in 0..reversedStr.length-1) {
        num += (reversedStr[i] - '0') * numberic.toDouble().pow(i).toInt()
    }

    return num
}

fun toNumberic(
    digit: Int,
    numberic: Int,
): String {
    var varDigit = digit
    var result = ""

    while(true) {
        result += varDigit % numberic

        if(varDigit < numberic) {
            break
        }
        
        varDigit /= numberic
    }

    return result.reversed()
}