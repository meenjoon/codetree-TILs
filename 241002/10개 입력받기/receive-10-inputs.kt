import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val listA = mutableListOf<Int>()

    for(i in 1..10) {
        val a = sc.nextInt()
        if(a == 0) {
            break
        }
        listA.add(a)
    }

    val sumNum = listA.sum()
    
    val avgNum = sumNum.toDouble() / listA.count().toDouble()
    val formattedAvgNum = round(avgNum * 10) / 10

    print("$sumNum $formattedAvgNum")
}