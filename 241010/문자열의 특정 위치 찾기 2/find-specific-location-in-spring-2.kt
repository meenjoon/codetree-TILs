import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val array = arrayOf("apple", "banana", "grape", "blueberry", "orange")

    val a = sc.next()[0]

    var cnt = 0
    array.forEach { fruit ->
        for(i in fruit.indices) {
            if((i==2 && fruit[2] == a) || (i==3 && fruit[3] == a)) {
                println("$fruit")
                cnt++
                break
            }
        }
    }

    print("$cnt")
}