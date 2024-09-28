import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    // repeat 사용 방법
    // var cnt = 1
    // repeat(n) {
    //     println("${"*".repeat(cnt)}")
    //     cnt += 2
    // }

    // for 문 사용 방법
    for(i in 1..n) {
        val starNum = (i * 2) - 1 
        for(a in 1..starNum) {
            print("*")  
        }
        println("")
    }
}