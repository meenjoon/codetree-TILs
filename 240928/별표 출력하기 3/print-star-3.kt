import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextInt()

    val star = "* "
    val empty = "  "
    
    for(i in n downTo 1) {
        val starCnt = (i * 2) - 1
        val emptyCnt = n - i
        if(i != n) {
            print("${empty.repeat(emptyCnt)}")
        }
        println("${star.repeat(starCnt)}")
    }
}