import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }
    val b = sc.nextLine().trim().split(" ").map { it.toInt() }

    if(isContainOfList(numList1 = a, numList2 = b)) print("Yes") else print("No")
}

fun isContainOfList(
    numList1: List<Int>,
    numList2: List<Int>,
): Boolean {
    // val filterList = numList1.filter { it in numList2 }
    // val filterCnt = filterList.count()
    // if (filterCnt == numList2.size) return true else return false

    for(i in 0..numList1.size - 1) {
        val endRange = i + numList2.size - 1
        
        if(endRange > numList1.size - 1) {
            break
        }

        val sliceList = numList1.slice(i..endRange)
        if(sliceList == numList2) {
            return true
            break
        }
    }

    return false
}