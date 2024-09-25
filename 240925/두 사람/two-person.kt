import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.next()
    val c = sc.nextInt()
    val d = sc.next()

    val result = if((a >= 19 && b == "M") || (c >= 19 && d == "M")) 1 else 0
    
    println("$result")
}