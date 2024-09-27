import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    while(true) {
        val n = sc.nextInt()
        when(n) {
            1 -> println("John")
            2 -> println("Tom")
            3 -> println("Paul")
            4 -> println("Sam")
            else -> {
                println("Vacancy")
                break
            }
        }
    }
}