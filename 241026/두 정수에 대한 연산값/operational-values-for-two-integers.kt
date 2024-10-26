import java.util.*
import kotlin.math.*

class DummyInteger(
    var a: Int,
    var b: Int
    )

fun main() {
    val sc = Scanner(System.`in`)

    var (a, b) = sc.nextLine().trim().split(" ").map{ it.toInt() }

    val dummyInteger = DummyInteger(a = a, b = b)
    
    result(dummyInteger = dummyInteger)
    
    print("${dummyInteger.a} ${dummyInteger.b}")
}

fun result(
    dummyInteger: DummyInteger
) {
    if(dummyInteger.a > dummyInteger.b) {
        dummyInteger.a += 25
        dummyInteger.b *= 2
    } else {
        dummyInteger.b += 25
        dummyInteger.a *= 2
    }
}