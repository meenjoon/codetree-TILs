import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val list = mutableListOf<String>()
    repeat(n) {
        val str = sc.nextLine()
        list.add(str)
    }

    list.sorted().forEach { str ->
        println(str)    
    }
}