import java.util.*
import kotlin.math.*

class DummyNum(var num: Int)

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }.toMutableList()
    swap(a)

    print("${a.joinToString(separator = " ")}")
}

fun swap(a: MutableList<Int>) {
    a.forEachIndexed { index, value ->
        if(value % 2 == 0) {
            a[index] = value / 2
        }
    }
}