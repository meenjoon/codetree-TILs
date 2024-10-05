import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val (n, q) = sc.nextLine().trim().split(" ").map{ it.toInt() }

    val a = sc.nextLine().trim().split(" ").map{ it.toInt() }

    repeat(q) {
        val b = sc.nextLine().trim().split(" ").map{ it.toInt() }

        val type = b[0]
        if(type == 1) {
            val num = b[b.lastIndex]
            println("${a[num-1]}")
        } else if(type == 2) {
            val num = b[b.lastIndex]
            val findAOfBIndex = a.indexOf(num)
            println("${if(findAOfBIndex == -1) "0" else findAOfBIndex + 1}")
        } else {
            var startNum = 0
            var endNum = 0
            b.forEachIndexed { index, value ->
                if(index == 1) {
                    startNum = value
                } else if(index == 2) {
                    endNum = value
                }
            }
            for(i in startNum-1..endNum-1) {
                print("${a[i]} ")
            }
            println("")
        }
    }
}