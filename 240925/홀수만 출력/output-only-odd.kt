import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    for(i in a..b) {
        if(i % 2 == 1) {
            print("$i ")
        }
    }
}