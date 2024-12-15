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

        // arrayA에 특정 속도로 특정 시간만큼 이동 한 것 할당
        if(parenIndex < n) {
            repeat(t) {
                distanceA += v
                arrayA[timeA + it] = distanceA
            }
            timeA += t
        } 
        // arrayB에 특정 속도로 특정 시간만큼 이동 한 것 할당   
        else {
            repeat(t) {
                distanceB += v
                arrayB[timeB + it] = distanceB
            }
            timeB += t
        }
    }

    var rankingStatus = if(arrayA[0] == arrayB[0]) Status.DRAW else if(arrayA[0] > arrayB[0]) Status.WINA else Status.WINB
    var resultCnt = 0
    for(i in 0..arrayA.size-1) {
        val numA = arrayA[i]
        val numB = arrayB[i]

        // 아무 값이 들어있지 않다면(Int.MIN_VALUE) break
        if(numA == Int.MIN_VALUE && numB == Int.MIN_VALUE) {
            break
        }

        // index가 0일 경우 continue
        if(i == 0) {
            resultCnt++
            continue
        }

        // 이전 인덱스의 rankingStatus 상태와 현재 인덱스의 rankingStatus 상태가 다를 경우에 resultCnt++
        val tempRankingStatus = rankingStatus
        rankingStatus = if(numA == numB) Status.DRAW else if(numA > numB) Status.WINA else Status.WINB
        if(tempRankingStatus != rankingStatus) {
            resultCnt++
        }
    }

    print(resultCnt)
}

// 명예의 전당 상태를 위한 enum class
enum class Status() {
    WINA,
    WINB,
    DRAW,
}