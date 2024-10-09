import java.util.*
import kotlin.math.*

fun main() {

    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    val array = Array(n) { IntArray(n) { 1 } }

    for(i in 0..n-1) {
        for(j in 0..n-1) {
            if(i == 0) {
                break
            } else if(j == 0) {
                continue
            }

            array[i][j] = array[i-1][j-1] + array[i-1][j] + array[i][j-1]
        }
    }

    array.forEachIndexed { rowIndex, rowValue ->
        array[rowIndex].forEachIndexed { colIndex, colValue ->
            if(colValue != 0) {
                print("$colValue ")
            }
        }
        println("")
    }
}