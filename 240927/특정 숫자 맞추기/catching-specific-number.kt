import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    while(true) {
        val n = sc.nextInt()

        if(n < 25) {
            println("Higher")
        } else if(n > 25) {
            println("Lower")
        } else {
            println("Good")
            break
        }
    }
}