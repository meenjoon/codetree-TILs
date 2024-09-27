import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()
    val b = sc.nextInt()

    var result = 1

    for(i in 1..b) {
        if(i % a == 0) {
            result *= i
        }
    }

    print("$result")
}