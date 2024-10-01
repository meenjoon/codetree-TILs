import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val start = sc.nextInt()
    val end = sc.nextInt()

    var resultCnt = 0
    for(i in start..end) {
        
        var divisorCnt = 0
        for(j in 1..i) {
            if(i % j == 0) {
                divisorCnt++
            }
        }
        if(divisorCnt == 3) {
            resultCnt++
        }

        divisorCnt = 0
    }

    print("$resultCnt")
}