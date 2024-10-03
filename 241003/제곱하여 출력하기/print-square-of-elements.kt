import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map { it.toDouble().pow(2).toInt() }.joinToString(separator = " ")

    print("$a")

    
}