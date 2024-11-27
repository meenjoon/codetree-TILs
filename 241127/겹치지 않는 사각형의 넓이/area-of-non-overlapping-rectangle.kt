import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val MAX_RANGE = 2000
    val OFFSET = 1000

    var space = 0
    val doubleArray = Array(MAX_RANGE + 1){ IntArray(MAX_RANGE + 1) }

    repeat(3) { it ->
        val (x1, y1, x2, y2) = sc.nextLine().trim().split(" ").map { it.toInt() + OFFSET }
    
        for(i in x1..x2-1) {
            for(j in y1..y2-1) {
                if(it == 2) {
                    doubleArray[i][j] = 0
                } else {
                    doubleArray[i][j] = 1
                }
                
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