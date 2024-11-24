import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextLine().toInt()

    val map = mutableMapOf<Int, String>()
    
    var lastRangeNum = 0
    repeat(a) { it ->
        val (a, b) = sc.nextLine().trim().split(" ").let{
            Pair(first = it[0].toInt(), second = it[1])
        }

        var firstRangeNum = lastRangeNum
        if(b == "R") {
            lastRangeNum += a - 1
        } else {
            lastRangeNum -= a - 1
        }

        if(firstRangeNum < lastRangeNum) {
        for(i in firstRangeNum..lastRangeNum) {
            if(b == "R") {
                map[i] = "black"
            } else {
                map[i] = "white"
            }
        } 
        } else {
            for(i in lastRangeNum..firstRangeNum) {
                if(b == "R") {
                    map[i] = "black"
                } else {
                    map[i] = "white"
                }
            } 
        }
        // val sortedMap = map.toList().sortedBy{ it.first }.toMap()
        // println(sortedMap)
    }
    val blackBlockNum = map.values.count{ it == "black" }
    val whiteBlockNum = map.values.count{ it == "white" }

    print("$whiteBlockNum $blackBlockNum")
}


// R  흑흑흑흑
// L 백백백백백
// R 흑흑흑흑흑흑흑
// L 흑흑흑백백백백