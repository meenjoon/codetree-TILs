import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m, k) = sc.nextLine().trim().split(" ").map { it.toInt() }
    
    val personArray = IntArray(100)
    val wroingArray = IntArray(100) 

    for(i in 0..m-1) {
        personArray[i] = sc.nextInt()
    }

    var resultNum = -1

    for(i in 0..m-1) {
        val num = personArray[i]
        wroingArray[num] += 1

        if(wroingArray[num] == k) {
            resultNum = num
            break
        }
    }

    // val map = mutableMapOf<Int, Int>()

    // var resultNum = -1
    // for(i in 0..m-1) {
        // val a = sc.nextInt()
        
        // map[a] = map.getOrDefault(a, 0) + 1
        // if(map[a] == k) {
        //     resultNum = a
        //     break
        // }
    // }

    print(resultNum)
}