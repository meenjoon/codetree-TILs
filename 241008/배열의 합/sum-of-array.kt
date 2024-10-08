import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    repeat(4) {
        val a = sc.nextLine().trim().split(" ").map{ it.toInt() }

        println("${a.sum()}")
    }
}