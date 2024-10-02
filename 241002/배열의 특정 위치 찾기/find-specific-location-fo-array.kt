import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map{ it.toInt() }

    var evenSum = 0
    var thirdList = mutableListOf<Int>()
    a.forEachIndexed { index, value ->
        if(index % 2 == 0) {
            evenSum += a[index + 1]
        }

        if(index > 0 && (index % 3) == 0) {
           thirdList.add(a[index - 1])
        }
    }

    val avgThird = thirdList.sum().toDouble() / thirdList.count().toDouble()
    val formmatedAvgThird = round(avgThird * 10) / 10

    print("$evenSum $formmatedAvgThird")
}