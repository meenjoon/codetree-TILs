import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for(i in 1..n) {
        for(j in 1..n) {
            val oneNum = i
            val twoNum = n + 1 - i
            
            val jOdd = if(j % 2 == 1) true else false

            if(jOdd) {
                print("$oneNum")
            } else {
                print("$twoNum")
            }
        }
        println("")
    }
}