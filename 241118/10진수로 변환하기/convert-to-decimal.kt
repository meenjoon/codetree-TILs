import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next().reversed()

    var num = 0
    for(i in 0..a.length-1) {
        num += (a[i] - '0') * (2.0).pow(i).toInt()
    }

    print(num)
}