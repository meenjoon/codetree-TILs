import java.util.*
import kotlin.math.*

enum class Color {
    RED,
    BLUE,
    NONE,
}

fun main() {
    val sc = Scanner(System.`in`)

    val MAX_RANGE = 200
    val OFFSET = 100

    val doubleArray = Array(MAX_RANGE + 1) { Array(MAX_RANGE + 1) { Color.NONE } }

    val n = sc.nextLine().toInt()
    
    repeat(n) { it ->
        val (x1, y1, x2, y2) = sc.nextLine().trim().split(" ").map { it.toInt() + OFFSET }
        
        for(i in x1..x2-1) {
            for(j in y1..y2-1) {
                if(it % 2 == 0) {
                    doubleArray[i][j] = Color.RED
                } else {
                    doubleArray[i][j] = Color.BLUE
                }
            }
        }
    }

    var space = 0
    for(i in 0..MAX_RANGE) {
        for(j in 0..MAX_RANGE) {
            if(doubleArray[i][j] == Color.BLUE) {
                space++
            }
        }
    }

    print(space)
}