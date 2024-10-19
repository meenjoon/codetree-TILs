import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ")

    val tempAB = (a + b).toInt()
    val tempBA = (b + a).toInt()

    print("${(tempAB + tempBA).toString()}")
}