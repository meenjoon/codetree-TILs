import java.util.*
// import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").let {
        Pair(first = it[0].toInt(), second = it[1].toInt())
    }

    val arrayA = IntArray(1000000) { Int.MIN_VALUE }
    val arrayB = IntArray(1000000) { Int.MIN_VALUE }

    var distanceA = 0
    var distanceB = 0
    var timeA = 0
    var timeB = 0
    repeat(n+m) { it ->
        val parentIndex = it

        val (v, t) = sc.nextLine().trim().split(" ").let {
            Pair(first = it[0].toInt(), second = it[1].toInt())
        }

        // arrayA 일 때
        if(parentIndex < n) {
            repeat(t) { it ->
                arrayA[it+timeA] = distanceA + v
                distanceA = arrayA[it+timeA]               
            }

            timeA += t
        } 
        // arryB 일 때
        else {
            repeat(t) { it ->
                arrayB[it+timeB] = distanceB + v
                distanceB = arrayB[it+timeB]
            }

            timeB += t
        }
    }

    var isABig = false
    var isFirstChange = false
    var cnt = 0
    for(i in arrayA.indices) {
        val numA = arrayA[i]
        val numB = arrayB[i]

        // println("index[$i] numA[$numA] numB[$numB]")
        if(numA == Int.MIN_VALUE && numB == Int.MIN_VALUE) {
            break
        }

        if(numA == numB) {
            continue
        } else if(!isFirstChange) {
            isFirstChange = true
            isABig = if(numA > numB) true else false
            continue
        }

        val tempIsABig = isABig
        isABig = if(numA > numB) true else false
        if(tempIsABig != isABig) {
            cnt++
        }
    }

    print(cnt)
}