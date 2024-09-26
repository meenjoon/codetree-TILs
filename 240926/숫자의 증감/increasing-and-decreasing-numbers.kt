import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    val c = sc.next()
    val n = sc.nextInt()

    if(c == "A") {
        for(i in 1..n) {
            print("$i ")
        }
    } else if(c == "D") {
        for(i in n downTo 1) {
            print("$i ")
        }
    }
}