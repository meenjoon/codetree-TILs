import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val str = "* "
    val empty = "  "

    val iLineNum = if(n % 2 == 1) n - 1 else n
    
    if(n == 1) {
        print("*")
    } else {
        for(i in 1..iLineNum) {
            for(j in 1..n) {
                val jEven = j % 2 == 0

                if(i == 1 || ((jEven) && (i <= j))) {
                    print("$str")
                } else {
                    print("$empty")
                }
            }
            println("")
        }
    }
 }