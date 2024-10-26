import java.util.*
import kotlin.math.*

class DummyNum(var num: Int)

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.next()

    // val b = reversed(a = a)
    // if (a == b) print("Yes") else print("No")

    if(reversed(a = a)) print("Yes") else print("No")
}

// fun reversed(a: String): String {
//     return a.reversed()
// }


fun reversed(a: String): Boolean {
    for(i in 0..(a.length-1) / 2) {
        if(a[i] != a[(a.length-1) - i]) return false
    }

    return true
}