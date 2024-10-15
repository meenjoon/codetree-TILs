import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val sb = StringBuilder(sc.next())

    sb.delete(1,2)
    sb.delete(sb.length-2, sb.length-1) 

    print("${sb.toString()}")
}