import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var sum = 0
    for(i in n..100) {
        sum += i
    }

    print("$sum")
}