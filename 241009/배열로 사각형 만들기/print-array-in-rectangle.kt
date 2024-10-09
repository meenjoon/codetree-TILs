import java.util.*
import kotlin.math.*

fun main() {

    val array = Array(5) { IntArray(5) { 1 } }

    for(i in 0..4) {
        for(j in 0..4) {
            if(i == 0) {
                break
            } else if(j == 0) {
                continue
            }
            
            array[i][j] = array[i-1][j] + array[i][j-1]
        }
    } 

    array.forEachIndexed { rowIndex, rowValue ->
        array[rowIndex].forEachIndexed { colIndex, colValue ->
            print("$colValue ")
        }
        println("")
    }
}