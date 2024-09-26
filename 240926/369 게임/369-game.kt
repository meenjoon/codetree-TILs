import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for(i in 1..n) {
        val iStr = i.toString()
        val isContains = iStr.contains("3") || iStr.contains("6") || iStr.contains("9")
        val isConstins2 = (i % 10 == 3) || (i % 10 == 6) || (i % 10 == 9)

        if(i % 3 == 0 || isConstins2) {
            print("0 ")
        } else {
            print("$i ")
        }
    }

}