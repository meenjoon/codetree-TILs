import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()
    val b = sc.next()

    val sb = StringBuilder(a)

    if(a == b) {
        print("1")
    } else {
        var cnt = 0
        while(cnt <= a.length-1) {
            cnt++

            val lastChar = sb[sb.length-1]
            sb.delete(sb.length-1, sb.length)
            sb.insert(0, lastChar)

            if(sb.toString() == b) {
                break
            }
        }
        
        if(cnt >= a.length) {
            print("-1")
        } else {
            print("$cnt")
        }
    }
}