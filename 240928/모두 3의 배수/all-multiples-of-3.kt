import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var isMultipleOfThree = true

    for(i in 1..5) {
        val n = sc.nextInt()
        if(n % 3 != 0) {
            isMultipleOfThree = false
            break
        }
    }
    if(isMultipleOfThree) print("1") else print("0")
}