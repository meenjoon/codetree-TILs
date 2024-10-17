import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val sb = StringBuilder(sc.next())
    val firstChar = sb[0]

    sb.delete(0,1)
    sb.append(firstChar)

    println("${sb.toString()}")

    
}