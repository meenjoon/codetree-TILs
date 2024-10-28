import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    printStar(n = n)
}

fun printStar(n: Int) {
    if(n == 0) {
        return
    }
    
    printStar(n-1)
    
    println("*".repeat(n))
}