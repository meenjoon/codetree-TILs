import java.util.*
import kotlin.math.*

class DummyNum(var num: Int)

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.next()
    val b = reversed(a = a)

    if (a == b) print("Yes") else print("No")
}

fun reversed(a: String): String {
    return a.reversed()
}