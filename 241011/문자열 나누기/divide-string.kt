import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    var cnt = 1
    a.forEach {
        val str = it.toString()
        str.forEach { char ->
            if(cnt == 5) {
                println("$char")
                cnt = 0
            } else {
                print("$char")
            }
            cnt++
        }
    }
}