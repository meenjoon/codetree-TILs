import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()

    val array = Array(n) { Array(m) { 0 } }

    var cnt = 1
    for(i in 0..n-1) {
        for(j in 0..m-1) {
            array[i][j] = cnt
            cnt++
        }
    }

    array.forEachIndexed { rowIndex, row ->
        row.forEachIndexed { colIndex, value ->
            print("$value ")
        }
        println()
    }
}