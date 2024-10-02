import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map{ it.toInt() }

    var oddSum = 0
    var evenSum = 0
    a.forEachIndexed { index, value ->
        if(index % 2 == 0) {
            oddSum += value
        } else {
            evenSum += value
        }
    }

    if(oddSum >= evenSum) {
        print("${oddSum - evenSum}")
    } else {
        print("${evenSum - oddSum}")
    }
}