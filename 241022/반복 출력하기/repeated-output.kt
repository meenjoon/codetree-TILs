import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()
    
    printStar(cnt = n)
}

fun printStar(cnt: Int) {
    repeat(cnt) {
        println("12345^&*()_")
    }
}