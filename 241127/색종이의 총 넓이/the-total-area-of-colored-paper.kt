import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val OFFSET = 100
    val MAX_RANGE = 200

    var space = 0
    val doubleArray = Array(MAX_RANGE + 1) { IntArray(MAX_RANGE + 1) }

    val n = sc.nextLine().toInt()
    repeat(n) {
        val (x, y) = sc.nextLine().trim().split(" ").map{ it.toInt() + OFFSET }
        
        for(i in x..x + (8-1)) {
            for(j in y..y + (8-1)) {
                doubleArray[i][j] = 1
            }
        }
    }

    for(i in 0..MAX_RANGE) {
        for(j in 0..MAX_RANGE) {
            if(doubleArray[i][j] == 1) {
                space++
            }
        }
    }

    print(space)
}