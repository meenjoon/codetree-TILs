import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val a = sc.nextLine().trim().split(" ").map { it.toInt() }
    val b = sc.nextLine().trim().split(" ").map { it.toInt() }

    println("${a.sum().toDouble() / a.count().toDouble() } ${b.sum().toDouble() / b.count().toDouble()}")

    for(i in 0..a.lastIndex) {
        val a = a[i]
        val b = b[i]

        print("${(a.toDouble() + b.toDouble()) / 2.0} ")
    }
    println("")

    print("${(a.sum().toDouble() + b.sum().toDouble()) / (a.count() + b.count()).toDouble()}")
}