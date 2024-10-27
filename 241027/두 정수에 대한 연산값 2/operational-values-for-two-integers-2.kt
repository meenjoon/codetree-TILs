import java.util.*
import kotlin.math.*

class DummyInteger(
    var a: Int,
    var b: Int,
)

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val dummyInteger = DummyInteger(a = a, b = b)
    swapCalculation(dummyInteger = dummyInteger)

    print("${dummyInteger.a} ${dummyInteger.b}")
}

fun swapCalculation(
    dummyInteger: DummyInteger,
) {
    if(dummyInteger.a > dummyInteger.b) {
        dummyInteger.a *= 2
        dummyInteger.b += 10
    } else {
        dummyInteger.a += 10
        dummyInteger.b *= 2
    }
}