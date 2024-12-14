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
    // 1초 부터 n초 까지의 거리를 IntArray에 담기
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

    var differentFlag = false // 로봇 a와 b가 서로 다른 위치 있는지 확인 flag
    var resultCnt = 0 // 로봇 A와 B가 바로 직전에는 다른 위치에 있다가 그 다음 번에 같은 위치에 오게 되는 횟수
    for(i in 0..arrayA.size-1) {
        var numA = arrayA[i]
        var numB = arrayB[i]

        // numA 및 numB, 값 모두 Int.MIN_VALUE 라면 모두 움직임 종료이기에 break
        if(numA == Int.MIN_VALUE && numB == Int.MIN_VALUE) {
            break
        }

        // numA만 Int.MIN_VALUE 인 상황에, 로봇 A가 움직임을 종료한 이후 같은 위치에 머물러 있게 하기 위한 로직
        if(i > 1 && numA == Int.MIN_VALUE) {
            arrayA[i] = arrayA[i-1]
            numA = arrayA[i]
        } 
        // numB만 Int.MIN_VALUE 인 상황에, 로봇 B가 움직임을 종료한 이후 같은 위치에 머물러 있게 하기 위한 로직
        else if(i > 1 && numB == Int.MIN_VALUE) {
            arrayB[i] = arrayB[i-1]
            numB = arrayB[i]
        }
        
        // 이전 index에서, 로봇 a와 b가 서로 다른 위치 있으면서
        // 현재 index에서, 로봇 a와 b가 같은 위치에 있으면 resultCnt를 ++ 하고 differentFlag를 false로 변경
        if(differentFlag && (numA == numB)) {
            resultCnt++
            differentFlag = false
            continue
        }

        // 로봇 a와 b가 서로 다른 위치 있으면 differentFlag를 true 할당
        if(numA != numB) {
            differentFlag = true
        }
    }
    
    print(resultCnt)
}