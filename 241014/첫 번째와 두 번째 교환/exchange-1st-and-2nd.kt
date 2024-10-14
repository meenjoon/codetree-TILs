import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()

    val sb = StringBuilder(a)

    val first = sb[0]
    val second = sb[1]

    for(i in 0..sb.length-1) {
        val value = sb[i]

        if(value == first) {
            sb.set(i, second)
        } else if(value == second) {
            sb.set(i, first)
        }
    }

    print("${sb.toString()}")
}