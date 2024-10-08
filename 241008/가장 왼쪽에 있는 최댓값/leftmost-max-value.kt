import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    val list = mutableListOf<Int>()

    var maxNum = Int.MIN_VALUE

    var range = a.lastIndex

    while(range > 0) {
        for(i in 0..range) {
            val num = a[i]

            if(num >= maxNum) {
                maxNum = num
            }
        }

        for(i in 0..range) {
            val num = a[i]
            
            if(num == maxNum) {
                range = i-1
                list.add(i + 1)
                if(range == 0) {
                    list.add(1)
                }
                break
            }
        }
        maxNum = Int.MIN_VALUE
    }

    val result = list.joinToString(separator = " ")
    print("$result")
}