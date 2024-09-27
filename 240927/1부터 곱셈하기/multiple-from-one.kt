import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var n = sc.nextInt()

    var multiplyNum = 1
    for(i in 1..10) {
        multiplyNum *= i

        if(multiplyNum >= n) {
            print("$i")
            break
        }
    }

}