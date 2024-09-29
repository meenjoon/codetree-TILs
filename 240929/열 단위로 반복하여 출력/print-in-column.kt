import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    for(i in 1..n) {
        // repeat 사용 
        println("${i.toString().repeat(n)}")

        // 반복문 사용
        // for(j in 1..n) {
        //     print("$i")
        // }
        // println("")
    }
}