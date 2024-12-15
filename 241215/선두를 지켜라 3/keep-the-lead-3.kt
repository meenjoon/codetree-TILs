import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").map{ it.toInt() }

    val arrayA = IntArray(1000000) { Int.MIN_VALUE }
    val arrayB = IntArray(1000000) { Int.MIN_VALUE }

    var timeA = 0
    var timeB = 0

    var distanceA = 0
    var distanceB = 0

    repeat(n + m) {
        val parenIndex = it

        val (v, t) = sc.nextLine().trim().split(" ").map { it.toInt() }

        if(parenIndex < n) {
            repeat(t) {
                distanceA += v
                arrayA[timeA + it] = distanceA
            }
            timeA += t
        } else {
            repeat(t) {
                distanceB += v
                arrayB[timeB + it] = distanceB
            }
            timeB += t
        }
    }

    var chageFlag = if(arrayA[0] == arrayB[0]) Status.DRAW else if(arrayA[0] > arrayB[0]) Status.WINA else Status.WINB
    var resultCnt = 0
    for(i in 0..arrayA.size-1) {
        val numA = arrayA[i]
        val numB = arrayB[i]

        if(numA == Int.MIN_VALUE && numB == Int.MIN_VALUE) {
            break
        }

        if(i == 0) {
            resultCnt++
            continue
        }

        val tempChangeFlag = chageFlag
        chageFlag = if(numA == numB) Status.DRAW else if(numA > numB) Status.WINA else Status.WINB
        if(tempChangeFlag != chageFlag) {
            resultCnt++
        }
    }

    print(resultCnt)
}

enum class Status() {
    WINA,
    WINB,
    DRAW,
}