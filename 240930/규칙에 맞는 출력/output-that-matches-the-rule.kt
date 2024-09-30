import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    for(i in n downTo 1) {
        for(j in i..n) {
            print("$j ")
        }
        println("")
    }
}