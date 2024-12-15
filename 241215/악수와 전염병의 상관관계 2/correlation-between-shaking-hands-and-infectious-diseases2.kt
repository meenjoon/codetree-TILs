import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, k, p ,t) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val diseaseAvailableMap = mutableMapOf<Int, Int>()
    repeat(n) {
        diseaseAvailableMap[it+1] = k
    }

    val personArray = IntArray(n)
    personArray[p-1] = 1

    val list = mutableListOf<IntArray>()

    repeat(t) { index ->
        val inputArray = sc.nextLine().trim().split(" ").map { it.toInt() }.toIntArray()
        list.add(inputArray) 
    }

    list.sortBy{ it[0] }

    list.forEachIndexed { i, value ->
        var transFlag = false

        value.forEachIndexed { j, value2 ->
            if(j == 1) {
                val isDisease = if(personArray[value2-1] == 1) true else false
                val diseaseAbleCnt = diseaseAvailableMap.getOrDefault(value2, 0)
                if(isDisease && diseaseAbleCnt > 0) {
                    transFlag = true
                    diseaseAvailableMap[value2-1] = diseaseAbleCnt - 1
                }
            } else if(j == 2) {
                if(transFlag == true) {
                    personArray[value2-1] = 1
                }
            }
        }
    }

    print(personArray.joinToString(separator = ""))
}