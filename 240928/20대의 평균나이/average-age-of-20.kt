import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var sum = 0
    var cnt = 0
    while(true) {
        val a = sc.nextInt()
        if(a / 10 != 2) {
            val avg = sum / cnt.0
            val roundAvg = round(avg * 100) / 100
            val formatAvg = String.format("%.2f", roundAvg)
            print("$formatAvg")
            break
        }
        sum += a
        cnt++
    }
}