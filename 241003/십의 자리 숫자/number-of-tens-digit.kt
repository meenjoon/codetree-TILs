import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map{ it.toInt() }

    val array = IntArray(9)

    a.forEachIndexed { index, value ->
        val result = value / 10
        if(value >= 10) {
             array[result - 1] += 1
        }    
    }

    array.forEachIndexed { index, value ->
        println("${index + 1} - $value")
    }
}