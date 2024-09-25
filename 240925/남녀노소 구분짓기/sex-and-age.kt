import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    val result = if(b < 19) {
        if(a == 0) {
            "BOY"
        } else {
            "GIRL"
        }
    } else {
        if(a == 0) {
            "MAN"
        } else {
            "WOMAN"
        }
    }

    println("$result")
}