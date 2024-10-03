import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()

    val list = mutableListOf<Int>()
    list.add(1)
    list.add(a)

    var cnt = 2
    while(true) {
        val result = list[cnt - 2] + list[cnt - 1]
        list.add(result)

        if(result > 100) {
            break
        }
        cnt++
    }

    list.forEach {
        print("$it ")
    }
}