import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var sumNum = 0
    repeat(10) {
        val a = sc.nextInt()
        sumNum += a
    }
    print("$sumNum")
}