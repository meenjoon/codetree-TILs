import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val OFFSET = 100
    val MAX_RANGE = 200

    val doubleArray = Array(MAX_RANGE+1) { IntArray(MAX_RANGE + 1) }
    var space = 0

    val n = sc.nextLine().toInt()

    repeat(n) {
        val (x1, y1, x2, y2) = sc.nextLine().trim().split(" ").map { it.toInt() + 100 }
        
        for(i in x1..x2-1) {
            for(j in y1..y2-1) {
                doubleArray[i][j]++
            }
        }
    }
    
    for(i in 0..MAX_RANGE) {
        for(j in 0..MAX_RANGE) {
            if(doubleArray[i][j] > 0) {
                space++
            }
        }
    }

    print(space)
}
