import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    print("${findNum(a = a, b = b)}")
}

fun findNum(
    a: Int,
    b: Int,
): Int {
    var cnt = 0
    for(i in a..b) {
        if(i % 3 == 0) {
            cnt++
            continue
        }

        val num = i.toString()
        for(i in 0..num.length-1) {
            val digit = num[i].toString().toInt()

            if(digit == 3 || digit == 6 || digit == 9) {
                cnt++
                break
            }
        }
    }

    return cnt
}