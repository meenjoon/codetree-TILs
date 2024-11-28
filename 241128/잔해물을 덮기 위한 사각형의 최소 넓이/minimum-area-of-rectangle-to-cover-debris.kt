import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val MAX_RANGE = 2000
    val OFFSET = 1000

    val doubleArray = Array(MAX_RANGE + 1) { IntArray(MAX_RANGE + 1) }

    repeat(2) { it ->
        val (x1, y1, x2, y2) = sc.nextLine().trim().split(" ").map { it.toInt() + OFFSET }

        for(i in x1..x2-1) {
            for(j in y1..y2-1) {
                if(it == 0) {
                    doubleArray[i][j] = 1
                } else {
                    doubleArray[i][j] = 0
                }
            }
        }       
    }

    var minX = Int.MAX_VALUE
    var maxX = Int.MIN_VALUE
    var minY = Int.MAX_VALUE
    var maxY = Int.MIN_VALUE

    var space = 0
    for(i in 0..MAX_RANGE) {
        for(j in 0..MAX_RANGE) {
            if(doubleArray[i][j] == 1) {
                space++
                if(minX >= i) {
                    minX = i
                }
                if(maxX <= i) {
                    maxX = i
                }
                if(minY >= j) {
                    minY = j
                }
                if(maxY <= j) {
                    maxY = j
                }
            }
        }
    }

    val width = maxX + 1 - minX
    val height = maxY + 1 - minY
    val dimention = width * height

    if(space == 0) {
        print(0)
    } else {
        print(dimention)
    }
}