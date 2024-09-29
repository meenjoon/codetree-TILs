import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    for(i in 1..n) {
        val minNum = 11 + 2 * (i - 1)
        val maxNum = minNum + 2 * (n - 1)

        for(j in minNum..maxNum step 2) {
            print("$j ")
        }
        println("")
    }
}