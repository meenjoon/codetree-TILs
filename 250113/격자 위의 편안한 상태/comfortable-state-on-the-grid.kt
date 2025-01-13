import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, -1, 0, 1)
    // 이번엔 x를 i, y를 j 로 놓고 품
    // 0 아래쪽 방향 
    // 1 왼쪽 방향
    // 2 위쪽 방향
    // 3 오른쪽 방향

    val array = Array(n+1) { IntArray(n+1) }

    repeat(m) {
        val (r, c) = sc.nextLine().trim().split(" ").map { it.toInt()-1 }

        array[r][c] = 1

        var colorCnt = 0
        
        for(i in 0..3) {
            val x = r + dx[i]
            val y = c + dy[i]

            val isElementInArray = isElementInArray(x = x, y = y, n = n)
            
            if(isElementInArray && array[x][y] == 1) {
                colorCnt++
            }
        }

        if(colorCnt == 3) {
            println(1)
        } else {
            println(0)
        }
    }
}

fun isElementInArray(
    x: Int,
    y: Int,
    n: Int,
): Boolean {
    return (x in 0..n-1) && (y in 0..n-1)
}