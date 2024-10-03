import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map{ it.toInt() }

    val array = IntArray(6)

    a.forEach { value ->
        array[value - 1] += 1 
    }

    array.forEachIndexed { index, value ->
        println("${index + 1} - $value")
    }
}