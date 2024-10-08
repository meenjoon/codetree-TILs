import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val a = sc.nextLine().trim().split(" ").map { it.toInt() }
    val b = sc.nextLine().trim().split(" ").map { it.toInt() }

    println("${String.format("%.1f",a.sum().toDouble() / a.count().toDouble()) } ${String.format("%.1f", b.sum().toDouble() / b.count().toDouble())}")

    for(i in 0..a.lastIndex) {
        val a = a[i]
        val b = b[i]

        print("${String.format("%.1f", (a.toDouble() + b.toDouble()) / 2.0)} ")
    }
    println("")

    print("${String.format("%.1f", (a.sum().toDouble() + b.sum().toDouble()) / (a.count() + b.count()).toDouble())}")
}