import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    var cnt = 0
    for(i in 1..n) {
        // 공백 먼저 출력
        for(j in 2..i) {
            print("  ")
        }

        // 숫자 나중 출력
        for(j in n - i + 1 downTo 1) {
            cnt += 1
            if(cnt > 9) {
                cnt = 1
            }
            print("$cnt ")
        }
        println("")
    }   
}