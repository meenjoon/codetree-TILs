import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val doubleArray = Array(n) { IntArray(m) }
    doubleArray[0][0] = 1 // 첫 시작은 옮기지 않으므로 1로 할당해줌

    val dx = intArrayOf(1, 0 , -1, 0) // i(행)
    val dy = intArrayOf(0, -1, 0, 1) // j(열)

    var x = 0 // 배열 기준 i(x) 
    var y = 0 // 배열 기준 j(y)

    var direction = 3 // 첫 시작은, 오른쪽으로 이동해야 하기에 0 할당 

    for(i in 2..(n*m)) {
        val tempX = x + dx[direction] // 디렉션을 통해 움직인 x 좌표(i)
        val tempY = y + dy[direction] // 디렉션을 통해 움직인 y 좌표(j)

        val isElementInArray = isElementInArray(
            x = tempX,
            y = tempY,
            n = n,
            m = m,
        )

        if(!isElementInArray || doubleArray[tempX][tempY] != 0) {
            direction = (direction + 1) % 4
        }
        
        x += dx[direction]
        y += dy[direction]

        doubleArray[x][y] = i
    }

    doubleArray.forEachIndexed { i, array ->
        array.forEachIndexed { j, value ->
            print("$value ")        
        }
        println()
    }
}

fun isElementInArray(
    x: Int, // 배열 기준 x(i)
    y: Int, // 배열 기준 y(j)
    n: Int, // 행(배열 기준 x(i))
    m: Int, // 열(배열 기준 y(j))
): Boolean {
    return (x >= 0) && (x in 0 until n) && (y >= 0) && (y in 0 until m)
}