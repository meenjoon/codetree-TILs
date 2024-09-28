import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()
    
    var cnt = 0

    while(n != 1) {
        val isEven = n % 2 == 0

        if(isEven) {
            n /= 2
        } else {
            n = 3*n + 1
        }
        cnt ++
    }

    print("$cnt")
}