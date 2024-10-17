import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val origin = sc.next()
    
    val sb = StringBuilder(origin)

    println(sb.toString())
    
    val lastChar = sb[sb.length-1]
    sb.delete(sb.length-1, sb.length)
    sb.insert(0, lastChar)
    println(sb.toString())

    while(sb.toString() != origin) {
        val lastChar = sb[sb.length-1]
        sb.delete(sb.length-1, sb.length)
        sb.insert(0, lastChar)
        println(sb.toString())
    }
}