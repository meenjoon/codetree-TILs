import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (num, n) = sc.nextLine().trim().split(" ").map { it.toInt() }

    print(toN(num = num, n = n))
}

fun toN(
    num: Int,
    n: Int,
): String {
    var varNum = num
    var result = ""

    while(true) {
        result += varNum % n
        if(varNum < n) {
            break
        }
        varNum = varNum / n
    }

    return result.reversed()
}
