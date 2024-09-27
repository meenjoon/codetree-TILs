import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()

    var sum = 0
    for(i in 1..100) {
        sum += i
        if(sum >= n) {
            print("$i")
            break
        }
    }
}