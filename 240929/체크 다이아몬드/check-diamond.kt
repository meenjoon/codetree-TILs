import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val star = "* "
    val empty = " "

    for(i in 1..n) {
        val emptyCnt = n - i
        print("${empty.repeat(emptyCnt)}")
        println("${star.repeat(i)}")
    }

    for(i in n-1 downTo 1) {
        val emptyCnt = n - i
        print("${empty.repeat(emptyCnt)}")
        println("${star.repeat(i)}")
    }
}