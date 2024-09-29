import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var cnt = 0
    for(i in 1..n) {
        for(j in 1..n) {
            val iOdd = if(i % 2 == 1) true else false
            
            if(iOdd) {
                cnt += 1
                print("$cnt ")
            } else {
                cnt += 2
                print("$cnt ")
            }
        }
        println("")
    }
}