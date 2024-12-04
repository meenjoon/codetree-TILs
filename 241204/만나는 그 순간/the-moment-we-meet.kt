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

    for(i in 1..timeA) {
        if(arrayA[i] == arrayB[i]) {
            print(i)
            break            
        }
    }
}