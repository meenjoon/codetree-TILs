import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()

    var isMix = false

    for(i in 2..n-1) {
        if(n % i == 0) {
            isMix = true
            break
        }
    }

    if(isMix) print("C") else print("N")
}