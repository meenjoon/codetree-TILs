import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()
    val b = sc.nextInt()

    var result = 1

    repeat(b) {
        result *= a
    }

    print("$result")
}