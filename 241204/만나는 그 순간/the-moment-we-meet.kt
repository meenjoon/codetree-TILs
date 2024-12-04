import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val arrayA = IntArray(2000000)
    val arrayB = IntArray(2000000)

    var timeA = 1
    var timeB = 1 
    repeat(n+m) { it ->
        val (direction, time) = sc.nextLine().trim().split(" ").let {
            Pair(first = it[0], second = it[1].toInt() )
        }

        val parentIndex = it
        
        repeat(time) {
            // n개 A
            if(parentIndex < n) {
                arrayA[timeA] = if(direction == "R") arrayA[timeA-1] + 1 else arrayA[timeA-1] - 1
                timeA++
            } 
            
            // m개 B
            else {
                arrayB[timeB] = if(direction == "R") arrayB[timeB-1] + 1 else arrayB[timeB-1] - 1
                timeB++
            }
        }
    }

    var minTime = -1
    // 마지막 범위를 -1 한 이유는 time++ 를 조건 마지막에 하기에 마지막 값은 범위에 포함되면 안됨 
    for(i in 1..timeA-1) {
        if(arrayA[i] == arrayB[i]) {
            minTime = i
            break            
        }
    }

    print(minTime)
}