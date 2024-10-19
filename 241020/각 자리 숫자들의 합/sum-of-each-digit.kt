import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.next()

    var sumNum = 0
    for(i in n.indices) {
        sumNum += n[i].toString().toInt()
    }

    print("$sumNum")
}