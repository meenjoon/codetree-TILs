import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().trim().split(" ").map{ it.toInt() }

    val array = IntArray(9)

    for(i in a.indices) {
        if(a[i] == 0) {
            break
        }

        if(a[i] >= 10) {
            val result = a[i] / 10
            array[result - 1] += 1
        }
    }

    array.forEachIndexed { index, value ->
        println("${index + 1} - $value")
    }
}