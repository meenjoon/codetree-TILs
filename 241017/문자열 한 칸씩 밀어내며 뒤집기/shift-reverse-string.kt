import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()
    val q = sc.nextInt()

    sc.nextLine()

    val sb = StringBuilder(a)

    repeat(q) {
        val n = sc.nextLine().toInt()        
        
        when(n) {
            1 -> {
                val firstChar = sb[0]
                sb.delete(0, 1)
                sb.append(firstChar)
            }
            2 -> {
                val lastChar = sb[a.length-1]
                sb.delete(a.length-1, a.length)
                sb.insert(0, lastChar)
            }
            3 -> {
                sb.reverse()
            }
        }
        println(sb.toString())
    }
}