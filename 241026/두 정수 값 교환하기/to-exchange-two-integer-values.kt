import java.util.*
import kotlin.math.*

class DummyNum(var num: Int)

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }
    val dummyNum1 = DummyNum(num = a)
    val dummyNum2 = DummyNum(num = b) 

    swap(a = dummyNum1, b = dummyNum2)

    print("${dummyNum1.num} ${dummyNum2.num}")
}

// fun swap(
//     a: Int,
//     b: Int,
// ): Pair<Int, Int> {
//     val temp = a
    
//     val newA = b
//     val newB = temp

//     return Pair(newA, newB)
// }

fun swap(
    a: DummyNum,
    b: DummyNum,
) {
    val temp = a.num
    
    a.num = b.num
    b.num = temp
}