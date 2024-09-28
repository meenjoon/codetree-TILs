import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    var isNotMultiple = true

    for(i in a..b) {
        if(i % c == 0) {
            isNotMultiple = false
            break
        }
    }

    if(isNotMultiple) print("YES") else print("NO")
}