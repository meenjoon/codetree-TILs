import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    for(i in 1..n) {
        val iStr = i.toString()
        val isContains = iStr.contains("3") || iStr.contains("6") || iStr.contains("9")

        if(i % 3 == 0 || isContains) {
            print("0")
        } else {
            print("$i ")
        }
    }

}