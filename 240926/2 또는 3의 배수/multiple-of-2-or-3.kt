import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    for(i in 1..n) {
        if((i % 2 == 0) || (i % 3) == 0) {
            print("1 ")
        } else {
            print("0 ")
        }
    }
}