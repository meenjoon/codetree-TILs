import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map{ it.toDouble() }

    val sumNum = a.sum()
    val cnt = a.count()

    print("${round((sumNum / cnt) * 10) / 10}")
}