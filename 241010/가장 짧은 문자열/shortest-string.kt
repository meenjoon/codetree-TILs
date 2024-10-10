import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()
    sc.nextLine()

    val b = sc.next()
    sc.nextLine()

    val c = sc.next()

    val array = IntArray(3)
    array[0] = a.length
    array[1] = b.length
    array[2] = c.length

    val maxNum = array.maxOrNull()
    val minNum = array.minOrNull()

    if(maxNum != null && minNum != null) {
        print("${maxNum - minNum}")
    }
}