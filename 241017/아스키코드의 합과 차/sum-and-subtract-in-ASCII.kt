import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ")

    val sum = a[0].code + b[0].code
    val diff = abs(a[0].code - b[0].code)

    print("$sum $diff")
}