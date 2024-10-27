import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }
    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    print("${result(m = m, a = a)}")
}

fun result(
    m: Int,
    a: List<Int>,
): Int {
    var num = m 
    var result = 0

    result += a[num - 1]
    while(num != 1) {
        if(num % 2 == 0) {
            num /= 2
        } else {
            num - 1
        }
        result += a[num - 1]
    }
    
    return result
}