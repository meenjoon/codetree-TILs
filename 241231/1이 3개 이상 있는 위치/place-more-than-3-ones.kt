import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val arrayN = Array(n) { IntArray(n) }

    val arrayX = intArrayOf(1, 0, -1, 0)
    val arrayY = intArrayOf(0, -1, 0, 1)

    var resultCnt = 0

    repeat(n) { it ->
        val list = sc.nextLine().trim().split(" ").map { it.toInt() }
        list.forEachIndexed { index, value ->
            arrayN[it][index] = value
        }
    }

    arrayN.forEachIndexed { i, v ->
        v.forEachIndexed { j, v2 ->
            val x = i
            val y = j

            var cnt = 0
            // 현재 인덱스를 상하좌우의 갯수인 4만큼 반복 시켜 상하좌우의 인덱스 값을 구한다.
            for(r in 0..(3)) {
                val nx = x + arrayX[r]
                val ny = y + arrayY[r]
                
                // 배열을 벗어나는 인덱스 인 지 조건 검사
                val isElementInArray = isElementInArray(
                    n = n,
                    x = nx,
                    y = ny,
                )

                // 배열을 벗어나는 인덱스가 아니면서 해당 값이 1이면 cnt 값을 1 증가 
                if(isElementInArray && arrayN[nx][ny] == 1) {
                    cnt++
                }
            }
            if(cnt >= 3) {
                resultCnt++
            }

            cnt = 0
        }
    }

    println(resultCnt)
}

// 배열을 벗어나는 인덱스 인 지 조건 검사하는 함수
fun isElementInArray(
    n: Int,
    x: Int,
    y: Int,
): Boolean {
    return if(0 <= x && x <= n-1 && 0 <= y && y <= n-1) true else false
}