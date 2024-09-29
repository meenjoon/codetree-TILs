import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var cnt = 10
    
    for(i in 1..n) {
        for(j in 1..n) {
            cnt--
            
            if(cnt < 1) {
                cnt = 9
            }

            print("$cnt")
        }
        println("")
    }
}