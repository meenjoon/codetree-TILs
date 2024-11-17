import kotlin.math.*
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    
    val (a,b,c,d) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val calander = mutableMapOf<Int, Int>()

    calander[1] = 31
    calander[2] = 28
    calander[3] = 31
    calander[4] = 30
    calander[5] = 31
    calander[6] = 30
    calander[7] = 31
    calander[8] = 31
    calander[9] = 30
    calander[10] = 31
    calander[11] = 30 
    calander[12] = 31

    var fisrtTotalDay = 0
    var firstFlag = true
    var secondTotalDay = 0
    var secondFlag = false
    for((index, entry) in calander.entries.withIndex()) {
        if(entry.key == a) {
            fisrtTotalDay += b
        } else if(entry.key < a) {
            fisrtTotalDay += entry.value
        }

        if(entry.key == c) {
            secondTotalDay += d
        } else if(entry.key < c) {
            secondTotalDay += entry.value
        }
    }

    print("${secondTotalDay - fisrtTotalDay + 1}")
}