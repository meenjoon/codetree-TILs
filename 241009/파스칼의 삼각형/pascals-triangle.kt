import java.util.*
import kotlin.math.*

fun main() {

    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    val array = Array(n) { IntArray(n) }

    for(i in 0..n-1) {
        for(j in 0..i) {
            if(i == 0) {
                array[0][0] = 1
                break
            } else if(i == 1) {
                array[1][0] = 1
                array[1][1] = 1
                break
            } else if(j == 0) {
                array[i][0] = 1
                continue
            }
            array[i][j] = array[i-1][j-1] + array[i-1][j]
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