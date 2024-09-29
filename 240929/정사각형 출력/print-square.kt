import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    var cnt = 0

    for(i in 1..n) {
        for(j in 1..n) {
            cnt++
            print("$cnt ")
        }
        println("")
    }
}