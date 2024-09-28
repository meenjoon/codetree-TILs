import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val star = "*"
    val empty = " "

    var topEmptyCnt = n -1
    for(i in 1..(2 * n) -1 step 2) {
        print("${empty.repeat(topEmptyCnt)}")
        println("${star.repeat(i)}")

        topEmptyCnt--
    }

    var bottomEmptyCnt = 1
    for(i in (2 * n) - 3 downTo 1 step 2) {
        print("${empty.repeat(bottomEmptyCnt)}")
        println("${star.repeat(i)}")

        bottomEmptyCnt++
    }
}