import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()

    for(i in 1..a) {
        if((i % 2 == 0 && i % 4 != 0) || (i / 8) % 2 == 0 || (i % 7) < 4) {
            continue
        } else {
            print("$i ")
        }
    }
}