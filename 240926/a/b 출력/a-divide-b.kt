import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    val divideNum = a / b
    print("$divideNum.")

    var modeNum = a % b

    repeat(20) {
         modeNum *= 10
         val decicalNum = modeNum / b
         print("$decicalNum")
         
         modeNum = modeNum % b
    }
}