import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var sumNum = 0

    repeat(n) {
        val a = sc.nextInt()
        sumNum += a
    }
    
    var avgStr = ""
    
    avgStr = (sumNum / n).toString() + "."

    var modAvg = sumNum % n
    repeat(2) {
        modAvg *= 10
        avgStr += (modAvg / n).toString()
        modAvg = modAvg % n
    }

    val avg = round(avgStr.toDouble() * 10) / 10

    print("$sumNum $avg")
}