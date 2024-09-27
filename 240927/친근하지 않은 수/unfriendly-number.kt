import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()

    var num = 1
    var cnt = 0

    while(num <= a) {
        if(num % 2 == 0 || num % 3 == 0 || num % 5 ==0) {
            num++
            continue
        }
        cnt++
        num++
    }
    print("$cnt")
}