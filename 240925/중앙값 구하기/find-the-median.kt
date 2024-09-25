import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    var max = ""

    if(a > b && a > c) {
        max = "A"
    } else if (b > a && b > c) {
        max = "B"
    } else if (c > a && c > b) {
        max = "C"
    }

    when(max) {
        "A" -> if(b > c) println("$b") else println("$c")
        "B" -> if(a > c) println("$a") else println("$c")
        "C" -> if(a > b) println("$a") else println("$b")
    }
}