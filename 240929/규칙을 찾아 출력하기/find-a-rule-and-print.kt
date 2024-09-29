import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val str = "* "
    val empty = "  "

    for(i in 1..n) {
        for(j in 1..n) {
            // empty 부터 채워놓고
            if((i >= 2 && i < n) && (j >= i && j < n) ) {
                print("$empty")
            } 
            // empty가 아닌것은 * 로 채우기
            else {
                print("$str")
            }
        }
        println("")
    }
 }