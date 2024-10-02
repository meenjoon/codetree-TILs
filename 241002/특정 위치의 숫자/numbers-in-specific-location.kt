import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map{ it.toInt() }

    val sumNum = a[2] + a[4] + a[9]

    print("$sumNum")
}