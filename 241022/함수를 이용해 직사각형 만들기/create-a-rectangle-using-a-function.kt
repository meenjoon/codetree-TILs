import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()
    val m = sc.nextInt()
    
    printStar(row = n, column = m)
}

fun printStar(
    row: Int,
    column: Int,
) {
    repeat(row) {
        println("1".repeat(column))
    }
}