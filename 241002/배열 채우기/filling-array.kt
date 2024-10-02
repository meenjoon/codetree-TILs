import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = mutableListOf<Int>()
    for(i in 1..10) {
        val b = sc.nextInt()
        if(b == 0) {
            break
        }
        a.add(b)
    }

    val formattedA = a.asReversed().joinToString(separator = " ")

    print("$formattedA")
}