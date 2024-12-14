import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val arrayA = IntArray(1000000) { Int.MIN_VALUE }
    val arrayB = IntArray(1000000) { Int.MIN_VALUE }

    var timeA = 0
    var timeB = 0

    var distanceA = 0
    var distanceB = 0
    repeat(n+m) { it ->
        val parentIndex = it

        val (t, d) = sc.nextLine().trim().split(" ").let {
            Pair(first = it[0].toInt(), second = it[1])
        }
        if(parentIndex < n) {
            repeat(t) {
                if(d == "R") {
                    distanceA++
                    arrayA[timeA+it] = distanceA
                } else {
                    distanceA--
                    arrayA[timeA+it] = distanceA
                }
            }
            timeA += t
        } else {
            repeat(t) {
                if(d == "R") {
                    distanceB++
                    arrayB[timeB+it] = distanceB
                } else {
                    distanceB--
                    arrayB[timeB+it] = distanceB
                }
            }
            timeB += t
        }
    }


    var differentFlag = false
    var resultCnt = 0

    var endAFlag = false
    var endBFlag = false
    for(i in 0..arrayA.size-1) {
        var numA = arrayA[i]
        var numB = arrayB[i]
        if(numA == Int.MIN_VALUE && numB == Int.MIN_VALUE) {
            break
        }

        if(i > 1 && numA == Int.MIN_VALUE) {
            arrayA[i] = arrayA[i-1]
            numA = arrayA[i]
        } else if(i > 1 && numB == Int.MIN_VALUE) {
            arrayB[i] = arrayB[i-1]
            numB = arrayB[i]
        }
        
        if(differentFlag && (numA == numB)) {
            resultCnt++
            differentFlag = false
            continue
        }

        if(numA != numB) {
            differentFlag = true
        }
    }
    
    print(resultCnt)
}