import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (a,b) = sc.nextLine().trim().split(" ")

    val str = StringBuilder(a.substring(0, 2))
    str.append(b.substring(2, b.length))

    print("${str.toString()}")
}