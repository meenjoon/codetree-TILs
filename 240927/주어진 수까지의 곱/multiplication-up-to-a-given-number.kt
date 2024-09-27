import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    var multiplyNum = 1
    for(i in a..b) {
        multiplyNum *= i
    }

    print("$multiplyNum")
}