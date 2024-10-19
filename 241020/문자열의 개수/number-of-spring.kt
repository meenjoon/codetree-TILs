import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    var totalCnt = 0
    val list = mutableListOf<String>()
    while(true) {
        val a = sc.next()
        
        if(a == "0") {
            println("$totalCnt")
            break
        }

        if((totalCnt + 1) % 2 == 1) {
            list.add(a)
        }

        totalCnt++
    }

    list.forEach {
        println("$it")
    }
}