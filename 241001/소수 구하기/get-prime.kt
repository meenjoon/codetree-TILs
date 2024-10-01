import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    
    for(i in 2..n) {
        
        var divisorCnt = 0
        for(j in 1..i) {
            if(i % j == 0) {
                divisorCnt++
            }
        }
        if(divisorCnt == 2) {
            print("$i ")
        }
        divisorCnt = 0
    }
}