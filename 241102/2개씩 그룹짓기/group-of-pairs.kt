import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().toInt()

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }.sorted()

    var minimumMaxValue = Int.MIN_VALUE
    val harfRange = (a.size-1) / 2
    for(i in 0..harfRange) {
        val firstNum = a[i]
        val lastNum = a[(a.size-1)-i]

        val sum = firstNum + lastNum
        if(minimumMaxValue <= sum) {
            minimumMaxValue = sum
        }
    }

    print(minimumMaxValue)
}