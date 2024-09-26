import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()

    if(a > 0) {
        repeat(b) {
            print("$a")
        }
    } else {
        print("0")
    }
}