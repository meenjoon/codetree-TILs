import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    var sumNum = 0

    for(i in a..b) {
        sumNum += i
    }

    print("$sumNum")
}