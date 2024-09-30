import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var A = 65
    
    for(i in 1..n) {
        // 공백 출력
        for(j in 2..i) {
            print("  ")
        }

        // 알파벳 출력
        for(j in n - i + 1 downTo 1) {
            val Z = 65 + 25
            if(A > Z) {
                A = 65
            }
            print("${A.toChar()} ")
            A++
        }
        println("")
    }
}