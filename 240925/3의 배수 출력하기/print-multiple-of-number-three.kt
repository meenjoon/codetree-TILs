import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var num = 1

    while(num <= n) {
        if(num % 3 == 0) {
            print("$num ")
        }
    }
}