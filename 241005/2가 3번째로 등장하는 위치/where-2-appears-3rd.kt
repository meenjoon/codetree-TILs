import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    sc.nextLine()

    val a = sc.nextLine().trim().split(" ").map { it.toInt() }

    var cnt = 0
    for(i in a.indices) {
        if(2 == a[i]) {
            cnt++
        }

        if(cnt == 3) {
            print("${i + 1}")
            break
        }
    }
}