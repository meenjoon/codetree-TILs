import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map{ it.toInt() }

    val array = IntArray(9)

    a.forEach { value ->
        array[value-1] += 1
    }

    array.forEach { value ->
        println("$value")
    }
}