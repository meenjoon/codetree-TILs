import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, k) = sc.nextLine().trim().split(" ").map { it.toInt() }
    
    val intArray = IntArray(n) { sc.nextInt() }

    print(intArray.sorted()[k-1])
}