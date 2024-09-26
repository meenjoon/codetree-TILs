import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val n = sc.nextInt()

    var sumNum = a + n
    println("$sumNum")

    repeat(n - 1) {
        sumNum += n
         println("$sumNum")
    }
}