import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map{ it.toInt() }

    val array = IntArray(100)
    val array2= IntArray(9)

    a.forEachIndexed { index, value ->
        val result = value / 10
        if(value >= 10) {
            // println("$value / $result")
            if(array[result] != value) {
                array[value] += 1
            }
        }    
    }

    array.forEachIndexed { index, value ->
        if(value > 0) {
            val result = index / 10
            array2[result-1] += 1
        }
    }
    
    array2.forEachIndexed { index, value ->
        println("${index + 1} - $value")
    }
}