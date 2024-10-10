import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ")

    if(a.length == b.length) {
        print("same")
    } else if(a.length > b.length) {
        print("$a ${a.length}")
    } else {
        print("$b ${b.length}")
    }
}