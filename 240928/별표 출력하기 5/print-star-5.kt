import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for(i in n downTo 1) {
        for(a in 1..i) {
            print("${"*".repeat(i)} ")
        }
        println("")
    }
}