import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    repeat(n) {
        val a = sc.nextInt()

        if(a % 2 == 1 && a % 3 == 0) {
            println("$a")
        }
    }
}