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

    val filterA = listA.filter { it % 2 == 0 }
    val cntA = filterA.count()
    val sumA = filterA.sum()

    print("$cntA $sumA")
}