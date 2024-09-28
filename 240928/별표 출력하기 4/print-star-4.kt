import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    val str = "* "
    
    for(i in n downTo 1) {
        println("${str.repeat(i)}")
    }

    for(i in 2..n) {
        println("${str.repeat(i)}")
    }
}