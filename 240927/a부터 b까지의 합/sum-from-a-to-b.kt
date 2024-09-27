import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    var sum = 0
    for(i in a..b) {
        sum +=i
    }

    print("$sum")
}