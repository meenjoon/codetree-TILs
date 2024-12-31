import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var (n, t) = sc.nextLine().trim().split(" ").map { it.toInt() }
    val (r, c, d) = sc.nextLine().trim().split(" ").let {
        Triple(it[0].toInt(), it[1].toInt(), it[2])
    }

    val arrayN = Array(n) { IntArray(n) }
    val dX = intArrayOf(1, 0, -1, 0)
    val dY = intArrayOf(0, -1, 0, 1)

    var x = r - 1 // 행(가로)
    var y = c - 1 // 열(세로)

    var direction = getDirection(dir = d)
    while(t > 0) {
        val tempX = x + dY[direction] // 여기서 x는 배열 기준 x / dY[direction]은 좌표계 기준 Y
        val tempY = y + dX[direction] // 여기서 y는 배열 기준 x / dX[direction]은 좌표계 기준 X

        val isElementInArray = isElementInArray(
            n = n,
            x = tempX,
            y = tempY,
        )
    
        if(!isElementInArray) {
            direction = (direction + 2) % 4

            t--
            continue
        }
        x += dY[direction]
        y += dX[direction]
        t--
    }

    print("${x+1} ${y+1}")
}

fun getDirection(dir: String): Int {
    return if(dir == "U") 3
        else if(dir == "D") 1
        else if(dir == "R") 0
        else 2
}

fun isElementInArray(
    n: Int,
    x: Int,
    y: Int,
): Boolean {
    return (x in 0 until n) && (y in 0 until n)
}