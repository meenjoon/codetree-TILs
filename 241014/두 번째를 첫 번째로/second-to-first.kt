import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()

    val sb = StringBuilder(a)

    val first = sb[0]
    val second = sb[1]

    for(i in 0..sb.length-1) {
        if(sb[i] == second) {
            sb.set(i, first)
        }
    }

    print("${sb.toString()}")

    // print("${a.replace("${a[1]}", "${a[0]}")}")
}