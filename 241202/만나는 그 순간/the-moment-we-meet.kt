import java.util.*

fun main() {
    val MAX_T = 1000000 // 최대 시간 상수 정의

    val sc = Scanner(System.`in`)

    val n = sc.nextInt() // A의 움직임 개수 입력
    val m = sc.nextInt() // B의 움직임 개수 입력

    val posA = IntArray(MAX_T + 1) // A의 매 초 위치를 저장하는 배열
    val posB = IntArray(MAX_T + 1) // B의 매 초 위치를 저장하는 배열

    var timeA = 1 // A의 현재 시간 초기화
    repeat(n) { // A의 움직임 데이터를 읽음
        val d = sc.next()[0] // 방향 입력 (L 또는 R)
        val t = sc.nextInt() // 시간 입력

        repeat(t) { // t 초 동안 A의 위치 업데이트
            posA[timeA] = if (d == 'R') posA[timeA - 1] + 1 else posA[timeA - 1] - 1
            timeA++
        }
    }

    var timeB = 1 // B의 현재 시간 초기화
    repeat(m) { // B의 움직임 데이터를 읽음
        val d = sc.next()[0] // 방향 입력 (L 또는 R)
        val t = sc.nextInt() // 시간 입력

        repeat(t) { // t 초 동안 B의 위치 업데이트
            posB[timeB] = if (d == 'R') posB[timeB - 1] + 1 else posB[timeB - 1] - 1
            timeB++
        }
    }

    var ans = -1 // 최초 만남 시간을 저장 (-1로 초기화)
    for (i in 1 until timeA) { // 모든 시간에 대해 A와 B의 위치를 비교
        if (posA[i] == posB[i]) { // A와 B의 위치가 같다면
            ans = i // 만난 시간을 저장
            break
        }
    }

    println(ans) // 결과 출력
}
