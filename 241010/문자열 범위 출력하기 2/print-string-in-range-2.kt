import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine()
    val b = sc.nextInt()

    if(b > a.length) {
        for(i in a.lastIndex downTo 0) {
            print("${a[i]}")
        }
    } else {
        for(i in a.lastIndex downTo a.lastIndex-b+1) {
            print("${a[i]}")
        }
    }
}