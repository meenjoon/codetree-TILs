import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    // 우 -> 하 -> 좌 -> 상 순서
    val dx = intArrayOf(1, 0, -1, 0) 
    val dy = intArrayOf(0, -1, 0, 1)

    var x = 1000
    var y = 1000

    var result = -1 // 시작점일 때의 시간
    var t = 1 // 시간 
    var isSatisfied = false // 만족한다면 멈춰 for문을 더 돌지 않게 함

    for(i in 0..n-1) {
        // 스타트 지점을 이전에 거쳤다면 종료
        if(isSatisfied) {
            break
        }

        val (dir, dis) = sc.nextLine().trim().split(" ").let {
            Pair(first = it[0], second = it[1].toInt())
        }

        for(currTime in t..t+dis-1) {
            val directionNumber = getDirectionNumber(direction = dir)
            x += dx[directionNumber]
            y += dy[directionNumber]

            // 스타트 지점 이라면 반복문을 멈추고 result 값을 할당
            if(x == 1000 && y == 1000) {
                result = currTime
                isSatisfied = true
                break
            }
        }
        // distance 만큼 시간 갱신
        t += dis
    }

    print(result)
}

fun getDirectionNumber(
    direction: String
): Int {
    return when(direction) {
        "N" -> 0 // 위 방향
        "W" -> 1 // 왼쪽 방향
        "S" -> 2 // 아래 방향
        else -> 3 // 오른쪽 방향

    }
}