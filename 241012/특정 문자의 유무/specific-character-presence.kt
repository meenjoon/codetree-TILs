import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val s = sc.next()

    var first = false
    for(i in 0..s.length-2) {
        val a = s[i].toString()
        val b = s[i+1].toString()
        if(a+b == "ee") {
            first = true
            break
            print("Yes ")
        }
    }

    var second = false
    for(i in 0..s.length-2) {
        val a = s[i].toString()
        val b = s[i+1].toString()
        if(a+b == "ab") {
            second = true
            break
        }
    }

    if(first) print("Yes ") else print("No ")
    if(second) print("Yes") else print("No")
}