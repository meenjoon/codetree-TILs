import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val result = if((n % 2 == 1 && n % 3 == 0) || (n % 2 == 0 && n % 5 == 0)) true else false 

    println("$result")
}