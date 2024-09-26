import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var cnt3 = 0
    var cnt5 = 0
    repeat(10) {
        val a = sc.nextInt()
        if(a % 3 == 0) {
            cnt3++
        }
        if(a % 5 == 0) {
            cnt5++
        }
    }

    print("$cnt3 $cnt5")
}