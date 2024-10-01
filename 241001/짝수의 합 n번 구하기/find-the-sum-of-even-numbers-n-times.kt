import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    repeat(n) {
        val a = sc.nextInt()
        val b = sc.nextInt()

        var sumNum = 0
        for(i in a..b) {
            if(i % 2 ==0) {
                sumNum += i
            }
        }
        println("$sumNum")
    }
}