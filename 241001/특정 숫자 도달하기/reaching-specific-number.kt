import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ")

    var sumNum = 0
    var avgNum = 0.0
    var cnt = 0

    for(i in a.indices) {
        if(a[i].toInt() >= 250) {
            break
        }

        sumNum += a[i].toInt()
        cnt++
    }

    avgNum = sumNum.toDouble() / cnt.toDouble()
    val formattedAvgNum = round(avgNum * 10) / 10

    print("$sumNum $formattedAvgNum")
}