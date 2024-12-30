import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val arrayX = intArrayOf(1, 0, -1, 0)
    val arrayY = intArrayOf(0, -1, 0, 1)

    var resultX = 0
    var resultY = 0

    repeat(n) {
        val (allow, distance) = sc.nextLine().trim().split(" ").let {
            Pair(first = it[0], second = it[1].toInt())
        }

        val (calX, calY) = calDistance(
            allow = allow,
            distance = distance,
            arrayX = arrayX,
            arrayY = arrayY,
            resultX = resultX,
            resultY = resultY
        )

        resultX = calX
        resultY = calY
    }

    print("$resultX $resultY")
}

fun calDistance(
    allow: String,
    distance: Int,
    arrayX: IntArray,
    arrayY: IntArray,
    resultX: Int,
    resultY: Int,
    ): Pair<Int, Int> {
    var x = resultX
    var y = resultY

    var dir = 0

    if(allow == "E") {
        dir = 0
    } else if(allow == "S") {
        dir = 1
    } else if(allow == "W") {
        dir = 2
    } else {
        dir = 3
    }
    
    x += arrayX[dir] * distance
    y += arrayY[dir] * distance

    return Pair(first = x, second = y)
}