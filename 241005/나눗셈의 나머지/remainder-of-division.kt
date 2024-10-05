import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.nextInt()
    val b = sc.nextInt()
    
    val array = IntArray(10)

    while(a >= 1) {
        val remain = a % b
        array[remain] += 1

        a = a / b
    }

    var result = 0
    array.forEach { value ->
       result += value.toDouble().pow(2).toInt()
    }

    print("$result")
}