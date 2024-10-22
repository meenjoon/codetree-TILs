import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()
    
    printNum(num = n)
}

fun printNum(
    num: Int,
) {
    var cnt = 1
    repeat(num) {
        for(i in 0..num-1) {
            if(cnt == 10) {
                cnt = 1
            }

            print("$cnt ")
            cnt++
        }
        println("")
    }
}