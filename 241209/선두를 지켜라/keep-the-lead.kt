import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").let{
        Pair(first = it[0].toInt(), second = it[1].toInt())
    }

    val arrayA = FloatArray(1000000)
    val arrayB = FloatArray(1000000)

    var distanceA = 0
    var distanceB = 0

    var timeA = 0
    var timeB = 0
    repeat(n+m) { it ->
        val parentIndex = it

        val (v, t) = sc.nextLine().trim().split(" ").let{
            Pair(first = it[0].toInt(), second = it[1].toInt())
        }

        val distance = v * t
        var tempT = t

        if(parentIndex < n) {
            repeat(t) { it ->
                val distance = (v).toFloat() / (tempT).toFloat()
                arrayA[it + timeA] = distanceA + distance 
                tempT--
            }

            distanceA += v
            timeA += t
        } else {
            repeat(t) { it ->
                val distance = (v).toFloat() / (tempT).toFloat()
                arrayB[it + timeB] = distanceB + distance
                tempT--
            }

            distanceB += v
            timeB += t
        }
    }

    var stopCnt = 0
    var isABig = false
    var cnt = 0
    for(i in arrayA.indices) {
        // println("$i : numA[${arrayA[i]}] numB[${arrayB[i]}]")
        if(stopCnt == 2) {
            break
        }

        val numA = arrayA[i]
        val numB = arrayB[i]
        if(numA == numB) {
            stopCnt++
            continue
        }
        
        val tempIsABig = isABig
        isABig = if(numA > numB) true else false
        if(i == 0) {
            cnt++
            continue
        }
        
        if(tempIsABig != isABig) {
            cnt++
        }
    }

    print(cnt)
}