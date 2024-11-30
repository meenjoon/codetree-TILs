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
            maxNum = continueCnt
            continue
        }

        if(array[i-1] < array[i]) {
            continueCnt++
        } else {
            continueCnt = 1
        }

        if(maxNum <= continueCnt) {
            maxNum = continueCnt
        }
    }

    print(maxNum)
}