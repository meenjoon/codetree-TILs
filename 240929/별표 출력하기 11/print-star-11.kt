import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val maxLine = (2 * n) + 1

    for(i in 1..maxLine) {
        for(j in 1..maxLine) {
            // 짝수
            if(i % 2 == 1 || j % 2 == 1) {
                print("* ")
            }
            // 홀수
            else {
                print("  ")
            }
        }
        println("")
    }
}