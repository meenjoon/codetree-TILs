import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()

    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    var cnt = 0
    a.forEach { value ->
        if(m == value) {
            cnt++
        }
    }

    println("$cnt")
}