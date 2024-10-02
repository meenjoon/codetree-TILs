import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    sc.nextLine()
    val a = sc.nextLine().trim().split(" ")

    var sumNum = 0.0

    // forEach 사용
    // a.forEach {
    //     sumNum += it.toDouble()
    // }

    // indices 사용
    for(i in a.indices) {
        sumNum += a[i].toDouble()
    }

    val avgNum = sumNum / n.toDouble()
    val formatAvgNum = round(avgNum * 10) / 10

    println("$formatAvgNum")

    when {
        formatAvgNum >= 4.0 -> print("Perfect")
        formatAvgNum >= 3.0 -> print("Good")
        else -> print("Poor")
    }
}