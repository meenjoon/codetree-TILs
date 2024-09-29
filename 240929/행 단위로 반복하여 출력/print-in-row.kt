import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var str = ""
    
    for(i in 1..n) {
        str += i
    }

    str += "\n"
    
    println("${str.repeat(n)}")
}