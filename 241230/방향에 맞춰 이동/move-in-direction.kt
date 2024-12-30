import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val arrayX = IntArray(4)
    // arrayX[0] = 1
    // arrayX[1] = 0
    // arrayX[2] = -1
    // arrayX[3] = 0

    val arrayY = IntArray(4)
    // arrayY[0] = 0
    // arrayY[1] = -1
    // arrayY[2] = 0
    // arrayY[3] = 1

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

        // println("$calX $calY")

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
    var x = 0
    var y = 0

    if(allow == "E") {
        x = arrayX[0] + distance + resultX
        y = resultY
    } else if(allow == "S") {
        x = resultX
        y = arrayY[1] - distance + resultY
    } else if(allow == "W") {
        x = arrayX[2] - distance + resultX
        y = resultY
    } else {
        x = resultX
        y = arrayY[3] + distance + resultY
    }

    return Pair(first = x, second = y)
}

// 1 0 -1 0
// 0 -1 0 1