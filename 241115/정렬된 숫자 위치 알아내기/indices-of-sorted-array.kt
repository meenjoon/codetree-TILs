import java.util.*
import kotlin.math.*

data class Number(
    val num: Int,
    val index: Int,
) {
    override fun toString(): String {
        return "num[$num] index[$index]"
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    val numberList = a.mapIndexed { index, value -> Number(num = value, index = index + 1) }

    val sortedList = numberList.sortedBy { it.num }

    val result = IntArray(n)
    sortedList.forEachIndexed { newIndex, number ->
        result[number.index - 1] = newIndex + 1
    }


    println(result.joinToString(" "))
}
