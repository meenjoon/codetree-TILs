import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }
    
    var result = 0
    for(i in 0..a.lastIndex) {
        val newList = a.slice(i..a.lastIndex)
        var maxNum = newList.maxOrNull()
        var minNum = newList.minOrNull()

        if(a[i] == maxNum) {
            continue
        } else if(maxNum != null && minNum != null) {
            val profit = maxNum - a[i]

            if(profit >= result) {
                result = profit
            }
        }
    }

    print("$result")
}