import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val array = IntArray(n)

    repeat(n) { it ->
        array[it] = sc.nextInt()
    }

    var maxNum = Int.MIN_VALUE
    var continueCnt = 1

    for(i in 0..array.size-1) {
        if(i == 0) {
            continue
        }
        val beforeSign = if(array[i-1] > 0) true else false
        val currentSign = if(array[i] > 0) true else false
        
        if(beforeSign == currentSign) {
            continueCnt++
        } else {
            continueCnt = 1
        }

        if(maxNum <= continueCnt) {
            maxNum = continueCnt
        }
    }

    if(n == 1) {
        print(1)
    } else {
        print(maxNum)
    }
}