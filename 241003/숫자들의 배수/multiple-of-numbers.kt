import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val list = mutableListOf<Int>()
    list.add(0)

    var fifthCnt = 0
    var cnt = 0
    var num = 0
    
    while(true) {
        if(fifthCnt == 2) {
            break
        }
        val result = n + list[cnt]
        list.add(result)

        if(result % 5 == 0) {
            fifthCnt++
        }

        cnt++
    }

    list.forEach {
        if(it != 0) {
            print("$it ")
        }
    }
}