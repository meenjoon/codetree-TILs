import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var sumNum = 0

    for(i in 1..n) {
        if(i != n && n % i == 0) {
            sumNum++
        }
    }
    
    if(n == sumNum) {
        print("P")
    } else {
        print("N")
    }

    
}