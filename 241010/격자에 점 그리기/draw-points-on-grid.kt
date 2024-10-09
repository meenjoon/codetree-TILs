import java.util.*
import kotlin.math.*

fun main() {

    val sc = Scanner(System.`in`)
    
    val (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val array = Array(n) { IntArray(n) }

    var cnt = 1
    repeat(m) {
        val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

        array[a-1][b-1] = cnt
        cnt++
    }

    array.forEachIndexed { rowIndex, rowValue ->
        array[rowIndex].forEachIndexed { colIndex, colValue ->
            print("$colValue ")
        }
        println("")
    }
}