import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    val array = Array(n) { IntArray(n) }

    for(i in 0..n-1) {
        var num = i + 1
        for(j in 0..n-1) {
            array[i][j] = num
            num += n
        }
    }

    array.forEachIndexed { rowIndex, rowValue ->
        rowValue.forEachIndexed { colIndex, colValue ->
            print("$colValue ")
        }
        println("")
    }
}