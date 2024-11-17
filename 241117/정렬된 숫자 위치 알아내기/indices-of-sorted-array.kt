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

    val list = sc.nextLine().trim().split(" ").mapIndexed { index, value -> 
        Number(
            num = value.toInt(),
            index = index,
        )
    }

    val sortedList = list.sortedBy{ it.num }

    val intArray = IntArray(n) { -1 }
    sortedList.forEachIndexed { sortedIndex, sortedValue ->
        intArray[sortedValue.index] = sortedIndex + 1
    }        

    print(intArray.joinToString(separator = " "))
} 

// 3 0
// 1 1
// 6 2
// 2 3
// 7 4
// 30 5
// 1 6
// ---

// 1 1 / 1 1
// 1 6 / 6 2
// 2 3 / 3 3
// 3 0 / 0 4
// 6 2 / 2 5
// 7 4 / 4 6
// 30 5 / 5 7