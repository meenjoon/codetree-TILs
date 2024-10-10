import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    sc.nextLine()

    var length = 0
    var cnt = 0
    repeat(n) {
        val a = sc.next()
        length += a.length
        if(a[0] == 'a') cnt++
    }

    


    print("$length $cnt")
}