import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val n = sc.nextInt()

    var sumNum = a + n
    println("$sumNum")

    var flag = Flag.A

    repeat(n - 1) {
        if(flag == Flag.A) {
            sumNum = sumNum + a
        } else {
            sumNum = sumNum + n
        }
        println("$sumNum")

        flag = if(flag == Flag.A) {
            Flag.N
        } else {
            Flag.A
        }
    }
}

enum class Flag {
	A,
    N
}