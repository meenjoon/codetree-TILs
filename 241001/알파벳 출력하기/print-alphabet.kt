import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var A = 65
    for(i in 1..n) {
        for(j in 1..i) {
            print("${A.toChar()}")
            A++
        }
        println("")
    }
}