import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, t) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val array = IntArray(n)

    repeat(n) { it -> 
        array[it] = sc.nextInt()
    }
    
    var maxNum = Int.MIN_VALUE
    var continueCnt = 1
    for(i in 0..array.size-1) {
        if(i == 0) {
            if(array[i] <= t) maxNum = 0 else maxNum = 1
            continue
        }

        if(array[i] > t && array[i-1] > t) {
            continueCnt++
        } else if(array[i] <= t) {
            continueCnt = 0
        } else if(array[i] > t) {
            continueCnt = 1
        } 

        if(maxNum <= continueCnt) {
            maxNum = continueCnt
        }
    }

    print(maxNum)
}