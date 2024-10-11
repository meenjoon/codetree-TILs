import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine()
    val b = sc.nextLine()

    val ab = a + b
    val ba = b + a
    if(ab == ba) {
        print("true")
    } else {
        print("false")
    }
}