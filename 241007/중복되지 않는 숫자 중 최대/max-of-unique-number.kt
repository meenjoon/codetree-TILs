import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    // val map = mutableMapOf<Int, Int>()

    // a.forEachIndexed { index, num ->
    //     map[num] = map.getOrDefault(num, 0) + 1
    // }

    // var maxNum = -1
    // a.forEachIndexed { index, num ->
    //     if(map.getOrDefault(num, 0) < 2 && num >= maxNum ) {
    //         maxNum = num
    //     }
    // }

    // print("$maxNum")

    var maxNum = -1
    for(i in 0..a.lastIndex) {
        val currNum = a[i]
        
        if(currNum >= maxNum) {
            var duplicationCnt = 0
            for(i in 0..a.lastIndex) {
                if(a[i] == currNum) {
                    duplicationCnt++
                }
                if(duplicationCnt > 1) {
                    break
                }
            }
            if(duplicationCnt == 1) {
                maxNum = currNum
            }
        }
    }

    print("$maxNum")
}