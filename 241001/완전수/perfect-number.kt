import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val start = sc.nextInt()
    val end = sc.nextInt()

    var cnt = 0
    for(i in start..end) {
        var sumNum = 0

        for(j in 1..i) {
            if(i % j == 0 && j != i) {
                sumNum += j
            }
        }
        
        if(sumNum == i) {
            cnt++
        }
    }

    print("$cnt")
}