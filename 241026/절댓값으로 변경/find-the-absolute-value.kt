import java.util.*
import kotlin.math.*

class DummyInteger(
    var a: Int,
    var b: Int
    )

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()
    val a = sc.nextLine().trim().split(" ").map{ it.toInt() }.toMutableList()

    toAbsMutableList(a = a)

    print("${a.joinToString(separator = " ")}")
}

fun toAbsMutableList(
    a: MutableList<Int>
) {
    a.forEachIndexed{ index, value ->
        a[index] = abs(value)
    }
}