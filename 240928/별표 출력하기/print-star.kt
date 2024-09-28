import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    val str = "* "
    
    for(i in 1..n) {
        println("${str.repeat(i)}")
    }

    for(i in n-1 downTo 1) {
        println("${str.repeat(i)}")
    }
}