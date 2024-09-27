import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()

    for(i in 1..a) {
        if(i % 2 == 0 || i % 10 == 5 || (i % 3 == 0 && i % 9 != 0)) {
            continue
        } else {
            print("$i ")
        }
    }
}