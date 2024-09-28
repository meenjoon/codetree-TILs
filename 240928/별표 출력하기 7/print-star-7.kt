import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for(i in 1..n) {
        for(a in 1..i) {
            print("* ")
        }
        println("")
    }
}