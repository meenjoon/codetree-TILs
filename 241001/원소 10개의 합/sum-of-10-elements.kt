import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    // var sumNum = 0
    // repeat(10) {
    //     val a = sc.nextInt()
    //     sumNum += a
    // }
    // print("$sumNum")

    val numbers = IntArray(10)
    var sumNum = 0
    
    for(i in numbers.indices) {
        val a = sc.nextInt()
        numbers[i] = a
    }

    sumNum = numbers.sum()

    print("$sumNum")
}