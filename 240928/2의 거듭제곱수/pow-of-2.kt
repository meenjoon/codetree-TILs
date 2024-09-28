import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    var changeNum = 1
    var cnt = 0

    while(n != changeNum) {
        changeNum *= 2
        cnt++
    }

    print("$cnt")
}