import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine()
    val b = sc.next()

    var cnt = 0 
    for(i in 0..a.length-2) {
        val str = a[i].toString() + a[i+1].toString()

        if(str == b) {
            cnt++
        }
    }

    print("$cnt")
}