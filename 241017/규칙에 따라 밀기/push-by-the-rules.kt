import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine()
    val b = sc.nextLine()

    val sb = StringBuilder(a)

    repeat(b.length) { index ->
        if(b[index] == 'L') { 
            val firstChar = sb[0]
            sb.delete(0, 1)
            sb.append(firstChar)
        } else {
            val lastChar = sb[a.length - 1]
            sb.delete(a.length - 1, a.length)
            sb.insert(0, lastChar)
        }
    }

    println(sb.toString())
}