import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    for(i in 1..n) {
        for(j in 2..i) {
            print("  ")
        }

        for(j in n + 1 - i downTo 1) {
            print("$j ")
        }

        println("")
    }   
}