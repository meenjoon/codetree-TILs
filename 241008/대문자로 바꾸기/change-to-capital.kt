import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    
    repeat(5) {
        val a = sc.nextLine().trim().split(" ").map{ it.first().uppercaseChar() }.joinToString(separator = " ")

        println("$a")
    }
}