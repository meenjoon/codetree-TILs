import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    var minNum = Int.MAX_VALUE
    for(i in 0..a.lastIndex) {
        for(j in i + 1..a.lastIndex) {
            val aNum = a[i]
            val bNum = a[j]

            val absNum = abs(aNum - bNum)
            if(absNum <= minNum) {
                minNum = absNum
            }
        }
    }

    print("$minNum")
}